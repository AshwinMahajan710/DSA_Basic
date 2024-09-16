// import java.util.Collections;
import java.util.PriorityQueue;
/**
 * Student
 */
class Student implements Comparable<Student>{

    int marks;
    String name;
    Student(int marks,String name){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "Student name :- "+this.name + ", Marks :- "+ this.marks;
    }

    @Override
    public int compareTo(Student that) {
        // TODO Auto-generated method stub
        return this.marks - that.marks; // Sorts in the ascending order
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student that = (Student) obj;
            if(this.marks==that.marks && (this.name.compareTo(that.name))==0){
                return true;
            }
        }
        return false;
    }
}
public class Priority {
    public static void main(String[] args) {
        // Min Priority queue
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // pq.offer(1);
        // pq.offer(2);
        // pq.offer(10);
        // pq.offer(0);
        // System.out.println(pq.peek());        

        // Max Priority queue
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // pq.offer(1);
        // pq.offer(2);
        // pq.offer(10);
        // pq.offer(0);
        // System.out.println(pq.peek());

        // pq.poll() --> remove
        // pq.contains(10) --> check 10 present or not
        
        // Custom class priority queue
        // This code internally contains sorting comparable interface .. while understanding it visit to the class Student
        PriorityQueue<Student> myStudent = new PriorityQueue<>();
        myStudent.offer(new Student(90, "Ashwin"));
        myStudent.offer(new Student(99, "Saurabh"));
        myStudent.offer(new Student(100, "Dada"));
        // System.out.println(myStudent.peek()); // Without comparable interface gives error
        System.out.println(myStudent.contains(new Student(90, "Ashwin"))); // This will give false even if the following is present in the PQ

    }
}
