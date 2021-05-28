package cc;
public abstract class GuessGame {
    public void go() {
        int number = (int) (Math.random() * 10); 
        int guess;
        do {
            print("�������֣�");
            guess = nextInt();
        } while(guess != number);
        println("������");
    }
    
    public abstract void print(String text);
    public abstract void println(String text);
    public abstract int nextInt();
}
