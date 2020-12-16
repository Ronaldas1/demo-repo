package org.demo.test1.treniruotei;

public class TaskPersonInitials2 {
    public String makeInitials(String vardas, String pavarde,
                               int asmensKodas, int gimomoMetai,
                               String lytis) {
        vardas = "Jonas";
        pavarde = "Jonaitis";
        asmensKodas = 123456789;
        gimomoMetai = 20000;
        lytis = "vyras";


        return makeInitials(vardas, pavarde,
                asmensKodas, gimomoMetai, lytis);
    }

    public static void main(String[] args) {
        TaskPersonInitials MyID = new TaskPersonInitials();
        TaskPersonInitials.vardas();
        TaskPersonInitials.pavarde();
        TaskPersonInitials.asmensKodas();
        TaskPersonInitials.gimimoMetai();
        TaskPersonInitials.lytis();
        System.out.println(MyID);
    }
}
