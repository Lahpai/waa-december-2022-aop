package miu.edu.day5springdata.service;

import miu.edu.day5springdata.entity.Review;

import java.util.List;

public interface ReviewService {

    void save (Review review);
    List<Review> getAllReview();
    Review findById(int id);
    void deleteById(int id);
}
