package example.component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dengyang
 * @createdate 2019/11/5 0005 14:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String name;

    public void show(){
        System.out.print(name+"的装扮：");
    }

}
