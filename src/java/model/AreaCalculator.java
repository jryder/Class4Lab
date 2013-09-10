
package model;

/**
 *
 * @author jorda_000
 */
public class AreaCalculator {

    
    public double getSquareFeet(double length, double width){
	
	return length * width;	
	
    }
    
    public double getCircleFeet(double radius){
    
        return radius * 2 * Math.PI;
        
    }
    
    
}
