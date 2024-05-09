public class Student {
    private int age;
    private String name;
    private int course;
    private String profession;
    private Library library;

    public Student(int age,String name,int course,String profession){
        this.age = age;
        this.name = name;
        this.course = course;
        this.profession = profession;
    }
    public void setLibrary(Library library){
        this.library = library;
    }
    public Library getLibrary(){
        return library;
    }
    public int getAge(){
        return  age;
    }
    public String getName(){
        return name;
    }
    public int getCourse(){
        return course;
    }
    public String getProfession(){
        return profession;
    }
    public void borrowBook(Book book){
        book.borrow(this);
    }
    public void returnBook(Book book){
        book.returnBook();
    }
    public void displayLibraryInfo(){
        library.displayLibraryInfo();
    }

}
