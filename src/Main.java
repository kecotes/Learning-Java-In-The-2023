public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Wrappers
        //Java cuenta con tipos de datos estructurados equivalentes a cada uno de los tipos primitivos.
        //Además, otra de las finalidades de estos tipos "envoltorio" es facilitar el uso de esta clase de valores allí donde se espera un dato por referencia (un objeto) en lugar de un dato por valor.

        Integer numeroInteger = 61616;
        Double numeroDouble = 9.24;
        String variableCharacter = "Holisss";

        //Operadores Aritméticos incrementales
        //Incrementa el valor y luego se utiliza la variable
        int a = 5;
        int b = ++a;

        System.out.println(a + " y " + b);

        //Utiliza la variable y luego incrementa el valor
        int c = 5;
        int d = c++;

        System.out.println(c + " y " + d);


        //Operadores Aritméticos Combinados: Combinan un operador aritmético con el operador asignación.

        //a += b => a = a + b
        int e = 5, f = 2;
        double g=2.4;
        e += f;
        System.out.println(e);

        g /= f;
        System.out.println(g);



    }
}