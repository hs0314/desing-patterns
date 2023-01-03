package 구조패턴.strategy;

// Strategy 인터페이스
interface BillingStrategy {
    double GetActPrice(double rawPrice);
}
