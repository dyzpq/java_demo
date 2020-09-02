package template.product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 11:49
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.print("创建部件：");
        for (String part : parts) {
            System.out.print(part+" ");
        }
    }
}
