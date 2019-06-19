package model.device;

import services.converter.ComboConverter;
import services.converter.Converter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class ComboDevice extends Device {

    private Integer [] data;
    private AtomicInteger current;

    @Override
    public Converter getConverter() {
        return new ComboConverter(data, current);
    }

    @Override
    public void initDevice(String n, AtomicInteger c, AtomicInteger t, ArrayList<Integer> p) {
        setName(n);
        setCount(c);
        setTime(t);
        data = p.toArray(new Integer[p.size()]);
        current = new AtomicInteger(p.get(0));
    }

    @Override
    public Integer getPower() {
        return current.get();
    }

}
