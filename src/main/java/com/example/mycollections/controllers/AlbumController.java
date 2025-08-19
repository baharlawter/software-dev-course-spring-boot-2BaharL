package com.example.mycollections.controllers;
import com.example.mycollections.models.Album;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {
    private final List <Album> albums=new ArrayList<>(){{
        add (new Album("name1", "artist1", 2000, 01));
        add (new Album("name2", "artist2",2001, 02));
        add (new Album("name3","artist3",2002, 03));
    }};
    @GetMapping("/json")
    public List<Album> getAlbumsJson (){return albums;}
    @GetMapping("/html")
    public String getAlbumsHtml(){
        String albumList="<ul>";
        for (Album album:albums){
            albumList+="<li>"+album+"<li>";
        }
        albumList+="</ul";
        return """
                <html>
                    <body>
                        <h1>Books</h1>
                        <ul>
                """ +
                albumList +
                """
                        </ul>
                    </body>
                """;
    }
}
