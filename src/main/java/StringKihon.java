import static org.junit.jupiter.api.Assertions.assertEquals;

import framework.StringKihonBase;

public class StringKihon extends StringKihonBase {

    @Override
    protected String convertToUpperCase(String data) {
        return data.toUpperCase();
    }

    @Override
    protected String convertToLowerCase(String data) {
        return data.toLowerCase();
    }

    @Override
    protected String combinePartsOfAName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
    }

    @Override
    protected String combineTwoStrings(String a, String b) {
        return a + b;
    }

    @Override
    protected int determineTheLengthOfAString(String data) {
        return data.length();
    }

    @Override
    protected String removeAllLeadingWhitespace(String data) {
        return data.trim();
    }

    @Override
    protected String removeAllTrailingWhitespace(String data) {
        return data.trim();
    }

    @Override
    protected String[] splitAStringIntoAnArray(String input, char divider) {
        return input.split(String.valueOf(divider));
    }

    @Override
    protected String joinAnArrayIntoAString(String[] input, String divider) {
        return String.join(divider, input);
    }

    @Override
    protected boolean returnTrueIfAContainsB(String a, String b) {
        return a.contains(b);
    }

    @Override
    protected int determineThePositionOfAInB(String a, String b) {
        return b.indexOf(a);
    }

    @Override
    protected boolean returnTrueIfAStartsWithB(String a, String b) {
        return a.startsWith(b);
    }

    @Override
    protected boolean returnTrueIsAEndsWithB(String a, String b) {
        return a.endsWith(b);
    }

    @Override
    protected String returnTheFourthThroughSeventhCharactersOfInput(String input) {
        return input.substring(4, 7);
    }
}