package workFiles;

public class Account <T> {
    private T id;
   public Account(T id )
   {
       this.id = id;
   }

    public void setId(T id) {
        this.id = id;
    }


    public T getId() {
        return id;
    }

}
