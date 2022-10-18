package readParser.domain;

public class Hospital {
    private String id; //0
    private String address; //1
    private String district; //1 split
    private String category; //2
    private Integer emergencyRoom; //6
    private String name; //10
    private String subDivision; //10 split

    public Hospital(String id) {
        this.id = id;
    }

    public Hospital(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public Hospital(String id, String address, String category, int emergencyRoom,
                    String name, String subDivision){
        this.id = id;
        this.address = address;
        this.category = category;
        this.name = name;
        this.emergencyRoom = emergencyRoom;
        this.subDivision = subDivision;
        this.setDistrict();
    }

    public String getSqlInsertQuery() {
        String sql = String.format("INSERT INTO `likelion-db`.`seoul_hospital`\n" +
                "(`id`,`address`,`district`,`category`,`emergency_room`,`name`,`subdivision`)\n"+
                "VALUES\n" +
                "(\"%s\",\n" +
                "\"%s\",\n" +
                "\"%s\",\n" +
                "\"%s\",\n" +
                "%d,\n" +
                "\"%s\",\n" +
                "\"%s\");", this.id, this.address, this.district, this.category, this.emergencyRoom, this.name, this.subDivision);
        return sql;
    }

    private void setDistrict() {
        String[] splitted = address.split(" ");
        this.district = String.format("%s %s", splitted[0],splitted[1]);
    }

    public String getId() {
        return id;
    }
    public String getAddress(){
        return address;
    }
    public String getDistrict(){
        return district;
    }
    public int getEmergencyRoom() {
        return emergencyRoom;
    }
    public String getCategory() {
        return category;
    }
    public String getName() {
        return name;
    }
    public String getSubdivision() {
        return subDivision;
    }
}