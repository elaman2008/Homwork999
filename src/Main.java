//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Parallelepiped parallelepiped = new Parallelepiped();
Cylinder cylinder = new Cylinder();

        parallelepiped.calculateSurfaceArea(5.5, 10.6);
        parallelepiped.calculateVolume(15.5,10.0,5.0);
        cylinder.calculateSurfaceArea(12.0,14.2);
        cylinder.calculateVolume(13.0,9);


//        Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
//
//        Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
//
//        берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
//
//                Мумкун болгон каталар:
//
//        1) берилген маалымат терс сан болсо
//
//        2) берилген маалымат сан эмес тамга болсо
//
//        3) жана озунуздор берген кошумча каталар болсо да болот
//        Параллелепипед:
//
//        - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
//
//        - Фигуранын коломун эсептеген формула: (length*width*height);
//
//        -Формулалар Parallelepiped классында жазылуусу керек
//
//
//        Цилиндр:
//
//        - Фигуранын аянтын эсептеген формула: 2*PI * radius*( height + radius);
//
//        - Фигуранын коломун эсептеген формула: (PI*radius*radius*height);
//
//        -Формулалар Cylinder классында жазылуусу керек
//
//
//
//
//        Бардык Exception дор логикасы main класста жазылcын
//        Бардык маалмыттар консоль аркылуу берилсин
//        Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп бериши керек.

    }

}