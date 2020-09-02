package example.abstraction;

/**
 * @author dengyang
 * @createdate 2019/11/15 0015 14:45
 */
public class HandsetBrandN extends HandsetBrand {
    @Override
    public void run() {
        System.out.print("手机品牌N ");
        handsetSoft.run();
    }
}
