package com.example.demo.service;

import com.example.demo.pojo.Comment;
import org.springframework.data.domain.Page;

import java.util.List;


public interface CommentService {

    void save(Comment comment);

    List<Comment> findList();

    Page<Comment> findListByParentid(String parentid, int page, int size);
}
