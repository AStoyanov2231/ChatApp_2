package Server.Logger;

import org.springframework.stereotype.Component;

@Component
public class ServiceB implements ITestService {
    @Override
    public void Test() {
        System.out.println("hello Service B");

    }
}