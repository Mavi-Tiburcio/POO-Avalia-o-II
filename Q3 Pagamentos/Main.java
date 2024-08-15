public class Main {
    public static void main(String[] args) {

        MPay mPay = new MpayImpl();
        mPay.setCreditCardNo("1234567890123456");
        mPay.setCustomerName("Guilherme José de Carvalho Cavalcanti");
        mPay.setCardExpMonth("07");
        mPay.setCardExpYear("2030");
        mPay.setCardCVVNo((short) 176);
        mPay.setAmount(250.75);

        // Adaptando MPay para PPay usando o adaptador
        PPay pPay = new MPayToPPayAdapter(mPay);

        // Testando a compatibilidade com o novo sistema PayPal
        testPPay(pPay);
    }

    public static void testPPay(PPay pp) {
        System.out.println(pp.getCardOwnerName());
        System.out.println(pp.getCustCardNo());
        System.out.println(pp.getCardExpMonthDate());
        System.out.println(pp.getCVVNo());
        System.out.println(pp.getTotalAmount());
    }
}
