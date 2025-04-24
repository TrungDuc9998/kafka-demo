package com.example.oca.request;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class RedisRequest implements Serializable {
    private static final long serialVersionUID = 897496275916229471L;

    private String key;
    private String value;
}
