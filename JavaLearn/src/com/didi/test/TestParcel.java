package com.didi.test;

public class TestParcel {

    public static void main(String[] args){

        Parcel4 p = new Parcel4();
        Contents c =p.contents();
        Destination d = p.destination("shanghai");


        //Parcel4.PContents pc = p.new PContents();


    }
}
