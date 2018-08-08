 
import java.util.List;

public class Municipio {
    private String nome;
    private double populacao;
    //private List<AtrativoTuristico> AtrativoTuristicos; - Classe AtrativoTuristico responsável por outro membro do grupo.
    private double latitude;
    private double longetude;
    private String estado;
    private String site;
    //List<AtrativoTuristico> AtrativoTuristicos - À ser adicionado ao contrutor.
    //this.AtrativoTuristicos = AtrativoTuristicos; - À ser adicionado ao contrutor.
    public Municipio(String nome, double populacao, double latitude, double longetude, String estado, String site ){
        this.nome = nome;
        this.populacao = populacao;
        this.latitude = latitude;
        this.longetude = longetude;
        //this.TipoDeHospedagem = tipoDeHospedagem; - Classe TipoDeHospedagem responsável por outro membro do grupo.
        //this.Restaurante = restaurante; - Classe Restaurante responsável por outro membro do grupo.
        this.estado = estado;
        this.site = site;
    }
    
    public void setMunicipio( String municipio ) {
        this.nome = municipio;
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome( String nome ){
        this.nome = nome;
    }
    
    public double getPopulacao(){
        return this.populacao;
    }
    public void setPopulacao( double populacao ){
        this.populacao = populacao;
    }
    
    //public List<AtrativoTuristico> getAtrativoTuristicos() {
    //  return this.AtrativoTuristicos;
    //}
    
    public double getLatitude(){
        return this.latitude;
    }
    public void setlatitude( double latitude ){
        this.latitude = latitude;
    }
    
    public double getLongetude(){
        return this.longetude;
    }
    public void setLongetude( double longetude ){
        this.longetude = longetude;
    }
    
    //public List<TipoDeHospedagem> getTipoDeHospedagem() {
    //  return this.TipoDeHospedagem;
    //}
    
    //public List<Restaurante> getRestaurante(){
    //  return this.Restaurante;
    //}
    
    public String getEstado(){
        return this.estado;
    }
    public void setEstado( String estado ){
        this.estado = estado;
    }
    public String getSite(){
        return this.site;
    }
    public void setSite( String site ){
        this.site = site;
    }
    //public void cadastrarAtrativoTuristico( AtrativoTuristico atrativo ){
    //      this.AtrativoTuristicos.add( atrativo);
    //}
}
