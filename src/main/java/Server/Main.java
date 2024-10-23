package Server;

import Server.Logger.DITestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = "Server.*")
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("Server.*");

//		System.out.println("log to CONSOLE or log to FILE?");
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
		DITestService.createLog();
	}
}
