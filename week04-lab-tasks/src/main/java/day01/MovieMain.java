package day01;

public class MovieMain {

    public static void main(String[] args) {

        Actor actor1 = new Actor("John Doe", 1968);
        Actor actor2 = new Actor("John Smith", 2000);
        Actor actor3 = new Actor("Jane Doe", 1998);

        Movie movie = new Movie("Something", 2021);
        movie.addActor(actor1);
        movie.addActor(actor2);
        movie.addActor(actor3);

        System.out.println(movie.actorsInTheirTwenties());
    }
}