package optional;

import optional.optionaltest.Car;
import optional.optionaltest.NewCar;
import optional.optionaltest.Person;
import org.junit.Test;

import java.util.Optional;

/**
 * @Author ddyy
 * @Date 2020/9/10 0010 17:42
 *
 * 防止nullPointException异常
 *
 * Optional
 *      优点：传统的方式需要通过不停的null判断进行处理，
 *            optional可以用...的方式获取，不用去判断null，Optional封装了null的判断
 */
public class OptionalDemo {

    @Test
    public void test1(){
        Person person = new Person("李四");

        //传统方式
        Car car = new Car(person);
        String personName = this.getPersonName(car);
        System.out.println(personName);

        //方式
        NewCar newCar = new NewCar(Optional.of(person));
        String personName1 = this.getPersonName(Optional.of(newCar));
        System.out.println(personName1);

    }

    //传统方式
    public String getPersonName(Car car){
        String name = "张三";
        if(car != null){
            Person person = car.getPerson();
            if(person != null){
                name = person.getName();
            }
        }
        return name;
    }

    //optional方式获取
    public String getPersonName(Optional<NewCar> newCar){
        String name = newCar.orElse(new NewCar())
                .getPerson()
                .orElse(new Person("张三"))
                .getName();

        return name;
    }

}
