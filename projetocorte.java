import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class projetocorte {
  
  public static void main(String[] args) {
    
    int largplaca, altplaca; largplaca = 0; altplaca = 0; 
    int contador = 0, contador2 = 0, contador3 = 0; int contador1 = 0; int preenche = 1;
    int[] largs = new int[3];
    int[] alts = new int[3];
    largs[0] = 6; largs[1] = 4; largs[2] = 2;
    alts[0] = 6; alts[1] = 4; alts[2] = 2;
    int i1 = 0, i2 = 0, x = 0, y = 0, w =0, z = 0;
    int soma = 0; int c, d;
    int vazioatual = 0; int vaziosuc = 0;
    
    //solicita dimensoes placa
    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe a largura da placa: \n");
    altplaca = entrada.nextInt();
    System.out.print("\nInforme a altura da placa: \n");
    largplaca = entrada.nextInt();
    
    int placaatual[][] = new int [largplaca][altplaca];
    int placasuc[][] = new int [largplaca][altplaca];
    
    testa:
    //inicializo matriz com 0
    for (contador = 0; contador < largplaca; contador++) {
      for (contador1 = 0; contador1 < altplaca; contador1++) {
        placaatual[contador][contador1] = 0;
      }
    }
    
    System.out.println("");
    
    boolean preenchi = true;
    
    //placa sucessor <- placa atual
    for(w = 0; w < largplaca; w++){
      for(z = 0; z < altplaca; z++){ 
        placasuc[w][z] = placaatual[w][z];
      }
    }
    
    
    //gero peca atual aleatoria
    Random aleat = new Random();
    int pecaatual = aleat.nextInt(3);
    
    
    //entro na matriz
    for (contador = 0; contador < largplaca; contador++) {
      for (contador1 = 0; contador1 < altplaca; contador1++) {
        // end of if
        
        //se a posicao esta vazia, verifica se a peça cabe
        if (placasuc[contador][contador1] == 0) {
          int conta, conta1;
          conta = largplaca - contador;
          conta1 = altplaca - contador1;
          
          //contadores para verificacoes
          int teste = contador + largs[pecaatual];
          int teste1 = contador1 + alts[pecaatual];
          
          //se a peça cabe, verifica se é possivel o encaixe
          if (conta >= largs[pecaatual] && conta1 >= alts[pecaatual]){
            for (x = contador; x < teste; x++) {
              for (y = contador1; y < teste1; y++) {
                soma = soma + placasuc[x][y];
              }
            }
            
            //contadores para verificadores
            teste = contador + largs[pecaatual];
            teste1 = contador1 + alts[pecaatual];
            contador = teste - largs[pecaatual];
            contador1 = teste1 - alts[pecaatual];
            
            //se é possivel o encaixe, encaixa a peça atual, preenchendo os espaços com o indice
            if (soma == 0 && x <= largplaca && y <= altplaca) {
              for (c = contador; c < teste; c++) {
                for (d = contador1; d < teste1; d++) {
                  placasuc[c][d] = preenche;    
                }
              }
              //volta ao inicio da placa
              contador1 = 0;
              contador = 0;
              preenche++;
              //gera outra peca
              pecaatual = aleat.nextInt(3);
            }
            
          }
          
        }
        
      } 
      soma = 0;
      
    }
    
    for (i1 = 0; i1 < largplaca; i1++){
      for (i2 = 0; i2 < altplaca; i2++){
        System.out.print(" " + placasuc[i1][i2]);
      }
      System.out.println("");
    }
    
    
    //retira ultima peca encaixada
    for (i1 = 0; i1 < largplaca; i1++){
      for (i2 = 0; i2 < altplaca; i2++){   
        if (placasuc[i1][i2] == preenche-1){
          placasuc[i1][i2] = 0;
        }
      }
    }
    
    //exibe placa
    System.out.println("");
    for (i1 = 0; i1 < largplaca; i1++){
      for (i2 = 0; i2 < altplaca; i2++){
        System.out.print(" " + placasuc[i1][i2]);
      }
      System.out.println("");
    } 
    
    //avalia vazios
    System.out.println("");
    for (i1 = 0; i1 < largplaca; i1++){
      for (i2 = 0; i2 < altplaca; i2++){
        if (placasuc[i1][i2] == 0){
          vaziosuc = vaziosuc + 1;
        }
        
      }
      
    }
    
    System.out.println("");
    System.out.println("O número de espaços vazios na placa é igual a: " +vaziosuc);
    
    /* avalia  
    if(vaziosuc < vazioatual){  
      // placa atual <- placa sucessor
      for(w = 0; w < placalarg; w++){
        for(z = 0; z < placaalt; z++){ 
          placaatual[w][z] = placasuc[w][z];
        }
      }  
      vazioatual = vaziosuc;
      vaziosuc = 0;
    } */
    
    
    
    
    //fecha main  
    }
    //fecha class
}     