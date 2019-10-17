package Week4Homework;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private String department;
    private String jobTitle;

    //mutators or setteres
    public void setName(String nameGiven) {
        this.name = nameGiven;
    }

    public void setAge(int ageGiven) {
        this.age = ageGiven;
    }

    public void setAge(String ageGiven) {
        this.age = Integer.parseInt(ageGiven);
    }

    public void setGender(String genderGiven) {
        this.gender = genderGiven;
    }

    public void setDepartment(String departmentGiven) {
        this.department = departmentGiven;
    }

    public void setJobTitle(String jobTitleGiven) {
        this.jobTitle = jobTitleGiven;
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
        this.name = employeeName;
        this.age = employeeAge;
        this.gender = employeeGender;
        this.department = employeeDepartment;
        this.jobTitle = employeeJobTitle;
    }

    public String displayEmployeeDetails() {
        return ("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Department: " + department + ", Job Title: " + jobTitle);
    }
}
