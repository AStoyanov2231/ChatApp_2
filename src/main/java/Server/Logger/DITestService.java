package Server.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DITestService {

    private ILogger logger;
    @Autowired
    private ITestService testService;

    public DITestService(ILogger logger){
        this.logger = logger;
    }

    public void order(){
        System.out.println("The application will log to");
        logger.log("neshto");
        testService.Test();
    }
}
