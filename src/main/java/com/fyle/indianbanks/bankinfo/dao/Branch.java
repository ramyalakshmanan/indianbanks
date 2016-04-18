package com.fyle.indianbanks.bankinfo.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "branches")
public class Branch {
	@Id
	public String ifsc;
	public String branch;
	public String address;
	public String city;
	public String district;
	public String state;

	@ManyToOne
	@JoinColumn(name="bank_id",referencedColumnName="id")
	public Bank bank;
}
