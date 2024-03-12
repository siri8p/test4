package com.example.Project2;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    {
    	ApplicationContext factory = new  AnnotationConfigApplicationContext(AppConfig.class);
    	Samsung s =  factory.getBean(Samsung.class);
    	s.config();
   
}
}