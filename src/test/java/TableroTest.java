import Modelo.Casillero.Casillero;
import Modelo.Casillero.CasilleroOcupadoExcepcion;
import Modelo.Infanteria;
import Modelo.Jugador;
import Modelo.Tablero.Coordenada;
import Modelo.Tablero.Tablero;
import Modelo.Tablero.UnidadAgregadaEnSectorEnemigoExcepcion;
import Modelo.Unidad;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TableroTest {
    @Test
    public void tableroSeInicializaCorrectamente(){
        Jugador j1 = new Jugador("Camila");
        Jugador j2 = new Jugador("Josefina");
        Tablero tablero = new Tablero(j1, j2);

        Assert.assertTrue(tablero != null);

        //TODO agregar mas cosas.
    }

    @Test
    public void colocarUnidadNuevaEnCasilleroAliadoVacio(){
        Jugador j1 = new Jugador("Camila");
        Jugador j2 = new Jugador("Josefina");
        Tablero tablero = new Tablero(j1, j2);
        Unidad infanteria = new Infanteria(j1, new Casillero());

        Coordenada coordenada = new Coordenada(0, 0);
        Assert.assertTrue(tablero.estaLibre(coordenada) );

        tablero.agregarUnidad(coordenada, infanteria);

        Assert.assertFalse(tablero.estaLibre(coordenada) );
    }

    @Test
    public void colocarUnidadNuevaEnCasilleroEnemigoDevuelveExcepcion(){
        Jugador j1 = new Jugador("Camila");
        Jugador j2 = new Jugador("Josefina");
        Tablero tablero = new Tablero(j1, j2);
        Unidad infanteria = new Infanteria(j2 ,new Casillero());

        Coordenada coordenada = new Coordenada(0, 0);
        assertThrows(UnidadAgregadaEnSectorEnemigoExcepcion.class, () ->{
            tablero.agregarUnidad(coordenada, infanteria);
        } );
    }

    @Test
    public void colocarUnidadNuevaEnCasilleroOcupadoDevuelveExcepcion(){
        Jugador j1 = new Jugador("Camila");
        Jugador j2 = new Jugador("Josefina");
        Tablero tablero = new Tablero(j1, j2);
        Unidad infanteria1 = new Infanteria(j1, new Casillero());
        Unidad infanteria2 = new Infanteria(j1, new Casillero());

        Coordenada coordenada = new Coordenada(0, 0);
        tablero.agregarUnidad(coordenada, infanteria1);

        assertThrows(CasilleroOcupadoExcepcion.class, () ->{
            tablero.agregarUnidad(coordenada, infanteria2);
        } );
    }
}
