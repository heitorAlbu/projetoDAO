
package Modelos;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Cargo {
    @Column(name = "NomeDisciplina")
    private String Nome;
    @Column(name = "Remunecacao")
    private double Remuneracao;
    
    public Cargo(){
        
    }
    
    public Cargo(String Nome,double Remuneracao ){
        this.Nome = Nome;
        this.Remuneracao = Remuneracao;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getRemuneracao() {
        return Remuneracao;
    }

    public void setRemuneracao(double Remuneracao) {
        this.Remuneracao = Remuneracao;
    }
    
    
    
    
}
