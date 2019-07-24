package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


    public boolean isAllowed(Visitor visitor) {
        Boolean
        return (visitor.getAge() >= 18);
    }

    @Override
    public int getRating() {
        return 0;
    }

    @Override
    public boolean isAllowedto(Visitor visitor) {
        return false;
    }
}


