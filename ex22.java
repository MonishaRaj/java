public class Main {

    public int BinaryToDecimal(int x){

  int deci = 0;

    int b = 0;

    while(true){

      if(x == 0){

        break;

      } else {

          int temp = x%10;

          deci += temp*Math.pow(2, b);

          x = x/10;

          b++;

       }

    }

    return deci;

  }

 

  public static void main(String args[]){

    Main obj = new Main();

    System.out.println("The decimal value of 100 is "+obj.BinaryToDecimal(100));

  }

}