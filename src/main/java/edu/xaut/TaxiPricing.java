package edu.xaut;

import edu.xaut.utils.ScannerWrapper;

import java.util.Scanner;

/*
    考虑出租车计价问题，出租车的运价是每公里0.8元，八公里起会加收50%的每公里运价，起步价是两公里以内6块，
    停车等待时加收每分钟0.25元，最后计价的时候司机会四舍五入只收块块钱。
*/
public class TaxiPricing {

    public static void main(String[] args) {
        TaxiPricing taxiPricing = new TaxiPricing();
        double distance = taxiPricing.getDistance(new ScannerWrapper(new Scanner(System.in)));
        long time = 0;
        TaxiCalculator calculator = new TaxiCalculator((int)distance, time);
        System.out.println(taxiPricing.displayPrice(calculator));
    }

    public String displayPrice(TaxiCalculator calculator) {
        int price = Math.round(calculator.calculate());
        return String.format("TaxiPrice is %d yuan.", price);
    }

    public double getDistance(ScannerWrapper scanner) {
        double distance = scanner.getValue();
        if (distance > 0) {
            return distance;
        } else {
            System.out.println("Input Distance Error！");
            return 0;
        }
    }
}
