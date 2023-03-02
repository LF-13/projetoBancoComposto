public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.titular = new Cliente();
        conta1.titular.nome = "larissa";
        System.out.println(conta1.titular.nome);

    }
}

//  Conta conta1 = new Conta();
//
//
//        conta1.titular = new Cliente();
//        conta1.titular.nome = "larissa";
//        System.out.println(conta1.titular.nome);