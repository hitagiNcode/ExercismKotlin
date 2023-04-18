class BankAccount{
    private var open = true

    var balance : Long = 0
        get(){ check(open) { "Account closed" }; return field }
        private set

    @Synchronized
    fun adjustBalance(amount: Long){
        balance += amount
    }

    fun close() {
        open = false
    }
}
