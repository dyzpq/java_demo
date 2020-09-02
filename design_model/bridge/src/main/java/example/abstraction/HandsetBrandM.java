package example.abstraction;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 14:46
 */
public class HandsetBrandM extends HandsetBrand {
    @Override
    public void run() {
        System.out.print("手机品牌M ");
        handsetSoft.run();
    }
}
