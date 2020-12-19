package org.demo.test1.treniruotei;

public class TaskPersonInitials {



    public String makeInitials(String vardas, String pavarde) {


//       pavarde.substring(1, 7);
//        vardas.toLowerCase();
//        pavarde.replaceAll("onaitis",".");
//        pavarde.charAt(1);
//        pavarde.concat(vardas);
//        pavarde.indexOf(1);
//        pavarde.substring(1);
        //vardas = ""
        vardas = vardas + ". ";
        //vardas vardas.compareToIgnoreCase(vardas);
        vardas = vardas.toLowerCase();
        vardas = vardas.toUpperCase();
        //vardas = vardas.indexOf(1);
        pavarde =  ""+ pavarde.charAt(0);
        pavarde = pavarde.toUpperCase();
        return vardas + pavarde;
    }

}
