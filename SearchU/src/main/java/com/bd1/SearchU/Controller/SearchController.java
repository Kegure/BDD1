package com.bd1.SearchU.Controller;



import com.bd1.SearchU.Entity.Search;
import com.bd1.SearchU.Service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/searches")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping
    public ResponseEntity<Search> createSearch(@RequestBody Search search) {
        return ResponseEntity.ok(searchService.saveSearch(search));
    }

    @GetMapping
    public ResponseEntity<List<Search>> getAllSearches() {
        return ResponseEntity.ok(searchService.getAllSearches());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Search> getSearchById(@PathVariable Long id) {
        return ResponseEntity.ok(searchService.getSearchById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSearch(@PathVariable Long id) {
        searchService.deleteSearch(id);
        return ResponseEntity.noContent().build();
    }
}

