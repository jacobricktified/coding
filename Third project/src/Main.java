
/*public int sumation  (int a, int b){
    int a = 1;
    int b = 2;
    int sum = a + b;

    return sum;

}*/
public class Main {


    public static void main(String[] args) {
        BankAccount myaccount = new BankAccount();
        System.out.println(myaccount.balance);
        myaccount.deposit(200);
        System.out.println(myaccount.balance);
        myaccount.withdraw(100);
        System.out.println(myaccount.balance);
        int result = sumation(3,4);
        System.out.println(result);


      int number = 200;
      for (int i = 0; i < number; i++) {
          boolean is_prime = true;
          for (int j = 2; j < i; j++) {
              if (i % j == 0) {
                  is_prime = false;
                  break;

              }
          }
          if (is_prime) {
              System.out.println(i);
          }
      }

      /*int age = 7;
      while (age < 18){
          System.out.println(age);
          age+=1;
      }*/
        /*int pass_mark = 0;
        int i =  0;
        do {
           // System.out.println(i);
            i++;
        }while (i < pass_mark);
        */

       /* int height = 10;
        for(int i=1;i<=height ; i++){
            if (i==6 || i==5 || i==7){
                continue;
            }
            if(i==8){
                break;
            }
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }*/


    }

    public static int sumation  (int a, int b){
        int sum = a + b;

        return sum;

    }
}
