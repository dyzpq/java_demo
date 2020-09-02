package template.template;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 10:30
 */
public abstract class AbstractClass {

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("");
    }
}
