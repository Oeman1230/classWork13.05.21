package workFiles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        /*Account<Integer> account = new Account<>(1234, "schet1", 123);
        Account<String> account2 = new Account<>("345fgrr44", "schet1", 123);
        int id = account.getId();
        System.out.println(id);
        String id2 = account2.getId();
        System.out.println(id2);
         */
       String[] strings = {"a", "b", "c", "d"};
       Integer[] integers = {1,2,3,4};
       Printer printer = new Printer();
       printer.<String>print(strings);
       printer.<Integer>print(integers);

    }
}
