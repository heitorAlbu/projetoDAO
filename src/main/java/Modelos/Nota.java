
package Modelos;

import Interfaces.InterfaceEntidade;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Nota implements InterfaceEntidade {
    @Id
    private int Id;
    private String Materia;
    private double Nota;
    private String TipoProva;
    @ManyToOne
    private Aluno Aluno;
    
    public Nota(){
        
    }
    
    public Nota(int Id, String Materia, double Nota,String TipoProva, Aluno Aluno ){
        
        this.Id = Id;
        this.Materia = Materia;
        this.Nota = Nota;
        this.TipoProva= TipoProva;
        this.Aluno = Aluno;
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public double getNota() {
        return Nota;
    }

    public void setNota(double Nota) {
        this.Nota = Nota;
    }

    public String getTipoProva() {
        return TipoProva;
    }

    public void setTipoProva(String TipoProva) {
        this.TipoProva = TipoProva;
    }

    public Aluno getAluno() {
        return Aluno;
    }

    public void setAluno(Aluno Aluno) {
        this.Aluno = Aluno;
    }

    @Override
    public Object getChavePrimaria() {
        return this.Id;
    }
}
