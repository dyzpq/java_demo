package example.originator;

import example.memento.RoleStateMemento;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 17:27
 */
public class GameRole {

    private int vit;
    private int ait;
    private int def;

    public void getInitState(){
        vit = 100;
        ait = 100;
        def = 100;
    }

    public void fight(){
        vit -= 50;
        ait -= 60;
        def -= 70;
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,ait,def);
    }

    public void recoveryState(RoleStateMemento memento){
        this.vit = memento.getVit();
        this.ait = memento.getAit();
        this.def = memento.getDef();
    }

    public void stateDisplay(){
        System.out.println("vit="+vit);
        System.out.println("ait="+ait);
        System.out.println("def="+def);
    }
}
