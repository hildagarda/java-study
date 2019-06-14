public class AuthorTest {
    public static void main(String[] args) {
        Author author = new Author();
        String name = "Lev";
        String lastName = "Tolstoi";
        String genre = "novel";


        author.setName(name);
        author.setLastName(lastName);
        author.setGenre(genre);

        for (int i = 0; i <2 ; i++) {
            if (name == "Ivan"){
                System.out.println(genre);
            }
            else {
                System.out.println(lastName);
            }
        }
        Book book = new Book();
        String title = "War and peace";
        int page = 1000;
        String Author = "Lev Tolstoi";


        book.setName(title);
        book.setPage(page);
        book.setAuthor(Author);

        System.out.println(title+" "+page+" "+Author);



        }
}


