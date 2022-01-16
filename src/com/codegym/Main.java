package com.codegym;

public class Main {

    public static void main(String[] args) {
        MayTinhCasioFx500 mayTinhCasioFx500 = new MayTinhCasioFx500();
        System.out.println(mayTinhCasioFx500.cong(1,3));
        System.out.println(mayTinhCasioFx500.tru(1,3));
        System.out.println(mayTinhCasioFx500.nhan(1,3));
        System.out.println(mayTinhCasioFx500.chia(1,3));


        double[]arr = new double[]{4,6,7,8,4,3,25,6};
        mayTinhCasioFx500.sapXepTang(arr);
        for (double element:arr) {
            System.out.print(element+ " ");
        }
        System.out.println("\n");
        mayTinhCasioFx500.sapXepGiam(arr);
        for (double element:arr) {
            System.out.print(element + " ");
        }
    }
}
