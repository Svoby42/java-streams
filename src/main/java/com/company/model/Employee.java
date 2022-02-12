package com.company.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Employee {

    private static  List<Employee> zamestnanci = new ArrayList<>();
    private String name;
    private String job;

    public Employee(String name, String job){
        this.name = name;
        this.job = job;
        zamestnanci.add(this);
    }

    public static List<Employee> getEmployees() {
        return zamestnanci;
    }

    @Override
    public String toString(){
        return "Zaměstnanec: " + this.getName() + " povolání: " + this.getJob();
    }

}
