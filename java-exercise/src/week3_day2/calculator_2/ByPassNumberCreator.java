package week3_day2.calculator_2;

public class ByPassNumberCreator implements NumberCreator{
    @Override
    public int create(int num) {
        return num;
    }
}
