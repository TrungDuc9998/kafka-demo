package com.example.oca.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisService {
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    // Lưu dữ liệu vào Redis với thời gian hết hạn (TTL)
    public void saveToCache(String key, Object value, long timeout) {
        redisTemplate.opsForValue().set(key, value, timeout, TimeUnit.MINUTES);
    }

    // Lấy dữ liệu từ Redis
    public Object getFromCache(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    // Xóa dữ liệu từ Redis
    public void deleteFromCache(String key) {
        redisTemplate.delete(key);
    }
}
