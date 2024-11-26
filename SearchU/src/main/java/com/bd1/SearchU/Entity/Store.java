package com.bd1.SearchU.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;

    private String storeName;
    private String location;
    private String description;
    private Integer totalReviews;
    private String storeCategory;
    private String storeImageUrl;
}
