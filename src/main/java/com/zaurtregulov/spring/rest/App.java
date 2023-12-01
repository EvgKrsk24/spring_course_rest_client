package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication"
                , Communication.class);

        //Получение всех работников
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

        //Получение  1 раб
//        Employee empByID = communication.getEmployee(1);
//        System.out.println(empByID);

//        //Добавление или изменение раб
//        Employee emp = new Employee("Sveta", "Tregulova",
//                "IT", 1200);
//        emp.setId(5); // прописываем при update
//        communication.saveEmployee(emp);

        //Удаление
        communication.deleteEmployee(5);






    }
}
