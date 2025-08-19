package com.example.mycollections.controllers;

import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("movies")
public class MovieController {
    private final List<Movie> movies= new ArrayList<>(){{
        add(new Movie("movie1", "Director1", 1990, 90));
        add(new Movie("Movie2", "Director2", 1960, 60));
        add(new Movie("Movie3", "Director3", 1991, 120));
    }};
    @GetMapping("/json")
    public List<Movie> getMoviesJson(){return movies;}

    @GetMapping("/html")
    public String  getMoviesHtml(){
        String movieList="<ul>";
        for(Movie movie: movies){movieList += "<li>" + movie + "</li>";
        }
        movieList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Books</h1>
                        <ul>
                """ +
               movieList +
                """
                        </ul>
                    </body>
                """;
    }
    }

