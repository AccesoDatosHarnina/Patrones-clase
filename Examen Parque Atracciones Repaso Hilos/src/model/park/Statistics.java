package model.park;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import modelAtractions.FairGround;
import modelAtractions.Performance;
import modelAtractions.SuperFairGround;

public class Statistics implements Observer {

	private List<FairGround> fairgrounds;
	private Map<FairGround, FairGroundObservable> rateAtractions;

	public Statistics(List<FairGround> fairgrounds) {
		super();
		rateAtractions = new HashMap<FairGround, FairGroundObservable>();
		this.fairgrounds =fairgrounds;
		for (Iterator<FairGround> iterator2 = fairgrounds.iterator(); iterator2.hasNext();) {
			FairGround fairGround = (FairGround) iterator2.next();
			rateAtractions.put(fairGround, new FairGroundObservable(fairGround, this));
		}

	}

	public void changeRate(FairGround fairGround, float rate) {
		FairGroundObservable fairGroundObservable = rateAtractions.get(fairGround);
		fairGroundObservable.incrementOneValoration(rate);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		FairGroundObservable fairObser = (FairGroundObservable) arg0;
		FairGround fg = (FairGround) arg1;
		FairGround otherFairGround;
		if (fairObser.isChangeHigh()) {
			otherFairGround = new SuperFairGround(fg);
		} else {
			otherFairGround = fg.dismantle();
		}
		changeFairGroundMap(fairObser, fg, otherFairGround);
	}

	private void changeFairGroundMap(FairGroundObservable fairObser, FairGround fg, FairGround otherFairGround) {
		int indexOf = fairgrounds.indexOf(fg);
		fairgrounds.set(indexOf, otherFairGround);
		rateAtractions.remove(fg);
		fairObser.setFairGround(otherFairGround);
		rateAtractions.put(otherFairGround, fairObser);
	}

	public float getCurrentAverageRate() {
		float total = 0;
		for (Iterator iterator = fairgrounds.iterator(); iterator.hasNext();) {
			FairGround fairGround = (FairGround) iterator.next();
			total += rateAtractions.get(fairGround).getCurrentValoration();
		}
		return total / fairgrounds.size();
	}

}
