package com.example.oca.controller;

import com.example.oca.transaction.Author;
import com.example.oca.transaction.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/author")
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @PostMapping("/check")
    public ResponseEntity<Author> check(HttpServletRequest request) {
        return ResponseEntity.ok(this.authorService.create());
    }
}
