package com.osowski;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("kek");


        // 1
        int dayOne = 3;

        String result = switch (dayOne) { //switch przypisuje wartość
            case 1 -> "Poniedziałek";
            case 2 -> "Wtorek";
            case 3 -> {
                System.out.println("Środa");
                yield "Środa";   // zwraca wartość
            }
            default -> "Inny dzień";
        };

        System.out.println(result);

        //2

        int nMilionTwo = 1_000_000; //odzielone podłogą
        double xMilionTwo = 1e6;
        System.out.println(nMilionTwo-xMilionTwo);

        //3

        ZnakThree z1Three = new ZnakThree();
        z1Three.z = 'a';
        ZnakThree z2Three = new ZnakThree();
        z2Three.z = 'a';
        ZnakThree z3Three = z2Three;
        System.out.println(z1Three==z2Three);
        System.out.println(z3Three==z2Three);
        System.out.println(z1Three.equals(z2Three));
        System.out.println(z3Three.equals(z2Three));

        //4

        String wFour = new String("test");
        Object oFour = (Object) wFour;
        System.out.println(oFour);
        String vFour = (String) oFour;
        System.out.println(vFour);

        //5

        System.out.println("a.n=" + new AFive().n);

        //6

        LiczbaSix aSix = new LiczbaSix();
        new ToolsSix().print(aSix);
        System.out.println("a teraz x=" + aSix.x);

        LiczbaSix wSix = new LiczbaSix();
        wSix.x = -1;
        LiczbaSix vSix = new LiczbaSix();
        vSix.x = 2;
        System.out.println(wSix.x + " " + vSix.x);
        new ToolsSix().swap(vSix,wSix);
        System.out.println(wSix.x + " " + vSix.x);

        wSix.x=-1;
        vSix.x=2;
        System.out.println(wSix.x + " " + vSix.x);
        new ToolsSix().swapReally(vSix,wSix);
        System.out.println(wSix.x + " " + vSix.x);

        //7

        //dokumentacja

        //8

        System.out.println();

        LiczbaEight l = new LiczbaEight();
        System.out.println(l);

        //9

        ZnakNine z1Nine = new ZnakNine();
        z1Nine.z = 'B';
        try {
            ZnakNine z2 = z1Nine.clone();
            System.out.println("z1: " + z1Nine.z + " , z2: " + z2.z);
            System.out.println("== --> " + (z1Nine == z2) );
            System.out.println("equals --> " + z1Nine.equals(z2));

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}