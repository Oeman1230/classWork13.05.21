package workFiles;

public class Account implements Accountable<String> {
    private String name;
    private Long balance;
    private String id;
   public Account(String id ,String name, Long balance)
   {
       this.id = id;
       this.name = name;
       this.balance = balance;
   }


    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
       this.name = name;
    }

    @Override
    public Long getBalance() {
        return balance;
    }

    @Override
    public void setBalance(Long balance) {
       this.balance = balance;
    }
}
