package December30th2022;

public class Question24 {
    public Question24(){
        System.out.print("A ");
    }
}
class B extends Question24{
    public B (){        //linen1
        System.out.print("B ");
    }
}
class C extends B{
    public C(){         //lin n2
        System.out.print("C ");
    }

    public static void main(String[] args) {
        C c = new C();
    }  // Output===> C) A B C
}
