/*
    Implements multiple interfaces
 */
package Interfaces_Abstract;

/**
 *
 * @author romme
 */

// Class for objects that can be sold, packed, and shipped
public class BoxedItem implements Sellable, Transportable{
    
    private String descript; // description of this item
    private int price;      // list price in cents
    private int weight;         // weight in grams
    private boolean haz;        // true if object is hazardous
    private int height = 0;     // box height in centimeters
    private int width = 0;          // box width in centimeters
    private int depth = 0;          // box depth in centimeters

    public BoxedItem(String descript, int price, int weight, boolean haz) {
        this.descript = descript;
        this.price = price;
        this.weight = weight;
        this.haz = haz;
    }
    
    public void setBox(int h, int w, int d){
        height = h;
        width = w;
        depth = d;
    }
    

    @Override
    public String description() {
        return descript;
    }

    @Override
    public int listPrice() {
       return price;
    }

    @Override
    public int lowestPrice() {
        return price/2;
    }

    @Override
    public int weight() {
        return weight;
    }
        

    @Override
    public boolean isHazardous() {
        return haz;
    }
    
    
}
