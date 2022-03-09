package strategy;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private List<Double> drinks;
    public BillingStrategy strategy;

    public Customer(BillingStrategy strategy) {
        this.drinks = new ArrayList<>();
        this.strategy = strategy;
    }

    // 전략 패턴 사용
    public void Add(double price, int quantity) {
        drinks.add(strategy.GetActPrice(price * quantity));
    }

    // Payment of bill
    public void PrintBill() {
        double sum = 0;
        for (Double i : drinks) {
            sum += i;
        }
        System.out.println(("Total due: " + sum));
        drinks.clear();
    }
}
