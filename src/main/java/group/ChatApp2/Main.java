package group.ChatApp2;

import group.ChatApp2.Logger.LogToConsole;
import group.ChatApp2.Logger.LogToFile;
import group.ChatApp2.Logger.LoggerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		System.out.println("log to CONSOLE or log to FILE?");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		if (input.equals("file")){
			context.register(LoggerService.class, LogToFile.class);
		} else if (input.equals("console")) {
			context.register(LoggerService.class, LogToConsole.class);
		}


		context.refresh();


		LoggerService loggerService = context.getBean(LoggerService.class);
		loggerService.order();




	}

}
