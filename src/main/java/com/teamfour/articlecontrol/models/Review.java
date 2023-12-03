package com.teamfour.articlecontrol.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table
@Embeddable
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    private Integer note;
    private String comment;
    private Participant reviewer;
    private Participant reviewerId;
    private Article article;
    private Article articleId;
}
