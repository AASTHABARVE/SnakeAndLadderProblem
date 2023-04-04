package com.bridgelabz.SnakeAndLadder;

public class SnakeAndLadder {

    int position = 0;
    static void dieRole(){


        int dieValue = (int)(Math.random()*10%6)+1;
        System.out.println(dieValue);
    }
    static void play(){

        int number = (int)(Math.random()*10%3);
        switch (number){
            case 0:
                System.out.println("No move");
                break;
            case 1:
                System.out.println(" move ahead");
                break;
            case 2:
                System.out.println(" move behind");
                break;


        }
    }
    public static void main(String args[]){
        dieRole();
        play();

    }
}
