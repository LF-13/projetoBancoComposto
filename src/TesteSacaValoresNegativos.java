public class TesteSacaValoresNegativos {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.deposita(100);
        System.out.println(conta1.getSaldo());

        conta1.saca(300);
        System.out.println(conta1.getSaldo());


    }
}

//   Conta conta1 = new Conta();
//        conta1.deposita(100);
//        System.out.println(conta1.saca(101));
//
//
//        System.out.println(conta1.getSaldo());