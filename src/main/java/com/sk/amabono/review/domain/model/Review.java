package com.sk.amabono.review.domain.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class Review  extends AbstractEntity implements AggregateRoot {
	

	private String review_id;
	private String bono_id;
	private String member_id;
	private String Desc;
	
	
	@Enumerated(EnumType.STRING)
	private LevelType grade;
	
	
	public Review() {
		
	}
	
	public Review( String bono_id, String review_id,String member_id,String Desc,LevelType grade ) {
		
		this.bono_id =bono_id;
	    this.review_id= review_id;
		this.member_id = member_id;
		this.Desc =Desc;
		this.grade=grade;
		
	}
	
}

