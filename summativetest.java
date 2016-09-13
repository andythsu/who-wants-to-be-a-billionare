/* 
 * who wants to be a millionaire game
 * Andy Su
 * October 6, 2014
 */



import java.util.Scanner;
import java.util.Random;


class summativetest{
  public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    Random rand=new Random();
    int response,expert,chance,poll,Q; // declare variables
    String ans; // declare variables
    
    expert=0; // initialize expert to 0 
    chance=0; // initialize chance to 0
    poll=0; // initialize poll to 0
    Q=0;
    
    System.out.println("Welcome to the gama 'who wants to be a millionair'");  // greetings
    System.out.println("Follow the instructions listed below:"); //instructions
    System.out.println("1. choose one lifeline at a time"); //instructions
    System.out.println("2. cannot browse internet for the answer"); //instructions
    System.out.println("3. if you find questions hard, you can take your money and run by entering 0");; // instructions
    System.out.println("4. an useful hint: save the best (expert) for last (question 15)"); // instructions 
    
    do{ //loop, if the user enters numbers other than 1,2, this loop will keep asking until the user enters 1,2 
      System.out.println(" ");
      System.out.println("Press 1 to start the program , 2 to leave the program"); 
      response = input.nextInt(); // get response
      if (response ==1){ // if user's response = 1 then start the program
        
        // first question
        
        do{ // loop the whole program, if the user doesn't enter the required information, the question will keep going 
          
          System.out.println("This is your first question"); // ask the first question
          
          //random questions
          for (int i=0;i<1;i++){
            int x = rand.nextInt(3)+1;
            if (x==1){
              Q=1;
              System.out.println("1+1=?");
              System.out.println("A=0, B=1, C=2, D=3");
            }else if (x==2){
              Q=2;
              System.out.println("2+2=?");
              System.out.println("A=2, B=3, C=4, D=5");
            }else if (x==3){
              Q=3;
              System.out.println("3+3=?");
              System.out.println("A=4, B=5, C=6, D=7");     
            }
          }
          
          
          
          //lifeline
          if (chance==0){ // if chance's value is 0, output the choice of chance
            System.out.println("1 - chance");// output
          }
          if (expert==0){ // if exoert's value is 0, output the choice of expert
            System.out.println("2 - expert");// output
          }
          if (poll==0){ // if poll's value is 0, output the choice of poll
            System.out.println("3 - poll"); //output
          }
          
          
          ans=input.next(); // get the answer
          
          
          //take money and run
          if (ans.equals("0")){ // if the user types in 0, the program will output the money he/she has earned and exit automatically
            System.out.println("you earned nothing"); // output how much the user has earned
            System.exit(0); // exit code
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){ // if the user types in 1, and the value of chance is also 0, output the chance
            System.out.println("A or C"); // 50% 50% chance
            chance=1; // add another value in chance
            ans=input.next(); // get the user's answer for the question
            
          } else if(ans.equals("2")&& expert==0 && Q==1){ // if the user types in 2, and the value of expert is also 0, output the expert 
            System.out.println("1+1 = 2"); // expert's opinion
            expert=1; // add another value in expert
            ans=input.next(); // get the user's answer for the question
            
          }else if(ans.equals("2")&& expert==0 && Q==2){
            System.out.println("2+2 = 4");
            expert=1;
            ans=input.next();
            
          }else if(ans.equals("2")&& expert==0 && Q==3){
            System.out.println("3+3 = 6");
            expert=1;
            ans=input.next();
            
          }else if(ans.equals("3") && poll==0){ // if the user types in 3, and the value of poll is also 0, output the poll
            System.out.println("A-0% , B-0%, C-100%, D-0%"); // poll
            poll=1; // add another value in poll
            ans=input.next(); // get the user's answer for the question
          }
        
          
          //random answer
          if (!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d")){ // if the the user types in random answer, the system will tell them to enter a valid letter 
            System.out.println("Enter a valid number"); // output the message to inform the user to enter a valid number
            System.out.println(" "); // leave a line so it looks neat 
          }
          
          
          
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d")); // exit the program until the user enters required information      
        
        //answer
        
        if (ans.equals("C") || ans.equals("c")){ // if ans is correct, jump to the another question
          System.out.println("you earn $100"); // output money
        }else{
          System.out.print("you failed"); // if ans is wrong, exit the program
          System.exit(1); // exit the program
        }
        
        // second question
        
        do{
          
          System.out.println("This is your second question");
          
          //random question
          
          for (int i=0;i<1;i++){
            int x = rand.nextInt(3)+1;
            System.out.println(x);
            
            if (x==1){
              Q=1;
              System.out.println("2x2=?");
              System.out.println("A=1, B=2, C=3, D=4");
            }else if (x==2){
              Q=2;
              System.out.println("4x4=?");
              System.out.println("A=20, B=10, C=12, D=16");
            }else if (x==3){
              Q=3;
              System.out.println("6x6=?");
              System.out.println("A=30, B=60, C=50, D=36");
            }
          }
          
          
       
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans = input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 100");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("A or D");
            chance=1;
            ans=input.next();
          
          
          }else if(ans.equals("3") && poll==0){
            System.out.println("A-0%, B-0%, C-0%, D-100%");
            poll=1;
            ans=input.next();
          } else if(ans.equals("2")&& expert==0 && Q==1){ // if the user types in 2, and the value of expert is also 0, output the expert 
            System.out.println("2x2 = 4"); // expert's opinion
            expert=1; // add another value in expert
            ans=input.next(); // get the user's answer for the question
            
          }else if(ans.equals("2")&& expert==0 && Q==2){
            System.out.println("4x4 = 16");
            expert=1;
            ans=input.next();
            
          }else if(ans.equals("2")&& expert==0 && Q==3){
            System.out.println("6x6 = 36");
            expert=1;
            ans=input.next();
          }
          
          //random answer
          if (!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d")){
            System.out.println("Enter a valid number");
            System.out.println(" ");
          }
          
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        //answer
        if (ans.equals("D") || ans.equals("d")){
          System.out.println("you earn $200");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //third question
        
        do{
          
          System.out.println ("This is your third question");
          System.out.println ("1+2+3=?");
          System.out.println ("A=3, B=4, C=5, D=6");
          
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 200");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("C or D");
            chance=1;
            ans=input.next();
          }
          
          if(ans.equals("2")&& expert==0){
            System.out.println("1+2+3 = 6");
            expert=1;
            ans=input.next();
          }
          
          if(ans.equals("3") && poll==0){
            System.out.println("A-0%, B-0%, C-0%, D=100%");
            poll=1;
            ans=input.next();
          }
          
          //random answer
          if (!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d")){
            System.out.println("Enter a valid number");
            System.out.println(" ");
          }
          
          
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        
        //answer
        if (ans.equals("D") || ans.equals("d")){
          System.out.println("you earn $300");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //forth question
        
        do{
          
          System.out.println("This is your forth question");
          System.out.println ("1+2+3+4=?");
          System.out.println("A=10, B=15, C=20, D=-10");
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 300");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("A or D");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("the answer would be positive");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-100%, B-0%, C-0%, D-0%");
            poll=1;
            ans=input.next();
          }
          
          
          
          
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        
        //answer
        if (ans.equals("A") || ans.equals("a")){
          System.out.println("you earn $500");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //fifth question
        
        do{
          System.out.println("This is your fifth question");
          System.out.println("10+15+20+25+30");
          System.out.println("A=50, B=100, C=60, D=120");
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 500");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("B or D");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("3-digits number");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-0%, B-100%, C-0%, D-0%");
            poll=1;
            ans=input.next();
          }
          
          //random answer
          if (!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d")){
            System.out.println("Enter a valid number");
            System.out.println(" ");
          }
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        
        
        //answer
        if (ans.equals("B") || ans.equals("b")){
          System.out.println("you earn $1000");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //sixth question
        do{
          System.out.println ("This is your sixth question");
          System.out.println ("In what year did WW1 begin");
          System.out.println ("A=1910, B=1914, C=1916, D=1915");
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 1000");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("B or C");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("it happened before 1915");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-20%, B-40%, C-20%, D-20%");
            poll=1;
            ans=input.next();
          }
          
          System.out.println("Enter a valid letter");       
          System.out.println(" ");
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        
        //answer
        if (ans.equals("B") || ans.equals("b")){
          System.out.println("you earn $2000");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //seventh question
        
        do{
          System.out.println("This is your seventh question");
          System.out.println("In what year did WW2 begin");
          System.out.println("A=1920, B=1930, C=1939, D=1945");
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 2000");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("A or C");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("it happened after 1930");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-10%, B-30%, C-60%, D-0%");
            poll=1;
            ans=input.next();
          }
          
          //random answer
          if (!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d")){
            System.out.println("Enter a valid number");
            System.out.println(" ");
          }
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        //answer
        if (ans.equals("C") || ans.equals("c")){
          System.out.println("you earn $4000");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //Eighth question
        do{
          System.out.println("This is your eighth question");
          System.out.println("When did Canada become a country");
          System.out.println("A=June 25, 1930  B=July1, 1867  C=August 31, 1867  D=June1, 1867");
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 4000");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("A or B");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("it was on 1867, July 1 when Canada became a country");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-25%, B-25%, C-25%, D-25%");
            poll=1;
            ans=input.next();
          }
          
          System.out.println("Enter a valid letter");   
          System.out.println(" ");
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        
        //answer
        if (ans.equals("B") || ans.equals("b")){
          System.out.println("you earn $8000");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //nineth question
        do{
          System.out.println("This is your nineth question");
          System.out.println("When did Canada get its flag");
          System.out.println("A=In 1900, B=In 1940, C=In 1965, D=In 1980");
          
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 8000");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("C or D");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("Canada got its own flag in 1965");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-0%, B-0%, C-50%, D-50%");
            poll=1;
            ans=input.next();
          }
          
          System.out.println("Enter a valid letter");     
          System.out.println(" ");
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        
        //answer
        if (ans.equals("C") || ans.equals("c")){
          System.out.println("you earn $16,000");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //tenth question
        do{
          System.out.println("This is your tenth question");
          System.out.println("In what year did the civil war start");
          System.out.println("A=1900, B=1860, C=1861, D=1850");
          
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 16,000");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("A or C");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("civil war happened after 1860");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-30%, B-10%, C-50%, D-10%");
            poll=1;
            ans=input.next();
          }
          
          System.out.println("Enter a valid letter");  
          System.out.println(" ");
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        //answer
        if (ans.equals("C") || ans.equals("c")){
          System.out.println("you earn $32,000");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //eleventh question
        do{
          System.out.println("This is your eleventh question");       
          System.out.println("How many letters does the alphabet contain");
          System.out.println("A=20, B=30, C=26, D=24");
          
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 32,000");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("C or D");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-0%, B-0%, C-100%, D-0%");
            poll=1;
            ans=input.next();
          }
          
          System.out.println("Enter a valid letter"); 
          System.out.println(" ");
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        
        //answer
        if (ans.equals("C") || ans.equals("c")){
          System.out.println("you earn $64,000");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //twelfth question
        do{
          System.out.println("This is your twelfth question");
          System.out.println("How many questions you have attempted have the answer of C");
          System.out.println("A= 7, B= 6, C= 5, D= 8");
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 64,000");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("A or C");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("go back and count");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-30%, B-40%, C-20%, D-10%");
            poll=1;
            ans=input.next();
          }
          
          System.out.println("Enter a valid letter"); 
          System.out.println(" ");
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        //answer    
        if (ans.equals("C") || ans.equals("c")){
          System.out.println("you earn $125,000");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //thirteenth question
        do{
          System.out.println("This is your thirteenth question");
          System.out.println("What can't you do in Minecraft");
          System.out.println("A=dive, B=fly, C=teleport, D=commit suicide");
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 125,000");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("A or C");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("Go play Minecraft");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-30%, B-20%, C-20%, D-30%");
            poll=1;
            ans=input.next();
          }
          
          System.out.println("Enter a valid letter");   
          System.out.println(" ");
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        //answer
        if (ans.equals("A") || ans.equals("a")){
          System.out.println("you earn $250,000");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //forteenth question
        do{
          System.out.println("This is your forteenth question");
          System.out.println("What is the most cooldown reduction can you get in League of Legends");
          System.out.println("A=20%, B=30%, C=40%, D=50%");
          
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 250,000");
            System.exit(0);
          }
          
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("C or D");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("you can't have more than 50% cooldown reduction in League of Legends");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-20%, B-20%, C-60%, D-0%");
            poll=1;
            ans=input.next();
          }
          
          //random answer
          if (!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d")){
            System.out.println("Enter a valid number");
            System.out.println(" ");
          }
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        //answer
        if (ans.equals("C") || ans.equals("c")){
          System.out.println("You earn $500,000");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
        
        //fifteenth question
        do{
          System.out.println("This is your fifteenth question");
          System.out.println("Do you think you can be a millionaire");
          System.out.println("A=Yes, B=No, C=Maybe, D=I dont want to be a millionaire");
          
          
          //lifeline
          if (chance==0){ 
            System.out.println("1 - chance");
          }      
          if (expert==0){
            System.out.println("2 - expert");
          }     
          if (poll==0){
            System.out.println("3 - poll");
          }
          
          ans=input.next();
          
          //take money and run
          if (ans.equals("0")){
            System.out.println("you earned 500,000");
            System.exit(0);
          }
          //lifeline choices
          if (ans.equals("1") && chance==0){
            System.out.println("none of the above");
            chance=1;
            ans=input.next();
          }   
          if(ans.equals("2")&& expert==0){
            System.out.println("Enter the designer's date of birth");
            expert=1;
            ans=input.next();
          }    
          if(ans.equals("3") && poll==0){
            System.out.println("A-0%, B-0%, C-0%, D-0%");
            poll=1;
            ans=input.next();
          }
          //random answer
          if (!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d")){
            System.out.println("Enter a valid number");
            System.out.println(" ");
          }
        }while(!ans.equals("C") && !ans.equals("c") && !ans.equals("a")&& !ans.equals("A") && !ans.equals("B") && !ans.equals("b") && !ans.equals("D") && !ans.equals("d"));
        
        
        //answer
        if(ans.equals("0515")){
          System.out.println("You earn $1,000,000!!!!!!!");
        }else{
          System.out.print("you failed");
          System.exit(1);
        }
      }
      
      if (response == 2){
        System.out.println("Good Bye");
      }
      
    }while(response != 2); // leave the program if the user enters 2 at the beginning
  }
}

