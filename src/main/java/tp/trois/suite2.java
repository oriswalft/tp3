package tp.trois;

public class suite2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        for (int i = 0; i != 20; i++) {
            int c =  a + b;
            System.out.print(" "+c);
            a = b;
            b = c;

        }

    
        
    }

    
}
