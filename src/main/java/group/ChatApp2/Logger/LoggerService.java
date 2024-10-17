package group.ChatApp2.Logger;

import org.springframework.stereotype.Service;

@Service
public class LoggerService {

    private Logger logger;


    LoggerService(Logger logger){
        this.logger = logger;
    }

    public void order(){
        System.out.println("The application will log to");
        System.out.println(logger.log());
    }
}
