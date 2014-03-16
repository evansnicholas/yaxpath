package org.xtext.example.xpath.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.xpath.services.XPathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXPathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VALUECOMP", "RULE_GENERALCOMP", "RULE_NODECOMP", "RULE_REVERSEAXIS", "RULE_ABBREVREVERSESTEP", "RULE_CONTEXTITEMEXPR", "RULE_STRINGLITERAL", "RULE_INTLITERAL", "RULE_DECIMALLITERAL", "RULE_DOUBLELITERAL", "RULE_EMPTYSEQUENCETYPE", "RULE_EMPTYITEMTYPE", "RULE_ID", "RULE_COMMENTTEST", "RULE_TEXTTEST", "RULE_ANYKINDTEST", "RULE_WS", "','", "'return'", "'for'", "'$'", "'in'", "'some'", "'every'", "'satisfies'", "'if'", "'('", "')'", "'then'", "'else'", "'or'", "'and'", "'to'", "'+'", "'-'", "'*'", "'div'", "'idiv'", "'mod'", "'union'", "'|'", "'intersect'", "'except'", "'instance'", "'of'", "'treat'", "'as'", "'castable'", "'cast'", "'/'", "'//'", "'child'", "'::'", "'descendant'", "'attribute'", "'self'", "'descendant-or-self'", "'following-sibling'", "'following'", "'namespace'", "'@'", "':'", "'['", "']'", "'?'", "'document-node'", "'processing-instruction'", "'schema-attribute'", "'element'", "'schema-element'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=16;
    public static final int RULE_INTLITERAL=11;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int RULE_NODECOMP=6;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_VALUECOMP=4;
    public static final int T__61=61;
    public static final int RULE_ANYKINDTEST=19;
    public static final int EOF=-1;
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
    public static final int RULE_DOUBLELITERAL=13;
    public static final int T__49=49;
    public static final int RULE_REVERSEAXIS=7;
    public static final int RULE_CONTEXTITEMEXPR=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ABBREVREVERSESTEP=8;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int RULE_DECIMALLITERAL=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EMPTYITEMTYPE=15;
    public static final int RULE_EMPTYSEQUENCETYPE=14;
    public static final int RULE_WS=20;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalXPathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXPathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXPathParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g"; }



     	private XPathGrammarAccess grammarAccess;
     	
        public InternalXPathParser(TokenStream input, XPathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Expr";	
       	}
       	
       	@Override
       	protected XPathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:67:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:68:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:69:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr75);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:76:1: ruleExpr returns [EObject current=null] : ( ( (lv_exprSingle_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprSingle_0_0 = null;

        EObject lv_exprsSingle_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:79:28: ( ( ( (lv_exprSingle_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:80:1: ( ( (lv_exprSingle_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:80:1: ( ( (lv_exprSingle_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:80:2: ( (lv_exprSingle_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:80:2: ( (lv_exprSingle_0_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:81:1: (lv_exprSingle_0_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:81:1: (lv_exprSingle_0_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:82:3: lv_exprSingle_0_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getExprAccess().getExprSingleExprSingleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleExpr131);
            lv_exprSingle_0_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprRule());
            	        }
                   		set(
                   			current, 
                   			"exprSingle",
                    		lv_exprSingle_0_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:98:2: (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:98:4: otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleExpr144); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExprAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:102:1: ( (lv_exprsSingle_2_0= ruleExprSingle ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:103:1: (lv_exprsSingle_2_0= ruleExprSingle )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:103:1: (lv_exprsSingle_2_0= ruleExprSingle )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:104:3: lv_exprsSingle_2_0= ruleExprSingle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAccess().getExprsSingleExprSingleParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprSingle_in_ruleExpr165);
            	    lv_exprsSingle_2_0=ruleExprSingle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exprsSingle",
            	            		lv_exprsSingle_2_0, 
            	            		"ExprSingle");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleExprSingle"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:128:1: entryRuleExprSingle returns [EObject current=null] : iv_ruleExprSingle= ruleExprSingle EOF ;
    public final EObject entryRuleExprSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSingle = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:129:2: (iv_ruleExprSingle= ruleExprSingle EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:130:2: iv_ruleExprSingle= ruleExprSingle EOF
            {
             newCompositeNode(grammarAccess.getExprSingleRule()); 
            pushFollow(FOLLOW_ruleExprSingle_in_entryRuleExprSingle203);
            iv_ruleExprSingle=ruleExprSingle();

            state._fsp--;

             current =iv_ruleExprSingle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSingle213); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSingle"


    // $ANTLR start "ruleExprSingle"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:137:1: ruleExprSingle returns [EObject current=null] : (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr ) ;
    public final EObject ruleExprSingle() throws RecognitionException {
        EObject current = null;

        EObject this_ForExpr_0 = null;

        EObject this_QuantifiedExpr_1 = null;

        EObject this_IfExpr_2 = null;

        EObject this_OrExpr_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:140:28: ( (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:141:1: (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:141:1: (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 26:
            case 27:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case RULE_REVERSEAXIS:
            case RULE_ABBREVREVERSESTEP:
            case RULE_CONTEXTITEMEXPR:
            case RULE_STRINGLITERAL:
            case RULE_INTLITERAL:
            case RULE_DECIMALLITERAL:
            case RULE_DOUBLELITERAL:
            case RULE_ID:
            case RULE_COMMENTTEST:
            case RULE_TEXTTEST:
            case RULE_ANYKINDTEST:
            case 24:
            case 30:
            case 37:
            case 38:
            case 39:
            case 53:
            case 54:
            case 55:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:142:5: this_ForExpr_0= ruleForExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getForExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForExpr_in_ruleExprSingle260);
                    this_ForExpr_0=ruleForExpr();

                    state._fsp--;

                     
                            current = this_ForExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:152:5: this_QuantifiedExpr_1= ruleQuantifiedExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getQuantifiedExprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuantifiedExpr_in_ruleExprSingle287);
                    this_QuantifiedExpr_1=ruleQuantifiedExpr();

                    state._fsp--;

                     
                            current = this_QuantifiedExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:162:5: this_IfExpr_2= ruleIfExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getIfExprParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIfExpr_in_ruleExprSingle314);
                    this_IfExpr_2=ruleIfExpr();

                    state._fsp--;

                     
                            current = this_IfExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:172:5: this_OrExpr_3= ruleOrExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getOrExprParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOrExpr_in_ruleExprSingle341);
                    this_OrExpr_3=ruleOrExpr();

                    state._fsp--;

                     
                            current = this_OrExpr_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSingle"


    // $ANTLR start "entryRuleForExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:188:1: entryRuleForExpr returns [EObject current=null] : iv_ruleForExpr= ruleForExpr EOF ;
    public final EObject entryRuleForExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:189:2: (iv_ruleForExpr= ruleForExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:190:2: iv_ruleForExpr= ruleForExpr EOF
            {
             newCompositeNode(grammarAccess.getForExprRule()); 
            pushFollow(FOLLOW_ruleForExpr_in_entryRuleForExpr376);
            iv_ruleForExpr=ruleForExpr();

            state._fsp--;

             current =iv_ruleForExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForExpr386); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForExpr"


    // $ANTLR start "ruleForExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:197:1: ruleForExpr returns [EObject current=null] : ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) ) ;
    public final EObject ruleForExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_for_0_0 = null;

        EObject lv_return_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:200:28: ( ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:201:1: ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:201:1: ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:201:2: ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:201:2: ( (lv_for_0_0= ruleSimpleForClause ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:202:1: (lv_for_0_0= ruleSimpleForClause )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:202:1: (lv_for_0_0= ruleSimpleForClause )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:203:3: lv_for_0_0= ruleSimpleForClause
            {
             
            	        newCompositeNode(grammarAccess.getForExprAccess().getForSimpleForClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleForClause_in_ruleForExpr432);
            lv_for_0_0=ruleSimpleForClause();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForExprRule());
            	        }
                   		set(
                   			current, 
                   			"for",
                    		lv_for_0_0, 
                    		"SimpleForClause");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleForExpr444); 

                	newLeafNode(otherlv_1, grammarAccess.getForExprAccess().getReturnKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:223:1: ( (lv_return_2_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:224:1: (lv_return_2_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:224:1: (lv_return_2_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:225:3: lv_return_2_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getForExprAccess().getReturnExprSingleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleForExpr465);
            lv_return_2_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForExprRule());
            	        }
                   		set(
                   			current, 
                   			"return",
                    		lv_return_2_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForExpr"


    // $ANTLR start "entryRuleSimpleForClause"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:249:1: entryRuleSimpleForClause returns [EObject current=null] : iv_ruleSimpleForClause= ruleSimpleForClause EOF ;
    public final EObject entryRuleSimpleForClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleForClause = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:250:2: (iv_ruleSimpleForClause= ruleSimpleForClause EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:251:2: iv_ruleSimpleForClause= ruleSimpleForClause EOF
            {
             newCompositeNode(grammarAccess.getSimpleForClauseRule()); 
            pushFollow(FOLLOW_ruleSimpleForClause_in_entryRuleSimpleForClause501);
            iv_ruleSimpleForClause=ruleSimpleForClause();

            state._fsp--;

             current =iv_ruleSimpleForClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleForClause511); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleForClause"


    // $ANTLR start "ruleSimpleForClause"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:258:1: ruleSimpleForClause returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '$' ( (lv_forVar_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ( (lv_additionalIn_5_0= ruleAdditionalIn ) )* ) ;
    public final EObject ruleSimpleForClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_forVar_2_0 = null;

        EObject lv_in_4_0 = null;

        EObject lv_additionalIn_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:261:28: ( (otherlv_0= 'for' otherlv_1= '$' ( (lv_forVar_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ( (lv_additionalIn_5_0= ruleAdditionalIn ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:262:1: (otherlv_0= 'for' otherlv_1= '$' ( (lv_forVar_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ( (lv_additionalIn_5_0= ruleAdditionalIn ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:262:1: (otherlv_0= 'for' otherlv_1= '$' ( (lv_forVar_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ( (lv_additionalIn_5_0= ruleAdditionalIn ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:262:3: otherlv_0= 'for' otherlv_1= '$' ( (lv_forVar_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ( (lv_additionalIn_5_0= ruleAdditionalIn ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleSimpleForClause548); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleForClauseAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleSimpleForClause560); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleForClauseAccess().getDollarSignKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:270:1: ( (lv_forVar_2_0= ruleVarName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:271:1: (lv_forVar_2_0= ruleVarName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:271:1: (lv_forVar_2_0= ruleVarName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:272:3: lv_forVar_2_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getSimpleForClauseAccess().getForVarVarNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleSimpleForClause581);
            lv_forVar_2_0=ruleVarName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleForClauseRule());
            	        }
                   		set(
                   			current, 
                   			"forVar",
                    		lv_forVar_2_0, 
                    		"VarName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleSimpleForClause593); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleForClauseAccess().getInKeyword_3());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:292:1: ( (lv_in_4_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:293:1: (lv_in_4_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:293:1: (lv_in_4_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:294:3: lv_in_4_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getSimpleForClauseAccess().getInExprSingleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleSimpleForClause614);
            lv_in_4_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSimpleForClauseRule());
            	        }
                   		set(
                   			current, 
                   			"in",
                    		lv_in_4_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:310:2: ( (lv_additionalIn_5_0= ruleAdditionalIn ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:311:1: (lv_additionalIn_5_0= ruleAdditionalIn )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:311:1: (lv_additionalIn_5_0= ruleAdditionalIn )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:312:3: lv_additionalIn_5_0= ruleAdditionalIn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimpleForClauseAccess().getAdditionalInAdditionalInParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalIn_in_ruleSimpleForClause635);
            	    lv_additionalIn_5_0=ruleAdditionalIn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSimpleForClauseRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"additionalIn",
            	            		lv_additionalIn_5_0, 
            	            		"AdditionalIn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleForClause"


    // $ANTLR start "entryRuleAdditionalIn"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:336:1: entryRuleAdditionalIn returns [EObject current=null] : iv_ruleAdditionalIn= ruleAdditionalIn EOF ;
    public final EObject entryRuleAdditionalIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalIn = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:337:2: (iv_ruleAdditionalIn= ruleAdditionalIn EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:338:2: iv_ruleAdditionalIn= ruleAdditionalIn EOF
            {
             newCompositeNode(grammarAccess.getAdditionalInRule()); 
            pushFollow(FOLLOW_ruleAdditionalIn_in_entryRuleAdditionalIn672);
            iv_ruleAdditionalIn=ruleAdditionalIn();

            state._fsp--;

             current =iv_ruleAdditionalIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionalIn682); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditionalIn"


    // $ANTLR start "ruleAdditionalIn"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:345:1: ruleAdditionalIn returns [EObject current=null] : (otherlv_0= ',' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ) ;
    public final EObject ruleAdditionalIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;

        EObject lv_in_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:348:28: ( (otherlv_0= ',' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:349:1: (otherlv_0= ',' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:349:1: (otherlv_0= ',' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:349:3: otherlv_0= ',' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAdditionalIn719); 

                	newLeafNode(otherlv_0, grammarAccess.getAdditionalInAccess().getCommaKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleAdditionalIn731); 

                	newLeafNode(otherlv_1, grammarAccess.getAdditionalInAccess().getDollarSignKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:357:1: ( (lv_variable_2_0= ruleVarName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:358:1: (lv_variable_2_0= ruleVarName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:358:1: (lv_variable_2_0= ruleVarName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:359:3: lv_variable_2_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getAdditionalInAccess().getVariableVarNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleAdditionalIn752);
            lv_variable_2_0=ruleVarName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdditionalInRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_2_0, 
                    		"VarName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAdditionalIn764); 

                	newLeafNode(otherlv_3, grammarAccess.getAdditionalInAccess().getInKeyword_3());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:379:1: ( (lv_in_4_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:380:1: (lv_in_4_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:380:1: (lv_in_4_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:381:3: lv_in_4_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getAdditionalInAccess().getInExprSingleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleAdditionalIn785);
            lv_in_4_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdditionalInRule());
            	        }
                   		set(
                   			current, 
                   			"in",
                    		lv_in_4_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditionalIn"


    // $ANTLR start "entryRuleQuantifiedExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:405:1: entryRuleQuantifiedExpr returns [EObject current=null] : iv_ruleQuantifiedExpr= ruleQuantifiedExpr EOF ;
    public final EObject entryRuleQuantifiedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:406:2: (iv_ruleQuantifiedExpr= ruleQuantifiedExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:407:2: iv_ruleQuantifiedExpr= ruleQuantifiedExpr EOF
            {
             newCompositeNode(grammarAccess.getQuantifiedExprRule()); 
            pushFollow(FOLLOW_ruleQuantifiedExpr_in_entryRuleQuantifiedExpr821);
            iv_ruleQuantifiedExpr=ruleQuantifiedExpr();

            state._fsp--;

             current =iv_ruleQuantifiedExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedExpr831); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantifiedExpr"


    // $ANTLR start "ruleQuantifiedExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:414:1: ruleQuantifiedExpr returns [EObject current=null] : ( (otherlv_0= 'some' | otherlv_1= 'every' ) otherlv_2= '$' ( (lv_variable_3_0= ruleVarName ) ) otherlv_4= 'in' ( (lv_in_5_0= ruleExprSingle ) ) ( (lv_additionalIn_6_0= ruleAdditionalIn ) )* otherlv_7= 'satisfies' ( (lv_satisfy_8_0= ruleExprSingle ) ) ) ;
    public final EObject ruleQuantifiedExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_variable_3_0 = null;

        EObject lv_in_5_0 = null;

        EObject lv_additionalIn_6_0 = null;

        EObject lv_satisfy_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:417:28: ( ( (otherlv_0= 'some' | otherlv_1= 'every' ) otherlv_2= '$' ( (lv_variable_3_0= ruleVarName ) ) otherlv_4= 'in' ( (lv_in_5_0= ruleExprSingle ) ) ( (lv_additionalIn_6_0= ruleAdditionalIn ) )* otherlv_7= 'satisfies' ( (lv_satisfy_8_0= ruleExprSingle ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:418:1: ( (otherlv_0= 'some' | otherlv_1= 'every' ) otherlv_2= '$' ( (lv_variable_3_0= ruleVarName ) ) otherlv_4= 'in' ( (lv_in_5_0= ruleExprSingle ) ) ( (lv_additionalIn_6_0= ruleAdditionalIn ) )* otherlv_7= 'satisfies' ( (lv_satisfy_8_0= ruleExprSingle ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:418:1: ( (otherlv_0= 'some' | otherlv_1= 'every' ) otherlv_2= '$' ( (lv_variable_3_0= ruleVarName ) ) otherlv_4= 'in' ( (lv_in_5_0= ruleExprSingle ) ) ( (lv_additionalIn_6_0= ruleAdditionalIn ) )* otherlv_7= 'satisfies' ( (lv_satisfy_8_0= ruleExprSingle ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:418:2: (otherlv_0= 'some' | otherlv_1= 'every' ) otherlv_2= '$' ( (lv_variable_3_0= ruleVarName ) ) otherlv_4= 'in' ( (lv_in_5_0= ruleExprSingle ) ) ( (lv_additionalIn_6_0= ruleAdditionalIn ) )* otherlv_7= 'satisfies' ( (lv_satisfy_8_0= ruleExprSingle ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:418:2: (otherlv_0= 'some' | otherlv_1= 'every' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:418:4: otherlv_0= 'some'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleQuantifiedExpr869); 

                        	newLeafNode(otherlv_0, grammarAccess.getQuantifiedExprAccess().getSomeKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:423:7: otherlv_1= 'every'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleQuantifiedExpr887); 

                        	newLeafNode(otherlv_1, grammarAccess.getQuantifiedExprAccess().getEveryKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleQuantifiedExpr900); 

                	newLeafNode(otherlv_2, grammarAccess.getQuantifiedExprAccess().getDollarSignKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:431:1: ( (lv_variable_3_0= ruleVarName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:432:1: (lv_variable_3_0= ruleVarName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:432:1: (lv_variable_3_0= ruleVarName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:433:3: lv_variable_3_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getVariableVarNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleQuantifiedExpr921);
            lv_variable_3_0=ruleVarName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantifiedExprRule());
            	        }
                   		set(
                   			current, 
                   			"variable",
                    		lv_variable_3_0, 
                    		"VarName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleQuantifiedExpr933); 

                	newLeafNode(otherlv_4, grammarAccess.getQuantifiedExprAccess().getInKeyword_3());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:453:1: ( (lv_in_5_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:454:1: (lv_in_5_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:454:1: (lv_in_5_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:455:3: lv_in_5_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getInExprSingleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr954);
            lv_in_5_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantifiedExprRule());
            	        }
                   		set(
                   			current, 
                   			"in",
                    		lv_in_5_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:471:2: ( (lv_additionalIn_6_0= ruleAdditionalIn ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:472:1: (lv_additionalIn_6_0= ruleAdditionalIn )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:472:1: (lv_additionalIn_6_0= ruleAdditionalIn )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:473:3: lv_additionalIn_6_0= ruleAdditionalIn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getAdditionalInAdditionalInParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalIn_in_ruleQuantifiedExpr975);
            	    lv_additionalIn_6_0=ruleAdditionalIn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuantifiedExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"additionalIn",
            	            		lv_additionalIn_6_0, 
            	            		"AdditionalIn");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleQuantifiedExpr988); 

                	newLeafNode(otherlv_7, grammarAccess.getQuantifiedExprAccess().getSatisfiesKeyword_6());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:493:1: ( (lv_satisfy_8_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:494:1: (lv_satisfy_8_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:494:1: (lv_satisfy_8_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:495:3: lv_satisfy_8_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getSatisfyExprSingleParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr1009);
            lv_satisfy_8_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantifiedExprRule());
            	        }
                   		set(
                   			current, 
                   			"satisfy",
                    		lv_satisfy_8_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantifiedExpr"


    // $ANTLR start "entryRuleIfExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:519:1: entryRuleIfExpr returns [EObject current=null] : iv_ruleIfExpr= ruleIfExpr EOF ;
    public final EObject entryRuleIfExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:520:2: (iv_ruleIfExpr= ruleIfExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:521:2: iv_ruleIfExpr= ruleIfExpr EOF
            {
             newCompositeNode(grammarAccess.getIfExprRule()); 
            pushFollow(FOLLOW_ruleIfExpr_in_entryRuleIfExpr1045);
            iv_ruleIfExpr=ruleIfExpr();

            state._fsp--;

             current =iv_ruleIfExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpr1055); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExpr"


    // $ANTLR start "ruleIfExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:528:1: ruleIfExpr returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) ) ;
    public final EObject ruleIfExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_2_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:531:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:532:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:532:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:532:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleIfExpr1092); 

                	newLeafNode(otherlv_0, grammarAccess.getIfExprAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleIfExpr1104); 

                	newLeafNode(otherlv_1, grammarAccess.getIfExprAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:540:1: ( (lv_if_2_0= ruleExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:541:1: (lv_if_2_0= ruleExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:541:1: (lv_if_2_0= ruleExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:542:3: lv_if_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getIfExprAccess().getIfExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleIfExpr1125);
            lv_if_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExprRule());
            	        }
                   		set(
                   			current, 
                   			"if",
                    		lv_if_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleIfExpr1137); 

                	newLeafNode(otherlv_3, grammarAccess.getIfExprAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleIfExpr1149); 

                	newLeafNode(otherlv_4, grammarAccess.getIfExprAccess().getThenKeyword_4());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:566:1: ( (lv_then_5_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:567:1: (lv_then_5_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:567:1: (lv_then_5_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:568:3: lv_then_5_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getIfExprAccess().getThenExprSingleParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleIfExpr1170);
            lv_then_5_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExprRule());
            	        }
                   		set(
                   			current, 
                   			"then",
                    		lv_then_5_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleIfExpr1182); 

                	newLeafNode(otherlv_6, grammarAccess.getIfExprAccess().getElseKeyword_6());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:588:1: ( (lv_else_7_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:589:1: (lv_else_7_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:589:1: (lv_else_7_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:590:3: lv_else_7_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getIfExprAccess().getElseExprSingleParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleIfExpr1203);
            lv_else_7_0=ruleExprSingle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfExprRule());
            	        }
                   		set(
                   			current, 
                   			"else",
                    		lv_else_7_0, 
                    		"ExprSingle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExpr"


    // $ANTLR start "entryRuleOrExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:614:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:615:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:616:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr1239);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr1249); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:623:1: ruleOrExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_rights_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:626:28: ( ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:627:1: ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:627:1: ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:627:2: ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:627:2: ( (lv_left_0_0= ruleAndExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:628:1: (lv_left_0_0= ruleAndExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:628:1: (lv_left_0_0= ruleAndExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:629:3: lv_left_0_0= ruleAndExpr
            {
             
            	        newCompositeNode(grammarAccess.getOrExprAccess().getLeftAndExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr1295);
            lv_left_0_0=ruleAndExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"AndExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:645:2: (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:645:4: otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleOrExpr1308); 

            	        	newLeafNode(otherlv_1, grammarAccess.getOrExprAccess().getOrKeyword_1_0());
            	        
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:649:1: ( (lv_rights_2_0= ruleAndExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:650:1: (lv_rights_2_0= ruleAndExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:650:1: (lv_rights_2_0= ruleAndExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:651:3: lv_rights_2_0= ruleAndExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExprAccess().getRightsAndExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr1329);
            	    lv_rights_2_0=ruleAndExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rights",
            	            		lv_rights_2_0, 
            	            		"AndExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:675:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:676:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:677:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr1367);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr1377); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:684:1: ruleAndExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_rights_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:687:28: ( ( ( (lv_left_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:688:1: ( ( (lv_left_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:688:1: ( ( (lv_left_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:688:2: ( (lv_left_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:688:2: ( (lv_left_0_0= ruleComparisonExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:689:1: (lv_left_0_0= ruleComparisonExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:689:1: (lv_left_0_0= ruleComparisonExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:690:3: lv_left_0_0= ruleComparisonExpr
            {
             
            	        newCompositeNode(grammarAccess.getAndExprAccess().getLeftComparisonExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComparisonExpr_in_ruleAndExpr1423);
            lv_left_0_0=ruleComparisonExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"ComparisonExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:706:2: (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:706:4: otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleAndExpr1436); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAndExprAccess().getAndKeyword_1_0());
            	        
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:710:1: ( (lv_rights_2_0= ruleComparisonExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:711:1: (lv_rights_2_0= ruleComparisonExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:711:1: (lv_rights_2_0= ruleComparisonExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:712:3: lv_rights_2_0= ruleComparisonExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExprAccess().getRightsComparisonExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparisonExpr_in_ruleAndExpr1457);
            	    lv_rights_2_0=ruleComparisonExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rights",
            	            		lv_rights_2_0, 
            	            		"ComparisonExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleComparisonExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:736:1: entryRuleComparisonExpr returns [EObject current=null] : iv_ruleComparisonExpr= ruleComparisonExpr EOF ;
    public final EObject entryRuleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:737:2: (iv_ruleComparisonExpr= ruleComparisonExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:738:2: iv_ruleComparisonExpr= ruleComparisonExpr EOF
            {
             newCompositeNode(grammarAccess.getComparisonExprRule()); 
            pushFollow(FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr1495);
            iv_ruleComparisonExpr=ruleComparisonExpr();

            state._fsp--;

             current =iv_ruleComparisonExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonExpr1505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonExpr"


    // $ANTLR start "ruleComparisonExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:745:1: ruleComparisonExpr returns [EObject current=null] : ( ( (lv_range_0_0= ruleRangeExpr ) ) ( ( ( (lv_value_1_0= RULE_VALUECOMP ) ) | ( (lv_gen_2_0= RULE_GENERALCOMP ) ) | ( (lv_node_3_0= RULE_NODECOMP ) ) ) ( (lv_otherRange_4_0= ruleRangeExpr ) ) )? ) ;
    public final EObject ruleComparisonExpr() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_gen_2_0=null;
        Token lv_node_3_0=null;
        EObject lv_range_0_0 = null;

        EObject lv_otherRange_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:748:28: ( ( ( (lv_range_0_0= ruleRangeExpr ) ) ( ( ( (lv_value_1_0= RULE_VALUECOMP ) ) | ( (lv_gen_2_0= RULE_GENERALCOMP ) ) | ( (lv_node_3_0= RULE_NODECOMP ) ) ) ( (lv_otherRange_4_0= ruleRangeExpr ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:749:1: ( ( (lv_range_0_0= ruleRangeExpr ) ) ( ( ( (lv_value_1_0= RULE_VALUECOMP ) ) | ( (lv_gen_2_0= RULE_GENERALCOMP ) ) | ( (lv_node_3_0= RULE_NODECOMP ) ) ) ( (lv_otherRange_4_0= ruleRangeExpr ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:749:1: ( ( (lv_range_0_0= ruleRangeExpr ) ) ( ( ( (lv_value_1_0= RULE_VALUECOMP ) ) | ( (lv_gen_2_0= RULE_GENERALCOMP ) ) | ( (lv_node_3_0= RULE_NODECOMP ) ) ) ( (lv_otherRange_4_0= ruleRangeExpr ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:749:2: ( (lv_range_0_0= ruleRangeExpr ) ) ( ( ( (lv_value_1_0= RULE_VALUECOMP ) ) | ( (lv_gen_2_0= RULE_GENERALCOMP ) ) | ( (lv_node_3_0= RULE_NODECOMP ) ) ) ( (lv_otherRange_4_0= ruleRangeExpr ) ) )?
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:749:2: ( (lv_range_0_0= ruleRangeExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:750:1: (lv_range_0_0= ruleRangeExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:750:1: (lv_range_0_0= ruleRangeExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:751:3: lv_range_0_0= ruleRangeExpr
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getRangeRangeExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRangeExpr_in_ruleComparisonExpr1551);
            lv_range_0_0=ruleRangeExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
            	        }
                   		set(
                   			current, 
                   			"range",
                    		lv_range_0_0, 
                    		"RangeExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:767:2: ( ( ( (lv_value_1_0= RULE_VALUECOMP ) ) | ( (lv_gen_2_0= RULE_GENERALCOMP ) ) | ( (lv_node_3_0= RULE_NODECOMP ) ) ) ( (lv_otherRange_4_0= ruleRangeExpr ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_VALUECOMP && LA9_0<=RULE_NODECOMP)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:767:3: ( ( (lv_value_1_0= RULE_VALUECOMP ) ) | ( (lv_gen_2_0= RULE_GENERALCOMP ) ) | ( (lv_node_3_0= RULE_NODECOMP ) ) ) ( (lv_otherRange_4_0= ruleRangeExpr ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:767:3: ( ( (lv_value_1_0= RULE_VALUECOMP ) ) | ( (lv_gen_2_0= RULE_GENERALCOMP ) ) | ( (lv_node_3_0= RULE_NODECOMP ) ) )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case RULE_VALUECOMP:
                        {
                        alt8=1;
                        }
                        break;
                    case RULE_GENERALCOMP:
                        {
                        alt8=2;
                        }
                        break;
                    case RULE_NODECOMP:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:767:4: ( (lv_value_1_0= RULE_VALUECOMP ) )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:767:4: ( (lv_value_1_0= RULE_VALUECOMP ) )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:768:1: (lv_value_1_0= RULE_VALUECOMP )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:768:1: (lv_value_1_0= RULE_VALUECOMP )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:769:3: lv_value_1_0= RULE_VALUECOMP
                            {
                            lv_value_1_0=(Token)match(input,RULE_VALUECOMP,FOLLOW_RULE_VALUECOMP_in_ruleComparisonExpr1570); 

                            			newLeafNode(lv_value_1_0, grammarAccess.getComparisonExprAccess().getValueVALUECOMPTerminalRuleCall_1_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getComparisonExprRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"value",
                                    		lv_value_1_0, 
                                    		"VALUECOMP");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:786:6: ( (lv_gen_2_0= RULE_GENERALCOMP ) )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:786:6: ( (lv_gen_2_0= RULE_GENERALCOMP ) )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:787:1: (lv_gen_2_0= RULE_GENERALCOMP )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:787:1: (lv_gen_2_0= RULE_GENERALCOMP )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:788:3: lv_gen_2_0= RULE_GENERALCOMP
                            {
                            lv_gen_2_0=(Token)match(input,RULE_GENERALCOMP,FOLLOW_RULE_GENERALCOMP_in_ruleComparisonExpr1598); 

                            			newLeafNode(lv_gen_2_0, grammarAccess.getComparisonExprAccess().getGenGENERALCOMPTerminalRuleCall_1_0_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getComparisonExprRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"gen",
                                    		lv_gen_2_0, 
                                    		"GENERALCOMP");
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:805:6: ( (lv_node_3_0= RULE_NODECOMP ) )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:805:6: ( (lv_node_3_0= RULE_NODECOMP ) )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:806:1: (lv_node_3_0= RULE_NODECOMP )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:806:1: (lv_node_3_0= RULE_NODECOMP )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:807:3: lv_node_3_0= RULE_NODECOMP
                            {
                            lv_node_3_0=(Token)match(input,RULE_NODECOMP,FOLLOW_RULE_NODECOMP_in_ruleComparisonExpr1626); 

                            			newLeafNode(lv_node_3_0, grammarAccess.getComparisonExprAccess().getNodeNODECOMPTerminalRuleCall_1_0_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getComparisonExprRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"node",
                                    		lv_node_3_0, 
                                    		"NODECOMP");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:823:3: ( (lv_otherRange_4_0= ruleRangeExpr ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:824:1: (lv_otherRange_4_0= ruleRangeExpr )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:824:1: (lv_otherRange_4_0= ruleRangeExpr )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:825:3: lv_otherRange_4_0= ruleRangeExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getOtherRangeRangeExprParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRangeExpr_in_ruleComparisonExpr1653);
                    lv_otherRange_4_0=ruleRangeExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"otherRange",
                            		lv_otherRange_4_0, 
                            		"RangeExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonExpr"


    // $ANTLR start "entryRuleRangeExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:849:1: entryRuleRangeExpr returns [EObject current=null] : iv_ruleRangeExpr= ruleRangeExpr EOF ;
    public final EObject entryRuleRangeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:850:2: (iv_ruleRangeExpr= ruleRangeExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:851:2: iv_ruleRangeExpr= ruleRangeExpr EOF
            {
             newCompositeNode(grammarAccess.getRangeExprRule()); 
            pushFollow(FOLLOW_ruleRangeExpr_in_entryRuleRangeExpr1691);
            iv_ruleRangeExpr=ruleRangeExpr();

            state._fsp--;

             current =iv_ruleRangeExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeExpr1701); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangeExpr"


    // $ANTLR start "ruleRangeExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:858:1: ruleRangeExpr returns [EObject current=null] : ( ( (lv_from_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? ) ;
    public final EObject ruleRangeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_from_0_0 = null;

        EObject lv_to_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:861:28: ( ( ( (lv_from_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:862:1: ( ( (lv_from_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:862:1: ( ( (lv_from_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:862:2: ( (lv_from_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )?
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:862:2: ( (lv_from_0_0= ruleAdditiveExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:863:1: (lv_from_0_0= ruleAdditiveExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:863:1: (lv_from_0_0= ruleAdditiveExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:864:3: lv_from_0_0= ruleAdditiveExpr
            {
             
            	        newCompositeNode(grammarAccess.getRangeExprAccess().getFromAdditiveExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr1747);
            lv_from_0_0=ruleAdditiveExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRangeExprRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_0_0, 
                    		"AdditiveExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:880:2: (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:880:4: otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) )
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleRangeExpr1760); 

                        	newLeafNode(otherlv_1, grammarAccess.getRangeExprAccess().getToKeyword_1_0());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:884:1: ( (lv_to_2_0= ruleAdditiveExpr ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:885:1: (lv_to_2_0= ruleAdditiveExpr )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:885:1: (lv_to_2_0= ruleAdditiveExpr )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:886:3: lv_to_2_0= ruleAdditiveExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getRangeExprAccess().getToAdditiveExprParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr1781);
                    lv_to_2_0=ruleAdditiveExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRangeExprRule());
                    	        }
                           		set(
                           			current, 
                           			"to",
                            		lv_to_2_0, 
                            		"AdditiveExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangeExpr"


    // $ANTLR start "entryRuleAdditiveExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:910:1: entryRuleAdditiveExpr returns [EObject current=null] : iv_ruleAdditiveExpr= ruleAdditiveExpr EOF ;
    public final EObject entryRuleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:911:2: (iv_ruleAdditiveExpr= ruleAdditiveExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:912:2: iv_ruleAdditiveExpr= ruleAdditiveExpr EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExprRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpr_in_entryRuleAdditiveExpr1819);
            iv_ruleAdditiveExpr=ruleAdditiveExpr();

            state._fsp--;

             current =iv_ruleAdditiveExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpr1829); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpr"


    // $ANTLR start "ruleAdditiveExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:919:1: ruleAdditiveExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleMultiplicativeExpr ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_rights_3_0= ruleMultiplicativeExpr ) ) )* ) ;
    public final EObject ruleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_rights_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:922:28: ( ( ( (lv_left_0_0= ruleMultiplicativeExpr ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_rights_3_0= ruleMultiplicativeExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:923:1: ( ( (lv_left_0_0= ruleMultiplicativeExpr ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_rights_3_0= ruleMultiplicativeExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:923:1: ( ( (lv_left_0_0= ruleMultiplicativeExpr ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_rights_3_0= ruleMultiplicativeExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:923:2: ( (lv_left_0_0= ruleMultiplicativeExpr ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_rights_3_0= ruleMultiplicativeExpr ) ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:923:2: ( (lv_left_0_0= ruleMultiplicativeExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:924:1: (lv_left_0_0= ruleMultiplicativeExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:924:1: (lv_left_0_0= ruleMultiplicativeExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:925:3: lv_left_0_0= ruleMultiplicativeExpr
            {
             
            	        newCompositeNode(grammarAccess.getAdditiveExprAccess().getLeftMultiplicativeExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr1875);
            lv_left_0_0=ruleMultiplicativeExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAdditiveExprRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"MultiplicativeExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:941:2: ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_rights_3_0= ruleMultiplicativeExpr ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=37 && LA12_0<=38)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:941:3: (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_rights_3_0= ruleMultiplicativeExpr ) )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:941:3: (otherlv_1= '+' | otherlv_2= '-' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==37) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==38) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:941:5: otherlv_1= '+'
            	            {
            	            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleAdditiveExpr1889); 

            	                	newLeafNode(otherlv_1, grammarAccess.getAdditiveExprAccess().getPlusSignKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:946:7: otherlv_2= '-'
            	            {
            	            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleAdditiveExpr1907); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditiveExprAccess().getHyphenMinusKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:950:2: ( (lv_rights_3_0= ruleMultiplicativeExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:951:1: (lv_rights_3_0= ruleMultiplicativeExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:951:1: (lv_rights_3_0= ruleMultiplicativeExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:952:3: lv_rights_3_0= ruleMultiplicativeExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExprAccess().getRightsMultiplicativeExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr1929);
            	    lv_rights_3_0=ruleMultiplicativeExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rights",
            	            		lv_rights_3_0, 
            	            		"MultiplicativeExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpr"


    // $ANTLR start "entryRuleMultiplicativeExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:976:1: entryRuleMultiplicativeExpr returns [EObject current=null] : iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF ;
    public final EObject entryRuleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:977:2: (iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:978:2: iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExprRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpr_in_entryRuleMultiplicativeExpr1967);
            iv_ruleMultiplicativeExpr=ruleMultiplicativeExpr();

            state._fsp--;

             current =iv_ruleMultiplicativeExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpr1977); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpr"


    // $ANTLR start "ruleMultiplicativeExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:985:1: ruleMultiplicativeExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleUnionExpr ) ) ( (otherlv_1= '*' | otherlv_2= 'div' | otherlv_3= 'idiv' | otherlv_4= 'mod' ) ( (lv_rights_5_0= ruleUnionExpr ) ) )* ) ;
    public final EObject ruleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_left_0_0 = null;

        EObject lv_rights_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:988:28: ( ( ( (lv_left_0_0= ruleUnionExpr ) ) ( (otherlv_1= '*' | otherlv_2= 'div' | otherlv_3= 'idiv' | otherlv_4= 'mod' ) ( (lv_rights_5_0= ruleUnionExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:989:1: ( ( (lv_left_0_0= ruleUnionExpr ) ) ( (otherlv_1= '*' | otherlv_2= 'div' | otherlv_3= 'idiv' | otherlv_4= 'mod' ) ( (lv_rights_5_0= ruleUnionExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:989:1: ( ( (lv_left_0_0= ruleUnionExpr ) ) ( (otherlv_1= '*' | otherlv_2= 'div' | otherlv_3= 'idiv' | otherlv_4= 'mod' ) ( (lv_rights_5_0= ruleUnionExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:989:2: ( (lv_left_0_0= ruleUnionExpr ) ) ( (otherlv_1= '*' | otherlv_2= 'div' | otherlv_3= 'idiv' | otherlv_4= 'mod' ) ( (lv_rights_5_0= ruleUnionExpr ) ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:989:2: ( (lv_left_0_0= ruleUnionExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:990:1: (lv_left_0_0= ruleUnionExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:990:1: (lv_left_0_0= ruleUnionExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:991:3: lv_left_0_0= ruleUnionExpr
            {
             
            	        newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getLeftUnionExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr2023);
            lv_left_0_0=ruleUnionExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiplicativeExprRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"UnionExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1007:2: ( (otherlv_1= '*' | otherlv_2= 'div' | otherlv_3= 'idiv' | otherlv_4= 'mod' ) ( (lv_rights_5_0= ruleUnionExpr ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=39 && LA14_0<=42)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1007:3: (otherlv_1= '*' | otherlv_2= 'div' | otherlv_3= 'idiv' | otherlv_4= 'mod' ) ( (lv_rights_5_0= ruleUnionExpr ) )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1007:3: (otherlv_1= '*' | otherlv_2= 'div' | otherlv_3= 'idiv' | otherlv_4= 'mod' )
            	    int alt13=4;
            	    switch ( input.LA(1) ) {
            	    case 39:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1007:5: otherlv_1= '*'
            	            {
            	            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleMultiplicativeExpr2037); 

            	                	newLeafNode(otherlv_1, grammarAccess.getMultiplicativeExprAccess().getAsteriskKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1012:7: otherlv_2= 'div'
            	            {
            	            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleMultiplicativeExpr2055); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicativeExprAccess().getDivKeyword_1_0_1());
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1017:7: otherlv_3= 'idiv'
            	            {
            	            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleMultiplicativeExpr2073); 

            	                	newLeafNode(otherlv_3, grammarAccess.getMultiplicativeExprAccess().getIdivKeyword_1_0_2());
            	                

            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1022:7: otherlv_4= 'mod'
            	            {
            	            otherlv_4=(Token)match(input,42,FOLLOW_42_in_ruleMultiplicativeExpr2091); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicativeExprAccess().getModKeyword_1_0_3());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1026:2: ( (lv_rights_5_0= ruleUnionExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1027:1: (lv_rights_5_0= ruleUnionExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1027:1: (lv_rights_5_0= ruleUnionExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1028:3: lv_rights_5_0= ruleUnionExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getRightsUnionExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr2113);
            	    lv_rights_5_0=ruleUnionExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rights",
            	            		lv_rights_5_0, 
            	            		"UnionExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpr"


    // $ANTLR start "entryRuleUnionExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1052:1: entryRuleUnionExpr returns [EObject current=null] : iv_ruleUnionExpr= ruleUnionExpr EOF ;
    public final EObject entryRuleUnionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1053:2: (iv_ruleUnionExpr= ruleUnionExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1054:2: iv_ruleUnionExpr= ruleUnionExpr EOF
            {
             newCompositeNode(grammarAccess.getUnionExprRule()); 
            pushFollow(FOLLOW_ruleUnionExpr_in_entryRuleUnionExpr2151);
            iv_ruleUnionExpr=ruleUnionExpr();

            state._fsp--;

             current =iv_ruleUnionExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionExpr2161); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionExpr"


    // $ANTLR start "ruleUnionExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1061:1: ruleUnionExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleIntersectExceptExpr ) ) ( (otherlv_1= 'union' | otherlv_2= '|' ) ( (lv_rights_3_0= ruleIntersectExceptExpr ) ) )* ) ;
    public final EObject ruleUnionExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_rights_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1064:28: ( ( ( (lv_left_0_0= ruleIntersectExceptExpr ) ) ( (otherlv_1= 'union' | otherlv_2= '|' ) ( (lv_rights_3_0= ruleIntersectExceptExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1065:1: ( ( (lv_left_0_0= ruleIntersectExceptExpr ) ) ( (otherlv_1= 'union' | otherlv_2= '|' ) ( (lv_rights_3_0= ruleIntersectExceptExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1065:1: ( ( (lv_left_0_0= ruleIntersectExceptExpr ) ) ( (otherlv_1= 'union' | otherlv_2= '|' ) ( (lv_rights_3_0= ruleIntersectExceptExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1065:2: ( (lv_left_0_0= ruleIntersectExceptExpr ) ) ( (otherlv_1= 'union' | otherlv_2= '|' ) ( (lv_rights_3_0= ruleIntersectExceptExpr ) ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1065:2: ( (lv_left_0_0= ruleIntersectExceptExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1066:1: (lv_left_0_0= ruleIntersectExceptExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1066:1: (lv_left_0_0= ruleIntersectExceptExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1067:3: lv_left_0_0= ruleIntersectExceptExpr
            {
             
            	        newCompositeNode(grammarAccess.getUnionExprAccess().getLeftIntersectExceptExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr2207);
            lv_left_0_0=ruleIntersectExceptExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnionExprRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"IntersectExceptExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1083:2: ( (otherlv_1= 'union' | otherlv_2= '|' ) ( (lv_rights_3_0= ruleIntersectExceptExpr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=43 && LA16_0<=44)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1083:3: (otherlv_1= 'union' | otherlv_2= '|' ) ( (lv_rights_3_0= ruleIntersectExceptExpr ) )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1083:3: (otherlv_1= 'union' | otherlv_2= '|' )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==43) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==44) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1083:5: otherlv_1= 'union'
            	            {
            	            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleUnionExpr2221); 

            	                	newLeafNode(otherlv_1, grammarAccess.getUnionExprAccess().getUnionKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1088:7: otherlv_2= '|'
            	            {
            	            otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleUnionExpr2239); 

            	                	newLeafNode(otherlv_2, grammarAccess.getUnionExprAccess().getVerticalLineKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1092:2: ( (lv_rights_3_0= ruleIntersectExceptExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1093:1: (lv_rights_3_0= ruleIntersectExceptExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1093:1: (lv_rights_3_0= ruleIntersectExceptExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1094:3: lv_rights_3_0= ruleIntersectExceptExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnionExprAccess().getRightsIntersectExceptExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr2261);
            	    lv_rights_3_0=ruleIntersectExceptExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnionExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rights",
            	            		lv_rights_3_0, 
            	            		"IntersectExceptExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionExpr"


    // $ANTLR start "entryRuleIntersectExceptExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1118:1: entryRuleIntersectExceptExpr returns [EObject current=null] : iv_ruleIntersectExceptExpr= ruleIntersectExceptExpr EOF ;
    public final EObject entryRuleIntersectExceptExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectExceptExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1119:2: (iv_ruleIntersectExceptExpr= ruleIntersectExceptExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1120:2: iv_ruleIntersectExceptExpr= ruleIntersectExceptExpr EOF
            {
             newCompositeNode(grammarAccess.getIntersectExceptExprRule()); 
            pushFollow(FOLLOW_ruleIntersectExceptExpr_in_entryRuleIntersectExceptExpr2299);
            iv_ruleIntersectExceptExpr=ruleIntersectExceptExpr();

            state._fsp--;

             current =iv_ruleIntersectExceptExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntersectExceptExpr2309); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntersectExceptExpr"


    // $ANTLR start "ruleIntersectExceptExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1127:1: ruleIntersectExceptExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleInstanceofExpr ) ) ( (otherlv_1= 'intersect' | otherlv_2= 'except' ) ( (lv_rights_3_0= ruleInstanceofExpr ) ) )* ) ;
    public final EObject ruleIntersectExceptExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_rights_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1130:28: ( ( ( (lv_left_0_0= ruleInstanceofExpr ) ) ( (otherlv_1= 'intersect' | otherlv_2= 'except' ) ( (lv_rights_3_0= ruleInstanceofExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1131:1: ( ( (lv_left_0_0= ruleInstanceofExpr ) ) ( (otherlv_1= 'intersect' | otherlv_2= 'except' ) ( (lv_rights_3_0= ruleInstanceofExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1131:1: ( ( (lv_left_0_0= ruleInstanceofExpr ) ) ( (otherlv_1= 'intersect' | otherlv_2= 'except' ) ( (lv_rights_3_0= ruleInstanceofExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1131:2: ( (lv_left_0_0= ruleInstanceofExpr ) ) ( (otherlv_1= 'intersect' | otherlv_2= 'except' ) ( (lv_rights_3_0= ruleInstanceofExpr ) ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1131:2: ( (lv_left_0_0= ruleInstanceofExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1132:1: (lv_left_0_0= ruleInstanceofExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1132:1: (lv_left_0_0= ruleInstanceofExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1133:3: lv_left_0_0= ruleInstanceofExpr
            {
             
            	        newCompositeNode(grammarAccess.getIntersectExceptExprAccess().getLeftInstanceofExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr2355);
            lv_left_0_0=ruleInstanceofExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntersectExceptExprRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"InstanceofExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1149:2: ( (otherlv_1= 'intersect' | otherlv_2= 'except' ) ( (lv_rights_3_0= ruleInstanceofExpr ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=45 && LA18_0<=46)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1149:3: (otherlv_1= 'intersect' | otherlv_2= 'except' ) ( (lv_rights_3_0= ruleInstanceofExpr ) )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1149:3: (otherlv_1= 'intersect' | otherlv_2= 'except' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==45) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==46) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1149:5: otherlv_1= 'intersect'
            	            {
            	            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleIntersectExceptExpr2369); 

            	                	newLeafNode(otherlv_1, grammarAccess.getIntersectExceptExprAccess().getIntersectKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1154:7: otherlv_2= 'except'
            	            {
            	            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleIntersectExceptExpr2387); 

            	                	newLeafNode(otherlv_2, grammarAccess.getIntersectExceptExprAccess().getExceptKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1158:2: ( (lv_rights_3_0= ruleInstanceofExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1159:1: (lv_rights_3_0= ruleInstanceofExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1159:1: (lv_rights_3_0= ruleInstanceofExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1160:3: lv_rights_3_0= ruleInstanceofExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntersectExceptExprAccess().getRightsInstanceofExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr2409);
            	    lv_rights_3_0=ruleInstanceofExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIntersectExceptExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rights",
            	            		lv_rights_3_0, 
            	            		"InstanceofExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntersectExceptExpr"


    // $ANTLR start "entryRuleInstanceofExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1184:1: entryRuleInstanceofExpr returns [EObject current=null] : iv_ruleInstanceofExpr= ruleInstanceofExpr EOF ;
    public final EObject entryRuleInstanceofExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceofExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1185:2: (iv_ruleInstanceofExpr= ruleInstanceofExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1186:2: iv_ruleInstanceofExpr= ruleInstanceofExpr EOF
            {
             newCompositeNode(grammarAccess.getInstanceofExprRule()); 
            pushFollow(FOLLOW_ruleInstanceofExpr_in_entryRuleInstanceofExpr2447);
            iv_ruleInstanceofExpr=ruleInstanceofExpr();

            state._fsp--;

             current =iv_ruleInstanceofExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceofExpr2457); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceofExpr"


    // $ANTLR start "ruleInstanceofExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1193:1: ruleInstanceofExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleTreatExpr ) ) (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_right_3_0= ruleSequenceType ) ) )? ) ;
    public final EObject ruleInstanceofExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1196:28: ( ( ( (lv_left_0_0= ruleTreatExpr ) ) (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_right_3_0= ruleSequenceType ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1197:1: ( ( (lv_left_0_0= ruleTreatExpr ) ) (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_right_3_0= ruleSequenceType ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1197:1: ( ( (lv_left_0_0= ruleTreatExpr ) ) (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_right_3_0= ruleSequenceType ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1197:2: ( (lv_left_0_0= ruleTreatExpr ) ) (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_right_3_0= ruleSequenceType ) ) )?
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1197:2: ( (lv_left_0_0= ruleTreatExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1198:1: (lv_left_0_0= ruleTreatExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1198:1: (lv_left_0_0= ruleTreatExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1199:3: lv_left_0_0= ruleTreatExpr
            {
             
            	        newCompositeNode(grammarAccess.getInstanceofExprAccess().getLeftTreatExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTreatExpr_in_ruleInstanceofExpr2503);
            lv_left_0_0=ruleTreatExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstanceofExprRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"TreatExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1215:2: (otherlv_1= 'instance' otherlv_2= 'of' ( (lv_right_3_0= ruleSequenceType ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==47) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1215:4: otherlv_1= 'instance' otherlv_2= 'of' ( (lv_right_3_0= ruleSequenceType ) )
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleInstanceofExpr2516); 

                        	newLeafNode(otherlv_1, grammarAccess.getInstanceofExprAccess().getInstanceKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleInstanceofExpr2528); 

                        	newLeafNode(otherlv_2, grammarAccess.getInstanceofExprAccess().getOfKeyword_1_1());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1223:1: ( (lv_right_3_0= ruleSequenceType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1224:1: (lv_right_3_0= ruleSequenceType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1224:1: (lv_right_3_0= ruleSequenceType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1225:3: lv_right_3_0= ruleSequenceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstanceofExprAccess().getRightSequenceTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequenceType_in_ruleInstanceofExpr2549);
                    lv_right_3_0=ruleSequenceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstanceofExprRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"SequenceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceofExpr"


    // $ANTLR start "entryRuleTreatExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1249:1: entryRuleTreatExpr returns [EObject current=null] : iv_ruleTreatExpr= ruleTreatExpr EOF ;
    public final EObject entryRuleTreatExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreatExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1250:2: (iv_ruleTreatExpr= ruleTreatExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1251:2: iv_ruleTreatExpr= ruleTreatExpr EOF
            {
             newCompositeNode(grammarAccess.getTreatExprRule()); 
            pushFollow(FOLLOW_ruleTreatExpr_in_entryRuleTreatExpr2587);
            iv_ruleTreatExpr=ruleTreatExpr();

            state._fsp--;

             current =iv_ruleTreatExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreatExpr2597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTreatExpr"


    // $ANTLR start "ruleTreatExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1258:1: ruleTreatExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleCastableExpr ) ) (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_right_3_0= ruleSequenceType ) ) )? ) ;
    public final EObject ruleTreatExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1261:28: ( ( ( (lv_left_0_0= ruleCastableExpr ) ) (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_right_3_0= ruleSequenceType ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1262:1: ( ( (lv_left_0_0= ruleCastableExpr ) ) (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_right_3_0= ruleSequenceType ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1262:1: ( ( (lv_left_0_0= ruleCastableExpr ) ) (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_right_3_0= ruleSequenceType ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1262:2: ( (lv_left_0_0= ruleCastableExpr ) ) (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_right_3_0= ruleSequenceType ) ) )?
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1262:2: ( (lv_left_0_0= ruleCastableExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1263:1: (lv_left_0_0= ruleCastableExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1263:1: (lv_left_0_0= ruleCastableExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1264:3: lv_left_0_0= ruleCastableExpr
            {
             
            	        newCompositeNode(grammarAccess.getTreatExprAccess().getLeftCastableExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCastableExpr_in_ruleTreatExpr2643);
            lv_left_0_0=ruleCastableExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTreatExprRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"CastableExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1280:2: (otherlv_1= 'treat' otherlv_2= 'as' ( (lv_right_3_0= ruleSequenceType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1280:4: otherlv_1= 'treat' otherlv_2= 'as' ( (lv_right_3_0= ruleSequenceType ) )
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleTreatExpr2656); 

                        	newLeafNode(otherlv_1, grammarAccess.getTreatExprAccess().getTreatKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleTreatExpr2668); 

                        	newLeafNode(otherlv_2, grammarAccess.getTreatExprAccess().getAsKeyword_1_1());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1288:1: ( (lv_right_3_0= ruleSequenceType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1289:1: (lv_right_3_0= ruleSequenceType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1289:1: (lv_right_3_0= ruleSequenceType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1290:3: lv_right_3_0= ruleSequenceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTreatExprAccess().getRightSequenceTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequenceType_in_ruleTreatExpr2689);
                    lv_right_3_0=ruleSequenceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTreatExprRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"SequenceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTreatExpr"


    // $ANTLR start "entryRuleCastableExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1314:1: entryRuleCastableExpr returns [EObject current=null] : iv_ruleCastableExpr= ruleCastableExpr EOF ;
    public final EObject entryRuleCastableExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastableExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1315:2: (iv_ruleCastableExpr= ruleCastableExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1316:2: iv_ruleCastableExpr= ruleCastableExpr EOF
            {
             newCompositeNode(grammarAccess.getCastableExprRule()); 
            pushFollow(FOLLOW_ruleCastableExpr_in_entryRuleCastableExpr2727);
            iv_ruleCastableExpr=ruleCastableExpr();

            state._fsp--;

             current =iv_ruleCastableExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastableExpr2737); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCastableExpr"


    // $ANTLR start "ruleCastableExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1323:1: ruleCastableExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleCastExpr ) ) (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )? ) ;
    public final EObject ruleCastableExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1326:28: ( ( ( (lv_left_0_0= ruleCastExpr ) ) (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1327:1: ( ( (lv_left_0_0= ruleCastExpr ) ) (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1327:1: ( ( (lv_left_0_0= ruleCastExpr ) ) (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1327:2: ( (lv_left_0_0= ruleCastExpr ) ) (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )?
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1327:2: ( (lv_left_0_0= ruleCastExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1328:1: (lv_left_0_0= ruleCastExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1328:1: (lv_left_0_0= ruleCastExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1329:3: lv_left_0_0= ruleCastExpr
            {
             
            	        newCompositeNode(grammarAccess.getCastableExprAccess().getLeftCastExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCastExpr_in_ruleCastableExpr2783);
            lv_left_0_0=ruleCastExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastableExprRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"CastExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1345:2: (otherlv_1= 'castable' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1345:4: otherlv_1= 'castable' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) )
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleCastableExpr2796); 

                        	newLeafNode(otherlv_1, grammarAccess.getCastableExprAccess().getCastableKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleCastableExpr2808); 

                        	newLeafNode(otherlv_2, grammarAccess.getCastableExprAccess().getAsKeyword_1_1());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1353:1: ( (lv_right_3_0= ruleSingleType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1354:1: (lv_right_3_0= ruleSingleType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1354:1: (lv_right_3_0= ruleSingleType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1355:3: lv_right_3_0= ruleSingleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastableExprAccess().getRightSingleTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSingleType_in_ruleCastableExpr2829);
                    lv_right_3_0=ruleSingleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCastableExprRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"SingleType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCastableExpr"


    // $ANTLR start "entryRuleCastExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1379:1: entryRuleCastExpr returns [EObject current=null] : iv_ruleCastExpr= ruleCastExpr EOF ;
    public final EObject entryRuleCastExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1380:2: (iv_ruleCastExpr= ruleCastExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1381:2: iv_ruleCastExpr= ruleCastExpr EOF
            {
             newCompositeNode(grammarAccess.getCastExprRule()); 
            pushFollow(FOLLOW_ruleCastExpr_in_entryRuleCastExpr2867);
            iv_ruleCastExpr=ruleCastExpr();

            state._fsp--;

             current =iv_ruleCastExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastExpr2877); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCastExpr"


    // $ANTLR start "ruleCastExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1388:1: ruleCastExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleUnaryExpr ) ) (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )? ) ;
    public final EObject ruleCastExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1391:28: ( ( ( (lv_left_0_0= ruleUnaryExpr ) ) (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1392:1: ( ( (lv_left_0_0= ruleUnaryExpr ) ) (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1392:1: ( ( (lv_left_0_0= ruleUnaryExpr ) ) (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1392:2: ( (lv_left_0_0= ruleUnaryExpr ) ) (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )?
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1392:2: ( (lv_left_0_0= ruleUnaryExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1393:1: (lv_left_0_0= ruleUnaryExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1393:1: (lv_left_0_0= ruleUnaryExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1394:3: lv_left_0_0= ruleUnaryExpr
            {
             
            	        newCompositeNode(grammarAccess.getCastExprAccess().getLeftUnaryExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnaryExpr_in_ruleCastExpr2923);
            lv_left_0_0=ruleUnaryExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastExprRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"UnaryExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1410:2: (otherlv_1= 'cast' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1410:4: otherlv_1= 'cast' otherlv_2= 'as' ( (lv_right_3_0= ruleSingleType ) )
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleCastExpr2936); 

                        	newLeafNode(otherlv_1, grammarAccess.getCastExprAccess().getCastKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleCastExpr2948); 

                        	newLeafNode(otherlv_2, grammarAccess.getCastExprAccess().getAsKeyword_1_1());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1418:1: ( (lv_right_3_0= ruleSingleType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1419:1: (lv_right_3_0= ruleSingleType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1419:1: (lv_right_3_0= ruleSingleType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1420:3: lv_right_3_0= ruleSingleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastExprAccess().getRightSingleTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSingleType_in_ruleCastExpr2969);
                    lv_right_3_0=ruleSingleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCastExprRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"SingleType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCastExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1444:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1445:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1446:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr3007);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr3017); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1453:1: ruleUnaryExpr returns [EObject current=null] : ( (otherlv_0= '-' | otherlv_1= '+' )* ( (lv_unary_2_0= ruleValueExpr ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_unary_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1456:28: ( ( (otherlv_0= '-' | otherlv_1= '+' )* ( (lv_unary_2_0= ruleValueExpr ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1457:1: ( (otherlv_0= '-' | otherlv_1= '+' )* ( (lv_unary_2_0= ruleValueExpr ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1457:1: ( (otherlv_0= '-' | otherlv_1= '+' )* ( (lv_unary_2_0= ruleValueExpr ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1457:2: (otherlv_0= '-' | otherlv_1= '+' )* ( (lv_unary_2_0= ruleValueExpr ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1457:2: (otherlv_0= '-' | otherlv_1= '+' )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==38) ) {
                    alt23=1;
                }
                else if ( (LA23_0==37) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1457:4: otherlv_0= '-'
            	    {
            	    otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleUnaryExpr3055); 

            	        	newLeafNode(otherlv_0, grammarAccess.getUnaryExprAccess().getHyphenMinusKeyword_0_0());
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1462:7: otherlv_1= '+'
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleUnaryExpr3073); 

            	        	newLeafNode(otherlv_1, grammarAccess.getUnaryExprAccess().getPlusSignKeyword_0_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1466:3: ( (lv_unary_2_0= ruleValueExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1467:1: (lv_unary_2_0= ruleValueExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1467:1: (lv_unary_2_0= ruleValueExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1468:3: lv_unary_2_0= ruleValueExpr
            {
             
            	        newCompositeNode(grammarAccess.getUnaryExprAccess().getUnaryValueExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValueExpr_in_ruleUnaryExpr3096);
            lv_unary_2_0=ruleValueExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryExprRule());
            	        }
                   		set(
                   			current, 
                   			"unary",
                    		lv_unary_2_0, 
                    		"ValueExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleValueExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1492:1: entryRuleValueExpr returns [EObject current=null] : iv_ruleValueExpr= ruleValueExpr EOF ;
    public final EObject entryRuleValueExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1493:2: (iv_ruleValueExpr= ruleValueExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1494:2: iv_ruleValueExpr= ruleValueExpr EOF
            {
             newCompositeNode(grammarAccess.getValueExprRule()); 
            pushFollow(FOLLOW_ruleValueExpr_in_entryRuleValueExpr3132);
            iv_ruleValueExpr=ruleValueExpr();

            state._fsp--;

             current =iv_ruleValueExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpr3142); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueExpr"


    // $ANTLR start "ruleValueExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1501:1: ruleValueExpr returns [EObject current=null] : ( (lv_value_0_0= rulePathExpr ) ) ;
    public final EObject ruleValueExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1504:28: ( ( (lv_value_0_0= rulePathExpr ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1505:1: ( (lv_value_0_0= rulePathExpr ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1505:1: ( (lv_value_0_0= rulePathExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1506:1: (lv_value_0_0= rulePathExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1506:1: (lv_value_0_0= rulePathExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1507:3: lv_value_0_0= rulePathExpr
            {
             
            	        newCompositeNode(grammarAccess.getValueExprAccess().getValuePathExprParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePathExpr_in_ruleValueExpr3187);
            lv_value_0_0=rulePathExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValueExprRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"PathExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueExpr"


    // $ANTLR start "entryRulePathExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1531:1: entryRulePathExpr returns [EObject current=null] : iv_rulePathExpr= rulePathExpr EOF ;
    public final EObject entryRulePathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1532:2: (iv_rulePathExpr= rulePathExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1533:2: iv_rulePathExpr= rulePathExpr EOF
            {
             newCompositeNode(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr3222);
            iv_rulePathExpr=rulePathExpr();

            state._fsp--;

             current =iv_rulePathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr3232); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathExpr"


    // $ANTLR start "rulePathExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1540:1: rulePathExpr returns [EObject current=null] : ( (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () ) | (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () ) | (this_RelativePathExpr_6= ruleRelativePathExpr () ) ) ;
    public final EObject rulePathExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_RelativePathExpr_1 = null;

        EObject this_RelativePathExpr_4 = null;

        EObject this_RelativePathExpr_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1543:28: ( ( (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () ) | (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () ) | (this_RelativePathExpr_6= ruleRelativePathExpr () ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1544:1: ( (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () ) | (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () ) | (this_RelativePathExpr_6= ruleRelativePathExpr () ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1544:1: ( (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () ) | (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () ) | (this_RelativePathExpr_6= ruleRelativePathExpr () ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt24=1;
                }
                break;
            case 54:
                {
                alt24=2;
                }
                break;
            case RULE_REVERSEAXIS:
            case RULE_ABBREVREVERSESTEP:
            case RULE_CONTEXTITEMEXPR:
            case RULE_STRINGLITERAL:
            case RULE_INTLITERAL:
            case RULE_DECIMALLITERAL:
            case RULE_DOUBLELITERAL:
            case RULE_ID:
            case RULE_COMMENTTEST:
            case RULE_TEXTTEST:
            case RULE_ANYKINDTEST:
            case 24:
            case 30:
            case 39:
            case 55:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1544:2: (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1544:2: (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1544:4: otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr ()
                    {
                    otherlv_0=(Token)match(input,53,FOLLOW_53_in_rulePathExpr3270); 

                        	newLeafNode(otherlv_0, grammarAccess.getPathExprAccess().getSolidusKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPathExprAccess().getRelativePathExprParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleRelativePathExpr_in_rulePathExpr3292);
                    this_RelativePathExpr_1=ruleRelativePathExpr();

                    state._fsp--;

                     
                            current = this_RelativePathExpr_1; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1557:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1558:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPathExprAccess().getRelSingleRelPathExprAction_0_2(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1564:6: (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1564:6: (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1564:8: otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr ()
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_54_in_rulePathExpr3320); 

                        	newLeafNode(otherlv_3, grammarAccess.getPathExprAccess().getSolidusSolidusKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPathExprAccess().getRelativePathExprParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleRelativePathExpr_in_rulePathExpr3342);
                    this_RelativePathExpr_4=ruleRelativePathExpr();

                    state._fsp--;

                     
                            current = this_RelativePathExpr_4; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1577:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1578:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPathExprAccess().getRelDoubleRelPathExprAction_1_2(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1584:6: (this_RelativePathExpr_6= ruleRelativePathExpr () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1584:6: (this_RelativePathExpr_6= ruleRelativePathExpr () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1585:5: this_RelativePathExpr_6= ruleRelativePathExpr ()
                    {
                     
                            newCompositeNode(grammarAccess.getPathExprAccess().getRelativePathExprParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleRelativePathExpr_in_rulePathExpr3380);
                    this_RelativePathExpr_6=ruleRelativePathExpr();

                    state._fsp--;

                     
                            current = this_RelativePathExpr_6; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1593:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1594:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPathExprAccess().getRelNoSelectorRelPathExprAction_2_1(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathExpr"


    // $ANTLR start "entryRuleRelativePathExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1607:1: entryRuleRelativePathExpr returns [EObject current=null] : iv_ruleRelativePathExpr= ruleRelativePathExpr EOF ;
    public final EObject entryRuleRelativePathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativePathExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1608:2: (iv_ruleRelativePathExpr= ruleRelativePathExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1609:2: iv_ruleRelativePathExpr= ruleRelativePathExpr EOF
            {
             newCompositeNode(grammarAccess.getRelativePathExprRule()); 
            pushFollow(FOLLOW_ruleRelativePathExpr_in_entryRuleRelativePathExpr3425);
            iv_ruleRelativePathExpr=ruleRelativePathExpr();

            state._fsp--;

             current =iv_ruleRelativePathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativePathExpr3435); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelativePathExpr"


    // $ANTLR start "ruleRelativePathExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1616:1: ruleRelativePathExpr returns [EObject current=null] : ( ( (lv_step_0_0= ruleStepExpr ) ) ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )* ) ;
    public final EObject ruleRelativePathExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_step_0_0 = null;

        EObject lv_extraSteps_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1619:28: ( ( ( (lv_step_0_0= ruleStepExpr ) ) ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1620:1: ( ( (lv_step_0_0= ruleStepExpr ) ) ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1620:1: ( ( (lv_step_0_0= ruleStepExpr ) ) ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1620:2: ( (lv_step_0_0= ruleStepExpr ) ) ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1620:2: ( (lv_step_0_0= ruleStepExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1621:1: (lv_step_0_0= ruleStepExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1621:1: (lv_step_0_0= ruleStepExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1622:3: lv_step_0_0= ruleStepExpr
            {
             
            	        newCompositeNode(grammarAccess.getRelativePathExprAccess().getStepStepExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStepExpr_in_ruleRelativePathExpr3481);
            lv_step_0_0=ruleStepExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelativePathExprRule());
            	        }
                   		set(
                   			current, 
                   			"step",
                    		lv_step_0_0, 
                    		"StepExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1638:2: ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=53 && LA25_0<=54)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1639:1: (lv_extraSteps_1_0= ruleExtraStepExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1639:1: (lv_extraSteps_1_0= ruleExtraStepExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1640:3: lv_extraSteps_1_0= ruleExtraStepExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelativePathExprAccess().getExtraStepsExtraStepExprParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtraStepExpr_in_ruleRelativePathExpr3502);
            	    lv_extraSteps_1_0=ruleExtraStepExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelativePathExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"extraSteps",
            	            		lv_extraSteps_1_0, 
            	            		"ExtraStepExpr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativePathExpr"


    // $ANTLR start "entryRuleExtraStepExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1664:1: entryRuleExtraStepExpr returns [EObject current=null] : iv_ruleExtraStepExpr= ruleExtraStepExpr EOF ;
    public final EObject entryRuleExtraStepExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraStepExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1665:2: (iv_ruleExtraStepExpr= ruleExtraStepExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1666:2: iv_ruleExtraStepExpr= ruleExtraStepExpr EOF
            {
             newCompositeNode(grammarAccess.getExtraStepExprRule()); 
            pushFollow(FOLLOW_ruleExtraStepExpr_in_entryRuleExtraStepExpr3539);
            iv_ruleExtraStepExpr=ruleExtraStepExpr();

            state._fsp--;

             current =iv_ruleExtraStepExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtraStepExpr3549); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtraStepExpr"


    // $ANTLR start "ruleExtraStepExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1673:1: ruleExtraStepExpr returns [EObject current=null] : ( (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () ) | (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () ) ) ;
    public final EObject ruleExtraStepExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_StepExpr_1 = null;

        EObject this_StepExpr_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1676:28: ( ( (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () ) | (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1677:1: ( (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () ) | (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1677:1: ( (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () ) | (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            else if ( (LA26_0==54) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1677:2: (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1677:2: (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1677:4: otherlv_0= '/' this_StepExpr_1= ruleStepExpr ()
                    {
                    otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleExtraStepExpr3587); 

                        	newLeafNode(otherlv_0, grammarAccess.getExtraStepExprAccess().getSolidusKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getExtraStepExprAccess().getStepExprParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleStepExpr_in_ruleExtraStepExpr3609);
                    this_StepExpr_1=ruleStepExpr();

                    state._fsp--;

                     
                            current = this_StepExpr_1; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1690:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1691:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExtraStepExprAccess().getSingleStepAction_0_2(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1697:6: (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1697:6: (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1697:8: otherlv_3= '//' this_StepExpr_4= ruleStepExpr ()
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleExtraStepExpr3637); 

                        	newLeafNode(otherlv_3, grammarAccess.getExtraStepExprAccess().getSolidusSolidusKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getExtraStepExprAccess().getStepExprParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleStepExpr_in_ruleExtraStepExpr3659);
                    this_StepExpr_4=ruleStepExpr();

                    state._fsp--;

                     
                            current = this_StepExpr_4; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1710:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1711:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExtraStepExprAccess().getDoubleStepAction_1_2(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtraStepExpr"


    // $ANTLR start "entryRuleStepExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1724:1: entryRuleStepExpr returns [EObject current=null] : iv_ruleStepExpr= ruleStepExpr EOF ;
    public final EObject entryRuleStepExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1725:2: (iv_ruleStepExpr= ruleStepExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1726:2: iv_ruleStepExpr= ruleStepExpr EOF
            {
             newCompositeNode(grammarAccess.getStepExprRule()); 
            pushFollow(FOLLOW_ruleStepExpr_in_entryRuleStepExpr3704);
            iv_ruleStepExpr=ruleStepExpr();

            state._fsp--;

             current =iv_ruleStepExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepExpr3714); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepExpr"


    // $ANTLR start "ruleStepExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1733:1: ruleStepExpr returns [EObject current=null] : ( ( (lv_stepExpr_0_0= ruleFilterExpr ) ) | ( (lv_stepExpr_1_0= ruleAxisStep ) ) ) ;
    public final EObject ruleStepExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_stepExpr_0_0 = null;

        EObject lv_stepExpr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1736:28: ( ( ( (lv_stepExpr_0_0= ruleFilterExpr ) ) | ( (lv_stepExpr_1_0= ruleAxisStep ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1737:1: ( ( (lv_stepExpr_0_0= ruleFilterExpr ) ) | ( (lv_stepExpr_1_0= ruleAxisStep ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1737:1: ( ( (lv_stepExpr_0_0= ruleFilterExpr ) ) | ( (lv_stepExpr_1_0= ruleAxisStep ) ) )
            int alt27=2;
            switch ( input.LA(1) ) {
            case RULE_CONTEXTITEMEXPR:
            case RULE_STRINGLITERAL:
            case RULE_INTLITERAL:
            case RULE_DECIMALLITERAL:
            case RULE_DOUBLELITERAL:
            case 24:
            case 30:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 65:
                    {
                    int LA27_4 = input.LA(3);

                    if ( (LA27_4==39) ) {
                        alt27=2;
                    }
                    else if ( (LA27_4==RULE_ID) ) {
                        int LA27_5 = input.LA(4);

                        if ( (LA27_5==EOF||(LA27_5>=RULE_VALUECOMP && LA27_5<=RULE_NODECOMP)||(LA27_5>=21 && LA27_5<=22)||LA27_5==28||LA27_5==31||(LA27_5>=33 && LA27_5<=47)||LA27_5==49||(LA27_5>=51 && LA27_5<=54)||(LA27_5>=66 && LA27_5<=67)) ) {
                            alt27=2;
                        }
                        else if ( (LA27_5==30) ) {
                            alt27=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 27, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 30:
                    {
                    alt27=1;
                    }
                    break;
                case EOF:
                case RULE_VALUECOMP:
                case RULE_GENERALCOMP:
                case RULE_NODECOMP:
                case 21:
                case 22:
                case 28:
                case 31:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 49:
                case 51:
                case 52:
                case 53:
                case 54:
                case 66:
                case 67:
                    {
                    alt27=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REVERSEAXIS:
            case RULE_ABBREVREVERSESTEP:
            case RULE_COMMENTTEST:
            case RULE_TEXTTEST:
            case RULE_ANYKINDTEST:
            case 39:
            case 55:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt27=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1737:2: ( (lv_stepExpr_0_0= ruleFilterExpr ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1737:2: ( (lv_stepExpr_0_0= ruleFilterExpr ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1738:1: (lv_stepExpr_0_0= ruleFilterExpr )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1738:1: (lv_stepExpr_0_0= ruleFilterExpr )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1739:3: lv_stepExpr_0_0= ruleFilterExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepExprAccess().getStepExprFilterExprParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilterExpr_in_ruleStepExpr3760);
                    lv_stepExpr_0_0=ruleFilterExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStepExprRule());
                    	        }
                           		set(
                           			current, 
                           			"stepExpr",
                            		lv_stepExpr_0_0, 
                            		"FilterExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1756:6: ( (lv_stepExpr_1_0= ruleAxisStep ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1756:6: ( (lv_stepExpr_1_0= ruleAxisStep ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1757:1: (lv_stepExpr_1_0= ruleAxisStep )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1757:1: (lv_stepExpr_1_0= ruleAxisStep )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1758:3: lv_stepExpr_1_0= ruleAxisStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepExprAccess().getStepExprAxisStepParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAxisStep_in_ruleStepExpr3787);
                    lv_stepExpr_1_0=ruleAxisStep();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStepExprRule());
                    	        }
                           		set(
                           			current, 
                           			"stepExpr",
                            		lv_stepExpr_1_0, 
                            		"AxisStep");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepExpr"


    // $ANTLR start "entryRuleAxisStep"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1782:1: entryRuleAxisStep returns [EObject current=null] : iv_ruleAxisStep= ruleAxisStep EOF ;
    public final EObject entryRuleAxisStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxisStep = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1783:2: (iv_ruleAxisStep= ruleAxisStep EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1784:2: iv_ruleAxisStep= ruleAxisStep EOF
            {
             newCompositeNode(grammarAccess.getAxisStepRule()); 
            pushFollow(FOLLOW_ruleAxisStep_in_entryRuleAxisStep3823);
            iv_ruleAxisStep=ruleAxisStep();

            state._fsp--;

             current =iv_ruleAxisStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAxisStep3833); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxisStep"


    // $ANTLR start "ruleAxisStep"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1791:1: ruleAxisStep returns [EObject current=null] : ( ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) ) ( (lv_predicateList_2_0= rulePredicateList ) ) ) ;
    public final EObject ruleAxisStep() throws RecognitionException {
        EObject current = null;

        EObject lv_step_0_0 = null;

        EObject lv_step_1_0 = null;

        EObject lv_predicateList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1794:28: ( ( ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) ) ( (lv_predicateList_2_0= rulePredicateList ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1795:1: ( ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) ) ( (lv_predicateList_2_0= rulePredicateList ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1795:1: ( ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) ) ( (lv_predicateList_2_0= rulePredicateList ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1795:2: ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) ) ( (lv_predicateList_2_0= rulePredicateList ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1795:2: ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_REVERSEAXIS && LA28_0<=RULE_ABBREVREVERSESTEP)) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_ANYKINDTEST)||LA28_0==39||LA28_0==55||(LA28_0>=57 && LA28_0<=64)||(LA28_0>=69 && LA28_0<=73)) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1795:3: ( (lv_step_0_0= ruleReverseStep ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1795:3: ( (lv_step_0_0= ruleReverseStep ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1796:1: (lv_step_0_0= ruleReverseStep )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1796:1: (lv_step_0_0= ruleReverseStep )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1797:3: lv_step_0_0= ruleReverseStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxisStepAccess().getStepReverseStepParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReverseStep_in_ruleAxisStep3880);
                    lv_step_0_0=ruleReverseStep();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxisStepRule());
                    	        }
                           		set(
                           			current, 
                           			"step",
                            		lv_step_0_0, 
                            		"ReverseStep");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1814:6: ( (lv_step_1_0= ruleForwardStep ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1814:6: ( (lv_step_1_0= ruleForwardStep ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1815:1: (lv_step_1_0= ruleForwardStep )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1815:1: (lv_step_1_0= ruleForwardStep )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1816:3: lv_step_1_0= ruleForwardStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxisStepAccess().getStepForwardStepParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleForwardStep_in_ruleAxisStep3907);
                    lv_step_1_0=ruleForwardStep();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxisStepRule());
                    	        }
                           		set(
                           			current, 
                           			"step",
                            		lv_step_1_0, 
                            		"ForwardStep");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1832:3: ( (lv_predicateList_2_0= rulePredicateList ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1833:1: (lv_predicateList_2_0= rulePredicateList )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1833:1: (lv_predicateList_2_0= rulePredicateList )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1834:3: lv_predicateList_2_0= rulePredicateList
            {
             
            	        newCompositeNode(grammarAccess.getAxisStepAccess().getPredicateListPredicateListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateList_in_ruleAxisStep3929);
            lv_predicateList_2_0=rulePredicateList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxisStepRule());
            	        }
                   		set(
                   			current, 
                   			"predicateList",
                    		lv_predicateList_2_0, 
                    		"PredicateList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAxisStep"


    // $ANTLR start "entryRuleForwardStep"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1858:1: entryRuleForwardStep returns [EObject current=null] : iv_ruleForwardStep= ruleForwardStep EOF ;
    public final EObject entryRuleForwardStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardStep = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1859:2: (iv_ruleForwardStep= ruleForwardStep EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1860:2: iv_ruleForwardStep= ruleForwardStep EOF
            {
             newCompositeNode(grammarAccess.getForwardStepRule()); 
            pushFollow(FOLLOW_ruleForwardStep_in_entryRuleForwardStep3965);
            iv_ruleForwardStep=ruleForwardStep();

            state._fsp--;

             current =iv_ruleForwardStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForwardStep3975); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForwardStep"


    // $ANTLR start "ruleForwardStep"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1867:1: ruleForwardStep returns [EObject current=null] : ( ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) ) ) ;
    public final EObject ruleForwardStep() throws RecognitionException {
        EObject current = null;

        EObject lv_forward_0_0 = null;

        EObject lv_test_1_0 = null;

        EObject lv_abbrForward_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1870:28: ( ( ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1871:1: ( ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1871:1: ( ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) ) )
            int alt29=2;
            switch ( input.LA(1) ) {
            case 55:
            case 57:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt29=1;
                }
                break;
            case 58:
                {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==56) ) {
                    alt29=1;
                }
                else if ( (LA29_2==30) ) {
                    alt29=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_COMMENTTEST:
            case RULE_TEXTTEST:
            case RULE_ANYKINDTEST:
            case 39:
            case 64:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt29=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1871:2: ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1871:2: ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1871:3: ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1871:3: ( (lv_forward_0_0= ruleForwardAxis ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1872:1: (lv_forward_0_0= ruleForwardAxis )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1872:1: (lv_forward_0_0= ruleForwardAxis )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1873:3: lv_forward_0_0= ruleForwardAxis
                    {
                     
                    	        newCompositeNode(grammarAccess.getForwardStepAccess().getForwardForwardAxisParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleForwardAxis_in_ruleForwardStep4022);
                    lv_forward_0_0=ruleForwardAxis();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForwardStepRule());
                    	        }
                           		set(
                           			current, 
                           			"forward",
                            		lv_forward_0_0, 
                            		"ForwardAxis");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1889:2: ( (lv_test_1_0= ruleNodeTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1890:1: (lv_test_1_0= ruleNodeTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1890:1: (lv_test_1_0= ruleNodeTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1891:3: lv_test_1_0= ruleNodeTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getForwardStepAccess().getTestNodeTestParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeTest_in_ruleForwardStep4043);
                    lv_test_1_0=ruleNodeTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForwardStepRule());
                    	        }
                           		set(
                           			current, 
                           			"test",
                            		lv_test_1_0, 
                            		"NodeTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1908:6: ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1908:6: ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1909:1: (lv_abbrForward_2_0= ruleAbbrevForwardStep )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1909:1: (lv_abbrForward_2_0= ruleAbbrevForwardStep )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1910:3: lv_abbrForward_2_0= ruleAbbrevForwardStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getForwardStepAccess().getAbbrForwardAbbrevForwardStepParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbbrevForwardStep_in_ruleForwardStep4071);
                    lv_abbrForward_2_0=ruleAbbrevForwardStep();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getForwardStepRule());
                    	        }
                           		set(
                           			current, 
                           			"abbrForward",
                            		lv_abbrForward_2_0, 
                            		"AbbrevForwardStep");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForwardStep"


    // $ANTLR start "entryRuleForwardAxis"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1934:1: entryRuleForwardAxis returns [EObject current=null] : iv_ruleForwardAxis= ruleForwardAxis EOF ;
    public final EObject entryRuleForwardAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardAxis = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1935:2: (iv_ruleForwardAxis= ruleForwardAxis EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1936:2: iv_ruleForwardAxis= ruleForwardAxis EOF
            {
             newCompositeNode(grammarAccess.getForwardAxisRule()); 
            pushFollow(FOLLOW_ruleForwardAxis_in_entryRuleForwardAxis4107);
            iv_ruleForwardAxis=ruleForwardAxis();

            state._fsp--;

             current =iv_ruleForwardAxis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForwardAxis4117); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForwardAxis"


    // $ANTLR start "ruleForwardAxis"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1943:1: ruleForwardAxis returns [EObject current=null] : ( ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' ) | ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' ) | ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' ) | ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' ) | ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' ) | ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' ) | ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' ) | ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' ) ) ;
    public final EObject ruleForwardAxis() throws RecognitionException {
        EObject current = null;

        Token lv_axis_0_0=null;
        Token otherlv_1=null;
        Token lv_axis_2_0=null;
        Token otherlv_3=null;
        Token lv_axis_4_0=null;
        Token otherlv_5=null;
        Token lv_axis_6_0=null;
        Token otherlv_7=null;
        Token lv_axis_8_0=null;
        Token otherlv_9=null;
        Token lv_axis_10_0=null;
        Token otherlv_11=null;
        Token lv_axis_12_0=null;
        Token otherlv_13=null;
        Token lv_axis_14_0=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1946:28: ( ( ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' ) | ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' ) | ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' ) | ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' ) | ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' ) | ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' ) | ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' ) | ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1947:1: ( ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' ) | ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' ) | ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' ) | ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' ) | ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' ) | ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' ) | ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' ) | ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1947:1: ( ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' ) | ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' ) | ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' ) | ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' ) | ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' ) | ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' ) | ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' ) | ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' ) )
            int alt30=8;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt30=1;
                }
                break;
            case 57:
                {
                alt30=2;
                }
                break;
            case 58:
                {
                alt30=3;
                }
                break;
            case 59:
                {
                alt30=4;
                }
                break;
            case 60:
                {
                alt30=5;
                }
                break;
            case 61:
                {
                alt30=6;
                }
                break;
            case 62:
                {
                alt30=7;
                }
                break;
            case 63:
                {
                alt30=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1947:2: ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1947:2: ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1947:3: ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1947:3: ( (lv_axis_0_0= 'child' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1948:1: (lv_axis_0_0= 'child' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1948:1: (lv_axis_0_0= 'child' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1949:3: lv_axis_0_0= 'child'
                    {
                    lv_axis_0_0=(Token)match(input,55,FOLLOW_55_in_ruleForwardAxis4161); 

                            newLeafNode(lv_axis_0_0, grammarAccess.getForwardAxisAccess().getAxisChildKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_0_0, "child");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleForwardAxis4186); 

                        	newLeafNode(otherlv_1, grammarAccess.getForwardAxisAccess().getColonColonKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1967:6: ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1967:6: ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1967:7: ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1967:7: ( (lv_axis_2_0= 'descendant' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1968:1: (lv_axis_2_0= 'descendant' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1968:1: (lv_axis_2_0= 'descendant' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1969:3: lv_axis_2_0= 'descendant'
                    {
                    lv_axis_2_0=(Token)match(input,57,FOLLOW_57_in_ruleForwardAxis4212); 

                            newLeafNode(lv_axis_2_0, grammarAccess.getForwardAxisAccess().getAxisDescendantKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_2_0, "descendant");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleForwardAxis4237); 

                        	newLeafNode(otherlv_3, grammarAccess.getForwardAxisAccess().getColonColonKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1987:6: ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1987:6: ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1987:7: ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1987:7: ( (lv_axis_4_0= 'attribute' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1988:1: (lv_axis_4_0= 'attribute' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1988:1: (lv_axis_4_0= 'attribute' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1989:3: lv_axis_4_0= 'attribute'
                    {
                    lv_axis_4_0=(Token)match(input,58,FOLLOW_58_in_ruleForwardAxis4263); 

                            newLeafNode(lv_axis_4_0, grammarAccess.getForwardAxisAccess().getAxisAttributeKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_4_0, "attribute");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,56,FOLLOW_56_in_ruleForwardAxis4288); 

                        	newLeafNode(otherlv_5, grammarAccess.getForwardAxisAccess().getColonColonKeyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2007:6: ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2007:6: ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2007:7: ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2007:7: ( (lv_axis_6_0= 'self' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2008:1: (lv_axis_6_0= 'self' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2008:1: (lv_axis_6_0= 'self' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2009:3: lv_axis_6_0= 'self'
                    {
                    lv_axis_6_0=(Token)match(input,59,FOLLOW_59_in_ruleForwardAxis4314); 

                            newLeafNode(lv_axis_6_0, grammarAccess.getForwardAxisAccess().getAxisSelfKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_6_0, "self");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleForwardAxis4339); 

                        	newLeafNode(otherlv_7, grammarAccess.getForwardAxisAccess().getColonColonKeyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2027:6: ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2027:6: ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2027:7: ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2027:7: ( (lv_axis_8_0= 'descendant-or-self' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2028:1: (lv_axis_8_0= 'descendant-or-self' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2028:1: (lv_axis_8_0= 'descendant-or-self' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2029:3: lv_axis_8_0= 'descendant-or-self'
                    {
                    lv_axis_8_0=(Token)match(input,60,FOLLOW_60_in_ruleForwardAxis4365); 

                            newLeafNode(lv_axis_8_0, grammarAccess.getForwardAxisAccess().getAxisDescendantOrSelfKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_8_0, "descendant-or-self");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,56,FOLLOW_56_in_ruleForwardAxis4390); 

                        	newLeafNode(otherlv_9, grammarAccess.getForwardAxisAccess().getColonColonKeyword_4_1());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2047:6: ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2047:6: ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2047:7: ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2047:7: ( (lv_axis_10_0= 'following-sibling' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2048:1: (lv_axis_10_0= 'following-sibling' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2048:1: (lv_axis_10_0= 'following-sibling' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2049:3: lv_axis_10_0= 'following-sibling'
                    {
                    lv_axis_10_0=(Token)match(input,61,FOLLOW_61_in_ruleForwardAxis4416); 

                            newLeafNode(lv_axis_10_0, grammarAccess.getForwardAxisAccess().getAxisFollowingSiblingKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_10_0, "following-sibling");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,56,FOLLOW_56_in_ruleForwardAxis4441); 

                        	newLeafNode(otherlv_11, grammarAccess.getForwardAxisAccess().getColonColonKeyword_5_1());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2067:6: ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2067:6: ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2067:7: ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2067:7: ( (lv_axis_12_0= 'following' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2068:1: (lv_axis_12_0= 'following' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2068:1: (lv_axis_12_0= 'following' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2069:3: lv_axis_12_0= 'following'
                    {
                    lv_axis_12_0=(Token)match(input,62,FOLLOW_62_in_ruleForwardAxis4467); 

                            newLeafNode(lv_axis_12_0, grammarAccess.getForwardAxisAccess().getAxisFollowingKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_12_0, "following");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,56,FOLLOW_56_in_ruleForwardAxis4492); 

                        	newLeafNode(otherlv_13, grammarAccess.getForwardAxisAccess().getColonColonKeyword_6_1());
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2087:6: ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2087:6: ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2087:7: ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2087:7: ( (lv_axis_14_0= 'namespace' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2088:1: (lv_axis_14_0= 'namespace' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2088:1: (lv_axis_14_0= 'namespace' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2089:3: lv_axis_14_0= 'namespace'
                    {
                    lv_axis_14_0=(Token)match(input,63,FOLLOW_63_in_ruleForwardAxis4518); 

                            newLeafNode(lv_axis_14_0, grammarAccess.getForwardAxisAccess().getAxisNamespaceKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_14_0, "namespace");
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,56,FOLLOW_56_in_ruleForwardAxis4543); 

                        	newLeafNode(otherlv_15, grammarAccess.getForwardAxisAccess().getColonColonKeyword_7_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForwardAxis"


    // $ANTLR start "entryRuleAbbrevForwardStep"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2114:1: entryRuleAbbrevForwardStep returns [EObject current=null] : iv_ruleAbbrevForwardStep= ruleAbbrevForwardStep EOF ;
    public final EObject entryRuleAbbrevForwardStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbbrevForwardStep = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2115:2: (iv_ruleAbbrevForwardStep= ruleAbbrevForwardStep EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2116:2: iv_ruleAbbrevForwardStep= ruleAbbrevForwardStep EOF
            {
             newCompositeNode(grammarAccess.getAbbrevForwardStepRule()); 
            pushFollow(FOLLOW_ruleAbbrevForwardStep_in_entryRuleAbbrevForwardStep4580);
            iv_ruleAbbrevForwardStep=ruleAbbrevForwardStep();

            state._fsp--;

             current =iv_ruleAbbrevForwardStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbbrevForwardStep4590); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbbrevForwardStep"


    // $ANTLR start "ruleAbbrevForwardStep"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2123:1: ruleAbbrevForwardStep returns [EObject current=null] : ( (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () ) | (this_NodeTest_3= ruleNodeTest () ) ) ;
    public final EObject ruleAbbrevForwardStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_NodeTest_1 = null;

        EObject this_NodeTest_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2126:28: ( ( (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () ) | (this_NodeTest_3= ruleNodeTest () ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2127:1: ( (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () ) | (this_NodeTest_3= ruleNodeTest () ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2127:1: ( (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () ) | (this_NodeTest_3= ruleNodeTest () ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==64) ) {
                alt31=1;
            }
            else if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_ANYKINDTEST)||LA31_0==39||LA31_0==58||(LA31_0>=69 && LA31_0<=73)) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2127:2: (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2127:2: (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2127:4: otherlv_0= '@' this_NodeTest_1= ruleNodeTest ()
                    {
                    otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleAbbrevForwardStep4628); 

                        	newLeafNode(otherlv_0, grammarAccess.getAbbrevForwardStepAccess().getCommercialAtKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getAbbrevForwardStepAccess().getNodeTestParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleNodeTest_in_ruleAbbrevForwardStep4650);
                    this_NodeTest_1=ruleNodeTest();

                    state._fsp--;

                     
                            current = this_NodeTest_1; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2140:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2141:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAbbrevForwardStepAccess().getAttributeTestAction_0_2(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2147:6: (this_NodeTest_3= ruleNodeTest () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2147:6: (this_NodeTest_3= ruleNodeTest () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2148:5: this_NodeTest_3= ruleNodeTest ()
                    {
                     
                            newCompositeNode(grammarAccess.getAbbrevForwardStepAccess().getNodeTestParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleNodeTest_in_ruleAbbrevForwardStep4688);
                    this_NodeTest_3=ruleNodeTest();

                    state._fsp--;

                     
                            current = this_NodeTest_3; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2156:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2157:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAbbrevForwardStepAccess().getElementTestAction_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbbrevForwardStep"


    // $ANTLR start "entryRuleReverseStep"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2170:1: entryRuleReverseStep returns [EObject current=null] : iv_ruleReverseStep= ruleReverseStep EOF ;
    public final EObject entryRuleReverseStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReverseStep = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2171:2: (iv_ruleReverseStep= ruleReverseStep EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2172:2: iv_ruleReverseStep= ruleReverseStep EOF
            {
             newCompositeNode(grammarAccess.getReverseStepRule()); 
            pushFollow(FOLLOW_ruleReverseStep_in_entryRuleReverseStep4733);
            iv_ruleReverseStep=ruleReverseStep();

            state._fsp--;

             current =iv_ruleReverseStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReverseStep4743); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReverseStep"


    // $ANTLR start "ruleReverseStep"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2179:1: ruleReverseStep returns [EObject current=null] : ( ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) ) ) ;
    public final EObject ruleReverseStep() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;
        Token lv_abbrRevSet_2_0=null;
        EObject lv_test_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2182:28: ( ( ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2183:1: ( ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2183:1: ( ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_REVERSEAXIS) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ABBREVREVERSESTEP) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2183:2: ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2183:2: ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2183:3: ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2183:3: ( (lv_reverse_0_0= RULE_REVERSEAXIS ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2184:1: (lv_reverse_0_0= RULE_REVERSEAXIS )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2184:1: (lv_reverse_0_0= RULE_REVERSEAXIS )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2185:3: lv_reverse_0_0= RULE_REVERSEAXIS
                    {
                    lv_reverse_0_0=(Token)match(input,RULE_REVERSEAXIS,FOLLOW_RULE_REVERSEAXIS_in_ruleReverseStep4786); 

                    			newLeafNode(lv_reverse_0_0, grammarAccess.getReverseStepAccess().getReverseREVERSEAXISTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReverseStepRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"reverse",
                            		lv_reverse_0_0, 
                            		"REVERSEAXIS");
                    	    

                    }


                    }

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2201:2: ( (lv_test_1_0= ruleNodeTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2202:1: (lv_test_1_0= ruleNodeTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2202:1: (lv_test_1_0= ruleNodeTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2203:3: lv_test_1_0= ruleNodeTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getReverseStepAccess().getTestNodeTestParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeTest_in_ruleReverseStep4812);
                    lv_test_1_0=ruleNodeTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReverseStepRule());
                    	        }
                           		set(
                           			current, 
                           			"test",
                            		lv_test_1_0, 
                            		"NodeTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2220:6: ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2220:6: ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2221:1: (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2221:1: (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2222:3: lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP
                    {
                    lv_abbrRevSet_2_0=(Token)match(input,RULE_ABBREVREVERSESTEP,FOLLOW_RULE_ABBREVREVERSESTEP_in_ruleReverseStep4836); 

                    			newLeafNode(lv_abbrRevSet_2_0, grammarAccess.getReverseStepAccess().getAbbrRevSetABBREVREVERSESTEPTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getReverseStepRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"abbrRevSet",
                            		lv_abbrRevSet_2_0, 
                            		"ABBREVREVERSESTEP");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReverseStep"


    // $ANTLR start "entryRuleNodeTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2246:1: entryRuleNodeTest returns [EObject current=null] : iv_ruleNodeTest= ruleNodeTest EOF ;
    public final EObject entryRuleNodeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2247:2: (iv_ruleNodeTest= ruleNodeTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2248:2: iv_ruleNodeTest= ruleNodeTest EOF
            {
             newCompositeNode(grammarAccess.getNodeTestRule()); 
            pushFollow(FOLLOW_ruleNodeTest_in_entryRuleNodeTest4877);
            iv_ruleNodeTest=ruleNodeTest();

            state._fsp--;

             current =iv_ruleNodeTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTest4887); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNodeTest"


    // $ANTLR start "ruleNodeTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2255:1: ruleNodeTest returns [EObject current=null] : ( ( (lv_test_0_0= ruleKindTest ) ) | ( (lv_test_1_0= ruleNameTest ) ) ) ;
    public final EObject ruleNodeTest() throws RecognitionException {
        EObject current = null;

        EObject lv_test_0_0 = null;

        EObject lv_test_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2258:28: ( ( ( (lv_test_0_0= ruleKindTest ) ) | ( (lv_test_1_0= ruleNameTest ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2259:1: ( ( (lv_test_0_0= ruleKindTest ) ) | ( (lv_test_1_0= ruleNameTest ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2259:1: ( ( (lv_test_0_0= ruleKindTest ) ) | ( (lv_test_1_0= ruleNameTest ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_COMMENTTEST && LA33_0<=RULE_ANYKINDTEST)||LA33_0==58||(LA33_0>=69 && LA33_0<=73)) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_ID||LA33_0==39) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2259:2: ( (lv_test_0_0= ruleKindTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2259:2: ( (lv_test_0_0= ruleKindTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2260:1: (lv_test_0_0= ruleKindTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2260:1: (lv_test_0_0= ruleKindTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2261:3: lv_test_0_0= ruleKindTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeTestAccess().getTestKindTestParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKindTest_in_ruleNodeTest4933);
                    lv_test_0_0=ruleKindTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"test",
                            		lv_test_0_0, 
                            		"KindTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2278:6: ( (lv_test_1_0= ruleNameTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2278:6: ( (lv_test_1_0= ruleNameTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2279:1: (lv_test_1_0= ruleNameTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2279:1: (lv_test_1_0= ruleNameTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2280:3: lv_test_1_0= ruleNameTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeTestAccess().getTestNameTestParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNameTest_in_ruleNodeTest4960);
                    lv_test_1_0=ruleNameTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNodeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"test",
                            		lv_test_1_0, 
                            		"NameTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNodeTest"


    // $ANTLR start "entryRuleNameTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2304:1: entryRuleNameTest returns [EObject current=null] : iv_ruleNameTest= ruleNameTest EOF ;
    public final EObject entryRuleNameTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2305:2: (iv_ruleNameTest= ruleNameTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2306:2: iv_ruleNameTest= ruleNameTest EOF
            {
             newCompositeNode(grammarAccess.getNameTestRule()); 
            pushFollow(FOLLOW_ruleNameTest_in_entryRuleNameTest4996);
            iv_ruleNameTest=ruleNameTest();

            state._fsp--;

             current =iv_ruleNameTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameTest5006); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameTest"


    // $ANTLR start "ruleNameTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2313:1: ruleNameTest returns [EObject current=null] : ( ( (lv_qName_0_0= ruleQName ) ) | ( (lv_wildcard_1_0= ruleWildcard ) ) ) ;
    public final EObject ruleNameTest() throws RecognitionException {
        EObject current = null;

        EObject lv_qName_0_0 = null;

        EObject lv_wildcard_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2316:28: ( ( ( (lv_qName_0_0= ruleQName ) ) | ( (lv_wildcard_1_0= ruleWildcard ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2317:1: ( ( (lv_qName_0_0= ruleQName ) ) | ( (lv_wildcard_1_0= ruleWildcard ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2317:1: ( ( (lv_qName_0_0= ruleQName ) ) | ( (lv_wildcard_1_0= ruleWildcard ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==65) ) {
                    int LA34_3 = input.LA(3);

                    if ( (LA34_3==RULE_ID) ) {
                        alt34=1;
                    }
                    else if ( (LA34_3==39) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA34_1==EOF||(LA34_1>=RULE_VALUECOMP && LA34_1<=RULE_NODECOMP)||(LA34_1>=21 && LA34_1<=22)||LA34_1==28||LA34_1==31||(LA34_1>=33 && LA34_1<=47)||LA34_1==49||(LA34_1>=51 && LA34_1<=54)||(LA34_1>=66 && LA34_1<=67)) ) {
                    alt34=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA34_0==39) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2317:2: ( (lv_qName_0_0= ruleQName ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2317:2: ( (lv_qName_0_0= ruleQName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2318:1: (lv_qName_0_0= ruleQName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2318:1: (lv_qName_0_0= ruleQName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2319:3: lv_qName_0_0= ruleQName
                    {
                     
                    	        newCompositeNode(grammarAccess.getNameTestAccess().getQNameQNameParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQName_in_ruleNameTest5052);
                    lv_qName_0_0=ruleQName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNameTestRule());
                    	        }
                           		set(
                           			current, 
                           			"qName",
                            		lv_qName_0_0, 
                            		"QName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2336:6: ( (lv_wildcard_1_0= ruleWildcard ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2336:6: ( (lv_wildcard_1_0= ruleWildcard ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2337:1: (lv_wildcard_1_0= ruleWildcard )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2337:1: (lv_wildcard_1_0= ruleWildcard )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2338:3: lv_wildcard_1_0= ruleWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getNameTestAccess().getWildcardWildcardParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWildcard_in_ruleNameTest5079);
                    lv_wildcard_1_0=ruleWildcard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNameTestRule());
                    	        }
                           		set(
                           			current, 
                           			"wildcard",
                            		lv_wildcard_1_0, 
                            		"Wildcard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameTest"


    // $ANTLR start "entryRuleWildcard"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2362:1: entryRuleWildcard returns [EObject current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final EObject entryRuleWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcard = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2363:2: (iv_ruleWildcard= ruleWildcard EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2364:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_ruleWildcard_in_entryRuleWildcard5115);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcard5125); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWildcard"


    // $ANTLR start "ruleWildcard"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2371:1: ruleWildcard returns [EObject current=null] : ( ( (lv_wild_0_0= '*' ) ) | ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' ) | (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) ) ) ;
    public final EObject ruleWildcard() throws RecognitionException {
        EObject current = null;

        Token lv_wild_0_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2374:28: ( ( ( (lv_wild_0_0= '*' ) ) | ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' ) | (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2375:1: ( ( (lv_wild_0_0= '*' ) ) | ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' ) | (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2375:1: ( ( (lv_wild_0_0= '*' ) ) | ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' ) | (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) ) )
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==EOF||(LA35_1>=RULE_VALUECOMP && LA35_1<=RULE_NODECOMP)||(LA35_1>=21 && LA35_1<=22)||LA35_1==28||LA35_1==31||(LA35_1>=33 && LA35_1<=47)||LA35_1==49||(LA35_1>=51 && LA35_1<=54)||(LA35_1>=66 && LA35_1<=67)) ) {
                    alt35=1;
                }
                else if ( (LA35_1==65) ) {
                    alt35=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA35_0==RULE_ID) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2375:2: ( (lv_wild_0_0= '*' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2375:2: ( (lv_wild_0_0= '*' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2376:1: (lv_wild_0_0= '*' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2376:1: (lv_wild_0_0= '*' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2377:3: lv_wild_0_0= '*'
                    {
                    lv_wild_0_0=(Token)match(input,39,FOLLOW_39_in_ruleWildcard5168); 

                            newLeafNode(lv_wild_0_0, grammarAccess.getWildcardAccess().getWildAsteriskKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getWildcardRule());
                    	        }
                           		setWithLastConsumed(current, "wild", lv_wild_0_0, "*");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2391:6: ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2391:6: ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2391:7: ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2391:7: ( (lv_left_1_0= ruleNCName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2392:1: (lv_left_1_0= ruleNCName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2392:1: (lv_left_1_0= ruleNCName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2393:3: lv_left_1_0= ruleNCName
                    {
                     
                    	        newCompositeNode(grammarAccess.getWildcardAccess().getLeftNCNameParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNCName_in_ruleWildcard5209);
                    lv_left_1_0=ruleNCName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWildcardRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_1_0, 
                            		"NCName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleWildcard5221); 

                        	newLeafNode(otherlv_2, grammarAccess.getWildcardAccess().getColonKeyword_1_1());
                        
                    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleWildcard5233); 

                        	newLeafNode(otherlv_3, grammarAccess.getWildcardAccess().getAsteriskKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2418:6: (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2418:6: (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2418:8: otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) )
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleWildcard5253); 

                        	newLeafNode(otherlv_4, grammarAccess.getWildcardAccess().getAsteriskKeyword_2_0());
                        
                    otherlv_5=(Token)match(input,65,FOLLOW_65_in_ruleWildcard5265); 

                        	newLeafNode(otherlv_5, grammarAccess.getWildcardAccess().getColonKeyword_2_1());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2426:1: ( (lv_right_6_0= ruleNCName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2427:1: (lv_right_6_0= ruleNCName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2427:1: (lv_right_6_0= ruleNCName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2428:3: lv_right_6_0= ruleNCName
                    {
                     
                    	        newCompositeNode(grammarAccess.getWildcardAccess().getRightNCNameParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNCName_in_ruleWildcard5286);
                    lv_right_6_0=ruleNCName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWildcardRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_6_0, 
                            		"NCName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWildcard"


    // $ANTLR start "entryRuleFilterExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2452:1: entryRuleFilterExpr returns [EObject current=null] : iv_ruleFilterExpr= ruleFilterExpr EOF ;
    public final EObject entryRuleFilterExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2453:2: (iv_ruleFilterExpr= ruleFilterExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2454:2: iv_ruleFilterExpr= ruleFilterExpr EOF
            {
             newCompositeNode(grammarAccess.getFilterExprRule()); 
            pushFollow(FOLLOW_ruleFilterExpr_in_entryRuleFilterExpr5323);
            iv_ruleFilterExpr=ruleFilterExpr();

            state._fsp--;

             current =iv_ruleFilterExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterExpr5333); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterExpr"


    // $ANTLR start "ruleFilterExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2461:1: ruleFilterExpr returns [EObject current=null] : ( ( (lv_primary_0_0= rulePrimaryExpr ) ) ( (lv_predicateList_1_0= rulePredicateList ) ) ) ;
    public final EObject ruleFilterExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_primary_0_0 = null;

        EObject lv_predicateList_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2464:28: ( ( ( (lv_primary_0_0= rulePrimaryExpr ) ) ( (lv_predicateList_1_0= rulePredicateList ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2465:1: ( ( (lv_primary_0_0= rulePrimaryExpr ) ) ( (lv_predicateList_1_0= rulePredicateList ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2465:1: ( ( (lv_primary_0_0= rulePrimaryExpr ) ) ( (lv_predicateList_1_0= rulePredicateList ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2465:2: ( (lv_primary_0_0= rulePrimaryExpr ) ) ( (lv_predicateList_1_0= rulePredicateList ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2465:2: ( (lv_primary_0_0= rulePrimaryExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2466:1: (lv_primary_0_0= rulePrimaryExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2466:1: (lv_primary_0_0= rulePrimaryExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2467:3: lv_primary_0_0= rulePrimaryExpr
            {
             
            	        newCompositeNode(grammarAccess.getFilterExprAccess().getPrimaryPrimaryExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryExpr_in_ruleFilterExpr5379);
            lv_primary_0_0=rulePrimaryExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterExprRule());
            	        }
                   		set(
                   			current, 
                   			"primary",
                    		lv_primary_0_0, 
                    		"PrimaryExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2483:2: ( (lv_predicateList_1_0= rulePredicateList ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2484:1: (lv_predicateList_1_0= rulePredicateList )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2484:1: (lv_predicateList_1_0= rulePredicateList )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2485:3: lv_predicateList_1_0= rulePredicateList
            {
             
            	        newCompositeNode(grammarAccess.getFilterExprAccess().getPredicateListPredicateListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateList_in_ruleFilterExpr5400);
            lv_predicateList_1_0=rulePredicateList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFilterExprRule());
            	        }
                   		set(
                   			current, 
                   			"predicateList",
                    		lv_predicateList_1_0, 
                    		"PredicateList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterExpr"


    // $ANTLR start "entryRulePredicateList"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2509:1: entryRulePredicateList returns [EObject current=null] : iv_rulePredicateList= rulePredicateList EOF ;
    public final EObject entryRulePredicateList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateList = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2510:2: (iv_rulePredicateList= rulePredicateList EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2511:2: iv_rulePredicateList= rulePredicateList EOF
            {
             newCompositeNode(grammarAccess.getPredicateListRule()); 
            pushFollow(FOLLOW_rulePredicateList_in_entryRulePredicateList5436);
            iv_rulePredicateList=rulePredicateList();

            state._fsp--;

             current =iv_rulePredicateList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateList5446); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicateList"


    // $ANTLR start "rulePredicateList"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2518:1: rulePredicateList returns [EObject current=null] : ( () ( (lv_predicates_1_0= rulePredicate ) )* ) ;
    public final EObject rulePredicateList() throws RecognitionException {
        EObject current = null;

        EObject lv_predicates_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2521:28: ( ( () ( (lv_predicates_1_0= rulePredicate ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2522:1: ( () ( (lv_predicates_1_0= rulePredicate ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2522:1: ( () ( (lv_predicates_1_0= rulePredicate ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2522:2: () ( (lv_predicates_1_0= rulePredicate ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2522:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2523:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateListAccess().getPredicateListAction_0(),
                        current);
                

            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2528:2: ( (lv_predicates_1_0= rulePredicate ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==66) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2529:1: (lv_predicates_1_0= rulePredicate )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2529:1: (lv_predicates_1_0= rulePredicate )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2530:3: lv_predicates_1_0= rulePredicate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateListAccess().getPredicatesPredicateParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicate_in_rulePredicateList5501);
            	    lv_predicates_1_0=rulePredicate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPredicateListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"predicates",
            	            		lv_predicates_1_0, 
            	            		"Predicate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicateList"


    // $ANTLR start "entryRulePredicate"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2554:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2555:2: (iv_rulePredicate= rulePredicate EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2556:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate5538);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate5548); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2563:1: rulePredicate returns [EObject current=null] : (otherlv_0= '[' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ']' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2566:28: ( (otherlv_0= '[' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ']' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2567:1: (otherlv_0= '[' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ']' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2567:1: (otherlv_0= '[' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ']' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2567:3: otherlv_0= '[' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_rulePredicate5585); 

                	newLeafNode(otherlv_0, grammarAccess.getPredicateAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2571:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2572:1: (lv_expr_1_0= ruleExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2572:1: (lv_expr_1_0= ruleExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2573:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getPredicateAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_rulePredicate5606);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredicateRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,67,FOLLOW_67_in_rulePredicate5618); 

                	newLeafNode(otherlv_2, grammarAccess.getPredicateAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRulePrimaryExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2601:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2602:2: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2603:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            pushFollow(FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr5654);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;

             current =iv_rulePrimaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpr5664); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2610:1: rulePrimaryExpr returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_varRef_1_0= ruleVarRef ) ) | ( (lv_parExpr_2_0= ruleParenthesizedExpr ) ) | ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) ) | ( (lv_functionCall_4_0= ruleFunctionCall ) ) ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token lv_conItemExpr_3_0=null;
        EObject lv_literal_0_0 = null;

        EObject lv_varRef_1_0 = null;

        EObject lv_parExpr_2_0 = null;

        EObject lv_functionCall_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2613:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_varRef_1_0= ruleVarRef ) ) | ( (lv_parExpr_2_0= ruleParenthesizedExpr ) ) | ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) ) | ( (lv_functionCall_4_0= ruleFunctionCall ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2614:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_varRef_1_0= ruleVarRef ) ) | ( (lv_parExpr_2_0= ruleParenthesizedExpr ) ) | ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) ) | ( (lv_functionCall_4_0= ruleFunctionCall ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2614:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_varRef_1_0= ruleVarRef ) ) | ( (lv_parExpr_2_0= ruleParenthesizedExpr ) ) | ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) ) | ( (lv_functionCall_4_0= ruleFunctionCall ) ) )
            int alt37=5;
            switch ( input.LA(1) ) {
            case RULE_STRINGLITERAL:
            case RULE_INTLITERAL:
            case RULE_DECIMALLITERAL:
            case RULE_DOUBLELITERAL:
                {
                alt37=1;
                }
                break;
            case 24:
                {
                alt37=2;
                }
                break;
            case 30:
                {
                alt37=3;
                }
                break;
            case RULE_CONTEXTITEMEXPR:
                {
                alt37=4;
                }
                break;
            case RULE_ID:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2614:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2614:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2615:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2615:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2616:3: lv_literal_0_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExprAccess().getLiteralLiteralParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpr5710);
                    lv_literal_0_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_0_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2633:6: ( (lv_varRef_1_0= ruleVarRef ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2633:6: ( (lv_varRef_1_0= ruleVarRef ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2634:1: (lv_varRef_1_0= ruleVarRef )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2634:1: (lv_varRef_1_0= ruleVarRef )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2635:3: lv_varRef_1_0= ruleVarRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExprAccess().getVarRefVarRefParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarRef_in_rulePrimaryExpr5737);
                    lv_varRef_1_0=ruleVarRef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                    	        }
                           		set(
                           			current, 
                           			"varRef",
                            		lv_varRef_1_0, 
                            		"VarRef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2652:6: ( (lv_parExpr_2_0= ruleParenthesizedExpr ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2652:6: ( (lv_parExpr_2_0= ruleParenthesizedExpr ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2653:1: (lv_parExpr_2_0= ruleParenthesizedExpr )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2653:1: (lv_parExpr_2_0= ruleParenthesizedExpr )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2654:3: lv_parExpr_2_0= ruleParenthesizedExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExprAccess().getParExprParenthesizedExprParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParenthesizedExpr_in_rulePrimaryExpr5764);
                    lv_parExpr_2_0=ruleParenthesizedExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                    	        }
                           		set(
                           			current, 
                           			"parExpr",
                            		lv_parExpr_2_0, 
                            		"ParenthesizedExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2671:6: ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2671:6: ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2672:1: (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2672:1: (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2673:3: lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR
                    {
                    lv_conItemExpr_3_0=(Token)match(input,RULE_CONTEXTITEMEXPR,FOLLOW_RULE_CONTEXTITEMEXPR_in_rulePrimaryExpr5787); 

                    			newLeafNode(lv_conItemExpr_3_0, grammarAccess.getPrimaryExprAccess().getConItemExprCONTEXTITEMEXPRTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimaryExprRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"conItemExpr",
                            		lv_conItemExpr_3_0, 
                            		"CONTEXTITEMEXPR");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2690:6: ( (lv_functionCall_4_0= ruleFunctionCall ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2690:6: ( (lv_functionCall_4_0= ruleFunctionCall ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2691:1: (lv_functionCall_4_0= ruleFunctionCall )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2691:1: (lv_functionCall_4_0= ruleFunctionCall )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2692:3: lv_functionCall_4_0= ruleFunctionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExprAccess().getFunctionCallFunctionCallParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionCall_in_rulePrimaryExpr5819);
                    lv_functionCall_4_0=ruleFunctionCall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                    	        }
                           		set(
                           			current, 
                           			"functionCall",
                            		lv_functionCall_4_0, 
                            		"FunctionCall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleLiteral"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2716:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2717:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2718:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5855);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5865); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2725:1: ruleLiteral returns [EObject current=null] : ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_string_1_0= RULE_STRINGLITERAL ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_num_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2728:28: ( ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_string_1_0= RULE_STRINGLITERAL ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2729:1: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_string_1_0= RULE_STRINGLITERAL ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2729:1: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_string_1_0= RULE_STRINGLITERAL ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_INTLITERAL && LA38_0<=RULE_DOUBLELITERAL)) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_STRINGLITERAL) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2729:2: ( (lv_num_0_0= ruleNumericLiteral ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2729:2: ( (lv_num_0_0= ruleNumericLiteral ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2730:1: (lv_num_0_0= ruleNumericLiteral )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2730:1: (lv_num_0_0= ruleNumericLiteral )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2731:3: lv_num_0_0= ruleNumericLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getNumNumericLiteralParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumericLiteral_in_ruleLiteral5911);
                    lv_num_0_0=ruleNumericLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"num",
                            		lv_num_0_0, 
                            		"NumericLiteral");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2748:6: ( (lv_string_1_0= RULE_STRINGLITERAL ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2748:6: ( (lv_string_1_0= RULE_STRINGLITERAL ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2749:1: (lv_string_1_0= RULE_STRINGLITERAL )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2749:1: (lv_string_1_0= RULE_STRINGLITERAL )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2750:3: lv_string_1_0= RULE_STRINGLITERAL
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRINGLITERAL,FOLLOW_RULE_STRINGLITERAL_in_ruleLiteral5934); 

                    			newLeafNode(lv_string_1_0, grammarAccess.getLiteralAccess().getStringSTRINGLITERALTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_1_0, 
                            		"STRINGLITERAL");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleNumericLiteral"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2774:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2775:2: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2776:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumericLiteralRule()); 
            pushFollow(FOLLOW_ruleNumericLiteral_in_entryRuleNumericLiteral5975);
            iv_ruleNumericLiteral=ruleNumericLiteral();

            state._fsp--;

             current =iv_ruleNumericLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericLiteral5985); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2783:1: ruleNumericLiteral returns [EObject current=null] : ( ( (lv_intLit_0_0= RULE_INTLITERAL ) ) | ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) ) | ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) ) ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intLit_0_0=null;
        Token lv_decLit_1_0=null;
        Token lv_doubleLit_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2786:28: ( ( ( (lv_intLit_0_0= RULE_INTLITERAL ) ) | ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) ) | ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2787:1: ( ( (lv_intLit_0_0= RULE_INTLITERAL ) ) | ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) ) | ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2787:1: ( ( (lv_intLit_0_0= RULE_INTLITERAL ) ) | ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) ) | ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_INTLITERAL:
                {
                alt39=1;
                }
                break;
            case RULE_DECIMALLITERAL:
                {
                alt39=2;
                }
                break;
            case RULE_DOUBLELITERAL:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2787:2: ( (lv_intLit_0_0= RULE_INTLITERAL ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2787:2: ( (lv_intLit_0_0= RULE_INTLITERAL ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2788:1: (lv_intLit_0_0= RULE_INTLITERAL )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2788:1: (lv_intLit_0_0= RULE_INTLITERAL )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2789:3: lv_intLit_0_0= RULE_INTLITERAL
                    {
                    lv_intLit_0_0=(Token)match(input,RULE_INTLITERAL,FOLLOW_RULE_INTLITERAL_in_ruleNumericLiteral6027); 

                    			newLeafNode(lv_intLit_0_0, grammarAccess.getNumericLiteralAccess().getIntLitINTLITERALTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumericLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"intLit",
                            		lv_intLit_0_0, 
                            		"INTLITERAL");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2806:6: ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2806:6: ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2807:1: (lv_decLit_1_0= RULE_DECIMALLITERAL )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2807:1: (lv_decLit_1_0= RULE_DECIMALLITERAL )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2808:3: lv_decLit_1_0= RULE_DECIMALLITERAL
                    {
                    lv_decLit_1_0=(Token)match(input,RULE_DECIMALLITERAL,FOLLOW_RULE_DECIMALLITERAL_in_ruleNumericLiteral6055); 

                    			newLeafNode(lv_decLit_1_0, grammarAccess.getNumericLiteralAccess().getDecLitDECIMALLITERALTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumericLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"decLit",
                            		lv_decLit_1_0, 
                            		"DECIMALLITERAL");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2825:6: ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2825:6: ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2826:1: (lv_doubleLit_2_0= RULE_DOUBLELITERAL )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2826:1: (lv_doubleLit_2_0= RULE_DOUBLELITERAL )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2827:3: lv_doubleLit_2_0= RULE_DOUBLELITERAL
                    {
                    lv_doubleLit_2_0=(Token)match(input,RULE_DOUBLELITERAL,FOLLOW_RULE_DOUBLELITERAL_in_ruleNumericLiteral6083); 

                    			newLeafNode(lv_doubleLit_2_0, grammarAccess.getNumericLiteralAccess().getDoubleLitDOUBLELITERALTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNumericLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"doubleLit",
                            		lv_doubleLit_2_0, 
                            		"DOUBLELITERAL");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleVarRef"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2851:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2852:2: (iv_ruleVarRef= ruleVarRef EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2853:2: iv_ruleVarRef= ruleVarRef EOF
            {
             newCompositeNode(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef6124);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;

             current =iv_ruleVarRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef6134); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2860:1: ruleVarRef returns [EObject current=null] : (otherlv_0= '$' this_VarName_1= ruleVarName ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_VarName_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2863:28: ( (otherlv_0= '$' this_VarName_1= ruleVarName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2864:1: (otherlv_0= '$' this_VarName_1= ruleVarName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2864:1: (otherlv_0= '$' this_VarName_1= ruleVarName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2864:3: otherlv_0= '$' this_VarName_1= ruleVarName
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleVarRef6171); 

                	newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getDollarSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getVarRefAccess().getVarNameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleVarName_in_ruleVarRef6193);
            this_VarName_1=ruleVarName();

            state._fsp--;

             
                    current = this_VarName_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleVarName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2885:1: entryRuleVarName returns [EObject current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final EObject entryRuleVarName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2886:2: (iv_ruleVarName= ruleVarName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2887:2: iv_ruleVarName= ruleVarName EOF
            {
             newCompositeNode(grammarAccess.getVarNameRule()); 
            pushFollow(FOLLOW_ruleVarName_in_entryRuleVarName6228);
            iv_ruleVarName=ruleVarName();

            state._fsp--;

             current =iv_ruleVarName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarName6238); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarName"


    // $ANTLR start "ruleVarName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2894:1: ruleVarName returns [EObject current=null] : ( (lv_qName_0_0= ruleQName ) ) ;
    public final EObject ruleVarName() throws RecognitionException {
        EObject current = null;

        EObject lv_qName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2897:28: ( ( (lv_qName_0_0= ruleQName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2898:1: ( (lv_qName_0_0= ruleQName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2898:1: ( (lv_qName_0_0= ruleQName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2899:1: (lv_qName_0_0= ruleQName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2899:1: (lv_qName_0_0= ruleQName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2900:3: lv_qName_0_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getVarNameAccess().getQNameQNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleVarName6283);
            lv_qName_0_0=ruleQName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVarNameRule());
            	        }
                   		set(
                   			current, 
                   			"qName",
                    		lv_qName_0_0, 
                    		"QName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarName"


    // $ANTLR start "entryRuleParenthesizedExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2924:1: entryRuleParenthesizedExpr returns [EObject current=null] : iv_ruleParenthesizedExpr= ruleParenthesizedExpr EOF ;
    public final EObject entryRuleParenthesizedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2925:2: (iv_ruleParenthesizedExpr= ruleParenthesizedExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2926:2: iv_ruleParenthesizedExpr= ruleParenthesizedExpr EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedExprRule()); 
            pushFollow(FOLLOW_ruleParenthesizedExpr_in_entryRuleParenthesizedExpr6318);
            iv_ruleParenthesizedExpr=ruleParenthesizedExpr();

            state._fsp--;

             current =iv_ruleParenthesizedExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpr6328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedExpr"


    // $ANTLR start "ruleParenthesizedExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2933:1: ruleParenthesizedExpr returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) )? otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2936:28: ( ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) )? otherlv_3= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2937:1: ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) )? otherlv_3= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2937:1: ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) )? otherlv_3= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2937:2: () otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) )? otherlv_3= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2937:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2938:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParenthesizedExprAccess().getParenthesizedExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleParenthesizedExpr6374); 

                	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExprAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2947:1: ( (lv_expr_2_0= ruleExpr ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_REVERSEAXIS && LA40_0<=RULE_DOUBLELITERAL)||(LA40_0>=RULE_ID && LA40_0<=RULE_ANYKINDTEST)||(LA40_0>=23 && LA40_0<=24)||(LA40_0>=26 && LA40_0<=27)||(LA40_0>=29 && LA40_0<=30)||(LA40_0>=37 && LA40_0<=39)||(LA40_0>=53 && LA40_0<=55)||(LA40_0>=57 && LA40_0<=64)||(LA40_0>=69 && LA40_0<=73)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2948:1: (lv_expr_2_0= ruleExpr )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2948:1: (lv_expr_2_0= ruleExpr )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2949:3: lv_expr_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getParenthesizedExprAccess().getExprExprParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleParenthesizedExpr6395);
                    lv_expr_2_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParenthesizedExprRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_2_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleParenthesizedExpr6408); 

                	newLeafNode(otherlv_3, grammarAccess.getParenthesizedExprAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesizedExpr"


    // $ANTLR start "entryRuleFunctionCall"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2977:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2978:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2979:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall6444);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall6454); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2986:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_qName_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_qName_0_0 = null;

        EObject lv_expr_2_0 = null;

        EObject lv_exprs_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2989:28: ( ( ( (lv_qName_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2990:1: ( ( (lv_qName_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2990:1: ( ( (lv_qName_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2990:2: ( (lv_qName_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2990:2: ( (lv_qName_0_0= ruleQName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2991:1: (lv_qName_0_0= ruleQName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2991:1: (lv_qName_0_0= ruleQName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2992:3: lv_qName_0_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionCallAccess().getQNameQNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleFunctionCall6500);
            lv_qName_0_0=ruleQName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
            	        }
                   		set(
                   			current, 
                   			"qName",
                    		lv_qName_0_0, 
                    		"QName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleFunctionCall6512); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3012:1: ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_REVERSEAXIS && LA42_0<=RULE_DOUBLELITERAL)||(LA42_0>=RULE_ID && LA42_0<=RULE_ANYKINDTEST)||(LA42_0>=23 && LA42_0<=24)||(LA42_0>=26 && LA42_0<=27)||(LA42_0>=29 && LA42_0<=30)||(LA42_0>=37 && LA42_0<=39)||(LA42_0>=53 && LA42_0<=55)||(LA42_0>=57 && LA42_0<=64)||(LA42_0>=69 && LA42_0<=73)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3012:2: ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )*
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3012:2: ( (lv_expr_2_0= ruleExprSingle ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3013:1: (lv_expr_2_0= ruleExprSingle )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3013:1: (lv_expr_2_0= ruleExprSingle )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3014:3: lv_expr_2_0= ruleExprSingle
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getExprExprSingleParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprSingle_in_ruleFunctionCall6534);
                    lv_expr_2_0=ruleExprSingle();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_2_0, 
                            		"ExprSingle");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3030:2: (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==21) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3030:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleFunctionCall6547); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3034:1: ( (lv_exprs_4_0= ruleExprSingle ) )
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3035:1: (lv_exprs_4_0= ruleExprSingle )
                    	    {
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3035:1: (lv_exprs_4_0= ruleExprSingle )
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3036:3: lv_exprs_4_0= ruleExprSingle
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getExprsExprSingleParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExprSingle_in_ruleFunctionCall6568);
                    	    lv_exprs_4_0=ruleExprSingle();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"exprs",
                    	            		lv_exprs_4_0, 
                    	            		"ExprSingle");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleFunctionCall6584); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleSingleType"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3064:1: entryRuleSingleType returns [EObject current=null] : iv_ruleSingleType= ruleSingleType EOF ;
    public final EObject entryRuleSingleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleType = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3065:2: (iv_ruleSingleType= ruleSingleType EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3066:2: iv_ruleSingleType= ruleSingleType EOF
            {
             newCompositeNode(grammarAccess.getSingleTypeRule()); 
            pushFollow(FOLLOW_ruleSingleType_in_entryRuleSingleType6620);
            iv_ruleSingleType=ruleSingleType();

            state._fsp--;

             current =iv_ruleSingleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleType6630); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleType"


    // $ANTLR start "ruleSingleType"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3073:1: ruleSingleType returns [EObject current=null] : (this_AtomicType_0= ruleAtomicType (otherlv_1= '?' )? ) ;
    public final EObject ruleSingleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_AtomicType_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3076:28: ( (this_AtomicType_0= ruleAtomicType (otherlv_1= '?' )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3077:1: (this_AtomicType_0= ruleAtomicType (otherlv_1= '?' )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3077:1: (this_AtomicType_0= ruleAtomicType (otherlv_1= '?' )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3078:5: this_AtomicType_0= ruleAtomicType (otherlv_1= '?' )?
            {
             
                    newCompositeNode(grammarAccess.getSingleTypeAccess().getAtomicTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtomicType_in_ruleSingleType6677);
            this_AtomicType_0=ruleAtomicType();

            state._fsp--;

             
                    current = this_AtomicType_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3086:1: (otherlv_1= '?' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==68) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3086:3: otherlv_1= '?'
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleSingleType6689); 

                        	newLeafNode(otherlv_1, grammarAccess.getSingleTypeAccess().getQuestionMarkKeyword_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleType"


    // $ANTLR start "entryRuleSequenceType"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3098:1: entryRuleSequenceType returns [EObject current=null] : iv_ruleSequenceType= ruleSequenceType EOF ;
    public final EObject entryRuleSequenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceType = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3099:2: (iv_ruleSequenceType= ruleSequenceType EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3100:2: iv_ruleSequenceType= ruleSequenceType EOF
            {
             newCompositeNode(grammarAccess.getSequenceTypeRule()); 
            pushFollow(FOLLOW_ruleSequenceType_in_entryRuleSequenceType6727);
            iv_ruleSequenceType=ruleSequenceType();

            state._fsp--;

             current =iv_ruleSequenceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceType6737); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceType"


    // $ANTLR start "ruleSequenceType"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3107:1: ruleSequenceType returns [EObject current=null] : ( ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) ) | ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) ) ) ;
    public final EObject ruleSequenceType() throws RecognitionException {
        EObject current = null;

        Token lv_empty_0_0=null;
        EObject lv_itemType_1_0 = null;

        AntlrDatatypeRuleToken lv_occInd_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3110:28: ( ( ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) ) | ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3111:1: ( ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) ) | ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3111:1: ( ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) ) | ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_EMPTYSEQUENCETYPE) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=RULE_EMPTYITEMTYPE && LA44_0<=RULE_ANYKINDTEST)||LA44_0==58||(LA44_0>=69 && LA44_0<=73)) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3111:2: ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3111:2: ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3112:1: (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3112:1: (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3113:3: lv_empty_0_0= RULE_EMPTYSEQUENCETYPE
                    {
                    lv_empty_0_0=(Token)match(input,RULE_EMPTYSEQUENCETYPE,FOLLOW_RULE_EMPTYSEQUENCETYPE_in_ruleSequenceType6779); 

                    			newLeafNode(lv_empty_0_0, grammarAccess.getSequenceTypeAccess().getEmptyEMPTYSEQUENCETYPETerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSequenceTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"empty",
                            		lv_empty_0_0, 
                            		"EMPTYSEQUENCETYPE");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3130:6: ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3130:6: ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3130:7: ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3130:7: ( (lv_itemType_1_0= ruleItemType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3131:1: (lv_itemType_1_0= ruleItemType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3131:1: (lv_itemType_1_0= ruleItemType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3132:3: lv_itemType_1_0= ruleItemType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceTypeAccess().getItemTypeItemTypeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleItemType_in_ruleSequenceType6812);
                    lv_itemType_1_0=ruleItemType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"itemType",
                            		lv_itemType_1_0, 
                            		"ItemType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3148:2: ( (lv_occInd_2_0= ruleOccurenceIndicator ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3149:1: (lv_occInd_2_0= ruleOccurenceIndicator )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3149:1: (lv_occInd_2_0= ruleOccurenceIndicator )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3150:3: lv_occInd_2_0= ruleOccurenceIndicator
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceTypeAccess().getOccIndOccurenceIndicatorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOccurenceIndicator_in_ruleSequenceType6833);
                    lv_occInd_2_0=ruleOccurenceIndicator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSequenceTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"occInd",
                            		lv_occInd_2_0, 
                            		"OccurenceIndicator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceType"


    // $ANTLR start "entryRuleOccurenceIndicator"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3174:1: entryRuleOccurenceIndicator returns [String current=null] : iv_ruleOccurenceIndicator= ruleOccurenceIndicator EOF ;
    public final String entryRuleOccurenceIndicator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOccurenceIndicator = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3175:2: (iv_ruleOccurenceIndicator= ruleOccurenceIndicator EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3176:2: iv_ruleOccurenceIndicator= ruleOccurenceIndicator EOF
            {
             newCompositeNode(grammarAccess.getOccurenceIndicatorRule()); 
            pushFollow(FOLLOW_ruleOccurenceIndicator_in_entryRuleOccurenceIndicator6871);
            iv_ruleOccurenceIndicator=ruleOccurenceIndicator();

            state._fsp--;

             current =iv_ruleOccurenceIndicator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOccurenceIndicator6882); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOccurenceIndicator"


    // $ANTLR start "ruleOccurenceIndicator"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3183:1: ruleOccurenceIndicator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '?' | kw= '*' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOccurenceIndicator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3186:28: ( (kw= '?' | kw= '*' | kw= '+' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3187:1: (kw= '?' | kw= '*' | kw= '+' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3187:1: (kw= '?' | kw= '*' | kw= '+' )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt45=1;
                }
                break;
            case 39:
                {
                alt45=2;
                }
                break;
            case 37:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3188:2: kw= '?'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleOccurenceIndicator6920); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOccurenceIndicatorAccess().getQuestionMarkKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3195:2: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOccurenceIndicator6939); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOccurenceIndicatorAccess().getAsteriskKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3202:2: kw= '+'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOccurenceIndicator6958); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOccurenceIndicatorAccess().getPlusSignKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOccurenceIndicator"


    // $ANTLR start "entryRuleItemType"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3215:1: entryRuleItemType returns [EObject current=null] : iv_ruleItemType= ruleItemType EOF ;
    public final EObject entryRuleItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemType = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3216:2: (iv_ruleItemType= ruleItemType EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3217:2: iv_ruleItemType= ruleItemType EOF
            {
             newCompositeNode(grammarAccess.getItemTypeRule()); 
            pushFollow(FOLLOW_ruleItemType_in_entryRuleItemType6998);
            iv_ruleItemType=ruleItemType();

            state._fsp--;

             current =iv_ruleItemType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemType7008); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemType"


    // $ANTLR start "ruleItemType"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3224:1: ruleItemType returns [EObject current=null] : ( ( (lv_kindTest_0_0= ruleKindTest ) ) | ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) ) | ( (lv_atomicType_2_0= ruleAtomicType ) ) ) ;
    public final EObject ruleItemType() throws RecognitionException {
        EObject current = null;

        Token lv_empty_1_0=null;
        EObject lv_kindTest_0_0 = null;

        EObject lv_atomicType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3227:28: ( ( ( (lv_kindTest_0_0= ruleKindTest ) ) | ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) ) | ( (lv_atomicType_2_0= ruleAtomicType ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3228:1: ( ( (lv_kindTest_0_0= ruleKindTest ) ) | ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) ) | ( (lv_atomicType_2_0= ruleAtomicType ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3228:1: ( ( (lv_kindTest_0_0= ruleKindTest ) ) | ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) ) | ( (lv_atomicType_2_0= ruleAtomicType ) ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_COMMENTTEST:
            case RULE_TEXTTEST:
            case RULE_ANYKINDTEST:
            case 58:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
                {
                alt46=1;
                }
                break;
            case RULE_EMPTYITEMTYPE:
                {
                alt46=2;
                }
                break;
            case RULE_ID:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3228:2: ( (lv_kindTest_0_0= ruleKindTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3228:2: ( (lv_kindTest_0_0= ruleKindTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3229:1: (lv_kindTest_0_0= ruleKindTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3229:1: (lv_kindTest_0_0= ruleKindTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3230:3: lv_kindTest_0_0= ruleKindTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getItemTypeAccess().getKindTestKindTestParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKindTest_in_ruleItemType7054);
                    lv_kindTest_0_0=ruleKindTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItemTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"kindTest",
                            		lv_kindTest_0_0, 
                            		"KindTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3247:6: ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3247:6: ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3248:1: (lv_empty_1_0= RULE_EMPTYITEMTYPE )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3248:1: (lv_empty_1_0= RULE_EMPTYITEMTYPE )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3249:3: lv_empty_1_0= RULE_EMPTYITEMTYPE
                    {
                    lv_empty_1_0=(Token)match(input,RULE_EMPTYITEMTYPE,FOLLOW_RULE_EMPTYITEMTYPE_in_ruleItemType7077); 

                    			newLeafNode(lv_empty_1_0, grammarAccess.getItemTypeAccess().getEmptyEMPTYITEMTYPETerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemTypeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"empty",
                            		lv_empty_1_0, 
                            		"EMPTYITEMTYPE");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3266:6: ( (lv_atomicType_2_0= ruleAtomicType ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3266:6: ( (lv_atomicType_2_0= ruleAtomicType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3267:1: (lv_atomicType_2_0= ruleAtomicType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3267:1: (lv_atomicType_2_0= ruleAtomicType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3268:3: lv_atomicType_2_0= ruleAtomicType
                    {
                     
                    	        newCompositeNode(grammarAccess.getItemTypeAccess().getAtomicTypeAtomicTypeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicType_in_ruleItemType7109);
                    lv_atomicType_2_0=ruleAtomicType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getItemTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"atomicType",
                            		lv_atomicType_2_0, 
                            		"AtomicType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemType"


    // $ANTLR start "entryRuleAtomicType"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3292:1: entryRuleAtomicType returns [EObject current=null] : iv_ruleAtomicType= ruleAtomicType EOF ;
    public final EObject entryRuleAtomicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicType = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3293:2: (iv_ruleAtomicType= ruleAtomicType EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3294:2: iv_ruleAtomicType= ruleAtomicType EOF
            {
             newCompositeNode(grammarAccess.getAtomicTypeRule()); 
            pushFollow(FOLLOW_ruleAtomicType_in_entryRuleAtomicType7145);
            iv_ruleAtomicType=ruleAtomicType();

            state._fsp--;

             current =iv_ruleAtomicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicType7155); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicType"


    // $ANTLR start "ruleAtomicType"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3301:1: ruleAtomicType returns [EObject current=null] : ( (lv_type_0_0= RULE_ID ) ) ;
    public final EObject ruleAtomicType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3304:28: ( ( (lv_type_0_0= RULE_ID ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3305:1: ( (lv_type_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3305:1: ( (lv_type_0_0= RULE_ID ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3306:1: (lv_type_0_0= RULE_ID )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3306:1: (lv_type_0_0= RULE_ID )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3307:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicType7196); 

            			newLeafNode(lv_type_0_0, grammarAccess.getAtomicTypeAccess().getTypeIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicType"


    // $ANTLR start "entryRuleKindTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3331:1: entryRuleKindTest returns [EObject current=null] : iv_ruleKindTest= ruleKindTest EOF ;
    public final EObject entryRuleKindTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKindTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3332:2: (iv_ruleKindTest= ruleKindTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3333:2: iv_ruleKindTest= ruleKindTest EOF
            {
             newCompositeNode(grammarAccess.getKindTestRule()); 
            pushFollow(FOLLOW_ruleKindTest_in_entryRuleKindTest7236);
            iv_ruleKindTest=ruleKindTest();

            state._fsp--;

             current =iv_ruleKindTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKindTest7246); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKindTest"


    // $ANTLR start "ruleKindTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3340:1: ruleKindTest returns [EObject current=null] : ( ( (lv_docTest_0_0= ruleDocumentTest ) ) | ( (lv_elemTest_1_0= ruleElementTest ) ) | ( (lv_attributeTest_2_0= ruleAttributeTest ) ) | ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) ) | ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) ) | ( (lv_pitTest_5_0= rulePITest ) ) | ( (lv_commentTest_6_0= RULE_COMMENTTEST ) ) | ( (lv_textTest_7_0= RULE_TEXTTEST ) ) | ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) ) ) ;
    public final EObject ruleKindTest() throws RecognitionException {
        EObject current = null;

        Token lv_commentTest_6_0=null;
        Token lv_textTest_7_0=null;
        Token lv_anyKindTest_8_0=null;
        EObject lv_docTest_0_0 = null;

        EObject lv_elemTest_1_0 = null;

        EObject lv_attributeTest_2_0 = null;

        EObject lv_schemaElemTest_3_0 = null;

        EObject lv_schemaAttributeTest_4_0 = null;

        EObject lv_pitTest_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3343:28: ( ( ( (lv_docTest_0_0= ruleDocumentTest ) ) | ( (lv_elemTest_1_0= ruleElementTest ) ) | ( (lv_attributeTest_2_0= ruleAttributeTest ) ) | ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) ) | ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) ) | ( (lv_pitTest_5_0= rulePITest ) ) | ( (lv_commentTest_6_0= RULE_COMMENTTEST ) ) | ( (lv_textTest_7_0= RULE_TEXTTEST ) ) | ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3344:1: ( ( (lv_docTest_0_0= ruleDocumentTest ) ) | ( (lv_elemTest_1_0= ruleElementTest ) ) | ( (lv_attributeTest_2_0= ruleAttributeTest ) ) | ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) ) | ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) ) | ( (lv_pitTest_5_0= rulePITest ) ) | ( (lv_commentTest_6_0= RULE_COMMENTTEST ) ) | ( (lv_textTest_7_0= RULE_TEXTTEST ) ) | ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3344:1: ( ( (lv_docTest_0_0= ruleDocumentTest ) ) | ( (lv_elemTest_1_0= ruleElementTest ) ) | ( (lv_attributeTest_2_0= ruleAttributeTest ) ) | ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) ) | ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) ) | ( (lv_pitTest_5_0= rulePITest ) ) | ( (lv_commentTest_6_0= RULE_COMMENTTEST ) ) | ( (lv_textTest_7_0= RULE_TEXTTEST ) ) | ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) ) )
            int alt47=9;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt47=1;
                }
                break;
            case 72:
                {
                alt47=2;
                }
                break;
            case 58:
                {
                alt47=3;
                }
                break;
            case 73:
                {
                alt47=4;
                }
                break;
            case 71:
                {
                alt47=5;
                }
                break;
            case 70:
                {
                alt47=6;
                }
                break;
            case RULE_COMMENTTEST:
                {
                alt47=7;
                }
                break;
            case RULE_TEXTTEST:
                {
                alt47=8;
                }
                break;
            case RULE_ANYKINDTEST:
                {
                alt47=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3344:2: ( (lv_docTest_0_0= ruleDocumentTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3344:2: ( (lv_docTest_0_0= ruleDocumentTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3345:1: (lv_docTest_0_0= ruleDocumentTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3345:1: (lv_docTest_0_0= ruleDocumentTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3346:3: lv_docTest_0_0= ruleDocumentTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getDocTestDocumentTestParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocumentTest_in_ruleKindTest7292);
                    lv_docTest_0_0=ruleDocumentTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKindTestRule());
                    	        }
                           		set(
                           			current, 
                           			"docTest",
                            		lv_docTest_0_0, 
                            		"DocumentTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3363:6: ( (lv_elemTest_1_0= ruleElementTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3363:6: ( (lv_elemTest_1_0= ruleElementTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3364:1: (lv_elemTest_1_0= ruleElementTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3364:1: (lv_elemTest_1_0= ruleElementTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3365:3: lv_elemTest_1_0= ruleElementTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getElemTestElementTestParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementTest_in_ruleKindTest7319);
                    lv_elemTest_1_0=ruleElementTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKindTestRule());
                    	        }
                           		set(
                           			current, 
                           			"elemTest",
                            		lv_elemTest_1_0, 
                            		"ElementTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3382:6: ( (lv_attributeTest_2_0= ruleAttributeTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3382:6: ( (lv_attributeTest_2_0= ruleAttributeTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3383:1: (lv_attributeTest_2_0= ruleAttributeTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3383:1: (lv_attributeTest_2_0= ruleAttributeTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3384:3: lv_attributeTest_2_0= ruleAttributeTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getAttributeTestAttributeTestParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeTest_in_ruleKindTest7346);
                    lv_attributeTest_2_0=ruleAttributeTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKindTestRule());
                    	        }
                           		set(
                           			current, 
                           			"attributeTest",
                            		lv_attributeTest_2_0, 
                            		"AttributeTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3401:6: ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3401:6: ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3402:1: (lv_schemaElemTest_3_0= ruleSchemaElementTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3402:1: (lv_schemaElemTest_3_0= ruleSchemaElementTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3403:3: lv_schemaElemTest_3_0= ruleSchemaElementTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getSchemaElemTestSchemaElementTestParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSchemaElementTest_in_ruleKindTest7373);
                    lv_schemaElemTest_3_0=ruleSchemaElementTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKindTestRule());
                    	        }
                           		set(
                           			current, 
                           			"schemaElemTest",
                            		lv_schemaElemTest_3_0, 
                            		"SchemaElementTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3420:6: ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3420:6: ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3421:1: (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3421:1: (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3422:3: lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getSchemaAttributeTestSchemaAttributeTestParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSchemaAttributeTest_in_ruleKindTest7400);
                    lv_schemaAttributeTest_4_0=ruleSchemaAttributeTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKindTestRule());
                    	        }
                           		set(
                           			current, 
                           			"schemaAttributeTest",
                            		lv_schemaAttributeTest_4_0, 
                            		"SchemaAttributeTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3439:6: ( (lv_pitTest_5_0= rulePITest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3439:6: ( (lv_pitTest_5_0= rulePITest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3440:1: (lv_pitTest_5_0= rulePITest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3440:1: (lv_pitTest_5_0= rulePITest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3441:3: lv_pitTest_5_0= rulePITest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getPitTestPITestParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_rulePITest_in_ruleKindTest7427);
                    lv_pitTest_5_0=rulePITest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getKindTestRule());
                    	        }
                           		set(
                           			current, 
                           			"pitTest",
                            		lv_pitTest_5_0, 
                            		"PITest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3458:6: ( (lv_commentTest_6_0= RULE_COMMENTTEST ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3458:6: ( (lv_commentTest_6_0= RULE_COMMENTTEST ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3459:1: (lv_commentTest_6_0= RULE_COMMENTTEST )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3459:1: (lv_commentTest_6_0= RULE_COMMENTTEST )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3460:3: lv_commentTest_6_0= RULE_COMMENTTEST
                    {
                    lv_commentTest_6_0=(Token)match(input,RULE_COMMENTTEST,FOLLOW_RULE_COMMENTTEST_in_ruleKindTest7450); 

                    			newLeafNode(lv_commentTest_6_0, grammarAccess.getKindTestAccess().getCommentTestCOMMENTTESTTerminalRuleCall_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKindTestRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"commentTest",
                            		lv_commentTest_6_0, 
                            		"COMMENTTEST");
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3477:6: ( (lv_textTest_7_0= RULE_TEXTTEST ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3477:6: ( (lv_textTest_7_0= RULE_TEXTTEST ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3478:1: (lv_textTest_7_0= RULE_TEXTTEST )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3478:1: (lv_textTest_7_0= RULE_TEXTTEST )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3479:3: lv_textTest_7_0= RULE_TEXTTEST
                    {
                    lv_textTest_7_0=(Token)match(input,RULE_TEXTTEST,FOLLOW_RULE_TEXTTEST_in_ruleKindTest7478); 

                    			newLeafNode(lv_textTest_7_0, grammarAccess.getKindTestAccess().getTextTestTEXTTESTTerminalRuleCall_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKindTestRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"textTest",
                            		lv_textTest_7_0, 
                            		"TEXTTEST");
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3496:6: ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3496:6: ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3497:1: (lv_anyKindTest_8_0= RULE_ANYKINDTEST )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3497:1: (lv_anyKindTest_8_0= RULE_ANYKINDTEST )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3498:3: lv_anyKindTest_8_0= RULE_ANYKINDTEST
                    {
                    lv_anyKindTest_8_0=(Token)match(input,RULE_ANYKINDTEST,FOLLOW_RULE_ANYKINDTEST_in_ruleKindTest7506); 

                    			newLeafNode(lv_anyKindTest_8_0, grammarAccess.getKindTestAccess().getAnyKindTestANYKINDTESTTerminalRuleCall_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getKindTestRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"anyKindTest",
                            		lv_anyKindTest_8_0, 
                            		"ANYKINDTEST");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKindTest"


    // $ANTLR start "entryRuleDocumentTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3522:1: entryRuleDocumentTest returns [EObject current=null] : iv_ruleDocumentTest= ruleDocumentTest EOF ;
    public final EObject entryRuleDocumentTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3523:2: (iv_ruleDocumentTest= ruleDocumentTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3524:2: iv_ruleDocumentTest= ruleDocumentTest EOF
            {
             newCompositeNode(grammarAccess.getDocumentTestRule()); 
            pushFollow(FOLLOW_ruleDocumentTest_in_entryRuleDocumentTest7547);
            iv_ruleDocumentTest=ruleDocumentTest();

            state._fsp--;

             current =iv_ruleDocumentTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTest7557); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocumentTest"


    // $ANTLR start "ruleDocumentTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3531:1: ruleDocumentTest returns [EObject current=null] : ( () otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleDocumentTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_elemTest_3_0 = null;

        EObject lv_schemaElemTest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3534:28: ( ( () otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3535:1: ( () otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3535:1: ( () otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3535:2: () otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3535:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3536:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDocumentTestAccess().getDocumentTestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleDocumentTest7603); 

                	newLeafNode(otherlv_1, grammarAccess.getDocumentTestAccess().getDocumentNodeKeyword_1());
                
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleDocumentTest7615); 

                	newLeafNode(otherlv_2, grammarAccess.getDocumentTestAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3549:1: ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )?
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==72) ) {
                alt48=1;
            }
            else if ( (LA48_0==73) ) {
                alt48=2;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3549:2: ( (lv_elemTest_3_0= ruleElementTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3549:2: ( (lv_elemTest_3_0= ruleElementTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3550:1: (lv_elemTest_3_0= ruleElementTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3550:1: (lv_elemTest_3_0= ruleElementTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3551:3: lv_elemTest_3_0= ruleElementTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentTestAccess().getElemTestElementTestParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementTest_in_ruleDocumentTest7637);
                    lv_elemTest_3_0=ruleElementTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentTestRule());
                    	        }
                           		set(
                           			current, 
                           			"elemTest",
                            		lv_elemTest_3_0, 
                            		"ElementTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3568:6: ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3568:6: ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3569:1: (lv_schemaElemTest_4_0= ruleSchemaElementTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3569:1: (lv_schemaElemTest_4_0= ruleSchemaElementTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3570:3: lv_schemaElemTest_4_0= ruleSchemaElementTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentTestAccess().getSchemaElemTestSchemaElementTestParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSchemaElementTest_in_ruleDocumentTest7664);
                    lv_schemaElemTest_4_0=ruleSchemaElementTest();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDocumentTestRule());
                    	        }
                           		set(
                           			current, 
                           			"schemaElemTest",
                            		lv_schemaElemTest_4_0, 
                            		"SchemaElementTest");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleDocumentTest7678); 

                	newLeafNode(otherlv_5, grammarAccess.getDocumentTestAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDocumentTest"


    // $ANTLR start "entryRulePITest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3598:1: entryRulePITest returns [EObject current=null] : iv_rulePITest= rulePITest EOF ;
    public final EObject entryRulePITest() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePITest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3599:2: (iv_rulePITest= rulePITest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3600:2: iv_rulePITest= rulePITest EOF
            {
             newCompositeNode(grammarAccess.getPITestRule()); 
            pushFollow(FOLLOW_rulePITest_in_entryRulePITest7714);
            iv_rulePITest=rulePITest();

            state._fsp--;

             current =iv_rulePITest; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePITest7724); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePITest"


    // $ANTLR start "rulePITest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3607:1: rulePITest returns [EObject current=null] : ( () otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )? otherlv_5= ')' ) ;
    public final EObject rulePITest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_string_4_0=null;
        Token otherlv_5=null;
        EObject lv_ncName_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3610:28: ( ( () otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )? otherlv_5= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3611:1: ( () otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )? otherlv_5= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3611:1: ( () otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )? otherlv_5= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3611:2: () otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )? otherlv_5= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3611:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3612:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPITestAccess().getPITTestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_rulePITest7770); 

                	newLeafNode(otherlv_1, grammarAccess.getPITestAccess().getProcessingInstructionKeyword_1());
                
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_rulePITest7782); 

                	newLeafNode(otherlv_2, grammarAccess.getPITestAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3625:1: ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_STRINGLITERAL) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3625:2: ( (lv_ncName_3_0= ruleNCName ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3625:2: ( (lv_ncName_3_0= ruleNCName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3626:1: (lv_ncName_3_0= ruleNCName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3626:1: (lv_ncName_3_0= ruleNCName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3627:3: lv_ncName_3_0= ruleNCName
                    {
                     
                    	        newCompositeNode(grammarAccess.getPITestAccess().getNcNameNCNameParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNCName_in_rulePITest7804);
                    lv_ncName_3_0=ruleNCName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPITestRule());
                    	        }
                           		set(
                           			current, 
                           			"ncName",
                            		lv_ncName_3_0, 
                            		"NCName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3644:6: ( (lv_string_4_0= RULE_STRINGLITERAL ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3644:6: ( (lv_string_4_0= RULE_STRINGLITERAL ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3645:1: (lv_string_4_0= RULE_STRINGLITERAL )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3645:1: (lv_string_4_0= RULE_STRINGLITERAL )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3646:3: lv_string_4_0= RULE_STRINGLITERAL
                    {
                    lv_string_4_0=(Token)match(input,RULE_STRINGLITERAL,FOLLOW_RULE_STRINGLITERAL_in_rulePITest7827); 

                    			newLeafNode(lv_string_4_0, grammarAccess.getPITestAccess().getStringSTRINGLITERALTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPITestRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_4_0, 
                            		"STRINGLITERAL");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_rulePITest7846); 

                	newLeafNode(otherlv_5, grammarAccess.getPITestAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePITest"


    // $ANTLR start "entryRuleAttributeTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3674:1: entryRuleAttributeTest returns [EObject current=null] : iv_ruleAttributeTest= ruleAttributeTest EOF ;
    public final EObject entryRuleAttributeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3675:2: (iv_ruleAttributeTest= ruleAttributeTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3676:2: iv_ruleAttributeTest= ruleAttributeTest EOF
            {
             newCompositeNode(grammarAccess.getAttributeTestRule()); 
            pushFollow(FOLLOW_ruleAttributeTest_in_entryRuleAttributeTest7882);
            iv_ruleAttributeTest=ruleAttributeTest();

            state._fsp--;

             current =iv_ruleAttributeTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeTest7892); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeTest"


    // $ANTLR start "ruleAttributeTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3683:1: ruleAttributeTest returns [EObject current=null] : ( () otherlv_1= 'attribute' otherlv_2= '(' ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' ) ;
    public final EObject ruleAttributeTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attrOrWild_3_0 = null;

        EObject lv_typeName_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3686:28: ( ( () otherlv_1= 'attribute' otherlv_2= '(' ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3687:1: ( () otherlv_1= 'attribute' otherlv_2= '(' ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3687:1: ( () otherlv_1= 'attribute' otherlv_2= '(' ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3687:2: () otherlv_1= 'attribute' otherlv_2= '(' ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3687:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3688:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeTestAccess().getAttributeTestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleAttributeTest7938); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeTestAccess().getAttributeKeyword_1());
                
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleAttributeTest7950); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeTestAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3701:1: ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID||LA51_0==39) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3701:2: ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )?
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3701:2: ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3702:1: (lv_attrOrWild_3_0= ruleAttribNameOrWildcard )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3702:1: (lv_attrOrWild_3_0= ruleAttribNameOrWildcard )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3703:3: lv_attrOrWild_3_0= ruleAttribNameOrWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeTestAccess().getAttrOrWildAttribNameOrWildcardParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribNameOrWildcard_in_ruleAttributeTest7972);
                    lv_attrOrWild_3_0=ruleAttribNameOrWildcard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeTestRule());
                    	        }
                           		set(
                           			current, 
                           			"attrOrWild",
                            		lv_attrOrWild_3_0, 
                            		"AttribNameOrWildcard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3719:2: (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==21) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3719:4: otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) )
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleAttributeTest7985); 

                                	newLeafNode(otherlv_4, grammarAccess.getAttributeTestAccess().getCommaKeyword_3_1_0());
                                
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3723:1: ( (lv_typeName_5_0= ruleTypeName ) )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3724:1: (lv_typeName_5_0= ruleTypeName )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3724:1: (lv_typeName_5_0= ruleTypeName )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3725:3: lv_typeName_5_0= ruleTypeName
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeTestAccess().getTypeNameTypeNameParserRuleCall_3_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeName_in_ruleAttributeTest8006);
                            lv_typeName_5_0=ruleTypeName();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeTestRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"typeName",
                                    		lv_typeName_5_0, 
                                    		"TypeName");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleAttributeTest8022); 

                	newLeafNode(otherlv_6, grammarAccess.getAttributeTestAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeTest"


    // $ANTLR start "entryRuleAttribNameOrWildcard"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3753:1: entryRuleAttribNameOrWildcard returns [EObject current=null] : iv_ruleAttribNameOrWildcard= ruleAttribNameOrWildcard EOF ;
    public final EObject entryRuleAttribNameOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribNameOrWildcard = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3754:2: (iv_ruleAttribNameOrWildcard= ruleAttribNameOrWildcard EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3755:2: iv_ruleAttribNameOrWildcard= ruleAttribNameOrWildcard EOF
            {
             newCompositeNode(grammarAccess.getAttribNameOrWildcardRule()); 
            pushFollow(FOLLOW_ruleAttribNameOrWildcard_in_entryRuleAttribNameOrWildcard8058);
            iv_ruleAttribNameOrWildcard=ruleAttribNameOrWildcard();

            state._fsp--;

             current =iv_ruleAttribNameOrWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribNameOrWildcard8068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribNameOrWildcard"


    // $ANTLR start "ruleAttribNameOrWildcard"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3762:1: ruleAttribNameOrWildcard returns [EObject current=null] : ( ( (lv_attName_0_0= ruleAttributeName ) ) | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleAttribNameOrWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_attName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3765:28: ( ( ( (lv_attName_0_0= ruleAttributeName ) ) | ( () otherlv_2= '*' ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3766:1: ( ( (lv_attName_0_0= ruleAttributeName ) ) | ( () otherlv_2= '*' ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3766:1: ( ( (lv_attName_0_0= ruleAttributeName ) ) | ( () otherlv_2= '*' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            else if ( (LA52_0==39) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3766:2: ( (lv_attName_0_0= ruleAttributeName ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3766:2: ( (lv_attName_0_0= ruleAttributeName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3767:1: (lv_attName_0_0= ruleAttributeName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3767:1: (lv_attName_0_0= ruleAttributeName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3768:3: lv_attName_0_0= ruleAttributeName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttribNameOrWildcardAccess().getAttNameAttributeNameParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeName_in_ruleAttribNameOrWildcard8114);
                    lv_attName_0_0=ruleAttributeName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttribNameOrWildcardRule());
                    	        }
                           		set(
                           			current, 
                           			"attName",
                            		lv_attName_0_0, 
                            		"AttributeName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3785:6: ( () otherlv_2= '*' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3785:6: ( () otherlv_2= '*' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3785:7: () otherlv_2= '*'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3785:7: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3786:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAttribNameOrWildcardAccess().getAttribNameOrWildcardAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleAttribNameOrWildcard8142); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttribNameOrWildcardAccess().getAsteriskKeyword_1_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribNameOrWildcard"


    // $ANTLR start "entryRuleSchemaAttributeTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3803:1: entryRuleSchemaAttributeTest returns [EObject current=null] : iv_ruleSchemaAttributeTest= ruleSchemaAttributeTest EOF ;
    public final EObject entryRuleSchemaAttributeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaAttributeTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3804:2: (iv_ruleSchemaAttributeTest= ruleSchemaAttributeTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3805:2: iv_ruleSchemaAttributeTest= ruleSchemaAttributeTest EOF
            {
             newCompositeNode(grammarAccess.getSchemaAttributeTestRule()); 
            pushFollow(FOLLOW_ruleSchemaAttributeTest_in_entryRuleSchemaAttributeTest8179);
            iv_ruleSchemaAttributeTest=ruleSchemaAttributeTest();

            state._fsp--;

             current =iv_ruleSchemaAttributeTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemaAttributeTest8189); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemaAttributeTest"


    // $ANTLR start "ruleSchemaAttributeTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3812:1: ruleSchemaAttributeTest returns [EObject current=null] : (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attDec_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' ) ;
    public final EObject ruleSchemaAttributeTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attDec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3815:28: ( (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attDec_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3816:1: (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attDec_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3816:1: (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attDec_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3816:3: otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attDec_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleSchemaAttributeTest8226); 

                	newLeafNode(otherlv_0, grammarAccess.getSchemaAttributeTestAccess().getSchemaAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleSchemaAttributeTest8238); 

                	newLeafNode(otherlv_1, grammarAccess.getSchemaAttributeTestAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3824:1: ( (lv_attDec_2_0= ruleAttributeDeclaration ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3825:1: (lv_attDec_2_0= ruleAttributeDeclaration )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3825:1: (lv_attDec_2_0= ruleAttributeDeclaration )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3826:3: lv_attDec_2_0= ruleAttributeDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getSchemaAttributeTestAccess().getAttDecAttributeDeclarationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeDeclaration_in_ruleSchemaAttributeTest8259);
            lv_attDec_2_0=ruleAttributeDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSchemaAttributeTestRule());
            	        }
                   		set(
                   			current, 
                   			"attDec",
                    		lv_attDec_2_0, 
                    		"AttributeDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleSchemaAttributeTest8271); 

                	newLeafNode(otherlv_3, grammarAccess.getSchemaAttributeTestAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaAttributeTest"


    // $ANTLR start "entryRuleAttributeDeclaration"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3854:1: entryRuleAttributeDeclaration returns [EObject current=null] : iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF ;
    public final EObject entryRuleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDeclaration = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3855:2: (iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3856:2: iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAttributeDeclarationRule()); 
            pushFollow(FOLLOW_ruleAttributeDeclaration_in_entryRuleAttributeDeclaration8307);
            iv_ruleAttributeDeclaration=ruleAttributeDeclaration();

            state._fsp--;

             current =iv_ruleAttributeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDeclaration8317); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeDeclaration"


    // $ANTLR start "ruleAttributeDeclaration"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3863:1: ruleAttributeDeclaration returns [EObject current=null] : ( (lv_attName_0_0= ruleAttributeName ) ) ;
    public final EObject ruleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_attName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3866:28: ( ( (lv_attName_0_0= ruleAttributeName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3867:1: ( (lv_attName_0_0= ruleAttributeName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3867:1: ( (lv_attName_0_0= ruleAttributeName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3868:1: (lv_attName_0_0= ruleAttributeName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3868:1: (lv_attName_0_0= ruleAttributeName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3869:3: lv_attName_0_0= ruleAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeDeclarationAccess().getAttNameAttributeNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeName_in_ruleAttributeDeclaration8362);
            lv_attName_0_0=ruleAttributeName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"attName",
                    		lv_attName_0_0, 
                    		"AttributeName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeDeclaration"


    // $ANTLR start "entryRuleElementTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3893:1: entryRuleElementTest returns [EObject current=null] : iv_ruleElementTest= ruleElementTest EOF ;
    public final EObject entryRuleElementTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3894:2: (iv_ruleElementTest= ruleElementTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3895:2: iv_ruleElementTest= ruleElementTest EOF
            {
             newCompositeNode(grammarAccess.getElementTestRule()); 
            pushFollow(FOLLOW_ruleElementTest_in_entryRuleElementTest8397);
            iv_ruleElementTest=ruleElementTest();

            state._fsp--;

             current =iv_ruleElementTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementTest8407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementTest"


    // $ANTLR start "ruleElementTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3902:1: ruleElementTest returns [EObject current=null] : ( () otherlv_1= 'element' otherlv_2= '(' ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )? otherlv_7= ')' ) ;
    public final EObject ruleElementTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_elemOrWild_3_0 = null;

        EObject lv_typeName_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3905:28: ( ( () otherlv_1= 'element' otherlv_2= '(' ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )? otherlv_7= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3906:1: ( () otherlv_1= 'element' otherlv_2= '(' ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )? otherlv_7= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3906:1: ( () otherlv_1= 'element' otherlv_2= '(' ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )? otherlv_7= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3906:2: () otherlv_1= 'element' otherlv_2= '(' ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )? otherlv_7= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3906:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3907:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElementTestAccess().getElementTestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleElementTest8453); 

                	newLeafNode(otherlv_1, grammarAccess.getElementTestAccess().getElementKeyword_1());
                
            otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleElementTest8465); 

                	newLeafNode(otherlv_2, grammarAccess.getElementTestAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3920:1: ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||LA55_0==39) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3920:2: ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )?
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3920:2: ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3921:1: (lv_elemOrWild_3_0= ruleElementNameOrWildcard )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3921:1: (lv_elemOrWild_3_0= ruleElementNameOrWildcard )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3922:3: lv_elemOrWild_3_0= ruleElementNameOrWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementTestAccess().getElemOrWildElementNameOrWildcardParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementNameOrWildcard_in_ruleElementTest8487);
                    lv_elemOrWild_3_0=ruleElementNameOrWildcard();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementTestRule());
                    	        }
                           		set(
                           			current, 
                           			"elemOrWild",
                            		lv_elemOrWild_3_0, 
                            		"ElementNameOrWildcard");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3938:2: (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==21) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3938:4: otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )?
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleElementTest8500); 

                                	newLeafNode(otherlv_4, grammarAccess.getElementTestAccess().getCommaKeyword_3_1_0());
                                
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3942:1: ( (lv_typeName_5_0= ruleTypeName ) )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3943:1: (lv_typeName_5_0= ruleTypeName )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3943:1: (lv_typeName_5_0= ruleTypeName )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3944:3: lv_typeName_5_0= ruleTypeName
                            {
                             
                            	        newCompositeNode(grammarAccess.getElementTestAccess().getTypeNameTypeNameParserRuleCall_3_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeName_in_ruleElementTest8521);
                            lv_typeName_5_0=ruleTypeName();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getElementTestRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"typeName",
                                    		lv_typeName_5_0, 
                                    		"TypeName");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3960:2: (otherlv_6= '?' )?
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==68) ) {
                                alt53=1;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3960:4: otherlv_6= '?'
                                    {
                                    otherlv_6=(Token)match(input,68,FOLLOW_68_in_ruleElementTest8534); 

                                        	newLeafNode(otherlv_6, grammarAccess.getElementTestAccess().getQuestionMarkKeyword_3_1_2());
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleElementTest8552); 

                	newLeafNode(otherlv_7, grammarAccess.getElementTestAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementTest"


    // $ANTLR start "entryRuleElementNameOrWildcard"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3976:1: entryRuleElementNameOrWildcard returns [EObject current=null] : iv_ruleElementNameOrWildcard= ruleElementNameOrWildcard EOF ;
    public final EObject entryRuleElementNameOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementNameOrWildcard = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3977:2: (iv_ruleElementNameOrWildcard= ruleElementNameOrWildcard EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3978:2: iv_ruleElementNameOrWildcard= ruleElementNameOrWildcard EOF
            {
             newCompositeNode(grammarAccess.getElementNameOrWildcardRule()); 
            pushFollow(FOLLOW_ruleElementNameOrWildcard_in_entryRuleElementNameOrWildcard8588);
            iv_ruleElementNameOrWildcard=ruleElementNameOrWildcard();

            state._fsp--;

             current =iv_ruleElementNameOrWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementNameOrWildcard8598); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementNameOrWildcard"


    // $ANTLR start "ruleElementNameOrWildcard"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3985:1: ruleElementNameOrWildcard returns [EObject current=null] : ( ( (lv_elemName_0_0= ruleElementName ) ) | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleElementNameOrWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_elemName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3988:28: ( ( ( (lv_elemName_0_0= ruleElementName ) ) | ( () otherlv_2= '*' ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3989:1: ( ( (lv_elemName_0_0= ruleElementName ) ) | ( () otherlv_2= '*' ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3989:1: ( ( (lv_elemName_0_0= ruleElementName ) ) | ( () otherlv_2= '*' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( (LA56_0==39) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3989:2: ( (lv_elemName_0_0= ruleElementName ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3989:2: ( (lv_elemName_0_0= ruleElementName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3990:1: (lv_elemName_0_0= ruleElementName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3990:1: (lv_elemName_0_0= ruleElementName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3991:3: lv_elemName_0_0= ruleElementName
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementNameOrWildcardAccess().getElemNameElementNameParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementName_in_ruleElementNameOrWildcard8644);
                    lv_elemName_0_0=ruleElementName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementNameOrWildcardRule());
                    	        }
                           		set(
                           			current, 
                           			"elemName",
                            		lv_elemName_0_0, 
                            		"ElementName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4008:6: ( () otherlv_2= '*' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4008:6: ( () otherlv_2= '*' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4008:7: () otherlv_2= '*'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4008:7: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4009:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getElementNameOrWildcardAccess().getElementNameOrWildcardAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleElementNameOrWildcard8672); 

                        	newLeafNode(otherlv_2, grammarAccess.getElementNameOrWildcardAccess().getAsteriskKeyword_1_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementNameOrWildcard"


    // $ANTLR start "entryRuleSchemaElementTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4026:1: entryRuleSchemaElementTest returns [EObject current=null] : iv_ruleSchemaElementTest= ruleSchemaElementTest EOF ;
    public final EObject entryRuleSchemaElementTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaElementTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4027:2: (iv_ruleSchemaElementTest= ruleSchemaElementTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4028:2: iv_ruleSchemaElementTest= ruleSchemaElementTest EOF
            {
             newCompositeNode(grammarAccess.getSchemaElementTestRule()); 
            pushFollow(FOLLOW_ruleSchemaElementTest_in_entryRuleSchemaElementTest8709);
            iv_ruleSchemaElementTest=ruleSchemaElementTest();

            state._fsp--;

             current =iv_ruleSchemaElementTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemaElementTest8719); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchemaElementTest"


    // $ANTLR start "ruleSchemaElementTest"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4035:1: ruleSchemaElementTest returns [EObject current=null] : (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elemDec_2_0= ruleElementDeclaration ) ) otherlv_3= ')' ) ;
    public final EObject ruleSchemaElementTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elemDec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4038:28: ( (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elemDec_2_0= ruleElementDeclaration ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4039:1: (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elemDec_2_0= ruleElementDeclaration ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4039:1: (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elemDec_2_0= ruleElementDeclaration ) ) otherlv_3= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4039:3: otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elemDec_2_0= ruleElementDeclaration ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleSchemaElementTest8756); 

                	newLeafNode(otherlv_0, grammarAccess.getSchemaElementTestAccess().getSchemaElementKeyword_0());
                
            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleSchemaElementTest8768); 

                	newLeafNode(otherlv_1, grammarAccess.getSchemaElementTestAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4047:1: ( (lv_elemDec_2_0= ruleElementDeclaration ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4048:1: (lv_elemDec_2_0= ruleElementDeclaration )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4048:1: (lv_elemDec_2_0= ruleElementDeclaration )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4049:3: lv_elemDec_2_0= ruleElementDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getSchemaElementTestAccess().getElemDecElementDeclarationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleElementDeclaration_in_ruleSchemaElementTest8789);
            lv_elemDec_2_0=ruleElementDeclaration();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSchemaElementTestRule());
            	        }
                   		set(
                   			current, 
                   			"elemDec",
                    		lv_elemDec_2_0, 
                    		"ElementDeclaration");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_ruleSchemaElementTest8801); 

                	newLeafNode(otherlv_3, grammarAccess.getSchemaElementTestAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchemaElementTest"


    // $ANTLR start "entryRuleElementDeclaration"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4077:1: entryRuleElementDeclaration returns [EObject current=null] : iv_ruleElementDeclaration= ruleElementDeclaration EOF ;
    public final EObject entryRuleElementDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDeclaration = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4078:2: (iv_ruleElementDeclaration= ruleElementDeclaration EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4079:2: iv_ruleElementDeclaration= ruleElementDeclaration EOF
            {
             newCompositeNode(grammarAccess.getElementDeclarationRule()); 
            pushFollow(FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration8837);
            iv_ruleElementDeclaration=ruleElementDeclaration();

            state._fsp--;

             current =iv_ruleElementDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDeclaration8847); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementDeclaration"


    // $ANTLR start "ruleElementDeclaration"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4086:1: ruleElementDeclaration returns [EObject current=null] : this_ElementName_0= ruleElementName ;
    public final EObject ruleElementDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ElementName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4089:28: (this_ElementName_0= ruleElementName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4091:5: this_ElementName_0= ruleElementName
            {
             
                    newCompositeNode(grammarAccess.getElementDeclarationAccess().getElementNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleElementName_in_ruleElementDeclaration8893);
            this_ElementName_0=ruleElementName();

            state._fsp--;

             
                    current = this_ElementName_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementDeclaration"


    // $ANTLR start "entryRuleAttributeName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4107:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4108:2: (iv_ruleAttributeName= ruleAttributeName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4109:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName8927);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName8937); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeName"


    // $ANTLR start "ruleAttributeName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4116:1: ruleAttributeName returns [EObject current=null] : ( (lv_qName_0_0= ruleQName ) ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject lv_qName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4119:28: ( ( (lv_qName_0_0= ruleQName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4120:1: ( (lv_qName_0_0= ruleQName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4120:1: ( (lv_qName_0_0= ruleQName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4121:1: (lv_qName_0_0= ruleQName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4121:1: (lv_qName_0_0= ruleQName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4122:3: lv_qName_0_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeNameAccess().getQNameQNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleAttributeName8982);
            lv_qName_0_0=ruleQName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeNameRule());
            	        }
                   		set(
                   			current, 
                   			"qName",
                    		lv_qName_0_0, 
                    		"QName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeName"


    // $ANTLR start "entryRuleElementName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4146:1: entryRuleElementName returns [EObject current=null] : iv_ruleElementName= ruleElementName EOF ;
    public final EObject entryRuleElementName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4147:2: (iv_ruleElementName= ruleElementName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4148:2: iv_ruleElementName= ruleElementName EOF
            {
             newCompositeNode(grammarAccess.getElementNameRule()); 
            pushFollow(FOLLOW_ruleElementName_in_entryRuleElementName9017);
            iv_ruleElementName=ruleElementName();

            state._fsp--;

             current =iv_ruleElementName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementName9027); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementName"


    // $ANTLR start "ruleElementName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4155:1: ruleElementName returns [EObject current=null] : ( (lv_qName_0_0= ruleQName ) ) ;
    public final EObject ruleElementName() throws RecognitionException {
        EObject current = null;

        EObject lv_qName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4158:28: ( ( (lv_qName_0_0= ruleQName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4159:1: ( (lv_qName_0_0= ruleQName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4159:1: ( (lv_qName_0_0= ruleQName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4160:1: (lv_qName_0_0= ruleQName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4160:1: (lv_qName_0_0= ruleQName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4161:3: lv_qName_0_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getElementNameAccess().getQNameQNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleElementName9072);
            lv_qName_0_0=ruleQName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementNameRule());
            	        }
                   		set(
                   			current, 
                   			"qName",
                    		lv_qName_0_0, 
                    		"QName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementName"


    // $ANTLR start "entryRuleTypeName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4185:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4186:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4187:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName9107);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName9117); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4194:1: ruleTypeName returns [EObject current=null] : ( (lv_qName_0_0= ruleQName ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        EObject lv_qName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4197:28: ( ( (lv_qName_0_0= ruleQName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4198:1: ( (lv_qName_0_0= ruleQName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4198:1: ( (lv_qName_0_0= ruleQName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4199:1: (lv_qName_0_0= ruleQName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4199:1: (lv_qName_0_0= ruleQName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4200:3: lv_qName_0_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getTypeNameAccess().getQNameQNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleTypeName9162);
            lv_qName_0_0=ruleQName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeNameRule());
            	        }
                   		set(
                   			current, 
                   			"qName",
                    		lv_qName_0_0, 
                    		"QName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleNCName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4224:1: entryRuleNCName returns [EObject current=null] : iv_ruleNCName= ruleNCName EOF ;
    public final EObject entryRuleNCName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNCName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4225:2: (iv_ruleNCName= ruleNCName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4226:2: iv_ruleNCName= ruleNCName EOF
            {
             newCompositeNode(grammarAccess.getNCNameRule()); 
            pushFollow(FOLLOW_ruleNCName_in_entryRuleNCName9197);
            iv_ruleNCName=ruleNCName();

            state._fsp--;

             current =iv_ruleNCName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNCName9207); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNCName"


    // $ANTLR start "ruleNCName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4233:1: ruleNCName returns [EObject current=null] : ( (lv_ncName_0_0= RULE_ID ) ) ;
    public final EObject ruleNCName() throws RecognitionException {
        EObject current = null;

        Token lv_ncName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4236:28: ( ( (lv_ncName_0_0= RULE_ID ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4237:1: ( (lv_ncName_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4237:1: ( (lv_ncName_0_0= RULE_ID ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4238:1: (lv_ncName_0_0= RULE_ID )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4238:1: (lv_ncName_0_0= RULE_ID )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4239:3: lv_ncName_0_0= RULE_ID
            {
            lv_ncName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNCName9248); 

            			newLeafNode(lv_ncName_0_0, grammarAccess.getNCNameAccess().getNcNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNCNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ncName",
                    		lv_ncName_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNCName"


    // $ANTLR start "entryRuleQName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4263:1: entryRuleQName returns [EObject current=null] : iv_ruleQName= ruleQName EOF ;
    public final EObject entryRuleQName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4264:2: (iv_ruleQName= ruleQName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4265:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName9288);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName9298); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQName"


    // $ANTLR start "ruleQName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4272:1: ruleQName returns [EObject current=null] : (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName ) ;
    public final EObject ruleQName() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedName_0 = null;

        EObject this_UnprefixedName_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4275:28: ( (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4276:1: (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4276:1: (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==65) ) {
                    alt57=1;
                }
                else if ( (LA57_1==EOF||(LA57_1>=RULE_VALUECOMP && LA57_1<=RULE_NODECOMP)||(LA57_1>=21 && LA57_1<=22)||LA57_1==25||LA57_1==28||(LA57_1>=30 && LA57_1<=31)||(LA57_1>=33 && LA57_1<=47)||LA57_1==49||(LA57_1>=51 && LA57_1<=54)||(LA57_1>=66 && LA57_1<=68)) ) {
                    alt57=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4277:5: this_PrefixedName_0= rulePrefixedName
                    {
                     
                            newCompositeNode(grammarAccess.getQNameAccess().getPrefixedNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrefixedName_in_ruleQName9345);
                    this_PrefixedName_0=rulePrefixedName();

                    state._fsp--;

                     
                            current = this_PrefixedName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4287:5: this_UnprefixedName_1= ruleUnprefixedName
                    {
                     
                            newCompositeNode(grammarAccess.getQNameAccess().getUnprefixedNameParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnprefixedName_in_ruleQName9372);
                    this_UnprefixedName_1=ruleUnprefixedName();

                    state._fsp--;

                     
                            current = this_UnprefixedName_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQName"


    // $ANTLR start "entryRulePrefixedName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4303:1: entryRulePrefixedName returns [EObject current=null] : iv_rulePrefixedName= rulePrefixedName EOF ;
    public final EObject entryRulePrefixedName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4304:2: (iv_rulePrefixedName= rulePrefixedName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4305:2: iv_rulePrefixedName= rulePrefixedName EOF
            {
             newCompositeNode(grammarAccess.getPrefixedNameRule()); 
            pushFollow(FOLLOW_rulePrefixedName_in_entryRulePrefixedName9407);
            iv_rulePrefixedName=rulePrefixedName();

            state._fsp--;

             current =iv_rulePrefixedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixedName9417); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefixedName"


    // $ANTLR start "rulePrefixedName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4312:1: rulePrefixedName returns [EObject current=null] : ( ( (lv_prefix_0_0= ruleNCName ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleNCName ) ) ) ;
    public final EObject rulePrefixedName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_prefix_0_0 = null;

        EObject lv_localPart_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4315:28: ( ( ( (lv_prefix_0_0= ruleNCName ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleNCName ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4316:1: ( ( (lv_prefix_0_0= ruleNCName ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleNCName ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4316:1: ( ( (lv_prefix_0_0= ruleNCName ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleNCName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4316:2: ( (lv_prefix_0_0= ruleNCName ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleNCName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4316:2: ( (lv_prefix_0_0= ruleNCName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4317:1: (lv_prefix_0_0= ruleNCName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4317:1: (lv_prefix_0_0= ruleNCName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4318:3: lv_prefix_0_0= ruleNCName
            {
             
            	        newCompositeNode(grammarAccess.getPrefixedNameAccess().getPrefixNCNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNCName_in_rulePrefixedName9463);
            lv_prefix_0_0=ruleNCName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrefixedNameRule());
            	        }
                   		set(
                   			current, 
                   			"prefix",
                    		lv_prefix_0_0, 
                    		"NCName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_rulePrefixedName9475); 

                	newLeafNode(otherlv_1, grammarAccess.getPrefixedNameAccess().getColonKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4338:1: ( (lv_localPart_2_0= ruleNCName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4339:1: (lv_localPart_2_0= ruleNCName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4339:1: (lv_localPart_2_0= ruleNCName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4340:3: lv_localPart_2_0= ruleNCName
            {
             
            	        newCompositeNode(grammarAccess.getPrefixedNameAccess().getLocalPartNCNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNCName_in_rulePrefixedName9496);
            lv_localPart_2_0=ruleNCName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPrefixedNameRule());
            	        }
                   		set(
                   			current, 
                   			"localPart",
                    		lv_localPart_2_0, 
                    		"NCName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefixedName"


    // $ANTLR start "entryRuleUnprefixedName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4364:1: entryRuleUnprefixedName returns [EObject current=null] : iv_ruleUnprefixedName= ruleUnprefixedName EOF ;
    public final EObject entryRuleUnprefixedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnprefixedName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4365:2: (iv_ruleUnprefixedName= ruleUnprefixedName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4366:2: iv_ruleUnprefixedName= ruleUnprefixedName EOF
            {
             newCompositeNode(grammarAccess.getUnprefixedNameRule()); 
            pushFollow(FOLLOW_ruleUnprefixedName_in_entryRuleUnprefixedName9532);
            iv_ruleUnprefixedName=ruleUnprefixedName();

            state._fsp--;

             current =iv_ruleUnprefixedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnprefixedName9542); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnprefixedName"


    // $ANTLR start "ruleUnprefixedName"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4373:1: ruleUnprefixedName returns [EObject current=null] : ( (lv_localPart_0_0= ruleNCName ) ) ;
    public final EObject ruleUnprefixedName() throws RecognitionException {
        EObject current = null;

        EObject lv_localPart_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4376:28: ( ( (lv_localPart_0_0= ruleNCName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4377:1: ( (lv_localPart_0_0= ruleNCName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4377:1: ( (lv_localPart_0_0= ruleNCName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4378:1: (lv_localPart_0_0= ruleNCName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4378:1: (lv_localPart_0_0= ruleNCName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4379:3: lv_localPart_0_0= ruleNCName
            {
             
            	        newCompositeNode(grammarAccess.getUnprefixedNameAccess().getLocalPartNCNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNCName_in_ruleUnprefixedName9587);
            lv_localPart_0_0=ruleNCName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnprefixedNameRule());
            	        }
                   		set(
                   			current, 
                   			"localPart",
                    		lv_localPart_0_0, 
                    		"NCName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnprefixedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleExpr131 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleExpr144 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleExpr165 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleExprSingle_in_entryRuleExprSingle203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSingle213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForExpr_in_ruleExprSingle260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedExpr_in_ruleExprSingle287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpr_in_ruleExprSingle314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleExprSingle341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForExpr_in_entryRuleForExpr376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForExpr386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleForClause_in_ruleForExpr432 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleForExpr444 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleForExpr465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleForClause_in_entryRuleSimpleForClause501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleForClause511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSimpleForClause548 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSimpleForClause560 = new BitSet(new long[]{0x0000000041013E00L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleSimpleForClause581 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSimpleForClause593 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleSimpleForClause614 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAdditionalIn_in_ruleSimpleForClause635 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAdditionalIn_in_entryRuleAdditionalIn672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionalIn682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAdditionalIn719 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAdditionalIn731 = new BitSet(new long[]{0x0000000041013E00L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleAdditionalIn752 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAdditionalIn764 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleAdditionalIn785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedExpr_in_entryRuleQuantifiedExpr821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedExpr831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleQuantifiedExpr869 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27_in_ruleQuantifiedExpr887 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQuantifiedExpr900 = new BitSet(new long[]{0x0000000041013E00L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleQuantifiedExpr921 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleQuantifiedExpr933 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr954 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_ruleAdditionalIn_in_ruleQuantifiedExpr975 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_28_in_ruleQuantifiedExpr988 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpr_in_entryRuleIfExpr1045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpr1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleIfExpr1092 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleIfExpr1104 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIfExpr1125 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleIfExpr1137 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleIfExpr1149 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleIfExpr1170 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleIfExpr1182 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleIfExpr1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr1239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr1295 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleOrExpr1308 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr1329 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr1367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpr_in_ruleAndExpr1423 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleAndExpr1436 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleComparisonExpr_in_ruleAndExpr1457 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr1495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpr1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeExpr_in_ruleComparisonExpr1551 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_RULE_VALUECOMP_in_ruleComparisonExpr1570 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_RULE_GENERALCOMP_in_ruleComparisonExpr1598 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_RULE_NODECOMP_in_ruleComparisonExpr1626 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleRangeExpr_in_ruleComparisonExpr1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeExpr_in_entryRuleRangeExpr1691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeExpr1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr1747 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleRangeExpr1760 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpr_in_entryRuleAdditiveExpr1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpr1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr1875 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleAdditiveExpr1889 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_38_in_ruleAdditiveExpr1907 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr1929 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpr_in_entryRuleMultiplicativeExpr1967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpr1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr2023 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_39_in_ruleMultiplicativeExpr2037 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_40_in_ruleMultiplicativeExpr2055 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_41_in_ruleMultiplicativeExpr2073 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_42_in_ruleMultiplicativeExpr2091 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr2113 = new BitSet(new long[]{0x0000078000000002L});
    public static final BitSet FOLLOW_ruleUnionExpr_in_entryRuleUnionExpr2151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionExpr2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr2207 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleUnionExpr2221 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_44_in_ruleUnionExpr2239 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr2261 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleIntersectExceptExpr_in_entryRuleIntersectExceptExpr2299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntersectExceptExpr2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr2355 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_45_in_ruleIntersectExceptExpr2369 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_46_in_ruleIntersectExceptExpr2387 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr2409 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleInstanceofExpr_in_entryRuleInstanceofExpr2447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceofExpr2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatExpr_in_ruleInstanceofExpr2503 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_ruleInstanceofExpr2516 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleInstanceofExpr2528 = new BitSet(new long[]{0x04000000000FC000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_ruleSequenceType_in_ruleInstanceofExpr2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatExpr_in_entryRuleTreatExpr2587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreatExpr2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastableExpr_in_ruleTreatExpr2643 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleTreatExpr2656 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleTreatExpr2668 = new BitSet(new long[]{0x04000000000FC000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_ruleSequenceType_in_ruleTreatExpr2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastableExpr_in_entryRuleCastableExpr2727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastableExpr2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastExpr_in_ruleCastableExpr2783 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCastableExpr2796 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleCastableExpr2808 = new BitSet(new long[]{0x04000000000FC000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_ruleSingleType_in_ruleCastableExpr2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastExpr_in_entryRuleCastExpr2867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastExpr2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleCastExpr2923 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCastExpr2936 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleCastExpr2948 = new BitSet(new long[]{0x04000000000FC000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_ruleSingleType_in_ruleCastExpr2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr3007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleUnaryExpr3055 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_37_in_ruleUnaryExpr3073 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleValueExpr_in_ruleUnaryExpr3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpr_in_entryRuleValueExpr3132 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpr3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleValueExpr3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr3222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePathExpr3270 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_rulePathExpr3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rulePathExpr3320 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_rulePathExpr3342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_rulePathExpr3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_entryRuleRelativePathExpr3425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativePathExpr3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepExpr_in_ruleRelativePathExpr3481 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleExtraStepExpr_in_ruleRelativePathExpr3502 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleExtraStepExpr_in_entryRuleExtraStepExpr3539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtraStepExpr3549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExtraStepExpr3587 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleStepExpr_in_ruleExtraStepExpr3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleExtraStepExpr3637 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleStepExpr_in_ruleExtraStepExpr3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepExpr_in_entryRuleStepExpr3704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepExpr3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpr_in_ruleStepExpr3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxisStep_in_ruleStepExpr3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxisStep_in_entryRuleAxisStep3823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAxisStep3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReverseStep_in_ruleAxisStep3880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleForwardStep_in_ruleAxisStep3907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulePredicateList_in_ruleAxisStep3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardStep_in_entryRuleForwardStep3965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForwardStep3975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardAxis_in_ruleForwardStep4022 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleNodeTest_in_ruleForwardStep4043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbbrevForwardStep_in_ruleForwardStep4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardAxis_in_entryRuleForwardAxis4107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForwardAxis4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleForwardAxis4161 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleForwardAxis4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleForwardAxis4212 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleForwardAxis4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleForwardAxis4263 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleForwardAxis4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleForwardAxis4314 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleForwardAxis4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleForwardAxis4365 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleForwardAxis4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleForwardAxis4416 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleForwardAxis4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleForwardAxis4467 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleForwardAxis4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleForwardAxis4518 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleForwardAxis4543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbbrevForwardStep_in_entryRuleAbbrevForwardStep4580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbbrevForwardStep4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAbbrevForwardStep4628 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleNodeTest_in_ruleAbbrevForwardStep4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTest_in_ruleAbbrevForwardStep4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReverseStep_in_entryRuleReverseStep4733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReverseStep4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REVERSEAXIS_in_ruleReverseStep4786 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleNodeTest_in_ruleReverseStep4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ABBREVREVERSESTEP_in_ruleReverseStep4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTest_in_entryRuleNodeTest4877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTest4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKindTest_in_ruleNodeTest4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameTest_in_ruleNodeTest4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameTest_in_entryRuleNameTest4996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameTest5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNameTest5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleNameTest5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard5115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcard5125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleWildcard5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNCName_in_ruleWildcard5209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWildcard5221 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleWildcard5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleWildcard5253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleWildcard5265 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleNCName_in_ruleWildcard5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpr_in_entryRuleFilterExpr5323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterExpr5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleFilterExpr5379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulePredicateList_in_ruleFilterExpr5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateList_in_entryRulePredicateList5436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateList5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rulePredicateList5501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate5538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePredicate5585 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExpr_in_rulePredicate5606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_rulePredicate5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr5654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpr5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpr5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_rulePrimaryExpr5737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpr_in_rulePrimaryExpr5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONTEXTITEMEXPR_in_rulePrimaryExpr5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rulePrimaryExpr5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericLiteral_in_ruleLiteral5911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGLITERAL_in_ruleLiteral5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericLiteral_in_entryRuleNumericLiteral5975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericLiteral5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTLITERAL_in_ruleNumericLiteral6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMALLITERAL_in_ruleNumericLiteral6055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLELITERAL_in_ruleNumericLiteral6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef6124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleVarRef6171 = new BitSet(new long[]{0x0000000041013E00L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleVarRef6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarName_in_entryRuleVarName6228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarName6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleVarName6283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpr_in_entryRuleParenthesizedExpr6318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpr6328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleParenthesizedExpr6374 = new BitSet(new long[]{0xFEE000E0ED8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleParenthesizedExpr6395 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleParenthesizedExpr6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall6444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall6454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleFunctionCall6500 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionCall6512 = new BitSet(new long[]{0xFEE000E0ED8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleFunctionCall6534 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionCall6547 = new BitSet(new long[]{0xFEE000E06D8F3F80L,0x00000000000003E1L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleFunctionCall6568 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_31_in_ruleFunctionCall6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleType_in_entryRuleSingleType6620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleType6630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicType_in_ruleSingleType6677 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleSingleType6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceType_in_entryRuleSequenceType6727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceType6737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTYSEQUENCETYPE_in_ruleSequenceType6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemType_in_ruleSequenceType6812 = new BitSet(new long[]{0x000000A000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleOccurenceIndicator_in_ruleSequenceType6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOccurenceIndicator_in_entryRuleOccurenceIndicator6871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOccurenceIndicator6882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleOccurenceIndicator6920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOccurenceIndicator6939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOccurenceIndicator6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemType_in_entryRuleItemType6998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemType7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKindTest_in_ruleItemType7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTYITEMTYPE_in_ruleItemType7077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicType_in_ruleItemType7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicType_in_entryRuleAtomicType7145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicType7155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicType7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKindTest_in_entryRuleKindTest7236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKindTest7246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTest_in_ruleKindTest7292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementTest_in_ruleKindTest7319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeTest_in_ruleKindTest7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaElementTest_in_ruleKindTest7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaAttributeTest_in_ruleKindTest7400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePITest_in_ruleKindTest7427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENTTEST_in_ruleKindTest7450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXTTEST_in_ruleKindTest7478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANYKINDTEST_in_ruleKindTest7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTest_in_entryRuleDocumentTest7547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTest7557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleDocumentTest7603 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDocumentTest7615 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleElementTest_in_ruleDocumentTest7637 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleSchemaElementTest_in_ruleDocumentTest7664 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDocumentTest7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePITest_in_entryRulePITest7714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePITest7724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePITest7770 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePITest7782 = new BitSet(new long[]{0x0000000080010400L});
    public static final BitSet FOLLOW_ruleNCName_in_rulePITest7804 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_STRINGLITERAL_in_rulePITest7827 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePITest7846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeTest_in_entryRuleAttributeTest7882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeTest7892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleAttributeTest7938 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAttributeTest7950 = new BitSet(new long[]{0x00000080C1013E00L});
    public static final BitSet FOLLOW_ruleAttribNameOrWildcard_in_ruleAttributeTest7972 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_21_in_ruleAttributeTest7985 = new BitSet(new long[]{0x0000000041013E00L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleAttributeTest8006 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAttributeTest8022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribNameOrWildcard_in_entryRuleAttribNameOrWildcard8058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribNameOrWildcard8068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleAttribNameOrWildcard8114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleAttribNameOrWildcard8142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaAttributeTest_in_entryRuleSchemaAttributeTest8179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemaAttributeTest8189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSchemaAttributeTest8226 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSchemaAttributeTest8238 = new BitSet(new long[]{0x0000000041013E00L});
    public static final BitSet FOLLOW_ruleAttributeDeclaration_in_ruleSchemaAttributeTest8259 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSchemaAttributeTest8271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDeclaration_in_entryRuleAttributeDeclaration8307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDeclaration8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleAttributeDeclaration8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementTest_in_entryRuleElementTest8397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementTest8407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleElementTest8453 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleElementTest8465 = new BitSet(new long[]{0x00000080C1013E00L});
    public static final BitSet FOLLOW_ruleElementNameOrWildcard_in_ruleElementTest8487 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_21_in_ruleElementTest8500 = new BitSet(new long[]{0x0000000041013E00L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleElementTest8521 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleElementTest8534 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleElementTest8552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementNameOrWildcard_in_entryRuleElementNameOrWildcard8588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementNameOrWildcard8598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementName_in_ruleElementNameOrWildcard8644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleElementNameOrWildcard8672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaElementTest_in_entryRuleSchemaElementTest8709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemaElementTest8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleSchemaElementTest8756 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleSchemaElementTest8768 = new BitSet(new long[]{0x0000000041013E00L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_ruleSchemaElementTest8789 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSchemaElementTest8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration8837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDeclaration8847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementName_in_ruleElementDeclaration8893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName8927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName8937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleAttributeName8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementName_in_entryRuleElementName9017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementName9027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleElementName9072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName9107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleTypeName9162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNCName_in_entryRuleNCName9197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNCName9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNCName9248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName9288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName9298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixedName_in_ruleQName9345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnprefixedName_in_ruleQName9372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixedName_in_entryRulePrefixedName9407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixedName9417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNCName_in_rulePrefixedName9463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePrefixedName9475 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleNCName_in_rulePrefixedName9496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnprefixedName_in_entryRuleUnprefixedName9532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnprefixedName9542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNCName_in_ruleUnprefixedName9587 = new BitSet(new long[]{0x0000000000000002L});

}