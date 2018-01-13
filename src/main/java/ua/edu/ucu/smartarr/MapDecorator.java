package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    MyFunction myFunction;

    public MapDecorator(SmartArray smartArray, MyFunction myFunction) {
        super(smartArray);
        this.myFunction = myFunction;
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[smartArray.size()];
        for (int i = 0; i < smartArray.size(); i++) {
            newArray[i] = myFunction.apply(smartArray.toArray()[i]);
        }
        return newArray;
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
