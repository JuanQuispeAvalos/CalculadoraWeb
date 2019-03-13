/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

/**
 *
 * @author PC
 */
public class ClaculadoraService {

    public static String respuesta(int nro1, int nro2, char ope) {
        String resultado = "";
        switch (ope) {
            case '0':
                resultado = "Seleciona un poerador monse :v";
                break;
            case '+':
                resultado = String.valueOf(nro1 + nro2);
                break;
            case '-':
                resultado = String.valueOf(nro1 - nro2);
                break;
            case '*':
                resultado = String.valueOf(nro1 * nro2);
                break;
            case '/':
                resultado = String.valueOf(nro1 / nro2);
                break;
        }
        return resultado;
    }
}
