public class CarTravelCost implements TravelCost {
    private int numMiles;
    private double hotelCost;
    private String destination = null;

    public CarTravelCost(int miles, double hotel, String dest) {
        numMiles = miles;
        hotelCost = hotel;
        destination = dest;
    }

    @Override
    public String getDestination() {
        String numHours = String.valueOf((double)numMiles/65);
        return numHours;
    }

    @Override
    public double getLodgingCost() {
        double numDays = this.getDuration()/8.0;
        return numDays * hotelCost;
    }

    @Override
    public double getDuration() {
        double numHours = (double)numMiles/65;
        return numHours;
    }

    @Override
    public double getTotalCost() {
       double cost =  (numMiles * 45) + getLodgingCost() + AGENT_FEE;
       return cost;
    }
    @Override
    public String toString(){
        String output = "Travel to " + destination + " will take " + getDuration()
                + " hours and cost $" + String.format("%,f.2",getTotalCost());
        return output;
    }
}

    
