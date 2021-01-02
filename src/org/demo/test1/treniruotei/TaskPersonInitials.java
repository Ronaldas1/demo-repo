package org.demo.test1.treniruotei;

import org.demo.test1.dD2Pamoka.person.Asmuo;

public class TaskPersonInitials {


    public String makeInitials(Asmuo asm) {


        String vardas = asm.getVardas() + ". ";
        String pavarde = asm.getPavarde();
        vardas = vardas.toLowerCase();
        vardas = vardas.toUpperCase();
        pavarde = "" + pavarde.charAt(0);
        pavarde = pavarde.toUpperCase();
        return vardas + pavarde;
    }


}
