
package heitorpc.projetodaoheitor;

import BaseDados.UtilJPA;
import DAO.DAOAluno;
import DAO.DAOGenerico;
import DAO.DAOProfessor;
import DAO.DAOTurma;
import Modelos.Aluno;
import Modelos.Cargo;
import Modelos.Disciplina;
import Modelos.Professor;
import Modelos.Turma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    
    
    
    public static void main(String[] args){
      
      //--------------OPERAÇÕES ALUNO ------------- 
        
      //InterfaceEntidade a2 = new Aluno();
               
      //AlunoDAO.inserir(a2);
        
DAOGenerico daoAluno = new DAOAluno() ;
      
      //        for (Aluno obj : listagem){
      //             System.out.println("Nome :" + obj.getNome());
      //        }
        // daoAluno.remove(Aluno.class, 66);
        
        
      //--------------OPERAÇÕES PROFESSOR--------------
        
//        Professor p1 = new Professor();
////        
//        p1.setId(3);
//        p1.setNome("Gerson");
//        p1.setIdade(88);
//        p1.setInstiuicaoEnsino("UFRPE");
//        
//        Cargo c1 = new Cargo();
//        c1.setNome("Professor de Melhoramento da Cana");
//        c1.setRemuneracao(5500.00);
//        
//        p1.setCargo(c1);
//        
//        
       DAOGenerico<Professor> daoProfessor = new DAOProfessor();
//        
//        daoProfessor.remove(Professor.class, 1);
//        
//     daoProfessor.saveOrUpdate(p1);

//------------OPERAÇÕES TURMA ------------------
       

       DAOGenerico<Turma> daoTurma = new DAOTurma();
       
       Turma t1 = new Turma();
       
       Aluno a1 =  (Aluno)daoAluno.findById(Aluno.class, 66);
       Aluno a2 =  (Aluno)daoAluno.findById(Aluno.class, 99);
       
       Professor p1 = daoProfessor.findById(Professor.class, 2);
       t1.setProfessor(p1);
      
       t1.setCapacidade(25);
       
       List<Aluno> RelacaoAlunos = new ArrayList<Aluno>();
       
       RelacaoAlunos.add(a1);
       RelacaoAlunos.add(a2);
   
       
       t1.setRelacaoAlunos(RelacaoAlunos);
      
       Disciplina d1 = new Disciplina();
       
       d1.setCodigoDisciplina(192);
       d1.setNomeDisicplina("Fruticultura");
       
       t1.setDisciplina(d1);
       
       daoTurma.saveOrUpdate(t1);
    }
   
}
