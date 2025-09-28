package org.sahilo.Basics.UML;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Professor> professors;

    public Department(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }

    public void showProfessors() {
        System.out.println("Department: " + name);
        for(Professor prof: professors) {
            System.out.println(prof.getName());
        }
    }
}


public class AggregationExample {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Mr Pawar");
        Professor prof2 = new Professor("Mr. Patil");

        List<Professor> professors = new ArrayList<>();
        professors.add(prof1);
        professors.add(prof2);
        //Aggregation relationship: department has professors but professors exist independently.
        Department department = new Department("Computer Science", professors);
        department.showProfessors();
    }
}
