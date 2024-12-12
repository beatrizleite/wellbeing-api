package pt.ufp.wellbeing;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.mapping.Document;

@SpringBootApplication
public class WellbeingApplication {

	public static void main(String[] args) {
		SpringApplication.run(WellbeingApplication.class, args);
	}

}
