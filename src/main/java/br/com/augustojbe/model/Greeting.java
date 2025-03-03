package br.com.augustojbe.model;

import org.springframework.web.bind.annotation.RestController;


public record Greeting(long id, String content) {}
