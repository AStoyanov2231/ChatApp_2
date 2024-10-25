package Server.Services;

import Server.Model.Services.ILoggerService;
import org.springframework.stereotype.Service;

@Service
public class LoggerService implements ILoggerService {
    @Override
    public void Error(String message) {
        System.out.println("[][ERROR] " + message);
    }

    @Override
    public void Warn(String message) {
        System.out.println("[][WARN] " + message);
    }

    @Override
    public void Info(String message) {
        System.out.println("[][INFO] " + message);
    }

    @Override
    public void Debug(String message) {
        System.out.println("[][DEBUG] " + message);
    }

    @Override
    public void setLogLevel(Integer logLevel) {

    }
}