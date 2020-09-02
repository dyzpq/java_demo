package example.decorator;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 14:59
 */
public class TshirtsImpl extends Finery {

    @Override
    public void show(){
        super.show();
        System.out.print("大T恤 ");
    }
}
