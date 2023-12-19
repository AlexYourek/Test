package com.hibernate.demo.entity;
import jakarta.persistence.*;
import org.springframework.lang.NonNull;
@Entity
@Table(name = "Song")
public class Song {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;

        @NonNull
        @Column(nullable = false)
        private String title;

        @NonNull
        @Column(nullable = false)
        private String artist;

        @NonNull
        @Column(nullable = false)
        private int duration;

    @OneToOne
    @JoinColumn(name = "album_id")
    private Album album;

    public void setAlbum(Album album) {
        this.album = album;
    }
    public Song(@NonNull String artist, int duration, @NonNull String title) {
        this.artist = artist;
        this.duration = duration;
        this.title = title;
    }

        public Song() {
        }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}
