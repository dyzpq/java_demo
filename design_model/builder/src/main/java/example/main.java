package example;

import example.builder.PersonBuilder;
import example.builder.PersonFatBuilder;
import example.builder.PersonThinBuilder;
import example.director.PersionDirector;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 15:36
 */
public class main {
    public static void main(String[] args) {
        PersionDirector persionDirector;

        PersonThinBuilder ptb = new PersonThinBuilder();
        persionDirector = new PersionDirector(ptb);
        persionDirector.createPerson();

        System.out.println("");

        PersonFatBuilder pfb = new PersonFatBuilder();
        persionDirector = new PersionDirector(pfb);
        persionDirector.createPerson();


    }
}
