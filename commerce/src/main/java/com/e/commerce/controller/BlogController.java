package com.e.commerce.controller;

import com.e.commerce.model.Blog;
import com.e.commerce.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Blog/")
@RequiredArgsConstructor
public class BlogController {
    private  final BlogService blogService;
    @PostMapping("register")
    public Blog register(@RequestBody Blog blog){
        return blogService.register(blog);
    }

    @GetMapping("getById/{id}")
    public Blog getById(@PathVariable("id") Long id){
        return blogService.getById(id);
    }
    @GetMapping("getall")
    public List<Blog> getall(){
        return blogService.getall();
    }


    @PutMapping("update")
    public Blog update(@RequestBody Blog blog){
        return blogService.update(blog);
    }


    @DeleteMapping("deleteById/{id}")
    public String  delete(@PathVariable("id") Long id){
         blogService.delete(id);
         return "deleted";
    }
}
