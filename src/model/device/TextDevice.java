package model.device;

import services.converter.Converter;
import services.converter.TextConverter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class TextDevice extends Device {

    private AtomicInteger data;

    @Override
    public Converter getConverter() {
        return new TextConverter(data);
    }

    @Override
    public void initDevice(String n, AtomicInteger c, AtomicInteger t, ArrayList<Integer> p) {
        setName(n);
        setCount(c);
        setTime(t);
        data = new AtomicInteger(p.get(0));
    }

    @Override
    public Integer getPower() {
        return data.get();
    }
}
