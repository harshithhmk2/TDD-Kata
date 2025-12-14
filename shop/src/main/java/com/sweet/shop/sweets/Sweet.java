package com.sweet.shop.sweets;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sweet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String name;
    private double price;
    private int quantity;
}
