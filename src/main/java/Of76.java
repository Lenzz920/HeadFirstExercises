import java.sql.SQLException;
import java.sql.Wrapper;

public class Of76 extends Clowns {
    public static void main(String[] args) {
        Nose []i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();
        for(int x = 0; x < 3; x++) {
            System.out.println(i[x].iMethod() + " " + i[x].getClass());
        }
    }
}

 class TestBox {
    private Integer i;
    private int j;

     public static void main(String[] args) {
         TestBox t = new TestBox();
         t.go();
     }

         public void go() {
             j = i;
             System.out.println(j);
             System.out.println(i);
         }
     }