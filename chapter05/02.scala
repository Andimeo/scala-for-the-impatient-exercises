object Main {
  class BankAccount {
    private var _balance: Double = 0.0
    def deposit(amount: Double) = {
      if (amount > 0.0) _balance += amount
    }
    def withdraw(amount: Double) = {
      if (amount > 0.0 && amount <= _balance) _balance -= amount
    }
    def balance = _balance
  }
  def main(args: Array[String]) {
    val account = new BankAccount()
    account.deposit(100)
    println(account.balance)
    account.withdraw(75)
    println(account.balance)
    account.withdraw(50)
    println(account.balance)
    account.withdraw(-50)
    println(account.balance)
    account.deposit(-100)
    println(account.balance)
  }
}
