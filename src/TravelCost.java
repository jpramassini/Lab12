public interface TravelCost {

    double AGENT_FEE = 10.00;

    double getDuration();
    double getTotalCost();
    double getLodgingCost();
    String getDestination();
    String toString();
    }
