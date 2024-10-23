package Server;

import Server.Logger.DITestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
