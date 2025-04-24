package com.example.oca.controller;

import com.example.oca.redis.RedisService;
import com.example.oca.request.RedisRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisService redisService;

    @PostMapping("/set")
    public String setCache(@RequestBody RedisRequest request) {
        redisService.saveToCache(request.getKey(), request.getValue(), 10);
        return "Dữ liệu đã lưu vào Redis!";
    }

    @GetMapping("/get")
    public Object getCache(@RequestBody RedisRequest request) {
        return redisService.getFromCache(request.getKey());
    }
}
