package org.spring.rest;

import org.spring.rest.configuration.MyConfig;
import org.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",
                Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee employeeById = communication.getEmployee(1);
        System.out.println(employeeById);

//        Employee employee = new Employee("Svet", "Amogus", "IT", 3000);
//        employee.setId(8);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(8);
    }
}
