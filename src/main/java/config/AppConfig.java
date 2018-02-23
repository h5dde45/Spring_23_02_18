package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "input")
public class AppConfig {

//    @Bean(name = "consoleMessageInput")
//    public MessageInput getConsoleM(){
//        return new ConsoleMessageInput();
//    }
//
//    @Bean(name = "fileMessageInput")
//    public MessageInput getFileM(){
//        return new FileMessageInput();
//    }
//
//    @Bean(name = "defaultMessage")
//    public MessageInput getDefaultM(){
//        DefaultMessage defaultMessage = new DefaultMessage();
//        defaultMessage.setDefaultMessage("defaultMessage");
//        return defaultMessage;
//    }

}
