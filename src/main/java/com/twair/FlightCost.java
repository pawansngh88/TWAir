package com.twair;

/**
 * Created by psi on 4/2/2016.
 */
public class FlightCost {
    private Flight flight;
    private Double totalCost;


    public FlightCost(Flight flight, Double totalCost) {
        this.flight = flight;
        this.totalCost = totalCost;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }
}
