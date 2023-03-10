import java.util.*;
interface CardPayment{

    boolean makePayment ( HashMap <String,String> cDetails );

}
class creditCard implements CardPayment{

    public boolean makePayment(HashMap <String,String> cardDetails ){

        System.out.println(" this is credit card");
        Iterator iT =cardDetails.keySet().iterator();
        while(iT.hasNext()){

            String key= (String)iT.next();
            System.out.println("|| key:" + key+ " || name: " + cardDetails.get(key));
        }
         return true;
    }
}
class debitCard implements CardPayment{

    public boolean makePayment(HashMap <String,String> cardDetails ){

        System.out.println(" this is Debit card");
        Iterator iT =cardDetails.keySet().iterator();
        while(iT.hasNext()){

            String key= (String)iT.next();
            System.out.println("|| key:" + key+ " || name: " + cardDetails.get(key));
        }
        return true;
    }
}
//Factory design pattern
class PayFactory {

    public CardPayment payMode(String pMode) {

        if (pMode.equalsIgnoreCase("CC")) {
            creditCard cc = new creditCard();
            return (cc);
        } else {
            {
                debitCard db = new debitCard();
                return (db);
            }
        }
    }
}


public class FactoryPatternExample {

    public static void main(String[] args) {

        String cardType = args[0];
       HashMap<String , String > cd= new HashMap<>();
        cd.put("cust_id","11111");
        cd.put("TransacId","00032");
        cd.put("cnum","223444444");
        cd.put("name"," john doe");
        cd.put("exp date","12312022");
        cd.put("zip cod","07095");

        PayFactory pf = new PayFactory();

        CardPayment Payment = pf.payMode(cardType);
       if( Payment.makePayment(cd))
             System.out.println("payment Success");
        else
            System.out.println("payment failed");


    }
}
