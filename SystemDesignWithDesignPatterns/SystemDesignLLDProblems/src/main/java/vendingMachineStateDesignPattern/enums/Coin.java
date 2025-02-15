package vendingMachineStateDesignPattern.enums;

public enum Coin {
    Penny(1),
    Nickel(5),
    Dime(10),
    Quarter(25);
    public int value;
    Coin(int value){ this.value = value; }
}
