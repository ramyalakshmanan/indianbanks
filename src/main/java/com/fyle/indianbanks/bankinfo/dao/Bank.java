package com.fyle.indianbanks.bankinfo.dao;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "banks")
public final class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
	@Setter
	public BigInteger id;
	@Getter
	@Setter
	public String name;
	@OneToMany(mappedBy = "bank")
	@Getter
	private Set<Branch> branches = new HashSet<Branch>();
}