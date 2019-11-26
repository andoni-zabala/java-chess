package Vista_api.ManipuladorEventos;

import Vista_api.PantallaJuego;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


//Nose como funciona, pero funciona. ejecuta primero el constructor y despues salta al handle
public class Empezar_juego_Handler implements EventHandler<ActionEvent> {

    private Stage jugando;
    private PantallaJuego pantalla_juego;
    private TextField textfield;
    private TextField textfield2;
    private Label texto;

    public Empezar_juego_Handler(Stage stage, TextField jugador1, TextField jugador2, Label texto) {
        this.jugando = stage;
        this.textfield = jugador1;
        this.textfield2 = jugador2;
        this.texto = texto;
    }

    @Override
    public void handle(ActionEvent actionEvent) {

        if ((textfield.getText().trim().equals("")) || (textfield2.getText().trim().equals(""))) {
            texto.setText("Todos los jugadores deben tener nombres");
        } else {
            //TODO hacer que el tablero guarde el nombre de ambos jugadores
            System.out.println("a jugar BO");
            pantalla_juego = new PantallaJuego();

            //Le encargo a pantalla_juego a que setupee el Scenario y lo setee, en el main, se mostrara con el metodo .show.
            pantalla_juego.inicializar(this.jugando);
        }
    }
}