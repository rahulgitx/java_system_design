public class StringAndStringBuilder {
    public static StringBuilder func(int a){
        if(a == 0) return new StringBuilder("zero");
        StringBuilder res = new StringBuilder();
        res.append("asdf");
        return res;
    }
    public static void main(String[] args) {
        StringBuilder abc = new StringBuilder("asd");
        abc.append(func(4));
        abc.length();
        int[] in = new int[]{1,3};
        String[] str = new String[]{"abc", "asd"};
        String s = "asdc";
        s += "asdfs";

        String sCompare = "abc";
        if(sCompare == "abc") System.out.println("equal");
    }
}
