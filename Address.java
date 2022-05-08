import java.util.*;
import java.util.regex.Pattern;
import java.io.*;

class Address implements Serializable{
    Scanner input = new Scanner(System.in);
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;

    public Address(String addr1,String addr2,
            String cit, String stat, String zip)
    {
        
        this.address1 = addr1;
        this.address2 = addr2;
        this.city = cit;
        this.state = stat;
        this.zipcode = zip;
    }

    public void setAddress(){
    while(true){
        System.out.println("Enter your address line1: ");
        address1 = input.nextLine();
        System.out.println("Enter your address line2: ");
        address2 = input.nextLine();
        System.out.println("Enter the city: ");
        city = input.nextLine();
        System.out.println("Enter the state: ");
        state = input.nextLine();
        System.out.println("Enter Zip Code: ");
        zipcode = input.nextLine();
        String rgx = "^[0-9]{5}(?:-[0-9]{4})?$";
        Pattern pattern = Pattern.compile(rgx);

        if(address1.equals("") && city.equals("") && state.equals("") && zipcode.equals("")){
            System.out.println("Woops, something went wrong try again!");
        }
        
        else if(pattern.matches(rgx, zipcode)){
            System.out.println("Zip:" + zipcode);
            break;
        }
        else{
            System.out.println("Well received! ");
            break;
        }
     }

   }
   
    public String toString()
    {
        if(address2.equals("") && zipcode.equals(""))
        {
            return (
                 address1 +"\n" + city + ", "+ state + 
                    " " + zipcode);
        }
        else
        {
            return(address1 +"\n" + address2 + "\n" +
                city + ", "+ state + " " + zipcode);
        }
    }
    
    public void printAddress(){
        System.out.println("Address line1: " + address1
        + "\nAddress line2: " + address2 + "\nCity: " + city + 
        "\nState: " + state + "\nZip Code: " + zipcode);
        
    }


}
