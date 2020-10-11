package test;

import java.util.ArrayList;
import java.util.List;

public class AllNumber {

	public static void printListNumber(List<? extends Number> list) {// 와일드 카드

	}

	public static void printListString(List<? extends String> slist) {// 와일드 카드

	}

	public static void main(String[] argd) {
		Double d = 10.1;
		Float f = 1.1f;
		Integer i = 1;

		List<Number> nList = new ArrayList<>();
		nList.add(d);
		nList.add(f);
		nList.add(i);
		printListNumber(nList);
		List<String> sList = new ArrayList<>();
		sList.add("s");
		sList.add("a");
		sList.add("b");
		printListString(sList);

	}
}
