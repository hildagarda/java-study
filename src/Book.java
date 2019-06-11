public class Book {
    private String title;
    private int page;

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

    public Book() {

    }


    public Book(String title, int page) {
        this.title = title;
        this.page = page;

    }
}