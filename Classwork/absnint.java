interface University{
    void getName();
    void getLocation();
    void getCourses();
}
abstract class College implements University{
    @Override
    public void getName() {
        System.out.println("This is a college");
    }
    @Override
    public abstract void getLocation();
    @Override
    public abstract void getCourses();

    abstract void collegeInfo();
}
class School extends College {
    @Override
    public void getLocation() {
        System.out.println("College location: Main campus.");
    }
    @Override
    public void getCourses() {
        System.out.println("College courses: Science, Arts, Commerce.");
    }
    @Override
    void collegeInfo() {
        System.out.println("School college info.");
    }
}       
public class absnint {
    public static void main(String[] args) {
        College college = new School();
        college.getName();
    }
}