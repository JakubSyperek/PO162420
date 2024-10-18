public class Zad2 {
    public static void wypiszTablice(int [][] tab, int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(tab[i][j] + " ");
                if(tab[i][j] == 0){

                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] tablica = {{1,2,3},{4,5},{7,8,9}};
        wypiszTablice(tablica, 3, 3);
    }
}
