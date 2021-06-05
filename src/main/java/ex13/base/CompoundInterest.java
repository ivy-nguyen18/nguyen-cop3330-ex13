package ex13.base;

public class CompoundInterest {
    private double principal;
    private double rate;
    private int year;
    private int compounded;

    public CompoundInterest(double principal, double rate, int year, int compounded){
        this.principal = principal;
        this.rate = rate;
        this.year = year;
        this.compounded = compounded;
    }

    public double investment(){
        return  principal * Math.pow(( 1 + ((rate/100) / compounded)) , compounded * year );
    }
}
