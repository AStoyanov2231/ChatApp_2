package Server.Logger;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ServiceA implements ITestService {
    @Override
    public void Test() {
        System.out.println("hello Service A");

    }
}
