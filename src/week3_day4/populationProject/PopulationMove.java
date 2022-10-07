package week3_day4.populationProject;

public class PopulationMove {
    private int fromSido;
    private int toSido;

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public PopulationMove parse(String data){
        String[] dataInfo = data.split(",");
        int new_fromSido = Integer.parseInt(dataInfo[0]);
        int new_toSido = Integer.parseInt(dataInfo[6]);
        return new PopulationMove(new_fromSido,new_toSido);
    }
}
