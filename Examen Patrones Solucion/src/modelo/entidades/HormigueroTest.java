package modelo.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HormigueroTest {

    @Test
    void test(){
        Hormiguero hormiguero=new Hormiguero();
        hormiguero.funciona();
        assertEquals(hormiguero.cantidadHormigasTotal, hormiguero.getHormigas().size());
        long count = hormiguero.getHormigas().stream().filter((hormiga)->{return hormiga.isGuerrera();}).count();
        assertEquals(hormiguero.cantidadHormigasGuerreras, count);
    }
}