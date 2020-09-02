package example.targer;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 16:05
 */
public abstract class Player {

    protected String name;
    public Player(String name){
        this.name = name;
    }

    public abstract void attack();
    public abstract void defense();
}
