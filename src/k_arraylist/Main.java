package k_arraylist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 1. Declare an ArrayList of participants
        ArrayList<String> participantList = new ArrayList<>();

        // 2. Add elements to an ArrayList, invoke its method add()
        participantList.add("Patrick");
        participantList.add("Angela");
        participantList.add("Benny");

        // 3. Size of a declared ArrayList, invoke its method size()
        System.out.println(participantList);
        System.out.println(participantList.size());

        // 4. Remove an element in an ArrayList, invoke its method remove()
        participantList.remove(0);      // remove an arraylist by index
        participantList.remove("Benny");   // remove an arraylist by its value

        System.out.println(participantList);

        // 5. getter and setter methods of an ArrayList
        ArrayList<String> invitationList = new ArrayList<>();

        invitationList.add("Patrick");
        invitationList.add("Squidward");
        invitationList.add("Gary");

        String firstInvitee = invitationList.get(0);                            // use the get() method to pass the value to firstInvitee
        System.out.println(firstInvitee);

        invitationList.set(0, "Mr. Krabs");                                     // use the set() method to replace Patrick with Mr. Krabs
        System.out.println(invitationList);                                     // ["Mr. Krabs", "Squidward", "Gary"]

        for (int i = 0; i < invitationList.size(); i++) {                       // iterate through the ArrayList and append "confirmed" to each element
            invitationList.set(i, invitationList.get(i) + " - confirmed");      // "Mr. Krab - confirmed"
        }

        System.out.println(invitationList);                                     // ["Mr. Krabs - confirmed", "Squidward - confirmed", "Gary - confirmed"]
    }

}
