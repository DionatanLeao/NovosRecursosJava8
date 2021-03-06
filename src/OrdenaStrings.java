
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");

		Comparator<String> comparador = new ComparaTamanho();

		Collections.sort(palavras, comparador);		

		palavras.sort(comparador);

		System.out.println(palavras);

		for (String p : palavras) {
			System.out.println(p);
		}

		Consumer<String> consumer = new ImprimeLinha();
		palavras.forEach(consumer);

		palavras.forEach(s -> System.out.println(s));
		
		palavras.sort((s1, s2) -> {	
				if(s1.length() < s2.length()) {
					return -1;
				}
				if((s1.length() > s2.length()) ) {
					return 1;
				}
				return 0;
		});
		
		System.out.println(palavras);

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);
		
		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);
		
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador2 = Comparator.comparing(funcao);
		palavras.sort(comparador2);
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		palavras.sort(Comparator.comparing(String::length));
		
		Function<String, Integer> funcao2 = String::length;
		System.out.println(funcao2);
		
		Function<String, Integer> funcao3 = s -> s.length();
		System.out.println(funcao3);
		
		
		
	}
}
