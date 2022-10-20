package week3.day2.dependency_injection;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num){
        return (int)(Math.random() * num);
    }
}
