package iot.lviv.ua;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitBox extends FruitShop {

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
    public String toString()
    {
        return this.nameOfFruitInBox + " " +  this.colourOfFruitInBox + " "
                + this.ripeningSeason + " , Price - " +  this.price;
    }
}