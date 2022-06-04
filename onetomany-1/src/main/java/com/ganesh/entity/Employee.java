package com.ganesh.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_add_id", referencedColumnName = "id")
	private List<Address> address;
}
