public class SubClass2 extends ParentClass{

    protected void creator(){
      //  super.creator();
        System.out.println("SubClass2 class icindeki ilk 'creator' calistirildi");
    }

    protected void creator(String value){
        System.out.println("SubClass2 Class icindeki 'creator' calistirildi");

    }
    protected void status(int rakam, String value){
        System.out.println("SubClass2 Class icindeki 'status'" + rakam +value +" calıstırıldı");

    }
    protected void notes(){
       System.out.println("SubCass2 Class icindeki 'notes' calistirildi");

    }

}

