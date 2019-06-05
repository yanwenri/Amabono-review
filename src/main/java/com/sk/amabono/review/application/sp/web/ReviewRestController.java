package com.sk.amabono.review.application.sp.web;

import java.text.ParseException;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sk.amabono.review.domain.model.LevelType;
import com.sk.amabono.review.domain.model.Review;
import com.sk.amabono.review.domain.repository.ReviewRepository;

@Controller
public class ReviewRestController {

	
	@Autowired
	private ReviewRepository reviewRepository;
	
	
	@RequestMapping("/ReviewReg")
	public String ReviewReg() { 
		return "ReviewReg"; 
	}
	
	
	@RequestMapping(value="/ReviewReg", method=RequestMethod.POST)
	public void PostBono(HttpServletRequest request, HttpServletResponse response) throws ParseException{
			

			
    String uniqueKey = UUID.randomUUID().toString();	
    String Desc = request.getParameter("desc");
   
    String graded = request.getParameter("grade");

    LevelType grade = LevelType.valueOf(graded);
  
    
    
    //멤버객체에 회원정보를 저장한다.
    Review review=new Review(); 

    review.setDesc(Desc);
    review.setGrade(grade);
    review.setReview_id(uniqueKey);
    
    reviewRepository.save(review);

	}
	
	
	
	
	
	
}
