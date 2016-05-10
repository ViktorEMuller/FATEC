import java.util.Scanner;

public class Luisi {
  
  public static void main(String[] args) { 
    
    int i = 0, j = 0, x = 0, y = 0, a = 0, b = 0;
    
    //vetor que armazena larguras das peças
    int largs[] = new int[3];
    largs[0] = 23;
    largs[1] = 17;
    largs[2] = 5;
    
    //vetor que armazena alturas das peças
    int alts[] = new int[3];
    alts[0] = 18;
    alts[1] = 11;
    alts[2] = 2;
    
    //vetor que armazena todas as combinações possiveis de encaixe
    int combinacoes[][] = new int[6][3];
    combinacoes[0][0] = 0;
    combinacoes[0][1] = 1;
    combinacoes[0][2] = 2;
    combinacoes[1][0] = 0;
    combinacoes[1][1] = 2;
    combinacoes[1][2] = 1;
    combinacoes[2][0] = 1;
    combinacoes[2][1] = 0;
    combinacoes[2][2] = 2;
    combinacoes[3][0] = 1;
    combinacoes[3][1] = 2;
    combinacoes[3][2] = 0;
    combinacoes[4][0] = 2;
    combinacoes[4][1] = 0;
    combinacoes[4][2] = 1;
    combinacoes[5][0] = 2;
    combinacoes[5][1] = 1;
    combinacoes[5][2] = 0;
    
    Scanner resposta = new Scanner(System.in);
    System.out.print("Informe a largura da placa:");  
    y = resposta.nextInt();
    System.out.print("Informe a altura da placa:"); 
    x = resposta.nextInt();
    
    int placa[][] = new int[x][y];
    
    //variavel que guarda a combinacao atual para verificar como solucao
    int indice[] = new int[3]; 
    
    indice[0]= combinacoes[0][0];
    indice[1]= combinacoes[0][1];
    indice[2]= combinacoes[0][2];  
    int w, z, soma = 0;
    
    int ind;
    ind = indice[0];
    
    
    // Preenche cada posição da placa com valor 0
    for(i=0; i<x; i++){
      for(j=0; j<y; j++){
        placa[i][j] = 0;
      }
    }
    
    
    //Percorre o vetor por posicoes 0
    for(i=0; i<x; i++){
      for(j=0; j<y; j++){
        
        if(placa[i][j]==0){
          
          //soma os valores da placa equivalentes às dimensoes da peca
          for(w=i; w<largs[ind];w++){
            for(z=j; z<alts[ind];z++){
              
              soma+=placa[w][z];
            }
            
          } 
          
          //se a soma é diferente de 0, não é possivel fazer o encaixe
          if(soma!=0){
            break;
            
            //do contrario, encaixa a peça   
          } else{
            for(w=0; w<largs[ind];w++){
              for(z=0; z<alts[ind];z++){
                placa[w][z]=1+z;
                
                
              }  
              
            }
          }
          
          soma = 0;
        }
        
      }
    }
    
    //exibe a placa preenchida
    for(a=0; a<x; a++){
      for(b=0; b<y; b++){
        System.out.print("" +  placa[a][b] +"");
      }
      System.out.print("\n");
    }
    
    
    
    
    
  }
  
}
    
  