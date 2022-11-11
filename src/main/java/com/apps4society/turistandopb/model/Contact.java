package com.apps4society.turistandopb.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Contact{

	@Column(nullable = false)
    private String info;
  
}
