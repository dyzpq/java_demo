package optional.optionaltest;

import java.util.Optional;

/**
 * @Author ddyy
 * @Date 2020/9/10 0010 17:44
 */
public class NewCar {

    private Optional<Person> person;

    public NewCar() {
    }

    public NewCar(Optional<Person> person) {
        this.person = person;
    }

    public Optional<Person> getPerson() {
        return person;
    }

    public void setPerson(Optional<Person> person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "NewCar{" +
                "person=" + person +
                '}';
    }
}
