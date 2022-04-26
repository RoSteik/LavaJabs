/**
 * Created by RoSteik (Telegram: @RoSteik)
 * Project name: Laboratorna_2_3_Java
 * Package name: iot.lviv.ua
 * Class: Fruit
 */
package iot.lviv.ua.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Fruit{
    private  String nameOfFruit;
    private  String colourOfFruit;
    private RipeningSeason ripeningSeason;
    private  int price; //per kilogram


    public  Fruit(){}
    public String getHeaders() {
        return "Fruit, Price";
    }
    public String toCSV(){
        return this.getNameOfFruit() + ", " + this.getPrice();
    }

}
