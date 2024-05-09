public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private boolean isBorrowed;
    private Student student;

    public Book(String title, String author,int numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isBorrowed = false;
        this.student = null;
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
        return isBorrowed;
    }
    public void borrow(Student student){
        if(!isBorrowed){
            this.student = student;
            this.isBorrowed = true;
            System.out.println("Книгу '"+title+"'позичено студенту'"+student.getName()+"'");
        }
        else{
            System.out.println("Книга '"+title+"'вже позичена");
        }
    }
    public void returnBook(){
        if (isBorrowed){
            isBorrowed = false;
            student = null;
            System.out.println("Книга повернена успішно!");
        }
        else{
            System.out.println("Ця книга не запозичена");
        }
    }


}
