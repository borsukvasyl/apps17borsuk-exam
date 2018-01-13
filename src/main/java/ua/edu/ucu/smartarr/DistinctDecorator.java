package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {
    private List<Object> resource;

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        this.resource = new ArrayList<Object>(Arrays.asList(smartArray.toArray()));
    }

    @Override
    public Object[] toArray() {
        List<Object> newArray = new ArrayList<Object>();
        for (Object student : resource) {
            if (!newArray.contains(student)) {
                newArray.add(student);
            }
        }
        return newArray.toArray();
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
