package com.jzheng.mybatis.example.entity;

import lombok.Data;

@Data
public class Blog {
    private Integer id;

    private String title;

    private String content;

    private String author;

    private String tags;
}