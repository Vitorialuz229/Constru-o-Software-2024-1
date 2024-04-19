import java.util.ArrayList;
import java.util.List;

public class Logradouro {
    private String nome; 
    private List<TipoLogradouro> tipoLogradouros;

    public Logradouro() { 
          tipoLogradouros = new ArrayList<>();
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
     * @return List<TipoLogradouro> return the tipoLogradouros
     */
    public List<TipoLogradouro> getTipoLogradouros() {
        return tipoLogradouros;
    }

    /**
     * @param tipoLogradouros the tipoLogradouros to set
     */
    public void setTipoLogradouros(List<TipoLogradouro> tipoLogradouros) {
        this.tipoLogradouros = tipoLogradouros;
    }
}

