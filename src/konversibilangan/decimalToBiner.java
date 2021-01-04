package konversibilangan;

import java.util.Scanner;

public class  decimalToBiner {
    
void decimalToBiner(int a){
    if (a > 1){
        decimalToBiner(a/2);
    }
        System.out.print (a % 2);
    }
public static void main(String[] args) {
  decimalToBiner bd = new decimalToBiner();
System.out.println(" 1. Desimal ke Biner\n 2. Biner ke Desimal\n");
System.out.print("Masukkan Pilihan: ");
Scanner input = new Scanner(System.in);

switch (input.nextInt()){
    case 1:
        System.out.print("Masukkan bil.Desimal: ");
        Scanner desimal = new Scanner(System.in);
        String biner =
        Integer.toBinaryString(desimal.nextInt());
        System.out.println("Hasil: "+biner);
        int inputInt = desimal.nextInt();
        System.out.print("Hasil: ");
        bd.decimalToBiner(inputInt);
System.out.print("\n");
break;
//jika di buat di sambungkan dengan case
   default:
        System.out.println("\n= Biner ke Desimal =");
        System.out.print("Masukkan bil.Biner: ");
        Scanner inputBiner = new Scanner(System.in);
        int result = Integer.parseInt(inputBiner.nextLine(),
            2); //radix 2 (biner)
        System.out.println("Hasil: "+result);
 //       System.out.println("Desimal: " + bd.decimalToBiner(inputBiner.nextLine()));
        break;
        }
}
}    

