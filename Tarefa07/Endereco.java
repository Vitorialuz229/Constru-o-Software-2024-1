import java.util.ArrayList;
import java.util.List;

public class Endereco {
    private Integer numero; 
    private String complemento; 
    private Integer CEP;  
    private List<TipoEndereco> tiposDeEndereco;   
    private Logradouro logradouro;
    private Bairro bairro;
    private PessoaFisica pessoaFisicas;

    public Endereco() { 
        tiposDeEndereco = new ArrayList<>();
    }

    /**
     * @return Integer return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return String return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return Integer return the CEP
     */
    public Integer getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(Integer CEP) {
        this.CEP = CEP;
    }

    /**
     * @return List<TipoEndereco> return the tiposDeEndereco
     */
    public List<TipoEndereco> gettiposDeEndereco() {
        return tiposDeEndereco;
    }

    /**
     * @param tiposDeEndereco the tiposDeEndereco to set
     */
    public void settiposDeEndereco(List<TipoEndereco> tiposDeEndereco) {
        this.tiposDeEndereco = tiposDeEndereco;
    }

    /**
     * @return Logradouro return the logradouro
     */
    public Logradouro getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return Bairro return the bairro
     */
    public Bairro getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    /**
     * @return PessoaFisica return the pessoaFisicas
     */
    public PessoaFisica getPessoaFisicas() {
        return pessoaFisicas;
    }

    /**
     * @param pessoaFisicas the pessoaFisicas to set
     */
    public void setPessoaFisicas(PessoaFisica pessoaFisicas) {
        this.pessoaFisicas = pessoaFisicas;
    }


    /**
     * @return List<TipoEndereco> return the tiposDeEndereco
     */
    public List<TipoEndereco> getTiposDeEndereco() {
        return tiposDeEndereco;
    }

    /**
     * @param tiposDeEndereco the tiposDeEndereco to set
     */
    public void setTiposDeEndereco(List<TipoEndereco> tiposDeEndereco) {
        this.tiposDeEndereco = tiposDeEndereco;
    }

}