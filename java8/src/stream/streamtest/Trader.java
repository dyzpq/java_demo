package stream.streamtest;

import java.util.Objects;

/**
 * @Author ddyy
 * @Date 2020/9/10 0010 11:08
 * 交易员类
 */
public class Trader {

    private String name;

    private String city;

    public Trader() {
    }

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return Objects.equals(name, trader.name) &&
                Objects.equals(city, trader.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city);
    }

    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}