package com.easyshop.app.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5393197951017694137L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "titleName", nullable = false)
	private String title;
	@Column(name = "authorName", nullable = false)
	private String author;
	@Column(name = "priceOfBook", nullable = false)
	private float price;

}
