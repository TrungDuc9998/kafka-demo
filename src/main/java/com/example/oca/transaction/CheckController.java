package com.example.oca.transaction;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/check")
public class CheckController {
    private final AuthorService authorService;

    @PostMapping("/create")
    public Author create(HttpServletRequest request) {
        return this.authorService.create();
    }
}
