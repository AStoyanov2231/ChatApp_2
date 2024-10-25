package Server.Model.Services;

public interface ILoggerService {
    void Error(String message);
    void Warn(String message);
    void Info(String message);
    void Debug(String message);

    void setLogLevel(Integer logLevel);
}
