package com.pluralsight.customerservice;

public class CustomerDTO {

    private String contactId;
    private ContactDetails	contactDetails;
    private VehicleDetails vehicleDetails;
    private Employee Employee;
    
	public CustomerDTO() {
		//super();
	}

	public CustomerDTO(String contactId, ContactDetails contactDetails, VehicleDetails vehicleDetails,
			com.pluralsight.customerservice.Employee employee) {
		super();
		this.contactId = contactId;
		this.contactDetails = contactDetails;
		this.vehicleDetails = vehicleDetails;
		Employee = employee;
	}

	public String getContactId() {
		return contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public VehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public Employee getEmployee() {
		return Employee;
	}

	public void setEmployee(Employee employee) {
		Employee = employee;
	}

	@Override
	public String toString() {
		return "CustomerDTO [contactId=" + contactId + ", contactDetails=" + contactDetails + ", vehicleDetails="
				+ vehicleDetails + ", Employee=" + Employee + ", getContactId()=" + getContactId()
				+ ", getContactDetails()=" + getContactDetails() + ", getVehicleDetails()=" + getVehicleDetails()
				+ ", getEmployee()=" + getEmployee() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Employee == null) ? 0 : Employee.hashCode());
		result = prime * result + ((contactDetails == null) ? 0 : contactDetails.hashCode());
		result = prime * result + ((contactId == null) ? 0 : contactId.hashCode());
		result = prime * result + ((vehicleDetails == null) ? 0 : vehicleDetails.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDTO other = (CustomerDTO) obj;
		if (Employee == null) {
			if (other.Employee != null)
				return false;
		} else if (!Employee.equals(other.Employee))
			return false;
		if (contactDetails == null) {
			if (other.contactDetails != null)
				return false;
		} else if (!contactDetails.equals(other.contactDetails))
			return false;
		if (contactId == null) {
			if (other.contactId != null)
				return false;
		} else if (!contactId.equals(other.contactId))
			return false;
		if (vehicleDetails == null) {
			if (other.vehicleDetails != null)
				return false;
		} else if (!vehicleDetails.equals(other.vehicleDetails))
			return false;
		return true;
	}
    	
}
