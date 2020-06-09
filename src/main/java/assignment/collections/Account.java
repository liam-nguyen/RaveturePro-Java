package assignment.collections;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private long id;
    private String accountType;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountType='" + accountType + '\'' +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public static List<Account> createAccount(int numAccounts) {
        List<Account> accounts = new ArrayList<>();
        for (int i = 0; i < numAccounts; i++) {
            Account account = new Account();
            account.setId((long) (Math.random() * 100));
            int randomChar = (int) (Math.random() * 26 + 'a');
            account.setAccountType(String.valueOf((char) randomChar));
            accounts.add(account);
        }
        return accounts;
    }
}
