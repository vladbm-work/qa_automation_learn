package Week4Homework;

public class AccessData {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alex Morar", 30, "Male",
                "IT", "Networking");
        Employee employee2 = new Employee("Andreea Pop", 25, "Female",
                "HR", "Communications");
        Employee employee3 = new Employee("Andrei Popescu", 27, "Male",
                "HR", "Finance Assistant");
        Employee employee4 = new Employee("Mara Carturescu", 24, "Female",
                "Support", "Night Owl");
        Employee employee5 = new Employee("Alina Voie", 66, "Female",
                "Development", "Java Programmer");
        Employee employee6 = new Employee("Sergiu Mocan", 32, "Male",
                "QA", "Wannabe");

        //employee1.setName("Popescu Andreea");
        //employee1.setJobTitle("Event Planner");

        System.out.println("Name\t\t\tAge\t\tGender\t\tDepartment\t\tJob Title");
        System.out.println(employee1.getName() + "\t\t" + employee1.getAge() + "\t\t"
                + employee1.getGender() + "\t\t" + employee1.getDepartment() + "\t\t\t\t" + employee1.getJobTitle());
        System.out.println(employee2.getName() + "\t\t" + employee2.getAge() + "\t\t"
                + employee2.getGender() + "\t\t" + employee2.getDepartment() + "\t\t\t\t" + employee2.getJobTitle());


        Organization mapOrganization = new Organization();
        mapOrganization.addEmployee(1, employee1);
        mapOrganization.addEmployee(2, employee2);
        mapOrganization.addEmployee(3, employee3);
        mapOrganization.addEmployee(4, employee4);
        mapOrganization.addEmployee(5, employee5);
        mapOrganization.addEmployee(6, employee6);

        Employee employeeById = mapOrganization.getEmployee(5);
        System.out.println(employeeById.getJobTitle());


        mapOrganization.printMapEmployees();
        //mapOrganization.printMapEmployess1();

        mapOrganization.deleteEmployee(4);
        mapOrganization.printMapEmployees();
    }
}
