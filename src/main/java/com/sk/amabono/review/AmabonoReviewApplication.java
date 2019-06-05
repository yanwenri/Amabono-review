package com.sk.amabono.review;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sk.amabono.review.domain.model.Review;
import com.sk.amabono.review.domain.repository.ReviewRepository;
import com.sk.amabono.review.domain.service.ReviewService;

@SpringBootApplication
public class AmabonoReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmabonoReviewApplication.class, args);
	}

}
