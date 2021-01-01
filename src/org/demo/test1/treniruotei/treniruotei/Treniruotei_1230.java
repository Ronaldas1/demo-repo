package org.demo.test1.treniruotei.treniruotei;

import org.demo.test1.treniruotei.TaskPersonInitials;
//kaip gauti paskutini String simboli ?

public class Treniruotei_1230 {
    public static void main(String[] args) {
        TaskPersonInitials lastCharacter = new TaskPersonInitials();
        String rezultatas = lastCharacter.makeInitials("Jonas");
        System.out.println(rezultatas.charAt(4));

    }


}
