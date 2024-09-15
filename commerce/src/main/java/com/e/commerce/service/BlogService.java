package com.e.commerce.service;

import com.e.commerce.model.Blog;

import java.util.List;

public interface BlogService {
    Blog register(Blog blog);

    Blog getById(Long id);

    List<Blog> getall();

    Blog update(Blog blog);

    void delete(Long id);
}
