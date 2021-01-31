package com.example.demo.impl;

import com.example.demo.dao.CommentRepository;
import com.example.demo.pojo.Comment;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2021/1/30 22:40
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Override
    public void save(Comment comment){
        commentRepository.save(comment);
    }

    @Override
    public List<Comment> findList(){
        List<Comment> comments = commentRepository.findAll();
        return comments;
    }

    //分页
    @Override
    public Page<Comment> findListByParentid(String parentid, int page, int size){
        return commentRepository.findByParentid(parentid, PageRequest.of(page, size));
    }



}
