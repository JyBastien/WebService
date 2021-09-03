/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Guillaume
 */
public abstract interface ShapeShifter {
    
    public String shapesList();
        
    public String shapeOne(String nameOfShape, double val1);
    
    public String shapeTwo(String nameOfShape, double val1, double val2);
    
    public String shapeThree(String nameOfShape, double val1, double val2, double val3);
}
