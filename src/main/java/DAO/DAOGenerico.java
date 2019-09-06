
package DAO;

import BaseDados.UtilJPA;
import Interfaces.InterfaceEntidade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


public class DAOGenerico<T extends InterfaceEntidade> {
    
    private static EntityManager Em = UtilJPA.getEntityManager();
    
    public T findById(Class<T> classe, int id){
             return Em.find(classe, id);
 }
    public void saveOrUpdate(T obj){
		try{
			Em.getTransaction().begin();
			if(obj.getChavePrimaria()  == null){
				Em.persist(obj);
			}else{
				Em.merge(obj);
			}
			Em.getTransaction().commit();
		}catch(Exception e){
			Em.getTransaction().rollback();
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
}
