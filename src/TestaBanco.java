public class TestaBanco {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.nome = "larissa fernandes";
        cliente1.cpf = "000.000.000-00";
        cliente1.profissao = "programadora";
        System.out.println(cliente1.nome);


        Conta conta1 = new Conta();
        conta1.saca(100);

        conta1.titular = cliente1;
        System.out.println(conta1.titular.nome);
    }
}


//Cliente cliente1 = new Cliente();
//        cliente1.nome = "Larissa Fernandes";
//                cliente1.cpf = "000.000.000-00";
//                cliente1.profissao = "programadora";
//
//                Conta conta1 = new Conta();
//                conta1.deposita(100);
//
//                //Associa o Cliente cliente1 a conta conta1.
//                conta1.titular = cliente1;
//                System.out.println(conta1.titular.nome);
