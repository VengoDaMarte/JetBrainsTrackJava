public class Main {

    public static void main(String[] args) {
        Secret[] levels = Secret.values();
        int count = 0;
        for (Secret secret : Secret.values()) {
            if (String.valueOf(secret).startsWith("STAR")) {
                count++;
            }
        }
        System.out.println(count);
    }
}

//this was an exercise I am not sure where I would need to
//define Secret, but here we can see how to iterate through enum
// At least two constants start with STAR
// enum Secret {
//     STAR, CRASH, START, // ...
// }
