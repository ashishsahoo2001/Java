

 class Employee {
    int pan;
    String name;
    double taxIncome;
    double tax;

    public void input(int pan, String name, double taxIncome) {
        this.pan = pan;
        this.name = name;
        this.taxIncome = taxIncome;
    }

    public void cal() {
        if (taxIncome <= 250000) {
            tax = 0;
        } else if (taxIncome <= 500000) {
            tax = (taxIncome - 250000) * 0.10;
        } else if (taxIncome <= 1000000) {
            tax = 30000 + (taxIncome - 500000) * 0.20;
        } else {
            tax = 50000 + (taxIncome - 1000000) * 0.30;
        }
    }

    public void display() {
        System.out.println("PAN Number: " + pan);
        System.out.println("Name: " + name);
        System.out.println("Taxable Income: ₹" + taxIncome);
        System.out.println("Tax: ₹" + tax);
    }
}
