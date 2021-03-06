package array;

import task.sav1.tipai.inicialai.Asmuo;

public class QuizArray {
	public Asmuo findLast(Asmuo[] persons) {

		// TODO
		if (persons == null || persons.length == 0 ) {
			return null;  
		}
		
		return persons[persons.length - 1];
	} 

}
