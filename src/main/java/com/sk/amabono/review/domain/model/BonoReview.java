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
public class BonoReview extends AbstractEntity implements AggregateRoot {
	
	
	private String bono_id;
	
	private String participantsreviews[];

	
	@Enumerated(EnumType.STRING)
	private LevelType bonolevel;
	
	
	public BonoReview() {
		
	}
	
	public BonoReview( String bono_id, LevelType bonolevel , String participantsreviews[] ) {
		this.bono_id=bono_id;
		this.bonolevel=bonolevel;
		this.participantsreviews =participantsreviews;
			
	}
	
}

