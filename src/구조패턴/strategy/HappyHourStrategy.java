package 구조패턴.strategy;

// 전략2 : Strategy for Happy hour (50% discount)
class HappyHourStrategy implements BillingStrategy {
    public double GetActPrice(double rawPrice) {
        return rawPrice * 0.5;
    }
}
