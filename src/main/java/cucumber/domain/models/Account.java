package cucumber.domain.models;

public class Account
{
    private int balance;

    public void deposit(int amount)
    {
        this.balance = this.balance + amount;
    }

    public int getBalance()
    {
        return this.balance;
    }
}
