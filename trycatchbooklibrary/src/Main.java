public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(123, "lara", " adsasd");
        Book book2 = new Book(12312, "kory", "vera");
        Book book3 = null;
        Library library1 = new Library();
        for (int i = 0; i < 21; i++) {
            library1.addBook(new Book());
        }
        library1.printBooks();
    }
}

