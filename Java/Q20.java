  //Print all prime numbers between two given numbers. [ break continue ]
  import java.util.*; 
  public class Q20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
              int num1 = sc.nextInt();
               int num2 = sc.nextInt();
      int flag;
      while(num1 <= num2)       {
                flag=0;
              for ( int i=2; i<= num1/2; i++){
   
          if( num1%i == 0){
         flag= 1;
    break;
                          }
              
                                             }  
      if(flag ==0 ){
				System.out.print(num1+ " ");
                   }
                         num1++;
                                }
	}
}


