package edu.xaut;

import java.util.Scanner;

/*
    考虑出租车计价问题，出租车的运价是每公里0.8元，八公里起会加收50%的每公里运价，起步价是两公里以内6块，
    停车等待时加收每分钟0.25元，最后计价的时候司机会四舍五入只收块块钱。
*/
public class TaxiPricing {

    public static void main(String[] args) {
        TaxiPricing taxiPricing = new TaxiPricing();
        double distance = taxiPricing.getDistance();
        TaxiCalculator calculator = new TaxiCalculator();
        System.out.println("TaxiPrice is " + calculator.calculatePrice(distance) + " yuan.");
    }

    private double getDistance(){
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        if(distance >= 0){
            return distance;
        }else{
            System.out.println("Input Distance Error！");
            return 0;
        }
    }
}
