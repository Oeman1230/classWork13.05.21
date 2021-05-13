package workFiles;

public class Transaction< T extends NewAccount2> {
    private T from;
    private T to;
    private int sum;
    public Transaction (T from, T to, int sum)
    {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute()
    {
        if(from.getBalance() > sum)
        {

            from.setBalance(from.getBalance() - sum);
            to.setBalance(to.getBalance() + sum);
            System.out.println("from:"+ from.getId() +
                    " to:" + to.getId() +
                    " sum:" + sum);
        }
        else
        {
            System.out.println("Invalid operation");
        }
    }
}
