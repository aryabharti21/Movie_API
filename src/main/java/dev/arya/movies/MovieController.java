package dev.arya.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/v1/movies")
public class MovieController {
	
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public ResponseEntity<List<Movies>> getAllMovies() {
		return new ResponseEntity<List<Movies>>(movieService.allMovies(), HttpStatus.OK);	
	}

	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movies>> getSingleMovie(@PathVariable String imdbId){
		return new ResponseEntity<Optional<Movies>>(movieService.singleMovie(imdbId), HttpStatus.OK);	
	}
	
}