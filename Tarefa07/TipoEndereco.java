public enum TipoEndereco {
    COMERCIAL("Comercial"), 
    RESIDENCIAL("Residencial");

    private final String tipo; 

    TipoEndereco(String tipo) { 
          this.tipo = tipo;
    }

    public String getTipo() { 
          return tipo;
    }

}
