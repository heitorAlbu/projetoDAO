
package DAO;

import BaseDados.UtilJPA;
import Interfaces.InterfaceDAO;
import Interfaces.InterfaceEntidade;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;


public abstract class DAOGenerico<T extends InterfaceEntidade> {
    
    private static EntityManager Em = UtilJPA.getEntityManager();
    
    public T findById(Class<T> classe, int id){
             return Em.find(classe, id);
    }
    
    
    public void saveOrUpdate(T obj){
        try
        {
            Em.getTransaction().begin();
            if(obj.getChavePrimaria()  == null){
                Em.persist(obj);
            }
            else
            {
                Em.merge(obj);
            }
            Em.getTransaction().commit();
            }catch(Exception e){
                    Em.getTransaction().rollback();
                    throw e;
            }
    }

    public void remove(Class<T> classe, int id){
        T t = findById(classe, id);
        try{
            Em.getTransaction().begin();
            Em.remove(t);
            Em.getTransaction().commit();
        }catch (Exception e) {
            Em.getTransaction().rollback();
        }
    }
    
    public Object consultarTodos(){
        EntityManager em = UtilJPA.getEntityManager();
        
        Object list ;
        
        try{
           String  query = "";
           
           Query q;
            q = em.createNamedQuery("Aluno.selectAll");
          list = q.getResultList();
            
        }catch(Exception ex){
            list = new ArrayList();
        }finally{
            em.close();
        }
        return list;
    }
}  
    
        



