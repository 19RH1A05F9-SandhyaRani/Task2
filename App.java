package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.Scanner;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/cfg.xml");
    	JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
    	
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter 1.Insert 2.Delete 3.Update 4.Exit");
    	while(true) {
    	int ch = sc.nextInt();
    	switch(ch) {
    	case 1 :
    		String q1 = "insert into student(id,name,city) value(?,?,?)";
    		template.update(q1, 104,"sravanthi","kurnool");
    		System.out.println("Query executed");
    		break;
 
    	case 2 :
    		String q2 = "delete from student where id=?";
    		template.update(q2,102);
    		System.out.println("Query executed");
    		break;
    	
    	case 3 :
    		String q3 = "update student set city=? where id=?";
    		template.update(q3,"Kadapa",102);
    		System.out.println("Query executed");
    		break;
    		
    	case 4 : 
    		sc.close();
    		java.lang.System.exit(0);
    		break;
    	}
    }
    	
}
}
