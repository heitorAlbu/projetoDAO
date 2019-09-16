
package Modelos;

import Interfaces.InterfaceEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AlunoCadastro implements InterfaceEntidade{
    @Id
    private String Cpf;
    @Column(name = "IdadeAluno")
    private int Idade;
    @Column(name = "SexoAluno")
    private String Sexo;
    @Column(name = "SerieAluno")
    private String Serie;
    @OneToOne
    private Aluno Aluno;
    
    public AlunoCadastro(){
        
    }
    public AlunoCadastro(String Cpf,int Idade,String Sexo, String Serie , Aluno Aluno ){
        
        this.Cpf = Cpf;
        this.Idade = Idade;
        this.Sexo = Sexo;
        this.Serie = Serie;
        this.Aluno = Aluno;
    }

    
    
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public Aluno getAluno() {
        return Aluno;
    }

    public void setAluno(Aluno Aluno) {
        this.Aluno = Aluno;
    }

    @Override
    public Object getChavePrimaria() {
        return this.Cpf;
    }
    
    
    
}
