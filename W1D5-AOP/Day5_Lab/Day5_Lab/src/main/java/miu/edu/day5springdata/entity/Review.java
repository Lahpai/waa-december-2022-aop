package miu.edu.day5springdata.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
    @Id
    private int id;
    private String comment;

    @ManyToOne
    private User user;
}
