package week9.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Stream.of(20, 18, 5, 19, 5, 25, 40, 50)
                .collect(Collectors.toList())) ;
    }

    public List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1)
            return arr;
        int pivot = arr.get(arr.size()/2); //pivot 뽑기

        List<Integer> leftArr = new ArrayList<>();
        List<Integer> equalArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        for (int num : arr) { // arr 순회하며 pivot 기준으로 나누기
            if (num < pivot) leftArr.add(num);
            else if (num > pivot) rightArr.add(num);
            else equalArr.add(num);
        }
        return Stream.of(quickSort(leftArr), equalArr, quickSort(rightArr))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

}
