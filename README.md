# Sayı Tekrar Sayısı Hesaplama

Bu Java programı, bir dizideki sayıların tekrarlarını hesaplayan ve sonuçları bir HashMap'te depolayan bir programdır.

## Kurulum

- Java JDK'nın bilgisayarınıza yüklü olduğundan emin olun.
- Bu repo'yu klonlayın veya zip dosyası olarak indirin.

## Nasıl Çalıştırılır

- Bir Java derleyici veya entegre geliştirme ortamı (IDE) kullanarak projeyi açın.
- Main.java dosyasını bulun ve açın.
- Programı derleyin ve çalıştırın.

## Programın İşleyişi

- Bir int dizisi (list) tanımlanır ve bazı sayılarla başlangıç değerleri atanır.
- Bir HashMap (liste) oluşturulur. Bu HashMap, sayıların tekrarlarını depolamak için kullanılacaktır.
- İki yardımcı değişken (sayac ve temp) tanımlanır. sayac, döngüdeki geçerli elemanın dizideki konumunu temsil eder ve temp, sayının tekrar sayısını geçici olarak saklamak için kullanılır.
- Bir while döngüsü kullanılarak, tüm dizi elemanları için tekrar sayıları hesaplanır.
- Her geçerli eleman için, iç içe bir for döngüsü kullanarak diziyi tarar ve geçerli elemana eşit olan diğer elemanları bulur.
- Her eşleşen eleman için, temp değişkeni artırılır.
- Bulunan tekrar sayısı (temp), HashMap'e geçerli elemanın tekrar sayısını (list[sayac]) ve temp değerini eşleyen bir çift olarak eklenir.
- temp sıfırlanır ve döngü bir sonraki elemana geçer.
- Tüm döngü tamamlandığında, HashMap'teki çiftlerin anahtar-değer çiftleri kullanılarak sonuçlar ekrana yazdırılır.

Bu program, verilen dizideki sayıların tekrar sayısını hesaplamak için kullanılır. Her bir sayının tekrar sayısı ve sayının kendisi, bir HashMap'te depolanır ve ekrana yazdırılır.

Umarım bu bilgiler size yardımcı olur. İyi çalışmalar!

# Counting Number Occurrences

This Java program is a program that counts the occurrences of numbers in an array and stores the results in a HashMap.

## Installation

- Make sure Java JDK is installed on your computer.
- Clone this repository or download it as a zip file.

## How to Run

- Open the project using a Java compiler or an integrated development environment (IDE).
- Locate the Main.java file.
- Compile and run the program.

## Program Workflow

- An integer array called list is defined and initialized with some initial values.
- A HashMap called liste is created to store the occurrences of numbers. This HashMap will be used for storage.
- Two helper variables, sayac and temp, are defined. sayac represents the position of the current element in the loop, and temp is used to temporarily store the count of occurrences.
- Using a while loop, the program calculates the occurrence count for each element in the array.
- For each current element, an inner for loop iterates through the array and finds other elements that are equal to the current element.
- For each matching element, the temp variable is incremented.
- The found occurrence count (temp) is added to the HashMap as a key-value pair, where the key is the current element's occurrence count (list[sayac]) and the value is temp.
- temp is reset to 0, and the loop proceeds to the next element.
- Once the loop is completed, the results are printed to the screen using the key-value pairs from the HashMap.

This program is used to calculate the occurrence count of numbers in a given array. Each number's occurrence count and the number itself are stored in a HashMap and printed to the screen.

I hope this information helps. Good luck with your work!
