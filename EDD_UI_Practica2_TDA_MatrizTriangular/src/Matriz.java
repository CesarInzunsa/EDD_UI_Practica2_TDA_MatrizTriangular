
import java.util.Random;

/*
Diseña un TDA que permita construir objetos que almacenen una matriz CUADRADA. El constructor de la clase recibirá un ENTERO indicando el tamaño de RENGLONES Y COLUMNAS que se deberá construir.
*/
public class Matriz {
    private final int[][] matriz;
    private int tamaño;
    
    public Matriz(int tamaño){
        this.tamaño = tamaño;
        matriz = new int[this.tamaño][this.tamaño];
        numerosAleatorios();
    }
    
    public void numerosAleatorios(){
        Random r = new Random();
        
        for(int i = 0; i<this.tamaño; i++){
            for(int j = 0; j<this.tamaño; j++){
                matriz[i][j] = r.nextInt(10);
            }
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
    /*- obtenerTriangularSuperior: retorna una matriz de NxN (del mismo tamaño que la original) pero solo parte
    triangular superior, entendiendo los valores que incluyen la diagonal principal y lo que esté arriba de esta.
    */
    public int[][] obtenerTriangularSuperior(){
        int matrizAux[][]= new int [tamaño][tamaño];
        
        for(int i=0; i<tamaño; i++){
            for (int j=0; j<tamaño; j++){
                if(i<=j){
                    matrizAux[i][j] = matriz[i][j];
                }
            }
        }
        
        return matrizAux;
    }
    /*
    - obtenerTriangunarSuperiorInversa: retorna una matriz de NxN (mismo tamaño original) pero que
    solo contiene los valores de la diagonal invertida y los elementos que se encuentran arriba de ésta.
    */
    public int[][] obtenerTriangularSuperiorInversa(){
        int matrizAux[][]= new int [tamaño][tamaño];
        
        for(int i=0; i<tamaño; i++){
            for (int j=(tamaño-i-1); j>=0; j--){
                matrizAux[i][j] = matriz[i][j];
            }
        }
        
        return matrizAux;
    }
    /*
    - obtenerTriangunarInferior: retorna una matriz de NxN (del mismo tamaño que la original) pero solo
    parte triangular interior, entendiendo los valores que incluyen la diagonal principal y lo que esté abajo
    de esta.
    */
    public int[][] obtenerTriangularInferior(){
        int matrizAux[][]= new int [tamaño][tamaño];
        
        for(int i=0; i<tamaño; i++){
            for (int j=0; j<tamaño; j++){
                if(i>=j){
                    matrizAux[i][j] = matriz[i][j];
                }
            }
        }
        
        return matrizAux;
    }
    
    /*
    - obtenerTriangunarInferiorInversa: retorna una matriz de NxN (mismo tamaño original) pero que solo
    contiene los valores de la diagonal invertida y los elementos que se encuentran abajo de ésta.
    */
    public int[][] obtenerTriangularInferiorInversa(){
        int matrizAux[][]= new int [tamaño][tamaño];
        
        for(int i=(tamaño-1); i>=0; i--){
            for (int j=(tamaño-i-1); j<tamaño; j++){
                matrizAux[i][j] = matriz[i][j];
            }
        }
        
        return matrizAux;
    }
    /*
    - obtenerDiagonal: retorna los valores de la diagonal principal en formato de vector.
    */
    public int[] obtenerDiagonal(){
        int matrizAux[]= new int [tamaño];
        
        for(int i=0; i<tamaño; i++){
            for (int j=0; j<tamaño; j++){
                if(i==j){
                    matrizAux[i] = matriz[i][j];
                }     
            }
        }
        
        return matrizAux;
    }
    /*
    - obtienerDiagonalInvertida: retorna los valores de la diagonal invertida en formato de vector.
    */
    
    public int[] obtenerDiagonalInvertida(){
        int matrizAux[]= new int [tamaño];
        
        for(int i=0; i<tamaño; i++){
            for (int j=0; j<tamaño; j++){
                if((i+j) == (tamaño-1)){
                    matrizAux[i] = matriz[i][j];
                }     
            }
        }
        
        return matrizAux;
    }
    
    
}//fin TDA Matriz
