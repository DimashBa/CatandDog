package ККК;

public class Animals {

    protected String имя;
    protected String цвет;
    protected String  возраст;

    public Animals(){
        super();
        System.out.println("Родился");
    }
    public Animals(String имя, String цвет, String возраст) {
        this();
        this.имя = имя;
        this.цвет = цвет;
        this.возраст = возраст;
    }
    public void бежать(){
        System.out.printf("% умеет бежать\n",имя);
    }
    public void плавать(){
        System.out.printf("%s умеет плавать\n ",имя);
    }

    public static void main(String[] args) {


        Animals[] animals = {
                new Собака("Тузик", "Желтый и черный", "8"),
                new Кошка("Лиза", "серый", "1")};
        for (int i = 0; i < animals.length; i++) {
            animals[i].бежать();
            animals[i].плавать();
        }
        System.out.println();
    }
}
class Собака extends Animals{

public Собака(String имя,String цвет,String возраст) {
    super(имя, цвет, возраст);
}
public void бежать(){
    System.out.printf("%s пробежал 500м\n",имя);
}
public void плавать(){
    System.out.printf("%s проплыл 10м,",имя);
}
}



class Кошка extends Animals{

    public Кошка(String имя,String цвет,String возраст){
        super(имя, цвет, возраст);
    }
public void бежать(){
    System.out.printf("%s пробежала 200м\n",имя);
}
public void плавать(){
    System.out.printf("%s не умеет плавать\n",имя);
}
}