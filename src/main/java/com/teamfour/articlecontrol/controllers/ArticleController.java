package com.teamfour.articlecontrol.controllers;

import com.teamfour.articlecontrol.Services.ArticleService;
import com.teamfour.articlecontrol.models.Article;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/article")
@RestController
public class ArticleController {

    private ArticleService articleService;

    @PostMapping("/sent-article")
    public ResponseEntity<Article> sentArticle(@RequestBody Article article) {
        Article sentArticle = articleService.submitArticle(article);
        return new ResponseEntity<>(sentArticle, HttpStatus.CREATED);
    }

}
