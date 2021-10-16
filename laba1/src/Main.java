public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Романов Максим", 19, "Техник-Программист", 4),
                new Employee("Пратасеня Роман", 18, "Техник-Программист", 2),
                new Employee("Пытко Глеб", 19, "Ведуший корпоративов", 3),
                new Employee("Журо Никита", 18, "Безработный")
        };

        for (Employee employee : employees) {
            WriterInfo.displayInfo(employee);
        }
    }
}
