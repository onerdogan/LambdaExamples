package lambda01;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

//functional programming kullanarak bir dosya nasıl okunur
public class LambdaFile07 {
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("C:\\Users\\Öner\\eclipse-workspace\\Lambda\\src\\lambda01\\LambdaFile")).forEach(t->System.out.println(t));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Tüm karakterleri büyük harfe dönüştürün ve okuyun
        try {
            Files.lines(Paths.get("C:\\Users\\Öner\\eclipse-workspace\\Lambda\\src\\lambda01\\LambdaFile")).map(String::toUpperCase).forEach(t->System.out.println(t));
        } catch (IOException e) {
            e.printStackTrace();
        }
//metindeki farklı kelimeleri yazdır
        try {
            Files.lines(Paths.get("C:\\Users\\Öner\\eclipse-workspace\\Lambda\\src\\lambda01\\LambdaFile")).map(t->t.split(" ")).flatMap(Arrays::stream).map(t->t.replaceAll("\\W","")).distinct().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.lines(Paths.get("C:\\Users\\Öner\\eclipse-workspace\\Lambda\\src\\lambda01\\LambdaFile")).map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.contains("e")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
