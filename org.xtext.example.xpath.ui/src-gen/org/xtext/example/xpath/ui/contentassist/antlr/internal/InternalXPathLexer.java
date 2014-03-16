package org.xtext.example.xpath.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXPathLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_ID=16;
    public static final int RULE_INTLITERAL=11;
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
    public static final int RULE_NODECOMP=6;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_VALUECOMP=4;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int RULE_ANYKINDTEST=19;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_STRINGLITERAL=10;
    public static final int T__59=59;
    public static final int RULE_COMMENTTEST=17;
    public static final int T__50=50;
    public static final int RULE_TEXTTEST=18;
    public static final int T__42=42;
    public static final int RULE_GENERALCOMP=5;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_DOUBLELITERAL=13;
    public static final int RULE_REVERSEAXIS=7;
    public static final int RULE_CONTEXTITEMEXPR=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int RULE_ABBREVREVERSESTEP=8;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int RULE_DECIMALLITERAL=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EMPTYSEQUENCETYPE=14;
    public static final int RULE_EMPTYITEMTYPE=15;
    public static final int RULE_WS=20;
    public static final int T__73=73;

    // delegates
    // delegators

    public InternalXPathLexer() {;} 
    public InternalXPathLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXPathLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11:7: ( 'some' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11:9: 'some'
            {
            match("some"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:12:7: ( 'every' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:12:9: 'every'
            {
            match("every"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:13:7: ( '+' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:13:9: '+'
            {
            match('+'); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:14:7: ( '-' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:14:9: '-'
            {
            match('-'); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:15:7: ( '*' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:15:9: '*'
            {
            match('*'); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:16:7: ( 'div' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:16:9: 'div'
            {
            match("div"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:17:7: ( 'idiv' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:17:9: 'idiv'
            {
            match("idiv"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:18:7: ( 'mod' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:18:9: 'mod'
            {
            match("mod"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:19:7: ( 'union' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:19:9: 'union'
            {
            match("union"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:20:7: ( '|' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:20:9: '|'
            {
            match('|'); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:21:7: ( 'intersect' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:21:9: 'intersect'
            {
            match("intersect"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:22:7: ( 'except' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:22:9: 'except'
            {
            match("except"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:23:7: ( '?' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:23:9: '?'
            {
            match('?'); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:24:7: ( ',' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:24:9: ','
            {
            match(','); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:25:7: ( 'return' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:25:9: 'return'
            {
            match("return"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:26:7: ( 'for' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:26:9: 'for'
            {
            match("for"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:27:7: ( '$' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:27:9: '$'
            {
            match('$'); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:28:7: ( 'in' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:28:9: 'in'
            {
            match("in"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:29:7: ( 'satisfies' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:29:9: 'satisfies'
            {
            match("satisfies"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:30:7: ( 'if' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:30:9: 'if'
            {
            match("if"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:31:7: ( '(' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:31:9: '('
            {
            match('('); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:32:7: ( ')' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:32:9: ')'
            {
            match(')'); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:33:7: ( 'then' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:33:9: 'then'
            {
            match("then"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:34:7: ( 'else' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:34:9: 'else'
            {
            match("else"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:35:7: ( 'or' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:35:9: 'or'
            {
            match("or"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:36:7: ( 'and' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:36:9: 'and'
            {
            match("and"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:37:7: ( 'to' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:37:9: 'to'
            {
            match("to"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:38:7: ( 'instance' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:38:9: 'instance'
            {
            match("instance"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:39:7: ( 'of' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:39:9: 'of'
            {
            match("of"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:40:7: ( 'treat' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:40:9: 'treat'
            {
            match("treat"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:41:7: ( 'as' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:41:9: 'as'
            {
            match("as"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:42:7: ( 'castable' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:42:9: 'castable'
            {
            match("castable"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:43:7: ( 'cast' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:43:9: 'cast'
            {
            match("cast"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:44:7: ( '/' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:44:9: '/'
            {
            match('/'); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:45:7: ( '//' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:45:9: '//'
            {
            match("//"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:46:7: ( '::' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:46:9: '::'
            {
            match("::"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:47:7: ( '@' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:47:9: '@'
            {
            match('@'); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:48:7: ( ':' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:48:9: ':'
            {
            match(':'); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:49:7: ( '[' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:49:9: '['
            {
            match('['); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:50:7: ( ']' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:50:9: ']'
            {
            match(']'); 

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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:51:7: ( 'document-node' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:51:9: 'document-node'
            {
            match("document-node"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:52:7: ( 'processing-instruction' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:52:9: 'processing-instruction'
            {
            match("processing-instruction"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:53:7: ( 'attribute' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:53:9: 'attribute'
            {
            match("attribute"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:54:7: ( 'schema-attribute' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:54:9: 'schema-attribute'
            {
            match("schema-attribute"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:55:7: ( 'element' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:55:9: 'element'
            {
            match("element"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:56:7: ( 'schema-element' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:56:9: 'schema-element'
            {
            match("schema-element"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:57:7: ( 'child' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:57:9: 'child'
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:58:7: ( 'descendant' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:58:9: 'descendant'
            {
            match("descendant"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:59:7: ( 'self' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:59:9: 'self'
            {
            match("self"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:60:7: ( 'descendant-or-self' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:60:9: 'descendant-or-self'
            {
            match("descendant-or-self"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:61:7: ( 'following-sibling' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:61:9: 'following-sibling'
            {
            match("following-sibling"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:62:7: ( 'following' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:62:9: 'following'
            {
            match("following"); 


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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:63:7: ( 'namespace' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:63:9: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "RULE_ABBREVREVERSESTEP"
    public final void mRULE_ABBREVREVERSESTEP() throws RecognitionException {
        try {
            int _type = RULE_ABBREVREVERSESTEP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11270:24: ( '..' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11270:26: '..'
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11272:22: ( '.' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11272:24: '.'
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11274:18: ( 'node' '(' ')' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11274:20: 'node' '(' ')'
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11276:15: ( 'text' '(' ')' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11276:17: 'text' '(' ')'
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11278:18: ( 'comment' '(' ')' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11278:20: 'comment' '(' ')'
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11280:20: ( 'item' '(' ')' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11280:22: 'item' '(' ')'
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11282:24: ( 'empty-sequence' '(' ')' )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11282:26: 'empty-sequence' '(' ')'
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11284:18: ( ( 'parent' '::' | 'ancestor' '::' | 'preceding-sibling' '::' | 'preceding' '::' | 'ancestor-or-self' '::' ) )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11284:20: ( 'parent' '::' | 'ancestor' '::' | 'preceding-sibling' '::' | 'preceding' '::' | 'ancestor-or-self' '::' )
            {
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11284:20: ( 'parent' '::' | 'ancestor' '::' | 'preceding-sibling' '::' | 'preceding' '::' | 'ancestor-or-self' '::' )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11284:21: 'parent' '::'
                    {
                    match("parent"); 

                    match("::"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11284:35: 'ancestor' '::'
                    {
                    match("ancestor"); 

                    match("::"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11284:51: 'preceding-sibling' '::'
                    {
                    match("preceding-sibling"); 

                    match("::"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11284:76: 'preceding' '::'
                    {
                    match("preceding"); 

                    match("::"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11284:93: 'ancestor-or-self' '::'
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

    // $ANTLR start "RULE_NODECOMP"
    public final void mRULE_NODECOMP() throws RecognitionException {
        try {
            int _type = RULE_NODECOMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11286:15: ( ( 'is' | '<<' | '>>' ) )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11286:17: ( 'is' | '<<' | '>>' )
            {
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11286:17: ( 'is' | '<<' | '>>' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt2=1;
                }
                break;
            case '<':
                {
                alt2=2;
                }
                break;
            case '>':
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11286:18: 'is'
                    {
                    match("is"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11286:23: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11286:28: '>>'
                    {
                    match(">>"); 


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
    // $ANTLR end "RULE_NODECOMP"

    // $ANTLR start "RULE_VALUECOMP"
    public final void mRULE_VALUECOMP() throws RecognitionException {
        try {
            int _type = RULE_VALUECOMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11288:16: ( ( 'eq' | 'ne' | 'lt' | 'le' | 'gt' | 'ge' ) )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11288:18: ( 'eq' | 'ne' | 'lt' | 'le' | 'gt' | 'ge' )
            {
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11288:18: ( 'eq' | 'ne' | 'lt' | 'le' | 'gt' | 'ge' )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 'e':
                {
                alt3=1;
                }
                break;
            case 'n':
                {
                alt3=2;
                }
                break;
            case 'l':
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3=='t') ) {
                    alt3=3;
                }
                else if ( (LA3_3=='e') ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 'g':
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4=='t') ) {
                    alt3=5;
                }
                else if ( (LA3_4=='e') ) {
                    alt3=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11288:19: 'eq'
                    {
                    match("eq"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11288:24: 'ne'
                    {
                    match("ne"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11288:29: 'lt'
                    {
                    match("lt"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11288:34: 'le'
                    {
                    match("le"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11288:39: 'gt'
                    {
                    match("gt"); 


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11288:44: 'ge'
                    {
                    match("ge"); 


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
    // $ANTLR end "RULE_VALUECOMP"

    // $ANTLR start "RULE_GENERALCOMP"
    public final void mRULE_GENERALCOMP() throws RecognitionException {
        try {
            int _type = RULE_GENERALCOMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11290:18: ( ( '=' | '!=' | '<' | '<=' | '>' | '>=' ) )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11290:20: ( '=' | '!=' | '<' | '<=' | '>' | '>=' )
            {
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11290:20: ( '=' | '!=' | '<' | '<=' | '>' | '>=' )
            int alt4=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt4=1;
                }
                break;
            case '!':
                {
                alt4=2;
                }
                break;
            case '<':
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3=='=') ) {
                    alt4=4;
                }
                else {
                    alt4=3;}
                }
                break;
            case '>':
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4=='=') ) {
                    alt4=6;
                }
                else {
                    alt4=5;}
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11290:21: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11290:25: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11290:30: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11290:34: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11290:39: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11290:43: '>='
                    {
                    match(">="); 


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
    // $ANTLR end "RULE_GENERALCOMP"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11292:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11292:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11292:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11292:11: '^'
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

            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11292:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:
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
            	    break loop6;
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11294:17: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11294:19: ( '0' .. '9' )+
            {
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11294:19: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11294:20: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11296:21: ( ( '.' RULE_INTLITERAL | RULE_INTLITERAL '.' RULE_INTLITERAL ) )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11296:23: ( '.' RULE_INTLITERAL | RULE_INTLITERAL '.' RULE_INTLITERAL )
            {
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11296:23: ( '.' RULE_INTLITERAL | RULE_INTLITERAL '.' RULE_INTLITERAL )
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
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11296:24: '.' RULE_INTLITERAL
                    {
                    match('.'); 
                    mRULE_INTLITERAL(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11296:44: RULE_INTLITERAL '.' RULE_INTLITERAL
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11298:20: ( ( '.' RULE_INTLITERAL | RULE_INTLITERAL ( '.' ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( '+' | '-' )? RULE_INTLITERAL )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11298:22: ( '.' RULE_INTLITERAL | RULE_INTLITERAL ( '.' ( '0' .. '9' )* )? ) ( 'e' | 'E' ) ( '+' | '-' )? RULE_INTLITERAL
            {
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11298:22: ( '.' RULE_INTLITERAL | RULE_INTLITERAL ( '.' ( '0' .. '9' )* )? )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='.') ) {
                alt11=1;
            }
            else if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11298:23: '.' RULE_INTLITERAL
                    {
                    match('.'); 
                    mRULE_INTLITERAL(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11298:43: RULE_INTLITERAL ( '.' ( '0' .. '9' )* )?
                    {
                    mRULE_INTLITERAL(); 
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11298:59: ( '.' ( '0' .. '9' )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='.') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11298:60: '.' ( '0' .. '9' )*
                            {
                            match('.'); 
                            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11298:64: ( '0' .. '9' )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11298:65: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop9;
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

            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11298:89: ( '+' | '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='+'||LA12_0=='-') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11300:20: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11300:22: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11300:22: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11300:23: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11300:27: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11300:28: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11300:73: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11300:93: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11300:98: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11300:99: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11300:144: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop14;
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
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11302:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11302:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:11302:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
        // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | RULE_ABBREVREVERSESTEP | RULE_CONTEXTITEMEXPR | RULE_ANYKINDTEST | RULE_TEXTTEST | RULE_COMMENTTEST | RULE_EMPTYITEMTYPE | RULE_EMPTYSEQUENCETYPE | RULE_REVERSEAXIS | RULE_NODECOMP | RULE_VALUECOMP | RULE_GENERALCOMP | RULE_ID | RULE_INTLITERAL | RULE_DECIMALLITERAL | RULE_DOUBLELITERAL | RULE_STRINGLITERAL | RULE_WS )
        int alt17=70;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:94: T__35
                {
                mT__35(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:100: T__36
                {
                mT__36(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:106: T__37
                {
                mT__37(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:112: T__38
                {
                mT__38(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:118: T__39
                {
                mT__39(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:124: T__40
                {
                mT__40(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:130: T__41
                {
                mT__41(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:136: T__42
                {
                mT__42(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:142: T__43
                {
                mT__43(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:148: T__44
                {
                mT__44(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:154: T__45
                {
                mT__45(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:160: T__46
                {
                mT__46(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:166: T__47
                {
                mT__47(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:172: T__48
                {
                mT__48(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:178: T__49
                {
                mT__49(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:184: T__50
                {
                mT__50(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:190: T__51
                {
                mT__51(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:196: T__52
                {
                mT__52(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:202: T__53
                {
                mT__53(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:208: T__54
                {
                mT__54(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:214: T__55
                {
                mT__55(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:220: T__56
                {
                mT__56(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:226: T__57
                {
                mT__57(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:232: T__58
                {
                mT__58(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:238: T__59
                {
                mT__59(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:244: T__60
                {
                mT__60(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:250: T__61
                {
                mT__61(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:256: T__62
                {
                mT__62(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:262: T__63
                {
                mT__63(); 

                }
                break;
            case 44 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:268: T__64
                {
                mT__64(); 

                }
                break;
            case 45 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:274: T__65
                {
                mT__65(); 

                }
                break;
            case 46 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:280: T__66
                {
                mT__66(); 

                }
                break;
            case 47 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:286: T__67
                {
                mT__67(); 

                }
                break;
            case 48 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:292: T__68
                {
                mT__68(); 

                }
                break;
            case 49 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:298: T__69
                {
                mT__69(); 

                }
                break;
            case 50 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:304: T__70
                {
                mT__70(); 

                }
                break;
            case 51 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:310: T__71
                {
                mT__71(); 

                }
                break;
            case 52 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:316: T__72
                {
                mT__72(); 

                }
                break;
            case 53 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:322: T__73
                {
                mT__73(); 

                }
                break;
            case 54 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:328: RULE_ABBREVREVERSESTEP
                {
                mRULE_ABBREVREVERSESTEP(); 

                }
                break;
            case 55 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:351: RULE_CONTEXTITEMEXPR
                {
                mRULE_CONTEXTITEMEXPR(); 

                }
                break;
            case 56 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:372: RULE_ANYKINDTEST
                {
                mRULE_ANYKINDTEST(); 

                }
                break;
            case 57 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:389: RULE_TEXTTEST
                {
                mRULE_TEXTTEST(); 

                }
                break;
            case 58 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:403: RULE_COMMENTTEST
                {
                mRULE_COMMENTTEST(); 

                }
                break;
            case 59 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:420: RULE_EMPTYITEMTYPE
                {
                mRULE_EMPTYITEMTYPE(); 

                }
                break;
            case 60 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:439: RULE_EMPTYSEQUENCETYPE
                {
                mRULE_EMPTYSEQUENCETYPE(); 

                }
                break;
            case 61 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:462: RULE_REVERSEAXIS
                {
                mRULE_REVERSEAXIS(); 

                }
                break;
            case 62 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:479: RULE_NODECOMP
                {
                mRULE_NODECOMP(); 

                }
                break;
            case 63 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:493: RULE_VALUECOMP
                {
                mRULE_VALUECOMP(); 

                }
                break;
            case 64 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:508: RULE_GENERALCOMP
                {
                mRULE_GENERALCOMP(); 

                }
                break;
            case 65 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:525: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 66 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:533: RULE_INTLITERAL
                {
                mRULE_INTLITERAL(); 

                }
                break;
            case 67 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:549: RULE_DECIMALLITERAL
                {
                mRULE_DECIMALLITERAL(); 

                }
                break;
            case 68 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:569: RULE_DOUBLELITERAL
                {
                mRULE_DOUBLELITERAL(); 

                }
                break;
            case 69 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:588: RULE_STRINGLITERAL
                {
                mRULE_STRINGLITERAL(); 

                }
                break;
            case 70 :
                // ../org.xtext.example.xpath.ui/src-gen/org/xtext/example/xpath/ui/contentassist/antlr/internal/InternalXPath.g:1:607: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA17 dfa17 = new DFA17(this);
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
            return "11284:20: ( 'parent' '::' | 'ancestor' '::' | 'preceding-sibling' '::' | 'preceding' '::' | 'ancestor-or-self' '::' )";
        }
    }
    static final String DFA17_eotS =
        "\1\uffff\2\43\3\uffff\4\43\3\uffff\2\43\3\uffff\4\43\1\111\1\113"+
        "\3\uffff\2\43\1\122\2\42\2\43\2\uffff\1\131\2\uffff\10\43\1\145"+
        "\4\43\1\154\1\155\1\43\1\124\5\43\1\165\2\43\1\170\1\171\1\43\1"+
        "\174\4\43\4\uffff\4\43\1\145\2\uffff\1\u0086\1\uffff\4\145\3\uffff"+
        "\11\43\1\uffff\1\u0091\5\43\2\uffff\1\43\1\u0098\2\43\1\u009b\2"+
        "\43\1\uffff\2\43\2\uffff\1\u00a0\1\43\1\uffff\11\43\1\uffff\1\u0086"+
        "\1\u00ab\2\43\1\u00ae\2\43\1\u00b1\2\43\1\uffff\2\43\1\u00b6\3\43"+
        "\1\uffff\2\43\1\uffff\1\43\1\u00bd\2\43\1\uffff\2\43\1\u00c3\7\43"+
        "\1\uffff\2\43\1\uffff\1\u00cd\1\43\1\uffff\4\43\1\uffff\2\43\1\uffff"+
        "\1\u00d5\2\43\1\uffff\1\u00d8\1\uffff\3\43\1\uffff\1\u00dc\5\43"+
        "\1\uffff\2\43\1\uffff\1\u00e4\1\43\1\uffff\4\43\1\uffff\1\u00ea"+
        "\1\43\1\uffff\3\43\1\uffff\6\43\2\uffff\1\u00f7\4\43\1\uffff\7\43"+
        "\1\uffff\2\43\3\uffff\3\43\1\u0108\3\43\1\u010b\1\uffff\3\43\1\u010f"+
        "\1\uffff\1\43\1\u0111\1\uffff\1\u0113\1\u0114\1\uffff\2\43\1\u0116"+
        "\1\uffff\1\u0118\4\uffff\1\43\4\uffff";
    static final String DFA17_eofS =
        "\u011a\uffff";
    static final String DFA17_minS =
        "\1\11\1\141\1\154\3\uffff\1\145\1\144\1\157\1\156\3\uffff\1\145"+
        "\1\157\3\uffff\1\145\1\146\1\156\1\141\1\57\1\72\3\uffff\2\141\1"+
        "\56\1\74\1\76\2\145\2\uffff\1\56\2\uffff\1\155\1\164\1\150\1\154"+
        "\1\145\1\143\1\145\1\160\1\60\1\166\1\143\1\163\1\151\2\60\1\145"+
        "\1\60\1\144\1\151\1\164\1\154\1\145\1\60\1\145\1\170\2\60\1\143"+
        "\1\60\1\164\1\163\1\151\1\155\4\uffff\1\145\1\162\1\155\1\144\1"+
        "\60\2\uffff\1\60\1\uffff\4\60\1\uffff\1\60\1\uffff\1\145\1\151\1"+
        "\145\1\146\1\162\2\145\1\155\1\164\1\uffff\1\60\1\165\1\143\1\166"+
        "\1\145\1\164\2\uffff\1\155\1\60\1\157\1\165\1\60\1\154\1\156\1\uffff"+
        "\1\141\1\164\2\uffff\1\60\1\145\1\uffff\1\162\1\164\1\154\1\155"+
        "\2\143\3\145\1\uffff\2\60\1\163\1\155\1\60\1\171\1\160\1\60\1\145"+
        "\1\171\1\uffff\1\155\1\145\1\60\1\162\1\141\1\50\1\uffff\1\156\1"+
        "\162\1\uffff\1\157\1\60\1\164\1\50\1\uffff\1\163\1\151\1\60\1\144"+
        "\3\145\1\156\1\163\1\50\1\uffff\1\146\1\141\1\uffff\1\60\1\164\1"+
        "\uffff\1\156\1\55\1\145\1\156\1\uffff\1\163\1\156\1\uffff\1\60\1"+
        "\156\1\167\1\uffff\1\60\1\uffff\1\164\2\142\1\uffff\1\60\1\156\1"+
        "\163\1\144\1\164\1\160\1\uffff\1\151\1\55\1\uffff\1\60\1\164\1\uffff"+
        "\1\156\1\144\1\145\1\143\1\uffff\1\60\1\151\1\uffff\1\157\1\165"+
        "\1\154\1\uffff\1\164\1\163\1\151\1\72\1\141\1\145\1\141\1\uffff"+
        "\1\60\1\164\1\141\1\143\1\145\1\uffff\1\156\1\162\1\164\1\145\1"+
        "\50\1\151\1\156\1\uffff\1\143\1\163\3\uffff\1\55\1\156\1\164\1\60"+
        "\1\147\1\55\1\145\1\60\1\uffff\1\156\1\147\1\145\1\60\1\uffff\1"+
        "\164\1\60\1\uffff\1\55\1\60\1\uffff\1\147\1\55\1\60\1\uffff\1\55"+
        "\4\uffff\1\55\4\uffff";
    static final String DFA17_maxS =
        "\1\174\1\157\1\170\3\uffff\1\157\1\164\1\157\1\156\3\uffff\1\145"+
        "\1\157\3\uffff\2\162\1\164\1\157\1\57\1\72\3\uffff\1\162\1\157\1"+
        "\71\1\74\1\76\2\164\2\uffff\1\145\2\uffff\1\155\1\164\1\150\1\154"+
        "\1\145\1\143\1\163\1\160\1\172\1\166\1\143\1\163\1\151\2\172\1\145"+
        "\1\172\1\144\1\151\1\164\1\162\1\145\1\172\1\145\1\170\2\172\1\144"+
        "\1\172\1\164\1\163\1\151\1\155\4\uffff\1\157\1\162\1\155\1\144\1"+
        "\172\2\uffff\1\145\1\uffff\4\172\1\uffff\1\145\1\uffff\1\145\1\151"+
        "\1\145\1\146\1\162\2\145\1\155\1\164\1\uffff\1\172\1\165\1\143\1"+
        "\166\1\145\1\164\2\uffff\1\155\1\172\1\157\1\165\1\172\1\154\1\156"+
        "\1\uffff\1\141\1\164\2\uffff\1\172\1\145\1\uffff\1\162\1\164\1\154"+
        "\1\155\2\143\3\145\1\uffff\1\145\1\172\1\163\1\155\1\172\1\171\1"+
        "\160\1\172\1\145\1\171\1\uffff\1\155\1\145\1\172\1\162\1\141\1\50"+
        "\1\uffff\1\156\1\162\1\uffff\1\157\1\172\1\164\1\50\1\uffff\1\163"+
        "\1\151\1\172\1\144\3\145\1\156\1\163\1\50\1\uffff\1\146\1\141\1"+
        "\uffff\1\172\1\164\1\uffff\1\156\1\55\1\145\1\156\1\uffff\1\163"+
        "\1\156\1\uffff\1\172\1\156\1\167\1\uffff\1\172\1\uffff\1\164\2\142"+
        "\1\uffff\1\172\1\156\1\163\1\144\1\164\1\160\1\uffff\1\151\1\55"+
        "\1\uffff\1\172\1\164\1\uffff\1\156\1\144\1\145\1\143\1\uffff\1\172"+
        "\1\151\1\uffff\1\157\1\165\1\154\1\uffff\1\164\1\163\1\151\1\72"+
        "\1\141\2\145\1\uffff\1\172\1\164\1\141\1\143\1\145\1\uffff\1\156"+
        "\1\162\1\164\1\145\1\50\1\151\1\156\1\uffff\1\143\1\163\3\uffff"+
        "\1\55\1\156\1\164\1\172\1\147\1\72\1\145\1\172\1\uffff\1\156\1\147"+
        "\1\145\1\172\1\uffff\1\164\1\172\1\uffff\2\172\1\uffff\1\147\1\72"+
        "\1\172\1\uffff\1\172\4\uffff\1\55\4\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\3\1\4\1\5\4\uffff\1\12\1\15\1\16\2\uffff\1\21\1\25\1"+
        "\26\6\uffff\1\45\1\47\1\50\7\uffff\1\100\1\101\1\uffff\1\105\1\106"+
        "\41\uffff\1\43\1\42\1\44\1\46\5\uffff\1\66\1\67\1\uffff\1\76\4\uffff"+
        "\1\102\1\uffff\1\104\11\uffff\1\77\6\uffff\1\22\1\24\7\uffff\1\33"+
        "\2\uffff\1\31\1\35\2\uffff\1\37\11\uffff\1\103\12\uffff\1\6\6\uffff"+
        "\1\10\2\uffff\1\20\4\uffff\1\32\12\uffff\1\1\2\uffff\1\61\2\uffff"+
        "\1\30\4\uffff\1\7\2\uffff\1\73\3\uffff\1\27\1\uffff\1\71\3\uffff"+
        "\1\41\6\uffff\1\70\2\uffff\1\2\2\uffff\1\74\4\uffff\1\11\2\uffff"+
        "\1\36\3\uffff\1\57\7\uffff\1\14\5\uffff\1\17\7\uffff\1\75\2\uffff"+
        "\1\54\1\56\1\55\10\uffff\1\72\4\uffff\1\51\2\uffff\1\34\2\uffff"+
        "\1\40\3\uffff\1\23\1\uffff\1\13\1\63\1\64\1\53\1\uffff\1\65\1\62"+
        "\1\60\1\52";
    static final String DFA17_specialS =
        "\u011a\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\46\2\uffff\1\46\22\uffff\1\46\1\42\1\45\1\uffff\1\17\2\uffff"+
            "\1\45\1\20\1\21\1\5\1\3\1\14\1\4\1\35\1\26\12\44\1\27\1\uffff"+
            "\1\36\1\42\1\37\1\13\1\30\32\43\1\31\1\uffff\1\32\2\43\1\uffff"+
            "\1\24\1\43\1\25\1\6\1\2\1\16\1\41\1\43\1\7\2\43\1\40\1\10\1"+
            "\34\1\23\1\33\1\43\1\15\1\1\1\22\1\11\5\43\1\uffff\1\12",
            "\1\50\1\uffff\1\51\1\uffff\1\52\11\uffff\1\47",
            "\1\55\1\56\3\uffff\1\57\4\uffff\1\53\1\uffff\1\54",
            "",
            "",
            "",
            "\1\62\3\uffff\1\60\5\uffff\1\61",
            "\1\63\1\uffff\1\65\7\uffff\1\64\4\uffff\1\67\1\66",
            "\1\70",
            "\1\71",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "\1\77\2\uffff\1\74\6\uffff\1\75\2\uffff\1\76",
            "\1\101\13\uffff\1\100",
            "\1\102\4\uffff\1\103\1\104",
            "\1\105\6\uffff\1\106\6\uffff\1\107",
            "\1\110",
            "\1\112",
            "",
            "",
            "",
            "\1\115\20\uffff\1\114",
            "\1\116\3\uffff\1\120\11\uffff\1\117",
            "\1\121\1\uffff\12\123",
            "\1\124",
            "\1\124",
            "\1\126\16\uffff\1\125",
            "\1\130\16\uffff\1\127",
            "",
            "",
            "\1\132\1\uffff\12\44\13\uffff\1\133\37\uffff\1\133",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\143\15\uffff\1\142",
            "\1\144",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\22\43\1\153\1\152"+
            "\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\156",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\163\5\uffff\1\162",
            "\1\164",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\166",
            "\1\167",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\173\1\172",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "",
            "",
            "",
            "\1\u0082\11\uffff\1\u0081",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\12\123\13\uffff\1\133\37\uffff\1\133",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\u0087\13\uffff\1\133\37\uffff\1\133",
            "",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "",
            "\1\u0097",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0099",
            "\1\u009a",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\u009f",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00a1",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "",
            "\12\u0087\13\uffff\1\133\37\uffff\1\133",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ac",
            "\1\u00ad",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00af",
            "\1\u00b0",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00be",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\1\u00c2\31\43",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00e5",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5\3\uffff\1\u00f6",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "",
            "",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0109",
            "\1\u00f2\14\uffff\1\u00f2",
            "\1\u010a",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0110",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0112\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0115",
            "\1\u00f2\14\uffff\1\u00f2",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0117\2\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32"+
            "\43",
            "",
            "",
            "",
            "",
            "\1\u0119",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | RULE_ABBREVREVERSESTEP | RULE_CONTEXTITEMEXPR | RULE_ANYKINDTEST | RULE_TEXTTEST | RULE_COMMENTTEST | RULE_EMPTYITEMTYPE | RULE_EMPTYSEQUENCETYPE | RULE_REVERSEAXIS | RULE_NODECOMP | RULE_VALUECOMP | RULE_GENERALCOMP | RULE_ID | RULE_INTLITERAL | RULE_DECIMALLITERAL | RULE_DOUBLELITERAL | RULE_STRINGLITERAL | RULE_WS );";
        }
    }
 

}