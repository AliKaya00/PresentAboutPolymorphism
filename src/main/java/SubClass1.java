public class SubClass1 extends ParentClass {


     protected void creator(int year) {
        System.out.println("year= " + year);
    }
     protected void status(String value){
        System.out.println("SubClass1 Class icindeki\n" + value.toUpperCase().repeat(2) + "\ncalistirildi");

    }
     protected void notes(String value){
         value = "Override Öğreniyoruz";
        System.out.println("SubClass1 Class icindeki 'notes' calistirildi" + value);
    }
}
