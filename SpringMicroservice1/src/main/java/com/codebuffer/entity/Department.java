package com.codebuffer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Department {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long depId;
	private String depName;
	private String depAddress;
	private String depCode;
	
	
	
	
	public Department(long depId, String depName, String depAddress, String depCode) {
		this.depId = depId;
		this.depName = depName;
		this.depAddress = depAddress;
		this.depCode = depCode;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getDepId() {
		return depId;
	}


	public void setDepId(long depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepAddress() {
		return depAddress;
	}

	public void setDepAddress(String depAddress) {
		this.depAddress = depAddress;
	}

	public String getDepCode() {
		return depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", depAddress=" + depAddress + ", depCode="
				+ depCode + "]";
	}
	
	
}
