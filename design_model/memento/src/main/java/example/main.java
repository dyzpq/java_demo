package example;

import example.caretaker.RoleStateCaretaker;
import example.originator.GameRole;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 17:31
 */
public class main {
    public static void main(String[] args) {
        //初始状态
        System.out.println("-----初始状态-----");
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.stateDisplay();

        //保存进度
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(gameRole.saveState());

        //大战
        System.out.println("-----大战之后-----");
        gameRole.fight();
        gameRole.stateDisplay();

        //读取进度
        System.out.println("-----读取进度-----");
        gameRole.recoveryState(caretaker.getRoleStateMemento());
        gameRole.stateDisplay();


    }
}
