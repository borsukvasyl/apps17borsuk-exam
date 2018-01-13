package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;
import java.util.List;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    MyPredicate myPredicate;

    public FilterDecorator(SmartArray smartArray, MyPredicate myPredicate) {
        super(smartArray);
        this.myPredicate = myPredicate;
    }

    @Override
    public Object[] toArray() {
        List<Object> newArray = new ArrayList<Object>();
        for (Object element : smartArray.toArray()) {
            if (myPredicate.test(element)) {
                newArray.add(element);
            }
        }
        return newArray.toArray();
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
