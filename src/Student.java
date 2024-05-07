public class Student {
    private int age;
    private String name;
    private int course;
    private String profession;
    private Library library;
    private String bookName;

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
    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
}
