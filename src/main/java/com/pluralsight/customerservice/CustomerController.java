package com.pluralsight.customerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class CustomerController {
	
	@Autowired
	private WebClient wc;

    @RequestMapping(value="/customer/{cid}", method=RequestMethod.GET)
	public CustomerDTO getCustomer(@PathVariable String cid) {

        CustomerDTO customer = new CustomerDTO();
        //WebClient client = WebClient.create();

        ContactDetails _contactDetails = wc.get()
		            .uri("http://localhost:8081/customer/" + cid + "/contactdetails")
		            .retrieve()
		            .bodyToMono(ContactDetails.class)
		            .block();

        VehicleDetails _vehicleDetails = wc.get()
			        .uri("http://localhost:8082/customer/" + cid + "/vehicledetails")
			        .retrieve()
			        .bodyToMono(VehicleDetails.class)
			        .block();
        
        
        Employee _empDetails = wc.get()
        			.uri("http://localhost:8083/employee/" + cid + "/employeedetails")
        			.retrieve()
        			.bodyToMono(Employee.class)
        			.block();
        		
        System.out.println("_contactDetails"+_contactDetails);		
        System.out.println("_vehicleDetails"+_vehicleDetails);		
        System.out.println("_empDetails"+_empDetails);		

        customer.setContactId(cid);
        customer.setContactDetails(_contactDetails);
        customer.setVehicleDetails(_vehicleDetails);
        customer.setEmployee(_empDetails);

        return customer;

    }
    
}
