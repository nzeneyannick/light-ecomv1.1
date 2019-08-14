package org.sid.lightecomv1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String description;

    //prix actuel du produit
    private double currentPrice;

    //le produit est t il en promo ou pas
    private boolean promotion;

    //produit selectionné par le webmaster
    private boolean selected;

    // le produit est dispo en stock ou pas
    private boolean available;
    private String photoName;
    @ManyToOne
    private Category category;




}
