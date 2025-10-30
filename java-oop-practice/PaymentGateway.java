/*
 9️⃣ Payment Gateway

🧩 Concept: Interfaces
⚙️ Create an interface Payment with methods pay() and refund().
Implement it in UPIPayment and CardPayment classes.
💡 Hint: Use interface reference to call methods of both implementations.
 */

interface Payment {
    void pay();

    void refund();
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment Initiated");
        System.out.println("Payment In Progress");
        System.out.println("Payment Completed");
    }

    public void refund() {
        System.out.println("Refund Initiated");
        System.out.println("Refund In Progress");
        System.out.println("Refund Completed");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Payment Initiated");
        System.out.println("Payment In Progress");
        System.out.println("Payment Completed");
    }

    public void refund() {
        System.out.println("Refund Initiated");
        System.out.println("Refund In Progress");
        System.out.println("Refund Completed");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {

        UPIPayment obj1 = new UPIPayment();
        obj1.pay();
        obj1.refund();

        CardPayment obj2 = new CardPayment();
        obj2.pay();
        obj2.refund();

    }
}
