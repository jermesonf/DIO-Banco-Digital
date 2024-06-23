import lombok.Setter;

@Setter
public class Cliente {

    private String nome;

    public Cliente() {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Titular: " + nome;
    }
}
