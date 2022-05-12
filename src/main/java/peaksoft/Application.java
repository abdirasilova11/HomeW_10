package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person=context.getBean("myPerson",Person.class);
        System.out.println(person);
        person.CallMethods();
        context.close();
    }
}
