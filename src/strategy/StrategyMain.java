package strategy;

public class StrategyMain {

    public static void main(String[] args){
        Customer firstCustomer = new Customer(new NormalStrategy());

        // Normal billing
        firstCustomer.Add(1.0, 1);

        // Start Happy Hour
        firstCustomer.strategy = new HappyHourStrategy();
        firstCustomer.Add(1.0, 2);

        // New Customer
        Customer secondCustomer = new Customer(new HappyHourStrategy());
        secondCustomer.Add(0.8, 1);
        // The Customer pays
        firstCustomer.PrintBill();

        // End Happy Hour
        secondCustomer.strategy = new NormalStrategy();
        secondCustomer.Add(1.3, 2);
        secondCustomer.Add(2.5, 1);
        secondCustomer.PrintBill();
    }
}

