
package Modelos;

import Interfaces.InterfaceEntidade;
import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Disciplina implements Serializable {
    
    private int codigoDisciplina;
    private String NomeDisicplina;
    
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
    
   
    
}
