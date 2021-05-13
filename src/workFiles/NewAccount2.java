package workFiles;

public class NewAccount2 {
    private String id;
    private int balance;

    public NewAccount2(String id, int balance)
    {
        this.id = id;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
