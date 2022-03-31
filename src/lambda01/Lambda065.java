package lambda01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda065 {
    public static void main(String[] args) {


        Cars one = new Cars("Toyota", "Camry", 1985, "622-VRX");
        Cars two = new Cars("Chevrolet", "Chevette", 1980, "J43-SMB");
        Cars three = new Cars("Honda", "Civic", 1993, "883-RS9");
        Cars four = new Cars("Ford", "Mustang", 1966, "AZUCAR");
        Cars five = new Cars("Dodge", "Neon", 1996, "G74-LLC");

        List<Cars> carList=new ArrayList<>(Arrays.asList(one,two,three,four,five));

        System.out.println(carList.stream().sorted(Comparator.comparing(Cars::getYear)).collect(Collectors.toList()));
        System.out.println(carList.stream().sorted(Comparator.comparing(Cars::getMake)).collect(Collectors.toList()));
        System.out.println(carList.stream().sorted(Comparator.comparing(Cars::getModel)).collect(Collectors.toList()));




    }
}