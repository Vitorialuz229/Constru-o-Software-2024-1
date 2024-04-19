import java.util.ArrayList;
import java.util.List;

public class Estado {
    private String sigla; 
    private String nome;
    private Pais pais;
    private List<Cidade> cidade;
    
    public Estado (String sigla, String nome, Pais pais ) { 
          this.sigla = sigla; 
          this.nome = nome;
          this.pais = pais; 
          this.cidade = new ArrayList<>();
    }

    /**
     * @return String return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
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
     * @return Pais return the pais
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    /**
     * @return List<Cidade> return the cidade
     */
    public List<Cidade> getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(List<Cidade> cidade) {
        this.cidade = cidade;
    }

}
