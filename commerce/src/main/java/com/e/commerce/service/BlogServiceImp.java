package com.e.commerce.service;

import com.e.commerce.model.Blog;
import com.e.commerce.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImp implements BlogService{
    private  final BlogRepository blogRepository;

    public BlogServiceImp(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public Blog register(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public Blog getById(Long id) {
        return blogRepository.findById(id).get();
    }



    @Override
    public List<Blog> getall(){
        return blogRepository.findAll();

    }

    @Override
    public Blog update(Blog blog){
        return blogRepository.save(blog);
    }



    @Override
    public void delete(Long id){
        blogRepository.deleteById(id);
    }








}
