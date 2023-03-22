import java.util.Scanner;

public class AlunoCadastrado {

	public static void main(String[] args) {

        String[] alunos = new String[25];
        try (Scanner input = new Scanner(System.in)) {
			// Cadastro dos 25 primeiros alunos
			for (int i = 0; i < 25; i++) {
			    System.out.print("Informe o nome do aluno " + (i+1) + ": ");
			    alunos[i] = input.nextLine();
			}

			// Cadastro de mais 5 alunos
			for (int i = 0; i < 5; i++) {
			    System.out.print("Informe o nome do aluno " + (i+26) + ": ");
			    alunos = adicionarAluno(alunos, input.nextLine());
			}
		}

        // Exibição do array com os alunos cadastrados
        System.out.println("\nAlunos cadastrados:");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println((i+1) + ". " + alunos[i]);
        }

    }

    public static String[] adicionarAluno(String[] alunos, String novoAluno) {
        String[] novoArray = new String[alunos.length + 1];
        for (int i = 0; i < alunos.length; i++) {
            novoArray[i] = alunos[i];
        }
        novoArray[alunos.length] = novoAluno;
        return novoArray;
    }
}
