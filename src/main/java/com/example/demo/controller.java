package com.example.demo;

import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2021/1/30 22:43
 */

@RestController
public class controller {

    @Autowired
    CommentService commentService;

    @GetMapping("/test")

    public String test() {
        System.out.println(commentService.findList());
        return "success";
    }
}
