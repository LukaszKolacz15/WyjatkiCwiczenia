package pl.akademiakodu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class Main {

    public static void main(String[] args) {

////        int[]ints = null;
//        int[] ints = {5,33,13};
//        try {
////            ints = new int[5];
////            ints[6] = 352;
////            ints[0] = 32;
//            ints[5]=5;
//        }catch (ArrayIndexOutOfBoundsException e){
////            e.printStackTrace();
//            System.out.println("Error w tablicy");
//        }finally {
//            System.out.println("JA WYKONAM SIE ZAWSZE!");
//        }
//        System.out.println("Nie! " + ints[0]);

//        ----------------------------------------------------

//        Files.write(Paths.get("D:\\oskar.txt"), "test".getBytes(), StandardOpenOptionOption.WRITE);

//        -----------------------------------------------------

        try {
            Files.write(Paths.get("adasdad"), "tesst".getBytes(), StandardOpenOption.WRITE); //wyjatek obowiazkowo do przechwycenia
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
