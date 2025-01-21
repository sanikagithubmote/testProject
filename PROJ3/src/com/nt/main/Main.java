package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.res.SpringConfigFile;
import com.nt.sbeans.Student;


public class Main {
public static void main(String[]args) {
	@SuppressWarnings("resource")
	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
//	Student std=(Student)context.getBean("stdId");
//	   std.display();
	Student std1=(Student)context.getBean("stdObj1");
	std1.display();
	Student std2=(Student)context.getBean("stdObj2");
	std2.display();

}
}
