package ciic4020Lab2.list.Class;

import ciic4020Lab2.list.Interface.List;

public class Main {

	public static int totalCount(String s, List<String>[] array) {
		int counter = 0;
		/*
		for(int i = 0; i < array.length; i++) {
			if(array[i].contains(s)) {
				counter++;
			}
		}
		*/
		for(int i = 0; i < array.length; i++) {
			List<String> temp = array[i];
			for(String string: temp) {
				if(string.equals(s)) {
					counter++;
				}
			}
		}
		return counter;
		
	}

}
