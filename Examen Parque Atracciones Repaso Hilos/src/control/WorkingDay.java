package control;

import java.util.ArrayList;
import java.util.List;

import model.customer.BiasCustomer;
import model.customer.CustomerCard;
import model.park.Park;
import modelAtractions.FairGround;

public class WorkingDay implements Runnable{

	private Park park;
	private ArrayList<BiasCustomer> currentCustomers=new ArrayList<>();
	private int happyCustomers;
	private int totalCustomers;
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
		do {
			//tengo que mirar si hay suficentes clientes y crearlos
			//hay que arrancar los hilos
			//controlar llegar al maximo de visitas
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
