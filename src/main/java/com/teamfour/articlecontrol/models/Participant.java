package com.teamfour.articlecontrol.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
@Embeddable
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    private String name;
    private String email;
    private String password;
    private String company;
    private CreditCard creditCardNumber;
    @ElementCollection
    private List<Review> reviews;
    private Profile profile;
    private Profile profileId;
    private Address address;
    private Address addressId;

    public boolean isNew() {
        return getId() == null;
    }

}
