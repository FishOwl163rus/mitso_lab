public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Романов Максим", 19, "Техник-Программист", 4, 800),
                new Employee("Пратасеня Роман", 18, "Техник-Программист", 2,750, true),
                new Employee("Пытко Глеб", 19, "Ведуший корпоративов", 3, 1240),
                new Employee("Журо Никита", 18, "Senior C# Developer (TeamLead)",8, 2250, true)
        };

        EmployeeUtil.displayAvgSalary(employees);
        EmployeeUtil.displayEmployeesWithChildren(employees);
    }
}
