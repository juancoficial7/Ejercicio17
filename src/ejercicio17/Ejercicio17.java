
package ejercicio17;


public class Ejercicio17 {

    
    public static void main(String[] args) {
        double radio, area, longitud_circunferencia;
        radio = 15;
        area = Math.PI * Math.pow(radio, 2);
        longitud_circunferencia = (radio * 2) * Math.PI;
        System.out.println("El radio de la circunferencia es: "+ radio);
        System.out.println("El area de la circunferencia es: "+ area);
        System.out.println("La longitud de la circunferencia es: "+ longitud_circunferencia);
    }
    
}
