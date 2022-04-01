package my;
import java.util.*;
public class Books {
	public static void main(String args[]) {
		String Bookname, Authorname, Beyt;
int cost, count, user_choice;

Scanner input = new Scanner(System.in);
System.out.println("Enter choice 1 in book list:");
user_choice = input.nextInt();
boolean quit=false;
int cou = 1;
do {
    if (cou > 5) {
        System.out.println("you con buy more books");
    }
    switch (user_choice) {
        case 1:
            System.out.println("Available BOOKS in the Store you can see");
            LinkedList<String> bk = new LinkedList<>();
            bk.add("yes");
            System.out.println(bk);
      
            String t = input.next();
   
               if(t.equals("yes")){
                    LinkedList<String> English = new LinkedList<>();
                    English.add("Time Machine");
                    English.add("A passage to India");
                    English.add("The Discovery of India");
                    English.add("An Autobiography");
                    English.add("Annihilation of Caste");
                    English.add("Pakistan Or Partition Of India");
                    English.add("Forty Nine Days");
                    English.add("Turning Point");
                    English.add("The Life Tree");
                    English.add("India My Dream");
                    English.add(" India 2020, Mission India");
                    English.add("Spirit of India");
                    English.add("Thoughts for Change");
                    English.add("Wings of Fire");
                    English.add("My Experiments with Truth");
                    
                    System.out.println(English);
                    System.out.println("Enter the book name see detail");
                    String nn = input.next();

                    if(nn.equals("Time_Machine")){
                    	Bookname="Time Machine";
                    	Authorname="H.G. Wells";
                    	cost=150;    
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("A passage to India")){
                    	Bookname="A passage to India";
                    	Authorname="E.M.Forster";
                    	cost=150;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("The Discovery of India")){
                    	Bookname="The Discovery of India";
                    	Authorname=" Jawaharlal Nehru";
                    	cost=350;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

}
                    else if(nn.equals("An Autobiography")){
                    	Bookname="An Autobiography";
                    	Authorname="Mahatma Gandhi";
                    	cost=180;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("Annihilation of Caste")) {
                    	Bookname="Annihilation of Caste";
                    	Authorname="B.R. Ambedkar";
                    	cost=249;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("Pakistan Or Partition Of India")){
                    	Bookname="Pakistan Or Partition Of India";
                    	Authorname="B.R. Ambedkar";
                    	cost=358;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("Forty Nine Days")){
                    	Bookname="Forty Nine Days";
                    	Authorname="Amrita Pritam";
                    	cost=286;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("Turning Point")){
                    	Bookname="Turning Point";
                    	Authorname="A.P.J. Abdul Kalam";
                    	cost=340;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("The Life Tree")){
                    	Bookname="The Life Tree";
                    	Authorname="A.P.J. Abdul Kalam";
                    	cost=320;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("India My Dream")){
                    	Bookname=" India My Dream";
                    	Authorname="A.P.J. Abdul Kalam";
                    	cost=450;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals(" India 2020, Mission India")){
                    	Bookname=" India 2020, Mission India";
                    	Authorname="A.P.J. Abdul Kalam";
                    	cost=415;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("Spirit of India")){
                    	Bookname="Spirit of India";
                    	Authorname="A.P.J. Abdul Kalam";
                    	cost=386;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("Thoughts for Change")){
                    	Bookname=" Thoughts for Change";
                    	Authorname="A.P.J. Abdul Kalam";
                    	cost=285;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("Wings of Fire")){
                    	Bookname="Wings of Fire";
                    	Authorname="A.P.J. Abdul Kalam";
                    	cost=150;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("My Experiments with Truth")){
                    	Bookname="My Experiments with Truth";
                    	Authorname="Mahatma Gandhi";
                    	cost=220;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals("My Days")){
                    	Bookname="My Days";
                    	Authorname="R.K. Narayanan";
                    	cost=150;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
                    else if(nn.equals(" The Bachelors of Art")){
                    	Bookname="The Bachelors of Art";
                    	Authorname="R.K. Narayanan";
                    	cost=150;
                    	 System.out.println("Bookname:"+Bookname);
                         System.out.println("Authorname:"+Authorname);
                         System.out.println("cost:"+cost);

                    }
              }
                System.out.println("you buy book yes or no");
                Beyt = input.next();
                 if (Beyt.equals("yes"))
                 {
                     if(Beyt.equals("yes")){
                         System.out.println("Enter the book count:");
                        count=input.nextInt();
                        int discount=18;

                                  System.out.println("this book discount 10%");
                                  int dis=100-discount;
                                  cost=100;
                                  int sum=(dis*cost)/100;
                                  int co=sum*count;
                                  System.out.println("Book cost:"+co+".");
                                  System.out.println("you Successfully Buy!!!");
                                  }


                }
                 else {
                     System.out.println("you need book name will be enter");
                     Bookname=input.next();
                  System.out.println("Enter the Book author name:");
                     Authorname=input.next();
                     System.out.println("Enter the phone number and you expert book in available i can send the notification");
                     Long number=input.nextLong();
                          System.out.println(Bookname+"\n"+Authorname+"\n"+number);


                 }
                 System.out.println("your order successfully.book delivery for after two days\nThank you for visiting us!have a great day");
                 
             }
}while (!quit);

}
}


