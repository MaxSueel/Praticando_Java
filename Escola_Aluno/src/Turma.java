
public class Turma {

	Aluno[] alunos;

	void imprimeNotas() {
		for(int i = 0; i < this.alunos.length; i++) {
			Aluno aluno = this.alunos[i];
			if(aluno == null) continue;
			System.out.println(aluno.nota); // aqui podemos colocar o atributo length para saber o tamanho do array
												// fj.nota.length; i++;
		}
	}

}
