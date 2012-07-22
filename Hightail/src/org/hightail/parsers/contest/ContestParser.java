package org.hightail.parsers.contest;

import java.util.ArrayList;
import org.hightail.util.StringPair;
import org.htmlparser.util.ParserException;

/**
 *
 * @author jtarnawski
 */

public abstract class ContestParser {
    abstract public ArrayList<StringPair> parse(String URL) throws ParserException;
    
    public static ContestParser getContestParser(String URL) throws ParserException {
        if (URL.contains("codeforces.")) {
            return new CodeForcesContestParser();
        }
        
        throw new ParserException("This site is currently unsupported.");
    }
}
