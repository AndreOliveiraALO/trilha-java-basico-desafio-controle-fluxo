
import exception.ParametrosInvalidosException;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();
            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
                
            }catch (ParametrosInvalidosException exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro, bonus crie uma msg para quando os valores forem iguais
                System.out.println(exception.getMessage());
            }		
		}
        System.out.println("Programa finalizado.");    
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");  
		else if (parametroUm == parametroDois)  // condição bonus para quando os valores forem iguais. 
            throw new ParametrosInvalidosException("Os parametros não devem ser iguais");
            
		int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i =1; i <= contagem; i++){
            System.out.println("Imprimindo o número "+ i);
        }		
	}
}


/*public class Contador {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}*/