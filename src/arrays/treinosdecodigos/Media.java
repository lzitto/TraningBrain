package arrays.treinosdecodigos;

public class Media {
    public static void main(String[] args) {
        
        double[] a = {2, 4, 6, 8, 10};
        double[] m = new double[a.length];
        
        somaExt(a,0,a.length-1, m);
    }
    

    
    public void media(double[] a, double[] m){
        for(int i = 0; i < a.length; i++) {
            double soma = 0;
            for(int j = 0;j<i;j++){
                soma = soma + a[j];
            }
            m[i] = soma/(i+1);
        }
    }
    
    public double somaInt(double[] a, int l, int r){
        double soma = 0;
        if(l == r) {
            soma = a[l];
        }
        soma = a[l] + somaInt(a, l+1, r);
        return soma;
    }

    public void somaExt(double[] a, int l, int r, double[] m) {
        if(l<=r){
            double somaTemp = somaInt(a,l,r);
            m[r] = somaTemp/(r+1);
            somaExt(a,l,r-1,m); 
        }
    }
}


