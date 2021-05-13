package workFiles;

public class NewAccount {
    private String id;
    private long balance;
    <T> NewAccount(T id, long balance)
    {
        this.balance = balance;
        this.id = id.toString();
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }
}
