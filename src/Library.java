public class Library {
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
    public void place(){
        System.out.println("This library is locating");
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
    public void setLocation(String location){
        this.location = location;
    }
    public void increaseNumberOfBooks(int amount){
        this.numberOfBooks += amount;
        if(this.numberOfBooks > 300){
            System.out.println("Книг забагато");
        }
        else{
            System.out.println("К-сть книг припустима");
        }
    }

}

