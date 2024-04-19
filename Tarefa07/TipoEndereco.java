public enum TipoEndereco {
    COMERCIAL("Comercial"), 
    RESIDENCIAL("Residencial");

    private final String nome; 

    TipoEndereco(String nome) { 
          this.nome = nome;
    }

    public String getNome() { 
          return nome;
    }

}
