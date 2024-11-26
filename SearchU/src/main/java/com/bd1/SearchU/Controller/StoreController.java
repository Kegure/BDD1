package com.bd1.SearchU.Controller;

import com.bd1.SearchU.Entity.Store;
import com.bd1.SearchU.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stores")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @PostMapping
    public Store createStore(@RequestBody Store store) {
        return storeService.saveStore(store);
    }

    @GetMapping
    public List<Store> getAllStores() {
        return storeService.getAllStores();
    }

    @GetMapping("/{id}")
    public Store getStoreById(@PathVariable Long id) {
        return storeService.getStoreById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStore(@PathVariable Long id) {
        storeService.deleteStore(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Store> updateStore(@PathVariable Long id, @RequestBody Store updatedStore) {
        Store store = storeService.updateStore(id, updatedStore);
        if (store == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(store);
    }
}

