package template.director;

import template.builder.Builder;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 11:56
 */
public class Director {
    public void Construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
