package control;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import model.customer.BiasCustomer;
import model.customer.CustomerCard;
import model.customer.CustomerResponse;
import model.park.Park;
import modelAtractions.FairGround;

public class WorkingDay implements Runnable{

	private Park park;
	private ArrayList<BiasCustomer> currentCustomers=new ArrayList<>();
	private int happyCustomers;
	private int totalCustomers=100;
	private int currentRides=0;
	private int maximumRides=100000;
	
	
	public WorkingDay() {
		super();
		this.park = new Park();
	}

	public List<FairGround> getFairGrounds() {
		return park.getFairGrounds();
	}

	@Override
	public void run() {
		
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
		do {
			int size = currentCustomers.size();
			for (int i = 0; i < totalCustomers-size; i++) {
				currentCustomers.add(new BiasCustomer(20, this));
			}
			for (BiasCustomer biasCustomer : currentCustomers) {
				Future<CustomerResponse> submit = newCachedThreadPool.submit(biasCustomer);
				try {
					CustomerResponse customerResponse = submit.get();
					if(customerResponse.getCurrentEnjoyment().getCurrentValue()>=5) {
						happyCustomers++;
					}
					currentRides+=customerResponse.getActualRides();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}
		}while(!endOfTheDay());
		
	}

	private boolean endOfTheDay() {
		// TODO Auto-generated method stub
		return false;
	}

	//Adapter
	public void evaluate(CustomerCard takeRide) {
		park.changeRideRate(takeRide.getFairGround(),takeRide.getRate());
	}

	public FairGround randomFairGround() {
		return park.getRandomFairGround();
	}
	
	
}
