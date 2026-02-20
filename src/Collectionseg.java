// Build a simple Student Marks System:


import java.util.HashMap;
import java.util.ArrayList;

public class Collectionseg {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("Rahul", 98);
        students.put("Vishnu", 97);
        students.put("Mohan", 90);
        students.put("Sara", 87);
        students.put("Raj", 60);

        for(String student : students.keySet() ) {
            System.out.println(student + " scored " +students.get(student));
        }

        ArrayList<String> passed = new ArrayList<>();
      //  int total_num = 0;                 no need to do this, .size() returns the size
        for(String pass: students.keySet()) {
            if(students.get(pass) >= 75) {
                passed.add(pass);
               // total_num = total_num + 1;
            }
        }
        System.out.println("---------------Passed students---------------------------");
        System.out.println(passed);
       // System.out.println("Total number of passed: " +total_num);   below improvement
        System.out.println("Total number of passed: " +passed.size());
    }
}
