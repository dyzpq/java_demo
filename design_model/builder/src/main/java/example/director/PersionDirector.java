package example.director;

import example.builder.PersonBuilder;

/**
 * @author dengyang
 * @createdate 2019/11/6 0006 15:34
 */
public class PersionDirector {
    private PersonBuilder personBuilder;

    public PersionDirector(PersonBuilder personBuilder){
        this.personBuilder = personBuilder;
    }

    public void createPerson(){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
}
