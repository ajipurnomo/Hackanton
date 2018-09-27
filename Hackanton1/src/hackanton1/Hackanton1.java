//if menikah then tunjangan = 35% * gaji pokok
//status
//gaji pokok

package hackanton1;
import java.util.Scanner;

public class Hackanton1 {
    public static void main(String[] args) {
        //KAMUS
        int tunjangan;
        int gaji_total;
        //============================================== 
           
        System.out.print("Berapa Gaji Pokok Anda ? Rp.");
        Scanner input1 = new Scanner(System.in);
        String gaji_pokok = input1.next();
        int gajipokok = Integer.valueOf(gaji_pokok);
        System.out.println("Gaji pokok anda adalah Rp."+gaji_pokok);
        
        System.out.println(""); //ENTER
        
        System.out.print("Status Anda (Menikah/Belum Menikah) ? ");
        Scanner input2 = new Scanner(System.in);
        String status = input2.next();
               
        if (status.equals("Menikah")){
            tunjangan = (35 * gajipokok) / 100;
            gaji_total = gajipokok + tunjangan;
            System.out.println("Karena Status Anda "+status+" maka gaji total anda adalah Rp."+gaji_total);
        }//end if
        else if (status.equals("Belum Menikah")) {
            tunjangan = 0;
            gaji_total = gajipokok + tunjangan;
            System.out.println("Karena Status Anda "+status+" maka gaji total anda adalah Rp. "+gaji_total);
        }
                       
               
    } //public static   
}//public class
