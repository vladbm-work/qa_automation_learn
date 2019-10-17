package Week4Homework;

import java.util.HashMap;
import java.util.*;

public class Organization {
    private HashMap<Integer, Employee> mapEmployees = new HashMap<>();

    //methods
    public void addEmployee(Integer employeeId, Employee employee) {
        mapEmployees.put(employeeId, employee);
    }

    public Employee getEmployee(Integer employeeId) {
        return mapEmployees.get(employeeId);
    }

    public void printMapEmployees() {

        for (Map.Entry<Integer, Employee> entry : mapEmployees.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue().getName());
        }
    }

    public void deleteEmployee(Integer employeeId) {
        mapEmployees.entrySet().removeIf(entry -> (employeeId.equals(entry.getKey())));
    }

    public void searchEmployeeByName(String name) {
        boolean foundResults = false;
        for (Map.Entry<Integer, Employee> entry : mapEmployees.entrySet()) {
            if (entry.getValue().getName().contains(name)) {
                System.out.println("The searched employee is: ");
                System.out.println("Employee ID = " + entry.getKey() + ", " + entry.getValue().displayEmployeeDetails());
                foundResults = true;
            }
        }
        if (!foundResults) {
            System.out.println("There is no Employee with that search parameter.");
        }
    }

    public void searchEmployeeByAge(Integer age) {
        boolean foundResults = false;
        for (Map.Entry<Integer, Employee> entry : mapEmployees.entrySet()) {
            if (entry.getValue().getAge() == (age)) {
                System.out.println("The searched employee is: ");
                System.out.println("Employee ID = " + entry.getKey() + ", " + entry.getValue().displayEmployeeDetails());
                foundResults = true;
            }
        }
        if (!foundResults) {
            System.out.println("There is no Employee with that search parameter.");
        }
    }

    public void searchEmployeeByGender(String gender) {
        boolean foundResults = false;
        for (Map.Entry<Integer, Employee> entry : mapEmployees.entrySet()) {
            if (entry.getValue().getGender().equals(gender)) {
                System.out.println("The searched employee is: ");
                System.out.println("Employee ID = " + entry.getKey() + ", " + entry.getValue().displayEmployeeDetails());
                foundResults = true;
            }
        }
        if (!foundResults) {
            System.out.println("There is no Employee with that search parameter.");
        }
    }

    public void searchEmployeeByDepartment(String department) {
        boolean foundResults = false;
        for (Map.Entry<Integer, Employee> entry : mapEmployees.entrySet()) {
            if (entry.getValue().getName().contains(department)) {
                System.out.println("The searched employee is: ");
                System.out.println("Employee ID = " + entry.getKey() + ", " + entry.getValue().displayEmployeeDetails());
                foundResults = true;
            }
        }
        if (!foundResults) {
            System.out.println("There is no Employee with that search parameter.");
        }
    }

    public void searchEmployeeByJobTitle(String jobTitle) {
        boolean foundResults = false;
        for (Map.Entry<Integer, Employee> entry : mapEmployees.entrySet()) {
            if (entry.getValue().getName().contains(jobTitle)) {
                System.out.println("The searched employee is: ");
                System.out.println("Employee ID = " + entry.getKey() + ", " + entry.getValue().displayEmployeeDetails());
                foundResults = true;
            }
        }
        if (!foundResults) {
            System.out.println("There is no Employee with that search parameter.");
        }
    }

    public void updateEmployeeName(String name, String newName) {
        boolean foundResults = false;
        for (Map.Entry<Integer, Employee> entry : mapEmployees.entrySet()) {
            if (entry.getValue().getName().contains(name)) {
                entry.getValue().setName(newName);
                System.out.println("The employee name was updated: ");
                System.out.println("Employee ID = " + entry.getKey() + ", " + entry.getValue().displayEmployeeDetails());
                foundResults = true;
            }
        }
        if (!foundResults) {
            System.out.println("There is no Employee with that search parameter.");
            System.out.println("No updates have been performed!");
        }
    }

    public void updateEmployeeAge(String name, Integer newAge) {
        boolean foundResults = false;
        for (Map.Entry<Integer, Employee> entry : mapEmployees.entrySet()) {
            if (entry.getValue().getName().contains(name)) {
                entry.getValue().setAge(newAge);
                System.out.println("The employee age was updated: ");
                System.out.println("Employee ID = " + entry.getKey() + ", " + entry.getValue().displayEmployeeDetails());
                foundResults = true;
            }
        }
        if (!foundResults) {
            System.out.println("There is no Employee with that search parameter.");
            System.out.println("No updates have been performed!");
        }
    }

    public void updateEmployeeGender(String name, String newGender) {
        boolean foundResults = false;
        for (Map.Entry<Integer, Employee> entry : mapEmployees.entrySet()) {
            if (entry.getValue().getName().contains(name)) {
                entry.getValue().setGender(newGender);
                System.out.println("The employee age was updated: ");
                System.out.println("Employee ID = " + entry.getKey() + ", " + entry.getValue().displayEmployeeDetails());
                foundResults = true;
            }
        }
        if (!foundResults) {
            System.out.println("There is no Employee with that search parameter.");
            System.out.println("No updates have been performed!");
        }
    }

    public void updateEmployeeDepartment(String name, String newDepartment) {
        boolean foundResults = false;
        for (Map.Entry<Integer, Employee> entry : mapEmployees.entrySet()) {
            if (entry.getValue().getName().contains(name)) {
                entry.getValue().setDepartment(newDepartment);
                System.out.println("The employee age was updated: ");
                System.out.println("Employee ID = " + entry.getKey() + ", " + entry.getValue().displayEmployeeDetails());
                foundResults = true;
            }
        }
        if (!foundResults) {
            System.out.println("There is no Employee with that search parameter.");
            System.out.println("No updates have been performed!");
        }
    }

    public void updateEmployeeJobTitle(String name, String newJobTitle) {
        boolean foundResults = false;
        for (Map.Entry<Integer, Employee> entry : mapEmployees.entrySet()) {
            if (entry.getValue().getName().contains(name)) {
                entry.getValue().setJobTitle(newJobTitle);
                System.out.println("The employee age was updated: ");
                System.out.println("Employee ID = " + entry.getKey() + ", " + entry.getValue().displayEmployeeDetails());
                foundResults = true;
            }
        }
        if (!foundResults) {
            System.out.println("There is no Employee with that search parameter.");
            System.out.println("No updates have been performed!");
        }
    }
}
