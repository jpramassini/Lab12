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


}
