package com.nt.res;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nt.sbeans.Student;
@Configuration
public class SpringConfigFile {
@Bean("stdObj1")
 public Student CreateStdBeanObj1() {
	 Student std1=new Student();
	 std1.setName("sanika");
	 std1.setRollno(123);
	 std1.setEmailid("sanika@123");
	 return std1;
 }
@Bean("stdObj2")
public Student CreateStdBeanObj2() {
	 Student std2=new Student();
	 std2.setName("adii");
	 std2.setRollno(321);
	 std2.setEmailid("adii@123");
	 return std2;
}
}
