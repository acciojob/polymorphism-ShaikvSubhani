package com.driver;

public class Main {
    public static class Product{

        public static int Product(int x,int y)
        {
            return x*y;
        }
        public static int Product(int x,int y,int z)
        {
            return x*y*z;
        }
        public static double Product(double x,double y)
        {
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p=new Product();
        p.Product(10,20);
        p.Product(10,20,30);
        p.Product(10.0,20.0);
    }


}

