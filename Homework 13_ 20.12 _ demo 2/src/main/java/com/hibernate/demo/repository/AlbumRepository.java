package com.hibernate.demo.repository;
import com.hibernate.demo.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    @NonNull
    List<Album> findAll();
}
