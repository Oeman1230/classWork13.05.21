package workFiles;

public interface Accountable<T> {

    T getId();


    String getName();

    void setName(String name);

    Long getBalance();

    void setBalance(Long balance);

}
