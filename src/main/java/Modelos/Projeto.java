
package Modelos;

import Interfaces.InterfaceEntidade;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projeto implements InterfaceEntidade {
    @Id
    private int Id;
    private String Titulo;
    @ManyToMany(mappedBy="Projetos")
    private Collection<Aluno> GrupoAlunos;
    
    
    public Projeto(){
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Collection<Aluno> getGrupoAlunos() {
        return GrupoAlunos;
    }

    public void setGrupoAlunos(Collection<Aluno> GrupoAlunos) {
        this.GrupoAlunos = GrupoAlunos;
    }

    @Override
    public Object getChavePrimaria() {
        return this.getId();
    }
    
}
