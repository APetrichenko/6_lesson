package oop_st_inheritance;

/**
 * Created by ITHILLEL6 on 07.07.2015.
 */
public class Student extends Person{
    public Student(int id, String sur, int[] marks) {
        super(id);
        this.marks = marks;
        super.print();
    }

    public  void print(){
        super.print();
        System.out.println("Hello, I am student");
    }

    private int[] marks = new int[34];


    public int[] getMarks(){
        System.out.println(this.id);
        return marks;
    }

    public void setMarks(int[] getMarks){
        marks = getMarks;
    }
}
