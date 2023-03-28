public class Main {
    public static void main(String args[]) {
        suma(1,2,3);

        //Crear un objeto miCoche en el main
        coche micoche = new coche();
        micoche.incrementaPuertas();
        micoche.incrementaPuertas();
        micoche.incrementaPuertas();
        micoche.incrementaPuertas();
        System.out.println(micoche.puertas);
    }
    public static void suma(int a, int b, int c){
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

//Crear una clase coche.
class coche {
    public int puertas = 4;
    public void incrementaPuertas() {
        this.puertas++;
    }

}