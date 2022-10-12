package com.test.machintest;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProductMaster {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	private String productname;

}
