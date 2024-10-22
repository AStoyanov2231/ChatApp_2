package group.ChatApp2.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogToConsole implements ILogger {

    public void log(String message){
        System.out.println(message);
    }
}
