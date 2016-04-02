package com.twair;

import org.junit.Before;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by psi on 4/2/2016.
 */
public class FlightCostTest {
    private Flight flight;
    private Double totalCost;
    private Integer totalPassengers;

    @Before
    public void setUp() throws Exception {
        List<TravelClass> travelClasses = new ArrayList<>();
        travelClasses.add(new TravelClass(ClassType.ECONOMY, 30, 6000.0,0.0));
        flight = new Flight("F001", "TestSource", "TestDestination", new Plane("type1", 30), new GregorianCalendar(2016,3,10, 9, 10, 0), new GregorianCalendar(2016,3,10, 11, 10, 0), travelClasses);

    }

}
