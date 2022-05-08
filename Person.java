import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;
import java.io.*;


abstract class Person implements Serializable{
    
    static Scanner input = new Scanner(System.in);
    private String fName;
    private String lName;
    private String gender;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private String age;
    
    public Person(){
       fName = "Jhon";
       lName = "Kennedy";
       phoneNumber = "0";
       emailAddress = "jhonk@gmail.com";
       age = "45";
       this.address = new Address("", "","","","");
    }
    
    public void getName(){
        System.out.println("Enter first name? ");
        fName = input.nextLine();
        System.out.println("Enter last name? ");
        lName = input.nextLine();
    }
    public boolean getGender(){
        boolean genderIdentity = false;
        System.out.println("Gender?");  
        gender = input.nextLine();
        return genderIdentity = (gender.equals("Male") || gender.equals("Female")) ? false : true;
    
    }

    public void getPhoneNumber(){
       while(true){

            System.out.println("Enter phone number: ");
            String rgx = "^((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$";
            phoneNumber = input.nextLine();
            Pattern pattern = Pattern.compile(rgx);
            
            Matcher matcher = pattern.matcher(phoneNumber);
            System.out.println(phoneNumber +" : "+ matcher.matches());
    
            if(pattern.matches(rgx, phoneNumber)){
              System.out.println("You Entered " + String.valueOf(phoneNumber).replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)-$2-$3"));
              break;
            }
            else{
                System.out.println("Wrong entry! try again");
            } 
        }
    }
    public void getEmailAddress(){
        while(true){

        System.out.println("Enter email address: ");
        String rgx = "^(.+)@(.+)$";
        emailAddress = input.nextLine();
        Pattern pattern = Pattern.compile(rgx);
        
        Matcher matcher = pattern.matcher(emailAddress);
        System.out.println(emailAddress +" : "+ matcher.matches());
        
        if(pattern.matches(rgx, emailAddress)){
          System.out.println("Email: " + emailAddress);
          break;
        }
        else{
            System.out.println("Wrong entry! try again");
            
        }
      }
    }
    public void getAddress(){
        address.setAddress();
        System.out.println(address);
    }

    public void getAge(){
        System.out.println("Enter the age: ");
        age = input.nextLine();
        
    }
    
    public String toString(){
        return "First Name: " + fName +
        '\n' + "last Name: " + lName + '\n'+
        "Phone Number: " + phoneNumber + '\n' + "Adress: " +
        address.toString() + '\n'+ "Email Address: "+ emailAddress + "\n" +
        "Age: " + age;

    }
    public void personData(){
        System.out.println("First Name: " + fName + 
        "\nLast Name: " + lName + "\n Home Address: "+address.toString() + "\nPhone Number: " + phoneNumber + 
        "\nEmail Address: " + emailAddress+ "\nAge:"+
        age);
        
    }
    


}
