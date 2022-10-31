public class Library extends Book {
    protected String name;
    protected String city;
    Book books[] = new Book[20];
    int index = 0;

    public Library() {
    }
    public Library (String name, String city, Book books[], int index) {
        this.name  = name;
        this.city = city;
        this.books = books;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public int addBook(Book book) {
           try {
               Book[index] = book;
               index = index + 1;
           }
           catch (ArrayIndexOutOfBoundsException e){
               Book[index]   = "The book is empty";
           }
    }
    public String printBooks(String name, String city, int index) {

    }
}
