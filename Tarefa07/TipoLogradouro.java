public enum TipoLogradouro {
     ALAMEDA("Alameda"), 
     AVENIDA("Avenida"), 
     MARGINAL("Marginal"), 
     RUA("Rua"), 
     RODOVIA("Rodovia"), 
     VIA("Via"), 
     VIELA("Viela"), 
     TRAVESSA("Travessa");   
     
     private final String logradouro; 

     TipoLogradouro(String logradouro) { 
           this.logradouro = logradouro;
     }
 
     public String getLogradouro() { 
           return logradouro;
     }
}
