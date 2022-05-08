import java.util.*;
import java.io.*;

class Trainee extends Person implements Serializable {
  
    protected ArrayList<Workout> workouts = new ArrayList<Workout>();
    protected  File file = new File("workOutFile.txt");

    public Trainee(){

    }
   

    public void ReadFile(){

      try {
          FileInputStream fin = new FileInputStream(file);
          ObjectInputStream obi = new ObjectInputStream(fin);
          workouts = (ArrayList<Workout>)obi.readObject();
      }catch (Exception e){
          System.out.println(e.getMessage());
      } // end try


 }

 public void SaveFile(){
            
      
      try{
      FileOutputStream fo = new FileOutputStream(file);
      ObjectOutputStream obo = new ObjectOutputStream(fo);
      obo.writeObject(workouts);
      }catch(Exception e){
      System.out.println(e.getMessage());
      }
       
 } 
 
public void traineeMenu(){
                
      System.out.println("Welcome back Trainee! ");
      String menu = "Choose the action:\n"+
       "1. Check last update\n" +
       "2. Select available workout list\n"+
       "3. exit\n";
      
      while(true){ 
        System.out.println(menu);

        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
            
       
        if(num.equals("1")){
          listCurrentWorkout();
        }
       
        else if(num.equals("2")){
          selectWorkout();
        }
        
        else if(num.equals("3")){
          System.out.println("Are you done for today? (y/n)");  
          char traineeInput = input.next().charAt(0);
          if(traineeInput == 'N' || traineeInput == 'n'){
            continue;
          }
          else
          {
            System.out.print("Have a great day, See you next time!");
            break; 
          }         
        }
             
      }//end while
              
    }//end traineeMenu
   
    public void listCurrentWorkout(){

      for(int i=0; i< workouts.size(); i++){
        workouts.get(i);
        System.out.println(workouts.get(i).currentWorkout());
      }
      System.out.println(workouts.size());
   
  }//end listCurrentWorkout 
    
  //select available workout 
   public void selectWorkout()
    {
      Scanner input = new Scanner(System.in);
      String menu = "Choose the action:\n"+
       "1. Squats\n" +
       "2. Abs\n"+
       "3. PullUp\n"+
       "4. exit\n";
      
      
      System.out.println(menu);
      if(input.hasNextLine()){
        String trainerInput = input.nextLine();
      if(trainerInput.equals("1")){
          Abs a = new Abs();
          workouts.add(a);
          a.workoutInstruction();} 
      else if(trainerInput.equals("2")){
          PullUp p = new PullUp();
          workouts.add(p);
          p.workoutInstruction();}              
      else if(trainerInput.equals("3")){
          Squats s = new Squats();
          workouts.add(s);
          s.workoutInstruction();}
      
      else if(trainerInput.equals("4")){

        System.out.println("See you later");
      
        
  
      }
       
     }
     
   }//end select workout
     


/*

 public boolean traineeLogin(String userLogin){

      if(userLogin.equals(userName)){

          Scanner input = new Scanner(System.in);
          System.out.println("Enter your pass word? ");
        if(input.hasNextLine()){
          if(input.nextLine().equals(password)){

              return true;
          }else{
              System.out.println("Invalid entry try again!");
            }
          }
        }
        return false;
 }

public static void main(String[] args){
        Trainee t = new Trainee();
        t.readFile();
        t.saveFile();
        t.listCurrentWorkout();
 }
*/
}

