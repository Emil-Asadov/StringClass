//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var s1 = "Java";
        var s2 = "java";
        var s3 = "JAVA";
        var s4 = " ";
        var s5 = " llll";

        var resChar = s1.charAt(1);
        System.out.println(resChar);

        var resUzunluq = s1.length();
        System.out.println(resUzunluq);

        var resConcat = s1.concat(s2);
        System.out.println(resConcat);

        var resContains = s1.contains("j");
        System.out.println(resContains);

        var resIndexOf1 = s1.indexOf('v');
        System.out.println(resIndexOf1);

        var resIndexOf2 = s1.indexOf("av");
        System.out.println(resIndexOf2);

        var resEndWith = s1.endsWith("a");
        System.out.println(resEndWith);

        var resIsEmpty = s4.isEmpty();
        System.out.println(resIsEmpty);

        var resLower = s3.toLowerCase();
        System.out.println(resLower);

        var resUpper = s2.toUpperCase();
        System.out.println(resUpper);

        var resSubstring1 = s2.substring(1);
        System.out.println(resSubstring1);

        var resSubstring2 = s2.substring(1, 3);
        System.out.println(resSubstring2);

        var resMatches = s2.matches(s3);
        System.out.println(resMatches);

        var resTrim = s5.trim();
        System.out.println(resTrim);
        var resTrim1 = s4.trim().isEmpty();
        System.out.println(resTrim1);

        var resReplaceAll = s1.replaceAll("ava", "dava");
        System.out.println(resReplaceAll);

        var resReplace = s1.replace('v', 'b');
        System.out.println(resReplace);

        var resEquals = s1.equals("java");
        System.out.println(resEquals);

        var resequalsIgnoreCase = s1.equalsIgnoreCase("java");
        System.out.println(resequalsIgnoreCase);
    }
}