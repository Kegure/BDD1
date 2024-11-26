package com.bd1.SearchU.Service;



import com.bd1.SearchU.Entity.Store;
import com.bd1.SearchU.Repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public Store saveStore(Store store) {
        return storeRepository.save(store);
    }

    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }

    public Store getStoreById(Long id) {
        return storeRepository.findById(id).orElse(null);
    }

    public void deleteStore(Long id) {
        storeRepository.deleteById(id);
    }

    public Store updateStore(Long id, Store updatedStore) {
        Store existingStore = storeRepository.findById(id).orElse(null);
        if (existingStore != null) {
            existingStore.setStoreName(updatedStore.getStoreName());
            existingStore.setLocation(updatedStore.getLocation());
            existingStore.setDescription(updatedStore.getDescription());
            existingStore.setTotalReviews(updatedStore.getTotalReviews());
            existingStore.setStoreCategory(updatedStore.getStoreCategory());
            existingStore.setStoreImageUrl(updatedStore.getStoreImageUrl());

            return storeRepository.save(existingStore);
        }
        return null;
    }
}

