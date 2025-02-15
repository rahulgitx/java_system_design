import java.util.*;

public class FractionAdditionAndSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        SolutionFractionAndSubtraction solutionFractionAndSubtraction = new SolutionFractionAndSubtraction();
        System.out.println(solutionFractionAndSubtraction.fractionAddition(s));
    }
}

class SolutionFractionAndSubtraction {
    Integer getNum(StringBuilder s){
        int i = 0;
        boolean isNegative = false;
        if(s.charAt(i) == '-'){
            isNegative = true;
            i++;
        }

        Integer res = 0;
        int m = 1;
        if(s.length()-i > 1) res = 10;
        else res = s.charAt(i)-'0';

        if(isNegative) res = -res;
        System.out.println(s + " " + res);

        return res;
    }
    void toInteger(StringBuilder s, int n){
        if(n < 0) s.append('-');
        Stack<Integer> st = new Stack<>();
        if(n == 0){
            s.append('0'); return;
        }
        while(n > 0){
            st.add(n%10);
            n = n/10;
        }
        while(!st.isEmpty()){
            s.append((char)('0' + st.pop()));
        }
        return;
    }
    public String fractionAddition(String expression) {
        List<Integer> numerators = new ArrayList<>();
        List<Integer> denomenators = new ArrayList<>();

        int i = 0;
        while(i<expression.length()){
            StringBuilder s = new StringBuilder();
            while(expression.charAt(i) != '/'){
                s.append(expression.charAt(i)); i++;
            }
            numerators.add(getNum(s));
            i++;
            StringBuilder s2 = new StringBuilder();
            while(i<expression.length() && (expression.charAt(i) != '+' && expression.charAt(i) != '-')){
                s2.append(expression.charAt(i)); i++;
            }
            denomenators.add(getNum(s2));
        }

        int d = 1;
        for(int den : denomenators){
            d = d*den;
        }
        System.out.println(d);
        int n = 0;

        for(int j=0; j<numerators.size(); j++){
            n += (d/denomenators.get(j))*numerators.get(j);
        }
        System.out.println(n);

        int factor = 2;
        while(factor <= n || factor <= d){
            while(n%factor == 0 && d%factor == 0){
                n = n/factor; d = d/factor;
            }
            factor++;
        }

        StringBuilder res = new StringBuilder();
        toInteger(res, n);
        res.append('/');
        toInteger(res,d);
        return res.toString();
    }
}