package model.customer;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import control.WorkingDay;
import modelAtractions.FairGround;
import modelAtractions.Performance;

class BiasCustomerTest {
	private ArrayList<FairGround> fairgrounds;
	private WorkingDay workingDay;
	BiasCustomer customer;
	int maxRides = 20;
	float min = 5f, max = 10;

	@BeforeEach
	void before() throws Exception {
		fairgrounds = new ArrayList<>();
		fairgrounds.add(new Performance());
//		fairgrounds.add(new Show());
//		fairgrounds.add(new RollerCoaster());
		workingDay = new WorkingDay();
	}

	@Test
	void testTakeRide() throws Exception {
		for (int i = 0; i < 1000; i++) {
			customer = new BiasCustomer(maxRides, this.workingDay);
			float currentValueOfEnjoyment = customer.call().getCurrentEnjoyment().getCurrentValue();
			System.out.println(currentValueOfEnjoyment);
			if (currentValueOfEnjoyment < min) {
				System.out.println("viajes " + customer.getActualRides());
				assertTrue(customer.getActualRides() <= maxRides);
			} else {
				assertTrue(currentValueOfEnjoyment >= min);
				assertTrue(currentValueOfEnjoyment <= max);
				System.out.println("divertido " + customer.getActualRides());
				assertTrue(customer.getActualRides() == maxRides);
			}
//		assertEquals("delta",5, currentValueOfEnjoyment,3);
		}
	}

	@Test
	void test() throws InterruptedException, ExecutionException {
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		for (int i = 0; i < 1000; i++) {
			customer = new BiasCustomer(maxRides, this.workingDay);
			Future<CustomerResponse> submit = newCachedThreadPool.submit(customer);
			float currentValueOfEnjoyment = submit.get().getCurrentEnjoyment().getCurrentValue();
			if (currentValueOfEnjoyment < min) {
				System.out.println("viajes " + customer.getActualRides());
				assertTrue(customer.getActualRides() <= maxRides);
			} else {
				assertTrue(currentValueOfEnjoyment >= min);
				assertTrue(currentValueOfEnjoyment <= max);
				System.out.println("divertido " + customer.getActualRides());
				assertTrue(customer.getActualRides() == maxRides);
			}
		}
	}
}
