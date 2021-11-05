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
            if (exchangeRate.get(i) != null) {
                for (int j = i + 1; j < exchangeRate.size(); j++) {
                    if (exchangeRate.get(j) != null && exchangeRate.get(i) < exchangeRate.get(j)) {
                        if (exchangeRate.get(j) - exchangeRate.get(i) > maxProfit) {
                            maxProfit = exchangeRate.get(j) - exchangeRate.get(i);
                        }
                    }
                }
            }
        }
        return maxProfit;
    }
}