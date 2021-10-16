public class Main {
    public static void main(String[] args) {
        UniversityStaffBuilder
                .createBuilder()
                .setRector("Ковалёнок Юрий Казимирович")
                .setViceRector("Лепёхин Александр Николаевич")
                .setDirector("Дапиро Роман Осипович")
                .setDepartmentHead("Шведова Наталья Васильевна")
                .setTeachers("Жалов Александр Петрович", "Калинин Максим Александрович", "Дворникова Татьяна Николаевна")
                .build()
                .displayStaff();
    }
}
