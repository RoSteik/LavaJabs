/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: iot.lviv.ua
 * Class: Berry
 */
package iot.lviv.ua.models;

public class Berry extends Fruit {

    private boolean isPitsInCitrus = false;
    public Berry(){}

    public Berry(String nameOfFruit, String colourOfFruit, RipeningSeason ripeningSeason, int price) {
        super(nameOfFruit, colourOfFruit, ripeningSeason, price);
    }

    public Berry(String nameOfFruit, String colourOfFruit, RipeningSeason ripeningSeason, int price, boolean isPitsInCitrus) {
        super(nameOfFruit, colourOfFruit, ripeningSeason, price);
        this.isPitsInCitrus=isPitsInCitrus;
    }
    public String getHeaders() {
        return super.getHeaders() + ", Is there pits in fruit?";
    }
    public String toCSV(){
        return super.toCSV() +", " + this.isPitsInCitrus;
    }

}
