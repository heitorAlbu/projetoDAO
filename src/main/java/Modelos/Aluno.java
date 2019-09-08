package Modelos;

import Interfaces.InterfaceEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

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

    @Override
    public Object getChavePrimaria() {
        return this.Id;
    }
    
    
    
}
