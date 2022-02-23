package UpdatesAssignment;

public class Ques3 {

        static final int allocationMem = 1024 * 1024*1024;
        static final int iterations = 10;

        public static void main(String[] args) {
            System.out.println("Allocating Memory");

            for (int i = 0; i < iterations; i++) {
                byte[] array = new byte[allocationMem];
            }
            System.out.println("Terminating");
        }
    }
/*
Allocating Memory
Terminating due to java.lang.OutOfMemoryError: Java heap space
 */

