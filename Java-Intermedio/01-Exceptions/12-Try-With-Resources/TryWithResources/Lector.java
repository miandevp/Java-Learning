package TryWithResources;


import java.io.FileReader;
import java.io.IOException;


public class Lector{

    public void leer() throws IOException{

        try(FileReader archivo =  new FileReader("datos.txt")){
            int caracter;

            while((caracter = archivo.read()) != -1){
                System.out.println((char) caracter);
            }
        }

    }

}