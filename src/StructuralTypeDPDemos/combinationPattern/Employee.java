package StructuralTypeDPDemos.combinationPattern;

import java.util.List;

public class Employee {
    private String name;
    private String age;
    private String dept;
    /**
     * 下属
     */
    private List<Employee> subordinates;

    public Employee(String name, String age, String dept, List<Employee> subordinates) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.subordinates = subordinates;
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinate() {
        return  subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", dept='" + dept + '\'' +
                ", subordinates=" + subordinates +
                '}';
    }
}
