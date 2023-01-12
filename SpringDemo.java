package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(com.training.spring.config.ApplicationConfig.class);
       Person person1=(Person)context.getBean("person");
        System.out.println("Name is :"+person1.getFirstname()+" "+person1.getLastname());
        System.out.println("age of the peter is : "+person1.getAge());
     System.out.println("person details is:"+person1.personDetail());
     //  Employee emp=(Employee)context.getBean("employee");
       //System.out.println(emp.employeedetails());

	}

}
