public class Author {
    private String name;
    private String lastName;
    private String genre;


    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getGenre(){
        return this.genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }

    public Author(){

    }

    public Author(String name, String lastName, String genre){
        this.name = name;
        this.lastName = lastName;
        this.genre = genre;
    }
}
