
package Modelos;

import Interfaces.InterfaceEntidade;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor implements InterfaceEntidade {
    
    
    @Id
    private int Id;
    @Column(name = "NomeProfessor")
    private String Nome;
    @Column(name = "Idade")
    private int Idade;
    @Column(name = "Instituicao")
    private String InstiuicaoEnsino;
    
   
    @Embedded
    private Cargo cargo;
    
    public Professor(){
        
    }
    
    public Professor(int Id, String Nome, int Idade, String InstituicaoEnsino, Cargo cargo){
        this.Id = Id;
        this.Nome = Nome;
        this.Idade = Idade;
        this.InstiuicaoEnsino = InstituicaoEnsino;
        this.cargo = cargo;
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

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getInstiuicaoEnsino() {
        return InstiuicaoEnsino;
    }

    public void setInstiuicaoEnsino(String InstiuicaoEnsino) {
        this.InstiuicaoEnsino = InstiuicaoEnsino;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public Object getChavePrimaria(){
        return this.getId();
    }
    
}
