import java.util.*;

public class FindXSumleetcode {
    public static void main(String[] args) {
        SolutionFindXSum obj = new SolutionFindXSum();
        int[] nums = new int[]{1000000000,1000000000,1000000000,1000000000,1000000000,1000000000};
        System.out.println(Arrays.toString(obj.findXSum(nums, 6, 1)));
    }
}
class SolutionFindXSum {
    public long[] findXSum(int[] nums, int k, int x) {
        TreeSet<Pair> top = new TreeSet<>();
        TreeSet<Pair> rest = new TreeSet<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<k; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }

        long sum = 0;
        int n = nums.length;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            top.add(new Pair(entry.getValue(), entry.getKey()));
            sum += (long)entry.getValue()*(long)entry.getKey();

            if(top.size() > x){
                sum -= (long)top.first().first()*(long)top.first().second();
                rest.add(top.pollFirst());
            }
        }

        long[] res = new long[n-k+1];
        res[0] = sum;
        for(int i=1; i<n-k+1; i++){
            int addNum = nums[i+k-1], removeNum = nums[i-1];

            if(top.contains(new Pair(freq.get(removeNum), removeNum))){
                top.remove(new Pair(freq.get(removeNum), removeNum));
                freq.put(removeNum, freq.getOrDefault(removeNum, 0)-1);
                if(freq.get(removeNum)>0) top.add(new Pair(freq.get(removeNum), removeNum));
                sum -= (long)removeNum;
            }
            else if(rest.contains(new Pair(freq.get(removeNum), removeNum))){
                rest.remove(new Pair(freq.get(removeNum), removeNum));
                freq.put(removeNum, freq.getOrDefault(removeNum, 0)-1);
                if(freq.get(removeNum) > 0) rest.add(new Pair(freq.get(removeNum), removeNum));
            }

            if(top.contains(new Pair(freq.getOrDefault(addNum, 0), addNum))){
                top.remove(new Pair(freq.getOrDefault(addNum, 0), addNum));
                freq.put(addNum, freq.getOrDefault(addNum, 0)+1);
                top.add(new Pair(freq.get(addNum), addNum));
                sum += (long)addNum;
            }
            else if(rest.contains(new Pair(freq.getOrDefault(addNum, 0), addNum))){
                rest.remove(new Pair(freq.getOrDefault(addNum, 0), addNum));
                freq.put(addNum, freq.getOrDefault(addNum, 0)+1);
                rest.add(new Pair(freq.getOrDefault(addNum, 0), addNum));
            }
            else{
                freq.put(addNum, freq.getOrDefault(addNum, 0)+1);
                rest.add(new Pair(freq.getOrDefault(addNum, 0), addNum));
            }


            if(top.size() > x){
                sum -= (long)top.first().first() * (long)top.first().second();
                rest.add(top.pollFirst());
            }
            else if(top.size() < x && !rest.isEmpty()){
                sum += (long)rest.last().first() * (long)rest.last().second();
                top.add(rest.pollLast());
            }
            else{
                if(!rest.isEmpty() && (top.first().first() < rest.last().first()
                        || (top.first().first() == rest.last().first() && top.first().second() < rest.last().second()))){
                    sum += (long)rest.last().first() * (long)rest.last().second();
                    top.add(rest.pollLast());
                    sum -= (long)top.first().first() * (long)top.first().second();
                    rest.add(top.pollFirst());
                }
            }
            res[i] = sum;
        }
        return res;
    }
    class Pair implements Comparable<Pair>{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
        int first(){
            return this.first;
        }
        int second(){
            return this.second;
        }

        public int compareTo(Pair p){
            if(this.first == p.first) return this.second-p.second;
            return this.first-p.first;
        }
    }
}