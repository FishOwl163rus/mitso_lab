public final class WriterInfo {
    public static void displayInfo(Employee employee){
        System.out.println("ФИО: " + employee.getFullName());
        System.out.println("Возраст: " + employee.getAge());
        System.out.println("Должность: " + employee.getDuty());
        System.out.println("Стаж: " + employee.getExperience());
        System.out.println("Есть дети: " + (employee.isHasChildren() ? "Да" : "Нет"));
        System.out.println("Зарплата: " + employee.getSalary());
        System.out.println();
    }
}
