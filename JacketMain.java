
package praktikumbab5;
import java.util.*;

public class JacketMain {
    

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("CV. Labkomdas");
        System.out.println("Pilihan : \n1.Jacket A\n2.Jacket B\n3.Jacket C");
        System.out.print("Your Order : ");
        int Selection=in.nextInt();
        System.out.print("How Much? : ");
        int i = in.nextInt();
        Jacket one = new Jacket(Selection, i);
        System.out.println("Total Payment = Rp."+one.getHarga());
    }
}


