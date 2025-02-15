public class CallByReference {
    public int amount = 10;
    public void increment(int a, int b){
        a++;
        b++;
        System.out.println(a + " " + b);
    }
    public void incrementInteger(Integer a, Integer b){
        a++; b++;
        System.out.println(a + " " + b);
    }
    public void changeAmount(CallByReference c){
        c.amount += 10;
    }

    public static void main(String[] args) {
//        int a = 1, b = 2;
        CallByReference callByReference = new CallByReference();
        CallByValueClass callByValueClass = new CallByValueClass();
        callByValueClass.changeValue(callByReference);
        System.out.println("After call by reference: " + callByReference.amount);

        callByReference.changeAmount(callByReference);
        System.out.println("After call by reference: " + callByReference.amount);
//        callByReference.increment(a, b);
//        System.out.println(a + " " + b);

//        Integer a = 1, b = 2;
//        callByReference.incrementInteger(a,b);
//        System.out.println(a + " " + b);
    }

}

