public class Matriz {
    public static void main(String[] args) {
        double[] [] notasAlunos = new double[30][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 7;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 8.5;
        
        notasAlunos[1][0] = 7.3;
        notasAlunos[1][1] = 6.5;
        notasAlunos[1][2] = 5.2;
        notasAlunos[1][3] = 9.5;
        
        notasAlunos[2][0] = 2.5;
        notasAlunos[2][1] = 4.7;
        notasAlunos[2][2] = 9.2;
        notasAlunos[2][3] = 8.5;

        for (int i = 0; i < 3; i++) {
            System.out.println("Nota do " + (i + 1) + "º aluno: ");

            for (int j = 0; j < 4; j++) {
                    System.out.print(notasAlunos[i][j]);

                    if (j < 3) {
                        System.out.print(", ");
                    }
            }

            System.out.println("\n");
        }
    }
}
