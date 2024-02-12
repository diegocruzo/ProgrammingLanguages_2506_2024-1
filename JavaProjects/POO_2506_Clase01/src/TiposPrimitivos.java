public class TiposPrimitivos {
    public static void main(String[] args) {

        // Tipo booleano
        boolean b;
        b = !((3-2) == 1) || false;
        System.out.println("\nTipo: boolean");
        System.out.println("Valor booleano: " + b);

        // Tipo carácter
        char letra = '\u03C0';
        char b2 = 'b';
        System.out.println("\n" + letra);
        System.out.println("Tipo: char");
        System.out.println("Tamaño en bits: " + Character.SIZE);
        System.out.println("Tamaño en bytes: " + Character.BYTES);

        String var = "Esta una cadena de caracteres y el símbolo pi: \u03C0";
        System.out.println("\n" + var);
        System.out.println("Tipo: String");

        // Definir el tipo cadena de caracteres por POO
        String var2 = new String();
        var2 = "cadena";
        System.out.println("\n" + var2);

        // Tipos primitivos enteros

        // byte
        byte num1 = 127;
        System.out.println("\n" + num1);
        System.out.println("Tipo: byte");
        System.out.println("Tamaño en bits: " + Byte.SIZE); // Byte es la clase Wrapper de byte
        System.out.println("Tamaño en bytes: " + Byte.BYTES);
        System.out.println("Valor mínimo: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo: " + Byte.MAX_VALUE);

        // short
        short num2 = 32767;
        System.out.println("\n" + num2);
        System.out.println("Tipo: short");
        System.out.println("Tamaño en bits: " + Short.SIZE);
        System.out.println("Tamaño en bytes: " + Short.BYTES);
        System.out.println("Valor mínimo: " + Short.MIN_VALUE);
        System.out.println("Valor máximo: " + Short.MAX_VALUE);

        // int (integer)
        int num3 = 2147483647;
        System.out.println("\n" + num3);
        System.out.println("Tipo: int");
        System.out.println("Tamaño en bits: " + Integer.SIZE);
        System.out.println("Tamaño en bytes: " + Integer.BYTES);
        System.out.println("Valor mínimo: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo: " + Integer.MAX_VALUE);

        // int
        long num4 = 9223372036854775807L;
        System.out.println("\n" + num4);
        System.out.println("Tipo: long");
        System.out.println("Tamaño en bits: " + Long.SIZE);
        System.out.println("Tamaño en bytes: " + Long.BYTES);
        System.out.println("Valor mínimo: " + Long.MIN_VALUE);
        System.out.println("Valor máximo: " + Long.MAX_VALUE);

        // Tipos primitivos reales

        // Tipo float (floating point)
        float num5 = 3.4028235E38F;
        System.out.println("\n" + num5);
        System.out.println("Tipo: float");
        System.out.println("Tamaño en bits: " + Float.SIZE);
        System.out.println("Tamaño en bytes: " + Float.BYTES);
        System.out.println("Valor mínimo: " + Float.MIN_VALUE);
        System.out.println("Valor máximo: " + Float.MAX_VALUE);

        // Tipo double
        double num6 = 3.4028235E38;
        System.out.println("\n" + num6);
        System.out.println("Tipo: double");
        System.out.println("Tamaño en bits: " + Double.SIZE);
        System.out.println("Tamaño en bytes: " + Double.BYTES);
        System.out.println("Valor mínimo: " + Double.MIN_VALUE);
        System.out.println("Valor máximo: " + Double.MAX_VALUE);

        // Tipo genérico
        var a = 3;
        var c = 3F;
        var res = a + c;
        System.out.println("\nValor tipo var: " + a + ", " + c);
        System.out.println(res);
    }
}