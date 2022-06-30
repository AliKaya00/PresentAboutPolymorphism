
import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args) {

//1.
        ParentClass obje = new ParentClass();
        obje.creator();

        /**Hem data türü hem de Constructor aynı classtaysa o classtaki metodu çağırır.

        /******************************************/

//2.
        SubClass1 obje2 = new SubClass1();
        obje2.status("Overrıde"); ///

        /** Bu şekilde constructor içine variable yazarak
        /** ve bunu metod içinde belirterek istediğimiz constructor metodu çağırabiliriz.

        /******************************************/

//3.
        // SubClass1 obje3= new SubClass2(); //Aralarında sub-parent bağı olmadığından çalışmaz*/


//4.
        ParentClass obje4= new SubClass2();
        ((SubClass2)obje4).creator("4.2");


        /** Bu şekilde data türünü parent classlardan ve consturctor child classlardan
        verirsek önce child classta locators metodunu arar bulursa onu override edilmiş sayar
        ve çalıştırır.

        /******************************************/

//5.
        ParentClass obje5 = new ParentClass();
        obje5.variable1= 5;

        /**Final anahtar sözcüğü bir ifadeyi değiştirilemez yapar.*/



    }

//6.
        /** OVERLOADING */

        public void overLoading(){

        }

        public void overLoading(int yıl){
            System.out.println("Please enter your age: " + yıl);

        }
        public void overLoading ( double hissedilenYıl)
        { //int hissedilenYıl'a izin vermez.
        //Farklı bir primitive type ya da dönüş tiplerine ihtiyacı var.

            System.out.println("Please insert a number: ");
            Scanner scanner = new Scanner(System.in);
            System.out.println(scanner);
            hissedilenYıl =scanner.nextDouble();
            for( int i = 0; i< 10; i++) hissedilenYıl += i;
            System.out.println(hissedilenYıl);

            }
        }

