package Task_4.voter;

public class VoterMain {
    public static void main(String[] args) {
        try {
            Voter v = new Voter(201, "Arun", 17);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

