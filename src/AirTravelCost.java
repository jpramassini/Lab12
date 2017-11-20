import java.util.GregorianCalendar;

public class AirTravelCost implements TravelCost{

    private String arrivalDate = null;
    private String arrivalTime = null;
    private String departureDate = null;
    private String departureTime = null;
    private String destination = null;
    private double travelFare, hotelCost;

    public AirTravelCost(String arrivalDate, String arrivalTime, String departureDate, String departureTime,
                         String destination, double travelFare, double hotelCost) {
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.destination = destination;
        this.travelFare = travelFare;
        this.hotelCost = hotelCost;
    }
    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public double getDuration() {
        GregorianCalendar departure = new GregorianCalendar(Integer.parseInt(departureDate.substring(0,4)), Integer.parseInt(departureDate.substring(4,6)),
                Integer.parseInt(departureDate.substring(6,8)), Integer.parseInt(departureTime.substring(0,2)), Integer.parseInt(departureTime.substring(2,4)));
        GregorianCalendar arrival = new GregorianCalendar(Integer.parseInt(arrivalDate.substring(0,4)), Integer.parseInt(arrivalDate.substring(4,6)),
                Integer.parseInt(arrivalDate.substring(6,8)), Integer.parseInt(arrivalTime.substring(0,2)), Integer.parseInt(arrivalTime.substring(2,4)));

        double departureTimeInMillis = departure.getTimeInMillis();
        double arrivalTimeInMillis = arrival.getTimeInMillis();

        return (arrivalTimeInMillis - departureTimeInMillis) / 60;
    }

    @Override
    public double getTotalCost() {
        return getLodgingCost() + travelFare + AGENT_FEE;
    }

    @Override
    public double getLodgingCost() {
        return getDuration()/24 * hotelCost;
    }

    @Override
    public String toString(){
        String output = "Air travel to " + getDestination() + " will take " + getDuration() + " hours and cost $" + String.format("%.2f",getTotalCost());

        return output;
    }
}
