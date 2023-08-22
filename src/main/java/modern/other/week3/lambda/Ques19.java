package modern.other.week3.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ques19 {

    //find Second Largest and Second Smallest
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1,2,3,4,5);

        numberList.sort((x,y)->x.compareTo(y));
        System.out.println(numberList.get(1));// Todo 수정해야겠지?


        Integer secondLarge = numberList.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(secondLarge);
    }
}
