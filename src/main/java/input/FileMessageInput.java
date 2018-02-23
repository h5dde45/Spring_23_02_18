package input;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class FileMessageInput implements MessageInput {
    public String getInputMessage() {
        String message = "";
        try {
            message=new String(Files.readAllBytes
                    (Paths.get(ClassLoader.getSystemResource("inputMessage.txt").toURI())));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return message;
    }
}
