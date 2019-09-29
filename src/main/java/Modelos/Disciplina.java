
package Modelos;

import Interfaces.InterfaceEntidade;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Disciplina implements InterfaceEntidade, Serializable {
    
    private int codigoDisciplina;
    private String NomeDisicplina;
//    @ElementCollection
//    private List<String> Conteudo;
    
    public Disciplina(){
        
    }
    
    public Disciplina(int codigoDisciplina, String NomeDisicplina){
        this.codigoDisciplina = codigoDisciplina;
        this.NomeDisicplina = NomeDisicplina;
    }
    
    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getNomeDisicplina() {
        return NomeDisicplina;
    }

    public void setNomeDisicplina(String NomeDisicplina) {
        this.NomeDisicplina = NomeDisicplina;
    }

    @Override
    public Disciplina getChavePrimaria() {
            
        return null;
    }
    
   
    
}
