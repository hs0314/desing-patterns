package 구조패턴.strategy;

// 전략1 : Normal billing 구조패턴.strategy (unchanged price)
class NormalStrategy implements BillingStrategy {
    public double GetActPrice(double rawPrice) {
        return rawPrice;
    }
}
