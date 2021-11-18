package Strategy;

// 전략1 : Normal billing strategy (unchanged price)
class NormalStrategy implements BillingStrategy {
    public double GetActPrice(double rawPrice) {
        return rawPrice;
    }
}
