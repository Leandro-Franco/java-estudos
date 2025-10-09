import java.util.Scanner;


class UsandoScanner {

    public static void main(String[] args) {

        String log;
//        imprimeLog imprime = new imprimeLog();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o número: ");

        String input = scanner.next();

        int string = Integer.parseInt(input);
        log = "int " +string;
        imprimeLog(log);
        short numeroInteiroPequeno = Short.parseShort(input); // Converte para short.
        log = "short " +numeroInteiroPequeno;
        imprimeLog(log);
        long numeroInteiroBemGrande = Long.parseLong(input); // Converte para long.
        log = "long " +numeroInteiroBemGrande;
        imprimeLog(log);
        float numeroDePontoFlutuante = Float.parseFloat(input); // Converte para float.
        log = "float " +numeroDePontoFlutuante;
        imprimeLog(log);
        double numeroDePontoFlutuanteComPrecisaoDupla = Double.parseDouble(input); // Converte para double.
        log = "double " +numeroDePontoFlutuanteComPrecisaoDupla;
        imprimeLog(log);
    }

    static void imprimeLog(String log){
        System.out.println(log);
    }

}
