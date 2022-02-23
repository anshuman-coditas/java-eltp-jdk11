package UpdatesAssignment;

import java.util.Optional;

public class Ques1 {
    public static void main(String[] args) {
        String name="Anshuman";
        Optional<String> nullCheck=Optional.ofNullable(name);
        nullCheck.ifPresentOrElse((a)-> System.out.println("Name is:: "+a),()-> System.out.println("No value present"));
    }
}
/*
Name is:: Anshuman

 */