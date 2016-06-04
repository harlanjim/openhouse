package com.fah.openhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.fah.openhouse.entity.HouseGroup;
import com.fah.openhouse.repository.GroupRepository;

@SpringBootApplication
public class OpenhouseApplication {

	private static final Logger log = LoggerFactory.getLogger(OpenhouseApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(OpenhouseApplication.class);
	}

	/*
	@Bean
	public CommandLineRunner demo(GroupRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new HouseGroup("1st Floor", "First Floor"));
			repository.save(new HouseGroup("2nd Floor", "Second Floor"));
			repository.save(new HouseGroup("Basement", "Basement"));
			repository.save(new HouseGroup("Garage", "Garage"));
			repository.save(new HouseGroup("House", "House"));
	
			// fetch all groups
			log.info("Groups found with findAll():");
			log.info("-------------------------------");
			for (HouseGroup group : repository.findAll()) {
				log.info(group.toString());
			}
	        log.info("");
	
			// fetch an individual group by ID
			HouseGroup group = repository.findOne(1L);
			log.info("Group found with findOne(1L):");
			log.info("--------------------------------");
			log.info(group.toString());
	        log.info("");
	
			// fetch group by last name
			log.info("Group found with findByName('Basement'):");
			log.info("--------------------------------------------");
			for (HouseGroup basement : repository.findByName("Basement")) {
				log.info(basement.toString());
			}
	        log.info("");
		};
	}
	*/
}
