package com.mfe.m;

import entities.Chambre;
import entities.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import services.ServiceChambre;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories
public class MApplication {


	@Autowired
	private static ChambreRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(MApplication.class, args);

		ServiceChambre service = new ServiceChambre(repo);

		List<Chambre> liste = repo.findAll();


		System.out.println("hello");

	}


}
