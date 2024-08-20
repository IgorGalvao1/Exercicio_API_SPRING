package application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarefas")
public class Tarefa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(nullable = false)
    private String descricao;
    
    @Column(nullable = false)
    private boolean concluido;

    // Getters e Setters
    public void setId(long id) {
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean isConcluido() {
        return this.concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
}
