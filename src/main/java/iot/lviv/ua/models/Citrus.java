/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: iot.lviv.ua
 * Class: Citrus
 */
package iot.lviv.ua.models;

import lombok.Getter;
import lombok.Setter;

import java.beans.Transient;

@Getter
@Setter
public class Citrus extends Fruit {

    private Integer id;
    private boolean isPitsInCitrus = true;

    public Citrus() {
    }

    public Citrus(String nameOfFruit, String colourOfFruit, RipeningSeason ripeningSeason, int price) {
        super(nameOfFruit, colourOfFruit, ripeningSeason, price);
    }

    public Citrus(String nameOfFruit, String colourOfFruit, RipeningSeason ripeningSeason, int price, boolean isPitsInCitrus) {
        super(nameOfFruit, colourOfFruit, ripeningSeason, price);
        this.isPitsInCitrus = isPitsInCitrus;
    }

    @Transient
    public String getHeaders() {
        return super.getHeaders() + ", Is there pits in fruit?";
    }

    public String toCSV() {
        return super.toCSV() + ", " + this.isPitsInCitrus;
    }
}
