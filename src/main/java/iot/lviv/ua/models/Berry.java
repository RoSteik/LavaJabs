/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: iot.lviv.ua
 * Class: Berry
 */
package iot.lviv.ua.models;

public class Berry extends Fruit {

    private int sugarLevel = 12;
    public Berry(String nameOfFruit, String colourOfFruit, RipeningSeason ripeningSeason, int price) {
        super(nameOfFruit, colourOfFruit, ripeningSeason, price);
    }
    public String getHeaders() {
        return super.getHeaders();
    }
    public String toCSV(){
        return super.toCSV();
    }

}
