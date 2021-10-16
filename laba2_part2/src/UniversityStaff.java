import Models.*;

public class UniversityStaff {
    public Rector rector;
    public ViceRector viceRector;
    public Director director;
    public DepartmentHead departmentHead;
    public Teachers teachers;

    public void displayStaff(){
        System.out.println("Ректор: " + rector.getName());
        System.out.println("Проректор: " + viceRector.getName());
        System.out.println("Директор: " + director.getName());
        System.out.println("Заведующий: " + departmentHead.getName());

        System.out.println();

        for (String name : teachers.getNames()) {
            System.out.println("Преподаватель: " + name);
        }
    }
}
