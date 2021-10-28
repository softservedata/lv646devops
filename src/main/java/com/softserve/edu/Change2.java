package com.softserve.edu;

public class Change2 {

    public Data<String> three(Data<String> data) {
        String temp1 = data.getFirst();
        String temp2 = data.getSecond();
        data.setFirst(temp2);
        data.setSecond(temp1);
        return data;
    }
}
