import java.util.*;
import java.io.*;


class Main implements Serializable {
    protected ArrayList<Trainee> trainees = new ArrayList<Trainee>();
    protected ArrayList<Workout> workouts = new ArrayList<Workout>();
    protected Trainer trainers;
    protected File file = new File("Trainee.txt");
    protected File file1 = new File("workOutFile.txt");  
    public Main(){}
   
   //read from the trainee file
    public void readTrainee(){

        try {
            FileInputStream fin = new FileInputStream(file);
            ObjectInputStream obi = new ObjectInputStream(fin);
            trainees = (ArrayList<Trainee>)obi.readObject();
        }catch (Exception e){
            System.out.println(e.getMessage());
        } // end try


   }//end readTrainee

 //save to trainee file
  public void saveTrainee(){
                 
        try{
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream obo = new ObjectOutputStream(fo);
        obo.writeObject(trainees);
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
  }//save to trainee

   //read from the workout file
   public void readWorkout(){

      try {
            FileInputStream fin = new FileInputStream(file1);
            ObjectInputStream obi = new ObjectInputStream(fin);
            workouts = (ArrayList<Workout>)obi.readObject();
      }catch (Exception e){
        System.out.println(e.getMessage());
      } // end try
   }//end readWorkout

 //save to workout
  public void saveWorkout(){
                 
      try{
      FileOutputStream fo = new FileOutputStream(file1);
      ObjectOutputStream obo = new ObjectOutputStream(fo);
      obo.writeObject(workouts);
      }catch(Exception e){
      System.out.println(e.getMessage());
      }
  }//save to workout

  //main menu this will ask user either 
  //to sing up or login
  public void mainMenu(){
      System.out.println("Welcome to the workout program!");
      String menu = "Choose the action:\n"+
         "1. Login\n" +
         "2. Sign up\n"+
         "3. exit\n";
      
         while(true){ 
          System.out.println(menu);
  
          Scanner input = new Scanner(System.in);
          String num = input.nextLine();
              
         
          if(num.equals("1")){
             login();
          }
         
          else if(num.equals("2")){
              signUp();
          }
          else if(num.equals("3")){
              System.out.print("See you soon!");
              break;         
          }     
        }   
    }//end mainMenu
    

    public void signUp(){
       
      System.out.println("Welcome to the registration menu!");
     //since the trainee is inherited from the person
     //I override those method and add the output to trainne array
      Trainee t = new Trainee();
      t.getName();
      t.getGender();
      t.getAge();
      t.getPhoneNumber();
      t.getEmailAddress();
      t.getAddress();
      
      trainees.add(t);
      traineeData();
      System.out.println("Trainee added successfully!");
      System.out.println("trainee information: " + Arrays.toString(trainees.toArray()).replace("[", "").replace("]", ""));
  }//end sinUp

  //this method is for saving trainee data in the trainer 
   public void traineeData(){
      Trainer trainers = new Trainer();
      trainers.setTrainee(trainees);
      System.out.println("Print trainee" + trainees);

  }//trainee data
  
   //login
    public boolean login(){
        while(true){
          
          Scanner input = new Scanner(System.in);
          System.out.println("Welcome to the login menu!"+
          "\nPlease enter your email address or userId: ");
          String uid="", pwd="";
          if(input.hasNextLine()){
            uid = input.nextLine();
          System.out.println("Please enter your password: ");
          if(input.hasNextLine())
            pwd = input.nextLine();
          //check if it's trainer otherwise it's a regular user
          if((uid.equals("trainer") || uid.equals("trainer@gym.com")) && pwd.equals("12345"))
          {
            Trainer t = new Trainer();
            t.trainerMenu();
            return false;
          }
          else
          {//trainee
            System.out.println("Trainee recieved");
            Trainee t = new Trainee();
            t.traineeMenu();
            return false;
          }
        } 
        
        else
        {
            System.out.println("Sorry, something went wrong try again!");
        }
        return false;
      }
        
        
 
    }//end login
 
    

   
    public static void main(String[] args){
      Main m = new Main();
      m.readTrainee();
      m.readWorkout();
      m.mainMenu();
      m.saveTrainee();
      m.saveWorkout();
      
   }
     
}
 
