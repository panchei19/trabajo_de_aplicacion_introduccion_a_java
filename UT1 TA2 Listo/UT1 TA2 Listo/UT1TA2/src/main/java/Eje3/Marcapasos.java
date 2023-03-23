
package Eje3;

public class Marcapasos {
    short presionSanguinea; //2 bytes
    short frecuenciaCartiaca; //2 bytes
    short nivelAzucar; //2 bytes
    long maximaFuera; // 8 bytes
    float minimoTiempo; // 4 bytes
    double bateriaRestante; //8 bytes
    char[] codigoFabricante; //x8 veces
    //Esto ocupa 42bytes + 12bytes del objeto + 2bytes para que sea multiplo de 8.
    
}
    
