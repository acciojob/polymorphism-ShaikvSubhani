package com.driver;

public class Main {
    public static class Product{
            int x;
            int y;
            int z;
           public Product()
            {
                this.x=x;
                this.y=y;
                this.z=z;
            }
        public int Product(int x,int y)
        {
            this.x=x;
            this.y=y;
            return x*y;
        }
        public int Product(int x,int y,int z)
        {
            this.x=x;
            this.y=y;
            this.z=z;
            return x*y*z;
        }
        public double Product(double x,double y)
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

