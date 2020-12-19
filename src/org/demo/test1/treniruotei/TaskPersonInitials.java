package org.demo.test1.treniruotei;

import org.demo.test1.dD2Pamoka.person.Asmuo;

public class TaskPersonInitials {



    public String makeInitials(Asmuo asm) {


//       pavarde.substring(1, 7);
//        vardas.toLowerCase();
//        pavarde.replaceAll("onaitis",".");
//        pavarde.charAt(1);
//        pavarde.concat(vardas);
//        pavarde.indexOf(1);
//        pavarde.substring(1);
        //vardas = ""
       String vardas = asm.getVardas() + ". ";
       String pavarde = asm.getPavarde();
        //vardas vardas.compareToIgnoreCase(vardas);
        vardas = vardas.toLowerCase();
        vardas = vardas.toUpperCase();
        //vardas = vardas.indexOf(1);
        pavarde =  ""+ pavarde.charAt(0);
        pavarde = pavarde.toUpperCase();
        return vardas + pavarde;
    }


    public String makeInitials(String jonaitis) {
        return jonaitis;
    }
}
