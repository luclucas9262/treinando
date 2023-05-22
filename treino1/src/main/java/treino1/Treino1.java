package treino1;

public class Treino1 {

    public static void main(String[] args) {

        Horas h = new Horas();

        do {
            h.ExibirMenu();
            h.SetOPC();

            if (h.GetOPC() < 0 || h.GetOPC() >= 2) {
                h.ExibirOPCInvalida();

            } else {
                h.SetHora();
                if (h.GetOPC() == 1) {

                    if (h.GetHora() < 12) {
                        System.out.println("Bom Dia");
                        h.ExibirHora();
                    } else {
                        if (h.GetHora() <= 18) {
                            System.out.println("Boa Tarde");
                            h.ExibirHora();
                        } else {
                            System.out.println("Boa noite");
                            h.ExibirHora();
                        }
                    }

                }

            }
            if (h.GetOPC() == 0) {
                h.Sair();

            }
            

        }while (h.GetOPC() != 0);
       

    }
}
