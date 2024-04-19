import java.util.ArrayList;
import java.util.List;

public class Endereco {
    private Integer numero; 
    private String complemento; 
    private Integer CEP;  
    private List<TipoEndereco> tiposDeEnderecos;   
    private Logradouro logradouro;
    private Bairro bairro;

    public Endereco() { 
        tiposDeEnderecos = new ArrayList<>();
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
     * @return List<TipoEndereco> return the tiposDeEnderecos
     */
    public List<TipoEndereco> getTiposDeEnderecos() {
        return tiposDeEnderecos;
    }

    /**
     * @param tiposDeEnderecos the tiposDeEnderecos to set
     */
    public void setTiposDeEnderecos(List<TipoEndereco> tiposDeEnderecos) {
        this.tiposDeEnderecos = tiposDeEnderecos;
    }

}