package workFiles;

public class Account <I, B> {
    private B balance;
    private I id;
   public Account(I id , B balance)
   {
       this.id = id;
       this.balance = balance;
   }

    public void setId(I id) {
        this.id = id;
    }

    public void setBalance(B balance) {
        this.balance = balance;
    }

    public B getBalance() {
        return balance;
    }

    public I getId() {
        return id;
    }

}
