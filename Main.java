public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer1 = new Customer(1000);

        customer1.getBalance();
        
        customer1.topUp(500);

        customer1.pay(20000);

    }
}
