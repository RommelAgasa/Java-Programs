/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_patterns;

/**
 *
 * @author romme
 */
public class TaxCalculator2019 implements TaxCalculator{

    @Override
    public float calculateTax() {
        return 1;
    }
    
    public float calculateInsurance(){
        return 0;
    }
}
