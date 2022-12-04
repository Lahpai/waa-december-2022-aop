package miu.edu.day5springdata.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int rating;
//    @JoinColumn(name = "category id")
//    @ManyToOne
//    private Category category;
}
