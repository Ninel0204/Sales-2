package ru.netology;

public class Main {
    public static void main(String[] args) {
        long [] priceList={500,1000,50, 6000};
        SalesManager salesManager=new SalesManager(priceList);
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println(salesManager.average());

    }
}
