public class TrainTravelCost implements TravelCost{

   private double duration, trainFare;
   private String destination = null;

    public TrainTravelCost(double duration, double trainFare, String dest){
        this.duration = duration;
        this.trainFare = trainFare;
        this.destination = dest;
    }

    @Override
    public double getDuration() {
        return duration;
    }

    @Override
    public double getTotalCost() {
        return trainFare + AGENT_FEE;
    }

    @Override
    public double getLodgingCost() {
        return 0.0;
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public String toString(){
        String output = "Train travel to " + getDestination() + " will take " +
                getDuration() + " and cost $" + String.format("%.2f",getTotalCost());
        return  output;
    }
}
