/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.time.Instant;
import net.sf.json.JSONObject;

/** 
 *
 * @author Guillaume
 */
public class ShapeShifter {

    public static String shapesList() {

        return null;
    }

    public static String shapeOne(String nameOfShape, double val1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String shapeTwo(String nameOfShape, double val1, double val2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String shapeThree(String nameOfShape, double base1, double base2, double height) {
        
        if (!nameOfShape.equalsIgnoreCase("TRAPEZOID")) {
            JSONObject errorObject = new JSONObject();
            
            errorObject.accumulate("Statut", "Error");
            errorObject.accumulate("Timestamp", Instant.now().toEpochMilli() / 100000);
            errorObject.accumulate("Shape", nameOfShape.toUpperCase());
            errorObject.accumulate("Message", "Shape name is invalide");
      
            return errorObject.toString();
        } else {               
            JSONObject successObject = new JSONObject();
            double shapeThreeArea = Calcul.calculateTrapezoidArea(base1, base2, height);
            
            successObject.accumulate("Statut", "OK");
            successObject.accumulate("Timestamp", Instant.now().toEpochMilli() / 100000);
            successObject.accumulate("Shape", nameOfShape.toUpperCase());
            successObject.accumulate("Base1", base1);
            successObject.accumulate("Base2", base2);
            successObject.accumulate("Height", height);
            successObject.accumulate("Area", shapeThreeArea);
            
            return successObject.toString();
        }
    }

}
