package atos;
import java.util.ArrayList;
import java.util.List;

public class Exercice {
	
	public static <T>
    int findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p) {
		
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(8);
        list.add(1);

        Exercice.findFirst(list, 0, list.size(), ()->{});
    }

	}


