import java.util.ArrayList;

public class TestCarTravelCost {

    public static void main(String [] args){
        CarTravelCost car = null;
        TrainTravelCost train = null;
        AirTravelCost plane = null;
        if(args.length == 10){
            try{
                car = new CarTravelCost(Integer.parseInt(args[0]),
                        Double.parseDouble(args[1]), args[2]);
                train = new TrainTravelCost(Double.parseDouble(args[3]),
                        Double.parseDouble(args[4]), args[2]);
                plane = new AirTravelCost(args[8], args[9], args[6], args[7], args[2],
                        Double.parseDouble(args[5]), Double.parseDouble(args[1]));
            }
            catch(Exception e){
                System.out.println("Invalid input type. Input arguments should be " +
                        "(number of miles, hotel cost/night, destination, train duration, train fare, air fare, " +
                        "departure date, departure time, arrival date, arrival time).");
            }
            ArrayList<TravelCost> travelCompare = new ArrayList<TravelCost>();
            travelCompare.add(car);
            travelCompare.add(train);
            travelCompare.add(plane);

            System.out.println(car);
            System.out.println(train);
            System.out.println(plane);

            double lowestDuration = Double.POSITIVE_INFINITY;
            double lowestCost = Double.POSITIVE_INFINITY;
            int lowestCostIndex = 0;
            int lowestDurationIndex = 0;
            for (TravelCost item : travelCompare){

                if (item.getDuration() < lowestDuration){
                    lowestCost = item.getDuration();
                    lowestDurationIndex = travelCompare.indexOf(item);
                }

                if (item.getTotalCost() < lowestCost){
                    lowestCost = item.getTotalCost();
                    lowestCostIndex = travelCompare.indexOf(item);
                }
            }

            System.out.println("LOWEST COST: " + travelCompare.get(lowestCostIndex));
            System.out.println("SHORTEST DURATION: " + travelCompare.get(lowestDurationIndex));
        }
        else{
            System.out.println("Invalid number of command line arguments (You need 10)");
        }

    }

}
