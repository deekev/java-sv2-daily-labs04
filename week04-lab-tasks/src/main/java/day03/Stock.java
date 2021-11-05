package day03;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Double> exchangeRate = new ArrayList<>();

    public Stock(List<Double> exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double maxProfit() {
        double minRate = exchangeRate.get(0);
        int indexOfMinRate = 0;
        for (int i = 0; i < exchangeRate.size()-1; i++) {
            if (minRate > exchangeRate.get(i)){
                minRate = exchangeRate.get(i);
                indexOfMinRate = i;
            }
        }
        double maxRate = 0;
        for (int i = indexOfMinRate; i < exchangeRate.size(); i++){
            if (maxRate < exchangeRate.get(i)) {
                maxRate = exchangeRate.get(i);
            }
        }
        return maxRate - minRate;
    }
}