import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUse {
    public static void main(String...args){
        List<Student> list = new ArrayList<>();
        list.add(new Student(20, "amit"));
        list.add(new Student(19, "parul"));
        list.add(new Student(21, "Sheryl"));
        list.add(new Student(21, "Abhishek"));

        Comparator<Student> compStud = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.age >= o2.age) return 1;
                return -1;
            }
        };
        Collections.sort(list, (a, b) -> a.age >= b.age ? 1 : -1);

        for(Student stud : list){
            System.out.println(stud);
        }
        Comparable<Student> compStuds = new Comparable<Student>() {
            @Override
            public int compareTo(Student o) {
                return 0;
            }

        };
        int[] arr = new int[]{12,3};
        Collections.sort(list, compStud);
        Comparator<int[]> compArr = new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] > o2[0]) return 1;
                else if(o1[0] == o2[0]){
                    if(o1[1] > o2[1]) return 1;
                }
                return -1;
            }
        };
        int[][] arr2 = new int[][]{{2,0},{1,2},{1,3}};
        Arrays.sort(arr2, compArr);
        for(int i=0; i<3; i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
}

class Student{
    public int age;
    public String name;
    Student(int age, String name){
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
}
