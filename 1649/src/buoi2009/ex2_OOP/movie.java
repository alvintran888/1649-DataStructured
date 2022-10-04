package buoi2009.ex2_OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*We have three domain classes: Movie, Director and Genre. Each movie has a title, a year and a unique id assigned by Internet Movie Database (IMDB). Each movie has been directed by at least one director, and each director has many movies. Each movie belongs to at least one genre.
a) Find the number of movies of each director (assume that Director class has not the member movies).
b) Find the number of genres of each director's movies.
c) Find the list of movies having the genres "Drama" and "Comedy" only.
d) Group the movies by the year and list them.*/
public class movie {

    private int id;
    private String title;
    private int year;
    private List<genre> genres;
    private List<director> directors;

    private static int COUNT = 1;

    public movie(String title, int year, director[] directors, String[] genres) {
        this.id = COUNT++;
        this.title = title;
        this.year = year;
        this.directors = (ArrayList<director>) Arrays.asList(directors);
        this.genres = (ArrayList<String>) Arrays.asList(genres);

    }
}

//}
// {
//        genres = new ArrayList();
//        director = new ArrayList();
//    }
//
//   
//       
//       
//    }
//    @Override
//        public String toString() {
//      return "Movie [title=" + title + ", year=" + year + "]";
