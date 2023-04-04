package com.bridgelabz.SnakeAndLadder;

public class SnakeAndLadder {

    int position = 0;
    static void dieRole(){

        int dieValue = (int)(Math.random()*10%6)+1;
        System.out.println(dieValue);
    }
    public static void main(String args[]){
        dieRole();




    }
}
