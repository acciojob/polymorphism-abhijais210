package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int ans = p.product(10,5);
        System.out.println(ans);

        ans = p.product(1,2,3);
        System.out.println(ans);

        double a = p.product(2.3,0.5);
        System.out.println(a);
    }
    static class Product{
        public int product(int x,int y){
            return x*y;
        }

        public int product(int x,int y,int z){
            return x*y*z;
        }

        public double product(double x,double y){
            return x*y;
        }
    }
}