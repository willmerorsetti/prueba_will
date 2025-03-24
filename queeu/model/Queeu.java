package com.aleal.queeu.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Queeu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="queeu_id")
	private long roomId;
	
	@Column(name="hotel_id")
	private long hotelId;
	
	@Column(name="queeu_name")
	private String roomName;
	
	@Column(name="queeu_available")
	private String roomAvailable;

}




