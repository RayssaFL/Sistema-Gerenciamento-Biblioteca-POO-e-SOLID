//Questão 1: No vídeo acontecem 20 trocas no bubble sort e 9 trocas no selection sort
//Questão 2: Complexidade so Selection Sort
public class DesafioSs {
    public static void main(String[] args) {
        int[] numeros = {45, 12, 78, 3, 56, 9, 34, 21, 67};
        for (int i = 0; i < numeros.length - 1; i++) {                     //Vezes: n - 1      Comps: 1       #total: n - 1
           int menor = i;
           for (int j = i + 1; j < numeros.length; j++) {                  //Vezes: n * (n-1)/2   Comps: 1    #total: n*(n-1)/2
               if (numeros[j] < numeros[menor]) {                          //Vezes: n * (n-1)/2   Comps: 1     #total: n*(n-1)/2
                   menor = j;
               }
           }
           int aux = numeros[i];
           numeros[i] = numeros[menor];
           numeros[menor] = aux;
        }
    }
}
//T(n) = n - 1 + (n*(n-1)/2) + (n*(n-1)/2) =
//T(n) = n - 1 + ((n^2 - n)/2) + ((n^2 - n)/2) =
//T(n) = n - 1 + 2 * ((n^2 - n)/2) =
//T(n) = n - 1 + n^2 - n =
//T(n) = n^2 - 1
//Complexidade T(n) = O(n^2)
//Conclusão: O Selection Sort se destaca por realizar menos trocas em comparação ao bubble sort,
//em termos de complexidade ambos tem T(n) = O(n^2). Logo, apesar de serem muito parecidos, o selection sort
// garante uma quantidade menor de trocas, tornando-se um pouco melhor que o bubble sort.

