package group.ChatApp2.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Primary
public class LogToFile implements ILogger {

    public void log(String message){
        System.out.println("this should go to log file: " + message);
    }
}
