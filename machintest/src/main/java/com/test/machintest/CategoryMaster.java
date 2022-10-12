package com.test.machintest;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CategoryMaster {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int categoryid;
	private String categoryname;

}
