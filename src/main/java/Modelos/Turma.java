
package Modelos;

import Interfaces.InterfaceEntidade;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Turma implements InterfaceEntidade{
    
    @EmbeddedId
    private Disciplina disciplina;
    
    private int Capacidade;
    @OneToOne
    private Professor Professor;
    @OneToMany(mappedBy = "turma")
    private List<Aluno> RelacaoAlunos;
    
    
    public Turma(){
       
    }
    
    public Turma(Disciplina disciplina,int Capacidade, Professor Professor, List<Aluno> RelacaoAlunos ){
       this.disciplina = disciplina;
       this.Capacidade = Capacidade;
       this.Professor = Professor;
       this.RelacaoAlunos = RelacaoAlunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int Capacidade) {
        this.Capacidade = Capacidade;
    }

    public Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(Professor Professor) {
        this.Professor = Professor;
    }

    public List<Aluno> getRelacaoAlunos() {
        return RelacaoAlunos;
    }

    public void setRelacaoAlunos(List<Aluno> RelacaoAlunos) {
        this.RelacaoAlunos = RelacaoAlunos;
    }
    
    @Override
    public Object getChavePrimaria(){
        return this.disciplina;
    }
   
    
}
