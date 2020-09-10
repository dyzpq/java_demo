package optional.optionaltest;

/**
 * @Author ddyy
 * @Date 2020/9/10 0010 18:00
 */
public class Car {

    private Person person;

    public Car() {
    }

    public Car(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Car{" +
                "person=" + person +
                '}';
    }
}
