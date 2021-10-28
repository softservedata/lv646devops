package com.softserve.edu;

public class AppData {

    public static void main(String[] args) {
        Change ch = new Change();
        Change2 ch2 = new Change2();
        //
        Data<Integer> d1 = new Data<>(1, 2);
        System.out.println("d1 = " + d1);
        d1 = ch.one(d1);
        System.out.println("updated d1 = " + d1);
        //
        Data<String> d2 = new Data<>("11", "22");
        System.out.println("d2 = " + d2);
        d2 = ch2.three(d2);
        System.out.println("updated d2 = " + d2);
    }

}
