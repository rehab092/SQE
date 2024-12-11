package org.example.sda_project.Bean;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "PostFactory")
public class PostFactory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    // Relationships
//    @OneToMany(mappedBy = "postFactory")
//    private List<Post> posts = new ArrayList<>();

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public List<Post> getPosts() {
//        return posts;
//    }
//
//    public void setPosts(List<Post> posts) {
//        this.posts = posts;
//    }

}
