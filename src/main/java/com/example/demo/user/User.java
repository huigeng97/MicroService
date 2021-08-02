package com.example.demo.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;


@Entity
public class User {

    @Past
    private Date birthDate;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User() {
    }

    static int Id = 4;
    public User(Integer id, String name, Date birthDate) {
        this.birthDate = birthDate;
        this.id = id;
        this.name = name;
    }

    @Size(min=2, message = "name should at least 2 character")
    private String name;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
