import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
//        String[] emailNew = new String[emails.length];
        for (String email : emails) {
            String[] emailArr = email.split("@");
            emailArr[0] = localName(emailArr[0]);
            set.add(emailArr[0] + emailArr[1]);
        }
        return set.size();
    }


    public String localName(String name) {
        String localName;
        if (name.contains("+")) {
            localName = name.substring(0, name.indexOf("+")).replace(".", "");
        } else {
            localName = name.replace(".", "");
        }
        return localName;
    }
}


