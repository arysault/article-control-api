package com.teamfour.articlecontrol.Services;

import com.teamfour.articlecontrol.Repositorys.ArticleRepository;
import com.teamfour.articlecontrol.models.Article;

public class ArticleService {

    private ArticleRepository articleRepository;
;
    public Article submitArticle(Article article) {
        return articleRepository.save(article);
    }

//    public Participant isSubscribed(Participant participant) {
//
//    }

}
