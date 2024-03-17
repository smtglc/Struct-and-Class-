import java.sql.Struct;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        int sayi1 = 5;
        int sayi2 = sayi1;  // sayi1'in değeri sayi2'ye kopyalandı .

        sayi1 = 10;  // sayi1'in değeri değiştirilir

        System.out.println("sayi1: " + sayi1); // 10
        System.out.println("sayi2: " + sayi2); // 5 (sayi1'in eski değeri kopyalanmıştır)


        // Bu örenkde Value type kullandık yani Structures .
        // Value type lar değişken değerini direkt olarak kopyalayarak bellek bölgesinden alırlar.
        // Value typler stack denilen bellek bölgelerinde tutulurlar.
        // Structer ile classların en büyük farkı ; structer value type olurken classlar ise referance type olmasıdır .



        /* ********************************************************************************************* */



        Person person1 = new Person("Samet");
        Person person2 = person1; // person1'in referansı person2'ye atanır

        person1.name = "Mustafa"; // person1'in özelliği değiştirilir

        System.out.println("person1: " + person1.name); // Mustafa
        System.out.println("person2: " + person2.name); // Mustafa (person1'in referansı person2'ye kopyalanmıştı)


        // Bu örneğimizde de Classları kullanarak bir reference type örenği oluşturduk .
        /*reference typlerın value typlera göre en belirgin özellikleri değişkenleri kopyalamak yerine referansını kopyalamak .
          Referansını kopyaladığı için değiştiridiği her bir değer aslında referansını da değiştiridiği için bütün değerleri değiştiriyor .

        */

    }

}
     class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }
    }




