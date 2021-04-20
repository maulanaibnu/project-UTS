package uts;
import java.util.Scanner;
public class nomor2 {
    public static void printMatriks(int[][] matriks) {
        for (int i=0; i<matriks.length; i++){
            for (int j=0; j<matriks[0].length; j++){
                System.out.print(matriks[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Masukan baris Matriks A;");
        int baris = input.nextInt();
        System.out.println("Masukan kolom Matriks A:");
        int kolom = input.nextInt();
        
        
        int[][] matriks_a = new int[baris][kolom];
        for (int i=0; i<baris; i++){
            for (int j=0; j<kolom; j++){
                System.out.println("Matriks A["+i+" , "+j+"]");
                matriks_a[i][j] = input.nextInt();
            }    
        }
        System.out.println("=== Matriks A ===");
        printMatriks(matriks_a);
        
        
        System.out.println("Masukan baris Matriks B;");
        int baris_b = input.nextInt();
        System.out.println("Masukan kolom Matriks B:");
        int kolom_b = input.nextInt();
        
        int[][] matriks_b = new int[baris_b][kolom_b];
        for (int i=0; i<baris_b; i++){
            for (int j=0; j<kolom_b; j++){
                System.out.println("Matriks B["+i+" , "+j+"]");
                matriks_b[i][j] = input.nextInt();
            }    
        }
        System.out.println("=== Matriks B ===");
        printMatriks(matriks_b);
        
        int[][] hasilTambah = new int[matriks_a.length][matriks_b[0].length];
        for (int i=0; i<matriks_a.length; i++){
            for (int j=0; j<matriks_b[0].length; j++){
                hasilTambah[i][j] = matriks_a[i][j] + matriks_b[i][j];
            }
        }
        System.out.println("hasil penjumlahan matriks_a dan matriks_b:");
        printMatriks(hasilTambah);
        
     int[][] hasilKali = new int[hasilTambah.length][matriks_b[0].length];
        for (int i=0; i<hasilTambah.length; i++){
            for (int j=0; j<matriks_b[0].length; j++){
                for (int k=0; k<hasilTambah[0].length; k++){
                    hasilKali[i][j] += hasilTambah[i][k] * matriks_b[k][j];
                }
            }
        }
        System.out.println("=== hasil perkalian: ===");
        printMatriks(hasilKali);
//        tranposeMatriks(hasilKali);
        int[][] hasilTranpose = new int[hasilKali.length][hasilKali[0].length];
        for (int i=0; i<hasilKali.length; i++){
            for (int j=0; j<hasilKali[0].length; j++){
                hasilTranpose[j][i] = hasilKali[i][j];
            }
        }
        System.out.println("hasil tranpose");
        for (int i=0; i<hasilKali[0].length; i++){
            for (int j=0; j<hasilKali.length; j++){
                System.out.print(hasilTranpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    

    
    
}
