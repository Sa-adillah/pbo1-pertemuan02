import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  String nama;
  int usia;
  double ipk;

  Scanner inputan = new Scanner(System.in);

  System.out.print("Input nama: ");
  nama = inputan.nextLine();

  System.out.print("Input usia: ");
  usia = inputan.nextInt();

  System.out.print("Input ipk: ");
  ipk = inputan.nextDouble();

  System.out.println("Hai "+nama);
  System.out.println("Usia: "+usia);
  System.out.println("ipk: "+ipk);


 }
}