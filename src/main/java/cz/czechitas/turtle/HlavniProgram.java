package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        // nakresliRovnostrannyTrojuhelnik(50, Color.CYAN);

        // nakresliCtverec(50,Color.MAGENTA);

        //nakresliObdelnik(50,80,Color.ORANGE);

        // nakresliKruh(20,15,25, Color.GREEN);

        // nakresliRovnoramennyTrojuhelnik(80,60, Color.RED);




    }

    //rovnostranny trojuhelnik
    public void nakresliRovnostrannyTrojuhelnik(double delkaStrany, Color penColor) {

        zofka.setPenColor(penColor);
        zofka.turnRight(30);
        zofka.move(delkaStrany);
        for (int i = 0; i < 2; i++) {
            zofka.turnRight(120);
            zofka.move(delkaStrany);
        }

    }

    // ctverec
    public void nakresliCtverec(double delkaStrany, Color penColor) {

        zofka.setPenColor(penColor);

        for (int i = 0; i < 4; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }

    //obdelnik
    public void nakresliObdelnik(double delkaStranyA, double delkaStranyB, Color penColor) {
        zofka.setPenColor(penColor);

        for (int i = 0; i < 2; i++) {
            zofka.move(delkaStranyA);
            zofka.turnRight(90);
            zofka.move(delkaStranyB);
            zofka.turnRight(90);
        }
    }

    //kruh
    public void nakresliKruh(double delkaKroku, double uhel, int pocetOpakovani, Color penColor) {

        zofka.setPenColor(penColor);

        int Opakovani = pocetOpakovani;
        for (int i = 0; i < pocetOpakovani; i++) {
            zofka.turnRight(uhel);
            zofka.move(delkaKroku);
        }
    }

    //rovnoramenny trojuhelnik
    public void nakresliRovnoramennyTrojuhelnik(double delkaStranAB, double vrcholovyUhelStupne, Color penColor) {
        zofka.setPenColor(penColor);

        double delkaZakladny;
        double prevodStupne;
        prevodStupne = Math.toRadians(vrcholovyUhelStupne);
        delkaZakladny = 2 * delkaStranAB * Math.sin(prevodStupne / 2);

        zofka.move(delkaZakladny);
        zofka.turnRight(180 - (180 - (vrcholovyUhelStupne / 2 + 90)));
        zofka.move(delkaStranAB);
        zofka.turnRight(180 - vrcholovyUhelStupne);
        zofka.move(delkaStranAB);
    }


        //ukol - cast 2

public void zmrzlina(){
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(400);
    zofka.turnRight(180);
    zofka.penDown();


    nakresliRovnoramennyTrojuhelnik(150, 45, Color.orange);



}





}
