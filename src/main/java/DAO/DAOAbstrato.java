    
package DAO;

import BaseDados.UtilJPA;
import Interfaces.InterfaceDAO;
import Interfaces.InterfaceEntidade;
import javax.persistence.EntityManager;

public abstract class DAOAbstrato implements InterfaceDAO {
    
    @Override
    public void inserir(InterfaceEntidade pEntidade) 
    { 
        inserir(pEntidade, UtilJPA.getEntityManager(), true);
    }
    
    public void inserir(InterfaceEntidade pEntidade, EntityManager pEM, boolean pFecharEM) 
    {
        pEM.getTransaction().begin();
        pEM.persist(pEntidade); 
        pEM.getTransaction().commit();
        if (pFecharEM ) { pEM.close(); } 
    }
//    public InterfaceEntidade consultarPorPK(InterfaceEntidade pEntidade, Object PrimaryKey) { 
//        return consultarPorPK( pEntidade,PrimaryKey,UtilJPA.getEntityManager(),true); 
//    }
//    
//    public Class consultarPorPK(InterfaceEntidade pEntidade, Object PrimaryKey, EntityManager pEntityManager, boolean pFecharEntityManager ) { 
//       Class Classe = (Class)EntityManager.find(pEntidade, PrimaryKey); 
//        if ( pFecharEntityManager ) {
//            pEntityManager.close(); } 
//        return pEntidade; 
//    }
    
    
  
    
}
