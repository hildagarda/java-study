public class Book {
    private String title;
    private int page;
    private String Author;

    public String getName() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor(){
        return Author;
    }
    public void setAuthor (String Author) {
        this.Author = Author;
    }

    public Book() {

    }


    public Book(String title, int page) {
        this.title = title;
        this.page = page;

    }
}