public class Estado {
    private String sigla; 
    private String nome;
    Pais pais;
    
    public Estado (String sigla, String nome ) { 
          this.sigla = sigla; 
          this.nome = nome;
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

}
