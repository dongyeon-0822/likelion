package week6.day5;

import java.util.Arrays;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i].length()<= phone_book[i+1].length() && phone_book[i].equals(phone_book[i + 1].substring(0, phone_book[i].length()))) {
                answer = false;
                return answer;
            }
        }
        return answer;
    }
}
