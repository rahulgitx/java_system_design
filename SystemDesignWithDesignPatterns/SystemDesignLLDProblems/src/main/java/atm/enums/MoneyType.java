package atm.enums;

public enum MoneyType {
    HundredNote(100),
    FiveHundredNote(500),
    TwoThousandNote(2000);
    public int value;
    MoneyType(int value){
        this.value = value;
    }

}
