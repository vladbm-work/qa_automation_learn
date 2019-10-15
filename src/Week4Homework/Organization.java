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
        mapEmployees.entrySet().removeIf(entry -> (employeeId == entry.getKey()));
    }
/**
 public void printMapEmployess1(HashMap<Integer, Employee> mapEmployees) {
 mapEmployees.entrySet().stream()
 .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
 }**/
}
