package com.animal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Animal {
	@Id
	private int id;
	private String Name;
	private String Species;

}
