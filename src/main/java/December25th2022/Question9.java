package December25th2022;

public class Question9 {
    int r;
    Question9(int r) {
        this.r = r;
    }
}
    class DVD extends Question9 {
    int c;
    DVD(int r, int c) {
        super(r);
        this.c = c;
        System.out.println();
    }
            DVD dvd = new DVD(10, 20);
    //  Output ===> C)super (r);
  //                 this.c = c;
    }

