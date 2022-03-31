package lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
           /*lambda( functional programing )          -                java ( structured programing )
  1) nasıl yaparım, ne yaparım                -                       ne yaparımdan çok nasıl yaparım düşünülür
  2) kod kısalığı, kod okunabilirliği ve hatasız  -                      kod genelde uzundur, başkası sizin ne yaptığınızı anlamaybilir
            kod yazma bakımındna elverişli
  3) lambda sadece collection larda array lerde kullanılır
               (map lerde kullanılmaz)


        */


        List<Integer>l=new ArrayList<>(Arrays.asList(4,9,13,4,5,6,4,7,8,5,9));
        yazdirJava(l);
        System.out.println();
        yazdirLambda(l);
        System.out.println();
        ciftSayiJava(l);
        System.out.println();
        ciftSayiLambda(l);
        System.out.println();
        tekSayiKare(l);
        System.out.println();
        farkliTekKup(l);
        System.out.println();
        ciftSayiKareToplam(l);
        System.out.println();
        tekrarsizCiftKupCarpim(l);
        System.out.println();
        tersDuzSira(l);
    }




    public static void yazdirLambda(List<Integer> l) {
        l.stream().forEach(t-> System.out.print(t+" "));
    }

    public static void yazdirJava(List<Integer>l) {
        for(Integer w:l) {
            System.out.println(w+" ");
        }
    }

    //2)List in elemanlarından ÇİFT olanları aralarında boşluk bırakarak yazdıran metod oluştur(Structured)

    public static void ciftSayiJava(List<Integer> l) {
        for (Integer w : l) {
            if (w % 2 == 0) {
                System.out.print(w + " ");

            }
        }
    }

    public static void ciftSayiLambda(List<Integer> l) {
        l.stream().filter(t->t%2==0).forEach(t-> System.out.println(t+" "));
    }
    //listede ki tek sayilarin karesi
    public static void tekSayiKare(List<Integer> l) {

        l.stream().filter(t->t%2==1).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }

    //mukerrer sayilari teke dusur kupunu al
    public static void farkliTekKup(List<Integer> l) {
        l.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t-> System.out.print(t+" "));

    }
    //tekrarli elemanlari sil, cift sayilarin karesini topla
   /* List<Integer> yeni = new ArrayList<>();
for (Integer w:l) {
if (!yeni.contains(w)&&w%2==0)

        yeni.add(w);
    } int toplam = 0;
for (Integer w:yeni) {
        toplam=toplam+w*w;
    }
System.out.println("uzun yol"+toplam);
*/

    public static void ciftSayiKareToplam(List<Integer> l) {
        System.out.println(l.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(x,y)->x+y));
            }
    public static void tekrarsizCiftKupCarpim(List<Integer> l) {
        int kup=l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(x,y)->x*y);
        System.out.println(kup);//7077888
    }
////7)Listedeki elemanları sıralayarak ve ters sıralayarak yazdır

    public static void tersDuzSira(List<Integer> l) {
        l.stream().sorted().forEach(t-> System.out.print(t+" "));//4 4 4 5 5 6 7 8 9 9 13
        System.out.println();
        l.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));//13 9 9 8 7 6 5 5 4 4 4

    }

}


