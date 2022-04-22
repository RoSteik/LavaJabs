/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: iot.lviv.ua
 * Class: Citrus
 */
package iot.lviv.ua.models;

public class Citrus extends Fruit {

    private boolean isPitsInCitrus = true;

    public Citrus(String nameOfFruit, String colourOfFruit, RipeningSeason ripeningSeason, int price) {
        super(nameOfFruit, colourOfFruit, ripeningSeason, price);
    }

    public String getHeaders() {
        return super.getHeaders();
    }
    public String toCSV(){
        return super.toCSV();
    }
}
