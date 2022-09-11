package com.example.cakeExamBackend.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class CakeBasketModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String cakeName;

    private String cakeImg;

    private String cakeMainIngredient;

    private int cakePrice;

    private int cakeQuantity;

    @ManyToOne
    @JoinColumn(name = "cake_basket")
    private CakeModel cakeModel;

    @ManyToOne
    @JoinColumn(name="user_cakes_in_basket")
    private UserModel userModel;
}
