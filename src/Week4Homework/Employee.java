package Week4Homework;

public class Employee {
    private int idNumber;
    private String name;
    private int age;
    private String gender;
    private String department;
    private String jobTitle;

    //mutators or setteres
    public void setIdNumber(int idNumberGiven) {
        idNumber = idNumberGiven;
    }

    public void setIdNumber(String idNumberGiven) {
        idNumber = Integer.parseInt(idNumberGiven);
    }

    public void setName(String nameGiven) {
        name = nameGiven;
    }

    public void setAge(int ageGiven) {
        age = ageGiven;
    }

    public void setAge(String ageGiven) {
        idNumber = Integer.parseInt(ageGiven);
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
    public int getIdNumber() {
        return idNumber;
    }

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
    public Employee(int employeeIdNumber, String employeeName, int employeeAge, String employeeGender, String employeeDepartment, String employeeJobTitle) {
        idNumber = employeeIdNumber;
        name = employeeName;
        age = employeeAge;
        gender = employeeGender;
        department = employeeDepartment;
        jobTitle = employeeJobTitle;
    }

    public Employee() {
        idNumber = 0;
        name = "";
        age = 0;
        gender = "";
        department = "";
        jobTitle = "";
    }
}
