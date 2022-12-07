package model.customer;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import control.WorkingDay;
import modelAtractions.FairGround;
import modelAtractions.Performance;
import modelAtractions.RollerCoaster;
import modelAtractions.Show;
import utils.Comment;
import utils.ObjectMother;

class BiasCustomerTest {
	private ArrayList<FairGround> fairgrounds;
	private WorkingDay workingDay;
	
	@BeforeEach
	void before() throws Exception {
		fairgrounds=new ArrayList<>();
		fairgrounds.add(new Performance());
		fairgrounds.add(new Show());
		fairgrounds.add(new RollerCoaster());
		workingDay=new WorkingDay();
	}

	@Test
	void testTakeRide() {
		BiasCustomer customer=new BiasCustomer(20,this.workingDay);
		CustomerCard takeRide = customer.takeRide();
		Comment.talk(takeRide.getRate());
		if(takeRide.getRate()<ObjectMother.minimunEnjoyment) {
			Comment.talk(customer.getCurrentValue());
		}
	}


}
