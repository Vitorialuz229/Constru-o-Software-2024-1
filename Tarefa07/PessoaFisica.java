import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class PessoaFisica {
     private String nome; 
     private String sexo; 
     private Date dataNascimento;   
     private List<Endereco> enderecos;

     public PessoaFisica() { 
          enderecos = new ArrayList<>();
     }
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return Date return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return List<enderecos> return the enderecos
     */
    public List<Endereco> getenderecos() {
        return enderecos;
    }

    /**
     * @param enderecos the enderecos to set
     */
    public void setenderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }


    /**
     * @return List<Endereco> return the enderecos
     */
    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    /**
     * @param enderecos the enderecos to set
     */
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}
