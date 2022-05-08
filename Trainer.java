import java.util.*;
import java.io.*;

class Trainer extends Person implements Serializable{
    protected ArrayList<Trainee> trainees = new ArrayList<Trainee>();
    protected ArrayList<Workout> workouts = new ArrayList<Workout>();
    protected  File file = new File("workOutFile.txt");
    
    public Trainer(){}
    
  //set trainee
    public void setTrainee(ArrayList<Trainee> t){
      this.trainees = t;
     }
  
    public void ReadFile(){

        try {
            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream obi = new ObjectInputStream(fin);
            workouts = (ArrayList<Workout>)obi.readObject();
        }catch (Exception e){
            System.out.println(e.getMessage());
        } // end try


   }//end readFile 
   public void SaveFile(){
              
        
        try{
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream obo = new ObjectOutputStream(fo);
        obo.writeObject(workouts);
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
         
   } 

  public void trainerMenu(){
        while(true){
            System.out.println("Hello Trainer, Choose the action:\n"
            +"1.list all Trainees\n2.remove Trainee"
            +"\n3.list the workout" 
            +"\n4.update workout" +"\n5.exit");
            Scanner input = new Scanner(System.in);
            if(input.hasNextLine()){
              String trainerInput = input.nextLine();
              if(trainerInput.equals("1")){
                listTrainee();} 
              else if(trainerInput.equals("2")){
                deletAccount();}   
              else if(trainerInput.equals("3")){
                listWorkout();}
                                        
              else if(trainerInput.equals("4")){
                updateWorkout();
              }
              else if(trainerInput.equals("5")){
                System.out.println("See you later:)");
                break;}
              else{
                  System.out.println("Something went wrong try again!");}
            }
          }

    }
    
  
    public void listTrainee(){
      System.out.println("List trainee:");
      for (int i=0;i<trainees.size();i++){
        System.out.println("["+i+"]"
        +trainees.get(i).toString());
      }
      System.out.println(trainees.size());
    }
   
    public void listWorkout(){
      System.out.println("Workout list!");
      for(int i=0; i<workouts.size();i++){
        workouts.get(i).workoutInstruction();
      }
      System.out.println(workouts.size());
    }
/*
    public void changeWorkoutInstruction(){
     Scanner input = new Scanner(System.in);
     System.out.println("Welcome to the workout worout instruction menu!");
     System.out.println("Choose the action:\n"
     +"1.Abs\n2.pull-UP"
     +"\n3.Squaats" +"\n4.exit");
     if(input.hasNextLine()){
      String trainerInput = input.nextLine();
      if(trainerInput.equals("1")){
        Abs a = new Abs();
        workouts.add(a);
        listWorkout();} 
      else if(trainerInput.equals("2")){
        PullUp p = new PullUp();
        workouts.add(p);
        listWorkout();}              
      else if(trainerInput.equals("3")){
        Squats s = new Squats();
        workouts.add(s);
        listWorkout();}
    
      else if(trainerInput.equals("4")){
        System.out.println("See you later");
      }

     }
    
    }
*/
   //make an update to workout
    public void updateWorkout(){
      System.out.println("What do you wana moidfy!");
      String menu = "Choose the action:\n"+
        "1. add a new workout\n"+
        "2. delete workout\n"+
        "3. exit";
      
      while(true){ 
        System.out.println(menu);

        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
            
       
        if(num.equals("1")){
           addWorkout();
        }
       
        else if(num.equals("2")){
            removeWorkout();
        }
        
        else if(num.equals("3")){
            System.out.print("See you soon!");
            break;         
        }
             
      }
    }//end updateWorkout

   
    public void addWorkout(){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the workout name");
      if (input.hasNextLine()){
        String name = input.nextLine();
        System.out.println("What is the insturction? ");
        String insturction = input.nextLine();
        Workout w = new Workout(name, insturction);
        workouts.add(w);
        System.out.println("workout element added successfully!");
       }else{
         System.out.println("Woops! Something went wrong!");
         return;
       }


    }//end add workout
    
      
    public void removeWorkout(){
    listWorkout();
    System.out.println("which one would you delete? ");
    Scanner sc = new Scanner(System.in);
    if(sc.hasNextInt()){
      int i=sc.nextInt();
      if(i>=0&&i<workouts.size())
        workouts.remove(i);
      else
        System.out.println("index given is out of bound");
    }else{
      System.out.println("give me an integer!!");
    }

 }//end removeWorkout


  public void deletAccount(){
      listTrainee();
      System.out.println("Delete account!");
      Scanner input = new Scanner(System.in);
      if(input.hasNextInt()){
        int i=input.nextInt();
        if(i>=0&&i<trainees.size())
          trainees.remove(i);
          System.out.println("This account is no longer exist in the system!");  
          
        }
        else{
          System.out.println("Opps something went wrong try again later!");
        }
  }//end delelteAccount

}
