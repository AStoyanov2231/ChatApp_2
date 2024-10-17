package group.ChatApp2.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogToConsole implements Logger {
    @Bean
    public String log(){
        return "console";
    }
}
