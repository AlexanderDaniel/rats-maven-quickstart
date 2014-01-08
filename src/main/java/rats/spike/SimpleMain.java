package rats.spike;

import java.io.*;

class SimpleMain {

    public static void main(final String[] args) throws IOException {
        String postfix = parse(args[0]);
        System.out.println(postfix);
    }

    public static String parse(String infix) throws IOException {
        Reader reader = new StringReader(infix);
        SimpleParser parser = new SimpleParser(reader, "args[0]");
        xtc.parser.Result result = parser.pprogram(0);
        if (result.hasValue())
            return result.semanticValue();
        else
            throw new RuntimeException(result.parseError().msg + " " + result.parseError().index);
    }
}
