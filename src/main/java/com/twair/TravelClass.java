package com.twair;

public class TravelClass {
    private ClassType classType;
    private Integer totalSeats;
    private Integer occupiedSeats;
    private Double basePrice;
    private Double addonPrice;
    private Double totalPrice;

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public Double getAddonPrice() {
        return addonPrice;
    }

 /*   public void setAddonPrice(Double addonPrice) {
        this.addonPrice = addonPrice;
    }*/

    public Double getBasePrice() {
        return basePrice;
    }
    public Double getTotalPrice() {
        return totalPrice;
    }

/*    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }*/

    public TravelClass(ClassType classType, Integer totalSeats, Double basePrice, Double addonPrice) {
        this.classType = classType;
        this.totalSeats = totalSeats;
        this.occupiedSeats = 0;
        this.basePrice = basePrice;
        this.addonPrice = addonPrice;
        this.totalPrice = this.basePrice +this.addonPrice;
    }

    public void book(int numberOfSeats) throws Exception {
        if(canBook(numberOfSeats) == false) {
            throw new Exception("Booking can not be made");
        }
        occupiedSeats += numberOfSeats;
    }

    public boolean canBook(Integer numberOfSetas) {
        if(occupiedSeats + numberOfSetas > totalSeats) {
            return false;
        }
        return true;
    }

    public ClassType getClassType() {
        return classType;
    }
}
