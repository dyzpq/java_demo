package example;

import example.context.PlayContext;
import example.expression.Expression;
import example.expression.Note;
import example.expression.Scale;

/**
 * @author dengyang
 * @createdate 2019/11/18 0018 16:03
 */
public class main {

    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        System.out.print("上海滩：");
        context.setPlayText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
        Expression expression = null;

        while (context.getPlayText().length()>0){
            String str = context.getPlayText().substring(0,1);
            switch (str){
                case "O":
                    expression = new Scale();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                case "P":
                    expression = new Note();
                    break;
            }
            expression.interpret(context);
        }
    }
}
