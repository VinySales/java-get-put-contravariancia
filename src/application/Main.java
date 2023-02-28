package application;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
	
		List<Object> list = new ArrayList<>();
		
		list.add("Viny");
		list.add("Sales");
		
		List<? super Number> listNumber = list;
		
		listNumber.add(1.0);
		listNumber.add(2);
		
//		Erro ao tentar obter qualquer super tipo de Number
//		Number n = listNumber.get(0);
	}
	
}
