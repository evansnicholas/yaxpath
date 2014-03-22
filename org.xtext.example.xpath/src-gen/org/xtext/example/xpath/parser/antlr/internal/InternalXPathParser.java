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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_REVERSEAXIS", "RULE_ABBREVREVERSESTEP", "RULE_CONTEXTITEMEXPR", "RULE_STRINGLITERAL", "RULE_INTLITERAL", "RULE_DECIMALLITERAL", "RULE_DOUBLELITERAL", "RULE_EMPTYSEQUENCETYPE", "RULE_EMPTYITEMTYPE", "RULE_ID", "RULE_COMMENTTEST", "RULE_TEXTTEST", "RULE_ANYKINDTEST", "RULE_WS", "','", "'return'", "'for'", "'$'", "'in'", "'some'", "'every'", "'satisfies'", "'if'", "'('", "')'", "'then'", "'else'", "'or'", "'and'", "'to'", "'+'", "'-'", "'*'", "'div'", "'idiv'", "'mod'", "'union'", "'|'", "'intersect'", "'except'", "'instance'", "'of'", "'treat'", "'as'", "'castable'", "'cast'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'eq'", "'ne'", "'lt'", "'le'", "'gt'", "'ge'", "'is'", "'<<'", "'>>'", "'/'", "'//'", "'child'", "'::'", "'descendant'", "'attribute'", "'self'", "'descendant-or-self'", "'following-sibling'", "'following'", "'namespace'", "'@'", "':'", "'['", "']'", "'?'", "'document-node'", "'processing-instruction'", "'schema-attribute'", "'element'", "'schema-element'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=13;
    public static final int RULE_INTLITERAL=8;
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
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int RULE_ANYKINDTEST=16;
    public static final int T__60=60;
    public static final int EOF=-1;
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
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__83=83;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_DOUBLELITERAL=10;
    public static final int T__49=49;
    public static final int RULE_REVERSEAXIS=4;
    public static final int T__85=85;
    public static final int RULE_CONTEXTITEMEXPR=6;
    public static final int T__84=84;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ABBREVREVERSESTEP=5;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int RULE_DECIMALLITERAL=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EMPTYITEMTYPE=12;
    public static final int RULE_EMPTYSEQUENCETYPE=11;
    public static final int RULE_WS=17;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

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
        	return "Xpath";	
       	}
       	
       	@Override
       	protected XPathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleXpath"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:67:1: entryRuleXpath returns [EObject current=null] : iv_ruleXpath= ruleXpath EOF ;
    public final EObject entryRuleXpath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXpath = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:68:2: (iv_ruleXpath= ruleXpath EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:69:2: iv_ruleXpath= ruleXpath EOF
            {
             newCompositeNode(grammarAccess.getXpathRule()); 
            pushFollow(FOLLOW_ruleXpath_in_entryRuleXpath75);
            iv_ruleXpath=ruleXpath();

            state._fsp--;

             current =iv_ruleXpath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXpath85); 

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
    // $ANTLR end "entryRuleXpath"


    // $ANTLR start "ruleXpath"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:76:1: ruleXpath returns [EObject current=null] : ( (lv_xpath_0_0= ruleExpr ) ) ;
    public final EObject ruleXpath() throws RecognitionException {
        EObject current = null;

        EObject lv_xpath_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:79:28: ( ( (lv_xpath_0_0= ruleExpr ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:80:1: ( (lv_xpath_0_0= ruleExpr ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:80:1: ( (lv_xpath_0_0= ruleExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:81:1: (lv_xpath_0_0= ruleExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:81:1: (lv_xpath_0_0= ruleExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:82:3: lv_xpath_0_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getXpathAccess().getXpathExprParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleXpath130);
            lv_xpath_0_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getXpathRule());
            	        }
                   		set(
                   			current, 
                   			"xpath",
                    		lv_xpath_0_0, 
                    		"Expr");
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
    // $ANTLR end "ruleXpath"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:106:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:107:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:108:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr165);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr175); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:115:1: ruleExpr returns [EObject current=null] : ( ( (lv_exprSingle_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exprSingle_0_0 = null;

        EObject lv_exprsSingle_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:118:28: ( ( ( (lv_exprSingle_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:119:1: ( ( (lv_exprSingle_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:119:1: ( ( (lv_exprSingle_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:119:2: ( (lv_exprSingle_0_0= ruleExprSingle ) ) (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:119:2: ( (lv_exprSingle_0_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:120:1: (lv_exprSingle_0_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:120:1: (lv_exprSingle_0_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:121:3: lv_exprSingle_0_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getExprAccess().getExprSingleExprSingleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleExpr221);
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

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:137:2: (otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:137:4: otherlv_1= ',' ( (lv_exprsSingle_2_0= ruleExprSingle ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleExpr234); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExprAccess().getCommaKeyword_1_0());
            	        
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:141:1: ( (lv_exprsSingle_2_0= ruleExprSingle ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:142:1: (lv_exprsSingle_2_0= ruleExprSingle )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:142:1: (lv_exprsSingle_2_0= ruleExprSingle )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:143:3: lv_exprsSingle_2_0= ruleExprSingle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAccess().getExprsSingleExprSingleParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExprSingle_in_ruleExpr255);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:167:1: entryRuleExprSingle returns [EObject current=null] : iv_ruleExprSingle= ruleExprSingle EOF ;
    public final EObject entryRuleExprSingle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSingle = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:168:2: (iv_ruleExprSingle= ruleExprSingle EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:169:2: iv_ruleExprSingle= ruleExprSingle EOF
            {
             newCompositeNode(grammarAccess.getExprSingleRule()); 
            pushFollow(FOLLOW_ruleExprSingle_in_entryRuleExprSingle293);
            iv_ruleExprSingle=ruleExprSingle();

            state._fsp--;

             current =iv_ruleExprSingle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSingle303); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:176:1: ruleExprSingle returns [EObject current=null] : (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr ) ;
    public final EObject ruleExprSingle() throws RecognitionException {
        EObject current = null;

        EObject this_ForExpr_0 = null;

        EObject this_QuantifiedExpr_1 = null;

        EObject this_IfExpr_2 = null;

        EObject this_OrExpr_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:179:28: ( (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:180:1: (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:180:1: (this_ForExpr_0= ruleForExpr | this_QuantifiedExpr_1= ruleQuantifiedExpr | this_IfExpr_2= ruleIfExpr | this_OrExpr_3= ruleOrExpr )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 23:
            case 24:
                {
                alt2=2;
                }
                break;
            case 26:
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
            case 21:
            case 27:
            case 34:
            case 35:
            case 36:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:181:5: this_ForExpr_0= ruleForExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getForExprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleForExpr_in_ruleExprSingle350);
                    this_ForExpr_0=ruleForExpr();

                    state._fsp--;

                     
                            current = this_ForExpr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:191:5: this_QuantifiedExpr_1= ruleQuantifiedExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getQuantifiedExprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleQuantifiedExpr_in_ruleExprSingle377);
                    this_QuantifiedExpr_1=ruleQuantifiedExpr();

                    state._fsp--;

                     
                            current = this_QuantifiedExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:201:5: this_IfExpr_2= ruleIfExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getIfExprParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleIfExpr_in_ruleExprSingle404);
                    this_IfExpr_2=ruleIfExpr();

                    state._fsp--;

                     
                            current = this_IfExpr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:211:5: this_OrExpr_3= ruleOrExpr
                    {
                     
                            newCompositeNode(grammarAccess.getExprSingleAccess().getOrExprParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleOrExpr_in_ruleExprSingle431);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:227:1: entryRuleForExpr returns [EObject current=null] : iv_ruleForExpr= ruleForExpr EOF ;
    public final EObject entryRuleForExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:228:2: (iv_ruleForExpr= ruleForExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:229:2: iv_ruleForExpr= ruleForExpr EOF
            {
             newCompositeNode(grammarAccess.getForExprRule()); 
            pushFollow(FOLLOW_ruleForExpr_in_entryRuleForExpr466);
            iv_ruleForExpr=ruleForExpr();

            state._fsp--;

             current =iv_ruleForExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForExpr476); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:236:1: ruleForExpr returns [EObject current=null] : ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) ) ;
    public final EObject ruleForExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_for_0_0 = null;

        EObject lv_return_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:239:28: ( ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:240:1: ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:240:1: ( ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:240:2: ( (lv_for_0_0= ruleSimpleForClause ) ) otherlv_1= 'return' ( (lv_return_2_0= ruleExprSingle ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:240:2: ( (lv_for_0_0= ruleSimpleForClause ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:241:1: (lv_for_0_0= ruleSimpleForClause )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:241:1: (lv_for_0_0= ruleSimpleForClause )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:242:3: lv_for_0_0= ruleSimpleForClause
            {
             
            	        newCompositeNode(grammarAccess.getForExprAccess().getForSimpleForClauseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSimpleForClause_in_ruleForExpr522);
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

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleForExpr534); 

                	newLeafNode(otherlv_1, grammarAccess.getForExprAccess().getReturnKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:262:1: ( (lv_return_2_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:263:1: (lv_return_2_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:263:1: (lv_return_2_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:264:3: lv_return_2_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getForExprAccess().getReturnExprSingleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleForExpr555);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:288:1: entryRuleSimpleForClause returns [EObject current=null] : iv_ruleSimpleForClause= ruleSimpleForClause EOF ;
    public final EObject entryRuleSimpleForClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleForClause = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:289:2: (iv_ruleSimpleForClause= ruleSimpleForClause EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:290:2: iv_ruleSimpleForClause= ruleSimpleForClause EOF
            {
             newCompositeNode(grammarAccess.getSimpleForClauseRule()); 
            pushFollow(FOLLOW_ruleSimpleForClause_in_entryRuleSimpleForClause591);
            iv_ruleSimpleForClause=ruleSimpleForClause();

            state._fsp--;

             current =iv_ruleSimpleForClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleForClause601); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:297:1: ruleSimpleForClause returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '$' ( (lv_forVar_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ( (lv_additionalIn_5_0= ruleAdditionalIn ) )* ) ;
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
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:300:28: ( (otherlv_0= 'for' otherlv_1= '$' ( (lv_forVar_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ( (lv_additionalIn_5_0= ruleAdditionalIn ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:301:1: (otherlv_0= 'for' otherlv_1= '$' ( (lv_forVar_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ( (lv_additionalIn_5_0= ruleAdditionalIn ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:301:1: (otherlv_0= 'for' otherlv_1= '$' ( (lv_forVar_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ( (lv_additionalIn_5_0= ruleAdditionalIn ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:301:3: otherlv_0= 'for' otherlv_1= '$' ( (lv_forVar_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ( (lv_additionalIn_5_0= ruleAdditionalIn ) )*
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSimpleForClause638); 

                	newLeafNode(otherlv_0, grammarAccess.getSimpleForClauseAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSimpleForClause650); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleForClauseAccess().getDollarSignKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:309:1: ( (lv_forVar_2_0= ruleVarName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:310:1: (lv_forVar_2_0= ruleVarName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:310:1: (lv_forVar_2_0= ruleVarName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:311:3: lv_forVar_2_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getSimpleForClauseAccess().getForVarVarNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleSimpleForClause671);
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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSimpleForClause683); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleForClauseAccess().getInKeyword_3());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:331:1: ( (lv_in_4_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:332:1: (lv_in_4_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:332:1: (lv_in_4_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:333:3: lv_in_4_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getSimpleForClauseAccess().getInExprSingleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleSimpleForClause704);
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

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:349:2: ( (lv_additionalIn_5_0= ruleAdditionalIn ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:350:1: (lv_additionalIn_5_0= ruleAdditionalIn )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:350:1: (lv_additionalIn_5_0= ruleAdditionalIn )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:351:3: lv_additionalIn_5_0= ruleAdditionalIn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSimpleForClauseAccess().getAdditionalInAdditionalInParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalIn_in_ruleSimpleForClause725);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:375:1: entryRuleAdditionalIn returns [EObject current=null] : iv_ruleAdditionalIn= ruleAdditionalIn EOF ;
    public final EObject entryRuleAdditionalIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionalIn = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:376:2: (iv_ruleAdditionalIn= ruleAdditionalIn EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:377:2: iv_ruleAdditionalIn= ruleAdditionalIn EOF
            {
             newCompositeNode(grammarAccess.getAdditionalInRule()); 
            pushFollow(FOLLOW_ruleAdditionalIn_in_entryRuleAdditionalIn762);
            iv_ruleAdditionalIn=ruleAdditionalIn();

            state._fsp--;

             current =iv_ruleAdditionalIn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionalIn772); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:384:1: ruleAdditionalIn returns [EObject current=null] : (otherlv_0= ',' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ) ;
    public final EObject ruleAdditionalIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_variable_2_0 = null;

        EObject lv_in_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:387:28: ( (otherlv_0= ',' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:388:1: (otherlv_0= ',' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:388:1: (otherlv_0= ',' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:388:3: otherlv_0= ',' otherlv_1= '$' ( (lv_variable_2_0= ruleVarName ) ) otherlv_3= 'in' ( (lv_in_4_0= ruleExprSingle ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleAdditionalIn809); 

                	newLeafNode(otherlv_0, grammarAccess.getAdditionalInAccess().getCommaKeyword_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAdditionalIn821); 

                	newLeafNode(otherlv_1, grammarAccess.getAdditionalInAccess().getDollarSignKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:396:1: ( (lv_variable_2_0= ruleVarName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:397:1: (lv_variable_2_0= ruleVarName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:397:1: (lv_variable_2_0= ruleVarName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:398:3: lv_variable_2_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getAdditionalInAccess().getVariableVarNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleAdditionalIn842);
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

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAdditionalIn854); 

                	newLeafNode(otherlv_3, grammarAccess.getAdditionalInAccess().getInKeyword_3());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:418:1: ( (lv_in_4_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:419:1: (lv_in_4_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:419:1: (lv_in_4_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:420:3: lv_in_4_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getAdditionalInAccess().getInExprSingleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleAdditionalIn875);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:444:1: entryRuleQuantifiedExpr returns [EObject current=null] : iv_ruleQuantifiedExpr= ruleQuantifiedExpr EOF ;
    public final EObject entryRuleQuantifiedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:445:2: (iv_ruleQuantifiedExpr= ruleQuantifiedExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:446:2: iv_ruleQuantifiedExpr= ruleQuantifiedExpr EOF
            {
             newCompositeNode(grammarAccess.getQuantifiedExprRule()); 
            pushFollow(FOLLOW_ruleQuantifiedExpr_in_entryRuleQuantifiedExpr911);
            iv_ruleQuantifiedExpr=ruleQuantifiedExpr();

            state._fsp--;

             current =iv_ruleQuantifiedExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedExpr921); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:453:1: ruleQuantifiedExpr returns [EObject current=null] : ( (otherlv_0= 'some' | otherlv_1= 'every' ) otherlv_2= '$' ( (lv_variable_3_0= ruleVarName ) ) otherlv_4= 'in' ( (lv_in_5_0= ruleExprSingle ) ) ( (lv_additionalIn_6_0= ruleAdditionalIn ) )* otherlv_7= 'satisfies' ( (lv_satisfy_8_0= ruleExprSingle ) ) ) ;
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
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:456:28: ( ( (otherlv_0= 'some' | otherlv_1= 'every' ) otherlv_2= '$' ( (lv_variable_3_0= ruleVarName ) ) otherlv_4= 'in' ( (lv_in_5_0= ruleExprSingle ) ) ( (lv_additionalIn_6_0= ruleAdditionalIn ) )* otherlv_7= 'satisfies' ( (lv_satisfy_8_0= ruleExprSingle ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:457:1: ( (otherlv_0= 'some' | otherlv_1= 'every' ) otherlv_2= '$' ( (lv_variable_3_0= ruleVarName ) ) otherlv_4= 'in' ( (lv_in_5_0= ruleExprSingle ) ) ( (lv_additionalIn_6_0= ruleAdditionalIn ) )* otherlv_7= 'satisfies' ( (lv_satisfy_8_0= ruleExprSingle ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:457:1: ( (otherlv_0= 'some' | otherlv_1= 'every' ) otherlv_2= '$' ( (lv_variable_3_0= ruleVarName ) ) otherlv_4= 'in' ( (lv_in_5_0= ruleExprSingle ) ) ( (lv_additionalIn_6_0= ruleAdditionalIn ) )* otherlv_7= 'satisfies' ( (lv_satisfy_8_0= ruleExprSingle ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:457:2: (otherlv_0= 'some' | otherlv_1= 'every' ) otherlv_2= '$' ( (lv_variable_3_0= ruleVarName ) ) otherlv_4= 'in' ( (lv_in_5_0= ruleExprSingle ) ) ( (lv_additionalIn_6_0= ruleAdditionalIn ) )* otherlv_7= 'satisfies' ( (lv_satisfy_8_0= ruleExprSingle ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:457:2: (otherlv_0= 'some' | otherlv_1= 'every' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:457:4: otherlv_0= 'some'
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleQuantifiedExpr959); 

                        	newLeafNode(otherlv_0, grammarAccess.getQuantifiedExprAccess().getSomeKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:462:7: otherlv_1= 'every'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleQuantifiedExpr977); 

                        	newLeafNode(otherlv_1, grammarAccess.getQuantifiedExprAccess().getEveryKeyword_0_1());
                        

                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleQuantifiedExpr990); 

                	newLeafNode(otherlv_2, grammarAccess.getQuantifiedExprAccess().getDollarSignKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:470:1: ( (lv_variable_3_0= ruleVarName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:471:1: (lv_variable_3_0= ruleVarName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:471:1: (lv_variable_3_0= ruleVarName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:472:3: lv_variable_3_0= ruleVarName
            {
             
            	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getVariableVarNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVarName_in_ruleQuantifiedExpr1011);
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

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleQuantifiedExpr1023); 

                	newLeafNode(otherlv_4, grammarAccess.getQuantifiedExprAccess().getInKeyword_3());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:492:1: ( (lv_in_5_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:493:1: (lv_in_5_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:493:1: (lv_in_5_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:494:3: lv_in_5_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getInExprSingleParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr1044);
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

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:510:2: ( (lv_additionalIn_6_0= ruleAdditionalIn ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:511:1: (lv_additionalIn_6_0= ruleAdditionalIn )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:511:1: (lv_additionalIn_6_0= ruleAdditionalIn )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:512:3: lv_additionalIn_6_0= ruleAdditionalIn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getAdditionalInAdditionalInParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdditionalIn_in_ruleQuantifiedExpr1065);
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

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleQuantifiedExpr1078); 

                	newLeafNode(otherlv_7, grammarAccess.getQuantifiedExprAccess().getSatisfiesKeyword_6());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:532:1: ( (lv_satisfy_8_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:533:1: (lv_satisfy_8_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:533:1: (lv_satisfy_8_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:534:3: lv_satisfy_8_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getQuantifiedExprAccess().getSatisfyExprSingleParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr1099);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:558:1: entryRuleIfExpr returns [EObject current=null] : iv_ruleIfExpr= ruleIfExpr EOF ;
    public final EObject entryRuleIfExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:559:2: (iv_ruleIfExpr= ruleIfExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:560:2: iv_ruleIfExpr= ruleIfExpr EOF
            {
             newCompositeNode(grammarAccess.getIfExprRule()); 
            pushFollow(FOLLOW_ruleIfExpr_in_entryRuleIfExpr1135);
            iv_ruleIfExpr=ruleIfExpr();

            state._fsp--;

             current =iv_ruleIfExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExpr1145); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:567:1: ruleIfExpr returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) ) ;
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
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:570:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:571:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:571:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:571:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_if_2_0= ruleExpr ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_then_5_0= ruleExprSingle ) ) otherlv_6= 'else' ( (lv_else_7_0= ruleExprSingle ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleIfExpr1182); 

                	newLeafNode(otherlv_0, grammarAccess.getIfExprAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleIfExpr1194); 

                	newLeafNode(otherlv_1, grammarAccess.getIfExprAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:579:1: ( (lv_if_2_0= ruleExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:580:1: (lv_if_2_0= ruleExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:580:1: (lv_if_2_0= ruleExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:581:3: lv_if_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getIfExprAccess().getIfExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleIfExpr1215);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleIfExpr1227); 

                	newLeafNode(otherlv_3, grammarAccess.getIfExprAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleIfExpr1239); 

                	newLeafNode(otherlv_4, grammarAccess.getIfExprAccess().getThenKeyword_4());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:605:1: ( (lv_then_5_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:606:1: (lv_then_5_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:606:1: (lv_then_5_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:607:3: lv_then_5_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getIfExprAccess().getThenExprSingleParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleIfExpr1260);
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

            otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleIfExpr1272); 

                	newLeafNode(otherlv_6, grammarAccess.getIfExprAccess().getElseKeyword_6());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:627:1: ( (lv_else_7_0= ruleExprSingle ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:628:1: (lv_else_7_0= ruleExprSingle )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:628:1: (lv_else_7_0= ruleExprSingle )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:629:3: lv_else_7_0= ruleExprSingle
            {
             
            	        newCompositeNode(grammarAccess.getIfExprAccess().getElseExprSingleParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleExprSingle_in_ruleIfExpr1293);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:653:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:654:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:655:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
             newCompositeNode(grammarAccess.getOrExprRule()); 
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr1329);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;

             current =iv_ruleOrExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr1339); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:662:1: ruleOrExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_rights_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:665:28: ( ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:666:1: ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:666:1: ( ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:666:2: ( (lv_left_0_0= ruleAndExpr ) ) (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:666:2: ( (lv_left_0_0= ruleAndExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:667:1: (lv_left_0_0= ruleAndExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:667:1: (lv_left_0_0= ruleAndExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:668:3: lv_left_0_0= ruleAndExpr
            {
             
            	        newCompositeNode(grammarAccess.getOrExprAccess().getLeftAndExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr1385);
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

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:684:2: (otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==31) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:684:4: otherlv_1= 'or' ( (lv_rights_2_0= ruleAndExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleOrExpr1398); 

            	        	newLeafNode(otherlv_1, grammarAccess.getOrExprAccess().getOrKeyword_1_0());
            	        
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:688:1: ( (lv_rights_2_0= ruleAndExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:689:1: (lv_rights_2_0= ruleAndExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:689:1: (lv_rights_2_0= ruleAndExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:690:3: lv_rights_2_0= ruleAndExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrExprAccess().getRightsAndExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr1419);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:714:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:715:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:716:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
             newCompositeNode(grammarAccess.getAndExprRule()); 
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr1457);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;

             current =iv_ruleAndExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr1467); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:723:1: ruleAndExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_rights_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:726:28: ( ( ( (lv_left_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:727:1: ( ( (lv_left_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:727:1: ( ( (lv_left_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:727:2: ( (lv_left_0_0= ruleComparisonExpr ) ) (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:727:2: ( (lv_left_0_0= ruleComparisonExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:728:1: (lv_left_0_0= ruleComparisonExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:728:1: (lv_left_0_0= ruleComparisonExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:729:3: lv_left_0_0= ruleComparisonExpr
            {
             
            	        newCompositeNode(grammarAccess.getAndExprAccess().getLeftComparisonExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleComparisonExpr_in_ruleAndExpr1513);
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

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:745:2: (otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==32) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:745:4: otherlv_1= 'and' ( (lv_rights_2_0= ruleComparisonExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleAndExpr1526); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAndExprAccess().getAndKeyword_1_0());
            	        
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:749:1: ( (lv_rights_2_0= ruleComparisonExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:750:1: (lv_rights_2_0= ruleComparisonExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:750:1: (lv_rights_2_0= ruleComparisonExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:751:3: lv_rights_2_0= ruleComparisonExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAndExprAccess().getRightsComparisonExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComparisonExpr_in_ruleAndExpr1547);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:775:1: entryRuleComparisonExpr returns [EObject current=null] : iv_ruleComparisonExpr= ruleComparisonExpr EOF ;
    public final EObject entryRuleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:776:2: (iv_ruleComparisonExpr= ruleComparisonExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:777:2: iv_ruleComparisonExpr= ruleComparisonExpr EOF
            {
             newCompositeNode(grammarAccess.getComparisonExprRule()); 
            pushFollow(FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr1585);
            iv_ruleComparisonExpr=ruleComparisonExpr();

            state._fsp--;

             current =iv_ruleComparisonExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisonExpr1595); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:784:1: ruleComparisonExpr returns [EObject current=null] : ( ( (lv_left_0_0= ruleRangeExpr ) ) ( ( ( (lv_comp_1_0= ruleValueComp ) ) | ( (lv_comp_2_0= ruleGeneralComp ) ) | ( (lv_comp_3_0= ruleNodeComp ) ) ) ( (lv_right_4_0= ruleRangeExpr ) ) )? ) ;
    public final EObject ruleComparisonExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_comp_1_0 = null;

        EObject lv_comp_2_0 = null;

        EObject lv_comp_3_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:787:28: ( ( ( (lv_left_0_0= ruleRangeExpr ) ) ( ( ( (lv_comp_1_0= ruleValueComp ) ) | ( (lv_comp_2_0= ruleGeneralComp ) ) | ( (lv_comp_3_0= ruleNodeComp ) ) ) ( (lv_right_4_0= ruleRangeExpr ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:788:1: ( ( (lv_left_0_0= ruleRangeExpr ) ) ( ( ( (lv_comp_1_0= ruleValueComp ) ) | ( (lv_comp_2_0= ruleGeneralComp ) ) | ( (lv_comp_3_0= ruleNodeComp ) ) ) ( (lv_right_4_0= ruleRangeExpr ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:788:1: ( ( (lv_left_0_0= ruleRangeExpr ) ) ( ( ( (lv_comp_1_0= ruleValueComp ) ) | ( (lv_comp_2_0= ruleGeneralComp ) ) | ( (lv_comp_3_0= ruleNodeComp ) ) ) ( (lv_right_4_0= ruleRangeExpr ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:788:2: ( (lv_left_0_0= ruleRangeExpr ) ) ( ( ( (lv_comp_1_0= ruleValueComp ) ) | ( (lv_comp_2_0= ruleGeneralComp ) ) | ( (lv_comp_3_0= ruleNodeComp ) ) ) ( (lv_right_4_0= ruleRangeExpr ) ) )?
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:788:2: ( (lv_left_0_0= ruleRangeExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:789:1: (lv_left_0_0= ruleRangeExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:789:1: (lv_left_0_0= ruleRangeExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:790:3: lv_left_0_0= ruleRangeExpr
            {
             
            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getLeftRangeExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRangeExpr_in_ruleComparisonExpr1641);
            lv_left_0_0=ruleRangeExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"RangeExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:806:2: ( ( ( (lv_comp_1_0= ruleValueComp ) ) | ( (lv_comp_2_0= ruleGeneralComp ) ) | ( (lv_comp_3_0= ruleNodeComp ) ) ) ( (lv_right_4_0= ruleRangeExpr ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=50 && LA9_0<=64)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:806:3: ( ( (lv_comp_1_0= ruleValueComp ) ) | ( (lv_comp_2_0= ruleGeneralComp ) ) | ( (lv_comp_3_0= ruleNodeComp ) ) ) ( (lv_right_4_0= ruleRangeExpr ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:806:3: ( ( (lv_comp_1_0= ruleValueComp ) ) | ( (lv_comp_2_0= ruleGeneralComp ) ) | ( (lv_comp_3_0= ruleNodeComp ) ) )
                    int alt8=3;
                    switch ( input.LA(1) ) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                        {
                        alt8=1;
                        }
                        break;
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                        {
                        alt8=2;
                        }
                        break;
                    case 62:
                    case 63:
                    case 64:
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
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:806:4: ( (lv_comp_1_0= ruleValueComp ) )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:806:4: ( (lv_comp_1_0= ruleValueComp ) )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:807:1: (lv_comp_1_0= ruleValueComp )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:807:1: (lv_comp_1_0= ruleValueComp )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:808:3: lv_comp_1_0= ruleValueComp
                            {
                             
                            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getCompValueCompParserRuleCall_1_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleValueComp_in_ruleComparisonExpr1664);
                            lv_comp_1_0=ruleValueComp();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"comp",
                                    		lv_comp_1_0, 
                                    		"ValueComp");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:825:6: ( (lv_comp_2_0= ruleGeneralComp ) )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:825:6: ( (lv_comp_2_0= ruleGeneralComp ) )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:826:1: (lv_comp_2_0= ruleGeneralComp )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:826:1: (lv_comp_2_0= ruleGeneralComp )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:827:3: lv_comp_2_0= ruleGeneralComp
                            {
                             
                            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getCompGeneralCompParserRuleCall_1_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleGeneralComp_in_ruleComparisonExpr1691);
                            lv_comp_2_0=ruleGeneralComp();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"comp",
                                    		lv_comp_2_0, 
                                    		"GeneralComp");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:844:6: ( (lv_comp_3_0= ruleNodeComp ) )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:844:6: ( (lv_comp_3_0= ruleNodeComp ) )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:845:1: (lv_comp_3_0= ruleNodeComp )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:845:1: (lv_comp_3_0= ruleNodeComp )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:846:3: lv_comp_3_0= ruleNodeComp
                            {
                             
                            	        newCompositeNode(grammarAccess.getComparisonExprAccess().getCompNodeCompParserRuleCall_1_0_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNodeComp_in_ruleComparisonExpr1718);
                            lv_comp_3_0=ruleNodeComp();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"comp",
                                    		lv_comp_3_0, 
                                    		"NodeComp");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:862:3: ( (lv_right_4_0= ruleRangeExpr ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:863:1: (lv_right_4_0= ruleRangeExpr )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:863:1: (lv_right_4_0= ruleRangeExpr )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:864:3: lv_right_4_0= ruleRangeExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getComparisonExprAccess().getRightRangeExprParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRangeExpr_in_ruleComparisonExpr1740);
                    lv_right_4_0=ruleRangeExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getComparisonExprRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_4_0, 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:888:1: entryRuleRangeExpr returns [EObject current=null] : iv_ruleRangeExpr= ruleRangeExpr EOF ;
    public final EObject entryRuleRangeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:889:2: (iv_ruleRangeExpr= ruleRangeExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:890:2: iv_ruleRangeExpr= ruleRangeExpr EOF
            {
             newCompositeNode(grammarAccess.getRangeExprRule()); 
            pushFollow(FOLLOW_ruleRangeExpr_in_entryRuleRangeExpr1778);
            iv_ruleRangeExpr=ruleRangeExpr();

            state._fsp--;

             current =iv_ruleRangeExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRangeExpr1788); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:897:1: ruleRangeExpr returns [EObject current=null] : ( ( (lv_from_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? ) ;
    public final EObject ruleRangeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_from_0_0 = null;

        EObject lv_to_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:900:28: ( ( ( (lv_from_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:901:1: ( ( (lv_from_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:901:1: ( ( (lv_from_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:901:2: ( (lv_from_0_0= ruleAdditiveExpr ) ) (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )?
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:901:2: ( (lv_from_0_0= ruleAdditiveExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:902:1: (lv_from_0_0= ruleAdditiveExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:902:1: (lv_from_0_0= ruleAdditiveExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:903:3: lv_from_0_0= ruleAdditiveExpr
            {
             
            	        newCompositeNode(grammarAccess.getRangeExprAccess().getFromAdditiveExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr1834);
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

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:919:2: (otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:919:4: otherlv_1= 'to' ( (lv_to_2_0= ruleAdditiveExpr ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleRangeExpr1847); 

                        	newLeafNode(otherlv_1, grammarAccess.getRangeExprAccess().getToKeyword_1_0());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:923:1: ( (lv_to_2_0= ruleAdditiveExpr ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:924:1: (lv_to_2_0= ruleAdditiveExpr )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:924:1: (lv_to_2_0= ruleAdditiveExpr )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:925:3: lv_to_2_0= ruleAdditiveExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getRangeExprAccess().getToAdditiveExprParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr1868);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:949:1: entryRuleAdditiveExpr returns [EObject current=null] : iv_ruleAdditiveExpr= ruleAdditiveExpr EOF ;
    public final EObject entryRuleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:950:2: (iv_ruleAdditiveExpr= ruleAdditiveExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:951:2: iv_ruleAdditiveExpr= ruleAdditiveExpr EOF
            {
             newCompositeNode(grammarAccess.getAdditiveExprRule()); 
            pushFollow(FOLLOW_ruleAdditiveExpr_in_entryRuleAdditiveExpr1906);
            iv_ruleAdditiveExpr=ruleAdditiveExpr();

            state._fsp--;

             current =iv_ruleAdditiveExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpr1916); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:958:1: ruleAdditiveExpr returns [EObject current=null] : (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* ) ;
    public final EObject ruleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultiplicativeExpr_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:961:28: ( (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:962:1: (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:962:1: (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:963:5: this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAdditiveExprAccess().getMultiplicativeExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr1963);
            this_MultiplicativeExpr_0=ruleMultiplicativeExpr();

            state._fsp--;

             
                    current = this_MultiplicativeExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:971:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=34 && LA12_0<=35)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:971:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:971:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==34) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==35) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:971:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:971:3: ( () otherlv_2= '+' )
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:971:4: () otherlv_2= '+'
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:971:4: ()
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:972:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditiveExprAccess().getAdditionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleAdditiveExpr1986); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAdditiveExprAccess().getPlusSignKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:982:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:982:6: ( () otherlv_4= '-' )
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:982:7: () otherlv_4= '-'
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:982:7: ()
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:983:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getAdditiveExprAccess().getSubstractionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,35,FOLLOW_35_in_ruleAdditiveExpr2015); 

            	                	newLeafNode(otherlv_4, grammarAccess.getAdditiveExprAccess().getHyphenMinusKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:992:3: ( (lv_right_5_0= ruleMultiplicativeExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:993:1: (lv_right_5_0= ruleMultiplicativeExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:993:1: (lv_right_5_0= ruleMultiplicativeExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:994:3: lv_right_5_0= ruleMultiplicativeExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAdditiveExprAccess().getRightMultiplicativeExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr2038);
            	    lv_right_5_0=ruleMultiplicativeExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAdditiveExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1018:1: entryRuleMultiplicativeExpr returns [EObject current=null] : iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF ;
    public final EObject entryRuleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1019:2: (iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1020:2: iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF
            {
             newCompositeNode(grammarAccess.getMultiplicativeExprRule()); 
            pushFollow(FOLLOW_ruleMultiplicativeExpr_in_entryRuleMultiplicativeExpr2076);
            iv_ruleMultiplicativeExpr=ruleMultiplicativeExpr();

            state._fsp--;

             current =iv_ruleMultiplicativeExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpr2086); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1027:1: ruleMultiplicativeExpr returns [EObject current=null] : (this_UnionExpr_0= ruleUnionExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= 'div' ) | ( () otherlv_6= 'idiv' ) | ( () otherlv_8= 'mod' ) ) ( (lv_right_9_0= ruleUnionExpr ) ) )* ) ;
    public final EObject ruleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_UnionExpr_0 = null;

        EObject lv_right_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1030:28: ( (this_UnionExpr_0= ruleUnionExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= 'div' ) | ( () otherlv_6= 'idiv' ) | ( () otherlv_8= 'mod' ) ) ( (lv_right_9_0= ruleUnionExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1031:1: (this_UnionExpr_0= ruleUnionExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= 'div' ) | ( () otherlv_6= 'idiv' ) | ( () otherlv_8= 'mod' ) ) ( (lv_right_9_0= ruleUnionExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1031:1: (this_UnionExpr_0= ruleUnionExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= 'div' ) | ( () otherlv_6= 'idiv' ) | ( () otherlv_8= 'mod' ) ) ( (lv_right_9_0= ruleUnionExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1032:5: this_UnionExpr_0= ruleUnionExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= 'div' ) | ( () otherlv_6= 'idiv' ) | ( () otherlv_8= 'mod' ) ) ( (lv_right_9_0= ruleUnionExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getUnionExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr2133);
            this_UnionExpr_0=ruleUnionExpr();

            state._fsp--;

             
                    current = this_UnionExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1040:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= 'div' ) | ( () otherlv_6= 'idiv' ) | ( () otherlv_8= 'mod' ) ) ( (lv_right_9_0= ruleUnionExpr ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=36 && LA14_0<=39)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1040:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= 'div' ) | ( () otherlv_6= 'idiv' ) | ( () otherlv_8= 'mod' ) ) ( (lv_right_9_0= ruleUnionExpr ) )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1040:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= 'div' ) | ( () otherlv_6= 'idiv' ) | ( () otherlv_8= 'mod' ) )
            	    int alt13=4;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 39:
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
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1040:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1040:3: ( () otherlv_2= '*' )
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1040:4: () otherlv_2= '*'
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1040:4: ()
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1041:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicativeExprAccess().getMultiplicationLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleMultiplicativeExpr2156); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultiplicativeExprAccess().getAsteriskKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1051:6: ( () otherlv_4= 'div' )
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1051:6: ( () otherlv_4= 'div' )
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1051:7: () otherlv_4= 'div'
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1051:7: ()
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1052:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicativeExprAccess().getDivisionLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleMultiplicativeExpr2185); 

            	                	newLeafNode(otherlv_4, grammarAccess.getMultiplicativeExprAccess().getDivKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1062:6: ( () otherlv_6= 'idiv' )
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1062:6: ( () otherlv_6= 'idiv' )
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1062:7: () otherlv_6= 'idiv'
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1062:7: ()
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1063:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicativeExprAccess().getIDivisionLeftAction_1_0_2_0(),
            	                        current);
            	                

            	            }

            	            otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleMultiplicativeExpr2214); 

            	                	newLeafNode(otherlv_6, grammarAccess.getMultiplicativeExprAccess().getIdivKeyword_1_0_2_1());
            	                

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1073:6: ( () otherlv_8= 'mod' )
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1073:6: ( () otherlv_8= 'mod' )
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1073:7: () otherlv_8= 'mod'
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1073:7: ()
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1074:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getMultiplicativeExprAccess().getModLeftAction_1_0_3_0(),
            	                        current);
            	                

            	            }

            	            otherlv_8=(Token)match(input,39,FOLLOW_39_in_ruleMultiplicativeExpr2243); 

            	                	newLeafNode(otherlv_8, grammarAccess.getMultiplicativeExprAccess().getModKeyword_1_0_3_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1083:3: ( (lv_right_9_0= ruleUnionExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1084:1: (lv_right_9_0= ruleUnionExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1084:1: (lv_right_9_0= ruleUnionExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1085:3: lv_right_9_0= ruleUnionExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getRightUnionExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr2266);
            	    lv_right_9_0=ruleUnionExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiplicativeExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_9_0, 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1109:1: entryRuleUnionExpr returns [EObject current=null] : iv_ruleUnionExpr= ruleUnionExpr EOF ;
    public final EObject entryRuleUnionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1110:2: (iv_ruleUnionExpr= ruleUnionExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1111:2: iv_ruleUnionExpr= ruleUnionExpr EOF
            {
             newCompositeNode(grammarAccess.getUnionExprRule()); 
            pushFollow(FOLLOW_ruleUnionExpr_in_entryRuleUnionExpr2304);
            iv_ruleUnionExpr=ruleUnionExpr();

            state._fsp--;

             current =iv_ruleUnionExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnionExpr2314); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1118:1: ruleUnionExpr returns [EObject current=null] : (this_IntersectExceptExpr_0= ruleIntersectExceptExpr ( ( ( () otherlv_2= 'union' ) | ( () otherlv_4= '|' ) ) ( (lv_right_5_0= ruleIntersectExceptExpr ) ) )* ) ;
    public final EObject ruleUnionExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntersectExceptExpr_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1121:28: ( (this_IntersectExceptExpr_0= ruleIntersectExceptExpr ( ( ( () otherlv_2= 'union' ) | ( () otherlv_4= '|' ) ) ( (lv_right_5_0= ruleIntersectExceptExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1122:1: (this_IntersectExceptExpr_0= ruleIntersectExceptExpr ( ( ( () otherlv_2= 'union' ) | ( () otherlv_4= '|' ) ) ( (lv_right_5_0= ruleIntersectExceptExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1122:1: (this_IntersectExceptExpr_0= ruleIntersectExceptExpr ( ( ( () otherlv_2= 'union' ) | ( () otherlv_4= '|' ) ) ( (lv_right_5_0= ruleIntersectExceptExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1123:5: this_IntersectExceptExpr_0= ruleIntersectExceptExpr ( ( ( () otherlv_2= 'union' ) | ( () otherlv_4= '|' ) ) ( (lv_right_5_0= ruleIntersectExceptExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getUnionExprAccess().getIntersectExceptExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr2361);
            this_IntersectExceptExpr_0=ruleIntersectExceptExpr();

            state._fsp--;

             
                    current = this_IntersectExceptExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1131:1: ( ( ( () otherlv_2= 'union' ) | ( () otherlv_4= '|' ) ) ( (lv_right_5_0= ruleIntersectExceptExpr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=40 && LA16_0<=41)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1131:2: ( ( () otherlv_2= 'union' ) | ( () otherlv_4= '|' ) ) ( (lv_right_5_0= ruleIntersectExceptExpr ) )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1131:2: ( ( () otherlv_2= 'union' ) | ( () otherlv_4= '|' ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==40) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==41) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1131:3: ( () otherlv_2= 'union' )
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1131:3: ( () otherlv_2= 'union' )
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1131:4: () otherlv_2= 'union'
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1131:4: ()
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1132:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUnionExprAccess().getUnionLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleUnionExpr2384); 

            	                	newLeafNode(otherlv_2, grammarAccess.getUnionExprAccess().getUnionKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1142:6: ( () otherlv_4= '|' )
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1142:6: ( () otherlv_4= '|' )
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1142:7: () otherlv_4= '|'
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1142:7: ()
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1143:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getUnionExprAccess().getPipeLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleUnionExpr2413); 

            	                	newLeafNode(otherlv_4, grammarAccess.getUnionExprAccess().getVerticalLineKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1152:3: ( (lv_right_5_0= ruleIntersectExceptExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1153:1: (lv_right_5_0= ruleIntersectExceptExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1153:1: (lv_right_5_0= ruleIntersectExceptExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1154:3: lv_right_5_0= ruleIntersectExceptExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getUnionExprAccess().getRightIntersectExceptExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr2436);
            	    lv_right_5_0=ruleIntersectExceptExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getUnionExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1178:1: entryRuleIntersectExceptExpr returns [EObject current=null] : iv_ruleIntersectExceptExpr= ruleIntersectExceptExpr EOF ;
    public final EObject entryRuleIntersectExceptExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntersectExceptExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1179:2: (iv_ruleIntersectExceptExpr= ruleIntersectExceptExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1180:2: iv_ruleIntersectExceptExpr= ruleIntersectExceptExpr EOF
            {
             newCompositeNode(grammarAccess.getIntersectExceptExprRule()); 
            pushFollow(FOLLOW_ruleIntersectExceptExpr_in_entryRuleIntersectExceptExpr2474);
            iv_ruleIntersectExceptExpr=ruleIntersectExceptExpr();

            state._fsp--;

             current =iv_ruleIntersectExceptExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntersectExceptExpr2484); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1187:1: ruleIntersectExceptExpr returns [EObject current=null] : (this_InstanceofExpr_0= ruleInstanceofExpr ( ( ( () otherlv_2= 'intersect' ) | ( () otherlv_4= 'except' ) ) ( (lv_right_5_0= ruleInstanceofExpr ) ) )* ) ;
    public final EObject ruleIntersectExceptExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_InstanceofExpr_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1190:28: ( (this_InstanceofExpr_0= ruleInstanceofExpr ( ( ( () otherlv_2= 'intersect' ) | ( () otherlv_4= 'except' ) ) ( (lv_right_5_0= ruleInstanceofExpr ) ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1191:1: (this_InstanceofExpr_0= ruleInstanceofExpr ( ( ( () otherlv_2= 'intersect' ) | ( () otherlv_4= 'except' ) ) ( (lv_right_5_0= ruleInstanceofExpr ) ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1191:1: (this_InstanceofExpr_0= ruleInstanceofExpr ( ( ( () otherlv_2= 'intersect' ) | ( () otherlv_4= 'except' ) ) ( (lv_right_5_0= ruleInstanceofExpr ) ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1192:5: this_InstanceofExpr_0= ruleInstanceofExpr ( ( ( () otherlv_2= 'intersect' ) | ( () otherlv_4= 'except' ) ) ( (lv_right_5_0= ruleInstanceofExpr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getIntersectExceptExprAccess().getInstanceofExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr2531);
            this_InstanceofExpr_0=ruleInstanceofExpr();

            state._fsp--;

             
                    current = this_InstanceofExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1200:1: ( ( ( () otherlv_2= 'intersect' ) | ( () otherlv_4= 'except' ) ) ( (lv_right_5_0= ruleInstanceofExpr ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=42 && LA18_0<=43)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1200:2: ( ( () otherlv_2= 'intersect' ) | ( () otherlv_4= 'except' ) ) ( (lv_right_5_0= ruleInstanceofExpr ) )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1200:2: ( ( () otherlv_2= 'intersect' ) | ( () otherlv_4= 'except' ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==42) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==43) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1200:3: ( () otherlv_2= 'intersect' )
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1200:3: ( () otherlv_2= 'intersect' )
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1200:4: () otherlv_2= 'intersect'
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1200:4: ()
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1201:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getIntersectExceptExprAccess().getIntersectLeftAction_1_0_0_0(),
            	                        current);
            	                

            	            }

            	            otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleIntersectExceptExpr2554); 

            	                	newLeafNode(otherlv_2, grammarAccess.getIntersectExceptExprAccess().getIntersectKeyword_1_0_0_1());
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1211:6: ( () otherlv_4= 'except' )
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1211:6: ( () otherlv_4= 'except' )
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1211:7: () otherlv_4= 'except'
            	            {
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1211:7: ()
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1212:5: 
            	            {

            	                    current = forceCreateModelElementAndSet(
            	                        grammarAccess.getIntersectExceptExprAccess().getExceptLeftAction_1_0_1_0(),
            	                        current);
            	                

            	            }

            	            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleIntersectExceptExpr2583); 

            	                	newLeafNode(otherlv_4, grammarAccess.getIntersectExceptExprAccess().getExceptKeyword_1_0_1_1());
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1221:3: ( (lv_right_5_0= ruleInstanceofExpr ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1222:1: (lv_right_5_0= ruleInstanceofExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1222:1: (lv_right_5_0= ruleInstanceofExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1223:3: lv_right_5_0= ruleInstanceofExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIntersectExceptExprAccess().getRightInstanceofExprParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr2606);
            	    lv_right_5_0=ruleInstanceofExpr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIntersectExceptExprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_5_0, 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1247:1: entryRuleInstanceofExpr returns [EObject current=null] : iv_ruleInstanceofExpr= ruleInstanceofExpr EOF ;
    public final EObject entryRuleInstanceofExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceofExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1248:2: (iv_ruleInstanceofExpr= ruleInstanceofExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1249:2: iv_ruleInstanceofExpr= ruleInstanceofExpr EOF
            {
             newCompositeNode(grammarAccess.getInstanceofExprRule()); 
            pushFollow(FOLLOW_ruleInstanceofExpr_in_entryRuleInstanceofExpr2644);
            iv_ruleInstanceofExpr=ruleInstanceofExpr();

            state._fsp--;

             current =iv_ruleInstanceofExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceofExpr2654); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1256:1: ruleInstanceofExpr returns [EObject current=null] : (this_TreatExpr_0= ruleTreatExpr ( () otherlv_2= 'instance' otherlv_3= 'of' ( (lv_right_4_0= ruleSequenceType ) ) )? ) ;
    public final EObject ruleInstanceofExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_TreatExpr_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1259:28: ( (this_TreatExpr_0= ruleTreatExpr ( () otherlv_2= 'instance' otherlv_3= 'of' ( (lv_right_4_0= ruleSequenceType ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1260:1: (this_TreatExpr_0= ruleTreatExpr ( () otherlv_2= 'instance' otherlv_3= 'of' ( (lv_right_4_0= ruleSequenceType ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1260:1: (this_TreatExpr_0= ruleTreatExpr ( () otherlv_2= 'instance' otherlv_3= 'of' ( (lv_right_4_0= ruleSequenceType ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1261:5: this_TreatExpr_0= ruleTreatExpr ( () otherlv_2= 'instance' otherlv_3= 'of' ( (lv_right_4_0= ruleSequenceType ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getInstanceofExprAccess().getTreatExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleTreatExpr_in_ruleInstanceofExpr2701);
            this_TreatExpr_0=ruleTreatExpr();

            state._fsp--;

             
                    current = this_TreatExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1269:1: ( () otherlv_2= 'instance' otherlv_3= 'of' ( (lv_right_4_0= ruleSequenceType ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==44) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1269:2: () otherlv_2= 'instance' otherlv_3= 'of' ( (lv_right_4_0= ruleSequenceType ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1269:2: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1270:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getInstanceofExprAccess().getInstanceofLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,44,FOLLOW_44_in_ruleInstanceofExpr2722); 

                        	newLeafNode(otherlv_2, grammarAccess.getInstanceofExprAccess().getInstanceKeyword_1_1());
                        
                    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleInstanceofExpr2734); 

                        	newLeafNode(otherlv_3, grammarAccess.getInstanceofExprAccess().getOfKeyword_1_2());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1283:1: ( (lv_right_4_0= ruleSequenceType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1284:1: (lv_right_4_0= ruleSequenceType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1284:1: (lv_right_4_0= ruleSequenceType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1285:3: lv_right_4_0= ruleSequenceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstanceofExprAccess().getRightSequenceTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequenceType_in_ruleInstanceofExpr2755);
                    lv_right_4_0=ruleSequenceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstanceofExprRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_4_0, 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1309:1: entryRuleTreatExpr returns [EObject current=null] : iv_ruleTreatExpr= ruleTreatExpr EOF ;
    public final EObject entryRuleTreatExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTreatExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1310:2: (iv_ruleTreatExpr= ruleTreatExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1311:2: iv_ruleTreatExpr= ruleTreatExpr EOF
            {
             newCompositeNode(grammarAccess.getTreatExprRule()); 
            pushFollow(FOLLOW_ruleTreatExpr_in_entryRuleTreatExpr2793);
            iv_ruleTreatExpr=ruleTreatExpr();

            state._fsp--;

             current =iv_ruleTreatExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTreatExpr2803); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1318:1: ruleTreatExpr returns [EObject current=null] : (this_CastableExpr_0= ruleCastableExpr ( () otherlv_2= 'treat' otherlv_3= 'as' ( (lv_right_4_0= ruleSequenceType ) ) )? ) ;
    public final EObject ruleTreatExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_CastableExpr_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1321:28: ( (this_CastableExpr_0= ruleCastableExpr ( () otherlv_2= 'treat' otherlv_3= 'as' ( (lv_right_4_0= ruleSequenceType ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1322:1: (this_CastableExpr_0= ruleCastableExpr ( () otherlv_2= 'treat' otherlv_3= 'as' ( (lv_right_4_0= ruleSequenceType ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1322:1: (this_CastableExpr_0= ruleCastableExpr ( () otherlv_2= 'treat' otherlv_3= 'as' ( (lv_right_4_0= ruleSequenceType ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1323:5: this_CastableExpr_0= ruleCastableExpr ( () otherlv_2= 'treat' otherlv_3= 'as' ( (lv_right_4_0= ruleSequenceType ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getTreatExprAccess().getCastableExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCastableExpr_in_ruleTreatExpr2850);
            this_CastableExpr_0=ruleCastableExpr();

            state._fsp--;

             
                    current = this_CastableExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1331:1: ( () otherlv_2= 'treat' otherlv_3= 'as' ( (lv_right_4_0= ruleSequenceType ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==46) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1331:2: () otherlv_2= 'treat' otherlv_3= 'as' ( (lv_right_4_0= ruleSequenceType ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1331:2: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1332:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getTreatExprAccess().getTreatAsLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleTreatExpr2871); 

                        	newLeafNode(otherlv_2, grammarAccess.getTreatExprAccess().getTreatKeyword_1_1());
                        
                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleTreatExpr2883); 

                        	newLeafNode(otherlv_3, grammarAccess.getTreatExprAccess().getAsKeyword_1_2());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1345:1: ( (lv_right_4_0= ruleSequenceType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1346:1: (lv_right_4_0= ruleSequenceType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1346:1: (lv_right_4_0= ruleSequenceType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1347:3: lv_right_4_0= ruleSequenceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTreatExprAccess().getRightSequenceTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSequenceType_in_ruleTreatExpr2904);
                    lv_right_4_0=ruleSequenceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTreatExprRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_4_0, 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1371:1: entryRuleCastableExpr returns [EObject current=null] : iv_ruleCastableExpr= ruleCastableExpr EOF ;
    public final EObject entryRuleCastableExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastableExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1372:2: (iv_ruleCastableExpr= ruleCastableExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1373:2: iv_ruleCastableExpr= ruleCastableExpr EOF
            {
             newCompositeNode(grammarAccess.getCastableExprRule()); 
            pushFollow(FOLLOW_ruleCastableExpr_in_entryRuleCastableExpr2942);
            iv_ruleCastableExpr=ruleCastableExpr();

            state._fsp--;

             current =iv_ruleCastableExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastableExpr2952); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1380:1: ruleCastableExpr returns [EObject current=null] : (this_CastExpr_0= ruleCastExpr ( () otherlv_2= 'castable' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )? ) ;
    public final EObject ruleCastableExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_CastExpr_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1383:28: ( (this_CastExpr_0= ruleCastExpr ( () otherlv_2= 'castable' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1384:1: (this_CastExpr_0= ruleCastExpr ( () otherlv_2= 'castable' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1384:1: (this_CastExpr_0= ruleCastExpr ( () otherlv_2= 'castable' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1385:5: this_CastExpr_0= ruleCastExpr ( () otherlv_2= 'castable' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getCastableExprAccess().getCastExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCastExpr_in_ruleCastableExpr2999);
            this_CastExpr_0=ruleCastExpr();

            state._fsp--;

             
                    current = this_CastExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1393:1: ( () otherlv_2= 'castable' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1393:2: () otherlv_2= 'castable' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1393:2: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1394:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getCastableExprAccess().getCastableLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleCastableExpr3020); 

                        	newLeafNode(otherlv_2, grammarAccess.getCastableExprAccess().getCastableKeyword_1_1());
                        
                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleCastableExpr3032); 

                        	newLeafNode(otherlv_3, grammarAccess.getCastableExprAccess().getAsKeyword_1_2());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1407:1: ( (lv_right_4_0= ruleSingleType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1408:1: (lv_right_4_0= ruleSingleType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1408:1: (lv_right_4_0= ruleSingleType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1409:3: lv_right_4_0= ruleSingleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastableExprAccess().getRightSingleTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSingleType_in_ruleCastableExpr3053);
                    lv_right_4_0=ruleSingleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCastableExprRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_4_0, 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1433:1: entryRuleCastExpr returns [EObject current=null] : iv_ruleCastExpr= ruleCastExpr EOF ;
    public final EObject entryRuleCastExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1434:2: (iv_ruleCastExpr= ruleCastExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1435:2: iv_ruleCastExpr= ruleCastExpr EOF
            {
             newCompositeNode(grammarAccess.getCastExprRule()); 
            pushFollow(FOLLOW_ruleCastExpr_in_entryRuleCastExpr3091);
            iv_ruleCastExpr=ruleCastExpr();

            state._fsp--;

             current =iv_ruleCastExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastExpr3101); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1442:1: ruleCastExpr returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( () otherlv_2= 'cast' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )? ) ;
    public final EObject ruleCastExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_UnaryExpr_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1445:28: ( (this_UnaryExpr_0= ruleUnaryExpr ( () otherlv_2= 'cast' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1446:1: (this_UnaryExpr_0= ruleUnaryExpr ( () otherlv_2= 'cast' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1446:1: (this_UnaryExpr_0= ruleUnaryExpr ( () otherlv_2= 'cast' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1447:5: this_UnaryExpr_0= ruleUnaryExpr ( () otherlv_2= 'cast' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )?
            {
             
                    newCompositeNode(grammarAccess.getCastExprAccess().getUnaryExprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUnaryExpr_in_ruleCastExpr3148);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;

             
                    current = this_UnaryExpr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1455:1: ( () otherlv_2= 'cast' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==49) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1455:2: () otherlv_2= 'cast' otherlv_3= 'as' ( (lv_right_4_0= ruleSingleType ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1455:2: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1456:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getCastExprAccess().getCastAsLeftAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleCastExpr3169); 

                        	newLeafNode(otherlv_2, grammarAccess.getCastExprAccess().getCastKeyword_1_1());
                        
                    otherlv_3=(Token)match(input,47,FOLLOW_47_in_ruleCastExpr3181); 

                        	newLeafNode(otherlv_3, grammarAccess.getCastExprAccess().getAsKeyword_1_2());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1469:1: ( (lv_right_4_0= ruleSingleType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1470:1: (lv_right_4_0= ruleSingleType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1470:1: (lv_right_4_0= ruleSingleType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1471:3: lv_right_4_0= ruleSingleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastExprAccess().getRightSingleTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSingleType_in_ruleCastExpr3202);
                    lv_right_4_0=ruleSingleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCastExprRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_4_0, 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1495:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1496:2: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1497:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
             newCompositeNode(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr3240);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;

             current =iv_ruleUnaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr3250); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1504:1: ruleUnaryExpr returns [EObject current=null] : ( ( ( (lv_unaryOps_0_1= '-' | lv_unaryOps_0_2= '+' ) ) )* ( (lv_value_1_0= ruleValueExpr ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token lv_unaryOps_0_1=null;
        Token lv_unaryOps_0_2=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1507:28: ( ( ( ( (lv_unaryOps_0_1= '-' | lv_unaryOps_0_2= '+' ) ) )* ( (lv_value_1_0= ruleValueExpr ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1508:1: ( ( ( (lv_unaryOps_0_1= '-' | lv_unaryOps_0_2= '+' ) ) )* ( (lv_value_1_0= ruleValueExpr ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1508:1: ( ( ( (lv_unaryOps_0_1= '-' | lv_unaryOps_0_2= '+' ) ) )* ( (lv_value_1_0= ruleValueExpr ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1508:2: ( ( (lv_unaryOps_0_1= '-' | lv_unaryOps_0_2= '+' ) ) )* ( (lv_value_1_0= ruleValueExpr ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1508:2: ( ( (lv_unaryOps_0_1= '-' | lv_unaryOps_0_2= '+' ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=34 && LA24_0<=35)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1509:1: ( (lv_unaryOps_0_1= '-' | lv_unaryOps_0_2= '+' ) )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1509:1: ( (lv_unaryOps_0_1= '-' | lv_unaryOps_0_2= '+' ) )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1510:1: (lv_unaryOps_0_1= '-' | lv_unaryOps_0_2= '+' )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1510:1: (lv_unaryOps_0_1= '-' | lv_unaryOps_0_2= '+' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==35) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==34) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1511:3: lv_unaryOps_0_1= '-'
            	            {
            	            lv_unaryOps_0_1=(Token)match(input,35,FOLLOW_35_in_ruleUnaryExpr3295); 

            	                    newLeafNode(lv_unaryOps_0_1, grammarAccess.getUnaryExprAccess().getUnaryOpsHyphenMinusKeyword_0_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getUnaryExprRule());
            	            	        }
            	                   		addWithLastConsumed(current, "unaryOps", lv_unaryOps_0_1, null);
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1523:8: lv_unaryOps_0_2= '+'
            	            {
            	            lv_unaryOps_0_2=(Token)match(input,34,FOLLOW_34_in_ruleUnaryExpr3324); 

            	                    newLeafNode(lv_unaryOps_0_2, grammarAccess.getUnaryExprAccess().getUnaryOpsPlusSignKeyword_0_0_1());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getUnaryExprRule());
            	            	        }
            	                   		addWithLastConsumed(current, "unaryOps", lv_unaryOps_0_2, null);
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1538:3: ( (lv_value_1_0= ruleValueExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1539:1: (lv_value_1_0= ruleValueExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1539:1: (lv_value_1_0= ruleValueExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1540:3: lv_value_1_0= ruleValueExpr
            {
             
            	        newCompositeNode(grammarAccess.getUnaryExprAccess().getValueValueExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleValueExpr_in_ruleUnaryExpr3362);
            lv_value_1_0=ruleValueExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryExprRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1564:1: entryRuleValueExpr returns [EObject current=null] : iv_ruleValueExpr= ruleValueExpr EOF ;
    public final EObject entryRuleValueExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1565:2: (iv_ruleValueExpr= ruleValueExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1566:2: iv_ruleValueExpr= ruleValueExpr EOF
            {
             newCompositeNode(grammarAccess.getValueExprRule()); 
            pushFollow(FOLLOW_ruleValueExpr_in_entryRuleValueExpr3398);
            iv_ruleValueExpr=ruleValueExpr();

            state._fsp--;

             current =iv_ruleValueExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpr3408); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1573:1: ruleValueExpr returns [EObject current=null] : ( (lv_value_0_0= rulePathExpr ) ) ;
    public final EObject ruleValueExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1576:28: ( ( (lv_value_0_0= rulePathExpr ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1577:1: ( (lv_value_0_0= rulePathExpr ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1577:1: ( (lv_value_0_0= rulePathExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1578:1: (lv_value_0_0= rulePathExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1578:1: (lv_value_0_0= rulePathExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1579:3: lv_value_0_0= rulePathExpr
            {
             
            	        newCompositeNode(grammarAccess.getValueExprAccess().getValuePathExprParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_rulePathExpr_in_ruleValueExpr3453);
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


    // $ANTLR start "entryRuleGeneralComp"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1603:1: entryRuleGeneralComp returns [EObject current=null] : iv_ruleGeneralComp= ruleGeneralComp EOF ;
    public final EObject entryRuleGeneralComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralComp = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1604:2: (iv_ruleGeneralComp= ruleGeneralComp EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1605:2: iv_ruleGeneralComp= ruleGeneralComp EOF
            {
             newCompositeNode(grammarAccess.getGeneralCompRule()); 
            pushFollow(FOLLOW_ruleGeneralComp_in_entryRuleGeneralComp3488);
            iv_ruleGeneralComp=ruleGeneralComp();

            state._fsp--;

             current =iv_ruleGeneralComp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralComp3498); 

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
    // $ANTLR end "entryRuleGeneralComp"


    // $ANTLR start "ruleGeneralComp"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1612:1: ruleGeneralComp returns [EObject current=null] : ( ( (lv_op_0_0= '=' ) ) | ( (lv_op_1_0= '!=' ) ) | ( (lv_op_2_0= '<' ) ) | ( (lv_op_3_0= '<=' ) ) | ( (lv_op_4_0= '>' ) ) | ( (lv_op_5_0= '>=' ) ) ) ;
    public final EObject ruleGeneralComp() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token lv_op_1_0=null;
        Token lv_op_2_0=null;
        Token lv_op_3_0=null;
        Token lv_op_4_0=null;
        Token lv_op_5_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1615:28: ( ( ( (lv_op_0_0= '=' ) ) | ( (lv_op_1_0= '!=' ) ) | ( (lv_op_2_0= '<' ) ) | ( (lv_op_3_0= '<=' ) ) | ( (lv_op_4_0= '>' ) ) | ( (lv_op_5_0= '>=' ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1616:1: ( ( (lv_op_0_0= '=' ) ) | ( (lv_op_1_0= '!=' ) ) | ( (lv_op_2_0= '<' ) ) | ( (lv_op_3_0= '<=' ) ) | ( (lv_op_4_0= '>' ) ) | ( (lv_op_5_0= '>=' ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1616:1: ( ( (lv_op_0_0= '=' ) ) | ( (lv_op_1_0= '!=' ) ) | ( (lv_op_2_0= '<' ) ) | ( (lv_op_3_0= '<=' ) ) | ( (lv_op_4_0= '>' ) ) | ( (lv_op_5_0= '>=' ) ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt25=1;
                }
                break;
            case 51:
                {
                alt25=2;
                }
                break;
            case 52:
                {
                alt25=3;
                }
                break;
            case 53:
                {
                alt25=4;
                }
                break;
            case 54:
                {
                alt25=5;
                }
                break;
            case 55:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1616:2: ( (lv_op_0_0= '=' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1616:2: ( (lv_op_0_0= '=' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1617:1: (lv_op_0_0= '=' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1617:1: (lv_op_0_0= '=' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1618:3: lv_op_0_0= '='
                    {
                    lv_op_0_0=(Token)match(input,50,FOLLOW_50_in_ruleGeneralComp3541); 

                            newLeafNode(lv_op_0_0, grammarAccess.getGeneralCompAccess().getOpEqualsSignKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneralCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_0_0, "=");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1632:6: ( (lv_op_1_0= '!=' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1632:6: ( (lv_op_1_0= '!=' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1633:1: (lv_op_1_0= '!=' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1633:1: (lv_op_1_0= '!=' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1634:3: lv_op_1_0= '!='
                    {
                    lv_op_1_0=(Token)match(input,51,FOLLOW_51_in_ruleGeneralComp3578); 

                            newLeafNode(lv_op_1_0, grammarAccess.getGeneralCompAccess().getOpExclamationMarkEqualsSignKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneralCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_1_0, "!=");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1648:6: ( (lv_op_2_0= '<' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1648:6: ( (lv_op_2_0= '<' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1649:1: (lv_op_2_0= '<' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1649:1: (lv_op_2_0= '<' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1650:3: lv_op_2_0= '<'
                    {
                    lv_op_2_0=(Token)match(input,52,FOLLOW_52_in_ruleGeneralComp3615); 

                            newLeafNode(lv_op_2_0, grammarAccess.getGeneralCompAccess().getOpLessThanSignKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneralCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_2_0, "<");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1664:6: ( (lv_op_3_0= '<=' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1664:6: ( (lv_op_3_0= '<=' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1665:1: (lv_op_3_0= '<=' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1665:1: (lv_op_3_0= '<=' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1666:3: lv_op_3_0= '<='
                    {
                    lv_op_3_0=(Token)match(input,53,FOLLOW_53_in_ruleGeneralComp3652); 

                            newLeafNode(lv_op_3_0, grammarAccess.getGeneralCompAccess().getOpLessThanSignEqualsSignKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneralCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_3_0, "<=");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1680:6: ( (lv_op_4_0= '>' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1680:6: ( (lv_op_4_0= '>' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1681:1: (lv_op_4_0= '>' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1681:1: (lv_op_4_0= '>' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1682:3: lv_op_4_0= '>'
                    {
                    lv_op_4_0=(Token)match(input,54,FOLLOW_54_in_ruleGeneralComp3689); 

                            newLeafNode(lv_op_4_0, grammarAccess.getGeneralCompAccess().getOpGreaterThanSignKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneralCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_4_0, ">");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1696:6: ( (lv_op_5_0= '>=' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1696:6: ( (lv_op_5_0= '>=' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1697:1: (lv_op_5_0= '>=' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1697:1: (lv_op_5_0= '>=' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1698:3: lv_op_5_0= '>='
                    {
                    lv_op_5_0=(Token)match(input,55,FOLLOW_55_in_ruleGeneralComp3726); 

                            newLeafNode(lv_op_5_0, grammarAccess.getGeneralCompAccess().getOpGreaterThanSignEqualsSignKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneralCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_5_0, ">=");
                    	    

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
    // $ANTLR end "ruleGeneralComp"


    // $ANTLR start "entryRuleValueComp"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1719:1: entryRuleValueComp returns [EObject current=null] : iv_ruleValueComp= ruleValueComp EOF ;
    public final EObject entryRuleValueComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueComp = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1720:2: (iv_ruleValueComp= ruleValueComp EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1721:2: iv_ruleValueComp= ruleValueComp EOF
            {
             newCompositeNode(grammarAccess.getValueCompRule()); 
            pushFollow(FOLLOW_ruleValueComp_in_entryRuleValueComp3775);
            iv_ruleValueComp=ruleValueComp();

            state._fsp--;

             current =iv_ruleValueComp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueComp3785); 

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
    // $ANTLR end "entryRuleValueComp"


    // $ANTLR start "ruleValueComp"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1728:1: ruleValueComp returns [EObject current=null] : ( ( (lv_op_0_0= 'eq' ) ) | ( (lv_op_1_0= 'ne' ) ) | ( (lv_op_2_0= 'lt' ) ) | ( (lv_op_3_0= 'le' ) ) | ( (lv_op_4_0= 'gt' ) ) | ( (lv_op_5_0= 'ge' ) ) ) ;
    public final EObject ruleValueComp() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token lv_op_1_0=null;
        Token lv_op_2_0=null;
        Token lv_op_3_0=null;
        Token lv_op_4_0=null;
        Token lv_op_5_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1731:28: ( ( ( (lv_op_0_0= 'eq' ) ) | ( (lv_op_1_0= 'ne' ) ) | ( (lv_op_2_0= 'lt' ) ) | ( (lv_op_3_0= 'le' ) ) | ( (lv_op_4_0= 'gt' ) ) | ( (lv_op_5_0= 'ge' ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1732:1: ( ( (lv_op_0_0= 'eq' ) ) | ( (lv_op_1_0= 'ne' ) ) | ( (lv_op_2_0= 'lt' ) ) | ( (lv_op_3_0= 'le' ) ) | ( (lv_op_4_0= 'gt' ) ) | ( (lv_op_5_0= 'ge' ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1732:1: ( ( (lv_op_0_0= 'eq' ) ) | ( (lv_op_1_0= 'ne' ) ) | ( (lv_op_2_0= 'lt' ) ) | ( (lv_op_3_0= 'le' ) ) | ( (lv_op_4_0= 'gt' ) ) | ( (lv_op_5_0= 'ge' ) ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt26=1;
                }
                break;
            case 57:
                {
                alt26=2;
                }
                break;
            case 58:
                {
                alt26=3;
                }
                break;
            case 59:
                {
                alt26=4;
                }
                break;
            case 60:
                {
                alt26=5;
                }
                break;
            case 61:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1732:2: ( (lv_op_0_0= 'eq' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1732:2: ( (lv_op_0_0= 'eq' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1733:1: (lv_op_0_0= 'eq' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1733:1: (lv_op_0_0= 'eq' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1734:3: lv_op_0_0= 'eq'
                    {
                    lv_op_0_0=(Token)match(input,56,FOLLOW_56_in_ruleValueComp3828); 

                            newLeafNode(lv_op_0_0, grammarAccess.getValueCompAccess().getOpEqKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_0_0, "eq");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1748:6: ( (lv_op_1_0= 'ne' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1748:6: ( (lv_op_1_0= 'ne' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1749:1: (lv_op_1_0= 'ne' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1749:1: (lv_op_1_0= 'ne' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1750:3: lv_op_1_0= 'ne'
                    {
                    lv_op_1_0=(Token)match(input,57,FOLLOW_57_in_ruleValueComp3865); 

                            newLeafNode(lv_op_1_0, grammarAccess.getValueCompAccess().getOpNeKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_1_0, "ne");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1764:6: ( (lv_op_2_0= 'lt' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1764:6: ( (lv_op_2_0= 'lt' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1765:1: (lv_op_2_0= 'lt' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1765:1: (lv_op_2_0= 'lt' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1766:3: lv_op_2_0= 'lt'
                    {
                    lv_op_2_0=(Token)match(input,58,FOLLOW_58_in_ruleValueComp3902); 

                            newLeafNode(lv_op_2_0, grammarAccess.getValueCompAccess().getOpLtKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_2_0, "lt");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1780:6: ( (lv_op_3_0= 'le' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1780:6: ( (lv_op_3_0= 'le' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1781:1: (lv_op_3_0= 'le' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1781:1: (lv_op_3_0= 'le' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1782:3: lv_op_3_0= 'le'
                    {
                    lv_op_3_0=(Token)match(input,59,FOLLOW_59_in_ruleValueComp3939); 

                            newLeafNode(lv_op_3_0, grammarAccess.getValueCompAccess().getOpLeKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_3_0, "le");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1796:6: ( (lv_op_4_0= 'gt' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1796:6: ( (lv_op_4_0= 'gt' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1797:1: (lv_op_4_0= 'gt' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1797:1: (lv_op_4_0= 'gt' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1798:3: lv_op_4_0= 'gt'
                    {
                    lv_op_4_0=(Token)match(input,60,FOLLOW_60_in_ruleValueComp3976); 

                            newLeafNode(lv_op_4_0, grammarAccess.getValueCompAccess().getOpGtKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_4_0, "gt");
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1812:6: ( (lv_op_5_0= 'ge' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1812:6: ( (lv_op_5_0= 'ge' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1813:1: (lv_op_5_0= 'ge' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1813:1: (lv_op_5_0= 'ge' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1814:3: lv_op_5_0= 'ge'
                    {
                    lv_op_5_0=(Token)match(input,61,FOLLOW_61_in_ruleValueComp4013); 

                            newLeafNode(lv_op_5_0, grammarAccess.getValueCompAccess().getOpGeKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_5_0, "ge");
                    	    

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
    // $ANTLR end "ruleValueComp"


    // $ANTLR start "entryRuleNodeComp"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1835:1: entryRuleNodeComp returns [EObject current=null] : iv_ruleNodeComp= ruleNodeComp EOF ;
    public final EObject entryRuleNodeComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeComp = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1836:2: (iv_ruleNodeComp= ruleNodeComp EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1837:2: iv_ruleNodeComp= ruleNodeComp EOF
            {
             newCompositeNode(grammarAccess.getNodeCompRule()); 
            pushFollow(FOLLOW_ruleNodeComp_in_entryRuleNodeComp4062);
            iv_ruleNodeComp=ruleNodeComp();

            state._fsp--;

             current =iv_ruleNodeComp; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeComp4072); 

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
    // $ANTLR end "entryRuleNodeComp"


    // $ANTLR start "ruleNodeComp"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1844:1: ruleNodeComp returns [EObject current=null] : ( ( (lv_op_0_0= 'is' ) ) | ( (lv_op_1_0= '<<' ) ) | ( (lv_op_2_0= '>>' ) ) ) ;
    public final EObject ruleNodeComp() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_0=null;
        Token lv_op_1_0=null;
        Token lv_op_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1847:28: ( ( ( (lv_op_0_0= 'is' ) ) | ( (lv_op_1_0= '<<' ) ) | ( (lv_op_2_0= '>>' ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1848:1: ( ( (lv_op_0_0= 'is' ) ) | ( (lv_op_1_0= '<<' ) ) | ( (lv_op_2_0= '>>' ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1848:1: ( ( (lv_op_0_0= 'is' ) ) | ( (lv_op_1_0= '<<' ) ) | ( (lv_op_2_0= '>>' ) ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt27=1;
                }
                break;
            case 63:
                {
                alt27=2;
                }
                break;
            case 64:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1848:2: ( (lv_op_0_0= 'is' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1848:2: ( (lv_op_0_0= 'is' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1849:1: (lv_op_0_0= 'is' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1849:1: (lv_op_0_0= 'is' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1850:3: lv_op_0_0= 'is'
                    {
                    lv_op_0_0=(Token)match(input,62,FOLLOW_62_in_ruleNodeComp4115); 

                            newLeafNode(lv_op_0_0, grammarAccess.getNodeCompAccess().getOpIsKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_0_0, "is");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1864:6: ( (lv_op_1_0= '<<' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1864:6: ( (lv_op_1_0= '<<' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1865:1: (lv_op_1_0= '<<' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1865:1: (lv_op_1_0= '<<' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1866:3: lv_op_1_0= '<<'
                    {
                    lv_op_1_0=(Token)match(input,63,FOLLOW_63_in_ruleNodeComp4152); 

                            newLeafNode(lv_op_1_0, grammarAccess.getNodeCompAccess().getOpLessThanSignLessThanSignKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_1_0, "<<");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1880:6: ( (lv_op_2_0= '>>' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1880:6: ( (lv_op_2_0= '>>' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1881:1: (lv_op_2_0= '>>' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1881:1: (lv_op_2_0= '>>' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1882:3: lv_op_2_0= '>>'
                    {
                    lv_op_2_0=(Token)match(input,64,FOLLOW_64_in_ruleNodeComp4189); 

                            newLeafNode(lv_op_2_0, grammarAccess.getNodeCompAccess().getOpGreaterThanSignGreaterThanSignKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNodeCompRule());
                    	        }
                           		setWithLastConsumed(current, "op", lv_op_2_0, ">>");
                    	    

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
    // $ANTLR end "ruleNodeComp"


    // $ANTLR start "entryRulePathExpr"
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1903:1: entryRulePathExpr returns [EObject current=null] : iv_rulePathExpr= rulePathExpr EOF ;
    public final EObject entryRulePathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1904:2: (iv_rulePathExpr= rulePathExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1905:2: iv_rulePathExpr= rulePathExpr EOF
            {
             newCompositeNode(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr4238);
            iv_rulePathExpr=rulePathExpr();

            state._fsp--;

             current =iv_rulePathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr4248); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1912:1: rulePathExpr returns [EObject current=null] : ( (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () ) | (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () ) | (this_RelativePathExpr_6= ruleRelativePathExpr () ) ) ;
    public final EObject rulePathExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_RelativePathExpr_1 = null;

        EObject this_RelativePathExpr_4 = null;

        EObject this_RelativePathExpr_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1915:28: ( ( (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () ) | (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () ) | (this_RelativePathExpr_6= ruleRelativePathExpr () ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1916:1: ( (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () ) | (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () ) | (this_RelativePathExpr_6= ruleRelativePathExpr () ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1916:1: ( (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () ) | (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () ) | (this_RelativePathExpr_6= ruleRelativePathExpr () ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt28=1;
                }
                break;
            case 66:
                {
                alt28=2;
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
            case 21:
            case 27:
            case 36:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1916:2: (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1916:2: (otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1916:4: otherlv_0= '/' this_RelativePathExpr_1= ruleRelativePathExpr ()
                    {
                    otherlv_0=(Token)match(input,65,FOLLOW_65_in_rulePathExpr4286); 

                        	newLeafNode(otherlv_0, grammarAccess.getPathExprAccess().getSolidusKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPathExprAccess().getRelativePathExprParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleRelativePathExpr_in_rulePathExpr4308);
                    this_RelativePathExpr_1=ruleRelativePathExpr();

                    state._fsp--;

                     
                            current = this_RelativePathExpr_1; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1929:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1930:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPathExprAccess().getRelSingleRelPathExprAction_0_2(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1936:6: (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1936:6: (otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1936:8: otherlv_3= '//' this_RelativePathExpr_4= ruleRelativePathExpr ()
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_rulePathExpr4336); 

                        	newLeafNode(otherlv_3, grammarAccess.getPathExprAccess().getSolidusSolidusKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPathExprAccess().getRelativePathExprParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleRelativePathExpr_in_rulePathExpr4358);
                    this_RelativePathExpr_4=ruleRelativePathExpr();

                    state._fsp--;

                     
                            current = this_RelativePathExpr_4; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1949:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1950:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getPathExprAccess().getRelDoubleRelPathExprAction_1_2(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1956:6: (this_RelativePathExpr_6= ruleRelativePathExpr () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1956:6: (this_RelativePathExpr_6= ruleRelativePathExpr () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1957:5: this_RelativePathExpr_6= ruleRelativePathExpr ()
                    {
                     
                            newCompositeNode(grammarAccess.getPathExprAccess().getRelativePathExprParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_ruleRelativePathExpr_in_rulePathExpr4396);
                    this_RelativePathExpr_6=ruleRelativePathExpr();

                    state._fsp--;

                     
                            current = this_RelativePathExpr_6; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1965:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1966:5: 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1979:1: entryRuleRelativePathExpr returns [EObject current=null] : iv_ruleRelativePathExpr= ruleRelativePathExpr EOF ;
    public final EObject entryRuleRelativePathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativePathExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1980:2: (iv_ruleRelativePathExpr= ruleRelativePathExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1981:2: iv_ruleRelativePathExpr= ruleRelativePathExpr EOF
            {
             newCompositeNode(grammarAccess.getRelativePathExprRule()); 
            pushFollow(FOLLOW_ruleRelativePathExpr_in_entryRuleRelativePathExpr4441);
            iv_ruleRelativePathExpr=ruleRelativePathExpr();

            state._fsp--;

             current =iv_ruleRelativePathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelativePathExpr4451); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1988:1: ruleRelativePathExpr returns [EObject current=null] : ( ( (lv_step_0_0= ruleStepExpr ) ) ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )* ) ;
    public final EObject ruleRelativePathExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_step_0_0 = null;

        EObject lv_extraSteps_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1991:28: ( ( ( (lv_step_0_0= ruleStepExpr ) ) ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1992:1: ( ( (lv_step_0_0= ruleStepExpr ) ) ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1992:1: ( ( (lv_step_0_0= ruleStepExpr ) ) ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1992:2: ( (lv_step_0_0= ruleStepExpr ) ) ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1992:2: ( (lv_step_0_0= ruleStepExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1993:1: (lv_step_0_0= ruleStepExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1993:1: (lv_step_0_0= ruleStepExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:1994:3: lv_step_0_0= ruleStepExpr
            {
             
            	        newCompositeNode(grammarAccess.getRelativePathExprAccess().getStepStepExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStepExpr_in_ruleRelativePathExpr4497);
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

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2010:2: ( (lv_extraSteps_1_0= ruleExtraStepExpr ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=65 && LA29_0<=66)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2011:1: (lv_extraSteps_1_0= ruleExtraStepExpr )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2011:1: (lv_extraSteps_1_0= ruleExtraStepExpr )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2012:3: lv_extraSteps_1_0= ruleExtraStepExpr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelativePathExprAccess().getExtraStepsExtraStepExprParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExtraStepExpr_in_ruleRelativePathExpr4518);
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
            	    break loop29;
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2036:1: entryRuleExtraStepExpr returns [EObject current=null] : iv_ruleExtraStepExpr= ruleExtraStepExpr EOF ;
    public final EObject entryRuleExtraStepExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtraStepExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2037:2: (iv_ruleExtraStepExpr= ruleExtraStepExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2038:2: iv_ruleExtraStepExpr= ruleExtraStepExpr EOF
            {
             newCompositeNode(grammarAccess.getExtraStepExprRule()); 
            pushFollow(FOLLOW_ruleExtraStepExpr_in_entryRuleExtraStepExpr4555);
            iv_ruleExtraStepExpr=ruleExtraStepExpr();

            state._fsp--;

             current =iv_ruleExtraStepExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtraStepExpr4565); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2045:1: ruleExtraStepExpr returns [EObject current=null] : ( (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () ) | (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () ) ) ;
    public final EObject ruleExtraStepExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_StepExpr_1 = null;

        EObject this_StepExpr_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2048:28: ( ( (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () ) | (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2049:1: ( (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () ) | (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2049:1: ( (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () ) | (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==65) ) {
                alt30=1;
            }
            else if ( (LA30_0==66) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2049:2: (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2049:2: (otherlv_0= '/' this_StepExpr_1= ruleStepExpr () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2049:4: otherlv_0= '/' this_StepExpr_1= ruleStepExpr ()
                    {
                    otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleExtraStepExpr4603); 

                        	newLeafNode(otherlv_0, grammarAccess.getExtraStepExprAccess().getSolidusKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getExtraStepExprAccess().getStepExprParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleStepExpr_in_ruleExtraStepExpr4625);
                    this_StepExpr_1=ruleStepExpr();

                    state._fsp--;

                     
                            current = this_StepExpr_1; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2062:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2063:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getExtraStepExprAccess().getSingleStepAction_0_2(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2069:6: (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2069:6: (otherlv_3= '//' this_StepExpr_4= ruleStepExpr () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2069:8: otherlv_3= '//' this_StepExpr_4= ruleStepExpr ()
                    {
                    otherlv_3=(Token)match(input,66,FOLLOW_66_in_ruleExtraStepExpr4653); 

                        	newLeafNode(otherlv_3, grammarAccess.getExtraStepExprAccess().getSolidusSolidusKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getExtraStepExprAccess().getStepExprParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleStepExpr_in_ruleExtraStepExpr4675);
                    this_StepExpr_4=ruleStepExpr();

                    state._fsp--;

                     
                            current = this_StepExpr_4; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2082:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2083:5: 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2096:1: entryRuleStepExpr returns [EObject current=null] : iv_ruleStepExpr= ruleStepExpr EOF ;
    public final EObject entryRuleStepExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2097:2: (iv_ruleStepExpr= ruleStepExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2098:2: iv_ruleStepExpr= ruleStepExpr EOF
            {
             newCompositeNode(grammarAccess.getStepExprRule()); 
            pushFollow(FOLLOW_ruleStepExpr_in_entryRuleStepExpr4720);
            iv_ruleStepExpr=ruleStepExpr();

            state._fsp--;

             current =iv_ruleStepExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStepExpr4730); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2105:1: ruleStepExpr returns [EObject current=null] : ( ( (lv_stepExpr_0_0= ruleFilterExpr ) ) | ( (lv_stepExpr_1_0= ruleAxisStep ) ) ) ;
    public final EObject ruleStepExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_stepExpr_0_0 = null;

        EObject lv_stepExpr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2108:28: ( ( ( (lv_stepExpr_0_0= ruleFilterExpr ) ) | ( (lv_stepExpr_1_0= ruleAxisStep ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2109:1: ( ( (lv_stepExpr_0_0= ruleFilterExpr ) ) | ( (lv_stepExpr_1_0= ruleAxisStep ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2109:1: ( ( (lv_stepExpr_0_0= ruleFilterExpr ) ) | ( (lv_stepExpr_1_0= ruleAxisStep ) ) )
            int alt31=2;
            switch ( input.LA(1) ) {
            case RULE_CONTEXTITEMEXPR:
            case RULE_STRINGLITERAL:
            case RULE_INTLITERAL:
            case RULE_DECIMALLITERAL:
            case RULE_DOUBLELITERAL:
            case 21:
            case 27:
                {
                alt31=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 77:
                    {
                    int LA31_4 = input.LA(3);

                    if ( (LA31_4==RULE_ID) ) {
                        int LA31_5 = input.LA(4);

                        if ( (LA31_5==EOF||(LA31_5>=18 && LA31_5<=19)||LA31_5==25||LA31_5==28||(LA31_5>=30 && LA31_5<=44)||LA31_5==46||(LA31_5>=48 && LA31_5<=66)||(LA31_5>=78 && LA31_5<=79)) ) {
                            alt31=2;
                        }
                        else if ( (LA31_5==27) ) {
                            alt31=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 31, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA31_4==36) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 18:
                case 19:
                case 25:
                case 28:
                case 30:
                case 31:
                case 32:
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
                case 46:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 78:
                case 79:
                    {
                    alt31=2;
                    }
                    break;
                case 27:
                    {
                    alt31=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REVERSEAXIS:
            case RULE_ABBREVREVERSESTEP:
            case RULE_COMMENTTEST:
            case RULE_TEXTTEST:
            case RULE_ANYKINDTEST:
            case 36:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt31=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2109:2: ( (lv_stepExpr_0_0= ruleFilterExpr ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2109:2: ( (lv_stepExpr_0_0= ruleFilterExpr ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2110:1: (lv_stepExpr_0_0= ruleFilterExpr )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2110:1: (lv_stepExpr_0_0= ruleFilterExpr )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2111:3: lv_stepExpr_0_0= ruleFilterExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepExprAccess().getStepExprFilterExprParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFilterExpr_in_ruleStepExpr4776);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2128:6: ( (lv_stepExpr_1_0= ruleAxisStep ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2128:6: ( (lv_stepExpr_1_0= ruleAxisStep ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2129:1: (lv_stepExpr_1_0= ruleAxisStep )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2129:1: (lv_stepExpr_1_0= ruleAxisStep )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2130:3: lv_stepExpr_1_0= ruleAxisStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getStepExprAccess().getStepExprAxisStepParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAxisStep_in_ruleStepExpr4803);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2154:1: entryRuleAxisStep returns [EObject current=null] : iv_ruleAxisStep= ruleAxisStep EOF ;
    public final EObject entryRuleAxisStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxisStep = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2155:2: (iv_ruleAxisStep= ruleAxisStep EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2156:2: iv_ruleAxisStep= ruleAxisStep EOF
            {
             newCompositeNode(grammarAccess.getAxisStepRule()); 
            pushFollow(FOLLOW_ruleAxisStep_in_entryRuleAxisStep4839);
            iv_ruleAxisStep=ruleAxisStep();

            state._fsp--;

             current =iv_ruleAxisStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAxisStep4849); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2163:1: ruleAxisStep returns [EObject current=null] : ( ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) ) ( (lv_predicateList_2_0= rulePredicateList ) ) ) ;
    public final EObject ruleAxisStep() throws RecognitionException {
        EObject current = null;

        EObject lv_step_0_0 = null;

        EObject lv_step_1_0 = null;

        EObject lv_predicateList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2166:28: ( ( ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) ) ( (lv_predicateList_2_0= rulePredicateList ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2167:1: ( ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) ) ( (lv_predicateList_2_0= rulePredicateList ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2167:1: ( ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) ) ( (lv_predicateList_2_0= rulePredicateList ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2167:2: ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) ) ( (lv_predicateList_2_0= rulePredicateList ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2167:2: ( ( (lv_step_0_0= ruleReverseStep ) ) | ( (lv_step_1_0= ruleForwardStep ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_REVERSEAXIS && LA32_0<=RULE_ABBREVREVERSESTEP)) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_ANYKINDTEST)||LA32_0==36||LA32_0==67||(LA32_0>=69 && LA32_0<=76)||(LA32_0>=81 && LA32_0<=85)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2167:3: ( (lv_step_0_0= ruleReverseStep ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2167:3: ( (lv_step_0_0= ruleReverseStep ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2168:1: (lv_step_0_0= ruleReverseStep )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2168:1: (lv_step_0_0= ruleReverseStep )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2169:3: lv_step_0_0= ruleReverseStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxisStepAccess().getStepReverseStepParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReverseStep_in_ruleAxisStep4896);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2186:6: ( (lv_step_1_0= ruleForwardStep ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2186:6: ( (lv_step_1_0= ruleForwardStep ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2187:1: (lv_step_1_0= ruleForwardStep )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2187:1: (lv_step_1_0= ruleForwardStep )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2188:3: lv_step_1_0= ruleForwardStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxisStepAccess().getStepForwardStepParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleForwardStep_in_ruleAxisStep4923);
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

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2204:3: ( (lv_predicateList_2_0= rulePredicateList ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2205:1: (lv_predicateList_2_0= rulePredicateList )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2205:1: (lv_predicateList_2_0= rulePredicateList )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2206:3: lv_predicateList_2_0= rulePredicateList
            {
             
            	        newCompositeNode(grammarAccess.getAxisStepAccess().getPredicateListPredicateListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateList_in_ruleAxisStep4945);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2230:1: entryRuleForwardStep returns [EObject current=null] : iv_ruleForwardStep= ruleForwardStep EOF ;
    public final EObject entryRuleForwardStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardStep = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2231:2: (iv_ruleForwardStep= ruleForwardStep EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2232:2: iv_ruleForwardStep= ruleForwardStep EOF
            {
             newCompositeNode(grammarAccess.getForwardStepRule()); 
            pushFollow(FOLLOW_ruleForwardStep_in_entryRuleForwardStep4981);
            iv_ruleForwardStep=ruleForwardStep();

            state._fsp--;

             current =iv_ruleForwardStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForwardStep4991); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2239:1: ruleForwardStep returns [EObject current=null] : ( ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) ) ) ;
    public final EObject ruleForwardStep() throws RecognitionException {
        EObject current = null;

        EObject lv_forward_0_0 = null;

        EObject lv_test_1_0 = null;

        EObject lv_abbrForward_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2242:28: ( ( ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2243:1: ( ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2243:1: ( ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) ) )
            int alt33=2;
            switch ( input.LA(1) ) {
            case 67:
            case 69:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt33=1;
                }
                break;
            case 70:
                {
                int LA33_2 = input.LA(2);

                if ( (LA33_2==68) ) {
                    alt33=1;
                }
                else if ( (LA33_2==27) ) {
                    alt33=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_COMMENTTEST:
            case RULE_TEXTTEST:
            case RULE_ANYKINDTEST:
            case 36:
            case 76:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt33=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2243:2: ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2243:2: ( ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2243:3: ( (lv_forward_0_0= ruleForwardAxis ) ) ( (lv_test_1_0= ruleNodeTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2243:3: ( (lv_forward_0_0= ruleForwardAxis ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2244:1: (lv_forward_0_0= ruleForwardAxis )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2244:1: (lv_forward_0_0= ruleForwardAxis )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2245:3: lv_forward_0_0= ruleForwardAxis
                    {
                     
                    	        newCompositeNode(grammarAccess.getForwardStepAccess().getForwardForwardAxisParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleForwardAxis_in_ruleForwardStep5038);
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

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2261:2: ( (lv_test_1_0= ruleNodeTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2262:1: (lv_test_1_0= ruleNodeTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2262:1: (lv_test_1_0= ruleNodeTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2263:3: lv_test_1_0= ruleNodeTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getForwardStepAccess().getTestNodeTestParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeTest_in_ruleForwardStep5059);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2280:6: ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2280:6: ( (lv_abbrForward_2_0= ruleAbbrevForwardStep ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2281:1: (lv_abbrForward_2_0= ruleAbbrevForwardStep )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2281:1: (lv_abbrForward_2_0= ruleAbbrevForwardStep )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2282:3: lv_abbrForward_2_0= ruleAbbrevForwardStep
                    {
                     
                    	        newCompositeNode(grammarAccess.getForwardStepAccess().getAbbrForwardAbbrevForwardStepParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbbrevForwardStep_in_ruleForwardStep5087);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2306:1: entryRuleForwardAxis returns [EObject current=null] : iv_ruleForwardAxis= ruleForwardAxis EOF ;
    public final EObject entryRuleForwardAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardAxis = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2307:2: (iv_ruleForwardAxis= ruleForwardAxis EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2308:2: iv_ruleForwardAxis= ruleForwardAxis EOF
            {
             newCompositeNode(grammarAccess.getForwardAxisRule()); 
            pushFollow(FOLLOW_ruleForwardAxis_in_entryRuleForwardAxis5123);
            iv_ruleForwardAxis=ruleForwardAxis();

            state._fsp--;

             current =iv_ruleForwardAxis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForwardAxis5133); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2315:1: ruleForwardAxis returns [EObject current=null] : ( ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' ) | ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' ) | ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' ) | ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' ) | ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' ) | ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' ) | ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' ) | ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' ) ) ;
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
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2318:28: ( ( ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' ) | ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' ) | ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' ) | ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' ) | ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' ) | ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' ) | ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' ) | ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2319:1: ( ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' ) | ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' ) | ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' ) | ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' ) | ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' ) | ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' ) | ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' ) | ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2319:1: ( ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' ) | ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' ) | ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' ) | ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' ) | ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' ) | ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' ) | ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' ) | ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' ) )
            int alt34=8;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt34=1;
                }
                break;
            case 69:
                {
                alt34=2;
                }
                break;
            case 70:
                {
                alt34=3;
                }
                break;
            case 71:
                {
                alt34=4;
                }
                break;
            case 72:
                {
                alt34=5;
                }
                break;
            case 73:
                {
                alt34=6;
                }
                break;
            case 74:
                {
                alt34=7;
                }
                break;
            case 75:
                {
                alt34=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2319:2: ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2319:2: ( ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2319:3: ( (lv_axis_0_0= 'child' ) ) otherlv_1= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2319:3: ( (lv_axis_0_0= 'child' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2320:1: (lv_axis_0_0= 'child' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2320:1: (lv_axis_0_0= 'child' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2321:3: lv_axis_0_0= 'child'
                    {
                    lv_axis_0_0=(Token)match(input,67,FOLLOW_67_in_ruleForwardAxis5177); 

                            newLeafNode(lv_axis_0_0, grammarAccess.getForwardAxisAccess().getAxisChildKeyword_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_0_0, "child");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleForwardAxis5202); 

                        	newLeafNode(otherlv_1, grammarAccess.getForwardAxisAccess().getColonColonKeyword_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2339:6: ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2339:6: ( ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2339:7: ( (lv_axis_2_0= 'descendant' ) ) otherlv_3= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2339:7: ( (lv_axis_2_0= 'descendant' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2340:1: (lv_axis_2_0= 'descendant' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2340:1: (lv_axis_2_0= 'descendant' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2341:3: lv_axis_2_0= 'descendant'
                    {
                    lv_axis_2_0=(Token)match(input,69,FOLLOW_69_in_ruleForwardAxis5228); 

                            newLeafNode(lv_axis_2_0, grammarAccess.getForwardAxisAccess().getAxisDescendantKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_2_0, "descendant");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,68,FOLLOW_68_in_ruleForwardAxis5253); 

                        	newLeafNode(otherlv_3, grammarAccess.getForwardAxisAccess().getColonColonKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2359:6: ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2359:6: ( ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2359:7: ( (lv_axis_4_0= 'attribute' ) ) otherlv_5= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2359:7: ( (lv_axis_4_0= 'attribute' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2360:1: (lv_axis_4_0= 'attribute' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2360:1: (lv_axis_4_0= 'attribute' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2361:3: lv_axis_4_0= 'attribute'
                    {
                    lv_axis_4_0=(Token)match(input,70,FOLLOW_70_in_ruleForwardAxis5279); 

                            newLeafNode(lv_axis_4_0, grammarAccess.getForwardAxisAccess().getAxisAttributeKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_4_0, "attribute");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,68,FOLLOW_68_in_ruleForwardAxis5304); 

                        	newLeafNode(otherlv_5, grammarAccess.getForwardAxisAccess().getColonColonKeyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2379:6: ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2379:6: ( ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2379:7: ( (lv_axis_6_0= 'self' ) ) otherlv_7= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2379:7: ( (lv_axis_6_0= 'self' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2380:1: (lv_axis_6_0= 'self' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2380:1: (lv_axis_6_0= 'self' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2381:3: lv_axis_6_0= 'self'
                    {
                    lv_axis_6_0=(Token)match(input,71,FOLLOW_71_in_ruleForwardAxis5330); 

                            newLeafNode(lv_axis_6_0, grammarAccess.getForwardAxisAccess().getAxisSelfKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_6_0, "self");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,68,FOLLOW_68_in_ruleForwardAxis5355); 

                        	newLeafNode(otherlv_7, grammarAccess.getForwardAxisAccess().getColonColonKeyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2399:6: ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2399:6: ( ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2399:7: ( (lv_axis_8_0= 'descendant-or-self' ) ) otherlv_9= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2399:7: ( (lv_axis_8_0= 'descendant-or-self' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2400:1: (lv_axis_8_0= 'descendant-or-self' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2400:1: (lv_axis_8_0= 'descendant-or-self' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2401:3: lv_axis_8_0= 'descendant-or-self'
                    {
                    lv_axis_8_0=(Token)match(input,72,FOLLOW_72_in_ruleForwardAxis5381); 

                            newLeafNode(lv_axis_8_0, grammarAccess.getForwardAxisAccess().getAxisDescendantOrSelfKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_8_0, "descendant-or-self");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,68,FOLLOW_68_in_ruleForwardAxis5406); 

                        	newLeafNode(otherlv_9, grammarAccess.getForwardAxisAccess().getColonColonKeyword_4_1());
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2419:6: ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2419:6: ( ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2419:7: ( (lv_axis_10_0= 'following-sibling' ) ) otherlv_11= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2419:7: ( (lv_axis_10_0= 'following-sibling' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2420:1: (lv_axis_10_0= 'following-sibling' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2420:1: (lv_axis_10_0= 'following-sibling' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2421:3: lv_axis_10_0= 'following-sibling'
                    {
                    lv_axis_10_0=(Token)match(input,73,FOLLOW_73_in_ruleForwardAxis5432); 

                            newLeafNode(lv_axis_10_0, grammarAccess.getForwardAxisAccess().getAxisFollowingSiblingKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_10_0, "following-sibling");
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,68,FOLLOW_68_in_ruleForwardAxis5457); 

                        	newLeafNode(otherlv_11, grammarAccess.getForwardAxisAccess().getColonColonKeyword_5_1());
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2439:6: ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2439:6: ( ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2439:7: ( (lv_axis_12_0= 'following' ) ) otherlv_13= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2439:7: ( (lv_axis_12_0= 'following' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2440:1: (lv_axis_12_0= 'following' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2440:1: (lv_axis_12_0= 'following' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2441:3: lv_axis_12_0= 'following'
                    {
                    lv_axis_12_0=(Token)match(input,74,FOLLOW_74_in_ruleForwardAxis5483); 

                            newLeafNode(lv_axis_12_0, grammarAccess.getForwardAxisAccess().getAxisFollowingKeyword_6_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_12_0, "following");
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,68,FOLLOW_68_in_ruleForwardAxis5508); 

                        	newLeafNode(otherlv_13, grammarAccess.getForwardAxisAccess().getColonColonKeyword_6_1());
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2459:6: ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2459:6: ( ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2459:7: ( (lv_axis_14_0= 'namespace' ) ) otherlv_15= '::'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2459:7: ( (lv_axis_14_0= 'namespace' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2460:1: (lv_axis_14_0= 'namespace' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2460:1: (lv_axis_14_0= 'namespace' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2461:3: lv_axis_14_0= 'namespace'
                    {
                    lv_axis_14_0=(Token)match(input,75,FOLLOW_75_in_ruleForwardAxis5534); 

                            newLeafNode(lv_axis_14_0, grammarAccess.getForwardAxisAccess().getAxisNamespaceKeyword_7_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getForwardAxisRule());
                    	        }
                           		setWithLastConsumed(current, "axis", lv_axis_14_0, "namespace");
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,68,FOLLOW_68_in_ruleForwardAxis5559); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2486:1: entryRuleAbbrevForwardStep returns [EObject current=null] : iv_ruleAbbrevForwardStep= ruleAbbrevForwardStep EOF ;
    public final EObject entryRuleAbbrevForwardStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbbrevForwardStep = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2487:2: (iv_ruleAbbrevForwardStep= ruleAbbrevForwardStep EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2488:2: iv_ruleAbbrevForwardStep= ruleAbbrevForwardStep EOF
            {
             newCompositeNode(grammarAccess.getAbbrevForwardStepRule()); 
            pushFollow(FOLLOW_ruleAbbrevForwardStep_in_entryRuleAbbrevForwardStep5596);
            iv_ruleAbbrevForwardStep=ruleAbbrevForwardStep();

            state._fsp--;

             current =iv_ruleAbbrevForwardStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbbrevForwardStep5606); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2495:1: ruleAbbrevForwardStep returns [EObject current=null] : ( (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () ) | (this_NodeTest_3= ruleNodeTest () ) ) ;
    public final EObject ruleAbbrevForwardStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_NodeTest_1 = null;

        EObject this_NodeTest_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2498:28: ( ( (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () ) | (this_NodeTest_3= ruleNodeTest () ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2499:1: ( (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () ) | (this_NodeTest_3= ruleNodeTest () ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2499:1: ( (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () ) | (this_NodeTest_3= ruleNodeTest () ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==76) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_ANYKINDTEST)||LA35_0==36||LA35_0==70||(LA35_0>=81 && LA35_0<=85)) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2499:2: (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2499:2: (otherlv_0= '@' this_NodeTest_1= ruleNodeTest () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2499:4: otherlv_0= '@' this_NodeTest_1= ruleNodeTest ()
                    {
                    otherlv_0=(Token)match(input,76,FOLLOW_76_in_ruleAbbrevForwardStep5644); 

                        	newLeafNode(otherlv_0, grammarAccess.getAbbrevForwardStepAccess().getCommercialAtKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getAbbrevForwardStepAccess().getNodeTestParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleNodeTest_in_ruleAbbrevForwardStep5666);
                    this_NodeTest_1=ruleNodeTest();

                    state._fsp--;

                     
                            current = this_NodeTest_1; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2512:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2513:5: 
                    {

                            current = forceCreateModelElementAndSet(
                                grammarAccess.getAbbrevForwardStepAccess().getAttributeTestAction_0_2(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2519:6: (this_NodeTest_3= ruleNodeTest () )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2519:6: (this_NodeTest_3= ruleNodeTest () )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2520:5: this_NodeTest_3= ruleNodeTest ()
                    {
                     
                            newCompositeNode(grammarAccess.getAbbrevForwardStepAccess().getNodeTestParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleNodeTest_in_ruleAbbrevForwardStep5704);
                    this_NodeTest_3=ruleNodeTest();

                    state._fsp--;

                     
                            current = this_NodeTest_3; 
                            afterParserOrEnumRuleCall();
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2528:1: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2529:5: 
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2542:1: entryRuleReverseStep returns [EObject current=null] : iv_ruleReverseStep= ruleReverseStep EOF ;
    public final EObject entryRuleReverseStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReverseStep = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2543:2: (iv_ruleReverseStep= ruleReverseStep EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2544:2: iv_ruleReverseStep= ruleReverseStep EOF
            {
             newCompositeNode(grammarAccess.getReverseStepRule()); 
            pushFollow(FOLLOW_ruleReverseStep_in_entryRuleReverseStep5749);
            iv_ruleReverseStep=ruleReverseStep();

            state._fsp--;

             current =iv_ruleReverseStep; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReverseStep5759); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2551:1: ruleReverseStep returns [EObject current=null] : ( ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) ) ) ;
    public final EObject ruleReverseStep() throws RecognitionException {
        EObject current = null;

        Token lv_reverse_0_0=null;
        Token lv_abbrRevSet_2_0=null;
        EObject lv_test_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2554:28: ( ( ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2555:1: ( ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2555:1: ( ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) ) | ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_REVERSEAXIS) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ABBREVREVERSESTEP) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2555:2: ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2555:2: ( ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2555:3: ( (lv_reverse_0_0= RULE_REVERSEAXIS ) ) ( (lv_test_1_0= ruleNodeTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2555:3: ( (lv_reverse_0_0= RULE_REVERSEAXIS ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2556:1: (lv_reverse_0_0= RULE_REVERSEAXIS )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2556:1: (lv_reverse_0_0= RULE_REVERSEAXIS )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2557:3: lv_reverse_0_0= RULE_REVERSEAXIS
                    {
                    lv_reverse_0_0=(Token)match(input,RULE_REVERSEAXIS,FOLLOW_RULE_REVERSEAXIS_in_ruleReverseStep5802); 

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

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2573:2: ( (lv_test_1_0= ruleNodeTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2574:1: (lv_test_1_0= ruleNodeTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2574:1: (lv_test_1_0= ruleNodeTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2575:3: lv_test_1_0= ruleNodeTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getReverseStepAccess().getTestNodeTestParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNodeTest_in_ruleReverseStep5828);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2592:6: ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2592:6: ( (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2593:1: (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2593:1: (lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2594:3: lv_abbrRevSet_2_0= RULE_ABBREVREVERSESTEP
                    {
                    lv_abbrRevSet_2_0=(Token)match(input,RULE_ABBREVREVERSESTEP,FOLLOW_RULE_ABBREVREVERSESTEP_in_ruleReverseStep5852); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2618:1: entryRuleNodeTest returns [EObject current=null] : iv_ruleNodeTest= ruleNodeTest EOF ;
    public final EObject entryRuleNodeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2619:2: (iv_ruleNodeTest= ruleNodeTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2620:2: iv_ruleNodeTest= ruleNodeTest EOF
            {
             newCompositeNode(grammarAccess.getNodeTestRule()); 
            pushFollow(FOLLOW_ruleNodeTest_in_entryRuleNodeTest5893);
            iv_ruleNodeTest=ruleNodeTest();

            state._fsp--;

             current =iv_ruleNodeTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeTest5903); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2627:1: ruleNodeTest returns [EObject current=null] : ( ( (lv_test_0_0= ruleKindTest ) ) | ( (lv_test_1_0= ruleNameTest ) ) ) ;
    public final EObject ruleNodeTest() throws RecognitionException {
        EObject current = null;

        EObject lv_test_0_0 = null;

        EObject lv_test_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2630:28: ( ( ( (lv_test_0_0= ruleKindTest ) ) | ( (lv_test_1_0= ruleNameTest ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2631:1: ( ( (lv_test_0_0= ruleKindTest ) ) | ( (lv_test_1_0= ruleNameTest ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2631:1: ( ( (lv_test_0_0= ruleKindTest ) ) | ( (lv_test_1_0= ruleNameTest ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_COMMENTTEST && LA37_0<=RULE_ANYKINDTEST)||LA37_0==70||(LA37_0>=81 && LA37_0<=85)) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ID||LA37_0==36) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2631:2: ( (lv_test_0_0= ruleKindTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2631:2: ( (lv_test_0_0= ruleKindTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2632:1: (lv_test_0_0= ruleKindTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2632:1: (lv_test_0_0= ruleKindTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2633:3: lv_test_0_0= ruleKindTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeTestAccess().getTestKindTestParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKindTest_in_ruleNodeTest5949);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2650:6: ( (lv_test_1_0= ruleNameTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2650:6: ( (lv_test_1_0= ruleNameTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2651:1: (lv_test_1_0= ruleNameTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2651:1: (lv_test_1_0= ruleNameTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2652:3: lv_test_1_0= ruleNameTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getNodeTestAccess().getTestNameTestParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNameTest_in_ruleNodeTest5976);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2676:1: entryRuleNameTest returns [EObject current=null] : iv_ruleNameTest= ruleNameTest EOF ;
    public final EObject entryRuleNameTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2677:2: (iv_ruleNameTest= ruleNameTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2678:2: iv_ruleNameTest= ruleNameTest EOF
            {
             newCompositeNode(grammarAccess.getNameTestRule()); 
            pushFollow(FOLLOW_ruleNameTest_in_entryRuleNameTest6012);
            iv_ruleNameTest=ruleNameTest();

            state._fsp--;

             current =iv_ruleNameTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNameTest6022); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2685:1: ruleNameTest returns [EObject current=null] : ( ( (lv_qName_0_0= ruleQName ) ) | ( (lv_wildcard_1_0= ruleWildcard ) ) ) ;
    public final EObject ruleNameTest() throws RecognitionException {
        EObject current = null;

        EObject lv_qName_0_0 = null;

        EObject lv_wildcard_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2688:28: ( ( ( (lv_qName_0_0= ruleQName ) ) | ( (lv_wildcard_1_0= ruleWildcard ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2689:1: ( ( (lv_qName_0_0= ruleQName ) ) | ( (lv_wildcard_1_0= ruleWildcard ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2689:1: ( ( (lv_qName_0_0= ruleQName ) ) | ( (lv_wildcard_1_0= ruleWildcard ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==77) ) {
                    int LA38_3 = input.LA(3);

                    if ( (LA38_3==36) ) {
                        alt38=2;
                    }
                    else if ( (LA38_3==RULE_ID) ) {
                        alt38=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA38_1==EOF||(LA38_1>=18 && LA38_1<=19)||LA38_1==25||LA38_1==28||(LA38_1>=30 && LA38_1<=44)||LA38_1==46||(LA38_1>=48 && LA38_1<=66)||(LA38_1>=78 && LA38_1<=79)) ) {
                    alt38=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA38_0==36) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2689:2: ( (lv_qName_0_0= ruleQName ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2689:2: ( (lv_qName_0_0= ruleQName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2690:1: (lv_qName_0_0= ruleQName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2690:1: (lv_qName_0_0= ruleQName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2691:3: lv_qName_0_0= ruleQName
                    {
                     
                    	        newCompositeNode(grammarAccess.getNameTestAccess().getQNameQNameParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQName_in_ruleNameTest6068);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2708:6: ( (lv_wildcard_1_0= ruleWildcard ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2708:6: ( (lv_wildcard_1_0= ruleWildcard ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2709:1: (lv_wildcard_1_0= ruleWildcard )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2709:1: (lv_wildcard_1_0= ruleWildcard )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2710:3: lv_wildcard_1_0= ruleWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getNameTestAccess().getWildcardWildcardParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleWildcard_in_ruleNameTest6095);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2734:1: entryRuleWildcard returns [EObject current=null] : iv_ruleWildcard= ruleWildcard EOF ;
    public final EObject entryRuleWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWildcard = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2735:2: (iv_ruleWildcard= ruleWildcard EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2736:2: iv_ruleWildcard= ruleWildcard EOF
            {
             newCompositeNode(grammarAccess.getWildcardRule()); 
            pushFollow(FOLLOW_ruleWildcard_in_entryRuleWildcard6131);
            iv_ruleWildcard=ruleWildcard();

            state._fsp--;

             current =iv_ruleWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcard6141); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2743:1: ruleWildcard returns [EObject current=null] : ( ( (lv_wild_0_0= '*' ) ) | ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' ) | (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) ) ) ;
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
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2746:28: ( ( ( (lv_wild_0_0= '*' ) ) | ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' ) | (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2747:1: ( ( (lv_wild_0_0= '*' ) ) | ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' ) | (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2747:1: ( ( (lv_wild_0_0= '*' ) ) | ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' ) | (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) ) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==77) ) {
                    alt39=3;
                }
                else if ( (LA39_1==EOF||(LA39_1>=18 && LA39_1<=19)||LA39_1==25||LA39_1==28||(LA39_1>=30 && LA39_1<=44)||LA39_1==46||(LA39_1>=48 && LA39_1<=66)||(LA39_1>=78 && LA39_1<=79)) ) {
                    alt39=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2747:2: ( (lv_wild_0_0= '*' ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2747:2: ( (lv_wild_0_0= '*' ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2748:1: (lv_wild_0_0= '*' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2748:1: (lv_wild_0_0= '*' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2749:3: lv_wild_0_0= '*'
                    {
                    lv_wild_0_0=(Token)match(input,36,FOLLOW_36_in_ruleWildcard6184); 

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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2763:6: ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2763:6: ( ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2763:7: ( (lv_left_1_0= ruleNCName ) ) otherlv_2= ':' otherlv_3= '*'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2763:7: ( (lv_left_1_0= ruleNCName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2764:1: (lv_left_1_0= ruleNCName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2764:1: (lv_left_1_0= ruleNCName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2765:3: lv_left_1_0= ruleNCName
                    {
                     
                    	        newCompositeNode(grammarAccess.getWildcardAccess().getLeftNCNameParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNCName_in_ruleWildcard6225);
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

                    otherlv_2=(Token)match(input,77,FOLLOW_77_in_ruleWildcard6237); 

                        	newLeafNode(otherlv_2, grammarAccess.getWildcardAccess().getColonKeyword_1_1());
                        
                    otherlv_3=(Token)match(input,36,FOLLOW_36_in_ruleWildcard6249); 

                        	newLeafNode(otherlv_3, grammarAccess.getWildcardAccess().getAsteriskKeyword_1_2());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2790:6: (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2790:6: (otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2790:8: otherlv_4= '*' otherlv_5= ':' ( (lv_right_6_0= ruleNCName ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_ruleWildcard6269); 

                        	newLeafNode(otherlv_4, grammarAccess.getWildcardAccess().getAsteriskKeyword_2_0());
                        
                    otherlv_5=(Token)match(input,77,FOLLOW_77_in_ruleWildcard6281); 

                        	newLeafNode(otherlv_5, grammarAccess.getWildcardAccess().getColonKeyword_2_1());
                        
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2798:1: ( (lv_right_6_0= ruleNCName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2799:1: (lv_right_6_0= ruleNCName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2799:1: (lv_right_6_0= ruleNCName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2800:3: lv_right_6_0= ruleNCName
                    {
                     
                    	        newCompositeNode(grammarAccess.getWildcardAccess().getRightNCNameParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNCName_in_ruleWildcard6302);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2824:1: entryRuleFilterExpr returns [EObject current=null] : iv_ruleFilterExpr= ruleFilterExpr EOF ;
    public final EObject entryRuleFilterExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2825:2: (iv_ruleFilterExpr= ruleFilterExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2826:2: iv_ruleFilterExpr= ruleFilterExpr EOF
            {
             newCompositeNode(grammarAccess.getFilterExprRule()); 
            pushFollow(FOLLOW_ruleFilterExpr_in_entryRuleFilterExpr6339);
            iv_ruleFilterExpr=ruleFilterExpr();

            state._fsp--;

             current =iv_ruleFilterExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFilterExpr6349); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2833:1: ruleFilterExpr returns [EObject current=null] : ( ( (lv_primary_0_0= rulePrimaryExpr ) ) ( (lv_predicateList_1_0= rulePredicateList ) ) ) ;
    public final EObject ruleFilterExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_primary_0_0 = null;

        EObject lv_predicateList_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2836:28: ( ( ( (lv_primary_0_0= rulePrimaryExpr ) ) ( (lv_predicateList_1_0= rulePredicateList ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2837:1: ( ( (lv_primary_0_0= rulePrimaryExpr ) ) ( (lv_predicateList_1_0= rulePredicateList ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2837:1: ( ( (lv_primary_0_0= rulePrimaryExpr ) ) ( (lv_predicateList_1_0= rulePredicateList ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2837:2: ( (lv_primary_0_0= rulePrimaryExpr ) ) ( (lv_predicateList_1_0= rulePredicateList ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2837:2: ( (lv_primary_0_0= rulePrimaryExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2838:1: (lv_primary_0_0= rulePrimaryExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2838:1: (lv_primary_0_0= rulePrimaryExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2839:3: lv_primary_0_0= rulePrimaryExpr
            {
             
            	        newCompositeNode(grammarAccess.getFilterExprAccess().getPrimaryPrimaryExprParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePrimaryExpr_in_ruleFilterExpr6395);
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

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2855:2: ( (lv_predicateList_1_0= rulePredicateList ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2856:1: (lv_predicateList_1_0= rulePredicateList )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2856:1: (lv_predicateList_1_0= rulePredicateList )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2857:3: lv_predicateList_1_0= rulePredicateList
            {
             
            	        newCompositeNode(grammarAccess.getFilterExprAccess().getPredicateListPredicateListParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateList_in_ruleFilterExpr6416);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2881:1: entryRulePredicateList returns [EObject current=null] : iv_rulePredicateList= rulePredicateList EOF ;
    public final EObject entryRulePredicateList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateList = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2882:2: (iv_rulePredicateList= rulePredicateList EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2883:2: iv_rulePredicateList= rulePredicateList EOF
            {
             newCompositeNode(grammarAccess.getPredicateListRule()); 
            pushFollow(FOLLOW_rulePredicateList_in_entryRulePredicateList6452);
            iv_rulePredicateList=rulePredicateList();

            state._fsp--;

             current =iv_rulePredicateList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateList6462); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2890:1: rulePredicateList returns [EObject current=null] : ( () ( (lv_predicates_1_0= rulePredicate ) )* ) ;
    public final EObject rulePredicateList() throws RecognitionException {
        EObject current = null;

        EObject lv_predicates_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2893:28: ( ( () ( (lv_predicates_1_0= rulePredicate ) )* ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2894:1: ( () ( (lv_predicates_1_0= rulePredicate ) )* )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2894:1: ( () ( (lv_predicates_1_0= rulePredicate ) )* )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2894:2: () ( (lv_predicates_1_0= rulePredicate ) )*
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2894:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2895:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateListAccess().getPredicateListAction_0(),
                        current);
                

            }

            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2900:2: ( (lv_predicates_1_0= rulePredicate ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==78) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2901:1: (lv_predicates_1_0= rulePredicate )
            	    {
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2901:1: (lv_predicates_1_0= rulePredicate )
            	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2902:3: lv_predicates_1_0= rulePredicate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPredicateListAccess().getPredicatesPredicateParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePredicate_in_rulePredicateList6517);
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
            	    break loop40;
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2926:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2927:2: (iv_rulePredicate= rulePredicate EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2928:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate6554);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate6564); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2935:1: rulePredicate returns [EObject current=null] : (otherlv_0= '[' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ']' ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2938:28: ( (otherlv_0= '[' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ']' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2939:1: (otherlv_0= '[' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ']' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2939:1: (otherlv_0= '[' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ']' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2939:3: otherlv_0= '[' ( (lv_expr_1_0= ruleExpr ) ) otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_rulePredicate6601); 

                	newLeafNode(otherlv_0, grammarAccess.getPredicateAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2943:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2944:1: (lv_expr_1_0= ruleExpr )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2944:1: (lv_expr_1_0= ruleExpr )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2945:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getPredicateAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_rulePredicate6622);
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

            otherlv_2=(Token)match(input,79,FOLLOW_79_in_rulePredicate6634); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2973:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2974:2: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2975:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            pushFollow(FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr6670);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;

             current =iv_rulePrimaryExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpr6680); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2982:1: rulePrimaryExpr returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_varRef_1_0= ruleVarRef ) ) | ( (lv_parExpr_2_0= ruleParenthesizedExpr ) ) | ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) ) | ( (lv_functionCall_4_0= ruleFunctionCall ) ) ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token lv_conItemExpr_3_0=null;
        EObject lv_literal_0_0 = null;

        EObject lv_varRef_1_0 = null;

        EObject lv_parExpr_2_0 = null;

        EObject lv_functionCall_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2985:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_varRef_1_0= ruleVarRef ) ) | ( (lv_parExpr_2_0= ruleParenthesizedExpr ) ) | ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) ) | ( (lv_functionCall_4_0= ruleFunctionCall ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2986:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_varRef_1_0= ruleVarRef ) ) | ( (lv_parExpr_2_0= ruleParenthesizedExpr ) ) | ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) ) | ( (lv_functionCall_4_0= ruleFunctionCall ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2986:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | ( (lv_varRef_1_0= ruleVarRef ) ) | ( (lv_parExpr_2_0= ruleParenthesizedExpr ) ) | ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) ) | ( (lv_functionCall_4_0= ruleFunctionCall ) ) )
            int alt41=5;
            switch ( input.LA(1) ) {
            case RULE_STRINGLITERAL:
            case RULE_INTLITERAL:
            case RULE_DECIMALLITERAL:
            case RULE_DOUBLELITERAL:
                {
                alt41=1;
                }
                break;
            case 21:
                {
                alt41=2;
                }
                break;
            case 27:
                {
                alt41=3;
                }
                break;
            case RULE_CONTEXTITEMEXPR:
                {
                alt41=4;
                }
                break;
            case RULE_ID:
                {
                alt41=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2986:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2986:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2987:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2987:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:2988:3: lv_literal_0_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExprAccess().getLiteralLiteralParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpr6726);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3005:6: ( (lv_varRef_1_0= ruleVarRef ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3005:6: ( (lv_varRef_1_0= ruleVarRef ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3006:1: (lv_varRef_1_0= ruleVarRef )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3006:1: (lv_varRef_1_0= ruleVarRef )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3007:3: lv_varRef_1_0= ruleVarRef
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExprAccess().getVarRefVarRefParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarRef_in_rulePrimaryExpr6753);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3024:6: ( (lv_parExpr_2_0= ruleParenthesizedExpr ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3024:6: ( (lv_parExpr_2_0= ruleParenthesizedExpr ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3025:1: (lv_parExpr_2_0= ruleParenthesizedExpr )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3025:1: (lv_parExpr_2_0= ruleParenthesizedExpr )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3026:3: lv_parExpr_2_0= ruleParenthesizedExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExprAccess().getParExprParenthesizedExprParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParenthesizedExpr_in_rulePrimaryExpr6780);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3043:6: ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3043:6: ( (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3044:1: (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3044:1: (lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3045:3: lv_conItemExpr_3_0= RULE_CONTEXTITEMEXPR
                    {
                    lv_conItemExpr_3_0=(Token)match(input,RULE_CONTEXTITEMEXPR,FOLLOW_RULE_CONTEXTITEMEXPR_in_rulePrimaryExpr6803); 

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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3062:6: ( (lv_functionCall_4_0= ruleFunctionCall ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3062:6: ( (lv_functionCall_4_0= ruleFunctionCall ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3063:1: (lv_functionCall_4_0= ruleFunctionCall )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3063:1: (lv_functionCall_4_0= ruleFunctionCall )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3064:3: lv_functionCall_4_0= ruleFunctionCall
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExprAccess().getFunctionCallFunctionCallParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionCall_in_rulePrimaryExpr6835);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3088:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3089:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3090:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral6871);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral6881); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3097:1: ruleLiteral returns [EObject current=null] : ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_string_1_0= RULE_STRINGLITERAL ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_string_1_0=null;
        EObject lv_num_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3100:28: ( ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_string_1_0= RULE_STRINGLITERAL ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3101:1: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_string_1_0= RULE_STRINGLITERAL ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3101:1: ( ( (lv_num_0_0= ruleNumericLiteral ) ) | ( (lv_string_1_0= RULE_STRINGLITERAL ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_INTLITERAL && LA42_0<=RULE_DOUBLELITERAL)) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_STRINGLITERAL) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3101:2: ( (lv_num_0_0= ruleNumericLiteral ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3101:2: ( (lv_num_0_0= ruleNumericLiteral ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3102:1: (lv_num_0_0= ruleNumericLiteral )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3102:1: (lv_num_0_0= ruleNumericLiteral )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3103:3: lv_num_0_0= ruleNumericLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getNumNumericLiteralParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNumericLiteral_in_ruleLiteral6927);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3120:6: ( (lv_string_1_0= RULE_STRINGLITERAL ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3120:6: ( (lv_string_1_0= RULE_STRINGLITERAL ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3121:1: (lv_string_1_0= RULE_STRINGLITERAL )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3121:1: (lv_string_1_0= RULE_STRINGLITERAL )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3122:3: lv_string_1_0= RULE_STRINGLITERAL
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRINGLITERAL,FOLLOW_RULE_STRINGLITERAL_in_ruleLiteral6950); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3146:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3147:2: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3148:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumericLiteralRule()); 
            pushFollow(FOLLOW_ruleNumericLiteral_in_entryRuleNumericLiteral6991);
            iv_ruleNumericLiteral=ruleNumericLiteral();

            state._fsp--;

             current =iv_ruleNumericLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericLiteral7001); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3155:1: ruleNumericLiteral returns [EObject current=null] : ( ( (lv_intLit_0_0= RULE_INTLITERAL ) ) | ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) ) | ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) ) ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_intLit_0_0=null;
        Token lv_decLit_1_0=null;
        Token lv_doubleLit_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3158:28: ( ( ( (lv_intLit_0_0= RULE_INTLITERAL ) ) | ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) ) | ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3159:1: ( ( (lv_intLit_0_0= RULE_INTLITERAL ) ) | ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) ) | ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3159:1: ( ( (lv_intLit_0_0= RULE_INTLITERAL ) ) | ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) ) | ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case RULE_INTLITERAL:
                {
                alt43=1;
                }
                break;
            case RULE_DECIMALLITERAL:
                {
                alt43=2;
                }
                break;
            case RULE_DOUBLELITERAL:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3159:2: ( (lv_intLit_0_0= RULE_INTLITERAL ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3159:2: ( (lv_intLit_0_0= RULE_INTLITERAL ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3160:1: (lv_intLit_0_0= RULE_INTLITERAL )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3160:1: (lv_intLit_0_0= RULE_INTLITERAL )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3161:3: lv_intLit_0_0= RULE_INTLITERAL
                    {
                    lv_intLit_0_0=(Token)match(input,RULE_INTLITERAL,FOLLOW_RULE_INTLITERAL_in_ruleNumericLiteral7043); 

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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3178:6: ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3178:6: ( (lv_decLit_1_0= RULE_DECIMALLITERAL ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3179:1: (lv_decLit_1_0= RULE_DECIMALLITERAL )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3179:1: (lv_decLit_1_0= RULE_DECIMALLITERAL )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3180:3: lv_decLit_1_0= RULE_DECIMALLITERAL
                    {
                    lv_decLit_1_0=(Token)match(input,RULE_DECIMALLITERAL,FOLLOW_RULE_DECIMALLITERAL_in_ruleNumericLiteral7071); 

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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3197:6: ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3197:6: ( (lv_doubleLit_2_0= RULE_DOUBLELITERAL ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3198:1: (lv_doubleLit_2_0= RULE_DOUBLELITERAL )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3198:1: (lv_doubleLit_2_0= RULE_DOUBLELITERAL )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3199:3: lv_doubleLit_2_0= RULE_DOUBLELITERAL
                    {
                    lv_doubleLit_2_0=(Token)match(input,RULE_DOUBLELITERAL,FOLLOW_RULE_DOUBLELITERAL_in_ruleNumericLiteral7099); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3223:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3224:2: (iv_ruleVarRef= ruleVarRef EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3225:2: iv_ruleVarRef= ruleVarRef EOF
            {
             newCompositeNode(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_ruleVarRef_in_entryRuleVarRef7140);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;

             current =iv_ruleVarRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarRef7150); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3232:1: ruleVarRef returns [EObject current=null] : (otherlv_0= '$' this_VarName_1= ruleVarName ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_VarName_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3235:28: ( (otherlv_0= '$' this_VarName_1= ruleVarName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3236:1: (otherlv_0= '$' this_VarName_1= ruleVarName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3236:1: (otherlv_0= '$' this_VarName_1= ruleVarName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3236:3: otherlv_0= '$' this_VarName_1= ruleVarName
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleVarRef7187); 

                	newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getDollarSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getVarRefAccess().getVarNameParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleVarName_in_ruleVarRef7209);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3257:1: entryRuleVarName returns [EObject current=null] : iv_ruleVarName= ruleVarName EOF ;
    public final EObject entryRuleVarName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3258:2: (iv_ruleVarName= ruleVarName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3259:2: iv_ruleVarName= ruleVarName EOF
            {
             newCompositeNode(grammarAccess.getVarNameRule()); 
            pushFollow(FOLLOW_ruleVarName_in_entryRuleVarName7244);
            iv_ruleVarName=ruleVarName();

            state._fsp--;

             current =iv_ruleVarName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarName7254); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3266:1: ruleVarName returns [EObject current=null] : ( (lv_qName_0_0= ruleQName ) ) ;
    public final EObject ruleVarName() throws RecognitionException {
        EObject current = null;

        EObject lv_qName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3269:28: ( ( (lv_qName_0_0= ruleQName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3270:1: ( (lv_qName_0_0= ruleQName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3270:1: ( (lv_qName_0_0= ruleQName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3271:1: (lv_qName_0_0= ruleQName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3271:1: (lv_qName_0_0= ruleQName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3272:3: lv_qName_0_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getVarNameAccess().getQNameQNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleVarName7299);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3296:1: entryRuleParenthesizedExpr returns [EObject current=null] : iv_ruleParenthesizedExpr= ruleParenthesizedExpr EOF ;
    public final EObject entryRuleParenthesizedExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpr = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3297:2: (iv_ruleParenthesizedExpr= ruleParenthesizedExpr EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3298:2: iv_ruleParenthesizedExpr= ruleParenthesizedExpr EOF
            {
             newCompositeNode(grammarAccess.getParenthesizedExprRule()); 
            pushFollow(FOLLOW_ruleParenthesizedExpr_in_entryRuleParenthesizedExpr7334);
            iv_ruleParenthesizedExpr=ruleParenthesizedExpr();

            state._fsp--;

             current =iv_ruleParenthesizedExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpr7344); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3305:1: ruleParenthesizedExpr returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) )? otherlv_3= ')' ) ;
    public final EObject ruleParenthesizedExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3308:28: ( ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) )? otherlv_3= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3309:1: ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) )? otherlv_3= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3309:1: ( () otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) )? otherlv_3= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3309:2: () otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) )? otherlv_3= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3309:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3310:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParenthesizedExprAccess().getParenthesizedExprAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleParenthesizedExpr7390); 

                	newLeafNode(otherlv_1, grammarAccess.getParenthesizedExprAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3319:1: ( (lv_expr_2_0= ruleExpr ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_REVERSEAXIS && LA44_0<=RULE_DOUBLELITERAL)||(LA44_0>=RULE_ID && LA44_0<=RULE_ANYKINDTEST)||(LA44_0>=20 && LA44_0<=21)||(LA44_0>=23 && LA44_0<=24)||(LA44_0>=26 && LA44_0<=27)||(LA44_0>=34 && LA44_0<=36)||(LA44_0>=65 && LA44_0<=67)||(LA44_0>=69 && LA44_0<=76)||(LA44_0>=81 && LA44_0<=85)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3320:1: (lv_expr_2_0= ruleExpr )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3320:1: (lv_expr_2_0= ruleExpr )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3321:3: lv_expr_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getParenthesizedExprAccess().getExprExprParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleParenthesizedExpr7411);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleParenthesizedExpr7424); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3349:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3350:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3351:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall7460);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall7470); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3358:1: ruleFunctionCall returns [EObject current=null] : ( ( (lv_qName_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' ) ;
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
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3361:28: ( ( ( (lv_qName_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3362:1: ( ( (lv_qName_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3362:1: ( ( (lv_qName_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3362:2: ( (lv_qName_0_0= ruleQName ) ) otherlv_1= '(' ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )? otherlv_5= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3362:2: ( (lv_qName_0_0= ruleQName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3363:1: (lv_qName_0_0= ruleQName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3363:1: (lv_qName_0_0= ruleQName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3364:3: lv_qName_0_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionCallAccess().getQNameQNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleFunctionCall7516);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleFunctionCall7528); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3384:1: ( ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_REVERSEAXIS && LA46_0<=RULE_DOUBLELITERAL)||(LA46_0>=RULE_ID && LA46_0<=RULE_ANYKINDTEST)||(LA46_0>=20 && LA46_0<=21)||(LA46_0>=23 && LA46_0<=24)||(LA46_0>=26 && LA46_0<=27)||(LA46_0>=34 && LA46_0<=36)||(LA46_0>=65 && LA46_0<=67)||(LA46_0>=69 && LA46_0<=76)||(LA46_0>=81 && LA46_0<=85)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3384:2: ( (lv_expr_2_0= ruleExprSingle ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )*
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3384:2: ( (lv_expr_2_0= ruleExprSingle ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3385:1: (lv_expr_2_0= ruleExprSingle )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3385:1: (lv_expr_2_0= ruleExprSingle )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3386:3: lv_expr_2_0= ruleExprSingle
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getExprExprSingleParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExprSingle_in_ruleFunctionCall7550);
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

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3402:2: (otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==18) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3402:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleExprSingle ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleFunctionCall7563); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3406:1: ( (lv_exprs_4_0= ruleExprSingle ) )
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3407:1: (lv_exprs_4_0= ruleExprSingle )
                    	    {
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3407:1: (lv_exprs_4_0= ruleExprSingle )
                    	    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3408:3: lv_exprs_4_0= ruleExprSingle
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getFunctionCallAccess().getExprsExprSingleParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleExprSingle_in_ruleFunctionCall7584);
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleFunctionCall7600); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3436:1: entryRuleSingleType returns [EObject current=null] : iv_ruleSingleType= ruleSingleType EOF ;
    public final EObject entryRuleSingleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleType = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3437:2: (iv_ruleSingleType= ruleSingleType EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3438:2: iv_ruleSingleType= ruleSingleType EOF
            {
             newCompositeNode(grammarAccess.getSingleTypeRule()); 
            pushFollow(FOLLOW_ruleSingleType_in_entryRuleSingleType7636);
            iv_ruleSingleType=ruleSingleType();

            state._fsp--;

             current =iv_ruleSingleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleType7646); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3445:1: ruleSingleType returns [EObject current=null] : (this_AtomicType_0= ruleAtomicType (otherlv_1= '?' )? ) ;
    public final EObject ruleSingleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_AtomicType_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3448:28: ( (this_AtomicType_0= ruleAtomicType (otherlv_1= '?' )? ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3449:1: (this_AtomicType_0= ruleAtomicType (otherlv_1= '?' )? )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3449:1: (this_AtomicType_0= ruleAtomicType (otherlv_1= '?' )? )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3450:5: this_AtomicType_0= ruleAtomicType (otherlv_1= '?' )?
            {
             
                    newCompositeNode(grammarAccess.getSingleTypeAccess().getAtomicTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAtomicType_in_ruleSingleType7693);
            this_AtomicType_0=ruleAtomicType();

            state._fsp--;

             
                    current = this_AtomicType_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3458:1: (otherlv_1= '?' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==80) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3458:3: otherlv_1= '?'
                    {
                    otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleSingleType7705); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3470:1: entryRuleSequenceType returns [EObject current=null] : iv_ruleSequenceType= ruleSequenceType EOF ;
    public final EObject entryRuleSequenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceType = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3471:2: (iv_ruleSequenceType= ruleSequenceType EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3472:2: iv_ruleSequenceType= ruleSequenceType EOF
            {
             newCompositeNode(grammarAccess.getSequenceTypeRule()); 
            pushFollow(FOLLOW_ruleSequenceType_in_entryRuleSequenceType7743);
            iv_ruleSequenceType=ruleSequenceType();

            state._fsp--;

             current =iv_ruleSequenceType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceType7753); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3479:1: ruleSequenceType returns [EObject current=null] : ( ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) ) | ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) ) ) ;
    public final EObject ruleSequenceType() throws RecognitionException {
        EObject current = null;

        Token lv_empty_0_0=null;
        EObject lv_itemType_1_0 = null;

        AntlrDatatypeRuleToken lv_occInd_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3482:28: ( ( ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) ) | ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3483:1: ( ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) ) | ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3483:1: ( ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) ) | ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_EMPTYSEQUENCETYPE) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=RULE_EMPTYITEMTYPE && LA48_0<=RULE_ANYKINDTEST)||LA48_0==70||(LA48_0>=81 && LA48_0<=85)) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3483:2: ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3483:2: ( (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3484:1: (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3484:1: (lv_empty_0_0= RULE_EMPTYSEQUENCETYPE )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3485:3: lv_empty_0_0= RULE_EMPTYSEQUENCETYPE
                    {
                    lv_empty_0_0=(Token)match(input,RULE_EMPTYSEQUENCETYPE,FOLLOW_RULE_EMPTYSEQUENCETYPE_in_ruleSequenceType7795); 

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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3502:6: ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3502:6: ( ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3502:7: ( (lv_itemType_1_0= ruleItemType ) ) ( (lv_occInd_2_0= ruleOccurenceIndicator ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3502:7: ( (lv_itemType_1_0= ruleItemType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3503:1: (lv_itemType_1_0= ruleItemType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3503:1: (lv_itemType_1_0= ruleItemType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3504:3: lv_itemType_1_0= ruleItemType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceTypeAccess().getItemTypeItemTypeParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleItemType_in_ruleSequenceType7828);
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

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3520:2: ( (lv_occInd_2_0= ruleOccurenceIndicator ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3521:1: (lv_occInd_2_0= ruleOccurenceIndicator )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3521:1: (lv_occInd_2_0= ruleOccurenceIndicator )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3522:3: lv_occInd_2_0= ruleOccurenceIndicator
                    {
                     
                    	        newCompositeNode(grammarAccess.getSequenceTypeAccess().getOccIndOccurenceIndicatorParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOccurenceIndicator_in_ruleSequenceType7849);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3546:1: entryRuleOccurenceIndicator returns [String current=null] : iv_ruleOccurenceIndicator= ruleOccurenceIndicator EOF ;
    public final String entryRuleOccurenceIndicator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOccurenceIndicator = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3547:2: (iv_ruleOccurenceIndicator= ruleOccurenceIndicator EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3548:2: iv_ruleOccurenceIndicator= ruleOccurenceIndicator EOF
            {
             newCompositeNode(grammarAccess.getOccurenceIndicatorRule()); 
            pushFollow(FOLLOW_ruleOccurenceIndicator_in_entryRuleOccurenceIndicator7887);
            iv_ruleOccurenceIndicator=ruleOccurenceIndicator();

            state._fsp--;

             current =iv_ruleOccurenceIndicator.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOccurenceIndicator7898); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3555:1: ruleOccurenceIndicator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '?' | kw= '*' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOccurenceIndicator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3558:28: ( (kw= '?' | kw= '*' | kw= '+' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3559:1: (kw= '?' | kw= '*' | kw= '+' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3559:1: (kw= '?' | kw= '*' | kw= '+' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt49=1;
                }
                break;
            case 36:
                {
                alt49=2;
                }
                break;
            case 34:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3560:2: kw= '?'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleOccurenceIndicator7936); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOccurenceIndicatorAccess().getQuestionMarkKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3567:2: kw= '*'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOccurenceIndicator7955); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getOccurenceIndicatorAccess().getAsteriskKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3574:2: kw= '+'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOccurenceIndicator7974); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3587:1: entryRuleItemType returns [EObject current=null] : iv_ruleItemType= ruleItemType EOF ;
    public final EObject entryRuleItemType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemType = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3588:2: (iv_ruleItemType= ruleItemType EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3589:2: iv_ruleItemType= ruleItemType EOF
            {
             newCompositeNode(grammarAccess.getItemTypeRule()); 
            pushFollow(FOLLOW_ruleItemType_in_entryRuleItemType8014);
            iv_ruleItemType=ruleItemType();

            state._fsp--;

             current =iv_ruleItemType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemType8024); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3596:1: ruleItemType returns [EObject current=null] : ( ( (lv_kindTest_0_0= ruleKindTest ) ) | ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) ) | ( (lv_atomicType_2_0= ruleAtomicType ) ) ) ;
    public final EObject ruleItemType() throws RecognitionException {
        EObject current = null;

        Token lv_empty_1_0=null;
        EObject lv_kindTest_0_0 = null;

        EObject lv_atomicType_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3599:28: ( ( ( (lv_kindTest_0_0= ruleKindTest ) ) | ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) ) | ( (lv_atomicType_2_0= ruleAtomicType ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3600:1: ( ( (lv_kindTest_0_0= ruleKindTest ) ) | ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) ) | ( (lv_atomicType_2_0= ruleAtomicType ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3600:1: ( ( (lv_kindTest_0_0= ruleKindTest ) ) | ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) ) | ( (lv_atomicType_2_0= ruleAtomicType ) ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case RULE_COMMENTTEST:
            case RULE_TEXTTEST:
            case RULE_ANYKINDTEST:
            case 70:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt50=1;
                }
                break;
            case RULE_EMPTYITEMTYPE:
                {
                alt50=2;
                }
                break;
            case RULE_ID:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3600:2: ( (lv_kindTest_0_0= ruleKindTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3600:2: ( (lv_kindTest_0_0= ruleKindTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3601:1: (lv_kindTest_0_0= ruleKindTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3601:1: (lv_kindTest_0_0= ruleKindTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3602:3: lv_kindTest_0_0= ruleKindTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getItemTypeAccess().getKindTestKindTestParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKindTest_in_ruleItemType8070);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3619:6: ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3619:6: ( (lv_empty_1_0= RULE_EMPTYITEMTYPE ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3620:1: (lv_empty_1_0= RULE_EMPTYITEMTYPE )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3620:1: (lv_empty_1_0= RULE_EMPTYITEMTYPE )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3621:3: lv_empty_1_0= RULE_EMPTYITEMTYPE
                    {
                    lv_empty_1_0=(Token)match(input,RULE_EMPTYITEMTYPE,FOLLOW_RULE_EMPTYITEMTYPE_in_ruleItemType8093); 

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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3638:6: ( (lv_atomicType_2_0= ruleAtomicType ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3638:6: ( (lv_atomicType_2_0= ruleAtomicType ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3639:1: (lv_atomicType_2_0= ruleAtomicType )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3639:1: (lv_atomicType_2_0= ruleAtomicType )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3640:3: lv_atomicType_2_0= ruleAtomicType
                    {
                     
                    	        newCompositeNode(grammarAccess.getItemTypeAccess().getAtomicTypeAtomicTypeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicType_in_ruleItemType8125);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3664:1: entryRuleAtomicType returns [EObject current=null] : iv_ruleAtomicType= ruleAtomicType EOF ;
    public final EObject entryRuleAtomicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicType = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3665:2: (iv_ruleAtomicType= ruleAtomicType EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3666:2: iv_ruleAtomicType= ruleAtomicType EOF
            {
             newCompositeNode(grammarAccess.getAtomicTypeRule()); 
            pushFollow(FOLLOW_ruleAtomicType_in_entryRuleAtomicType8161);
            iv_ruleAtomicType=ruleAtomicType();

            state._fsp--;

             current =iv_ruleAtomicType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicType8171); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3673:1: ruleAtomicType returns [EObject current=null] : ( (lv_type_0_0= RULE_ID ) ) ;
    public final EObject ruleAtomicType() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3676:28: ( ( (lv_type_0_0= RULE_ID ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3677:1: ( (lv_type_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3677:1: ( (lv_type_0_0= RULE_ID ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3678:1: (lv_type_0_0= RULE_ID )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3678:1: (lv_type_0_0= RULE_ID )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3679:3: lv_type_0_0= RULE_ID
            {
            lv_type_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomicType8212); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3703:1: entryRuleKindTest returns [EObject current=null] : iv_ruleKindTest= ruleKindTest EOF ;
    public final EObject entryRuleKindTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKindTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3704:2: (iv_ruleKindTest= ruleKindTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3705:2: iv_ruleKindTest= ruleKindTest EOF
            {
             newCompositeNode(grammarAccess.getKindTestRule()); 
            pushFollow(FOLLOW_ruleKindTest_in_entryRuleKindTest8252);
            iv_ruleKindTest=ruleKindTest();

            state._fsp--;

             current =iv_ruleKindTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKindTest8262); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3712:1: ruleKindTest returns [EObject current=null] : ( ( (lv_docTest_0_0= ruleDocumentTest ) ) | ( (lv_elemTest_1_0= ruleElementTest ) ) | ( (lv_attributeTest_2_0= ruleAttributeTest ) ) | ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) ) | ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) ) | ( (lv_pitTest_5_0= rulePITest ) ) | ( (lv_commentTest_6_0= RULE_COMMENTTEST ) ) | ( (lv_textTest_7_0= RULE_TEXTTEST ) ) | ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) ) ) ;
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
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3715:28: ( ( ( (lv_docTest_0_0= ruleDocumentTest ) ) | ( (lv_elemTest_1_0= ruleElementTest ) ) | ( (lv_attributeTest_2_0= ruleAttributeTest ) ) | ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) ) | ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) ) | ( (lv_pitTest_5_0= rulePITest ) ) | ( (lv_commentTest_6_0= RULE_COMMENTTEST ) ) | ( (lv_textTest_7_0= RULE_TEXTTEST ) ) | ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3716:1: ( ( (lv_docTest_0_0= ruleDocumentTest ) ) | ( (lv_elemTest_1_0= ruleElementTest ) ) | ( (lv_attributeTest_2_0= ruleAttributeTest ) ) | ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) ) | ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) ) | ( (lv_pitTest_5_0= rulePITest ) ) | ( (lv_commentTest_6_0= RULE_COMMENTTEST ) ) | ( (lv_textTest_7_0= RULE_TEXTTEST ) ) | ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3716:1: ( ( (lv_docTest_0_0= ruleDocumentTest ) ) | ( (lv_elemTest_1_0= ruleElementTest ) ) | ( (lv_attributeTest_2_0= ruleAttributeTest ) ) | ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) ) | ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) ) | ( (lv_pitTest_5_0= rulePITest ) ) | ( (lv_commentTest_6_0= RULE_COMMENTTEST ) ) | ( (lv_textTest_7_0= RULE_TEXTTEST ) ) | ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) ) )
            int alt51=9;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt51=1;
                }
                break;
            case 84:
                {
                alt51=2;
                }
                break;
            case 70:
                {
                alt51=3;
                }
                break;
            case 85:
                {
                alt51=4;
                }
                break;
            case 83:
                {
                alt51=5;
                }
                break;
            case 82:
                {
                alt51=6;
                }
                break;
            case RULE_COMMENTTEST:
                {
                alt51=7;
                }
                break;
            case RULE_TEXTTEST:
                {
                alt51=8;
                }
                break;
            case RULE_ANYKINDTEST:
                {
                alt51=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3716:2: ( (lv_docTest_0_0= ruleDocumentTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3716:2: ( (lv_docTest_0_0= ruleDocumentTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3717:1: (lv_docTest_0_0= ruleDocumentTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3717:1: (lv_docTest_0_0= ruleDocumentTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3718:3: lv_docTest_0_0= ruleDocumentTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getDocTestDocumentTestParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDocumentTest_in_ruleKindTest8308);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3735:6: ( (lv_elemTest_1_0= ruleElementTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3735:6: ( (lv_elemTest_1_0= ruleElementTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3736:1: (lv_elemTest_1_0= ruleElementTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3736:1: (lv_elemTest_1_0= ruleElementTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3737:3: lv_elemTest_1_0= ruleElementTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getElemTestElementTestParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementTest_in_ruleKindTest8335);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3754:6: ( (lv_attributeTest_2_0= ruleAttributeTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3754:6: ( (lv_attributeTest_2_0= ruleAttributeTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3755:1: (lv_attributeTest_2_0= ruleAttributeTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3755:1: (lv_attributeTest_2_0= ruleAttributeTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3756:3: lv_attributeTest_2_0= ruleAttributeTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getAttributeTestAttributeTestParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeTest_in_ruleKindTest8362);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3773:6: ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3773:6: ( (lv_schemaElemTest_3_0= ruleSchemaElementTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3774:1: (lv_schemaElemTest_3_0= ruleSchemaElementTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3774:1: (lv_schemaElemTest_3_0= ruleSchemaElementTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3775:3: lv_schemaElemTest_3_0= ruleSchemaElementTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getSchemaElemTestSchemaElementTestParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSchemaElementTest_in_ruleKindTest8389);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3792:6: ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3792:6: ( (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3793:1: (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3793:1: (lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3794:3: lv_schemaAttributeTest_4_0= ruleSchemaAttributeTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getSchemaAttributeTestSchemaAttributeTestParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSchemaAttributeTest_in_ruleKindTest8416);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3811:6: ( (lv_pitTest_5_0= rulePITest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3811:6: ( (lv_pitTest_5_0= rulePITest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3812:1: (lv_pitTest_5_0= rulePITest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3812:1: (lv_pitTest_5_0= rulePITest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3813:3: lv_pitTest_5_0= rulePITest
                    {
                     
                    	        newCompositeNode(grammarAccess.getKindTestAccess().getPitTestPITestParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_rulePITest_in_ruleKindTest8443);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3830:6: ( (lv_commentTest_6_0= RULE_COMMENTTEST ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3830:6: ( (lv_commentTest_6_0= RULE_COMMENTTEST ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3831:1: (lv_commentTest_6_0= RULE_COMMENTTEST )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3831:1: (lv_commentTest_6_0= RULE_COMMENTTEST )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3832:3: lv_commentTest_6_0= RULE_COMMENTTEST
                    {
                    lv_commentTest_6_0=(Token)match(input,RULE_COMMENTTEST,FOLLOW_RULE_COMMENTTEST_in_ruleKindTest8466); 

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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3849:6: ( (lv_textTest_7_0= RULE_TEXTTEST ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3849:6: ( (lv_textTest_7_0= RULE_TEXTTEST ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3850:1: (lv_textTest_7_0= RULE_TEXTTEST )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3850:1: (lv_textTest_7_0= RULE_TEXTTEST )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3851:3: lv_textTest_7_0= RULE_TEXTTEST
                    {
                    lv_textTest_7_0=(Token)match(input,RULE_TEXTTEST,FOLLOW_RULE_TEXTTEST_in_ruleKindTest8494); 

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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3868:6: ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3868:6: ( (lv_anyKindTest_8_0= RULE_ANYKINDTEST ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3869:1: (lv_anyKindTest_8_0= RULE_ANYKINDTEST )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3869:1: (lv_anyKindTest_8_0= RULE_ANYKINDTEST )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3870:3: lv_anyKindTest_8_0= RULE_ANYKINDTEST
                    {
                    lv_anyKindTest_8_0=(Token)match(input,RULE_ANYKINDTEST,FOLLOW_RULE_ANYKINDTEST_in_ruleKindTest8522); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3894:1: entryRuleDocumentTest returns [EObject current=null] : iv_ruleDocumentTest= ruleDocumentTest EOF ;
    public final EObject entryRuleDocumentTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocumentTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3895:2: (iv_ruleDocumentTest= ruleDocumentTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3896:2: iv_ruleDocumentTest= ruleDocumentTest EOF
            {
             newCompositeNode(grammarAccess.getDocumentTestRule()); 
            pushFollow(FOLLOW_ruleDocumentTest_in_entryRuleDocumentTest8563);
            iv_ruleDocumentTest=ruleDocumentTest();

            state._fsp--;

             current =iv_ruleDocumentTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocumentTest8573); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3903:1: ruleDocumentTest returns [EObject current=null] : ( () otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' ) ;
    public final EObject ruleDocumentTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_elemTest_3_0 = null;

        EObject lv_schemaElemTest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3906:28: ( ( () otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3907:1: ( () otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3907:1: ( () otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3907:2: () otherlv_1= 'document-node' otherlv_2= '(' ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )? otherlv_5= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3907:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3908:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDocumentTestAccess().getDocumentTestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleDocumentTest8619); 

                	newLeafNode(otherlv_1, grammarAccess.getDocumentTestAccess().getDocumentNodeKeyword_1());
                
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleDocumentTest8631); 

                	newLeafNode(otherlv_2, grammarAccess.getDocumentTestAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3921:1: ( ( (lv_elemTest_3_0= ruleElementTest ) ) | ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) ) )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==84) ) {
                alt52=1;
            }
            else if ( (LA52_0==85) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3921:2: ( (lv_elemTest_3_0= ruleElementTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3921:2: ( (lv_elemTest_3_0= ruleElementTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3922:1: (lv_elemTest_3_0= ruleElementTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3922:1: (lv_elemTest_3_0= ruleElementTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3923:3: lv_elemTest_3_0= ruleElementTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentTestAccess().getElemTestElementTestParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementTest_in_ruleDocumentTest8653);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3940:6: ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3940:6: ( (lv_schemaElemTest_4_0= ruleSchemaElementTest ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3941:1: (lv_schemaElemTest_4_0= ruleSchemaElementTest )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3941:1: (lv_schemaElemTest_4_0= ruleSchemaElementTest )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3942:3: lv_schemaElemTest_4_0= ruleSchemaElementTest
                    {
                     
                    	        newCompositeNode(grammarAccess.getDocumentTestAccess().getSchemaElemTestSchemaElementTestParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSchemaElementTest_in_ruleDocumentTest8680);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleDocumentTest8694); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3970:1: entryRulePITest returns [EObject current=null] : iv_rulePITest= rulePITest EOF ;
    public final EObject entryRulePITest() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePITest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3971:2: (iv_rulePITest= rulePITest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3972:2: iv_rulePITest= rulePITest EOF
            {
             newCompositeNode(grammarAccess.getPITestRule()); 
            pushFollow(FOLLOW_rulePITest_in_entryRulePITest8730);
            iv_rulePITest=rulePITest();

            state._fsp--;

             current =iv_rulePITest; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePITest8740); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3979:1: rulePITest returns [EObject current=null] : ( () otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )? otherlv_5= ')' ) ;
    public final EObject rulePITest() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_string_4_0=null;
        Token otherlv_5=null;
        EObject lv_ncName_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3982:28: ( ( () otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )? otherlv_5= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3983:1: ( () otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )? otherlv_5= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3983:1: ( () otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )? otherlv_5= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3983:2: () otherlv_1= 'processing-instruction' otherlv_2= '(' ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )? otherlv_5= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3983:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3984:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPITestAccess().getPITTestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_rulePITest8786); 

                	newLeafNode(otherlv_1, grammarAccess.getPITestAccess().getProcessingInstructionKeyword_1());
                
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePITest8798); 

                	newLeafNode(otherlv_2, grammarAccess.getPITestAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3997:1: ( ( (lv_ncName_3_0= ruleNCName ) ) | ( (lv_string_4_0= RULE_STRINGLITERAL ) ) )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_STRINGLITERAL) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3997:2: ( (lv_ncName_3_0= ruleNCName ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3997:2: ( (lv_ncName_3_0= ruleNCName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3998:1: (lv_ncName_3_0= ruleNCName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3998:1: (lv_ncName_3_0= ruleNCName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:3999:3: lv_ncName_3_0= ruleNCName
                    {
                     
                    	        newCompositeNode(grammarAccess.getPITestAccess().getNcNameNCNameParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNCName_in_rulePITest8820);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4016:6: ( (lv_string_4_0= RULE_STRINGLITERAL ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4016:6: ( (lv_string_4_0= RULE_STRINGLITERAL ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4017:1: (lv_string_4_0= RULE_STRINGLITERAL )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4017:1: (lv_string_4_0= RULE_STRINGLITERAL )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4018:3: lv_string_4_0= RULE_STRINGLITERAL
                    {
                    lv_string_4_0=(Token)match(input,RULE_STRINGLITERAL,FOLLOW_RULE_STRINGLITERAL_in_rulePITest8843); 

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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_rulePITest8862); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4046:1: entryRuleAttributeTest returns [EObject current=null] : iv_ruleAttributeTest= ruleAttributeTest EOF ;
    public final EObject entryRuleAttributeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4047:2: (iv_ruleAttributeTest= ruleAttributeTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4048:2: iv_ruleAttributeTest= ruleAttributeTest EOF
            {
             newCompositeNode(grammarAccess.getAttributeTestRule()); 
            pushFollow(FOLLOW_ruleAttributeTest_in_entryRuleAttributeTest8898);
            iv_ruleAttributeTest=ruleAttributeTest();

            state._fsp--;

             current =iv_ruleAttributeTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeTest8908); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4055:1: ruleAttributeTest returns [EObject current=null] : ( () otherlv_1= 'attribute' otherlv_2= '(' ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' ) ;
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
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4058:28: ( ( () otherlv_1= 'attribute' otherlv_2= '(' ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4059:1: ( () otherlv_1= 'attribute' otherlv_2= '(' ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4059:1: ( () otherlv_1= 'attribute' otherlv_2= '(' ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4059:2: () otherlv_1= 'attribute' otherlv_2= '(' ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )? otherlv_6= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4059:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4060:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeTestAccess().getAttributeTestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleAttributeTest8954); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeTestAccess().getAttributeKeyword_1());
                
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAttributeTest8966); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeTestAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4073:1: ( ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )? )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID||LA55_0==36) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4073:2: ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )?
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4073:2: ( (lv_attrOrWild_3_0= ruleAttribNameOrWildcard ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4074:1: (lv_attrOrWild_3_0= ruleAttribNameOrWildcard )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4074:1: (lv_attrOrWild_3_0= ruleAttribNameOrWildcard )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4075:3: lv_attrOrWild_3_0= ruleAttribNameOrWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeTestAccess().getAttrOrWildAttribNameOrWildcardParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttribNameOrWildcard_in_ruleAttributeTest8988);
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

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4091:2: (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==18) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4091:4: otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) )
                            {
                            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAttributeTest9001); 

                                	newLeafNode(otherlv_4, grammarAccess.getAttributeTestAccess().getCommaKeyword_3_1_0());
                                
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4095:1: ( (lv_typeName_5_0= ruleTypeName ) )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4096:1: (lv_typeName_5_0= ruleTypeName )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4096:1: (lv_typeName_5_0= ruleTypeName )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4097:3: lv_typeName_5_0= ruleTypeName
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeTestAccess().getTypeNameTypeNameParserRuleCall_3_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeName_in_ruleAttributeTest9022);
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

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleAttributeTest9038); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4125:1: entryRuleAttribNameOrWildcard returns [EObject current=null] : iv_ruleAttribNameOrWildcard= ruleAttribNameOrWildcard EOF ;
    public final EObject entryRuleAttribNameOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribNameOrWildcard = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4126:2: (iv_ruleAttribNameOrWildcard= ruleAttribNameOrWildcard EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4127:2: iv_ruleAttribNameOrWildcard= ruleAttribNameOrWildcard EOF
            {
             newCompositeNode(grammarAccess.getAttribNameOrWildcardRule()); 
            pushFollow(FOLLOW_ruleAttribNameOrWildcard_in_entryRuleAttribNameOrWildcard9074);
            iv_ruleAttribNameOrWildcard=ruleAttribNameOrWildcard();

            state._fsp--;

             current =iv_ruleAttribNameOrWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribNameOrWildcard9084); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4134:1: ruleAttribNameOrWildcard returns [EObject current=null] : ( ( (lv_attName_0_0= ruleAttributeName ) ) | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleAttribNameOrWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_attName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4137:28: ( ( ( (lv_attName_0_0= ruleAttributeName ) ) | ( () otherlv_2= '*' ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4138:1: ( ( (lv_attName_0_0= ruleAttributeName ) ) | ( () otherlv_2= '*' ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4138:1: ( ( (lv_attName_0_0= ruleAttributeName ) ) | ( () otherlv_2= '*' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( (LA56_0==36) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4138:2: ( (lv_attName_0_0= ruleAttributeName ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4138:2: ( (lv_attName_0_0= ruleAttributeName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4139:1: (lv_attName_0_0= ruleAttributeName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4139:1: (lv_attName_0_0= ruleAttributeName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4140:3: lv_attName_0_0= ruleAttributeName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttribNameOrWildcardAccess().getAttNameAttributeNameParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeName_in_ruleAttribNameOrWildcard9130);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4157:6: ( () otherlv_2= '*' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4157:6: ( () otherlv_2= '*' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4157:7: () otherlv_2= '*'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4157:7: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4158:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAttribNameOrWildcardAccess().getAttribNameOrWildcardAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleAttribNameOrWildcard9158); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4175:1: entryRuleSchemaAttributeTest returns [EObject current=null] : iv_ruleSchemaAttributeTest= ruleSchemaAttributeTest EOF ;
    public final EObject entryRuleSchemaAttributeTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaAttributeTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4176:2: (iv_ruleSchemaAttributeTest= ruleSchemaAttributeTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4177:2: iv_ruleSchemaAttributeTest= ruleSchemaAttributeTest EOF
            {
             newCompositeNode(grammarAccess.getSchemaAttributeTestRule()); 
            pushFollow(FOLLOW_ruleSchemaAttributeTest_in_entryRuleSchemaAttributeTest9195);
            iv_ruleSchemaAttributeTest=ruleSchemaAttributeTest();

            state._fsp--;

             current =iv_ruleSchemaAttributeTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemaAttributeTest9205); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4184:1: ruleSchemaAttributeTest returns [EObject current=null] : (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attDec_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' ) ;
    public final EObject ruleSchemaAttributeTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attDec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4187:28: ( (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attDec_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4188:1: (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attDec_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4188:1: (otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attDec_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4188:3: otherlv_0= 'schema-attribute' otherlv_1= '(' ( (lv_attDec_2_0= ruleAttributeDeclaration ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_83_in_ruleSchemaAttributeTest9242); 

                	newLeafNode(otherlv_0, grammarAccess.getSchemaAttributeTestAccess().getSchemaAttributeKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSchemaAttributeTest9254); 

                	newLeafNode(otherlv_1, grammarAccess.getSchemaAttributeTestAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4196:1: ( (lv_attDec_2_0= ruleAttributeDeclaration ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4197:1: (lv_attDec_2_0= ruleAttributeDeclaration )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4197:1: (lv_attDec_2_0= ruleAttributeDeclaration )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4198:3: lv_attDec_2_0= ruleAttributeDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getSchemaAttributeTestAccess().getAttDecAttributeDeclarationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeDeclaration_in_ruleSchemaAttributeTest9275);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleSchemaAttributeTest9287); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4226:1: entryRuleAttributeDeclaration returns [EObject current=null] : iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF ;
    public final EObject entryRuleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDeclaration = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4227:2: (iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4228:2: iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAttributeDeclarationRule()); 
            pushFollow(FOLLOW_ruleAttributeDeclaration_in_entryRuleAttributeDeclaration9323);
            iv_ruleAttributeDeclaration=ruleAttributeDeclaration();

            state._fsp--;

             current =iv_ruleAttributeDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDeclaration9333); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4235:1: ruleAttributeDeclaration returns [EObject current=null] : ( (lv_attName_0_0= ruleAttributeName ) ) ;
    public final EObject ruleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject lv_attName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4238:28: ( ( (lv_attName_0_0= ruleAttributeName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4239:1: ( (lv_attName_0_0= ruleAttributeName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4239:1: ( (lv_attName_0_0= ruleAttributeName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4240:1: (lv_attName_0_0= ruleAttributeName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4240:1: (lv_attName_0_0= ruleAttributeName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4241:3: lv_attName_0_0= ruleAttributeName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeDeclarationAccess().getAttNameAttributeNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeName_in_ruleAttributeDeclaration9378);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4265:1: entryRuleElementTest returns [EObject current=null] : iv_ruleElementTest= ruleElementTest EOF ;
    public final EObject entryRuleElementTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4266:2: (iv_ruleElementTest= ruleElementTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4267:2: iv_ruleElementTest= ruleElementTest EOF
            {
             newCompositeNode(grammarAccess.getElementTestRule()); 
            pushFollow(FOLLOW_ruleElementTest_in_entryRuleElementTest9413);
            iv_ruleElementTest=ruleElementTest();

            state._fsp--;

             current =iv_ruleElementTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementTest9423); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4274:1: ruleElementTest returns [EObject current=null] : ( () otherlv_1= 'element' otherlv_2= '(' ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )? otherlv_7= ')' ) ;
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
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4277:28: ( ( () otherlv_1= 'element' otherlv_2= '(' ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )? otherlv_7= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4278:1: ( () otherlv_1= 'element' otherlv_2= '(' ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )? otherlv_7= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4278:1: ( () otherlv_1= 'element' otherlv_2= '(' ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )? otherlv_7= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4278:2: () otherlv_1= 'element' otherlv_2= '(' ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )? otherlv_7= ')'
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4278:2: ()
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4279:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElementTestAccess().getElementTestAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleElementTest9469); 

                	newLeafNode(otherlv_1, grammarAccess.getElementTestAccess().getElementKeyword_1());
                
            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleElementTest9481); 

                	newLeafNode(otherlv_2, grammarAccess.getElementTestAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4292:1: ( ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )? )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID||LA59_0==36) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4292:2: ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) ) (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )?
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4292:2: ( (lv_elemOrWild_3_0= ruleElementNameOrWildcard ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4293:1: (lv_elemOrWild_3_0= ruleElementNameOrWildcard )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4293:1: (lv_elemOrWild_3_0= ruleElementNameOrWildcard )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4294:3: lv_elemOrWild_3_0= ruleElementNameOrWildcard
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementTestAccess().getElemOrWildElementNameOrWildcardParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementNameOrWildcard_in_ruleElementTest9503);
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

                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4310:2: (otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )? )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==18) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4310:4: otherlv_4= ',' ( (lv_typeName_5_0= ruleTypeName ) ) (otherlv_6= '?' )?
                            {
                            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleElementTest9516); 

                                	newLeafNode(otherlv_4, grammarAccess.getElementTestAccess().getCommaKeyword_3_1_0());
                                
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4314:1: ( (lv_typeName_5_0= ruleTypeName ) )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4315:1: (lv_typeName_5_0= ruleTypeName )
                            {
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4315:1: (lv_typeName_5_0= ruleTypeName )
                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4316:3: lv_typeName_5_0= ruleTypeName
                            {
                             
                            	        newCompositeNode(grammarAccess.getElementTestAccess().getTypeNameTypeNameParserRuleCall_3_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeName_in_ruleElementTest9537);
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

                            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4332:2: (otherlv_6= '?' )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==80) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4332:4: otherlv_6= '?'
                                    {
                                    otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleElementTest9550); 

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

            otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleElementTest9568); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4348:1: entryRuleElementNameOrWildcard returns [EObject current=null] : iv_ruleElementNameOrWildcard= ruleElementNameOrWildcard EOF ;
    public final EObject entryRuleElementNameOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementNameOrWildcard = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4349:2: (iv_ruleElementNameOrWildcard= ruleElementNameOrWildcard EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4350:2: iv_ruleElementNameOrWildcard= ruleElementNameOrWildcard EOF
            {
             newCompositeNode(grammarAccess.getElementNameOrWildcardRule()); 
            pushFollow(FOLLOW_ruleElementNameOrWildcard_in_entryRuleElementNameOrWildcard9604);
            iv_ruleElementNameOrWildcard=ruleElementNameOrWildcard();

            state._fsp--;

             current =iv_ruleElementNameOrWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementNameOrWildcard9614); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4357:1: ruleElementNameOrWildcard returns [EObject current=null] : ( ( (lv_elemName_0_0= ruleElementName ) ) | ( () otherlv_2= '*' ) ) ;
    public final EObject ruleElementNameOrWildcard() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_elemName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4360:28: ( ( ( (lv_elemName_0_0= ruleElementName ) ) | ( () otherlv_2= '*' ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4361:1: ( ( (lv_elemName_0_0= ruleElementName ) ) | ( () otherlv_2= '*' ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4361:1: ( ( (lv_elemName_0_0= ruleElementName ) ) | ( () otherlv_2= '*' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) ) {
                alt60=1;
            }
            else if ( (LA60_0==36) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4361:2: ( (lv_elemName_0_0= ruleElementName ) )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4361:2: ( (lv_elemName_0_0= ruleElementName ) )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4362:1: (lv_elemName_0_0= ruleElementName )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4362:1: (lv_elemName_0_0= ruleElementName )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4363:3: lv_elemName_0_0= ruleElementName
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementNameOrWildcardAccess().getElemNameElementNameParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementName_in_ruleElementNameOrWildcard9660);
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
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4380:6: ( () otherlv_2= '*' )
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4380:6: ( () otherlv_2= '*' )
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4380:7: () otherlv_2= '*'
                    {
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4380:7: ()
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4381:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getElementNameOrWildcardAccess().getElementNameOrWildcardAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleElementNameOrWildcard9688); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4398:1: entryRuleSchemaElementTest returns [EObject current=null] : iv_ruleSchemaElementTest= ruleSchemaElementTest EOF ;
    public final EObject entryRuleSchemaElementTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchemaElementTest = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4399:2: (iv_ruleSchemaElementTest= ruleSchemaElementTest EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4400:2: iv_ruleSchemaElementTest= ruleSchemaElementTest EOF
            {
             newCompositeNode(grammarAccess.getSchemaElementTestRule()); 
            pushFollow(FOLLOW_ruleSchemaElementTest_in_entryRuleSchemaElementTest9725);
            iv_ruleSchemaElementTest=ruleSchemaElementTest();

            state._fsp--;

             current =iv_ruleSchemaElementTest; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSchemaElementTest9735); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4407:1: ruleSchemaElementTest returns [EObject current=null] : (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elemDec_2_0= ruleElementDeclaration ) ) otherlv_3= ')' ) ;
    public final EObject ruleSchemaElementTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elemDec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4410:28: ( (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elemDec_2_0= ruleElementDeclaration ) ) otherlv_3= ')' ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4411:1: (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elemDec_2_0= ruleElementDeclaration ) ) otherlv_3= ')' )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4411:1: (otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elemDec_2_0= ruleElementDeclaration ) ) otherlv_3= ')' )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4411:3: otherlv_0= 'schema-element' otherlv_1= '(' ( (lv_elemDec_2_0= ruleElementDeclaration ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleSchemaElementTest9772); 

                	newLeafNode(otherlv_0, grammarAccess.getSchemaElementTestAccess().getSchemaElementKeyword_0());
                
            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSchemaElementTest9784); 

                	newLeafNode(otherlv_1, grammarAccess.getSchemaElementTestAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4419:1: ( (lv_elemDec_2_0= ruleElementDeclaration ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4420:1: (lv_elemDec_2_0= ruleElementDeclaration )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4420:1: (lv_elemDec_2_0= ruleElementDeclaration )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4421:3: lv_elemDec_2_0= ruleElementDeclaration
            {
             
            	        newCompositeNode(grammarAccess.getSchemaElementTestAccess().getElemDecElementDeclarationParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleElementDeclaration_in_ruleSchemaElementTest9805);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleSchemaElementTest9817); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4449:1: entryRuleElementDeclaration returns [EObject current=null] : iv_ruleElementDeclaration= ruleElementDeclaration EOF ;
    public final EObject entryRuleElementDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementDeclaration = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4450:2: (iv_ruleElementDeclaration= ruleElementDeclaration EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4451:2: iv_ruleElementDeclaration= ruleElementDeclaration EOF
            {
             newCompositeNode(grammarAccess.getElementDeclarationRule()); 
            pushFollow(FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration9853);
            iv_ruleElementDeclaration=ruleElementDeclaration();

            state._fsp--;

             current =iv_ruleElementDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementDeclaration9863); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4458:1: ruleElementDeclaration returns [EObject current=null] : this_ElementName_0= ruleElementName ;
    public final EObject ruleElementDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_ElementName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4461:28: (this_ElementName_0= ruleElementName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4463:5: this_ElementName_0= ruleElementName
            {
             
                    newCompositeNode(grammarAccess.getElementDeclarationAccess().getElementNameParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleElementName_in_ruleElementDeclaration9909);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4479:1: entryRuleAttributeName returns [EObject current=null] : iv_ruleAttributeName= ruleAttributeName EOF ;
    public final EObject entryRuleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4480:2: (iv_ruleAttributeName= ruleAttributeName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4481:2: iv_ruleAttributeName= ruleAttributeName EOF
            {
             newCompositeNode(grammarAccess.getAttributeNameRule()); 
            pushFollow(FOLLOW_ruleAttributeName_in_entryRuleAttributeName9943);
            iv_ruleAttributeName=ruleAttributeName();

            state._fsp--;

             current =iv_ruleAttributeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeName9953); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4488:1: ruleAttributeName returns [EObject current=null] : ( (lv_qName_0_0= ruleQName ) ) ;
    public final EObject ruleAttributeName() throws RecognitionException {
        EObject current = null;

        EObject lv_qName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4491:28: ( ( (lv_qName_0_0= ruleQName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4492:1: ( (lv_qName_0_0= ruleQName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4492:1: ( (lv_qName_0_0= ruleQName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4493:1: (lv_qName_0_0= ruleQName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4493:1: (lv_qName_0_0= ruleQName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4494:3: lv_qName_0_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeNameAccess().getQNameQNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleAttributeName9998);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4518:1: entryRuleElementName returns [EObject current=null] : iv_ruleElementName= ruleElementName EOF ;
    public final EObject entryRuleElementName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4519:2: (iv_ruleElementName= ruleElementName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4520:2: iv_ruleElementName= ruleElementName EOF
            {
             newCompositeNode(grammarAccess.getElementNameRule()); 
            pushFollow(FOLLOW_ruleElementName_in_entryRuleElementName10033);
            iv_ruleElementName=ruleElementName();

            state._fsp--;

             current =iv_ruleElementName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementName10043); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4527:1: ruleElementName returns [EObject current=null] : ( (lv_qName_0_0= ruleQName ) ) ;
    public final EObject ruleElementName() throws RecognitionException {
        EObject current = null;

        EObject lv_qName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4530:28: ( ( (lv_qName_0_0= ruleQName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4531:1: ( (lv_qName_0_0= ruleQName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4531:1: ( (lv_qName_0_0= ruleQName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4532:1: (lv_qName_0_0= ruleQName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4532:1: (lv_qName_0_0= ruleQName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4533:3: lv_qName_0_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getElementNameAccess().getQNameQNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleElementName10088);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4557:1: entryRuleTypeName returns [EObject current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final EObject entryRuleTypeName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4558:2: (iv_ruleTypeName= ruleTypeName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4559:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_ruleTypeName_in_entryRuleTypeName10123);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeName10133); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4566:1: ruleTypeName returns [EObject current=null] : ( (lv_qName_0_0= ruleQName ) ) ;
    public final EObject ruleTypeName() throws RecognitionException {
        EObject current = null;

        EObject lv_qName_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4569:28: ( ( (lv_qName_0_0= ruleQName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4570:1: ( (lv_qName_0_0= ruleQName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4570:1: ( (lv_qName_0_0= ruleQName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4571:1: (lv_qName_0_0= ruleQName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4571:1: (lv_qName_0_0= ruleQName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4572:3: lv_qName_0_0= ruleQName
            {
             
            	        newCompositeNode(grammarAccess.getTypeNameAccess().getQNameQNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQName_in_ruleTypeName10178);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4596:1: entryRuleNCName returns [EObject current=null] : iv_ruleNCName= ruleNCName EOF ;
    public final EObject entryRuleNCName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNCName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4597:2: (iv_ruleNCName= ruleNCName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4598:2: iv_ruleNCName= ruleNCName EOF
            {
             newCompositeNode(grammarAccess.getNCNameRule()); 
            pushFollow(FOLLOW_ruleNCName_in_entryRuleNCName10213);
            iv_ruleNCName=ruleNCName();

            state._fsp--;

             current =iv_ruleNCName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNCName10223); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4605:1: ruleNCName returns [EObject current=null] : ( (lv_ncName_0_0= RULE_ID ) ) ;
    public final EObject ruleNCName() throws RecognitionException {
        EObject current = null;

        Token lv_ncName_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4608:28: ( ( (lv_ncName_0_0= RULE_ID ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4609:1: ( (lv_ncName_0_0= RULE_ID ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4609:1: ( (lv_ncName_0_0= RULE_ID ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4610:1: (lv_ncName_0_0= RULE_ID )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4610:1: (lv_ncName_0_0= RULE_ID )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4611:3: lv_ncName_0_0= RULE_ID
            {
            lv_ncName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNCName10264); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4635:1: entryRuleQName returns [EObject current=null] : iv_ruleQName= ruleQName EOF ;
    public final EObject entryRuleQName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4636:2: (iv_ruleQName= ruleQName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4637:2: iv_ruleQName= ruleQName EOF
            {
             newCompositeNode(grammarAccess.getQNameRule()); 
            pushFollow(FOLLOW_ruleQName_in_entryRuleQName10304);
            iv_ruleQName=ruleQName();

            state._fsp--;

             current =iv_ruleQName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQName10314); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4644:1: ruleQName returns [EObject current=null] : (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName ) ;
    public final EObject ruleQName() throws RecognitionException {
        EObject current = null;

        EObject this_PrefixedName_0 = null;

        EObject this_UnprefixedName_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4647:28: ( (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4648:1: (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4648:1: (this_PrefixedName_0= rulePrefixedName | this_UnprefixedName_1= ruleUnprefixedName )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==EOF||(LA61_1>=18 && LA61_1<=19)||LA61_1==22||LA61_1==25||(LA61_1>=27 && LA61_1<=28)||(LA61_1>=30 && LA61_1<=44)||LA61_1==46||(LA61_1>=48 && LA61_1<=66)||(LA61_1>=78 && LA61_1<=80)) ) {
                    alt61=2;
                }
                else if ( (LA61_1==77) ) {
                    alt61=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4649:5: this_PrefixedName_0= rulePrefixedName
                    {
                     
                            newCompositeNode(grammarAccess.getQNameAccess().getPrefixedNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrefixedName_in_ruleQName10361);
                    this_PrefixedName_0=rulePrefixedName();

                    state._fsp--;

                     
                            current = this_PrefixedName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4659:5: this_UnprefixedName_1= ruleUnprefixedName
                    {
                     
                            newCompositeNode(grammarAccess.getQNameAccess().getUnprefixedNameParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUnprefixedName_in_ruleQName10388);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4675:1: entryRulePrefixedName returns [EObject current=null] : iv_rulePrefixedName= rulePrefixedName EOF ;
    public final EObject entryRulePrefixedName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefixedName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4676:2: (iv_rulePrefixedName= rulePrefixedName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4677:2: iv_rulePrefixedName= rulePrefixedName EOF
            {
             newCompositeNode(grammarAccess.getPrefixedNameRule()); 
            pushFollow(FOLLOW_rulePrefixedName_in_entryRulePrefixedName10423);
            iv_rulePrefixedName=rulePrefixedName();

            state._fsp--;

             current =iv_rulePrefixedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrefixedName10433); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4684:1: rulePrefixedName returns [EObject current=null] : ( ( (lv_prefix_0_0= ruleNCName ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleNCName ) ) ) ;
    public final EObject rulePrefixedName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_prefix_0_0 = null;

        EObject lv_localPart_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4687:28: ( ( ( (lv_prefix_0_0= ruleNCName ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleNCName ) ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4688:1: ( ( (lv_prefix_0_0= ruleNCName ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleNCName ) ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4688:1: ( ( (lv_prefix_0_0= ruleNCName ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleNCName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4688:2: ( (lv_prefix_0_0= ruleNCName ) ) otherlv_1= ':' ( (lv_localPart_2_0= ruleNCName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4688:2: ( (lv_prefix_0_0= ruleNCName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4689:1: (lv_prefix_0_0= ruleNCName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4689:1: (lv_prefix_0_0= ruleNCName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4690:3: lv_prefix_0_0= ruleNCName
            {
             
            	        newCompositeNode(grammarAccess.getPrefixedNameAccess().getPrefixNCNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleNCName_in_rulePrefixedName10479);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_rulePrefixedName10491); 

                	newLeafNode(otherlv_1, grammarAccess.getPrefixedNameAccess().getColonKeyword_1());
                
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4710:1: ( (lv_localPart_2_0= ruleNCName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4711:1: (lv_localPart_2_0= ruleNCName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4711:1: (lv_localPart_2_0= ruleNCName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4712:3: lv_localPart_2_0= ruleNCName
            {
             
            	        newCompositeNode(grammarAccess.getPrefixedNameAccess().getLocalPartNCNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleNCName_in_rulePrefixedName10512);
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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4736:1: entryRuleUnprefixedName returns [EObject current=null] : iv_ruleUnprefixedName= ruleUnprefixedName EOF ;
    public final EObject entryRuleUnprefixedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnprefixedName = null;


        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4737:2: (iv_ruleUnprefixedName= ruleUnprefixedName EOF )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4738:2: iv_ruleUnprefixedName= ruleUnprefixedName EOF
            {
             newCompositeNode(grammarAccess.getUnprefixedNameRule()); 
            pushFollow(FOLLOW_ruleUnprefixedName_in_entryRuleUnprefixedName10548);
            iv_ruleUnprefixedName=ruleUnprefixedName();

            state._fsp--;

             current =iv_ruleUnprefixedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnprefixedName10558); 

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
    // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4745:1: ruleUnprefixedName returns [EObject current=null] : ( (lv_localPart_0_0= ruleNCName ) ) ;
    public final EObject ruleUnprefixedName() throws RecognitionException {
        EObject current = null;

        EObject lv_localPart_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4748:28: ( ( (lv_localPart_0_0= ruleNCName ) ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4749:1: ( (lv_localPart_0_0= ruleNCName ) )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4749:1: ( (lv_localPart_0_0= ruleNCName ) )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4750:1: (lv_localPart_0_0= ruleNCName )
            {
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4750:1: (lv_localPart_0_0= ruleNCName )
            // ../org.xtext.example.xpath/src-gen/org/xtext/example/xpath/parser/antlr/internal/InternalXPath.g:4751:3: lv_localPart_0_0= ruleNCName
            {
             
            	        newCompositeNode(grammarAccess.getUnprefixedNameAccess().getLocalPartNCNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNCName_in_ruleUnprefixedName10603);
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


 

    public static final BitSet FOLLOW_ruleXpath_in_entryRuleXpath75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXpath85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleXpath130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleExpr221 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleExpr234 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleExpr255 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleExprSingle_in_entryRuleExprSingle293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSingle303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForExpr_in_ruleExprSingle350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedExpr_in_ruleExprSingle377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpr_in_ruleExprSingle404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleExprSingle431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForExpr_in_entryRuleForExpr466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForExpr476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleForClause_in_ruleForExpr522 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleForExpr534 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleForExpr555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleForClause_in_entryRuleSimpleForClause591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleForClause601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSimpleForClause638 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSimpleForClause650 = new BitSet(new long[]{0x00000000082027C0L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleSimpleForClause671 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSimpleForClause683 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleSimpleForClause704 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleAdditionalIn_in_ruleSimpleForClause725 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleAdditionalIn_in_entryRuleAdditionalIn762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionalIn772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAdditionalIn809 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAdditionalIn821 = new BitSet(new long[]{0x00000000082027C0L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleAdditionalIn842 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAdditionalIn854 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleAdditionalIn875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedExpr_in_entryRuleQuantifiedExpr911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedExpr921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleQuantifiedExpr959 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_24_in_ruleQuantifiedExpr977 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQuantifiedExpr990 = new BitSet(new long[]{0x00000000082027C0L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleQuantifiedExpr1011 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQuantifiedExpr1023 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr1044 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_ruleAdditionalIn_in_ruleQuantifiedExpr1065 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_25_in_ruleQuantifiedExpr1078 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleQuantifiedExpr1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExpr_in_entryRuleIfExpr1135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExpr1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleIfExpr1182 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIfExpr1194 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIfExpr1215 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIfExpr1227 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleIfExpr1239 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleIfExpr1260 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleIfExpr1272 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleIfExpr1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr1385 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleOrExpr1398 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr1419 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisonExpr_in_ruleAndExpr1513 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleAndExpr1526 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleComparisonExpr_in_ruleAndExpr1547 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleComparisonExpr_in_entryRuleComparisonExpr1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisonExpr1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeExpr_in_ruleComparisonExpr1641 = new BitSet(new long[]{0xFFFC000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleValueComp_in_ruleComparisonExpr1664 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleGeneralComp_in_ruleComparisonExpr1691 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleNodeComp_in_ruleComparisonExpr1718 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleRangeExpr_in_ruleComparisonExpr1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRangeExpr_in_entryRuleRangeExpr1778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRangeExpr1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr1834 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleRangeExpr1847 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleAdditiveExpr_in_ruleRangeExpr1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpr_in_entryRuleAdditiveExpr1906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpr1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr1963 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleAdditiveExpr1986 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_35_in_ruleAdditiveExpr2015 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleMultiplicativeExpr_in_ruleAdditiveExpr2038 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpr_in_entryRuleMultiplicativeExpr2076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpr2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr2133 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_36_in_ruleMultiplicativeExpr2156 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_37_in_ruleMultiplicativeExpr2185 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_38_in_ruleMultiplicativeExpr2214 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_39_in_ruleMultiplicativeExpr2243 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleUnionExpr_in_ruleMultiplicativeExpr2266 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_ruleUnionExpr_in_entryRuleUnionExpr2304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnionExpr2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr2361 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_40_in_ruleUnionExpr2384 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_41_in_ruleUnionExpr2413 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleIntersectExceptExpr_in_ruleUnionExpr2436 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleIntersectExceptExpr_in_entryRuleIntersectExceptExpr2474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntersectExceptExpr2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr2531 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleIntersectExceptExpr2554 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_43_in_ruleIntersectExceptExpr2583 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleInstanceofExpr_in_ruleIntersectExceptExpr2606 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleInstanceofExpr_in_entryRuleInstanceofExpr2644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceofExpr2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatExpr_in_ruleInstanceofExpr2701 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_ruleInstanceofExpr2722 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleInstanceofExpr2734 = new BitSet(new long[]{0x000000000001F800L,0x00000000003E0040L});
    public static final BitSet FOLLOW_ruleSequenceType_in_ruleInstanceofExpr2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTreatExpr_in_entryRuleTreatExpr2793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTreatExpr2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastableExpr_in_ruleTreatExpr2850 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleTreatExpr2871 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTreatExpr2883 = new BitSet(new long[]{0x000000000001F800L,0x00000000003E0040L});
    public static final BitSet FOLLOW_ruleSequenceType_in_ruleTreatExpr2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastableExpr_in_entryRuleCastableExpr2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastableExpr2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastExpr_in_ruleCastableExpr2999 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCastableExpr3020 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCastableExpr3032 = new BitSet(new long[]{0x000000000001F800L,0x00000000003E0040L});
    public static final BitSet FOLLOW_ruleSingleType_in_ruleCastableExpr3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastExpr_in_entryRuleCastExpr3091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastExpr3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_ruleCastExpr3148 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCastExpr3169 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCastExpr3181 = new BitSet(new long[]{0x000000000001F800L,0x00000000003E0040L});
    public static final BitSet FOLLOW_ruleSingleType_in_ruleCastExpr3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr3240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleUnaryExpr3295 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_34_in_ruleUnaryExpr3324 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleValueExpr_in_ruleUnaryExpr3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpr_in_entryRuleValueExpr3398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpr3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleValueExpr3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralComp_in_entryRuleGeneralComp3488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralComp3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleGeneralComp3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleGeneralComp3578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGeneralComp3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleGeneralComp3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleGeneralComp3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleGeneralComp3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueComp_in_entryRuleValueComp3775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueComp3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleValueComp3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleValueComp3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleValueComp3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleValueComp3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleValueComp3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleValueComp4013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeComp_in_entryRuleNodeComp4062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeComp4072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleNodeComp4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleNodeComp4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleNodeComp4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr4238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rulePathExpr4286 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_rulePathExpr4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rulePathExpr4336 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_rulePathExpr4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_rulePathExpr4396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelativePathExpr_in_entryRuleRelativePathExpr4441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelativePathExpr4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepExpr_in_ruleRelativePathExpr4497 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleExtraStepExpr_in_ruleRelativePathExpr4518 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleExtraStepExpr_in_entryRuleExtraStepExpr4555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtraStepExpr4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleExtraStepExpr4603 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleStepExpr_in_ruleExtraStepExpr4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleExtraStepExpr4653 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleStepExpr_in_ruleExtraStepExpr4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStepExpr_in_entryRuleStepExpr4720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStepExpr4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpr_in_ruleStepExpr4776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxisStep_in_ruleStepExpr4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxisStep_in_entryRuleAxisStep4839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAxisStep4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReverseStep_in_ruleAxisStep4896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ruleForwardStep_in_ruleAxisStep4923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_rulePredicateList_in_ruleAxisStep4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardStep_in_entryRuleForwardStep4981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForwardStep4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardAxis_in_ruleForwardStep5038 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleNodeTest_in_ruleForwardStep5059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbbrevForwardStep_in_ruleForwardStep5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForwardAxis_in_entryRuleForwardAxis5123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForwardAxis5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleForwardAxis5177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleForwardAxis5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleForwardAxis5228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleForwardAxis5253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleForwardAxis5279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleForwardAxis5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleForwardAxis5330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleForwardAxis5355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleForwardAxis5381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleForwardAxis5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleForwardAxis5432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleForwardAxis5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleForwardAxis5483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleForwardAxis5508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleForwardAxis5534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleForwardAxis5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbbrevForwardStep_in_entryRuleAbbrevForwardStep5596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbbrevForwardStep5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleAbbrevForwardStep5644 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleNodeTest_in_ruleAbbrevForwardStep5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTest_in_ruleAbbrevForwardStep5704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReverseStep_in_entryRuleReverseStep5749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReverseStep5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REVERSEAXIS_in_ruleReverseStep5802 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleNodeTest_in_ruleReverseStep5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ABBREVREVERSESTEP_in_ruleReverseStep5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeTest_in_entryRuleNodeTest5893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeTest5903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKindTest_in_ruleNodeTest5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameTest_in_ruleNodeTest5976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNameTest_in_entryRuleNameTest6012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNameTest6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleNameTest6068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_ruleNameTest6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcard_in_entryRuleWildcard6131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcard6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleWildcard6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNCName_in_ruleWildcard6225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleWildcard6237 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleWildcard6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleWildcard6269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleWildcard6281 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleNCName_in_ruleWildcard6302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFilterExpr_in_entryRuleFilterExpr6339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFilterExpr6349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleFilterExpr6395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_rulePredicateList_in_ruleFilterExpr6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateList_in_entryRulePredicateList6452 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateList6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rulePredicateList6517 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate6554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rulePredicate6601 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExpr_in_rulePredicate6622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_rulePredicate6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr6670 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpr6680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpr6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_rulePrimaryExpr6753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpr_in_rulePrimaryExpr6780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONTEXTITEMEXPR_in_rulePrimaryExpr6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_rulePrimaryExpr6835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericLiteral_in_ruleLiteral6927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRINGLITERAL_in_ruleLiteral6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericLiteral_in_entryRuleNumericLiteral6991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericLiteral7001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTLITERAL_in_ruleNumericLiteral7043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMALLITERAL_in_ruleNumericLiteral7071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLELITERAL_in_ruleNumericLiteral7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarRef_in_entryRuleVarRef7140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarRef7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleVarRef7187 = new BitSet(new long[]{0x00000000082027C0L});
    public static final BitSet FOLLOW_ruleVarName_in_ruleVarRef7209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarName_in_entryRuleVarName7244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarName7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleVarName7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpr_in_entryRuleParenthesizedExpr7334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpr7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleParenthesizedExpr7390 = new BitSet(new long[]{0x0000001C1DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExpr_in_ruleParenthesizedExpr7411 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleParenthesizedExpr7424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall7460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleFunctionCall7516 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionCall7528 = new BitSet(new long[]{0x0000001C1DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleFunctionCall7550 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionCall7563 = new BitSet(new long[]{0x0000001C0DB1E7F0L,0x00000000003E1FEEL});
    public static final BitSet FOLLOW_ruleExprSingle_in_ruleFunctionCall7584 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionCall7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleType_in_entryRuleSingleType7636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleType7646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicType_in_ruleSingleType7693 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSingleType7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceType_in_entryRuleSequenceType7743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceType7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTYSEQUENCETYPE_in_ruleSequenceType7795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemType_in_ruleSequenceType7828 = new BitSet(new long[]{0x0000001400000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOccurenceIndicator_in_ruleSequenceType7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOccurenceIndicator_in_entryRuleOccurenceIndicator7887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOccurenceIndicator7898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleOccurenceIndicator7936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOccurenceIndicator7955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOccurenceIndicator7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemType_in_entryRuleItemType8014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemType8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKindTest_in_ruleItemType8070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EMPTYITEMTYPE_in_ruleItemType8093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicType_in_ruleItemType8125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicType_in_entryRuleAtomicType8161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicType8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomicType8212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKindTest_in_entryRuleKindTest8252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKindTest8262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTest_in_ruleKindTest8308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementTest_in_ruleKindTest8335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeTest_in_ruleKindTest8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaElementTest_in_ruleKindTest8389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaAttributeTest_in_ruleKindTest8416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePITest_in_ruleKindTest8443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENTTEST_in_ruleKindTest8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEXTTEST_in_ruleKindTest8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANYKINDTEST_in_ruleKindTest8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDocumentTest_in_entryRuleDocumentTest8563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocumentTest8573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleDocumentTest8619 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDocumentTest8631 = new BitSet(new long[]{0x0000000010000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_ruleElementTest_in_ruleDocumentTest8653 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleSchemaElementTest_in_ruleDocumentTest8680 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDocumentTest8694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePITest_in_entryRulePITest8730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePITest8740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rulePITest8786 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePITest8798 = new BitSet(new long[]{0x0000000010002080L});
    public static final BitSet FOLLOW_ruleNCName_in_rulePITest8820 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_STRINGLITERAL_in_rulePITest8843 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePITest8862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeTest_in_entryRuleAttributeTest8898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeTest8908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAttributeTest8954 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAttributeTest8966 = new BitSet(new long[]{0x00000010182027C0L});
    public static final BitSet FOLLOW_ruleAttribNameOrWildcard_in_ruleAttributeTest8988 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_18_in_ruleAttributeTest9001 = new BitSet(new long[]{0x00000000082027C0L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleAttributeTest9022 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAttributeTest9038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribNameOrWildcard_in_entryRuleAttribNameOrWildcard9074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribNameOrWildcard9084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleAttribNameOrWildcard9130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAttribNameOrWildcard9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaAttributeTest_in_entryRuleSchemaAttributeTest9195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemaAttributeTest9205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleSchemaAttributeTest9242 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSchemaAttributeTest9254 = new BitSet(new long[]{0x00000000082027C0L});
    public static final BitSet FOLLOW_ruleAttributeDeclaration_in_ruleSchemaAttributeTest9275 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSchemaAttributeTest9287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDeclaration_in_entryRuleAttributeDeclaration9323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDeclaration9333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_ruleAttributeDeclaration9378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementTest_in_entryRuleElementTest9413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementTest9423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleElementTest9469 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleElementTest9481 = new BitSet(new long[]{0x00000010182027C0L});
    public static final BitSet FOLLOW_ruleElementNameOrWildcard_in_ruleElementTest9503 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_18_in_ruleElementTest9516 = new BitSet(new long[]{0x00000000082027C0L});
    public static final BitSet FOLLOW_ruleTypeName_in_ruleElementTest9537 = new BitSet(new long[]{0x0000000010000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleElementTest9550 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleElementTest9568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementNameOrWildcard_in_entryRuleElementNameOrWildcard9604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementNameOrWildcard9614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementName_in_ruleElementNameOrWildcard9660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleElementNameOrWildcard9688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemaElementTest_in_entryRuleSchemaElementTest9725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSchemaElementTest9735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleSchemaElementTest9772 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSchemaElementTest9784 = new BitSet(new long[]{0x00000000082027C0L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_ruleSchemaElementTest9805 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSchemaElementTest9817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementDeclaration_in_entryRuleElementDeclaration9853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementDeclaration9863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementName_in_ruleElementDeclaration9909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeName_in_entryRuleAttributeName9943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeName9953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleAttributeName9998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementName_in_entryRuleElementName10033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementName10043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleElementName10088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeName_in_entryRuleTypeName10123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeName10133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_ruleTypeName10178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNCName_in_entryRuleNCName10213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNCName10223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNCName10264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQName_in_entryRuleQName10304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQName10314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixedName_in_ruleQName10361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnprefixedName_in_ruleQName10388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrefixedName_in_entryRulePrefixedName10423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrefixedName10433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNCName_in_rulePrefixedName10479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_rulePrefixedName10491 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleNCName_in_rulePrefixedName10512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnprefixedName_in_entryRuleUnprefixedName10548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnprefixedName10558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNCName_in_ruleUnprefixedName10603 = new BitSet(new long[]{0x0000000000000002L});

}