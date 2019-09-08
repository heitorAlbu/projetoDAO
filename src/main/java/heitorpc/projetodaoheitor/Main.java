
package heitorpc.projetodaoheitor;

import BaseDados.UtilJPA;
import DAO.DAOAluno;
import DAO.DAOGenerico;
import Modelos.Aluno;
import java.util.List;

public class Main {
    
    
    
    public static void main(String[] args){
        
      //InterfaceEntidade a2 = new Aluno();
               
      //AlunoDAO.inserir(a2);
        
//        DAOGenerico daoAluno = new DAOGenerico<Aluno>() ;
    
      
        DAOGenerico<Aluno> daoAluno = new DAOAluno();
            
        List<Aluno> listagem = (List<Aluno>)daoAluno.consultarTodos();
      
        for (Aluno obj : listagem){
             System.out.println("Nome :" + obj.getNome());
        }
       
        
        // daoAluno.remove(Aluno.class, 66);
      
    }
   
}
