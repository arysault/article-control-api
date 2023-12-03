package com.teamfour.articlecontrol.controllers;

import com.teamfour.articlecontrol.Services.CongressService;
import com.teamfour.articlecontrol.models.Article;
import com.teamfour.articlecontrol.models.Review;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

public class CongressController {


    private CongressService congressService;
//
//    @PostMapping("/submission")
//    public ResponseEntity<Participant> submissing(@RequestBody Participant user) {
//        Participant submittedUser = congressService.fazerInscricao(user);
//        return new ResponseEntity<>(submittedUser, HttpStatus.CREATED);
//    }

    @PostMapping("/enviar-artigo")
    public ResponseEntity<Article> enviarArtigo(@RequestBody Article article) {
        Article sentArticle = congressService.enviarArtigo(article);
        return new ResponseEntity<>(sentArticle, HttpStatus.CREATED);
    }

    @GetMapping("/enviar-artigos-revisao")
    public ResponseEntity<List<Article>> enviarArtigosParaRevisao() {
        List<Article> sentArticle = congressService.enviarArtigosParaRevisao();
        return new ResponseEntity<>(sentArticle, HttpStatus.OK);
    }

    @PostMapping("/rate-article")
    public ResponseEntity<Review> avaliarArtigo(
            @RequestParam UUID reviewerId,
            @RequestParam UUID articleId,
            @RequestParam int note,
            @RequestParam String comment) {
        Review review = congressService.articlereview(reviewerId, articleId, note, comment);
        return new ResponseEntity<>(review, HttpStatus.OK);
    }

    @GetMapping("/select-approved-articles")
    public ResponseEntity<List<Article>> selecionarArtigosAprovados() {
        List<Article> approvedArticles = congressService.selectApprovedArticles();
        return new ResponseEntity<>(approvedArticles, HttpStatus.OK);
    }

}