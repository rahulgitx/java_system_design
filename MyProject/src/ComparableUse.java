import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableUse {
    public static  void main(String...args){
        List<Pupil> pupilList = new ArrayList<>();
        pupilList.add(new Pupil(3,"a"));
        pupilList.add(new Pupil(9,"b"));
        pupilList.add(new Pupil(4, "c"));
        Collections.sort(pupilList);
        System.out.println(pupilList);
//        Comparator comp = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        }
    }
}

class Pupil implements Comparable<Pupil> {
    public int age;
    public String name;
    Pupil(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


//    @Override
//    public int compareTo(Pupil o) {
//        if(this.age > o.age) return 1;
//        return -1;
//    }


    @Override
    public int compareTo(Pupil that) {
        if(this.age >= that.age) return 1;
        return -1;
    }
}
