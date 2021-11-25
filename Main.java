import java.util.Scanner;
import java.io.IOException;

public class Main extends Apagar
{
	public static void main(String[] args) {
	    
	    
	    
System.out.println(
"  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+
"\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+
"\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+
"\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+
"\n@@@@@@     @@@@@@@@@@@        @@@@              @@@                  @@@@@@@@        @@@@@@@@@@@@@        @@@@@@@"+
"\n@@@@@@@     @@@@@@@@@@     @@@@@@@@@    @@@@@   @@@@@     @@@@@@@      @@@@@@@@    @@@@@@@@@@@@@@@      @@@@@@@@@"+
"\n@@@@@@@      @@@@@@@@@     @@@@@@@@@    @@@@@@  @@@@@     @@@@@@@@@      @@@@@@    @@@@@@@@@@@@@@       @@@@@@@@@"+
"\n@@@@@@@       @@@@@@@      @@@@@@@@@    @@@@@@@@@@@@@     @@@@@@@@@@      @@@@@    @@@@@@@@@@@@@   @    @@@@@@@@@"+
"\n@@@@@@@  @    @@@@@@       @@@@@@@@@    @@@@@@@@@@@@@     @@@@@@@@@@@     @@@@@    @@@@@@@@@@@@   @@    @@@@@@@@@"+
"\n@@@@@@@  @@    @@@@@       @@@@@@@@@    @@@@  @@@@@@@     @@@@@@@@@@@     @@@@@    @@@@@@@@@@@   @@@    @@@@@@@@@"+
"\n@@@@@@@  @@@    @@@   @    @@@@@@@@@          @@@@@@@     @@@@@@@@@@@     @@@@@    @@@@@@@@@@   @@@@    @@@@@@@@@"+
"\n@@@@@@@  @@@@    @   @@    @@@@@@@@@    @@@@  @@@@@@@     @@@@@@@@@@@     @@@@@    @@@@@@@@@            @@@@@@@@@"+
"\n@@@@@@@  @@@@       @@@    @@@@@@@@@    @@@@@@@@@@@@@     @@@@@@@@@@     @@@@@@    @@@@@@@@    @@@@@    @@@@@@@@@"+
"\n@@@@@@@  @@@@@     @@@@    @@@@@@@@@    @@@@@@@  @@@@     @@@@@@@@@     @@@@@@@    @@@@@@@    @@@@@@    @@@@@@@@@"+
"\n@@@@@@@  @@@@@    @@@@@    @@@@@@@@     @@@@@@   @@@@     @@@@@@@@     @@@@@@@@    @@@@@@    @@@@@@@    @@@@@@@@@"+
"\n@@@@@@    @@@@@  @@@@@@      @@@@                @@                  @@@@@@@@        @@       @@@@        @@@@@@@"+
"\n#################################################################################################################");
		
	try {	
		float [] notas = new float[5];
		
		Scanner s = new Scanner(System.in);
		
		    System.out.println("\nDigite nota da Primeira Unidade:");
		    notas[0] = s.nextFloat(); 
		    
		    	if ( notas[0] > 10.00) {
		        
		        System.out.println("ATENÇÃO ========ERRO========");
                System.out.println("Use apenas números de 0 a 10");
                System.exit(0);
		    }else {
		   
            Apagar.apaga();
		    }
		    System.out.println("Digite nota da Segunda Unidade:");
		    notas[1] = s.nextFloat();
		    
		    if ( notas[1] > 10.00) {
		        
		        System.out.println("ATENÇÃO ========ERRO========");
                System.out.println("Use apenas números de 0 a 10");
                System.exit(0);
		    }else {
		   
            Apagar.apaga();
		    }
        
		    System.out.println("Digite nota da Terceira Unidade:");
		    notas[2] = s.nextFloat();
		    
		    if ( notas[2] > 10.00) {
		        
		        System.out.println("ATENÇÃO ========ERRO========");
                System.out.println("Use apenas números de 0 a 10");
                System.exit(0);
		    }else {
		   
            Apagar.apaga();
		    }
        
		    System.out.println("Digite nota da Quarta Unidade:");
		    notas[3] = s.nextFloat();
		    
		    if ( notas[3] > 10.00) {
		        
		        System.out.println("ATENÇÃO ========ERRO========");
                System.out.println("Use apenas números de 0 a 10");
                System.exit(0);
                
                
		    }else {
		   
            Apagar.apaga();
		    }
            
	
            notas[4] = (notas[0] + notas[1] + notas[2] + notas[3])/4;
        
            System.out.println("A média do aluno foi: " + notas[4]);
		
		    if (notas[4] >= 7) {
		    
		       System.out.println("Resultado final: Aprovado "); 
		    
		    }else {
		    
		       System.out.println("Resultado final: Reprovado ");
		    }
		    
		    
		    
	}
        catch(Exception ex){
            
    
        System.out.println("ATENÇÃO ========ERRO========");
        System.out.println("Use apenas números e também ponto '.' no lugar da vírgula ','");
            
        }
        
		
	}
	
	
}



