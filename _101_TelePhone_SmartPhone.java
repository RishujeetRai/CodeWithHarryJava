class TelePhone{
    void ring(){
        System.out.println("Brrrr...");
    }
    void lift(){
        System.out.println("Moshi Moshi...");
    }
    void disconnect(){
        System.out.println("Damare! Kono baba!");
    }
}
class SmartPhone extends TelePhone{
    void playMusic(){
        System.out.println("Sono chi no sadame... JoooooooooooJO!");
    }
    void takeSelfie(){
        System.out.println("Who's the old man in the background?");
    }
    void goldenWind(){
        System.out.println("It's like a burning sunrise\n(Ahi makareru makare pun pun kete)");
    }
}
public class _101_TelePhone_SmartPhone {
    public static void main(String[] args) {
        TelePhone T = new SmartPhone();
        T.ring();
//        T.takeSelfie();   // errr.. no can do, only use T as a TelePhone
        SmartPhone S = new SmartPhone();
        S.ring();
        S.lift();
        S.disconnect();
        S.playMusic();
        S.takeSelfie();
        S.goldenWind();
    }
}
