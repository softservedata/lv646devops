package com.softserve.edu;

public class Data<T> {
    private T first;
    private T second;

    public Data(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Data [first=" + first 
                + ", second=" + second 
                + "]";
    }
    
}
