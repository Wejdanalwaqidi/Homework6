public class Q1 {
    private double balance , rate ;
    private  int year ;
    public Q1 (double balance , double rate){
        this.balance = balance;
        this.rate = rate;
        year=0;
    }
    public double getBalance(){
        return balance;}
    public int getYear(){
        return year;}
    public void waitForBalance (double target){
        while (balance<target) {
            year++;
            double interest =balance*rate/100;
            balance=balance+interest;
        }
    }
}


