package tp.trois;

public class motif4 {
    public static void main(String[] args) {       
        int taille = 6;
        for (int nombreDeLigne = 1; nombreDeLigne <= taille; nombreDeLigne++) {
        for (int nombreDeColonne = 1; nombreDeColonne <= nombreDeLigne;
        nombreDeColonne++) {
        System.out.print(nombreDeLigne);
        }
        System.out.println();
        }
    }
}
