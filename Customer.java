public class Customer {
    private int walletBalance;

    public Customer(int walletBalance) throws NotValidBalanceException{
        if (walletBalance <= 0 ){
            throw new NotValidBalanceException();

        }
        this.walletBalance = walletBalance;
    }

    public void setBalance(int walletBalance) throws NotValidBalanceException{
        if (walletBalance < 0){
            throw new NotValidBalanceException() ;

        }
        this.walletBalance = walletBalance;
    }

    public int getBalance(){
        return walletBalance;
    }

    public void topUp(int amount) throws Exception{
        if (amount < 0) {
            throw new Exception("Số tiền nạp không được phép nhỏ hơn hoặc bằng 0");
        }
        walletBalance = walletBalance + amount;
        System.out.println("Đã nạp thành công " + amount + ". Tài khoản hiện tại đang có " + walletBalance );

    }
    
    public void pay(int amount) throws InsufficientBalanceException{
        if (amount > walletBalance){
            throw new InsufficientBalanceException();
        }
        walletBalance = walletBalance - amount;
        System.out.println("Giao dịch thành công. Số tiền hiện tại " + walletBalance);
    }




    
}
