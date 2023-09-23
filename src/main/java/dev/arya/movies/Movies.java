package dev.arya.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movies {

	@Id
	private ObjectId id;
	
	private String imdbId;
	
	private String title;
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getTrailerLink() {
		return trailerLink;
	}

	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public List<String> getBackDrop() {
		return backDrop;
	}

	public void setBackDrop(List<String> backDrop) {
		this.backDrop = backDrop;
	}

	public List<Review> getReviewIds() {
		return reviewIds;
	}

	public void setReviewIds(List<Review> reviewIds) {
		this.reviewIds = reviewIds;
	}

	private String releaseDate;
	
	private String trailerLink;
	
	private String poster;
	
	private List<String> genres;
	
	private List<String> backDrop;
	
	@DocumentReference
	private List<Review> reviewIds;
	
}
