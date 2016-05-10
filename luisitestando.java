public class luisitestando {
  
  public static void main(String[] args) {
    
    int matriz[][] = new int [10][10];
    int contador = 0, contador2 = 0, contador3 = 0;
    int contador1 = 0;
    int preenche = 1;
    int larg = 5;
    int alt = 2;
    int peca1[][] = new int[larg][alt];
    int tamanhopeca = 0;
    int nome = 0;
    int i1 = 0, i2 = 0, x = 0, y = 0;
    int soma = 0;
    int c, d;
    
    //preenche matriz com 0
    for(contador = 0; contador < 10; contador++) {
      for(contador1 = 0; contador1 < 10; contador1++) {
        matriz[contador][contador1] = 0;
        System.out.print(" " + matriz[contador][contador1]);
      }
      System.out.println("");
    }
    
    System.out.println("");
    
    //entro na matriz
    for(contador = 0; contador < 10; contador++) {
      for(contador1 = 0; contador1 < 10; contador1++) {
        //entro na peça
        //for(tamanhopeca = contador; tamanhopeca<10; tamanhopeca++){
        //  for(nome = contador1; nome<10; nome++) {
        //verifico se a posição atual é 0
        int teste = contador + larg;
        int teste1 = contador1 + alt;
        
        if(matriz[contador][contador1] == 0 && x <= 10 && y <= 10) {
          for(x = contador; x < teste - 1; x++) {
            for(y = contador1; y < teste1 - 1; y++) {
              soma = soma + matriz[x][y];
              
            }
          }
          
          teste = contador + larg;
          teste1 = contador1 + alt;
          contador = teste - larg;
          contador1 = teste1 - alt;
          if(soma == 0 && x <= 10 && y <= 10) {
            for(c = contador; c < teste; c++) {
              for(d = contador1; d < teste1; d++) {
                matriz[c][d] = preenche;    
              }
            }
            preenche++;
          }
          
        }
        else {
          boolean amor = true;
          
        }
        
      }
      
      soma = 0;
    }
    
    for(i1 = 0; i1 < 10; i1++){
      for(i2 = 0; i2 < 10; i2++){
        System.out.print(" " + matriz[i1][i2]);
      }
      System.out.println("");
    }
    
    
    //retira ultima peça
    for(i1 = 0; i1 < 10; i1++){
      for(i2 = 0; i2 < 10; i2++){   
        if(matriz[i1][i2] == preenche-1){
          matriz[i1][i2] = 0;
        }
      }
    }
    
    System.out.println("");
    for(i1 = 0; i1 < 10; i1++){
      for(i2 = 0; i2 < 10; i2++){
        System.out.print(" " + matriz[i1][i2]);
      }
      System.out.println("");
    } 
    
    
    
    //fecha main  
  }
  //fecha class
}     
            
