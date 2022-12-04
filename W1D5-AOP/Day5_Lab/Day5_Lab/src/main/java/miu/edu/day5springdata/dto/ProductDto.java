package miu.edu.day5springdata.dto;

import java.util.Set;

public class ProductDto {
    private int id;
    private String name;
    private double price;
    private int rating;
    private CategoryDto category;
    private Set<ReviewDto> review;

}
