package example.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 18:15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkExperience implements Cloneable{

    private String workDate;
    private String company;

    @Override
    public WorkExperience clone(){
        WorkExperience work = null;
        try {
            work = (WorkExperience)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return work;
    }
}
