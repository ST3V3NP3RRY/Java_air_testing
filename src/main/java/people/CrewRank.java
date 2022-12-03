package people;

public enum CrewRank {
    PILOT("people.Pilot"),
    PURSER("Purser"),
    FLIGHT_ATTENDANT("Flight.Flight Attendant"),
    FIRST_OFFICER("First Officer");

    private final String crewRank;

    public String getCrewRank() {
        return crewRank;
    }

    CrewRank(String crewRank) {
        this.crewRank = crewRank;
    }


}
