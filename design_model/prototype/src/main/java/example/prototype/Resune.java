package example.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 18:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resune implements Cloneable {
    private String name;
    private String sex;
    private Integer age;
    private WorkExperience work;


    @Override
    public Resune clone(){
        Resune resune = null;
        try {
            resune = (Resune) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return resune;
    }

}
