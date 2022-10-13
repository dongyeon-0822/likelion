package readParser.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergencyRoom;
    private String name;
    private String subDivision;

    public Hospital(String id) {
        this.id = id;
    }

    public Hospital(String id, String address, String category, int emergencyRoom,
                    String name, String subDivision){
        this.id = id;
        this.address = address;
        this.category = category;
        this.name = name;
        this.emergencyRoom = emergencyRoom;
        this.subDivision = subDivision;
    }

    public String getId() {
        return id;
    }
}