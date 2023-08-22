package modern.other.week2;

import java.util.Iterator;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("나얼");
        treeSet.add("김얼");
        treeSet.add("이얼");
        treeSet.add("짱얼");
        treeSet.add("a");
        treeSet.add("cc");
        treeSet.add("10");
        treeSet.add("15");

        Iterator<String> iterator = treeSet.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
