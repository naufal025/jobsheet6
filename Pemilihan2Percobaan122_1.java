import java.util.Scanner;
public class Pemilihan2Percobaan122_1 {
    public static void main(String[] args){
        Scanner input07= new Scanner (System.in);
        int tahun;
       
        System.out.print("Masukkan Tahun : ");
        tahun =input07.nextInt();


        if ((tahun % 4 == 0 && tahun % 100 !=0) || tahun % 400 == 0){
            if ((tahun % 100) != 0 )
                System.out.println("Tahun Kabisat");
        }else{
            System.out.println("Bukan Tahun Kabisat");
        }
    }
    
}