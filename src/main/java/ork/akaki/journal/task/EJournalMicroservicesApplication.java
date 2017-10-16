package ork.akaki.journal.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class EJournalMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(EJournalMicroservicesApplication.class, args);
	}
	
	@Bean
	public SubscriberRegistrationTask subscriberRegistrationTask() {
		return new SubscriberRegistrationTask();
	}
	
	public class SubscriberRegistrationTask implements CommandLineRunner {
		
		@Override
		public void run(String ... strings) throws Exception {
			if(strings != null) {
				for(String string : strings) {
					System.out.println("Subscriber: " + string);
				}
			}
		}
	}
}
