package strategy;

// 전략2 : Strategy for Happy hour (50% discount)
class HappyHourStrategy implements BillingStrategy {
    public double GetActPrice(double rawPrice) {
        return rawPrice * 0.5;
    }
}
