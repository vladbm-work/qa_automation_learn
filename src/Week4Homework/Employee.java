package Week4Homework;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private String department;
    private String jobTitle;

    //mutators or setteres
    public void setName(String nameGiven) {
        name = nameGiven;
    }

    public void setAge(int ageGiven) {
        age = ageGiven;
    }

    public void setAge(String ageGiven) {
        age = Integer.parseInt(ageGiven);
    }

    public void setGender(String genderGiven) {
        gender = genderGiven;
    }

    public void setDepartment(String departmentGiven) {
        department = departmentGiven;
    }

    public void setJobTitle(String jobTitleGiven) {
        jobTitle = jobTitleGiven;
    }

    //getters or accessors
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }


    //constructors
    public Employee(String employeeName, int employeeAge, String employeeGender, String employeeDepartment, String employeeJobTitle) {
        name = employeeName;
        age = employeeAge;
        gender = employeeGender;
        department = employeeDepartment;
        jobTitle = employeeJobTitle;
    }
/**
 public Employee() {
 idNumber = 0;
 name = "";
 age = 0;
 gender = "";
 department = "";
 jobTitle = "";
 }
 **/
}
