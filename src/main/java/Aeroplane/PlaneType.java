package Aeroplane;

public enum PlaneType {
    BOEING757("BOEING747"),
    AIRBUSA320("AIRBUSA320"),
    COMACARJ21("COMACARJ21"),
    BOEING787("BOEING787"),
    PA31NAVAJO("PA-31-NAVAJO"),
    AIRBUSA330("AIRBUSA330");

    private String planeType;

    PlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getPlaneType() {
        return this.planeType;
    }
}
