
public class Arrays {
    public static void main(String[] args) { 
        int[] arr = {12,1,5,7,13,9,4,2,11};       
        // bom, num sei, so sei que foi assim ;X
        int n = 2;
        int maior = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maior) {
                maior = arr[i];
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Busca: " + buscaElemento(arr, n));
        
        int result = somaElemntosDoArray(arr);
        System.out.println("Soma: " + result);

        int[] arr2 = {1,2,3,};
        int[] arr3 = {};

        System.out.println("Soma arr2: " + somaElemntosDoArray(arr3));
        System.out.println("Soma arr2: " + somaElemntosDoArray(arr2));

    }    
    
    public static boolean buscaElemento(int[] v, int n) {
        if (v == null || v.length == 0) {
            return false;
        }
        for (int i=0; i < v.length; i++) {
            if (v[i] == n) {
                return true;
            }
        }
        return false;    
    }
// ---------#-------#-------#----#-----#--------#-------#--#----#----#-------#-----------#-------#-------------------------------//
    public static int somaElemntosDoArray(int[]v){
        if (v == null || v.length == 0) {
            System.out.println("Array vazio ou tamanho é zero");
            return 0;
        }
        int somatotal = 0;
        for (int i = 0; i<v.length; i++) {
            somatotal += v[i];

        }
        return somatotal;
    }


// ---------#-------#-------#----#-----#--------#-------#--#----#----#-------#-----------#-------#--------------------
    
}
