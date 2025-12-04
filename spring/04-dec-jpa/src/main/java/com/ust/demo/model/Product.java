package com.ust.demo.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Product {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String category;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date mfgDate;
	@Lob
	private String photo;
}
