package com.example.demo.service;

import com.example.demo.pojo.Comment;

import java.util.List;


public interface CommentService {
    public void save(Comment comment);
    public List<Comment> findList();
}
