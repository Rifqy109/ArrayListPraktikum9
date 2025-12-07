/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistpraktikum;
import java.util.ArrayList;
/**
 *
 * @author p
 */
public class ArrayListPraktikum {

    public static void main(String[] args) {
         ArrayList arr = new ArrayList(); 
        arr.add("Michelle");
        arr.add("Jonshon");
        arr.add(20);
        arr.add(null);
        arr.set(2, "Arsya");
       
        Object removedValue = arr.remove("Michelle");
        System.out.println("Value yang dihapus: " + removedValue);
        System.out.println(arr);
          
        ArrayList arr1 = new ArrayList();
        arr1.add("Marcel");
        arr1.add("Jonathan");
        arr1.add("Cindy");
        System.out.println(arr1);
        
        System.out.println("Elemen yang diambil: " );
        //for(int i = 0; i < arr1.size(); i++) {
        //    System.out.println(arr1.get(i) + " ");
        //}
        arr.addAll(arr1);
        //System.out.println(arr);
        
        ArrayList<Integer> nilaiMahasiswa = new ArrayList();
        nilaiMahasiswa.add(92);
        nilaiMahasiswa.add(90);
        nilaiMahasiswa.add(88);
        nilaiMahasiswa.add(98);
        System.out.println(nilaiMahasiswa);
        // nilaiMahasiswa.sort((o1, o2) -> 0);
        System.out.println(nilaiMahasiswa);
    }
    
}
