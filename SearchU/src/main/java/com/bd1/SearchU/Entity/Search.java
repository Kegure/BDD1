package com.bd1.SearchU.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Entity
@Getter
@Setter
public class Search {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long searchId;

    private String searchTerm;
    private Integer resultCount;

    @Column(nullable = false)
    private LocalDateTime searchTimestamp;

    @ManyToOne
    @JoinColumn(name = "fk_user_id", nullable = false)
    private User user;
}
