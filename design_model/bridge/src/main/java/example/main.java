package example;

import example.abstraction.HandsetBrand;
import example.abstraction.HandsetBrandM;
import example.abstraction.HandsetBrandN;
import example.implementor.HandsetAddressList;
import example.implementor.HandsetGame;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 14:47
 */
public class main {
    public static void main(String[] args) {
        HandsetBrand hb = null;

        hb  = new HandsetBrandN();
        hb.setHandsetSoft(new HandsetGame());
        hb.run();
        hb.setHandsetSoft(new HandsetAddressList());
        hb.run();

        hb  = new HandsetBrandM();
        hb.setHandsetSoft(new HandsetGame());
        hb.run();
        hb.setHandsetSoft(new HandsetAddressList());
        hb.run();
    }
}
