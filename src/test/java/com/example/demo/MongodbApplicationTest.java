package com.example.demo;

import com.example.demo.pojo.Comment;
import com.example.demo.service.CommentService;
import com.spring4all.mongodb.EnableMongoPlus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("com.example.demo.*")
@EnableMongoPlus
public class MongodbApplicationTest {

    @Autowired
    CommentService commentService;

    @Test
    public void findList() {
        List<Comment> comments = commentService.findList();
        System.out.println(comments);
    }

}
