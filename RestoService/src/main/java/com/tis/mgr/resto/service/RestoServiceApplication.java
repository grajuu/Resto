package com.tis.mgr.resto.service;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tis.mgr.resto.service.entity.Reservation;
import com.tis.mgr.resto.service.repo.ReservationRepo;

@SpringBootApplication
public class RestoServiceApplication {
   
	@Bean
	CommandLineRunner commandLineRunner(ReservationRepo reservationRepo) {
		return strings -> {
			Stream.of("MGR","achilies","remo","Rama","surya").forEach(n -> reservationRepo.save(new Reservation(n)));
			

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(RestoServiceApplication.class, args);
	}
}
