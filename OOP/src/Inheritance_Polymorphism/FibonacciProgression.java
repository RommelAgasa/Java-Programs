
package Inheritance_Polymorphism;


public class FibonacciProgression extends Progression{
    
    // Previous value
    protected long prev;
    // Inherits the variable first and current
    
    public FibonacciProgression(){
        first = 0;
        current = 1;
    }

    public FibonacciProgression(long value1, long value2) {
        first = value1;
        prev = value2 - value1;
    }

    // 0 1 1 2 3 5 8 13 21 34
    @Override
    protected long nextValue() {
        long temp = prev;
        prev = current;
        current += temp;
        return current;
    }
   
    
}
