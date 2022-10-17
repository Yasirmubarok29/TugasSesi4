package sesi4;

public class Mage extends Pahlawan{

// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069

    public void gemaSuara(){
        super.gemaSuara();
        System.out.println("Expecto Patronum");
    }

    public static void main(String[] args) {
        Mage n = new Mage();
        n.gemaSuara();
    }
}