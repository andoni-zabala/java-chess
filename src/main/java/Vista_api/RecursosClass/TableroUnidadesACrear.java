package Vista_api.RecursosClass;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import static Vista_api.ConstantesInterfaz.*;

public class TableroUnidadesACrear extends HBox {

    ImageView imagen_catapulta;
    ImageView imagen_curandero;
    ImageView imagen_infanteria;
    ImageView imagen_jinete;

    Label texto_catapulta;
    Label texto_curandero;
    Label texto_infanteria;
    Label texto_jinete;

    GridPane matriz;

    public TableroUnidadesACrear(){
        //Setup de la grilla que contiene a la muestra d eunidades
        this.matriz = new GridPane();
        this.matriz.setHgap(20);
        this.matriz.setVgap(20);

        //Carga de imagenes
        imagen_catapulta = new ImageView(new Image(IMG_CATAPULTA));
        imagen_curandero = new ImageView(new Image(IMG_CURANDERO));
        imagen_infanteria = new ImageView(new Image(IMG_INFANTERIA));
        imagen_jinete = new ImageView(new Image(IMG_JINETE));

        //Creo los handlers para cada imagen



        //Los asocio al hacer click en cada unidad.
        imagen_catapulta.addEventFilter(MouseEvent.MOUSE_CLICKED, (event) -> System.out.println("Tocaboton"));
        imagen_curandero.addEventFilter(MouseEvent.MOUSE_CLICKED, (event) -> System.out.println("Tocaboton"));
        imagen_infanteria.addEventFilter(MouseEvent.MOUSE_CLICKED, (event) -> System.out.println("Tocaboton"));
        imagen_jinete.addEventFilter(MouseEvent.MOUSE_CLICKED, (event) -> System.out.println("Tocaboton"));

        //Setup de textos
        texto_catapulta = new Label("Catapulta\n5");
        texto_curandero = new Label("Curandero\n2");
        texto_infanteria= new Label("Infanteria\n1");
        texto_jinete= new Label("Jinete\n3");
        //Coloco las imagenes y los textos en la grilla
        this.matriz.add(imagen_catapulta,0,0);
        this.matriz.add(texto_catapulta,1,0);
        this.matriz.add(imagen_curandero,0,1);
        this.matriz.add(texto_curandero,1,1);
        this.matriz.add(imagen_infanteria,0,2);
        this.matriz.add(texto_infanteria,1,2);
        this.matriz.add(imagen_jinete,0,3);
        this.matriz.add(texto_jinete,1,3);



        //Coloco la grilla en el TableroUnidadesACrear
        this.getChildren().addAll(this.matriz);
    }
}