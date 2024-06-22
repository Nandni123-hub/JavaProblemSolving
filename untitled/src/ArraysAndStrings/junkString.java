package ArraysAndStrings;

public class junkString {
    public static void main(String[] args) {
        String str = "Sagar is working In Paytm";
        String junk = "SagarisworkingInewsdfghjknlmfSagarisworkingInPaytmcPgvhbjnaytkmERSDFGHBJNKMERTFGYH456785678RFCGVHBJNCFVGHBJ123456789GVHBJNMKFCGVHBJNGVHBJNKMgvhbnjrtfyghujfgvhbjnCRTYGUHI$E%^&*(XDFCG HJNFTYGUHI%^TYGUHJ";

        int count = 0;
        str = str.replace(" ", "");

        while (true) {
            int index = 0; // Pointer for str
            StringBuilder newJunk = new StringBuilder();
            boolean found = false;
            for (int i = 0; i < junk.length(); i++) {
                if (index < str.length() && junk.charAt(i) == str.charAt(index)) {
                    index++;
                    if (index == str.length()) {
                        found = true;
                        index = 0;
                        // Reset index for next potential match
                    }
                } else {
                    newJunk.append(junk.charAt(i));
                }
            }

            if (found) {
                count++;
                junk = newJunk.toString(); // Update junk with the new string
            } else {
                break; // No more matches found
            }
        }

        System.out.println("The string '" + str + "' was found and removed " + count + " times from the junk string.");
    }
}
