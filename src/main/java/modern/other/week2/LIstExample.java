package modern.other.week2;

import java.util.Collections;
import java.util.Vector;

public class LIstExample {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        System.out.println(vector.capacity());
        vector.add("가");
        vector.add("다");
        vector.add("나");
        Collections.sort(vector);
        for (String s: vector ) {
            System.out.println(s);
        }
        System.out.println(vector.capacity());
        System.out.println(vector.size());
    }

    static class Person implements Comparable<Person>{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public int compareTo(Person person) {
            if(this.age==person.age){
                return this.name.compareTo(person.name);
            }
            return this.age - person.age;
        }
    }


}
