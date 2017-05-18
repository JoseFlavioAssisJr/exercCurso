package persistencia;

import beans.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class AlunoBD {
    
    private List<Aluno> alunos;

    public AlunoBD() {
        alunos = new ArrayList<Aluno>();
    }
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
}
