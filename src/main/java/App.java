import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat secondCatBean = (Cat) applicationContext.getBean("cat");
        boolean comparison = bean == secondBean;
        boolean secondComparison = catBean == secondCatBean;
        System.out.println(comparison);
        System.out.println(secondComparison);
    }
}