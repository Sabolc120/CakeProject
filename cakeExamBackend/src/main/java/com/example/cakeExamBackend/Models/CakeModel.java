package com.example.cakeExamBackend.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class CakeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long identifier;

    private String cakeName;

    private String mainIngredient;

    private int price;

    private String imageUrl;

    @OneToMany
    @JoinColumn(name="cake_basket")
    private List<CakeBasketModel> cakeBasketModels;
}
