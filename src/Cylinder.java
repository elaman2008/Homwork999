import static java.lang.Math.PI;

public class Cylinder {
    private double length;
    private double width;
    private double height;
    private double radius;

    public Cylinder() {
    }

    public Cylinder(double length, double width, double height, double radius) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", radius=" + radius +
                '}';
    }

    public double calculateSurfaceArea(double radius, double height) {
        double ss = 2 * PI * radius * (height + radius);
        System.out.println("ss:" + ss);
        return ss;
    }

    public double calculateVolume(double radius, double height) {
        double Volume = (PI * radius * radius * height);
        System.out.println("Volume:" + Volume);
        return Volume;


    }
}


//Параллелепипедтин жана цилиндрдин площадь жана объёмун эсептеген бир программа жазабыз.
//
//Фигуралардын параметрлерин(длина, ширина, высота,радиус) берип жатканда туура эмес маалымат
//
//берилсе Exception ыргытып, аны оброботка кылып кандай ошибка чыкканын корсотуп берсин.
//
//Мумкун болгон каталар:
//
//        1) берилген маалымат терс сан болсо
//
//       2) берилген маалымат сан эмес тамга болсо
//
//       3) жана озунуздор берген кошумча каталар болсо да болот
//
//
//
//Параллелепипед:
//
//        - Фигуранын аянтын эсептеген формула: 2*((height * length) + (length * width) + (height * width));
//
//        - Фигуранын коломун эсептеген формула: (length*width*height);
//
//        -Формулалар Parallelepiped классында жазылуусу керек
//
//
//Цилиндр:
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
//Бардык Exception дор логикасы main класста жазылcын
//Бардык маалмыттар консоль аркылуу берилсин
//Программа кайсыл фигуранын аянтын жана коломун эсептегибиз келгенин сурап, тандаган фигураны эсептеп бериши керек