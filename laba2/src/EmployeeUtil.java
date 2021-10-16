import java.text.MessageFormat;

public final class EmployeeUtil {
    public static void displayAvgSalary(Employee[] employees){
        double avgSalary = 0;
        for (Employee employee : employees) {
            avgSalary += employee.getSalary();
        }

        avgSalary = employees.length == 0 ? 0 : avgSalary / employees.length;

        System.out.println("Средняя зарплата: " + avgSalary);
    }

    public static void displayEmployeesWithChildren(Employee[] employees){
        for (Employee employee : employees) {
            if (employee.isHasChildren()) {
                System.out.println(MessageFormat.format("У работника {0} есть ребенок", employee.getFullName()));
            }
        }
    }
}
