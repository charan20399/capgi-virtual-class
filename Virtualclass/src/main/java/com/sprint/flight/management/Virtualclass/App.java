package com.sprint.flight.management.Virtualclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context=new AnnotationConfigApplicationContext(TrainerConfig.class);
        
        TraineeInfo trainee=(TraineeInfo) context.getBean("trainee");
        trainee.display();
    }
}
