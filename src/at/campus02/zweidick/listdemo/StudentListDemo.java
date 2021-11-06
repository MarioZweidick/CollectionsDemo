package at.campus02.zweidick.listdemo;

import java.util.ArrayList;

public class StudentListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList<>();

        students.add("Zweidick");
        students.add("Pontasch");
        students.add("Murko");
        students.add("Sallmann");
        students.add("Schober");

        students.remove("Sallmann");

        if(students.contains("Zweidick"))
            System.out.println("Zweidick ist in der Liste!");

        printStudents(students);
    }

   public static void printStudents(ArrayList<String> studentList)
   {
       //mit iter macht er automatisch eine For-Each-SChleife!
       for (String student : studentList)
       {
           System.out.println("student = " + student);
       }
       System.out.println("-----------------");
   }
}
