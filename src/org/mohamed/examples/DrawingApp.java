package org.mohamed.examples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by dba on 10/13/15.
 */
public class DrawingApp {

    public static void main(String[] args) {
//        Triangle triangle = new Triangle();
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring-config.xml"));
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Triangle triangle = (Triangle) context.getBean("triangle") ;
        triangle.draw();
    }
}
