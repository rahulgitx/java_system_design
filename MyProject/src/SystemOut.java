public class SystemOut {
    public static void main(String...args){
        System.out.println('a');
        System.out.println("a"+'b'+"c");
        System.out.println('a'+'b'+'c');
        System.out.println(1 + 'a'+'b'+'c');
        System.out.println(1 + 'a'+'b'+"c");
        System.out.println(1 + "a" +'b'+"c");
        System.out.println("1" + 'a'+'b'+"c");
        System.out.println("a" +1+2+"c");
        System.out.println("1" + 1 + 'a'+'b'+'c');
        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a==b);
    }
}

