package com.bd1.SearchU.Repository;


import com.bd1.SearchU.Entity.Search;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends JpaRepository<Search, Long> {
}

