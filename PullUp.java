import java.util.*;
import java.io.*;

class PullUp extends Workout implements Serializable {

    public PullUp(){}

    public void workoutInstruction(){
        Scanner input = new Scanner(System.in);
        System.out.println("====Instructions====" +
        "\nStep 1: Grab The Bar. Grip it about shoulder-width apart."+
        "\nStep 2: Hang. Raise your feet off the floor by bending your knees." +
        "\nStep 3: Pull. Pull yourself up by pulling your elbows down to the floor." +
        "\nStep 4: Pass The bar. Pull yourself all the way up until your chin passes the bar." +
        "\nStep 5: Repeat the movement 3 sets by 12");
     }
   /*
        System.out.println("Do you wanna modify the pull up instruction? ");
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
