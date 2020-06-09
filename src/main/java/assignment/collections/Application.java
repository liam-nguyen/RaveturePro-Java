package assignment.collections;

import java.util.List;

public class Application {
    public static  void main(String[] args) {
        List<Account> accounts = Account.createAccount(5);
        for (Account a : accounts) {
            System.out.println(a);
        }
    }
}
