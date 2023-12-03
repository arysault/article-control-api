package com.teamfour.articlecontrol.Services;

import com.teamfour.articlecontrol.Repositorys.ArticleRepository;
import com.teamfour.articlecontrol.Repositorys.ParticipantRepository;
import com.teamfour.articlecontrol.models.Article;
import com.teamfour.articlecontrol.models.Review;
import com.teamfour.articlecontrol.models.Participant;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CongressService {

    private ParticipantRepository participantRepository;


    private ArticleRepository articleRepository;


    private ReviewerRepository reviewerRepository;


    private ReviewRepository reviewRepository;

    public Participant fazerInscricao(Participant participant) {
        // Lógica para validar e salvar a inscrição
        // Gere o número de inscrição e envie a confirmação por e-mail
        // Retorne o participante com o número de inscrição gerado
        return participant;
    }

    public Article enviarArtigo(Article artigo) {
        // Lógica para validar e salvar a submissão de artigo
        // Envie a confirmação por e-mail
        // Retorne o artigo com o número de identificação gerado
        return artigo;
    }

    public List<Article> enviarArtigosParaRevisao() {
        // Lógica para selecionar artigos e enviar para revisores
        // Retorne a lista de artigos enviados para revisão
        return null;
    }

    public Review articlereview(UUID reviewerId, UUID articleId, int notE, String comment) {
        // Lógica para validar e salvar a avaliação
        // Envie o comentário para os autores por e-mail
        // Retorne a avaliação
        return null;
    }

    public List<Article> selectApprovedArticles() {
        // Lógica para selecionar os artigos aprovados
        // Retorne a lista de artigos aprovados
        return null;
    }
}

