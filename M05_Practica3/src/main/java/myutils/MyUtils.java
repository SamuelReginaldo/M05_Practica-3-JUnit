package myutils;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Samuel Reginaldo
 */
public class MyUtils {
    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";
        
        if (cadena == null){
            resultat = null;
        } else {
            for (int i = cadena.length() -1; i >= 0; i--) {
                resultat += cadena.charAt(i);
            }   
        }
        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     *
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        int resultat = 0;
        Calendar fecha = new GregorianCalendar();
 
        
        
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        
        resultat = año - year;
        
        if (mes <= month) {
            resultat -= 1;
        } else if (mes == month) {
            if (dia < day){
               resultat -= 1; 
            }
        }
        
        if (resultat > 150) {
            resultat = -1;
        } else if (resultat <= 0) {
            resultat = -2;
        }
        
        return resultat;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {
        double resultat;
        if (numero == 0) {
            resultat = 1;
        } else if (numero < 0){
            resultat = -1;
        } else {
            resultat = numero * factorial(numero - 1);
        }
        
        return resultat;
    }
}