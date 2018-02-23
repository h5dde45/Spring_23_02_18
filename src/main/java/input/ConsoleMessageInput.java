package input;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleMessageInput implements MessageInput {

    public String getInputMessage() {
        System.out.println("Enter message:");
        return new Scanner(System.in).nextLine();
    }
}
