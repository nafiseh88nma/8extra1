package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i=0;
        switch ( i)
        {
            case 0:
                i=i*i;
                break;
            case 1:
                i=i+i;

                break;
        }
        System.out.println(i);
        if (i!=1 || i!=0){
            System.out.println("error");
        }
    }
}
