package test;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Testing {

    public static void main(String[] args) {

        A a1 = new A();
        a1.setField("sudheer");
        Optional<A> a = Optional.of(a1);
        Optional<A> b = Optional.empty();

       Optional<String> s = b.map(A::getField);
        System.out.println(s);
        System.out.println(A.class.getName().equals(com.practice.array.A.class.getName()));
        System.out.println(com.practice.array.A.class.getSimpleName());
      // String s= b.ifPresent(g -> g.getField());

       // Optional<String> o= Optional.ofNullable();

       // System.out.println(s);
    }
}
