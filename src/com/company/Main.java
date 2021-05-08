package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print("Tabla inmultirii pana la 12: \n");

	    //int prod = 0;
        for( int i=1; i<=12; i++)
            {
            for(int j=1; j<=12; j++){
                System.out.print( i*j + "\t");}
            System.out.println();
            }
    }
}
