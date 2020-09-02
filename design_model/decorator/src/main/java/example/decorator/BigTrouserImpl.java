package example.decorator;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 15:02
 */
public class BigTrouserImpl extends Finery {

    @Override
    public void show(){
        super.show();
        System.out.print("垮裤 ");
    }
}
