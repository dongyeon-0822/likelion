package week3.day2.calculator_1;

public class RandomNumber implements NumberCreator{
    @Override
    public int getRandomNumber() {
        return (int)((Math.random()*10) % 10);
    }
}
