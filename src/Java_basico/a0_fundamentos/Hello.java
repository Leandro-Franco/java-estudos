package Java_basico.a0_fundamentos;

import java.lang.Math;

public class Hello {

    public static void main(String[] args) {
//      int math =  (int) Math.sqrt(25);
        byte num = 9;
        short conversion = 20_000; //+ ou - 32k
        // Underscore pode ser formatada por tipos numericos. Facilita a leitura
        long numA = 102040;

        long numB = 102030405060L; // adicionado **L** no final para indicar um valor do tipo long
        System.out.println("Java_basico.a0_fundamentos.Hello, world!");
        System.out.println(
                (int) Math.sqrt(25)
        );
        System.out.println(conversion);
        System.out.println(numB);
        TipsPrimitives(null);
        TipsPrimitivesDouble(null);

        char letterA = 'a'; // char é indicado com aspas simples
        System.out.println(letterA);

    }


    public static void TipsPrimitives(String[] args) {

        float numA = -101.23f; // a lógica segue a mesma para indicar um float como um long

        float numB = 2.356f;
        System.out.println("float case");
        System.out.println(numA + numB); // -98.874

    }

    public static void TipsPrimitivesDouble(String[] args) {

        double numA = 0.5; // double inicializado naturalmente

        double numB = 0.5d; // double definido explicitamente

        double numC = 0.123456789; // várias casas decimais
        System.out.println("double case");

        System.out.println(numA); // 0.5

        System.out.println(numB); // 0.5

        System.out.println(numC); // 0.123456789

    }
}

