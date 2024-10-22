package group.ChatApp2;

import group.ChatApp2.Logger.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

//@SpringBootApplication
//@ComponentScan(basePackages = "group.ChatApp2.*")
public class Main {

	public static void main(String[] args) {
		//SpringApplication.run(Main.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("group.ChatApp2.*");

		System.out.println("log to CONSOLE or log to FILE?");
//		Scanner scanner = new Scanner(System.in);
//
//		String input = scanner.nextLine();
//
//		if (input.equalsIgnoreCase("file")){
//			context.register(DITestService.class);
//		} else if (input.equalsIgnoreCase("console")) {
//			context.register(DITestService.class);
//		}

//		context.refresh();

		DITestService DITestService = context.getBean(DITestService.class);
		DITestService.order();
	}
}
