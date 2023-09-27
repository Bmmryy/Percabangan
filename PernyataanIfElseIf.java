package percabangan;

import java.util.Scanner;

public class PernyataanIfElseIf {
    public static void main(String[] args) {
         Scanner imp = new Scanner(System.in);
         
         double skorUjian;
         String nilai;
         
         System.out.println("Masukan Nilai Ujian= ");
         skorUjian=imp.nextDouble();
   
         if(skorUjian>=90&&skorUjian<=100){
             nilai="A";
         }
         else if(skorUjian>80&&skorUjian<=90){
             nilai="B";
         }
         else if(skorUjian>70&&skorUjian<=80){
             nilai="C";
         }
         else if(skorUjian>=0&&skorUjian<=70){
             nilai="D";
         }
         else{
             nilai="Invalid";
         }
         System.out.println("Nilai "+nilai);
    }
          
}
