package com.example.demo.dao;

import com.example.demo.pojo.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2021/1/30 22:39
 */
public interface CommentRepository extends MongoRepository<Comment, String> {
}
