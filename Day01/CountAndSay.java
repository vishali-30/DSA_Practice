class countAndSay {
    public String Main(int n) {
        if (n <= 0) {

            return "0";
        }

        String res = "1";

        int i = 1;
        while (i < n) {

            StringBuilder ans = new StringBuilder();
            int count = 1;

            for (int j = 1; j < res.length(); j++) {
                if (res.charAt(j) == res.charAt(j - 1)) {
                    count++;
                }
                else {
                    ans.append(count);
                    ans.append(res.charAt(j - 1));
                    count = 1;
                }
            }
            ans.append(count);
            ans.append(res.charAt(res.length() - 1));
            res = ans.toString();
            i++;
        }

        return res;
    }
}
