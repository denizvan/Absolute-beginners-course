package nl.fesma.absolute.beginners.course;

public class Cat {
    public static void main(String[] args){
        name_of_cat("James");
        eat ();
        sleep ();
        play ();

        //2nd cat
        name_of_cat("Jack");
        eat ();
        sleep ();
        play ();

    }
    public static void name_of_cat(String name){
        System.out.printf("Name is: %s%n", name);

    }
    public static void eat(){
        System.out.println("I am eating.");
    }
    public static void sleep(){
        System.out.println("I am sleeping.");
    }
    public static void play(){
        System.out.println("I am playing.");
    }
}