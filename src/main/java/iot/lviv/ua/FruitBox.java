package iot.lviv.ua;


import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class FruitBox extends FruitShopManager {

    public enum ripeningSeasonEnum{
        SUMMER,
        AUTUMN,
        WINTER,
        SPRING
    }

    private  String nameOfFruitInBox;
    private  String colourOfFruitInBox;
    private ripeningSeasonEnum ripeningSeason;
    private  int price; //per kilogram

    public FruitBox(String nameOfFruitInBox, String colourOfFruitInBox,ripeningSeasonEnum ripeningSeason, int price) {
        this.nameOfFruitInBox = nameOfFruitInBox;
        this.colourOfFruitInBox = colourOfFruitInBox;
        this.ripeningSeason = ripeningSeason;
        this.price = price;
    }

    @Override
    public String toString() {
        return getNameOfFruitInBox() + ", " +  getColourOfFruitInBox()+ ", "
                +  "Price per kilo - " + getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FruitBox fruitBox = (FruitBox) o;
        return price == fruitBox.price && Objects.equals(nameOfFruitInBox, fruitBox.nameOfFruitInBox) && Objects.equals(colourOfFruitInBox, fruitBox.colourOfFruitInBox) && ripeningSeason == fruitBox.ripeningSeason;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfFruitInBox, colourOfFruitInBox, ripeningSeason, price);
    }
}