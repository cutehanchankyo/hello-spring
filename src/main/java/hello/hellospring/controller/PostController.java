package hello.hellospring.controller;

import hello.hellospring.domain.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("post")
public class PostController {
    @GetMapping("all")
    public Post findAll() {
        Post post = new Post(1L,"정찬교의 진짬뽕 먹방","맛있었다");

        return post;
    }

}