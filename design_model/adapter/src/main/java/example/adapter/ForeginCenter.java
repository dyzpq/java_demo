package example.adapter;

import lombok.Data;

/**
 * @author dengyang
 * @createdate 2019/11/7 0007 16:10
 */
@Data
public class ForeginCenter {
    private String name;

    public void 进攻(){
        System.out.println("外籍中锋"+name+"进攻");
    }

    public void 防守(){
        System.out.println("外籍中锋"+name+"防守");
    }
}
