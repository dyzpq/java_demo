package example.adapter;

import example.targer.Player;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 16:13
 */
public class Translator extends Player {

    private ForeginCenter foreginCenter = new ForeginCenter();

    public Translator(String name){
        super(name);
        foreginCenter.setName(name);
    }

    @Override
    public void attack() {
        foreginCenter.进攻();
    }

    @Override
    public void defense() {
        foreginCenter.防守();
    }
}
