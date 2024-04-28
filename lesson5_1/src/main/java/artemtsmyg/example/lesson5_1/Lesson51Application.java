package artemtsmyg.example.lesson5_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Lesson51Application {

	public static void main(String[] args) {
		SpringApplication.run(Lesson51Application.class, args);
	}

}
