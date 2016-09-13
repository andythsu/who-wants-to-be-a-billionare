/* 
 * who wants to be a millionaire game
 * Andy Su
 * October 6, 2014
 */


import java.util.Random;
import java.util.Scanner;

class summativetest1{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    Random rand=new Random();
    
    
    int response,friends,chance,poll                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ;
    String ans;
    
    friends=0;
    chance=0;
    poll=0;
    
    System.out.println("Welcome to the gama 'who wants to be a millionair'");  // greetings
    System.out.println("Press 1 to start the program"); // instructions
    response = input.nextInt(); // get response
    if (response ==1){ // if user's response = 1 then start the program
      
      // first question
      System.out.println("This is your first question"); // ask the first question
      
      //random question
      for (int i=0;i<1;i++){
        int x = rand.nextInt(3)+1;
        System.out.println(x);
        
        if (x==1){
          System.out.println("2+2=?");
          System.out.println("A=0, B=1, C=2, D=3");
        }else if (x==2){
          System.out.println("1+1=?");
          System.out.println("A=1, B=2, C=3, D=4");
        }else if (x==3){
          System.out.println("3+3=?");
          System.out.println("A=2, B=3, C=4, D=5");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        //lifeline
        if (chance==0){ 
          System.out.println("1 - chance");
        }      
        if (friends==0){
          System.out.println("2 - friends");
        }     
        if (poll==0){
          System.out.println("3 - poll");
        }
        
        
        
        
        
        ans=input.next(); // get the answer
        
        
        
        if (ans.equals("1") && chance==0){
          System.out.println("A or C");
          chance=1;
          ans=input.next();
        }else if(ans.equals("2")&& friends==0){
          System.out.println("A OR C");
          friends=1;
          ans=input.next();
        }else if(ans.equals("3") && poll==0){
          System.out.println("A OR C");
          poll=1;
          ans=input.next();
        }
        
        
        if (ans.equals("C") || ans.equals("c")){ // if ans is correct, jump to the another question
          System.out.println("you earn $100");
        }else{
          System.out.print("you failed"); // if ans is wrong, exit the program
          System.exit(1); // exit the program
        }
      }
    }
  }
}



