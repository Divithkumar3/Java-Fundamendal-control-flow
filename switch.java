import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            System.out.print("Negative number");
        }
        else if(num>0){
            System.out.print("Positive number");
        }
        else{
            System.out.print("Zero");
        }
//Print the numbers from 1 to the users number:        
        // for(int i=1;i<=num;i++){
        //     System.out.println(i);
        // }


//Print the number from 1 to 3,demonstrate that the block executed at least one         
        // int num=1;
        // do { 
        //     System.out.println(num);
        //     num++;
        // } while (num<=3);

//Print the numbers as down from the users number        
        // int num=sc.nextInt();
        // while(num>0){
        //     System.out.println(num);
        //     num--;
        // }

//Print the weekbased on the number        
        // int day=3;
        // switch(day){
        //     case 0:
        //     System.out.print("Sunday");break;
        //     case 1:
        //     System.out.print("Monday");break;
        //     case 2:
        //     System.out.print("Tuesday");break;
        //     case 3:
        //     System.out.print("Wednesday");break;
        //     case 4:
        //     System.out.print("Thursday");break;
        //     case 5:
        //     System.out.print("Friday");break;
        //     case 6:
        //     System.out.print("Saturday");break;
        //     default:
        //     System.out.print("No day");break;
        // }
    }
}
