/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: iot.lviv.ua
 * Class: Fruit
 */
package iot.lviv.ua.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class Fruit{
    private  String nameOfFruit;
    private  String colourOfFruit;
    private RipeningSeason ripeningSeason;
    private  int price; //per kilogram


    public String getHeaders() {
        return "Fruit, Price";
    }
    public String toCSV(){
        return this.getNameOfFruit() + ", " + this.getPrice();
    }

    @Override
    public String toString() {
        return String.format("%s, price - %d", this.getNameOfFruit(), this.getPrice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return price == fruit.price && Objects.equals(nameOfFruit, fruit.nameOfFruit) && Objects.equals(colourOfFruit, fruit.colourOfFruit) && ripeningSeason == fruit.ripeningSeason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfFruit, colourOfFruit, ripeningSeason, price);
    }


}
