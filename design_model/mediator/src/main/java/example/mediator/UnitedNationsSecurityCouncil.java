package example.mediator;

import example.colleague.Country;
import example.colleague.Iraq;
import example.colleague.USA;
import lombok.Setter;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 16:56
 */
@Setter
public class UnitedNationsSecurityCouncil extends UnitedNations {

    private USA colleague1;
    private Iraq colleague2;

    @Override
    public void declare(String message, Country country) {
       if(country.equals(colleague1)){
           colleague2.getMessage(message);
       } else {
           colleague1.getMessage(message);
       }
    }
}
