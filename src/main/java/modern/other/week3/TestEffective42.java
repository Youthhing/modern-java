package modern.other.week3;

import java.util.ArrayList;
import java.util.List;

import static modern.other.week3.Operation.PLUS;

public class TestEffective42 {

    public static void main(String[] args) {
        int x = 10; int y= 20;
        List<Double> list = new ArrayList<>();
        list.add(PLUS.apply(x,y));
    }
}
