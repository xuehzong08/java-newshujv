import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 22826
 * Date: 2026-11-08
 * Time: 15:45
 */

class MyComperetor implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        //o1-o2就是让小的值先出队列（小堆）
        return o1-o2;
        //o2-21就是大的值先出队列（大堆）
        // return o2-o1;
    }
}
class StudentComperetor implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
class Student implements Comparable<Student>{
    int id;
    int age;
    String name;

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //学号小的排前面
        return o.id-this.id;
    }
}
public class Test {
//    public static void main(String[] args) {
//        //这里吧比较器放进参数中
//        PriorityQueue<Integer> queue =new PriorityQueue<>(new MyComperetor());
//        queue.offer(9);
//        queue.offer(2);
//        queue.offer(5);
//        queue.offer(7);
//
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//
//    }



    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>();
        queue.offer(new Student(1,10,"zhangsan"));
        queue.offer(new Student(2,12,"lisi"));
        queue.offer(new Student(3,11,"wangwu"));
        queue.offer(new Student(4,13,"zhaoliu"));

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

}
