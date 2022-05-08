import java.util.*;
import java.io.*;

class Squats extends Workout implements Serializable{
    public Squats(){}

    public void workoutInstruction(){
        Scanner input = new Scanner(System.in);
        System.out.println("====Instructions====" +
        "\nStep 1: Stand straight with feet hip-width apart."+
        "\nStep 2: Tighten your stomach muscles." +
        "\nStep 3: Lower down, as if sitting in an invisible chair." +
        "\nStep 4: Straighten your legs to lift back up." +
        "\nStep 5: Repeat the movement 4 sets by 12");
   }
   /*
        System.out.println("Do you wanna modify the squats instruction? ");
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

        super.workoutInstruction();
    }
  */
}
