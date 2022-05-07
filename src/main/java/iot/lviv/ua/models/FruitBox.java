package iot.lviv.ua.models;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class FruitBox  {
    private Fruit fruit;
    private int mass;

    public FruitBox(Fruit fruit) {
        this.fruit = fruit;
    }
}