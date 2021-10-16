import Models.*;

public class UniversityStaffBuilder implements IBuilder {
    private final UniversityStaff universityStaff;

    private UniversityStaffBuilder(){
        universityStaff = new UniversityStaff();
    }

    public static UniversityStaffBuilder createBuilder(){
        return new UniversityStaffBuilder();
    }

    public UniversityStaffBuilder setRector(String name) {
        universityStaff.rector = new Rector(name);
        return this;
    }

    public UniversityStaffBuilder setViceRector(String name) {
        universityStaff.viceRector = new ViceRector(name);
        return this;
    }

    public UniversityStaffBuilder setDirector(String name) {
        universityStaff.director = new Director(name);
        return this;
    }

    public UniversityStaffBuilder setDepartmentHead(String name) {
        universityStaff.departmentHead = new DepartmentHead(name);
        return this;
    }

    public UniversityStaffBuilder setTeachers(String... names) {
        universityStaff.teachers = new Teachers(names);
        return this;
    }

    public UniversityStaff build(){
        return universityStaff;
    }
}
