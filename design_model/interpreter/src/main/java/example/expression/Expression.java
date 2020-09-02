package example.expression;

import example.context.PlayContext;

/**
 * @author dengyang
 * @createdate 2019/11/18 0018 15:32
 */
public abstract class Expression {
    public void interpret(PlayContext context){
        if(context.getPlayText().isEmpty()){
            return;
        }else {
            String playKey = context.getPlayText().substring(0,1);
            String cp = context.getPlayText().substring(2);
            double playValue = Double.valueOf(cp.substring(0,context.getPlayText().indexOf(" ")));
            context.setPlayText(cp.substring((cp.indexOf(" "))+1));
            excute(playKey,playValue);
        }
    }

    public abstract void excute(String key,double value);
}
