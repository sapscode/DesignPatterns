package Factory;

abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println("VALUE OF RATE IS " + this.rate);
        System.out.println("TOTAL BILL IS " + (units * rate));
    }
}
