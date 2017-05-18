package persistencia;

import beans.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Flávio
 */
public class AlunoBD {

    private List<Aluno> alunos;

    public AlunoBD() {
        alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Aluno buscarAluno(String matricula) {
        int i;
        boolean achou = false;
        Aluno a1 = null;

        for (Aluno a : alunos) {
            if (a.getMatricula() == matricula) {
                a1 = a;
                break;
            }
        }
            if (a1 != null) {
                   return a1;
            } else {
                return null;
            }
        }
        //        for (i = 0; i < alunos.size(); i++) {
        //            if (alunos.get(i).getMatricula() == matricula) {
        //                achou = true;
        //                break;
        //            }
        //        }
        //        if (achou) {
        //            return alunos.get(i);
        //        } else {
        //            return null;
        //        }

    
    public List<Aluno> buscarTodos() 
    {
        return alunos;
    }

}
