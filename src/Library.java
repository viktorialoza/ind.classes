public class Library {
    private String name;
    private int numberOfBooks;
    private int readers;
    private String typeOfBooks;
    private String location;

    public Library(int numberOfBooks,int readers,String typeOfBooks,String location){
        this.numberOfBooks = numberOfBooks;
        this.readers = readers;
        this.typeOfBooks = typeOfBooks;
        this.location = location;
    }

    public int getNumberOfBooks(){
        return numberOfBooks;
    }
    public int getReaders(){
        return readers;
    }
    public String getTypeOfBooks(){
        return typeOfBooks;
    }
    public String getLocation(){
        return location;
    }
    public void setNumberOfBooks(int numberOfBooks){
        this.numberOfBooks = numberOfBooks;
    }
    public void setReaders(int readers){
        this.readers = readers;
    }
    public void setTypeOfBooks(String typeOfBooks){
        this.typeOfBooks = typeOfBooks;
    }
    public void displayLibraryInfo() {
        System.out.println("Library Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Books: " + numberOfBooks);
        System.out.println("Number of Readers: " + readers);
        System.out.println("Type of Books: " + typeOfBooks);
    }
    public void addBooks(int quantity) {
        numberOfBooks += quantity;
        System.out.println(quantity + " books added to the library. Total number of books: " + numberOfBooks);
    }

}

