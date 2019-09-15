
package heitorpc.projetodaoheitor;

import BaseDados.UtilJPA;
import DAO.DAOAluno;
import DAO.DAOGenerico;
import DAO.DAOProfessor;
import Modelos.Aluno;
import Modelos.Cargo;
import Modelos.Professor;
import java.util.List;

public class Main {
    
    
    
    public static void main(String[] args){
      
      //--------------OPERAÇÕES ALUNO ------------- 
        
      //InterfaceEntidade a2 = new Aluno();
               
      //AlunoDAO.inserir(a2);
        
      //DAOGenerico daoAluno = new DAOGenerico<Aluno>() ;
      
      //        for (Aluno obj : listagem){
      //             System.out.println("Nome :" + obj.getNome());
      //        }
        // daoAluno.remove(Aluno.class, 66);
        
        
      //--------------OPERAÇÕES PROFESSOR--------------
        
        Professor p1 = new Professor();
        
        p1.setId(1);
        p1.setNome("Clodoaldo");
        p1.setIdade(41);
        p1.setInstiuicaoEnsino("UFRPE");
        
        Cargo c1 = new Cargo();
        c1.setNome("Mlehoramento Vegetal");
        c1.setRemuneracao(5400.00);
        
        p1.setCargo(c1);
        
        
        DAOGenerico<Professor> daoProfessor = new DAOProfessor();
        
        //daoProfessor.remove(Professor.class, 1);
        
        daoProfessor.saveOrUpdate(p1);
        
      
    }
   
}
