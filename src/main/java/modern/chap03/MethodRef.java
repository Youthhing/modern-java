package modern.chap03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodRef {
    public static void main(String[] args) {
//        Map<Integer,Apple> map= new HashMap<>();
        List<Integer> weights = Arrays.asList(7,3,4,10);
        List<Apple> apples = map(weights,Apple::new);

        System.out.println(apples);
    }
    static List<Apple> map(List<Integer> list, Function<Integer,Apple> f){
        List<Apple> result = new ArrayList<>();
        for(Integer i : list){
            result.add(f.apply(i));
        }
        return result;
    }
}
