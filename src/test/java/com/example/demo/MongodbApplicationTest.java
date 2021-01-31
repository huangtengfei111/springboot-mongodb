package com.example.demo;

import com.example.demo.pojo.Comment;
import com.example.demo.service.CommentService;
import com.spring4all.mongodb.EnableMongoPlus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan("com.example.demo.*")
@EnableMongoPlus
public class MongodbApplicationTest {

    @Autowired
    CommentService commentService;
    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    public void findList() {
        List<Comment> comments = commentService.findList();
        System.out.println(comments);
    }

    @Test
    public void findListByParentid() {
        //parentid 是1，显示第一页，每页3条数据
        Page<Comment> listByParentid = commentService.findListByParentid("1", 0, 3);
        System.out.println(listByParentid.getContent());
    }

    @Test
    public void insert() {

        //查询条件
        Query query = Query.query(Criteria.where("_id").is("6014ffef0f3c4e9603d5868a"));
        //更新
        Update update = new Update();
        update.inc("parentid");

        mongoTemplate.updateFirst(query, update, Comment.class);
    }
}
