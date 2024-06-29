package Function;

public class Binomialfactor {
    public static int binomi(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
            return f;
    }
    public static int biocff(int n,int r){
        int nfact=binomi(n);
        int rfact=binomi(r);
        int nrfact=binomi(n-r);

        int bicof=nfact/(rfact*nrfact);
        return bicof;
    }

    public static void main(String[] args) {
        int fact=biocff(5,2);
        System.out.println("The factorial is "+fact);


    }

}
