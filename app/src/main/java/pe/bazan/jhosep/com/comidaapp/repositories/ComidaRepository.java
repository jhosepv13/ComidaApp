package pe.bazan.jhosep.com.comidaapp.repositories;

import java.util.ArrayList;
import java.util.List;

import pe.bazan.jhosep.com.comidaapp.models.Comida;

/**
 * Created by Alumno on 27/03/2018.
 */

public class ComidaRepository {

    private static List<Comida> food = new ArrayList<>();

    static{
        food.add(new Comida(100, "Triple", "Sandwich", "5.00", "5 minutos", "triple"));
        food.add(new Comida(200, "Pizza", "Comida rápida", "15.00", "15 minutos", "pizza"));
        food.add(new Comida(300, "Tequeno", "Aperitivo", "5.00", "7 minutos", "tequeno"));
        food.add(new Comida(400, "Causa", "Entrada", "7.00", "10 minutos", "causa"));

        food.add(new Comida(100, "Triple", "Sandwich", "5.00", "5 minutos", "triple"));
        food.add(new Comida(200, "Pizza", "Comida rápida", "15.00", "15 minutos", "pizza"));
        food.add(new Comida(300, "Tequeno", "Aperitivo", "5.00", "7 minutos", "tequeno"));
        food.add(new Comida(400, "Causa", "Entrada", "7.00", "10 minutos", "causa"));

        food.add(new Comida(100, "Triple", "Sandwich", "5.00", "5 minutos", "triple"));
        food.add(new Comida(200, "Pizza", "Comida rápida", "15.00", "15 minutos", "pizza"));
        food.add(new Comida(300, "Tequeno", "Aperitivo", "5.00", "7 minutos", "tequeno"));
        food.add(new Comida(400, "Causa", "Entrada", "7.00", "10 minutos", "causa"));

    }

    public static List<Comida> getList(){
        return food;
    }

}
