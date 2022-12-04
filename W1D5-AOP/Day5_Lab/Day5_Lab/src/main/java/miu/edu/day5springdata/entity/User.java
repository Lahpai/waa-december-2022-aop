package miu.edu.day5springdata.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="app_user")
public class User {
    @Id
    private int id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;


}
