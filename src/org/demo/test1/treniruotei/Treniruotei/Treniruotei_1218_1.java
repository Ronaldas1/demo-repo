package org.demo.test1.treniruotei.Treniruotei;

public class Treniruotei_1218_1 {
    public static void main(String[] args) {
        String vardas = "Jonas";
        String pavarde = "Jonaitis";
        String asmensKodas = "123456789";
        String gimimoMetai = "2000";
        String lytis = "vyras";
        int i1 = 11;
        String x1 = "Jonas";
        x1 = x1 + pavarde;
        String x2 = gimimoMetai + lytis + asmensKodas;


        System.out.println(vardas + pavarde);
        System.out.println("Jonas\t Jonaitis");
        System.out.println(x1.replaceAll("Jonaitis", " J."));
        System.out.println(x1.toLowerCase());
        System.out.println(x1.substring(0, 7));
        System.out.println(x1.indexOf("s"));
        System.out.println(x1.charAt(1));
        System.out.println(x1.concat(" Jono"));
        System.out.println(x2);
        System.out.println("Jonas\tJonaitis\t2000\tvyras\t");
        System.out.println(x1 + x2);

    }
}
