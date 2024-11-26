package com.bd1.SearchU.Service;


import com.bd1.SearchU.Entity.Search;
import com.bd1.SearchU.Repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SearchService {

    @Autowired
    private SearchRepository searchRepository;

    public Search saveSearch(Search search) {
        return searchRepository.save(search);
    }

    public List<Search> getAllSearches() {
        return searchRepository.findAll();
    }

    public Search getSearchById(Long id) {
        return searchRepository.findById(id).orElse(null);
    }

    public void deleteSearch(Long id) {
        searchRepository.deleteById(id);
    }
}

