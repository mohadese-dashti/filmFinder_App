package com.example.filmfinder.ui.Model;

public class Movies {
    private String MovieName;
    private String DirectorName;
    private String MovieSummary;
    private int MoviePoster;
    private int MovieImage;

    public Movies(String movieName, String directorName, String movieSummary, int moviePoster, int movieImage) {
        MovieName = movieName;
        DirectorName = directorName;
        MovieSummary = movieSummary;
        MoviePoster = moviePoster;
        MovieImage = movieImage;
    }


    public String getDirectorName() {
        return DirectorName;
    }

    public void setDirectorName(String directorName) {
        DirectorName = directorName;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getMovieSummary() {
        return MovieSummary;
    }

    public void setMovieSummary(String movieSummary) {
        MovieSummary = movieSummary;
    }

    public int getMoviePoster() {
        return MoviePoster;
    }

    public void setMoviePoster(int moviePoster) {
        MoviePoster = moviePoster;
    }

    public int getMovieImage() {
        return MovieImage;
    }

    public void setMovieImage(int movieImage) {
        MovieImage = movieImage;
    }
}
