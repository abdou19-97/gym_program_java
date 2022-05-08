import java.util.*;
import java.io.*;

class Abs extends Workout implements Serializable{
    public Abs(){}
    public void workoutInstruction(){
        Scanner input = new Scanner(System.in);
        System.out.println("====Instructions===="                       
       + "\nStep 1: Lie on your back on a mat, knees bent, feet on the floor, and arms crossed over your chest Ensure your neck stays untucked throughout the movement."
       +"\nStep 2: Using your abs, begin to roll your head, neck, and shoulder blades up off the ground." 
       +"\nStep 3: Pause when you reach the top, then slowly lower back down." 
       + "\nStep 4: Complete 15 reps for 3 sets");
    }
   /*
      System.out.println("Do you wanna modify the abs instruction? ");
      if(input.hasNextLine()){
        String modify = input.nextLine();
        if(modify.equals("Yes") || modify.equals("1")){
            System.out.println("Type what do you want change!");
            modify = input.nextLine();
        }
        else{
            return;
        }
      }  
     // super.workoutInstruction();
    }
   */ 
    
}
