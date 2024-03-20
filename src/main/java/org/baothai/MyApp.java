package org.baothai;
import org.baothai.TodoListApp.Task;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Task newtask = (Task) context.getBean("task");
        System.out.println(newtask);
    }
}