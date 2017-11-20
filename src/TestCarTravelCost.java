public class TestCarTravelCost {

    public static void main(String [] args){
        CarTravelCost car = null;
        TrainTravelCost train = null;
        if(args.length == 5){
            try{
                car = new CarTravelCost(Integer.parseInt(args[0]),
                        Double.parseDouble(args[1]), args[2]);
                train = new TrainTravelCost(Double.parseDouble(args[3]),
                        Double.parseDouble(args[4]), args[2]);
            }
            catch(Exception e){
                System.out.println("Invalid input type. Input arguments should be " +
                        "(number of miles, hotel cost/night, destination, train duration, train fare).");
            }

            System.out.println(car);

            System.out.println(train);
        }
        else{
            System.out.println("Invalid number of command line arguments (You need 5)");
        }

    }

}
