package com.sk.amabono.review.domain.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.sk.amabono.review.domain.model.Review;
import com.sk.amabono.review.domain.repository.ReviewRepository;

public class ReviewLogic {

	
	  @Autowired private ReviewRepository reviewRepository;
	  
	  public void add(long Reivew_id) {
	  
	  Review review = reviewRepository.findOne(Reivew_id);
	  
	  if(review == null) { System.err.println("no review"); return; }
	  
	  System.out.println("review: " + review.toString());
	  
	  if(review.getBono_id() == null) { System.err.println("no Bono"); return; }
	  
	  if(review.getMember_id() == null) { System.err.println("no Memeber"); return;
	  }
	  
	  
	  
	  reviewRepository.save(review); }
	 
}
