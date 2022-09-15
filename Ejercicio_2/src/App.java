public class App {
    public static void main(String[] args) throws Exception {
        //Primera parte 
        int numeroIf = -3;
        if(numeroIf == 0){
            System.out.println("El numeroIf es 0: "+ numeroIf);
        }else if(numeroIf > 0){
            System.out.println("El numeroIf es positivo: "+ numeroIf);
        }else{
            System.out.println("El numeroIf es negativo: "+ numeroIf);
        }
        System.out.println();
        // Segunda Parte
        int numeroWhile = -5;
        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        System.out.println();

        //Tercera Parte
        int numDoWhile = 5;
        do{
            numDoWhile++;
            System.out.println(numDoWhile);
        }while(numDoWhile == 5);
        System.out.println();

        //Cuarta parte
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++ ) {
            System.out.print(numeroFor+ " ");
        }
        System.out.println("\n");
    
        // Quinta parte
        String estacion = "Verano";
        switch(estacion){
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            default:
                System.out.println("Esta estacion no existe: "+ estacion);
        }

    }
}
