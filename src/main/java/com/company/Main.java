package com.company;

import com.company.model.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Josef","Zedník");
        Employee emp2 = new Employee("Petrklic", "Zedník");
        Employee emp3 = new Employee("Bartolomej", "Uklizec");
        Employee emp4 = new Employee("Servac", "Hlidac");
        Employee emp5 = new Employee("Bonifac", "Uklizec");
        Employee emp6 = new Employee("Pankrac", "Sochar");
        Employee emp7 = new Employee("Burac", "Zedník");
        Employee emp8 = new Employee("Petlahev", "Sochar");
        Employee emp9 = new Employee("Petka", "Zedník");
        Employee emp10 = new Employee("Petrolej", "Sochar");
        Employee emp11 = new Employee("Pistek", "Zedník");

        List<Employee> zamestnanci = Employee.getEmployees();

        System.out.println("\nseradit podle delky jmena");
        sortByNameLength(zamestnanci).forEach(System.out::println);

        System.out.println("\nabecedne seradit podle nazvu prace");
        sortByJobTitle(zamestnanci).forEach(System.out::println);

        System.out.println("\nabecedne seradit podle podle jmena");
        sortByName(zamestnanci).forEach(System.out::println);

    }

    public static Stream<Employee> sortByJobTitle(List<Employee> list){
        return list.stream().sorted(Comparator.comparing(Employee::getJob));
    }

    public static Stream<Employee> sortByName(List<Employee> list){
        return list.stream().sorted(Comparator.comparing(Employee::getName));
    }

    public static Stream<Employee> sortByNameLength(List<Employee> list){
        return list.stream().sorted((a, b) -> a.getName().length() - b.getName().length());
    }

}
