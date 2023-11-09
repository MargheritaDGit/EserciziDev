package Ereditarieta2;

public class Main {
    public static void main (String[] args){
    Rettangolo rettangolo = new Rettangolo(5,9);
    Triangolo triangolo = new Triangolo(5,9);

    System.out.println ("Area del rettangolo è: " + rettangolo.calcolaArea());
    System.out.println ("Area del triangolo è: " + triangolo.calcolaArea());

    }
}