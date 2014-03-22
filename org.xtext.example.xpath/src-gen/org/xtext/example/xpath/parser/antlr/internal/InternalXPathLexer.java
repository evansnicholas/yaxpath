package org.xtext.example.xpath.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXPathLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_ID=13;
    public static final int RULE_INTLITERAL=8;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int RULE_ANYKINDTEST=16;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_STRINGLITERAL=7;
    public static final int T__59=59;
    public static final int RULE_COMMENTTEST=14;
    public static final int T__50=50;
    public static final int RULE_TEXTTEST=15;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__44=44;
    public static final int T__82=82;
    public static final int T__45=45;
    public static final int T__83=83;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLELITERAL=10;
    public static final int RULE_REVERSEAXIS=4;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int RULE_CONTEXTITEMEXPR=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int RULE_ABBREVREVERSESTEP=5;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int RULE_DECIMALLITERAL=9;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EMPTYSEQUENCETYPE=11;
    public static final int RULE_EMPTYITEMTYPE=12;
    public static final int T__76=76;
    public static final int RULE_WS=17;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalXPathLexer() {;} 
    public InternalXPathLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXPathLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g"; }

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:11:7: ( ',' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:12:7: ( 'return' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:12:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:13:7: ( 'for' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:13:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:14:7: ( '$' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:14:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:15:7: ( 'in' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:15:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:16:7: ( 'some' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:16:9: 'some'
            {
            match("some"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:17:7: ( 'every' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:17:9: 'every'
            {
            match("every"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:18:7: ( 'satisfies' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:18:9: 'satisfies'
            {
            match("satisfies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:19:7: ( 'if' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:19:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:20:7: ( '(' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:21:7: ( ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:22:7: ( 'then' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:22:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:23:7: ( 'else' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:23:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:24:7: ( 'or' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:24:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:25:7: ( 'and' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:25:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:26:7: ( 'to' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:26:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:27:7: ( '+' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:27:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:28:7: ( '-' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:28:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:29:7: ( '*' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:29:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:30:7: ( 'div' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:30:9: 'div'
            {
            match("div"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:31:7: ( 'idiv' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:31:9: 'idiv'
            {
            match("idiv"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:32:7: ( 'mod' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:32:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:33:7: ( 'union' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:33:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:34:7: ( '|' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:34:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:35:7: ( 'intersect' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:35:9: 'intersect'
            {
            match("intersect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:36:7: ( 'except' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:36:9: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:37:7: ( 'instance' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:37:9: 'instance'
            {
            match("instance"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:38:7: ( 'of' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:38:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:39:7: ( 'treat' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:39:9: 'treat'
            {
            match("treat"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:40:7: ( 'as' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:40:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:41:7: ( 'castable' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:41:9: 'castable'
            {
            match("castable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:42:7: ( 'cast' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:42:9: 'cast'
            {
            match("cast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:43:7: ( '=' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:43:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:44:7: ( '!=' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:44:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:45:7: ( '<' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:45:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:46:7: ( '<=' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:46:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:47:7: ( '>' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:47:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:48:7: ( '>=' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:48:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:49:7: ( 'eq' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:49:9: 'eq'
            {
            match("eq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:50:7: ( 'ne' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:50:9: 'ne'
            {
            match("ne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:51:7: ( 'lt' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:51:9: 'lt'
            {
            match("lt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:52:7: ( 'le' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:52:9: 'le'
            {
            match("le"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:53:7: ( 'gt' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:53:9: 'gt'
            {
            match("gt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:54:7: ( 'ge' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:54:9: 'ge'
            {
            match("ge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:55:7: ( 'is' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:55:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:56:7: ( '<<' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:56:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:57:7: ( '>>' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:57:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:58:7: ( '/' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:58:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:59:7: ( '//' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:59:9: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:60:7: ( 'child' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:60:9: 'child'
            {
            match("child"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:61:7: ( '::' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:61:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:62:7: ( 'descendant' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:62:9: 'descendant'
            {
            match("descendant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:63:7: ( 'attribute' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:63:9: 'attribute'
            {
            match("attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:64:7: ( 'self' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:64:9: 'self'
            {
            match("self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:65:7: ( 'descendant-or-self' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:65:9: 'descendant-or-self'
            {
            match("descendant-or-self"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:66:7: ( 'following-sibling' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:66:9: 'following-sibling'
            {
            match("following-sibling"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:67:7: ( 'following' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:67:9: 'following'
            {
            match("following"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:68:7: ( 'namespace' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:68:9: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:69:7: ( '@' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:69:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:70:7: ( ':' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:70:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:71:7: ( '[' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:71:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:72:7: ( ']' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:72:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:73:7: ( '?' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:73:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:74:7: ( 'document-node' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:74:9: 'document-node'
            {
            match("document-node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:75:7: ( 'processing-instruction' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:75:9: 'processing-instruction'
            {
            match("processing-instruction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:76:7: ( 'schema-attribute' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:76:9: 'schema-attribute'
            {
            match("schema-attribute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:77:7: ( 'element' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:77:9: 'element'
            {
            match("element"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:78:7: ( 'schema-element' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:78:9: 'schema-element'
            {
            match("schema-element"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "RULE_ABBREVREVERSESTEP"
    public final void mRULE_ABBREVREVERSESTEP() throws RecognitionException {
        try {
            int _type = RULE_ABBREVREVERSESTEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4774:24: ( '..' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4774:26: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ABBREVREVERSESTEP"

    // $ANTLR start "RULE_CONTEXTITEMEXPR"
    public final void mRULE_CONTEXTITEMEXPR() throws RecognitionException {
        try {
            int _type = RULE_CONTEXTITEMEXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4776:22: ( '.' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4776:24: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONTEXTITEMEXPR"

    // $ANTLR start "RULE_ANYKINDTEST"
    public final void mRULE_ANYKINDTEST() throws RecognitionException {
        try {
            int _type = RULE_ANYKINDTEST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4778:18: ( 'node' '(' ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4778:20: 'node' '(' ')'
            {
            match("node"); 

            match('('); 
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANYKINDTEST"

    // $ANTLR start "RULE_TEXTTEST"
    public final void mRULE_TEXTTEST() throws RecognitionException {
        try {
            int _type = RULE_TEXTTEST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4780:15: ( 'text' '(' ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4780:17: 'text' '(' ')'
            {
            match("text"); 

            match('('); 
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXTTEST"

    // $ANTLR start "RULE_COMMENTTEST"
    public final void mRULE_COMMENTTEST() throws RecognitionException {
        try {
            int _type = RULE_COMMENTTEST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4782:18: ( 'comment' '(' ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4782:20: 'comment' '(' ')'
            {
            match("comment"); 

            match('('); 
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENTTEST"

    // $ANTLR start "RULE_EMPTYITEMTYPE"
    public final void mRULE_EMPTYITEMTYPE() throws RecognitionException {
        try {
            int _type = RULE_EMPTYITEMTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4784:20: ( 'item' '(' ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4784:22: 'item' '(' ')'
            {
            match("item"); 

            match('('); 
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EMPTYITEMTYPE"

    // $ANTLR start "RULE_EMPTYSEQUENCETYPE"
    public final void mRULE_EMPTYSEQUENCETYPE() throws RecognitionException {
        try {
            int _type = RULE_EMPTYSEQUENCETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4786:24: ( 'empty-sequence' '(' ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4786:26: 'empty-sequence' '(' ')'
            {
            match("empty-sequence"); 

            match('('); 
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EMPTYSEQUENCETYPE"

    // $ANTLR start "RULE_REVERSEAXIS"
    public final void mRULE_REVERSEAXIS() throws RecognitionException {
        try {
            int _type = RULE_REVERSEAXIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4788:18: ( ( 'parent' '::' | 'ancestor' '::' | 'preceding-sibling' '::' | 'preceding' '::' | 'ancestor-or-self' '::' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4788:20: ( 'parent' '::' | 'ancestor' '::' | 'preceding-sibling' '::' | 'preceding' '::' | 'ancestor-or-self' '::' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4788:20: ( 'parent' '::' | 'ancestor' '::' | 'preceding-sibling' '::' | 'preceding' '::' | 'ancestor-or-self' '::' )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4788:21: 'parent' '::'
                    {
                    match("parent"); 

                    match("::"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4788:35: 'ancestor' '::'
                    {
                    match("ancestor"); 

                    match("::"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4788:51: 'preceding-sibling' '::'
                    {
                    match("preceding-sibling"); 

                    match("::"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4788:76: 'preceding' '::'
                    {
                    match("preceding"); 

                    match("::"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4788:93: 'ancestor-or-self' '::'
                    {
                    match("ancestor-or-self"); 

                    match("::"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REVERSEAXIS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4790:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4790:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4790:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4790:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4790:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INTLITERAL"
    public final void mRULE_INTLITERAL() throws RecognitionException {
        try {
            int _type = RULE_INTLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4792:17: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4792:19: ( '0' .. '9' )+
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4792:19: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4792:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTLITERAL"

    // $ANTLR start "RULE_DECIMALLITERAL"
    public final void mRULE_DECIMALLITERAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMALLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4794:21: ( ( '.' RULE_INTLITERAL | RULE_INTLITERAL '.' RULE_INTLITERAL ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4794:23: ( '.' RULE_INTLITERAL | RULE_INTLITERAL '.' RULE_INTLITERAL )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4794:23: ( '.' RULE_INTLITERAL | RULE_INTLITERAL '.' RULE_INTLITERAL )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='.') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4794:24: '.' RULE_INTLITERAL
                    {
                    match('.'); 
                    mRULE_INTLITERAL(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4794:44: RULE_INTLITERAL '.' RULE_INTLITERAL
                    {
                    mRULE_INTLITERAL(); 
                    match('.'); 
                    mRULE_INTLITERAL(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMALLITERAL"

    // $ANTLR start "RULE_DOUBLELITERAL"
    public final void mRULE_DOUBLELITERAL() throws RecognitionException {
        try {
            int _type = RULE_DOUBLELITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4796:20: ( ( '.' RULE_INTLITERAL | RULE_INTLITERAL ( '.' ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( '+' | '-' )? RULE_INTLITERAL )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4796:22: ( '.' RULE_INTLITERAL | RULE_INTLITERAL ( '.' ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( '+' | '-' )? RULE_INTLITERAL
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4796:22: ( '.' RULE_INTLITERAL | RULE_INTLITERAL ( '.' ( '0' .. '9' )* )? )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='.') ) {
                alt8=1;
            }
            else if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4796:23: '.' RULE_INTLITERAL
                    {
                    match('.'); 
                    mRULE_INTLITERAL(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4796:43: RULE_INTLITERAL ( '.' ( '0' .. '9' )* )?
                    {
                    mRULE_INTLITERAL(); 
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4796:59: ( '.' ( '0' .. '9' )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='.') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4796:60: '.' ( '0' .. '9' )*
                            {
                            match('.'); 
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4796:64: ( '0' .. '9' )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4796:65: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4796:89: ( '+' | '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_INTLITERAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLELITERAL"

    // $ANTLR start "RULE_STRINGLITERAL"
    public final void mRULE_STRINGLITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRINGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4798:20: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4798:22: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4798:22: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4798:23: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4798:27: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4798:28: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4798:73: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4798:93: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4798:98: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4798:99: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4798:144: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRINGLITERAL"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4800:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4800:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4800:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:8: ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | RULE_ABBREVREVERSESTEP | RULE_CONTEXTITEMEXPR | RULE_ANYKINDTEST | RULE_TEXTTEST | RULE_COMMENTTEST | RULE_EMPTYITEMTYPE | RULE_EMPTYSEQUENCETYPE | RULE_REVERSEAXIS | RULE_ID | RULE_INTLITERAL | RULE_DECIMALLITERAL | RULE_DOUBLELITERAL | RULE_STRINGLITERAL | RULE_WS )
        int alt14=82;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:10: T__18
                {
                mT__18(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:16: T__19
                {
                mT__19(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:22: T__20
                {
                mT__20(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:28: T__21
                {
                mT__21(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:34: T__22
                {
                mT__22(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:40: T__23
                {
                mT__23(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:46: T__24
                {
                mT__24(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:52: T__25
                {
                mT__25(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:58: T__26
                {
                mT__26(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:64: T__27
                {
                mT__27(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:70: T__28
                {
                mT__28(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:76: T__29
                {
                mT__29(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:82: T__30
                {
                mT__30(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:88: T__31
                {
                mT__31(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:94: T__32
                {
                mT__32(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:100: T__33
                {
                mT__33(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:106: T__34
                {
                mT__34(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:112: T__35
                {
                mT__35(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:118: T__36
                {
                mT__36(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:124: T__37
                {
                mT__37(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:130: T__38
                {
                mT__38(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:136: T__39
                {
                mT__39(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:142: T__40
                {
                mT__40(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:148: T__41
                {
                mT__41(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:154: T__42
                {
                mT__42(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:160: T__43
                {
                mT__43(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:166: T__44
                {
                mT__44(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:172: T__45
                {
                mT__45(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:178: T__46
                {
                mT__46(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:184: T__47
                {
                mT__47(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:190: T__48
                {
                mT__48(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:196: T__49
                {
                mT__49(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:202: T__50
                {
                mT__50(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:208: T__51
                {
                mT__51(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:214: T__52
                {
                mT__52(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:220: T__53
                {
                mT__53(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:226: T__54
                {
                mT__54(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:232: T__55
                {
                mT__55(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:238: T__56
                {
                mT__56(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:244: T__57
                {
                mT__57(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:250: T__58
                {
                mT__58(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:256: T__59
                {
                mT__59(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:262: T__60
                {
                mT__60(); 

                }
                break;
            case 44 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:268: T__61
                {
                mT__61(); 

                }
                break;
            case 45 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:274: T__62
                {
                mT__62(); 

                }
                break;
            case 46 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:280: T__63
                {
                mT__63(); 

                }
                break;
            case 47 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:286: T__64
                {
                mT__64(); 

                }
                break;
            case 48 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:292: T__65
                {
                mT__65(); 

                }
                break;
            case 49 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:298: T__66
                {
                mT__66(); 

                }
                break;
            case 50 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:304: T__67
                {
                mT__67(); 

                }
                break;
            case 51 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:310: T__68
                {
                mT__68(); 

                }
                break;
            case 52 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:316: T__69
                {
                mT__69(); 

                }
                break;
            case 53 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:322: T__70
                {
                mT__70(); 

                }
                break;
            case 54 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:328: T__71
                {
                mT__71(); 

                }
                break;
            case 55 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:334: T__72
                {
                mT__72(); 

                }
                break;
            case 56 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:340: T__73
                {
                mT__73(); 

                }
                break;
            case 57 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:346: T__74
                {
                mT__74(); 

                }
                break;
            case 58 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:352: T__75
                {
                mT__75(); 

                }
                break;
            case 59 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:358: T__76
                {
                mT__76(); 

                }
                break;
            case 60 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:364: T__77
                {
                mT__77(); 

                }
                break;
            case 61 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:370: T__78
                {
                mT__78(); 

                }
                break;
            case 62 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:376: T__79
                {
                mT__79(); 

                }
                break;
            case 63 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:382: T__80
                {
                mT__80(); 

                }
                break;
            case 64 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:388: T__81
                {
                mT__81(); 

                }
                break;
            case 65 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:394: T__82
                {
                mT__82(); 

                }
                break;
            case 66 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:400: T__83
                {
                mT__83(); 

                }
                break;
            case 67 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:406: T__84
                {
                mT__84(); 

                }
                break;
            case 68 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:412: T__85
                {
                mT__85(); 

                }
                break;
            case 69 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:418: RULE_ABBREVREVERSESTEP
                {
                mRULE_ABBREVREVERSESTEP(); 

                }
                break;
            case 70 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:441: RULE_CONTEXTITEMEXPR
                {
                mRULE_CONTEXTITEMEXPR(); 

                }
                break;
            case 71 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:462: RULE_ANYKINDTEST
                {
                mRULE_ANYKINDTEST(); 

                }
                break;
            case 72 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:479: RULE_TEXTTEST
                {
                mRULE_TEXTTEST(); 

                }
                break;
            case 73 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:493: RULE_COMMENTTEST
                {
                mRULE_COMMENTTEST(); 

                }
                break;
            case 74 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:510: RULE_EMPTYITEMTYPE
                {
                mRULE_EMPTYITEMTYPE(); 

                }
                break;
            case 75 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:529: RULE_EMPTYSEQUENCETYPE
                {
                mRULE_EMPTYSEQUENCETYPE(); 

                }
                break;
            case 76 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:552: RULE_REVERSEAXIS
                {
                mRULE_REVERSEAXIS(); 

                }
                break;
            case 77 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:569: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 78 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:577: RULE_INTLITERAL
                {
                mRULE_INTLITERAL(); 

                }
                break;
            case 79 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:593: RULE_DECIMALLITERAL
                {
                mRULE_DECIMALLITERAL(); 

                }
                break;
            case 80 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:613: RULE_DOUBLELITERAL
                {
                mRULE_DOUBLELITERAL(); 

                }
                break;
            case 81 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:632: RULE_STRINGLITERAL
                {
                mRULE_STRINGLITERAL(); 

                }
                break;
            case 82 :
                // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1:651: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA1_eotS =
        "\27\uffff";
    static final String DFA1_eofS =
        "\27\uffff";
    static final String DFA1_minS =
        "\2\141\1\156\1\uffff\1\145\2\143\2\145\1\163\1\144\1\164\1\151\1"+
        "\157\1\156\1\162\1\147\2\55\4\uffff";
    static final String DFA1_maxS =
        "\1\160\1\162\1\156\1\uffff\1\145\2\143\2\145\1\163\1\144\1\164\1"+
        "\151\1\157\1\156\1\162\1\147\2\72\4\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\1\17\uffff\1\2\1\5\1\3\1\4";
    static final String DFA1_specialS =
        "\27\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\2\16\uffff\1\1",
            "\1\3\20\uffff\1\4",
            "\1\5",
            "",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\24\14\uffff\1\23",
            "\1\25\14\uffff\1\26",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "4788:20: ( 'parent' '::' | 'ancestor' '::' | 'preceding-sibling' '::' | 'preceding' '::' | 'ancestor-or-self' '::' )";
        }
    }
    static final String DFA14_eotS =
        "\2\uffff\2\44\1\uffff\3\44\2\uffff\3\44\3\uffff\3\44\1\uffff\1\44"+
        "\2\uffff\1\113\1\116\3\44\1\127\1\131\4\uffff\1\44\1\136\1\uffff"+
        "\1\137\2\uffff\2\44\1\147\1\150\1\44\1\152\10\44\1\164\2\44\1\167"+
        "\2\44\1\172\1\173\1\44\1\176\11\44\6\uffff\1\u0088\2\44\1\u008b"+
        "\1\u008c\1\u008d\1\u008e\4\uffff\2\44\1\uffff\1\u0092\4\uffff\1"+
        "\44\1\u0095\3\44\2\uffff\1\44\1\uffff\11\44\1\uffff\2\44\1\uffff"+
        "\2\44\2\uffff\1\u00a7\1\44\1\uffff\1\44\1\u00aa\2\44\1\u00ad\4\44"+
        "\1\uffff\2\44\4\uffff\3\44\1\uffff\1\u0092\1\44\1\uffff\3\44\1\u00bb"+
        "\1\44\1\u00bd\1\44\1\u00bf\2\44\1\u00c2\3\44\1\u00c6\2\44\1\uffff"+
        "\2\44\1\uffff\2\44\1\uffff\1\44\1\u00cf\13\44\3\uffff\1\44\1\uffff"+
        "\1\44\1\u00dd\1\uffff\3\44\1\uffff\1\u00e1\1\uffff\4\44\1\u00e6"+
        "\1\44\1\uffff\1\u00e8\2\44\1\uffff\3\44\1\u00ee\5\44\1\uffff\1\44"+
        "\1\u00f5\2\uffff\4\44\1\uffff\1\44\1\uffff\5\44\1\uffff\4\44\1\uffff"+
        "\1\u0106\1\uffff\11\44\1\uffff\2\44\1\u0112\1\44\3\uffff\4\44\1"+
        "\u0117\1\uffff\3\44\1\u011c\1\u011d\1\uffff\1\u011e\1\u011f\1\44"+
        "\2\uffff\1\u0121\2\44\5\uffff\1\u0124\1\uffff\1\44\3\uffff";
    static final String DFA14_eofS =
        "\u0126\uffff";
    static final String DFA14_minS =
        "\1\11\1\uffff\1\145\1\157\1\uffff\1\144\1\141\1\154\2\uffff\1\145"+
        "\1\146\1\156\3\uffff\1\145\1\157\1\156\1\uffff\1\141\2\uffff\1\74"+
        "\1\75\1\141\2\145\1\57\1\72\4\uffff\1\141\1\56\1\uffff\1\56\2\uffff"+
        "\1\164\1\154\2\60\1\151\1\60\1\145\1\155\1\164\1\154\1\150\2\145"+
        "\1\143\1\60\1\160\1\145\1\60\1\145\1\170\2\60\1\143\1\60\1\164\1"+
        "\166\1\163\1\143\1\144\1\151\1\163\1\151\1\155\6\uffff\1\60\1\155"+
        "\1\144\4\60\4\uffff\1\145\1\162\1\uffff\1\60\2\uffff\1\60\1\uffff"+
        "\1\165\1\60\1\154\1\145\1\164\2\uffff\1\166\1\uffff\1\155\1\145"+
        "\1\151\1\146\1\145\1\162\1\145\1\155\1\145\1\uffff\1\164\1\156\1"+
        "\uffff\1\141\1\164\2\uffff\1\60\1\145\1\uffff\1\162\1\60\1\143\1"+
        "\165\1\60\1\157\1\164\1\154\1\155\1\uffff\2\145\4\uffff\2\143\1"+
        "\145\1\uffff\1\60\1\162\1\uffff\1\157\1\162\1\141\1\60\1\50\1\60"+
        "\1\163\1\60\1\155\1\171\1\60\1\145\1\160\1\171\1\60\1\164\1\50\1"+
        "\uffff\1\163\1\151\1\uffff\1\145\1\155\1\uffff\1\156\1\60\1\144"+
        "\1\145\1\163\1\50\2\145\2\156\1\167\1\163\1\156\3\uffff\1\146\1"+
        "\uffff\1\141\1\60\1\uffff\1\156\1\164\1\55\1\uffff\1\60\1\uffff"+
        "\1\164\1\142\1\156\1\145\1\60\1\142\1\uffff\1\60\1\156\1\160\1\uffff"+
        "\1\163\1\144\1\164\1\60\1\151\1\145\1\143\1\151\1\55\1\uffff\1\164"+
        "\1\60\2\uffff\1\157\1\165\1\144\1\156\1\uffff\1\154\1\uffff\1\164"+
        "\1\141\1\163\1\151\1\72\1\uffff\1\156\1\143\2\145\1\141\1\60\1\uffff"+
        "\1\162\1\164\1\141\1\164\1\145\1\50\1\143\1\151\1\156\1\uffff\1"+
        "\147\1\164\1\60\1\163\3\uffff\1\55\1\145\1\156\1\55\1\60\1\uffff"+
        "\1\145\1\156\1\147\1\55\1\60\1\uffff\2\60\1\164\2\uffff\1\60\1\147"+
        "\1\55\5\uffff\1\55\1\uffff\1\55\3\uffff";
    static final String DFA14_maxS =
        "\1\174\1\uffff\1\145\1\157\1\uffff\1\164\1\157\1\170\2\uffff\2\162"+
        "\1\164\3\uffff\2\157\1\156\1\uffff\1\157\2\uffff\1\75\1\76\1\157"+
        "\2\164\1\57\1\72\4\uffff\1\162\1\71\1\uffff\1\145\2\uffff\1\164"+
        "\1\162\2\172\1\151\1\172\1\145\1\155\1\164\1\154\1\150\1\145\1\163"+
        "\1\143\1\172\1\160\1\145\1\172\1\145\1\170\2\172\1\144\1\172\1\164"+
        "\1\166\1\163\1\143\1\144\1\151\1\163\1\151\1\155\6\uffff\1\172\1"+
        "\155\1\144\4\172\4\uffff\1\157\1\162\1\uffff\1\145\2\uffff\1\145"+
        "\1\uffff\1\165\1\172\1\154\1\145\1\164\2\uffff\1\166\1\uffff\1\155"+
        "\1\145\1\151\1\146\1\145\1\162\1\145\1\155\1\145\1\uffff\1\164\1"+
        "\156\1\uffff\1\141\1\164\2\uffff\1\172\1\145\1\uffff\1\162\1\172"+
        "\1\143\1\165\1\172\1\157\1\164\1\154\1\155\1\uffff\2\145\4\uffff"+
        "\2\143\1\145\1\uffff\1\145\1\162\1\uffff\1\157\1\162\1\141\1\172"+
        "\1\50\1\172\1\163\1\172\1\155\1\171\1\172\1\145\1\160\1\171\1\172"+
        "\1\164\1\50\1\uffff\1\163\1\151\1\uffff\1\145\1\155\1\uffff\1\156"+
        "\1\172\1\144\1\145\1\163\1\50\2\145\2\156\1\167\1\163\1\156\3\uffff"+
        "\1\146\1\uffff\1\141\1\172\1\uffff\1\156\1\164\1\55\1\uffff\1\172"+
        "\1\uffff\1\164\1\142\1\156\1\145\1\172\1\142\1\uffff\1\172\1\156"+
        "\1\160\1\uffff\1\163\1\144\1\164\1\172\1\151\1\145\1\143\1\151\1"+
        "\55\1\uffff\1\164\1\172\2\uffff\1\157\1\165\1\144\1\156\1\uffff"+
        "\1\154\1\uffff\1\164\1\141\1\163\1\151\1\72\1\uffff\1\156\1\143"+
        "\3\145\1\172\1\uffff\1\162\1\164\1\141\1\164\1\145\1\50\1\143\1"+
        "\151\1\156\1\uffff\1\147\1\164\1\172\1\163\3\uffff\1\72\1\145\1"+
        "\156\1\55\1\172\1\uffff\1\145\1\156\1\147\2\172\1\uffff\2\172\1"+
        "\164\2\uffff\1\172\1\147\1\72\5\uffff\1\172\1\uffff\1\55\3\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\3\uffff\1\12\1\13\3\uffff\1\21\1\22\1\23"+
        "\3\uffff\1\30\1\uffff\1\41\1\42\7\uffff\1\73\1\75\1\76\1\77\2\uffff"+
        "\1\115\1\uffff\1\121\1\122\41\uffff\1\44\1\56\1\43\1\46\1\57\1\45"+
        "\7\uffff\1\61\1\60\1\63\1\74\2\uffff\1\105\1\uffff\1\106\1\116\1"+
        "\uffff\1\120\5\uffff\1\5\1\11\1\uffff\1\55\11\uffff\1\47\2\uffff"+
        "\1\20\2\uffff\1\16\1\34\2\uffff\1\36\11\uffff\1\50\2\uffff\1\51"+
        "\1\52\1\53\1\54\3\uffff\1\117\2\uffff\1\3\21\uffff\1\17\2\uffff"+
        "\1\24\2\uffff\1\26\15\uffff\1\25\1\112\1\6\1\uffff\1\66\2\uffff"+
        "\1\15\3\uffff\1\14\1\uffff\1\110\6\uffff\1\40\3\uffff\1\107\11\uffff"+
        "\1\7\2\uffff\1\113\1\35\4\uffff\1\27\1\uffff\1\62\5\uffff\1\2\6"+
        "\uffff\1\32\11\uffff\1\114\4\uffff\1\102\1\104\1\103\5\uffff\1\111"+
        "\5\uffff\1\33\3\uffff\1\100\1\37\3\uffff\1\70\1\71\1\31\1\10\1\65"+
        "\1\uffff\1\72\1\uffff\1\67\1\64\1\101";
    static final String DFA14_specialS =
        "\u0126\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\47\2\uffff\1\47\22\uffff\1\47\1\26\1\46\1\uffff\1\4\2\uffff"+
            "\1\46\1\10\1\11\1\17\1\15\1\1\1\16\1\43\1\34\12\45\1\35\1\uffff"+
            "\1\27\1\25\1\30\1\41\1\36\32\44\1\37\1\uffff\1\40\2\44\1\uffff"+
            "\1\14\1\44\1\24\1\20\1\7\1\3\1\33\1\44\1\5\2\44\1\32\1\21\1"+
            "\31\1\13\1\42\1\44\1\2\1\6\1\12\1\22\5\44\1\uffff\1\23",
            "",
            "\1\50",
            "\1\51",
            "",
            "\1\54\1\uffff\1\53\7\uffff\1\52\4\uffff\1\55\1\56",
            "\1\60\1\uffff\1\62\1\uffff\1\61\11\uffff\1\57",
            "\1\64\1\67\3\uffff\1\66\4\uffff\1\63\1\uffff\1\65",
            "",
            "",
            "\1\73\2\uffff\1\70\6\uffff\1\71\2\uffff\1\72",
            "\1\75\13\uffff\1\74",
            "\1\76\4\uffff\1\77\1\100",
            "",
            "",
            "",
            "\1\102\3\uffff\1\101\5\uffff\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106\6\uffff\1\107\6\uffff\1\110",
            "",
            "",
            "\1\112\1\111",
            "\1\114\1\115",
            "\1\120\3\uffff\1\117\11\uffff\1\121",
            "\1\123\16\uffff\1\122",
            "\1\125\16\uffff\1\124",
            "\1\126",
            "\1\130",
            "",
            "",
            "",
            "",
            "\1\133\20\uffff\1\132",
            "\1\134\1\uffff\12\135",
            "",
            "\1\140\1\uffff\12\45\13\uffff\1\141\37\uffff\1\141",
            "",
            "",
            "\1\142",
            "\1\144\5\uffff\1\143",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\22\44\1\146\1\145"+
            "\6\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\151",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\162\15\uffff\1\161",
            "\1\163",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\165",
            "\1\166",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\170",
            "\1\171",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\175\1\174",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0089",
            "\1\u008a",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "",
            "",
            "\1\u0090\11\uffff\1\u008f",
            "\1\u0091",
            "",
            "\12\135\13\uffff\1\141\37\uffff\1\141",
            "",
            "",
            "\12\u0093\13\uffff\1\141\37\uffff\1\141",
            "",
            "\1\u0094",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ab",
            "\1\u00ac",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\12\u0093\13\uffff\1\141\37\uffff\1\141",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00bc",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00be",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c0",
            "\1\u00c1",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00c7",
            "\1\u00c8",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\1\u00ce\31\44",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "",
            "",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00e7",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\u00f4",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104\3\uffff\1\u0105",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "\1\u0110",
            "\1\u0111",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0113",
            "",
            "",
            "",
            "\1\u00ff\14\uffff\1\u00ff",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0120",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0122",
            "\1\u00ff\14\uffff\1\u00ff",
            "",
            "",
            "",
            "",
            "",
            "\1\u0123\2\uffff\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32"+
            "\44",
            "",
            "\1\u0125",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | RULE_ABBREVREVERSESTEP | RULE_CONTEXTITEMEXPR | RULE_ANYKINDTEST | RULE_TEXTTEST | RULE_COMMENTTEST | RULE_EMPTYITEMTYPE | RULE_EMPTYSEQUENCETYPE | RULE_REVERSEAXIS | RULE_ID | RULE_INTLITERAL | RULE_DECIMALLITERAL | RULE_DOUBLELITERAL | RULE_STRINGLITERAL | RULE_WS );";
        }
    }
 

}