import config.AppConfig;
import input.ConsoleMessageInput;
import input.DefaultMessage;
import input.MessageInput;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("application-context.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        MessageInput consoleM=  context.getBean(ConsoleMessageInput.class);
        MessageInput fileM= (MessageInput) context.getBean("fileMessageInput");
        MessageInput defaultM= context.getBean(DefaultMessage.class);



        System.out.println(consoleM.getInputMessage());
        System.out.println(fileM.getInputMessage());
        System.out.println(defaultM.getInputMessage());

    }
}
