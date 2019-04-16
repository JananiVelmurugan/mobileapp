package com.cg.mpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="purchasedetails")
public class PurchaseDetails {
	
	@Id
	@Column(name="PURCHASEID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq",sequenceName="seq_purchase_id",
				allocationSize=1)
	private Integer purchaseId;
	
	@NotEmpty(message="Name is mandatory")
	@Pattern(regexp="[A-Z][a-zA-z]{3,15}",message="Name should contain letters only <br/> size should be min 4 and max 15")
	@Column(name="CNAME")
	private String custName;
	
	@Column(name="PHONENO")
	@NotEmpty(message="Phone no is required")
	@Pattern(regexp="[0-9]{10}",message="Phone no should contains 10 digits")
	private String phoneNo;
	
	@Column(name="mailid")
	@Email(message="Enter a valid mail id")
	private String emailId;
	
	@Column(name="purchaseDate")
	@Pattern(regexp="[0-9]{2}-[A-Za-z]{3}-[0-9]{4}",message="Date must be in DD-Mon-yyyy format")
	private String purchaseDate;

	@Column(name="mobileid")
	private Integer mobileid;
	
	public PurchaseDetails() {
		// TODO Auto-generated constructor stub
	}

	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Integer getMobileid() {
		return mobileid;
	}

	public void setMobileid(Integer mobileid) {
		this.mobileid = mobileid;
	}

	@Override
	public String toString() {
		return "PurchaseDetails [purchaseId=" + purchaseId + ", custName=" + custName + ", phoneNo=" + phoneNo
				+ ", emailId=" + emailId + ", purchaseDate=" + purchaseDate + ", mobileid=" + mobileid + "]";
	}
}
