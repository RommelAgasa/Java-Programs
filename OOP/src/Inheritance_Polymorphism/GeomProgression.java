
package Inheritance_Polymorphism;

public class GeomProgression extends Progression{
    
    protected long base;

    public GeomProgression() {
        super(33,33);
    }
    
    public GeomProgression(long b){
        base = b;
        current = first = 0;
    }

    @Override
    protected long nextValue() {
        current *= base;
        return current;
    }

    
}
