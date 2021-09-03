/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Guillaume
 */
public class Calcul {

    public static double calculateTrapezoidArea(double base1, double base2, double height) {
        double area = (0.5 * (base1 + base2)) * height;
        
        return area;
    }

}
