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
    /* Account<Integer, Integer> account = new Account<Integer, Integer>(1, 1231243);
     Integer balance = account.getBalance();
     Integer id = account.getId();
     System.out.println(id+ " " + balance);
    }

     */
        NewAccount2 account1 = new NewAccount2("1", 555);
        NewAccount2 account2 = new NewAccount2("2", 333);
        Transaction<NewAccount2> transaction = new Transaction<>(account1, account2, 228);
        transaction.execute();
        Transaction<NewAccount2> transaction2 = new Transaction<>(account2, account1, 331);
        transaction2.execute();
    }
}
