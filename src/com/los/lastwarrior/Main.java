package com.los.lastwarrior;

public class Main {
    public static void main(String[] args) {
        NameGen nameGen = new NameGen();
        System.out.println(nameGen.generateName());
    }
}

// todo:
// 1. name gen - complete
// 2. warrior base stats
// 3. enemy base stats
// 4. simple battle
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
