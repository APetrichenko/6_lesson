package oop_st;

/**
 * Created by ITHILLEL6 on 07.07.2015.
 */
public class Teacher {
    private int id;
    private String surname;
    private double salary;


    public Teacher(int id, String surname, double salary){
        this.id = id;
        this.surname = surname;
        this.salary = salary;

    }

    public int getId(){
        return id;

    }

    public void setId(int id){
        this.id = id;
    }
}

