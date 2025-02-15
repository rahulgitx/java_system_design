import java.util.*;

public class Generics {
    public static Map<?, ?> utility(List<Map> list){
        Class<?> classA = null;
        Class<?> classB = null;
        Map<Object, Object> res = new HashMap<>();  // cannot use ? here because it only allows read operations
        for(Map<?, ?> map : list){
            for(Map.Entry<?, ?> entry : map.entrySet()){ // can use both object and ? here
                if(classB == null){
                    classA = entry.getKey().getClass();
                    classB = entry.getValue().getClass();
                }
                else{
                    if(classA != entry.getKey().getClass() || classB != entry.getValue().getClass()) throw new RuntimeException();
                    res.put(entry.getKey(), entry.getValue());
                }
            }
        }
        String a = "sdf";
//        Class<Object> c = a.getClass();
        return res;
    }
    public static void main(String[] args) {
        List<Map> list = new ArrayList<>();
        Map<String, String> mp1 = new HashMap<>();
        mp1.put("acd", "sdds");
        Map<Integer, Integer> mp2 = new HashMap<>();
        mp2.put(2,3);
        list.add(mp1);
        list.add(mp2);

    }
}
