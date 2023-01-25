import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        String [] cars = {"Tata", "Maruthi", "Mahindra"};
        String[][] cars2 = {{"volvo", "BMW", "Audi"},{"Hero", "Yamaha", "Bajaj"}};
        int[] x = {1,2,3,4,5};
        cars[2] = "Bolero";
        x[4]= 6;
        cars2[0][1]=" Opel";
        cars2[1][1]="taxi";
        Array obj= new Array();
       Aarry1 a= new Aarry1();

        System.out.println(cars2[0][1]);
        System.out.println(cars2[1][1]);
        System.out.println(cars[2]);
        System.out.println(x[4]);
        System.out.println(cars.length);
        System.out.println(cars2.length);
        System.out.println(x.length);

        System.out.println(" print method value is : " +obj.getValue());
       System.out.println(" print method value is : " +a.country(1,1));
        System.out.println(" print method value is : " +a.country(0,1));

        }

  public int getValue()
  {
      int[] y= {9,8,7,6,5};

      return y[3];

  }


//        System.out.println(Arrays.deepToString(cars));

//        for (String[] i: cars){
//            System.out.println(i);
//        }

}
class Aarry1 {

   public String country(int a, int b) {
        String[][] country = {{"india","Pakistan","Nepal"}, {"Eruope","America","Brazil"}};
//
//        country [0][1] = " Srilaka";
//        for ( int i=0; j)
return country[a][b];
    }
}