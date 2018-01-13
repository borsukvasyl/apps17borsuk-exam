package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator {
    MyComparator myComparator;

    public SortDecorator(SmartArray smartArray, MyComparator myComparator) {
        super(smartArray);
        this.myComparator = myComparator;
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = smartArray.toArray().clone();
        Arrays.sort(newArray, myComparator);
        return newArray;
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
