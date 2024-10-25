package Server.Logger;

import org.springframework.context.annotation.Configuration;

@Configuration
public class LogToConsole implements ILogger {

    public void log(String message){
        System.out.println(message);
    }
}
