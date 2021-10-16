public class Employee {
    private final String fullName;
    private final int age;
    private final String duty;
    private final int experience;

    public Employee(String fullName, int age, String duty, int experience) {
        this.fullName = fullName;
        this.age = age;
        this.duty = duty;
        this.experience = experience;
    }

    public Employee(String fullName, int age, String duty) {
        this.fullName = fullName;
        this.age = age;
        this.duty = duty;
        this.experience = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getDuty() {
        return duty;
    }

    public int getExperience() {
        return experience;
    }

}
