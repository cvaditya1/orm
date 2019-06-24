package com.test.orm.app;

import com.test.orm.HibernateConfiguration;
import com.test.orm.models.Employee;
import com.test.orm.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {
    public static void main(String[] args) {
        try {

            ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);
            if(context != null)
                System.out.println("Context is " + context);

            EmployeeService service = context.getBean(EmployeeService.class);
            if(service != null){
                /*Employee employee = new Employee();
                employee.setName("Aditya");
                service.create(employee);

                Employee employee1 = new Employee();
                employee1.setName("Venkat");
                service.create(employee1);*/

                //GetData
                Employee emp = service.findOne(1);
                System.out.println("Employee Name: " + emp.getName());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
