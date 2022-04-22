package iot.lviv.ua.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Getter
@Setter
@AllArgsConstructor
public class FruitBox  {
    private Fruit fruit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FruitBox fruitBox = (FruitBox) o;
        return Objects.equals(fruit, fruitBox.fruit);
    }

    @Override
     public int hashCode() {
        return Objects.hash(fruit);
    }

    @Override
    public String toString() {
        return "Fruit - " + this.fruit.toString();
    }
}