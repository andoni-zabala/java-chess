import Vista_api.Pantalla_titulo;
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("AlgoChessApp Beta0..0.0.1");

        //Fijo las dimensiones de la ventana
        stage.setHeight(600);
        stage.setWidth(800);

        //Instancio mi clase de Pantalla de titulo que colocara contenido en el Stage
        Pantalla_titulo wn = new Pantalla_titulo();
        wn.inicializar(stage);
        wn.mostrar(stage);
        //La muestra
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
