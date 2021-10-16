public interface IBuilder {
    UniversityStaffBuilder setRector(String name);
    UniversityStaffBuilder setViceRector(String name);
    UniversityStaffBuilder setDirector(String name);
    UniversityStaffBuilder setDepartmentHead(String name);
    UniversityStaffBuilder setTeachers(String... names);
    UniversityStaff build();
}
