
package Modelos;

import Interfaces.InterfaceEntidade;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento implements InterfaceEntidade, Serializable {
    @Id
    private int Id;
    private String NomeDepartamento;
    private String Area;
    @OneToMany(mappedBy="Dept")
    private List<Turma> RelacaoTurmas;
    
    public Departamento(){
        
    }
    public Departamento(int Id,String NomeDepartamento, String Area ){
        this.Id = Id;
        this.NomeDepartamento = NomeDepartamento;
        this.Area = Area;
    } 

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNomeDepartamento() {
        return NomeDepartamento;
    }

    public void setNomeDepartamento(String NomeDepartamento) {
        this.NomeDepartamento = NomeDepartamento;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public List<Turma> getRelacaoTurmas() {
        return RelacaoTurmas;
    }

    public void setRelacaoTurmas(List<Turma> RelacaoTurmas) {
        this.RelacaoTurmas = RelacaoTurmas;
    }

    @Override
    public Object getChavePrimaria() {
            return  this.Id;
    }
    
    
}
