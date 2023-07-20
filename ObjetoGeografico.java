public class ObjetoGeografico {

    private String nombreCuerpoAgua;
    private float numeroIdentificacionCuerpoAgua;
    private String municipioCuerpoAgua;
    private String tipoDeCuerpoDeAgua;
    private String tipoDeAgua;
    private float clasificacionIRCA;
    
    //Constructor 
    public ObjetoGeografico(String nombreCuerpoAgua,float numeroIdentificacionCuerpoAgua,
    String municipioCuerpoAgua, String tipoDeCuerpoDeAgua, String tipoDeAgua,float clasificacionIRCA){
        this.nombreCuerpoAgua=nombreCuerpoAgua;
        this.numeroIdentificacionCuerpoAgua=numeroIdentificacionCuerpoAgua;
        this.municipioCuerpoAgua=municipioCuerpoAgua;
        this.tipoDeCuerpoDeAgua=tipoDeCuerpoDeAgua;
        this.tipoDeAgua=tipoDeAgua;
        this.clasificacionIRCA=clasificacionIRCA;
        
    }

    //Método para establecer el nombre del cuerpo de agua
    public void setNombre(String nombreCuerpoAgua){
        this.nombreCuerpoAgua=nombreCuerpoAgua;
    }

    //Método para establecer el número de identificación del cuerpo de agua
    public void setIdentificacion(float numeroIdentificacionCuerpoAgua ){
        this.numeroIdentificacionCuerpoAgua=numeroIdentificacionCuerpoAgua;
    }
    //Método para establecer el municipio del cuerpo de agua
    public void setMunicipio(String municipioCuerpoAgua ){
        this.municipioCuerpoAgua=municipioCuerpoAgua;
    }
     //Método para establecer el tipo de cuerpo de agua 
     public void setTipoDeCuerpoDeAgua(String tipoDeCuerpoDeAgua ){
        this.tipoDeCuerpoDeAgua=tipoDeCuerpoDeAgua;
    }
    //Método para establecer el tipo de agua del  del cuerpo de agua a estudiar 
    public void setTipoDeAgua(String tipoDeAgua ){
        this.tipoDeAgua=tipoDeAgua;

    }
    //Método para establecer índice de riesgo de la calidad del agua, IRCA, 
    public void setIRCA(float clasificacionIRCA ){
        this.clasificacionIRCA=clasificacionIRCA;
    }
    
    //Método para recuperar el nombre del cuerpo de agua
    public String getNombre(){
        return nombreCuerpoAgua;
    }

    //Método para recuperar el número de identificación del cuerpo de agua
    public float getIdentificacion(){
        return numeroIdentificacionCuerpoAgua;
    }
    //Método para recuperar el municipio del cuerpo de agua
    public String getMunicipio(){
        return municipioCuerpoAgua;
    }
    //Método para recuperar el tipo de cuerpo de agua a estudiar
    public String getTipoDeCuerpoDeAgua(){
        return tipoDeCuerpoDeAgua;
    }
    //Método para recuperar el tipo de agua estudiar 
    public String getTipoDeAgua(){
        return tipoDeAgua;
    }
    //Método para establecer índice de riesgo de la calidad del agua, IRCA, 
    public float getIRCA( ){
        return clasificacionIRCA;
    }
    @Override
    public String toString(){
        return getNombre()+getIdentificacion()+getMunicipio()+getTipoDeAgua()+getIRCA();

    }
    
  
}//fin de la clase CuerpoDeAgua
