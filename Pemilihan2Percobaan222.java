import java.util.Scanner;

public class Pemilihan2Percobaan222 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        System.out.print("Masukkan sudut 1 : ");
        float sudut1 = input22.nextFloat();
        System.out.print("Masukkan sudut 2 : ");
        float sudut2 = input22.nextFloat();
        System.out.print("Masukkan sudut 3 : ");
        float sudut3 = input22.nextFloat();
        float totalSudut = sudut1 + sudut2+sudut3;

        System.out.println("Total sudut : " + totalSudut );

        if (totalSudut == 180){
            if ((sudut1 == 90 ) || (sudut2 == 90) || (sudut3 == 90) ){
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else {
                System.out.println("Segitiga tersebut bukan segitiga siku-siku");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
    
}
