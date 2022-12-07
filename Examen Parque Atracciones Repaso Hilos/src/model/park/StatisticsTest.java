package model.park;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelAtractions.FairGround;
import modelAtractions.Performance;
import modelAtractions.PerformanceProductor;
import modelAtractions.SuperFairGround;

class StatisticsTest {
	Statistics statistic;
	Park park;
	List<FairGround> fairgrounds;

	@BeforeEach
	void before() throws Exception {
		park = new Park();
		park.addFairGround(new PerformanceProductor());
		statistic = new Statistics(park.getFairGrounds());
	}

	@Test
	void testChangeRate() {
		this.fairgrounds=park.getFairGrounds();
		statistic.changeRate(this.fairgrounds.get(0), 10);
		Performance local = new Performance();
		SuperFairGround superF = new SuperFairGround(local);
		assertEquals(this.fairgrounds.get(0).saluda(), superF.saluda());
		statistic.changeRate(this.fairgrounds.get(0), 6);
		assertEquals(this.fairgrounds.get(0).saluda(), superF.saluda());
		statistic.changeRate(this.fairgrounds.get(0), 0);
		assertEquals(this.fairgrounds.get(0).saluda(), superF.saluda());
		statistic.changeRate(this.fairgrounds.get(0), 0);
		assertEquals(this.fairgrounds.get(0).saluda(), superF.saluda());
		statistic.changeRate(this.fairgrounds.get(0), 0);
		assertEquals(this.fairgrounds.get(0).saluda(), local.saluda());
		statistic.changeRate(this.fairgrounds.get(0), 10);
		assertEquals(this.fairgrounds.get(0).saluda(), local.saluda());
		statistic.changeRate(this.fairgrounds.get(0), 10);
		assertEquals(this.fairgrounds.get(0).saluda(), local.saluda());
		statistic.changeRate(this.fairgrounds.get(0), 10);
		assertEquals(this.fairgrounds.get(0).saluda(), local.saluda());
		statistic.changeRate(this.fairgrounds.get(0), 10);
		assertEquals(this.fairgrounds.get(0).saluda(), local.saluda());
		statistic.changeRate(this.fairgrounds.get(0), 10);
		assertEquals(this.fairgrounds.get(0).saluda(), local.saluda());
		statistic.changeRate(this.fairgrounds.get(0), 10);
		assertEquals(this.fairgrounds.get(0).saluda(), local.saluda());
		statistic.changeRate(this.fairgrounds.get(0), 10);
		assertEquals(this.fairgrounds.get(0).saluda(), superF.saluda());
	}

}
