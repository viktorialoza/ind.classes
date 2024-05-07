public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private boolean isBorrowed;
    private Student student;

    public Book(String title, String author,int numberOfPages,boolean isBorrowed){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isBorrowed = isBorrowed;
    }
    public void setStudent(Student student){
        this.student = student;
    }
    public Student getStudent(){
        return student;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }
    public boolean getIsBorrowed(){
        return isBorrowed;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
    public void setIsBorrowed(boolean isBorrowed){
        this.isBorrowed = isBorrowed;
    }
    public boolean isBusy(){
        return false;
    }

}
