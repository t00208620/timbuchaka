package OOP;

public class BankAccount {

        private String accNo;
        private double balance;
        private String name;
        private String email;
        private String phoneNo;

        public BankAccount(){
            this("56789", 2.50, "Default name", "Default email", "Default phoneNo");
            System.out.println("Empty constructor called");
        }

        public BankAccount(String accNo, double balance, String name,
                           String email, String phoneNo)
        {
            System.out.println("Account constructor with parameters called");
            setAccNo(accNo);
            setBalance(balance);
            setName(name);
            setEmail(email);
            setPhoneNo(phoneNo);
        }

    public BankAccount(String name, String email, String phoneNo) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void deposit(double depositAmount) {
            this.balance += depositAmount;
            System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
        }

    public void withdraw(double withdrawAmount){
            if(withdrawAmount > balance)
            {
                System.out.println("Only " + this.balance + " available. Withdrawal not processed!!");
            }

            else {
                this.balance -= withdrawAmount;
                System.out.println("Withdrawal of " + withdrawAmount + " processed. Remaining balance = " + this.balance);
            }
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
