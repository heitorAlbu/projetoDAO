
package heitorpc.projetodaoheitor;

import BaseDados.UtilJPA;
import DAO.DAOAluno;
import DAO.DAOAlunoCadastro;
import DAO.DAODepartamento;
import DAO.DAOGenerico;
import DAO.DAONota;
import DAO.DAOProfessor;
import DAO.DAOTurma;
import Modelos.Aluno;
import Modelos.AlunoCadastro;
import Modelos.Cargo;
import Modelos.Departamento;
import Modelos.Disciplina;
import Modelos.Nota;
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
        
      //DAOGenerico daoAluno = new DAOAluno() ;
      
      //        for (Aluno obj : listagem){
      //             System.out.println("Nome :" + obj.getNome());
      //        }
        // daoAluno.remove(Aluno.class, 66);
        
        
      //--------------OPERAÇÕES PROFESSOR--------------
        
//        Professor p1 = new Professor();
////        
//        p1.setId(4);
//        p1.setNome("Géber");
//        p1.setIdade(52);
//        p1.setInstiuicaoEnsino("UFRPE");
//        
//        Cargo c1 = new Cargo();
//        c1.setNome("Professor de Agrometeorologia");
//        c1.setRemuneracao(7500.00);
//        
//        p1.setCargo(c1);
//        
//        
//       DAOGenerico<Professor> daoProfessor = new DAOProfessor();
        
 //       daoProfessor.remove(Professor.class, 1);
        
//     daoProfessor.saveOrUpdate(p1);

//------------OPERAÇÕES TURMA ------------------
//
//
//       
//       DAOGenerico<Aluno> daoAluno = new DAOAluno();
//       DAOGenerico<Professor> daoProfessor = new DAOProfessor();
//       DAOGenerico<Turma> daoTurma = new DAOTurma();
//       
//       Turma t1 = new Turma();
////       
//       Aluno a1 =  (Aluno)daoAluno.findById(Aluno.class, 44);
//       Aluno a2 =  (Aluno)daoAluno.findById(Aluno.class, 123);
//       Aluno a3 =  (Aluno)daoAluno.findById(Aluno.class, 133);
//       
//       Professor p1 = daoProfessor.findById(Professor.class, 1);
//       
//      
//       
//       List<Aluno> RelacaoAlunos = new ArrayList<Aluno>();
//       
//       RelacaoAlunos.add(a1);
//       RelacaoAlunos.add(a2);
//       RelacaoAlunos.add(a3);
//   
//       t1.setRelacaoAlunos(RelacaoAlunos);
//       t1.setProfessor(p1);
//       t1.setCapacidade(35);
//       
//       Disciplina d1 = new Disciplina();
//       
//       d1.setCodigoDisciplina(182);
//       d1.setNomeDisicplina("Melhoramento Vegetal");
//       
//       t1.setDisciplina(d1);
//       
//       daoTurma.saveOrUpdate(t1);


//-------------------OPERAÇÕES ALUNO CADASTRO @ONETOONE--------------

//        DAOGenerico<Aluno> daoAluno = new DAOAluno();
//      
//        DAOGenerico<AlunoCadastro> daoCadastro = new DAOAlunoCadastro();
//        
//        AlunoCadastro ca1 = new AlunoCadastro();
//        
//        Aluno a1 = daoAluno.findById(Aluno.class, 66);
//        
//        ca1.setCpf("058.966.204-03");
//        ca1.setIdade(29);
//        ca1.setSerie("3º Ano");
//        ca1.setSexo("Masculino");
//        ca1.setAluno(a1);
//        
//        daoCadastro.saveOrUpdate(ca1);

//----------------------OPERAÇÕES NOTAS @ManyToOne--------------------------------
//        DAOGenerico<Aluno> daoAluno = new DAOAluno();
//        DAOGenerico<Nota> daoNota = new DAONota();
//
//
//    Aluno a1 = daoAluno.findById(Aluno.class, 123);
//    Nota n1 = new Nota();
//    n1.setId(1);
//    n1.setMateria("Matematica");
//    n1.setNota(3.4);
//    n1.setTipoProva("1ª Avaliação");
//    n1.setAluno(a1);
//    
//    daoNota.saveOrUpdate(n1);
    
//----------------OPERAÇÕES DEPARTAMENTO @OneToMany --------------------------  
   // DAOGenerico<Turma> daoTurma = new DAOTurma();     
    DAOGenerico<Departamento> daoDepartamento = new DAODepartamento();
//    Disciplina d1 = new Disciplina();
//    Disciplina d2 = new Disciplina();
//    
//    Departamento dep1 = new Departamento();
//    
//    d1.setCodigoDisciplina(192);
//    d1.setNomeDisicplina("Fruticultura");
//    
//    d2.setCodigoDisciplina(182);
//    d2.setNomeDisicplina("Melhoramento Vegetal");
//    
//    Turma t1 = daoTurma.findById(Turma.class, d1);
//    Turma t2 = daoTurma.findById(Turma.class, d2);
//    
//    List<Turma> RelacaoTurmas = new ArrayList<Turma>();
//    
//    RelacaoTurmas.add(t1);
//    RelacaoTurmas.add(t2);
//    
//    dep1.setRelacaoTurmas(RelacaoTurmas);
//    dep1.setId(1);
//    dep1.setNomeDepartamento("Agronomia");
//    dep1.setArea("agrárias");
    
    
    Departamento d1 = daoDepartamento.findById(Departamento.class, 1);
    
    
    
        for (int i = 0; i < d1.getRelacaoTurmas().size()-1; i++) {
            System.out.println("departamento " + d1.getNomeDepartamento());
            System.out.println("Turma" + d1.getRelacaoTurmas().get(i).getDisciplina() + "Professor" + d1.getRelacaoTurmas().get(i).getProfessor().getNome());
        }
    
    
    
     //System.out.println(" nome da turma " + t1.getDisciplina().getNomeDisicplina());
    
    
    
            
    }
}
