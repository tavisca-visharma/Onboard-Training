package com.app.Entities;

public class Main {

    public static void main(String[] args) throws Exception {
        Queue<Integer> queue = new Queue<Integer>();
        for(int i=0; i<8; i++){
            queue.add(i+1);
        }
        queue.display();

        for(int i=0; i<4; i++){
            System.out.println("removed = "+queue.remove());
        }
        queue.display();

        for(int i=10; i<13; i++){
            queue.add(i+1);
        }
        queue.display();
        for(int i=0; i<7; i++){
            System.out.println("removed = "+queue.remove());
        }
        queue.display();


    }

}
