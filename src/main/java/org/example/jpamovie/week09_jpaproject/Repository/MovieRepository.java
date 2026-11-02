package org.example.jpamovie.week09_jpaproject.Repository;

import org.example.jpamovie.week09_jpaproject.Entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}