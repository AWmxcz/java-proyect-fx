import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;



public class reto3Controller {

    @FXML
    private TextArea txtDatos;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtmunicipio;

    @FXML
    private TextField txtTipoDeAgua;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtTipoDeCuerpoAgua;

    @FXML
    private TextField txtIrca;

    @FXML
    private Button txtIngresar;
    @FXML
    private TextArea txtDatosSalida;

    @FXML
    private Button txtProcesar;
    int i=0;
    CuerpoDeAgua[] p=new CuerpoDeAgua[100];
    @FXML
    void actionIngresar(ActionEvent event) {
       
           String nombre=this.txtNombre.getText();
           float id=Float.parseFloat(this.txtID.getText());
           String municipio=this.txtmunicipio.getText();
           String tipoDeAgua=this.txtTipoDeAgua.getText();
           String tipoDeCuerpoDeAgua=this.txtTipoDeCuerpoAgua.getText();
           float irca=Float.parseFloat(this.txtIrca.getText());
           p[i]=new CuerpoDeAgua(nombre,id,municipio,tipoDeAgua,tipoDeCuerpoDeAgua,irca);
           this.txtDatos.appendText(p[i].getNombre()+" "+p[i].getIdentificacion()+" "+p[i].getMunicipio()+
           " "+p[i].getTipoDeAgua()+" "+p[i].getTipoDeCuerpoDeAgua()+" "+p[i].getIRCA()+"\n");
        i++;
           
        
    }
   
    @FXML
    void actionProcesar(ActionEvent event)
     {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("0.00",simbolos);

        for (int j=0; j<i; j++){
        this.txtDatosSalida.appendText(p[j].getNombre()+"\n");// Muestra el nombre o nombres de los cuerpos de agua ingresados
        }
        int c=0; // contador iniciado en cero
        for (int j=0; j<i; j++ ){
              //Indicar cuántos cuerpos de agua tienen un nivel de riesgo BAJO o inferior
              if(p[j].nivel().equals("BAJO") || p[j].nivel().equals("SIN RIESGO") ){
                c=c+1; // Cuenta cuantos Cuerpos de agua tienen un nivel de riesgo BAJO o SIN RIESGO
                }
        }
        this.txtDatosSalida.appendText(formateador.format(c)+"\n"); // Muestra la cantidad de cuerpos de agua tiene un nivel de riesgo BAJO o SIN RIESGO
           //Esta condicion solo aplica cuando c1 es cero.
        int c1=0;
        for (int j=0; j<i; j++ ){
            //Indicar el Nombres de los cuerpos de agua que tienen un nivel de riesgo BAJO, en caso de no haber ninguno devolver NA.
            if( p[j].nivel().equals("BAJO") ){
                this.txtDatosSalida.appendText(p[j].getNombre()); 
                c1=c1+1; //Cuenta cuantos Cuerpos de agua tienen un nivel de riesgo BAJO
              }
        }
         if (c1==0){
            String ninguno="";
            ninguno="NA";
            this.txtDatosSalida.appendText(ninguno+"\n"); //Muestra el valor de NA
          }

          //Indicar el nombre del cuerpo de agua con la clasificación IRCA más alta encontrada y su número identificador.
          float valorComparar=0; 
          CuerpoDeAgua maximo=p[0];
          for (int j=0; j<i; j++ ){
                if (p[j].getIRCA()>valorComparar){
                    valorComparar=p[j].getIRCA();
                    maximo=p[j];
                  }
          }
          this.txtDatosSalida.appendText(maximo.getNombre()+" "+formateador.format(maximo.getIdentificacion()));
    }
           
}      

    




