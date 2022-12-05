package week12.day1;

public class Heap {
    public int getParentIdx(int index) {
        return index/2;
    }
    public int getLeftChildIdx(int index) {
        return index*2;
    }
    public int getRightChildIdx(int index) {
        return index*2+1;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{6,5,7,8};

    }
}
