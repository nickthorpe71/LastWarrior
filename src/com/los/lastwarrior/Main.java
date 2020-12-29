package com.los.lastwarrior;

public class Main {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();
        Warrior warrior2 = new Warrior();

        System.out.println("\nWarrior1 ---- \n" + warrior1.toString());
        System.out.println("\nWarrior2 ---- \n" + warrior2.toString());
    }
}

// todo:
// 1. name gen - complete
// 2. warrior base stats and class check python code for base
// 3. enemy base stats
// 4. simple battle (use blackjack/python code as an example)
// 5. write simple battle to text file

// FILE WRITING \\
//public void writeFile(String name) {
//    PrintWriter out = null;
//    try {
//        // 1. create the output stream
//        out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
//
//        // 2. write the data to the output stream
//        out.printf("Name: %s\n", name);
//
//    } catch (IOException e) {
//        e.printStackTrace();
//    } finally {
//        if(out != null) {
//            // 3. close the output stream
//            out.close();
//        }
//    }
//}
