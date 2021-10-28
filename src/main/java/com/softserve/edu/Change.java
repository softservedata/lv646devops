package com.softserve.edu;

public class Change {

    public Data<Integer> one(Data<Integer> data) {
        Integer temp1 = data.getFirst();
        Integer temp2 = data.getSecond();
        data.setFirst(temp2);
        data.setSecond(temp1);
        return data;
    }

    public Data<String> two(Data<String> data) {
        String temp1 = data.getFirst();
        String temp2 = data.getSecond();
        data.setFirst(temp2);
        data.setSecond(temp1);
        return data;
    }
    
}
