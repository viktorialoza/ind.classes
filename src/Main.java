public class Main {
    public static void main(String[] args) {
        Library library = new Library(300,30,"science fiction","LDUBGD" );
        Student student = new Student(18,"Loza Vika",1,"computer science");
        Book book = new Book("Atomic habits","James Clear",320,true);

        student.setLibrary(library);
        book.setStudent(student);

        if(book.isBusy()){
            System.out.println("Книга зайнята");
        }
        else{
            System.out.println("Книга не є зайнята");
        }
        library.increaseNumberOfBooks(330);
        student.setBookName("Atomic habits");
        if("Atomic habits".equals(student.getBookName())){
            System.out.println("Студент з книгою Atomic habits");
        }
        else{
            System.out.println("Студент без книги Atomic habits");
        }
        System.out.println("Student:" + student.getName()+ ",Age:"+ student.getAge()+ ",Course"+student.getCourse()+ ",Profession"+ student.getProfession());

    }
}
