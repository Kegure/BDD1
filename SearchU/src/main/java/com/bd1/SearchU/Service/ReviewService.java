package com.bd1.SearchU.Service;

import com.bd1.SearchU.Entity.Review;
import com.bd1.SearchU.Repository.ReviewRepository;
import com.bd1.SearchU.Repository.StoreRepository;
import com.bd1.SearchU.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private StoreRepository storeRepository;

    public Review saveReview(Review review) {
        if (review.getUser() == null || review.getUser().getUserId() == null) {
            throw new IllegalArgumentException("User must be provided with a valid ID");
        }

        if (review.getStore() == null || review.getStore().getStoreId() == null) {
            throw new IllegalArgumentException("Store must be provided with a valid ID");
        }


        userRepository.findById(review.getUser().getUserId())
                .orElseThrow(() -> new IllegalArgumentException("User does not exist"));
        storeRepository.findById(review.getStore().getStoreId())
                .orElseThrow(() -> new IllegalArgumentException("Store does not exist"));


        review.setReviewDate(LocalDateTime.now());


        return reviewRepository.save(review);
    }



    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    public Review updateReview(Long id, Review updatedReview) {
        Optional<Review> existingReview = reviewRepository.findById(id);
        if (existingReview.isPresent()) {
            Review review = existingReview.get();
            review.setRating(updatedReview.getRating());
            review.setComment(updatedReview.getComment());
            return reviewRepository.save(review);
        }
        return null;
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
