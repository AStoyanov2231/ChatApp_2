package group.ChatApp2.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@Primary
public class LogToFile implements Logger {
    @Bean
    public String log(){
        return "file";
    }
}
