package atm.enums;

public enum TransactionType {
    Money_Withdrawal,
    Check_Balance;

    public static void showAllTransactions(){
        for(TransactionType transactionType : TransactionType.values()){
            System.out.println(transactionType);
        }
    }
}
