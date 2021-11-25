
import java.io.IOException;

public class Apagar{


    public static void apaga() {
//código para apagar e pular para a próxima Unidade Para linux (acho que para mac também)
        try {
                Thread.sleep(100);     
                new ProcessBuilder("clear").inheritIO().start().waitFor();      
            } catch(Exception e) {
                e.printStackTrace();
              }
              
              
    }

}