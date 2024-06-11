package com.easyshop.app.beans;

import java.io.Serializable;

import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4771765879673292110L;
	private int id;
	private String title;
	private String author;
	private float price;

}
