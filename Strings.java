//Necesitamos importar la clase Scanner
import java.util.Locale;
import java.util.Scanner;
public class Strings {
    public static void main (String[] args){
        /*
        Entrada de datos y métodos para Strings.
         */

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        String usuarioNombre = "";
        if (usuarioNombre.isEmpty())
            {
                if (entrada.hasNextLine()){
                    System.out.println("Por favor ingrese el nombre del usuario");
                    usuarioNombre = entrada.nextLine().toLowerCase();
                }else{
                    System.out.println("Ingrese únicamente texto. ");
                    entrada.hasNextLine();
                    usuarioNombre = entrada.nextLine().toLowerCase();
            }
        }

        String usuarioApellido = "";
        while (usuarioApellido.isEmpty())
            {
                System.out.println("Ingrese el apellido del usuario");
                if (entrada.hasNextLine()){
                    usuarioApellido = entrada.nextLine().toUpperCase();
                }else{
                    System.out.println("Ingrese únicamente texto. ");
            }
        }
        double usuarioEstatura = 0;

        while (usuarioEstatura == 0)
        {
            System.out.println("Ingrese su estatura en metros");
            if (entrada.hasNextDouble()){
                usuarioEstatura = entrada.nextDouble();
            }else{
                System.out.println("Ingrese únicamente números reales. ");
            }
        }

        double usuarioPeso = 0;
        while (usuarioPeso == 0)
        {
            System.out.println("Ingrese su peso en kilogramos");
            if (entrada.hasNextDouble()){
                usuarioPeso = entrada.nextDouble();
            }else{
                System.out.println("Ingrese únicamente números reales. ");
            }
        }
        double IMC = usuarioPeso/(usuarioEstatura*usuarioEstatura);
        String clasificacionOMS = null;
        if (IMC <= 18.5){ clasificacionOMS = "Bajo de Peso";}
        else if(18.5 <IMC && IMC<= 24.9){clasificacionOMS = "Normal";}
        else if(25.0 <IMC && IMC<= 29.9){clasificacionOMS = "Pre-obesidad";}
        else if(30.0 <IMC && IMC<= 34.9){clasificacionOMS = "Obesidad de clase I";}
        else if(35.0 <IMC && IMC<= 39.9){clasificacionOMS = "Obesidad de clase II";}
        else if(40.0 <= IMC){clasificacionOMS = "Obesidad de clase III";}
        System.out.println("¡Hola " + usuarioNombre + " " + usuarioApellido + "!");
        System.out.println("Tu Índice de Masa Corporal es: " + IMC);
        System.out.println("Según la Organización Mundial de la Salud (OMS) tu peso se clasifica como ");
        System.out.println(clasificacionOMS);
    }
}
