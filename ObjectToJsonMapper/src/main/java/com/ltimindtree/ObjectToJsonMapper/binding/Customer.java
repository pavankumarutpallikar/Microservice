package com.ltimindtree.ObjectToJsonMapper.binding;

public class Customer {

	private Integer customerId;

	private String customerName;

	private String customerEmailId;

	private String customerAddress;

	private String gender;

	public Customer() {

	}

	public Customer(Integer customerId, String customerName, String customerEmailId, String customerAddress,
			String gender) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmailId = customerEmailId;
		this.customerAddress = customerAddress;
		this.gender = gender;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailId() {
		return customerEmailId;
	}

	public void setCustomerEmailId(String customerEmailId) {
		this.customerEmailId = customerEmailId;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmailId="
				+ customerEmailId + ", customerAddress=" + customerAddress + ", gender=" + gender + "]";
	}

}
