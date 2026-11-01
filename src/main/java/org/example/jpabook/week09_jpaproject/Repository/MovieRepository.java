package org.example.jpabook.week09_jpaproject.Repository;

import org.example.jpabook.week09_jpaproject.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}