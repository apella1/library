package me.apella.library.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Writer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long writerId;
    private String name;
    private String bio;
    @OneToMany(mappedBy = "writer")
    private List<Article> articles;
    private String imageUrl;
}
