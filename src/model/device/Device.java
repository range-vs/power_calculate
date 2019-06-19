package model.device;

import services.converter.Converter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Device {

    private String name;
    private AtomicInteger count;
    private AtomicInteger time;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AtomicInteger getCount() {
        return count;
    }

    public void setCount(AtomicInteger count) {
        this.count = count;
    }

    public AtomicInteger getTime() {
        return time;
    }

    public void setTime(AtomicInteger time) {
        this.time = time;
    }

    public abstract Converter getConverter();
    public abstract void initDevice(String n, AtomicInteger c, AtomicInteger t, ArrayList<Integer> p);
    public abstract Integer getPower();

}
