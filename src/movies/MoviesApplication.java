package movies;
import util.Input;

public class MoviesApplication {
    public static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        Input input = new Input();
//        String  choice = input.getString();
//        System.out.println(choice);

//        System.out.println(movies.length);
//        for (Movie movie : movies) {
//            System.out.println(movie.getName());
//        }


        int choice = 0;
        do{
            printMenu();
            System.out.print("Enter your choice: ");
            choice = input.getInt();
            if(choice == 1) viewAllMovies();
            else if(choice ==2) viewByGenre("animated");
            else if(choice ==3) viewByGenre("drama");
            else if(choice ==4) viewByGenre("horror");
            else if(choice ==5) viewByGenre("scifi");
            else if(choice ==6) {
                System.out.println("Enter new movie name: ");
                String name = input.getInput();
                System.out.println(name);
                System.out.println("Enter a category:");
                String category = input.getInput();
                System.out.println(category);
                addMovie(movies, new Movie(name, category));
            }
        }while(choice != 0);

//        addMovie(movies, new Movie("Peter", "scifi") );


    }

    public static void printMenu(){
        System.out.println("\n\nWhat would you like to do?\n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - add new movie\n");
    }

    public static void viewAllMovies(){
        for(Movie movie: movies){
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
        System.out.println("Movie count: " + movies.length);
    }

    public static void viewAllAnimated(){
        for(Movie movie: movies){
            if(movie.getCategory().equals("animated")){
            System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void viewAllDrama(){
        for(Movie movie: movies){
            if(movie.getCategory().equals("drama")){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void viewAllHorror(){
        for(Movie movie: movies){
            if(movie.getCategory().equals("horror")){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void viewAllScifi(){
        for(Movie movie: movies){
            if(movie.getCategory().equals("scifi")){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void viewByGenre(String genre){
        for(Movie movie: movies){
            if(movie.getCategory().equals(genre)){
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void addMovie(Movie[] movieArray, Movie movie){
        Movie[] movies2 = new Movie[movieArray.length+1];
        System.arraycopy(movieArray, 0, movies2, 0,movieArray.length );
        movies2[movies2.length-1] = movie;
        System.out.println(movies2.length);
        movies = new Movie[movies2.length];
        System.arraycopy(movies2, 0, movies, 0,movies2.length );
        System.out.println("New updated movie collection has: " + movies.length);
        System.out.println(movies[movies.length - 1]);
    }

}

