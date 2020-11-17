import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 133));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.forEach(c -> System.out.println(c.getNome()));

		System.out.println("------------------------------");

		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("------------------------------");
		
		cursos.stream()
		.filter(c -> c.getAlunos() >=100)
		.map(c -> c.getAlunos())
		.forEach(total -> System.out.println(total));
		
		System.out.println("------------------------------");
		
		int sum = cursos.stream()
		.filter(c -> c.getAlunos() >=100)
		.mapToInt(c -> c.getAlunos())
		.sum();
		
		System.out.println(sum);

	}
}
