public class Employee {
    private String fullName;
    private double age;
    private String duty;
    private double experience;
    private double salary;
    private boolean hasChildren;

    public Employee(String fullName, double age, String duty, double experience, double salary, boolean hasChildren) {
        this.fullName = fullName;
        this.age = age;
        this.duty = duty;
        this.experience = experience;
        this.salary = salary;
        this.hasChildren = hasChildren;
    }

    public Employee(String fullName, double age, String duty, double experience, double salary) {
        this.fullName = fullName;
        this.age = age;
        this.duty = duty;
        this.experience = experience;
        this.salary = salary;
        this.hasChildren = false;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }
}
