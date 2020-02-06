import banking.Client;
import banking.IndividualEntrepreneur;
import banking.LegalEntity;
import banking.NaturalPerson;

public class Loader {
    public static void main(String[] args){
        Client natPer = new NaturalPerson(3000);
        natPer.setWithdrawal(3500);
        natPer.setDeposit(500);
        System.out.println("Остаток на счёте физического лица: " + natPer.getAccountStatusNOW());

        Client legEnt = new LegalEntity(650000);
        legEnt.setDeposit(69000);
        legEnt.setWithdrawal(60000);
        System.out.println("Остаток на счёте юридического лица: " + legEnt.getAccountStatusNOW());

        Client indEnt = new IndividualEntrepreneur(2500);
        indEnt.setWithdrawal(100);
        indEnt.setDeposit(300);
        System.out.println("Остаток на счёте индивидуального предпринимателя: " + indEnt.getAccountStatusNOW());
    }
}
