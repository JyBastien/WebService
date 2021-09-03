/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.time.Instant;
import java.util.Date;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author Guillaume
 */
public class ShapeShifter {

    public static String shapesList() {
//        Les formes
        JSONArray liste = new JSONArray();
        JSONObject triangle = new JSONObject();
        triangle.accumulate("name", "triangle");
        triangle.accumulate("NumberofParam", 2);
        liste.add(triangle);

        JSONObject rectangle = new JSONObject();
        rectangle.accumulate("name", "triangle");
        rectangle.accumulate("NumberofParam", 2);
        liste.add(rectangle);

        JSONObject trapezoid = new JSONObject();
        trapezoid.accumulate("name", "triangle");
        trapezoid.accumulate("NumberofParam", 3);
        liste.add(trapezoid);

        JSONObject ellipse = new JSONObject();
        ellipse.accumulate("name", "triangle");
        ellipse.accumulate("NumberofParam", 2);
        liste.add(ellipse);

        JSONObject square = new JSONObject();
        square.accumulate("name", "triangle");
        square.accumulate("NumberofParam", 1);
        liste.add(square);

        JSONObject parallelogram = new JSONObject();
        parallelogram.accumulate("name", "triangle");
        parallelogram.accumulate("NumberofParam", 2);
        liste.add(parallelogram);

        JSONObject circle = new JSONObject();
        circle.accumulate("name", "triangle");
        circle.accumulate("NumberofParam", 2);
        liste.add(circle);

        JSONObject sector = new JSONObject();
        sector.accumulate("name", "triangle");
        sector.accumulate("NumberofParam", 1);
        liste.add(sector);

        return liste.toString();
    }

    public static String shapeOne(String nameOfShape, double val1) {
        JSONObject json = new JSONObject();

        long timeStamp = new Date().getTime() / 100000;

        if (nameOfShape.equalsIgnoreCase("Circle")) {
            json.accumulate("Status", "OK");
            json.accumulate("Shape", nameOfShape.toUpperCase());
            json.accumulate("raduis", val1);
            json.accumulate("area", Calcul.areaFromRadius(val1));
        } else {
            json.accumulate("Status", "Error");
            json.accumulate("Timestamp", String.valueOf(timeStamp));
            json.accumulate("Shape", nameOfShape);
            json.accumulate("Message", "Not the good Shape");
        }

        return json.toString();
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
