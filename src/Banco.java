import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Banco {


    private String nome;
    private List<Conta> contas;

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String bank_nome) {
//        this.nome = nome;
//    }
//
//    public List<Conta> getContas() {
//        return contas;
//    }
//
//    public void setContas(List<Conta> contas) {
//        this.contas = contas;
//    }

}
