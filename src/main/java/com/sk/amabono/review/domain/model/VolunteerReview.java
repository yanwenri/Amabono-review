package com.sk.amabono.review.domain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class VolunteerReview extends AbstractEntity implements AggregateRoot {
	
	
	private String member_id;
	
	
	private String plannerreviews[];
	
	@Enumerated(EnumType.STRING)
	private LevelType volunteerlevel;
	
	
	public VolunteerReview() {
		
	}
	
	public VolunteerReview( String member_id,LevelType volunteerlevel , String plannerreviews[] ) {
		this.member_id=member_id;
		this.volunteerlevel=volunteerlevel;
		this.plannerreviews =plannerreviews;
			
	}
	
}

