package people;

public class CabinCrewMember extends Person{

    private CrewRank crewRank;

    public CabinCrewMember(String name, CrewRank crewRank) {
        super(name);
        this.crewRank = crewRank;
    }

    public String talk() {
        return "Fasten your seatbelts";
    }

    public CrewRank getRank() {
        return this.crewRank;
    }
}