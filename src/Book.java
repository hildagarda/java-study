public class Book {
    private String title;
    private int page;
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Author getAuthor(){
        return author;
    }
    public void setAuthor (Author author) {
        this.author = author;
    }

    public Book() {

    }


    public Book(String title, int page) {
        this.title = title;
        this.page = page;

    }
}