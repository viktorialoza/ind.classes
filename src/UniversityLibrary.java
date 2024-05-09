public class UniversityLibrary extends Library{
    private String universityName;

    public UniversityLibrary(int numberOfBooks,int readers,String typeOfBooks,String location,String universityName){
        super(numberOfBooks,readers,typeOfBooks,location);
        this.universityName = universityName;
    }
    public String getUniversityName(){
        return universityName;
    }
    public void setUniversityName(String universityName){
        this.universityName = universityName;
    }

}
