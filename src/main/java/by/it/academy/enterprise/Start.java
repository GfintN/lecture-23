package by.it.academy.enterprise;

import by.it.academy.enterprise.components.NumberTransform;
import by.it.academy.enterprise.spring.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {
        public static void main( String[] args )
        {
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
            NumberTransform transformer = context.getBean(NumberTransform.class);
            transformer.setNumber(1L);
            transformer.transform();
            transformer.transform(2L, true);
            context.close();
        }
}
