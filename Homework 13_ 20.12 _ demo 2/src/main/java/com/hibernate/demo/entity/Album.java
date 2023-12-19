package com.hibernate.demo.entity;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.time.LocalDate;

@Entity
@Table(name = "Album")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    @Column(nullable = false)
    private String artist;

    @NonNull
    @Column(nullable = false)
    private int releaseDate;

    @NonNull
    @Column(nullable = false)
    private String title;

    public Album(@NonNull String artist, int releaseDate, @NonNull String title) {
        this.artist = artist;
        this.releaseDate= releaseDate;
        this.title = title;
    }

    public Album() {
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", artist='" + artist + '\'' +
                ", releaseDate=" + releaseDate +
                ", title='" + title + '\'' +
                '}';
    }

}
