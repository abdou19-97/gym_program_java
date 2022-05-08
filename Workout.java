import java.util.*;
import java.io.*;

class Workout implements Serializable {
    protected String name, instruction;
    
   public Workout(){}

   public Workout(String n, String i){
      this.name = n;
      this.instruction = i;
   }

   
    public String currentWorkout(){
       return "Workout name " + name + " Instruction " + instruction;
   }

   public void workoutInstruction(){
     // System.out.println("Workout Instruction");
   }
      

}
