package day03;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Double> exchangeRate = new ArrayList<>();

    public Stock(List<Double> exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double maxProfit() {
        double maxProfit = 0.0;
        for(int i = 0; i < exchangeRate.size(); i++){
            maxProfit = checkDailyDifferences(maxProfit, i);
        }
        return maxProfit;
    }

    private double checkDailyDifferences(double maxProfit, int i) {
        for (int j = i + 1; j < exchangeRate.size(); j++) {
            if (exchangeRate.get(j) - exchangeRate.get(i) > maxProfit) {
                maxProfit = exchangeRate.get(j) - exchangeRate.get(i);
            }
        }
        return maxProfit;
    }
}