
package Inheritance_Polymorphism;

public class ArithProgression extends Progression{
    
    // adding fixed increment
    protected long inc;
    
    // Default Constructor
    public ArithProgression() {
        inc = 0;
    }

    public ArithProgression(long inc, long first, long current) {
        super(first, current);
        this.inc = inc;
        
    }

    // Paramtric constructor setting a unit of increment
    public ArithProgression(long inc) {
        this.inc = inc;
    }
    
    /*Advances the progression by adding the increment
    to the current value
    */
    @Override
    protected long nextValue(){
        current += inc;
        return current;
    }
    
    // Inherits method firstValue and printProgression(int)
    
}
