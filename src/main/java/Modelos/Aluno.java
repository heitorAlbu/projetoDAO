package Modelos;

import Interfaces.InterfaceEntidade;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({
    @NamedQuery(name="Aluno.selectAll",
                query="SELECT a FROM Aluno a"),
}) 
public class Aluno implements InterfaceEntidade {
   
    
    @Id
    private int Id;
    @Column(name = "Nome")
    private String Nome;
    @ManyToOne
    private Turma turma;
    @OneToOne
    private AlunoCadastro cadastro;
    
    @ManyToMany
    private Collection<Projeto> Projetos;
    
    
    public Aluno(){
        
    }
    
    public Aluno(int Id, String nome){
        this.setId(Id);
        this.setNome(nome);
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public AlunoCadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(AlunoCadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Collection<Projeto> getProjetos() {
        return Projetos;
    }

    public void setProjetos(Collection<Projeto> Projetos) {
        this.Projetos = Projetos;
    }
    
    

    @Override
    public Object getChavePrimaria() {
        return this.Id;
    }
    
    
    
}
