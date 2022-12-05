package week12.day1;

import java.util.Arrays;

public class Heap {
    private int[] heapedArr;

    public Heap(int[] heapedArr) {
        this.heapedArr = heapedArr;
    }

    public int getParentIdx(int index) {
        return index/2;
    }
    public int getLeftChildIdx(int index) {
        return index*2;
    }
    public int getRightChildIdx(int index) {
        return index*2+1;
    }

    private void makeHeap(int idx) {
        int parentIdx = getParentIdx(idx);
        while (heapedArr[parentIdx] > heapedArr[idx]) {
            int tmp = heapedArr[idx];
            heapedArr[idx] = heapedArr[parentIdx];
            heapedArr[parentIdx] = tmp;
            parentIdx = getParentIdx(idx);
        }
    }
    public void printArray() {
        System.out.println(Arrays.toString(heapedArr));
    }
    public static void main(String[] args) {
        Heap heap = new Heap(new int[]{6, 5, 7, 8});
        heap.makeHeap(1);
        heap.printArray();
    }
}
