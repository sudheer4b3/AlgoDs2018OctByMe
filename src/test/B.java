package test;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class B{

         public static void main(String[] args){
             A a = new A();
             a.setField(null);
             try {
                 String f =(String) new PropertyDescriptor("field", A.class).getReadMethod().invoke(a);


                 System.out.println(f!=null);
             }
             catch (IntrospectionException | IllegalAccessException | InvocationTargetException error ){

                 System.out.println( error);
             }



             List<Description> personList = getDesc();

           //  personList.stream().forEach(p -> System.out.println(p.getValue()));
            // personList.stream().forEach(p -> System.out.println(p.getValue()));

         }

           private static List<Description>    getDesc() {

                List<Description> personList = new ArrayList<>();

                IntStream.range(0, 10).forEach( i -> {
                        personList.add(new Description("Test"+i));
                        }
                );

                return  personList;

            }
    }