package Week4Homework;

public class AccessData {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee(2, "Alex Andrei", 30, "Male",
                "IT", "Networking");

        employee1.setIdNumber("3589");
        employee1.setName("Popescu Andreea");

        System.out.println("ID Number\t\tName\t\t\tAge\t\tGender\t\tDepartment\t\tJob Title");
        System.out.println(employee1.getIdNumber() + "\t\t" + employee1.getName() + "\t\t" + employee1.getAge() + "\t\t"
                + employee1.getGender() + "\t\t" + employee1.getDepartment() + "\t\t" + employee1.getJobTitle());
        System.out.println(employee2.getIdNumber() + "\t\t\t" + employee2.getName() + "\t\t\t" + employee2.getAge() + "\t\t"
                + employee2.getGender() + "\t\t\t" + employee2.getDepartment() + "\t\t\t" + employee2.getJobTitle());

    }
}
