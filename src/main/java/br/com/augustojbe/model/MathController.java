package br.com.augustojbe.model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/math")
public class MathController {

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedOperationException("Plase set a numeric value");
        return convertDouble(numberOne)  + convertDouble(numberTwo);
    }

    private Double convertDouble(String strNumber) throws IllegalAccessException {
        if (strNumber == null || strNumber.isEmpty()) throw  new UnsupportedOperationException("Plase set a numeric value");
        String number  = strNumber.replace(",", ".");
        return Double.parseDouble(number);

    }

    private boolean isNumeric(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) return false;
        String number  = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }
    // http://localhost:8080/math/subtraction/3/5

    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedOperationException("Plase set a numeric value");
        return convertDouble(numberOne)  - convertDouble(numberTwo);
    }

    // http://localhost:8080/math/multiplication/3/5
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedOperationException("Plase set a numeric value");
        return convertDouble(numberOne) * convertDouble(numberTwo);
    }


    // http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedOperationException("Plase set a numeric value");
        return convertDouble(numberOne)  / convertDouble(numberTwo);
    }

    // http://localhost:8080/math/mean/3/5
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw  new UnsupportedOperationException("Plase set a numeric value");
        return (convertDouble(numberOne)  / convertDouble(numberTwo)) / 2;
    }

    // http://localhost:8080/math/squareroot/3/5
    @RequestMapping("/squareroot/{number}")
    public Double squareRoot(
            @PathVariable("number") String number
    ) throws Exception {
        if (!isNumeric(number)) throw  new UnsupportedOperationException("Plase set a numeric value");
//        var converted = Math.sqrt(convertDouble(number));
//        return converted;
        return Math.sqrt(convertDouble(number));
    }


}
