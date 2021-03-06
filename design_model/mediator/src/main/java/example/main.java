package example;

import example.colleague.Iraq;
import example.colleague.USA;
import example.mediator.UnitedNations;
import example.mediator.UnitedNationsSecurityCouncil;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 17:00
 */
public class main {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

        USA c1 = new USA(UNSC);
        Iraq c2 = new Iraq(UNSC);

        UNSC.setColleague1(c1);
        UNSC.setColleague2(c2);

        c1.declare("不准研制核武器，否则要发动战争");
        c2.declare("我们没有核武器，也不怕侵略");
    }
}
