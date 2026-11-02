package org.example.jpamovie.week09_jpaproject.Service;

import org.example.jpamovie.week09_jpaproject.Dto.MovieRequest;
import org.example.jpamovie.week09_jpaproject.Dto.MovieResponse;
import org.example.jpamovie.week09_jpaproject.Entity.Movie;
import org.example.jpamovie.week09_jpaproject.Repository.MovieRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository=repository;
    }
    public MovieResponse create(MovieRequest request) {
        Movie movie=new Movie();
         movie.setTitle(request.title());
         movie.setDirector(request.director());
           movie.setGenre(request.genre());
           movie.setRating(request.rating());
           movie.setReleaseYear(request.releaseYear());
            movie.setRunningTime(request.runningTime());

        Movie saved=repository.save(movie);
        return MovieResponse.from(saved);
    }

    public List<MovieResponse> findAll() {
        return repository.findAll().stream().map(MovieResponse::from).toList();
    }

    public MovieResponse findById(Long id) {
        return MovieResponse.from(findEntity(id));
    }

    public MovieResponse update(Long id, MovieRequest request) {
        Movie movie=findEntity(id);
         movie.setTitle(request.title());
         movie.setDirector(request.director());
         movie.setGenre(request.genre());
         movie.setRating(request.rating());
          movie.setReleaseYear(request.releaseYear());
          movie.setRunningTime(request.runningTime());

        return MovieResponse.from(repository.save(movie));
    }

    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Movie not found: " + id);
        }
        repository.deleteById(id);
    }

    private Movie findEntity(Long id) {
        return repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Movie not found: " + id));
    }
}
