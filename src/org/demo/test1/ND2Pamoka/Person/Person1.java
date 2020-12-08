package org.demo.test1.ND2Pamoka.Person;

import org.w3c.dom.ls.LSOutput;

//03 java types 41 skaidre uzd Person
public class Person1 {
    public static void main(String[] args) {
        String asmensIDvardas = "Darius";
        String asmensIDpavarde = "Zemaitis";
        String asmensIDkodas = "12345678";
        String asmensIDgimimometai = "2000.01.02.";
        String asmensIDlytis = "vyras";
        System.out.println(asmensIDvardas);
        System.out.println(asmensIDpavarde);
        System.out.println(asmensIDkodas);
        System.out.println(asmensIDgimimometai);
        System.out.println(asmensIDlytis);

        String text = "darius.zemaitis";
        //System.out.print(text.replaceAll("darius", "Darius"));
        //System.out.print(text.replaceAll("zemaitis", "Z"));
        System.out.print(text.replaceAll("darius.zemaitis", "Darius Z"));
    }

    }



