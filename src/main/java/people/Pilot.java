package people;

public class Pilot extends CabinCrewMember{
    private int licenseNum;
    public Pilot(String name, CrewRank crewRank, int licenseNum) {
        super(name, crewRank);
        this.licenseNum = licenseNum;
    }

    public int getLicenseNum() {
        return licenseNum;
    }

    public String flyPlane() {
        return "Ready for take-off";
    }
}
