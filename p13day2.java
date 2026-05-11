public class p13day2 {
    public static void main(String[] args) {
        float f = T_F_conversation(35);
        System.out.println(f);
    }

    static float T_F_conversation(float c) {
        float F = (9.0f / 5) * c + 32;
        return F;
    }
}


// with parameter with retuen type //