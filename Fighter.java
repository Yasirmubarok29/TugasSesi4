package sesi4;

public class Fighter extends Pahlawan{
  
// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069

    public void gemaSuara(){
        super.gemaSuara();
        System.out.println("We work in the dark, to serve the light");
    }

    public static void main(String[] args) {
        Fighter a = new Fighter();

        a.gemaSuara();
    }
}