import CIE.*;
import SEE.*;

import SEE.Externals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        Externals[] students = new Externals[n];
        
        for (int i = 0; i < n; i++) {
            students[i] = new Externals();
            
            students[i].inputStudentDetails();
            students[i].inputCIEmarks();
            students[i].inputSEEmarks();
            students[i].calculateFinalMarks();
        }
  
        for (int i = 0; i < n; i++) {
            students[i].displayFinalMarks();
            System.out.println("--------------------------------------------");
        }
    }
}