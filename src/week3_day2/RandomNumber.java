package week3_day2;

public class RandomNumber implements NumberCreator{
    @Override
    public int getRandomNumber() {
        return (int)((Math.random()*10) % 10);
    }
}
