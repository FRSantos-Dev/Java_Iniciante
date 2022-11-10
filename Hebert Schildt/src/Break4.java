//Usando break com um rótulo.
public class Break4 {
    public static void main(String[] args) {
        int i;

        for(i = 1; i < 4; i++){
    one: {
    two:    {
    three:      {
        System.out.println("\n é " + i);
        if(i == 1) break one;
        if(i == 2) break two;
        if(i == 3) break three;

        //essa parte nunca sera alcançada
        System.out.println("Não imprime ");
    }
        System.out.println("Depois do três bloqueie.");
    }
        System.out.println("Depois do dois bloqueie");
    }
            System.out.println("Depois do um bloqueie");
        }
        System.out.println("Depois do for.");
    }
}
