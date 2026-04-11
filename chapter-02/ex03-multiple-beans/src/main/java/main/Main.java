package main;


import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context =
                new AnnotationConfigApplicationContext(
                        ProjectConfig.class);

        //Parrot p = context.getBean(Parrot.class);
        //System.out.println(p.getName());
        //Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException:
        // No qualifying bean of type 'main.Parrot' available: expected single matching bean
        // but found 3: parrot1,parrot2,parrot3

        Parrot p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());


    }
}
