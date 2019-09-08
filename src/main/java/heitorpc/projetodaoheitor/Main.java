
package heitorpc.projetodaoheitor;

import BaseDados.UtilJPA;
import static BaseDados.UtilJPA.closeEntityManagerFactory;
import static BaseDados.UtilJPA.createEntityManagerFactory;

import DAO.DAOAluno;
import DAO.DAOGenerico;
import Interfaces.InterfaceDAO;
import Interfaces.InterfaceEntidade;
import Modelos.Aluno;



public class Main {
    
    
    
    public static void main(String[] args){
        
       //Aluno a1 = new Aluno(44,"Sara");
      InterfaceDAO AlunoDAO = new DAOAluno();
        
      //InterfaceEntidade a2 = new Aluno();
      
        //AlunoDAO.inserir(a2);
        Aluno a3 = new Aluno(66, "ricardo");
        
        DAOGenerico<Aluno> daoAluno = new DAOGenerico<Aluno>();
        
        //daoAluno.saveOrUpdate(a3);
        
        daoAluno.remove(Aluno.class, 66);
    
        
     
 
    }
   
}
