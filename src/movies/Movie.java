package movies;
import util.Input;

public class Movie {
    private String name, category;

    public Movie(String name1, String category1){
        name = name1;
        category = category1;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public void setName(String name1){
        name = name1;
    }

    public void setCategory(String category1){
        category = category1;
    }

}
