package controlador;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.ManagedBean;

@ManagedBean
@Named(value = "calculacontrol")
@SessionScoped
public class CalculadotraControl implements Serializable {

    private int nro1;
    private int nro2;
    private String resultado = "";
    private char operador;

    public void calcular() {
        switch (operador) {
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
    }
    public void limpiar(){
        setNro1(10);
        setNro2(10);
        setResultado("");
        setOperador('0');
    }

    public CalculadotraControl() {
    }

    public int getNro1() {
        return nro1;
    }

    public void setNro1(int nro1) {
        this.nro1 = nro1;
    }

    public int getNro2() {
        return nro2;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

}
