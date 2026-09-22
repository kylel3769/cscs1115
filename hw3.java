import java.util.*;

public class Main
{
    static String autoCheck(int f ,int l, int i,String w){
        if(w.equals("and")){
            if(i%f == 0 && i%l == 0){
                return i + " is divisible by " + f + " and " + l;
            } else{
                return i + " is not divisible by " + f + " and " + l; 
            }
        } else{
            if(i%f == 0 || i%l == 0){
                return i + " is divisible by " + f + " or " + l;
            } else{
                return i + " is not divisible by " + f + " or " + l; 
            }
        }
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    // initialising variables 
	    int i = scan.nextInt();
	    boolean a;
	    boolean b;
	    boolean c;
	    
	    // making a variable for each of the divisible numbers
	    if(i%2 == 0){
	        a = true;
	    }else {
	        a = false;
	    }
	    if(i%3 == 0){
	        b = true;
	    }else {
	        b = false;
	    }
	    if(i%2 == 0){
	        c = true;
	    }else {
	        c = false;
	    }
	    
	    // outputs based of if and else statements
	    if(a&&b&&c){
	        System.out.println(i + " is divisible by 2,3 and 5");
	    } else{
	        System.out.println(i + " is not divisible by 2,3 and 5");
	        System.out.println(autoCheck(2,3,i,"and"));
	        System.out.println(autoCheck(2,5,i,"and"));
	        System.out.println(autoCheck(3,5,i,"and"));
	        System.out.println(autoCheck(2,3,i,"or"));
	        System.out.println(autoCheck(2,5,i,"or"));
	        System.out.println(autoCheck(3,5,i,"or"));
	        if(a){
	            System.out.println(i + " is divisible by 2");
	        }else{
	            System.out.println(i + " is not divisible by 2");
	        }
	        if(b){
	            System.out.println(i + " is divisible by 3");
	        }else{
	            System.out.println(i + " is not divisible by 3");
	        }
	        if(c){
	            System.out.println(i + " is divisible by 5");
	        }else{
	            System.out.println(i + " is not divisible by 5");
	        }
	    }
	}
}



/*
18 is divisible by 2,3 and 5

20 is not divisible by 3 and 5
20 is divisible by 2 or 3
20 is divisible by 2 or 5
20 is divisible by 3 or 5
20 is divisible by 2
20 is not divisible by 3
20 is divisible by 5

19 is not divisible by 3 and 5
19 is not divisible by 2 or 3
19 is not divisible by 2 or 5
19 is not divisible by 3 or 5
19 is not divisible by 2
19 is not divisible by 3
19 is not divisible by 5

45 is not divisible by 2,3 and 5
45 is not divisible by 2 and 3
45 is not divisible by 2 and 5
45 is not divisible by 3 and 5
45 is divisible by 2 or 3
45 is not divisible by 2 or 5
45 is divisible by 3 or 5
45 is not divisible by 2
45 is divisible by 3
45 is not divisible by 5

90 is divisible by 2,3 and 5
*/
