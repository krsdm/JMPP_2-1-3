package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import app.model.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        long time = applicationContext.getBean(AnimalsCage.class).getTimer().getTime();
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean = applicationContext.getBean(AnimalsCage.class);
            System.out.println(time == bean.getTimer().getTime());
            bean.whatAnimalSay();
        }
    }

}
