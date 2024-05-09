public class Main {
    public static void main(String[] args) {
        Library library = new Library(300,30,"science fiction","LDUBGD" );
        Student student = new Student(18,"Loza Vika",1,"computer science");
        Book book = new Book("Atomic habits","James Clear",320);

        student.setLibrary(library);
        book.borrow(student);

        if(book.isBusy()){
            System.out.println("Книга зайнята");
        }
        else{
            System.out.println("Книга не є зайнята");
        }
        System.out.println("Student:" + student.getName()+ ",Age:"+ student.getAge()+ ",Course"+student.getCourse()+ ",Profession:"+ student.getProfession());
        UniversityLibrary universityLibrary = new UniversityLibrary(500,50,"Science fiction","University Campus","Harvard University");

        System.out.println("University Library information:");
        System.out.println("University Name:"+universityLibrary.getUniversityName());
        System.out.println("Location:"+universityLibrary.getLocation());
        System.out.println("Number of Books:"+universityLibrary.getNumberOfBooks());
        System.out.println("Number of Readers:"+universityLibrary.getReaders());
        System.out.println("Type of Books:"+universityLibrary.getTypeOfBooks());

        System.out.println("Library Information:");
        student.displayLibraryInfo();

    }
}
