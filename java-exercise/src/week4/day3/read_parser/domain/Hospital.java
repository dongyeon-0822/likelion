package week4.day3.read_parser.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private Integer emergencyRoom; // snake camel
    private String name; // snake camel
    private String subdivision; // snake camel

    public Hospital(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}