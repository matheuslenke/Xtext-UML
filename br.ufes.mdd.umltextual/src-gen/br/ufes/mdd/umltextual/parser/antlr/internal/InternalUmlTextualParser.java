package br.ufes.mdd.umltextual.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufes.mdd.umltextual.services.UmlTextualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUmlTextualParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'instantiable'", "'package'", "'subsystem'", "'depends'", "'on'", "'{'", "'}'", "'.'", "'@'", "'class'", "'extends'", "'implements'", "','", "'interface'", "'public'", "'private'", "'protected'", "'abstract'", "'active'", "'string'", "'int'", "'double'", "'boolean'", "'byte'", "'char'", "'float'", "'short'", "'long'", "'domaintype'", "'='", "'1'", "'0..1'", "'0..*'", "'*'", "'1..*'", "'0..'", "'1..'", "'..'", "'attr'", "':'", "'['", "']'", "'static'", "'function'", "'('", "')'", "'->'", "'unnamed'", "'navigable'", "'undirected'", "'association'", "'from'", "'to'", "'with'", "'associatedclass'", "'aggregation'", "'composition'", "'usecase'", "'diagram'", "'business'", "'actor'", "'uses'", "'includes'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalUmlTextualParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUmlTextualParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUmlTextualParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUmlTextual.g"; }



     	private UmlTextualGrammarAccess grammarAccess;

        public InternalUmlTextualParser(TokenStream input, UmlTextualGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected UmlTextualGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalUmlTextual.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalUmlTextual.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalUmlTextual.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUmlTextual.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleModelElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:77:2: ( ( (lv_elements_0_0= ruleModelElement ) )* )
            // InternalUmlTextual.g:78:2: ( (lv_elements_0_0= ruleModelElement ) )*
            {
            // InternalUmlTextual.g:78:2: ( (lv_elements_0_0= ruleModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=13)||LA1_0==68) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUmlTextual.g:79:3: (lv_elements_0_0= ruleModelElement )
            	    {
            	    // InternalUmlTextual.g:79:3: (lv_elements_0_0= ruleModelElement )
            	    // InternalUmlTextual.g:80:4: lv_elements_0_0= ruleModelElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleModelElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"br.ufes.mdd.umltextual.UmlTextual.ModelElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelElement"
    // InternalUmlTextual.g:100:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // InternalUmlTextual.g:100:53: (iv_ruleModelElement= ruleModelElement EOF )
            // InternalUmlTextual.g:101:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalUmlTextual.g:107:1: ruleModelElement returns [EObject current=null] : (this_Package_0= rulePackage | this_UseCaseDiagram_1= ruleUseCaseDiagram ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_UseCaseDiagram_1 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:113:2: ( (this_Package_0= rulePackage | this_UseCaseDiagram_1= ruleUseCaseDiagram ) )
            // InternalUmlTextual.g:114:2: (this_Package_0= rulePackage | this_UseCaseDiagram_1= ruleUseCaseDiagram )
            {
            // InternalUmlTextual.g:114:2: (this_Package_0= rulePackage | this_UseCaseDiagram_1= ruleUseCaseDiagram )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=1;
            }
            else if ( (LA2_0==68) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUmlTextual.g:115:3: this_Package_0= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getPackageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_0=rulePackage();

                    state._fsp--;


                    			current = this_Package_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:124:3: this_UseCaseDiagram_1= ruleUseCaseDiagram
                    {

                    			newCompositeNode(grammarAccess.getModelElementAccess().getUseCaseDiagramParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UseCaseDiagram_1=ruleUseCaseDiagram();

                    state._fsp--;


                    			current = this_UseCaseDiagram_1;
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
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRulePackage"
    // InternalUmlTextual.g:136:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalUmlTextual.g:136:48: (iv_rulePackage= rulePackage EOF )
            // InternalUmlTextual.g:137:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalUmlTextual.g:143:1: rulePackage returns [EObject current=null] : ( ( (lv_instantiable_0_0= 'instantiable' ) )? ( ( (lv_type_1_1= 'package' | lv_type_1_2= 'subsystem' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'depends' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_domainSpecificTypes_7_0= ruleDomainSpecificType ) )* ( (lv_elements_8_0= ruleElement ) )* otherlv_9= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_instantiable_0_0=null;
        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_domainSpecificTypes_7_0 = null;

        EObject lv_elements_8_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:149:2: ( ( ( (lv_instantiable_0_0= 'instantiable' ) )? ( ( (lv_type_1_1= 'package' | lv_type_1_2= 'subsystem' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'depends' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_domainSpecificTypes_7_0= ruleDomainSpecificType ) )* ( (lv_elements_8_0= ruleElement ) )* otherlv_9= '}' ) )
            // InternalUmlTextual.g:150:2: ( ( (lv_instantiable_0_0= 'instantiable' ) )? ( ( (lv_type_1_1= 'package' | lv_type_1_2= 'subsystem' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'depends' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_domainSpecificTypes_7_0= ruleDomainSpecificType ) )* ( (lv_elements_8_0= ruleElement ) )* otherlv_9= '}' )
            {
            // InternalUmlTextual.g:150:2: ( ( (lv_instantiable_0_0= 'instantiable' ) )? ( ( (lv_type_1_1= 'package' | lv_type_1_2= 'subsystem' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'depends' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_domainSpecificTypes_7_0= ruleDomainSpecificType ) )* ( (lv_elements_8_0= ruleElement ) )* otherlv_9= '}' )
            // InternalUmlTextual.g:151:3: ( (lv_instantiable_0_0= 'instantiable' ) )? ( ( (lv_type_1_1= 'package' | lv_type_1_2= 'subsystem' ) ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'depends' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '{' ( (lv_domainSpecificTypes_7_0= ruleDomainSpecificType ) )* ( (lv_elements_8_0= ruleElement ) )* otherlv_9= '}'
            {
            // InternalUmlTextual.g:151:3: ( (lv_instantiable_0_0= 'instantiable' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalUmlTextual.g:152:4: (lv_instantiable_0_0= 'instantiable' )
                    {
                    // InternalUmlTextual.g:152:4: (lv_instantiable_0_0= 'instantiable' )
                    // InternalUmlTextual.g:153:5: lv_instantiable_0_0= 'instantiable'
                    {
                    lv_instantiable_0_0=(Token)match(input,11,FOLLOW_4); 

                    					newLeafNode(lv_instantiable_0_0, grammarAccess.getPackageAccess().getInstantiableInstantiableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPackageRule());
                    					}
                    					setWithLastConsumed(current, "instantiable", lv_instantiable_0_0, "instantiable");
                    				

                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:165:3: ( ( (lv_type_1_1= 'package' | lv_type_1_2= 'subsystem' ) ) )
            // InternalUmlTextual.g:166:4: ( (lv_type_1_1= 'package' | lv_type_1_2= 'subsystem' ) )
            {
            // InternalUmlTextual.g:166:4: ( (lv_type_1_1= 'package' | lv_type_1_2= 'subsystem' ) )
            // InternalUmlTextual.g:167:5: (lv_type_1_1= 'package' | lv_type_1_2= 'subsystem' )
            {
            // InternalUmlTextual.g:167:5: (lv_type_1_1= 'package' | lv_type_1_2= 'subsystem' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalUmlTextual.g:168:6: lv_type_1_1= 'package'
                    {
                    lv_type_1_1=(Token)match(input,12,FOLLOW_5); 

                    						newLeafNode(lv_type_1_1, grammarAccess.getPackageAccess().getTypePackageKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:179:6: lv_type_1_2= 'subsystem'
                    {
                    lv_type_1_2=(Token)match(input,13,FOLLOW_5); 

                    						newLeafNode(lv_type_1_2, grammarAccess.getPackageAccess().getTypeSubsystemKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalUmlTextual.g:192:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlTextual.g:193:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlTextual.g:193:4: (lv_name_2_0= RULE_ID )
            // InternalUmlTextual.g:194:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUmlTextual.g:210:3: (otherlv_3= 'depends' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUmlTextual.g:211:4: otherlv_3= 'depends' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getDependsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getOnKeyword_3_1());
                    			
                    // InternalUmlTextual.g:219:4: ( (otherlv_5= RULE_ID ) )
                    // InternalUmlTextual.g:220:5: (otherlv_5= RULE_ID )
                    {
                    // InternalUmlTextual.g:220:5: (otherlv_5= RULE_ID )
                    // InternalUmlTextual.g:221:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getParentPackagePackageCrossReference_3_2_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalUmlTextual.g:237:3: ( (lv_domainSpecificTypes_7_0= ruleDomainSpecificType ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==39) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalUmlTextual.g:238:4: (lv_domainSpecificTypes_7_0= ruleDomainSpecificType )
            	    {
            	    // InternalUmlTextual.g:238:4: (lv_domainSpecificTypes_7_0= ruleDomainSpecificType )
            	    // InternalUmlTextual.g:239:5: lv_domainSpecificTypes_7_0= ruleDomainSpecificType
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getDomainSpecificTypesDomainSpecificTypeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_domainSpecificTypes_7_0=ruleDomainSpecificType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"domainSpecificTypes",
            	    						lv_domainSpecificTypes_7_0,
            	    						"br.ufes.mdd.umltextual.UmlTextual.DomainSpecificType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalUmlTextual.g:256:3: ( (lv_elements_8_0= ruleElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12||(LA7_0>=19 && LA7_0<=20)||(LA7_0>=24 && LA7_0<=27)||(LA7_0>=60 && LA7_0<=61)||(LA7_0>=66 && LA7_0<=67)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalUmlTextual.g:257:4: (lv_elements_8_0= ruleElement )
            	    {
            	    // InternalUmlTextual.g:257:4: (lv_elements_8_0= ruleElement )
            	    // InternalUmlTextual.g:258:5: lv_elements_8_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_elements_8_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_8_0,
            	    						"br.ufes.mdd.umltextual.UmlTextual.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUmlTextual.g:283:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalUmlTextual.g:285:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalUmlTextual.g:286:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalUmlTextual.g:295:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalUmlTextual.g:302:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUmlTextual.g:303:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUmlTextual.g:303:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUmlTextual.g:304:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalUmlTextual.g:311:3: (kw= '.' this_ID_2= RULE_ID )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUmlTextual.g:312:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleElement"
    // InternalUmlTextual.g:332:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalUmlTextual.g:332:48: (iv_ruleElement= ruleElement EOF )
            // InternalUmlTextual.g:333:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalUmlTextual.g:339:1: ruleElement returns [EObject current=null] : (this_Class_0= ruleClass | this_AssociationConnector_1= ruleAssociationConnector | this_Interface_2= ruleInterface ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_AssociationConnector_1 = null;

        EObject this_Interface_2 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:345:2: ( (this_Class_0= ruleClass | this_AssociationConnector_1= ruleAssociationConnector | this_Interface_2= ruleInterface ) )
            // InternalUmlTextual.g:346:2: (this_Class_0= ruleClass | this_AssociationConnector_1= ruleAssociationConnector | this_Interface_2= ruleInterface )
            {
            // InternalUmlTextual.g:346:2: (this_Class_0= ruleClass | this_AssociationConnector_1= ruleAssociationConnector | this_Interface_2= ruleInterface )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalUmlTextual.g:347:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:356:3: this_AssociationConnector_1= ruleAssociationConnector
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getAssociationConnectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssociationConnector_1=ruleAssociationConnector();

                    state._fsp--;


                    			current = this_AssociationConnector_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:365:3: this_Interface_2= ruleInterface
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getInterfaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interface_2=ruleInterface();

                    state._fsp--;


                    			current = this_Interface_2;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleClass"
    // InternalUmlTextual.g:377:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalUmlTextual.g:377:46: (iv_ruleClass= ruleClass EOF )
            // InternalUmlTextual.g:378:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalUmlTextual.g:384:1: ruleClass returns [EObject current=null] : ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_7= 'implements' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) )* ( (lv_methods_13_0= ruleMethod ) )* otherlv_14= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stereotype_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_visibility_2_0 = null;

        EObject lv_attributes_12_0 = null;

        EObject lv_methods_13_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:390:2: ( ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_7= 'implements' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) )* ( (lv_methods_13_0= ruleMethod ) )* otherlv_14= '}' ) )
            // InternalUmlTextual.g:391:2: ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_7= 'implements' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) )* ( (lv_methods_13_0= ruleMethod ) )* otherlv_14= '}' )
            {
            // InternalUmlTextual.g:391:2: ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_7= 'implements' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) )* ( (lv_methods_13_0= ruleMethod ) )* otherlv_14= '}' )
            // InternalUmlTextual.g:392:3: (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_7= 'implements' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) )* ( (lv_methods_13_0= ruleMethod ) )* otherlv_14= '}'
            {
            // InternalUmlTextual.g:392:3: (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUmlTextual.g:393:4: otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassAccess().getCommercialAtKeyword_0_0());
                    			
                    // InternalUmlTextual.g:397:4: ( (lv_stereotype_1_0= RULE_ID ) )
                    // InternalUmlTextual.g:398:5: (lv_stereotype_1_0= RULE_ID )
                    {
                    // InternalUmlTextual.g:398:5: (lv_stereotype_1_0= RULE_ID )
                    // InternalUmlTextual.g:399:6: lv_stereotype_1_0= RULE_ID
                    {
                    lv_stereotype_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(lv_stereotype_1_0, grammarAccess.getClassAccess().getStereotypeIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"stereotype",
                    							lv_stereotype_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:416:3: ( (lv_visibility_2_0= ruleVisibility ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12||(LA11_0>=25 && LA11_0<=27)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUmlTextual.g:417:4: (lv_visibility_2_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:417:4: (lv_visibility_2_0= ruleVisibility )
                    // InternalUmlTextual.g:418:5: lv_visibility_2_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getVisibilityVisibilityParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_visibility_2_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_2_0,
                    						"br.ufes.mdd.umltextual.UmlTextual.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassKeyword_2());
            		
            // InternalUmlTextual.g:439:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalUmlTextual.g:440:4: (lv_name_4_0= RULE_ID )
            {
            // InternalUmlTextual.g:440:4: (lv_name_4_0= RULE_ID )
            // InternalUmlTextual.g:441:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_4_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUmlTextual.g:457:3: (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUmlTextual.g:458:4: otherlv_5= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getExtendsKeyword_4_0());
                    			
                    // InternalUmlTextual.g:462:4: ( ( ruleQualifiedName ) )
                    // InternalUmlTextual.g:463:5: ( ruleQualifiedName )
                    {
                    // InternalUmlTextual.g:463:5: ( ruleQualifiedName )
                    // InternalUmlTextual.g:464:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getParentClassClassCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:479:3: (otherlv_7= 'implements' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUmlTextual.g:480:4: otherlv_7= 'implements' ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getImplementsKeyword_5_0());
                    			
                    // InternalUmlTextual.g:484:4: ( ( ruleQualifiedName ) )
                    // InternalUmlTextual.g:485:5: ( ruleQualifiedName )
                    {
                    // InternalUmlTextual.g:485:5: ( ruleQualifiedName )
                    // InternalUmlTextual.g:486:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getInterfacesInterfaceCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUmlTextual.g:500:4: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==23) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalUmlTextual.g:501:5: otherlv_9= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,23,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalUmlTextual.g:505:5: ( ( ruleQualifiedName ) )
                    	    // InternalUmlTextual.g:506:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalUmlTextual.g:506:6: ( ruleQualifiedName )
                    	    // InternalUmlTextual.g:507:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getClassAccess().getInterfacesInterfaceCrossReference_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalUmlTextual.g:527:3: ( (lv_attributes_12_0= ruleAttribute ) )*
            loop15:
            do {
                int alt15=2;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==49) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==49) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 27:
                    {
                    int LA15_4 = input.LA(2);

                    if ( (LA15_4==49) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 12:
                    {
                    int LA15_5 = input.LA(2);

                    if ( (LA15_5==49) ) {
                        alt15=1;
                    }


                    }
                    break;
                case 49:
                    {
                    alt15=1;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // InternalUmlTextual.g:528:4: (lv_attributes_12_0= ruleAttribute )
            	    {
            	    // InternalUmlTextual.g:528:4: (lv_attributes_12_0= ruleAttribute )
            	    // InternalUmlTextual.g:529:5: lv_attributes_12_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_attributes_12_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_12_0,
            	    						"br.ufes.mdd.umltextual.UmlTextual.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalUmlTextual.g:546:3: ( (lv_methods_13_0= ruleMethod ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==12||(LA16_0>=25 && LA16_0<=28)||(LA16_0>=53 && LA16_0<=54)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUmlTextual.g:547:4: (lv_methods_13_0= ruleMethod )
            	    {
            	    // InternalUmlTextual.g:547:4: (lv_methods_13_0= ruleMethod )
            	    // InternalUmlTextual.g:548:5: lv_methods_13_0= ruleMethod
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_methods_13_0=ruleMethod();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methods",
            	    						lv_methods_13_0,
            	    						"br.ufes.mdd.umltextual.UmlTextual.Method");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleInterface"
    // InternalUmlTextual.g:573:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalUmlTextual.g:573:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalUmlTextual.g:574:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalUmlTextual.g:580:1: ruleInterface returns [EObject current=null] : ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stereotype_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_visibility_2_0 = null;

        EObject lv_attributes_8_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:586:2: ( ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) )
            // InternalUmlTextual.g:587:2: ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            {
            // InternalUmlTextual.g:587:2: ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            // InternalUmlTextual.g:588:3: (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
            {
            // InternalUmlTextual.g:588:3: (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUmlTextual.g:589:4: otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getCommercialAtKeyword_0_0());
                    			
                    // InternalUmlTextual.g:593:4: ( (lv_stereotype_1_0= RULE_ID ) )
                    // InternalUmlTextual.g:594:5: (lv_stereotype_1_0= RULE_ID )
                    {
                    // InternalUmlTextual.g:594:5: (lv_stereotype_1_0= RULE_ID )
                    // InternalUmlTextual.g:595:6: lv_stereotype_1_0= RULE_ID
                    {
                    lv_stereotype_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_stereotype_1_0, grammarAccess.getInterfaceAccess().getStereotypeIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterfaceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"stereotype",
                    							lv_stereotype_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:612:3: ( (lv_visibility_2_0= ruleVisibility ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12||(LA18_0>=25 && LA18_0<=27)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUmlTextual.g:613:4: (lv_visibility_2_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:613:4: (lv_visibility_2_0= ruleVisibility )
                    // InternalUmlTextual.g:614:5: lv_visibility_2_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getInterfaceAccess().getVisibilityVisibilityParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_visibility_2_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInterfaceRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_2_0,
                    						"br.ufes.mdd.umltextual.UmlTextual.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getInterfaceKeyword_2());
            		
            // InternalUmlTextual.g:635:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalUmlTextual.g:636:4: (lv_name_4_0= RULE_ID )
            {
            // InternalUmlTextual.g:636:4: (lv_name_4_0= RULE_ID )
            // InternalUmlTextual.g:637:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_4_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUmlTextual.g:653:3: (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUmlTextual.g:654:4: otherlv_5= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getExtendsKeyword_4_0());
                    			
                    // InternalUmlTextual.g:658:4: ( ( ruleQualifiedName ) )
                    // InternalUmlTextual.g:659:5: ( ruleQualifiedName )
                    {
                    // InternalUmlTextual.g:659:5: ( ruleQualifiedName )
                    // InternalUmlTextual.g:660:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterfaceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getInterfaceAccess().getParentInterfaceInterfaceCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalUmlTextual.g:679:3: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==12||(LA20_0>=25 && LA20_0<=27)||LA20_0==49) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUmlTextual.g:680:4: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // InternalUmlTextual.g:680:4: (lv_attributes_8_0= ruleAttribute )
            	    // InternalUmlTextual.g:681:5: lv_attributes_8_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceAccess().getAttributesAttributeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_attributes_8_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_8_0,
            	    						"br.ufes.mdd.umltextual.UmlTextual.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleVisibility"
    // InternalUmlTextual.g:706:1: entryRuleVisibility returns [String current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final String entryRuleVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVisibility = null;


        try {
            // InternalUmlTextual.g:706:50: (iv_ruleVisibility= ruleVisibility EOF )
            // InternalUmlTextual.g:707:2: iv_ruleVisibility= ruleVisibility EOF
            {
             newCompositeNode(grammarAccess.getVisibilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVisibility=ruleVisibility();

            state._fsp--;

             current =iv_ruleVisibility.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVisibility"


    // $ANTLR start "ruleVisibility"
    // InternalUmlTextual.g:713:1: ruleVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'package' ) ;
    public final AntlrDatatypeRuleToken ruleVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:719:2: ( (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'package' ) )
            // InternalUmlTextual.g:720:2: (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'package' )
            {
            // InternalUmlTextual.g:720:2: (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'package' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt21=1;
                }
                break;
            case 26:
                {
                alt21=2;
                }
                break;
            case 27:
                {
                alt21=3;
                }
                break;
            case 12:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalUmlTextual.g:721:3: kw= 'public'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityAccess().getPublicKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:727:3: kw= 'private'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityAccess().getPrivateKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:733:3: kw= 'protected'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityAccess().getProtectedKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:739:3: kw= 'package'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityAccess().getPackageKeyword_3());
                    		

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
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "entryRuleAbstract"
    // InternalUmlTextual.g:748:1: entryRuleAbstract returns [String current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final String entryRuleAbstract() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbstract = null;


        try {
            // InternalUmlTextual.g:748:48: (iv_ruleAbstract= ruleAbstract EOF )
            // InternalUmlTextual.g:749:2: iv_ruleAbstract= ruleAbstract EOF
            {
             newCompositeNode(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstract=ruleAbstract();

            state._fsp--;

             current =iv_ruleAbstract.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // InternalUmlTextual.g:755:1: ruleAbstract returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'abstract' ;
    public final AntlrDatatypeRuleToken ruleAbstract() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:761:2: (kw= 'abstract' )
            // InternalUmlTextual.g:762:2: kw= 'abstract'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getAbstractAccess().getAbstractKeyword());
            	

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
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleActive"
    // InternalUmlTextual.g:770:1: entryRuleActive returns [String current=null] : iv_ruleActive= ruleActive EOF ;
    public final String entryRuleActive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActive = null;


        try {
            // InternalUmlTextual.g:770:46: (iv_ruleActive= ruleActive EOF )
            // InternalUmlTextual.g:771:2: iv_ruleActive= ruleActive EOF
            {
             newCompositeNode(grammarAccess.getActiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActive=ruleActive();

            state._fsp--;

             current =iv_ruleActive.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActive"


    // $ANTLR start "ruleActive"
    // InternalUmlTextual.g:777:1: ruleActive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'active' ;
    public final AntlrDatatypeRuleToken ruleActive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:783:2: (kw= 'active' )
            // InternalUmlTextual.g:784:2: kw= 'active'
            {
            kw=(Token)match(input,29,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getActiveAccess().getActiveKeyword());
            	

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
    // $ANTLR end "ruleActive"


    // $ANTLR start "entryRuleAttributeType"
    // InternalUmlTextual.g:792:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalUmlTextual.g:792:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalUmlTextual.g:793:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalUmlTextual.g:799:1: ruleAttributeType returns [EObject current=null] : ( ( (lv_name_0_0= 'string' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'double' ) ) | ( (lv_name_3_0= 'boolean' ) ) | ( (lv_name_4_0= 'byte' ) ) | ( (lv_name_5_0= 'char' ) ) | ( (lv_name_6_0= 'float' ) ) | ( (lv_name_7_0= 'short' ) ) | ( (lv_name_8_0= 'long' ) ) | ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;
        Token lv_name_4_0=null;
        Token lv_name_5_0=null;
        Token lv_name_6_0=null;
        Token lv_name_7_0=null;
        Token lv_name_8_0=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:805:2: ( ( ( (lv_name_0_0= 'string' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'double' ) ) | ( (lv_name_3_0= 'boolean' ) ) | ( (lv_name_4_0= 'byte' ) ) | ( (lv_name_5_0= 'char' ) ) | ( (lv_name_6_0= 'float' ) ) | ( (lv_name_7_0= 'short' ) ) | ( (lv_name_8_0= 'long' ) ) | ( ( ruleQualifiedName ) ) ) )
            // InternalUmlTextual.g:806:2: ( ( (lv_name_0_0= 'string' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'double' ) ) | ( (lv_name_3_0= 'boolean' ) ) | ( (lv_name_4_0= 'byte' ) ) | ( (lv_name_5_0= 'char' ) ) | ( (lv_name_6_0= 'float' ) ) | ( (lv_name_7_0= 'short' ) ) | ( (lv_name_8_0= 'long' ) ) | ( ( ruleQualifiedName ) ) )
            {
            // InternalUmlTextual.g:806:2: ( ( (lv_name_0_0= 'string' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'double' ) ) | ( (lv_name_3_0= 'boolean' ) ) | ( (lv_name_4_0= 'byte' ) ) | ( (lv_name_5_0= 'char' ) ) | ( (lv_name_6_0= 'float' ) ) | ( (lv_name_7_0= 'short' ) ) | ( (lv_name_8_0= 'long' ) ) | ( ( ruleQualifiedName ) ) )
            int alt22=10;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt22=1;
                }
                break;
            case 31:
                {
                alt22=2;
                }
                break;
            case 32:
                {
                alt22=3;
                }
                break;
            case 33:
                {
                alt22=4;
                }
                break;
            case 34:
                {
                alt22=5;
                }
                break;
            case 35:
                {
                alt22=6;
                }
                break;
            case 36:
                {
                alt22=7;
                }
                break;
            case 37:
                {
                alt22=8;
                }
                break;
            case 38:
                {
                alt22=9;
                }
                break;
            case RULE_ID:
                {
                alt22=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalUmlTextual.g:807:3: ( (lv_name_0_0= 'string' ) )
                    {
                    // InternalUmlTextual.g:807:3: ( (lv_name_0_0= 'string' ) )
                    // InternalUmlTextual.g:808:4: (lv_name_0_0= 'string' )
                    {
                    // InternalUmlTextual.g:808:4: (lv_name_0_0= 'string' )
                    // InternalUmlTextual.g:809:5: lv_name_0_0= 'string'
                    {
                    lv_name_0_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getAttributeTypeAccess().getNameStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_0, "string");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:822:3: ( (lv_name_1_0= 'int' ) )
                    {
                    // InternalUmlTextual.g:822:3: ( (lv_name_1_0= 'int' ) )
                    // InternalUmlTextual.g:823:4: (lv_name_1_0= 'int' )
                    {
                    // InternalUmlTextual.g:823:4: (lv_name_1_0= 'int' )
                    // InternalUmlTextual.g:824:5: lv_name_1_0= 'int'
                    {
                    lv_name_1_0=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getAttributeTypeAccess().getNameIntKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_1_0, "int");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:837:3: ( (lv_name_2_0= 'double' ) )
                    {
                    // InternalUmlTextual.g:837:3: ( (lv_name_2_0= 'double' ) )
                    // InternalUmlTextual.g:838:4: (lv_name_2_0= 'double' )
                    {
                    // InternalUmlTextual.g:838:4: (lv_name_2_0= 'double' )
                    // InternalUmlTextual.g:839:5: lv_name_2_0= 'double'
                    {
                    lv_name_2_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getAttributeTypeAccess().getNameDoubleKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_2_0, "double");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:852:3: ( (lv_name_3_0= 'boolean' ) )
                    {
                    // InternalUmlTextual.g:852:3: ( (lv_name_3_0= 'boolean' ) )
                    // InternalUmlTextual.g:853:4: (lv_name_3_0= 'boolean' )
                    {
                    // InternalUmlTextual.g:853:4: (lv_name_3_0= 'boolean' )
                    // InternalUmlTextual.g:854:5: lv_name_3_0= 'boolean'
                    {
                    lv_name_3_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_name_3_0, grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_3_0, "boolean");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalUmlTextual.g:867:3: ( (lv_name_4_0= 'byte' ) )
                    {
                    // InternalUmlTextual.g:867:3: ( (lv_name_4_0= 'byte' ) )
                    // InternalUmlTextual.g:868:4: (lv_name_4_0= 'byte' )
                    {
                    // InternalUmlTextual.g:868:4: (lv_name_4_0= 'byte' )
                    // InternalUmlTextual.g:869:5: lv_name_4_0= 'byte'
                    {
                    lv_name_4_0=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_name_4_0, grammarAccess.getAttributeTypeAccess().getNameByteKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_4_0, "byte");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalUmlTextual.g:882:3: ( (lv_name_5_0= 'char' ) )
                    {
                    // InternalUmlTextual.g:882:3: ( (lv_name_5_0= 'char' ) )
                    // InternalUmlTextual.g:883:4: (lv_name_5_0= 'char' )
                    {
                    // InternalUmlTextual.g:883:4: (lv_name_5_0= 'char' )
                    // InternalUmlTextual.g:884:5: lv_name_5_0= 'char'
                    {
                    lv_name_5_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_name_5_0, grammarAccess.getAttributeTypeAccess().getNameCharKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_5_0, "char");
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalUmlTextual.g:897:3: ( (lv_name_6_0= 'float' ) )
                    {
                    // InternalUmlTextual.g:897:3: ( (lv_name_6_0= 'float' ) )
                    // InternalUmlTextual.g:898:4: (lv_name_6_0= 'float' )
                    {
                    // InternalUmlTextual.g:898:4: (lv_name_6_0= 'float' )
                    // InternalUmlTextual.g:899:5: lv_name_6_0= 'float'
                    {
                    lv_name_6_0=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_name_6_0, grammarAccess.getAttributeTypeAccess().getNameFloatKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_6_0, "float");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalUmlTextual.g:912:3: ( (lv_name_7_0= 'short' ) )
                    {
                    // InternalUmlTextual.g:912:3: ( (lv_name_7_0= 'short' ) )
                    // InternalUmlTextual.g:913:4: (lv_name_7_0= 'short' )
                    {
                    // InternalUmlTextual.g:913:4: (lv_name_7_0= 'short' )
                    // InternalUmlTextual.g:914:5: lv_name_7_0= 'short'
                    {
                    lv_name_7_0=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_name_7_0, grammarAccess.getAttributeTypeAccess().getNameShortKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_7_0, "short");
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalUmlTextual.g:927:3: ( (lv_name_8_0= 'long' ) )
                    {
                    // InternalUmlTextual.g:927:3: ( (lv_name_8_0= 'long' ) )
                    // InternalUmlTextual.g:928:4: (lv_name_8_0= 'long' )
                    {
                    // InternalUmlTextual.g:928:4: (lv_name_8_0= 'long' )
                    // InternalUmlTextual.g:929:5: lv_name_8_0= 'long'
                    {
                    lv_name_8_0=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_name_8_0, grammarAccess.getAttributeTypeAccess().getNameLongKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_8_0, "long");
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalUmlTextual.g:942:3: ( ( ruleQualifiedName ) )
                    {
                    // InternalUmlTextual.g:942:3: ( ( ruleQualifiedName ) )
                    // InternalUmlTextual.g:943:4: ( ruleQualifiedName )
                    {
                    // InternalUmlTextual.g:943:4: ( ruleQualifiedName )
                    // InternalUmlTextual.g:944:5: ruleQualifiedName
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getAttributeTypeAccess().getDomainTypeDomainSpecificTypeCrossReference_9_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleDomainSpecificType"
    // InternalUmlTextual.g:962:1: entryRuleDomainSpecificType returns [EObject current=null] : iv_ruleDomainSpecificType= ruleDomainSpecificType EOF ;
    public final EObject entryRuleDomainSpecificType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpecificType = null;


        try {
            // InternalUmlTextual.g:962:59: (iv_ruleDomainSpecificType= ruleDomainSpecificType EOF )
            // InternalUmlTextual.g:963:2: iv_ruleDomainSpecificType= ruleDomainSpecificType EOF
            {
             newCompositeNode(grammarAccess.getDomainSpecificTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainSpecificType=ruleDomainSpecificType();

            state._fsp--;

             current =iv_ruleDomainSpecificType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomainSpecificType"


    // $ANTLR start "ruleDomainSpecificType"
    // InternalUmlTextual.g:969:1: ruleDomainSpecificType returns [EObject current=null] : (otherlv_0= 'domaintype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDomainSpecificType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:975:2: ( (otherlv_0= 'domaintype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= RULE_STRING ) ) ) )
            // InternalUmlTextual.g:976:2: (otherlv_0= 'domaintype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= RULE_STRING ) ) )
            {
            // InternalUmlTextual.g:976:2: (otherlv_0= 'domaintype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= RULE_STRING ) ) )
            // InternalUmlTextual.g:977:3: otherlv_0= 'domaintype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainSpecificTypeAccess().getDomaintypeKeyword_0());
            		
            // InternalUmlTextual.g:981:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUmlTextual.g:982:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUmlTextual.g:982:4: (lv_name_1_0= RULE_ID )
            // InternalUmlTextual.g:983:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainSpecificTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainSpecificTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,40,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainSpecificTypeAccess().getEqualsSignKeyword_2());
            		
            // InternalUmlTextual.g:1003:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalUmlTextual.g:1004:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalUmlTextual.g:1004:4: (lv_description_3_0= RULE_STRING )
            // InternalUmlTextual.g:1005:5: lv_description_3_0= RULE_STRING
            {
            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_description_3_0, grammarAccess.getDomainSpecificTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainSpecificTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleDomainSpecificType"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalUmlTextual.g:1025:1: entryRuleMultiplicity returns [String current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final String entryRuleMultiplicity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicity = null;


        try {
            // InternalUmlTextual.g:1025:52: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalUmlTextual.g:1026:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalUmlTextual.g:1032:1: ruleMultiplicity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' | (kw= '0..' this_INT_6= RULE_INT ) | (kw= '1..' this_INT_8= RULE_INT ) | this_INT_9= RULE_INT | (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_6=null;
        Token this_INT_8=null;
        Token this_INT_9=null;
        Token this_INT_10=null;
        Token this_INT_12=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:1038:2: ( (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' | (kw= '0..' this_INT_6= RULE_INT ) | (kw= '1..' this_INT_8= RULE_INT ) | this_INT_9= RULE_INT | (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT ) ) )
            // InternalUmlTextual.g:1039:2: (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' | (kw= '0..' this_INT_6= RULE_INT ) | (kw= '1..' this_INT_8= RULE_INT ) | this_INT_9= RULE_INT | (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT ) )
            {
            // InternalUmlTextual.g:1039:2: (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' | (kw= '0..' this_INT_6= RULE_INT ) | (kw= '1..' this_INT_8= RULE_INT ) | this_INT_9= RULE_INT | (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT ) )
            int alt23=9;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalUmlTextual.g:1040:3: kw= '1'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitOneKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:1046:3: kw= '0..1'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:1052:3: kw= '0..*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:1058:3: kw= '*'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalUmlTextual.g:1064:3: kw= '1..*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopAsteriskKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalUmlTextual.g:1070:3: (kw= '0..' this_INT_6= RULE_INT )
                    {
                    // InternalUmlTextual.g:1070:3: (kw= '0..' this_INT_6= RULE_INT )
                    // InternalUmlTextual.g:1071:4: kw= '0..' this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,46,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopKeyword_5_0());
                    			
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_6);
                    			

                    				newLeafNode(this_INT_6, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalUmlTextual.g:1085:3: (kw= '1..' this_INT_8= RULE_INT )
                    {
                    // InternalUmlTextual.g:1085:3: (kw= '1..' this_INT_8= RULE_INT )
                    // InternalUmlTextual.g:1086:4: kw= '1..' this_INT_8= RULE_INT
                    {
                    kw=(Token)match(input,47,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopKeyword_6_0());
                    			
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_8);
                    			

                    				newLeafNode(this_INT_8, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_6_1());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalUmlTextual.g:1100:3: this_INT_9= RULE_INT
                    {
                    this_INT_9=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_9);
                    		

                    			newLeafNode(this_INT_9, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalUmlTextual.g:1108:3: (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT )
                    {
                    // InternalUmlTextual.g:1108:3: (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT )
                    // InternalUmlTextual.g:1109:4: this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT
                    {
                    this_INT_10=(Token)match(input,RULE_INT,FOLLOW_26); 

                    				current.merge(this_INT_10);
                    			

                    				newLeafNode(this_INT_10, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_8_0());
                    			
                    kw=(Token)match(input,48,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_8_1());
                    			
                    this_INT_12=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_12);
                    			

                    				newLeafNode(this_INT_12, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_8_2());
                    			

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
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleAttribute"
    // InternalUmlTextual.g:1133:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUmlTextual.g:1133:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUmlTextual.g:1134:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUmlTextual.g:1140:1: ruleAttribute returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_visibility_0_0 = null;

        EObject lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity_6_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1146:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? ) )
            // InternalUmlTextual.g:1147:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? )
            {
            // InternalUmlTextual.g:1147:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? )
            // InternalUmlTextual.g:1148:3: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )?
            {
            // InternalUmlTextual.g:1148:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12||(LA24_0>=25 && LA24_0<=27)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUmlTextual.g:1149:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:1149:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalUmlTextual.g:1150:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_27);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"br.ufes.mdd.umltextual.UmlTextual.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,49,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttrKeyword_1());
            		
            // InternalUmlTextual.g:1171:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlTextual.g:1172:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlTextual.g:1172:4: (lv_name_2_0= RULE_ID )
            // InternalUmlTextual.g:1173:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,50,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalUmlTextual.g:1193:3: ( (lv_type_4_0= ruleAttributeType ) )
            // InternalUmlTextual.g:1194:4: (lv_type_4_0= ruleAttributeType )
            {
            // InternalUmlTextual.g:1194:4: (lv_type_4_0= ruleAttributeType )
            // InternalUmlTextual.g:1195:5: lv_type_4_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
            lv_type_4_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"br.ufes.mdd.umltextual.UmlTextual.AttributeType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalUmlTextual.g:1212:3: (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUmlTextual.g:1213:4: otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUmlTextual.g:1217:4: ( (lv_multiplicity_6_0= ruleMultiplicity ) )
                    // InternalUmlTextual.g:1218:5: (lv_multiplicity_6_0= ruleMultiplicity )
                    {
                    // InternalUmlTextual.g:1218:5: (lv_multiplicity_6_0= ruleMultiplicity )
                    // InternalUmlTextual.g:1219:6: lv_multiplicity_6_0= ruleMultiplicity
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_multiplicity_6_0=ruleMultiplicity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
                    						}
                    						set(
                    							current,
                    							"multiplicity",
                    							lv_multiplicity_6_0,
                    							"br.ufes.mdd.umltextual.UmlTextual.Multiplicity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,52,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_2());
                    			

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalUmlTextual.g:1245:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalUmlTextual.g:1245:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalUmlTextual.g:1246:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalUmlTextual.g:1252:1: ruleMethod returns [EObject current=null] : ( (otherlv_0= 'abstract' )? (otherlv_1= 'static' )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'function' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')' otherlv_10= '->' ( (lv_returnType_11_0= ruleAttributeType ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_visibility_2_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_returnType_11_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1258:2: ( ( (otherlv_0= 'abstract' )? (otherlv_1= 'static' )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'function' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')' otherlv_10= '->' ( (lv_returnType_11_0= ruleAttributeType ) ) ) )
            // InternalUmlTextual.g:1259:2: ( (otherlv_0= 'abstract' )? (otherlv_1= 'static' )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'function' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')' otherlv_10= '->' ( (lv_returnType_11_0= ruleAttributeType ) ) )
            {
            // InternalUmlTextual.g:1259:2: ( (otherlv_0= 'abstract' )? (otherlv_1= 'static' )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'function' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')' otherlv_10= '->' ( (lv_returnType_11_0= ruleAttributeType ) ) )
            // InternalUmlTextual.g:1260:3: (otherlv_0= 'abstract' )? (otherlv_1= 'static' )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'function' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )? otherlv_9= ')' otherlv_10= '->' ( (lv_returnType_11_0= ruleAttributeType ) )
            {
            // InternalUmlTextual.g:1260:3: (otherlv_0= 'abstract' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUmlTextual.g:1261:4: otherlv_0= 'abstract'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_33); 

                    				newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getAbstractKeyword_0());
                    			

                    }
                    break;

            }

            // InternalUmlTextual.g:1266:3: (otherlv_1= 'static' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==53) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUmlTextual.g:1267:4: otherlv_1= 'static'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_34); 

                    				newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getStaticKeyword_1());
                    			

                    }
                    break;

            }

            // InternalUmlTextual.g:1272:3: ( (lv_visibility_2_0= ruleVisibility ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==12||(LA28_0>=25 && LA28_0<=27)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUmlTextual.g:1273:4: (lv_visibility_2_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:1273:4: (lv_visibility_2_0= ruleVisibility )
                    // InternalUmlTextual.g:1274:5: lv_visibility_2_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_35);
                    lv_visibility_2_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_2_0,
                    						"br.ufes.mdd.umltextual.UmlTextual.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,54,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getFunctionKeyword_3());
            		
            // InternalUmlTextual.g:1295:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalUmlTextual.g:1296:4: (lv_name_4_0= RULE_ID )
            {
            // InternalUmlTextual.g:1296:4: (lv_name_4_0= RULE_ID )
            // InternalUmlTextual.g:1297:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(lv_name_4_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,55,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
            		
            // InternalUmlTextual.g:1317:3: ( ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUmlTextual.g:1318:4: ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
                    {
                    // InternalUmlTextual.g:1318:4: ( (lv_parameters_6_0= ruleParameter ) )
                    // InternalUmlTextual.g:1319:5: (lv_parameters_6_0= ruleParameter )
                    {
                    // InternalUmlTextual.g:1319:5: (lv_parameters_6_0= ruleParameter )
                    // InternalUmlTextual.g:1320:6: lv_parameters_6_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_parameters_6_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMethodRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_6_0,
                    							"br.ufes.mdd.umltextual.UmlTextual.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUmlTextual.g:1337:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==23) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalUmlTextual.g:1338:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,23,FOLLOW_5); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_6_1_0());
                    	    				
                    	    // InternalUmlTextual.g:1342:5: ( (lv_parameters_8_0= ruleParameter ) )
                    	    // InternalUmlTextual.g:1343:6: (lv_parameters_8_0= ruleParameter )
                    	    {
                    	    // InternalUmlTextual.g:1343:6: (lv_parameters_8_0= ruleParameter )
                    	    // InternalUmlTextual.g:1344:7: lv_parameters_8_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_parameters_8_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_8_0,
                    	    								"br.ufes.mdd.umltextual.UmlTextual.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,56,FOLLOW_39); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_7());
            		
            otherlv_10=(Token)match(input,57,FOLLOW_29); 

            			newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_8());
            		
            // InternalUmlTextual.g:1371:3: ( (lv_returnType_11_0= ruleAttributeType ) )
            // InternalUmlTextual.g:1372:4: (lv_returnType_11_0= ruleAttributeType )
            {
            // InternalUmlTextual.g:1372:4: (lv_returnType_11_0= ruleAttributeType )
            // InternalUmlTextual.g:1373:5: lv_returnType_11_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeAttributeTypeParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_2);
            lv_returnType_11_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_11_0,
            						"br.ufes.mdd.umltextual.UmlTextual.AttributeType");
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalUmlTextual.g:1394:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUmlTextual.g:1394:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUmlTextual.g:1395:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUmlTextual.g:1401:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleAttributeType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_parameterType_2_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1407:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleAttributeType ) ) ) )
            // InternalUmlTextual.g:1408:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleAttributeType ) ) )
            {
            // InternalUmlTextual.g:1408:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleAttributeType ) ) )
            // InternalUmlTextual.g:1409:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleAttributeType ) )
            {
            // InternalUmlTextual.g:1409:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUmlTextual.g:1410:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUmlTextual.g:1410:4: (lv_name_0_0= RULE_ID )
            // InternalUmlTextual.g:1411:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalUmlTextual.g:1431:3: ( (lv_parameterType_2_0= ruleAttributeType ) )
            // InternalUmlTextual.g:1432:4: (lv_parameterType_2_0= ruleAttributeType )
            {
            // InternalUmlTextual.g:1432:4: (lv_parameterType_2_0= ruleAttributeType )
            // InternalUmlTextual.g:1433:5: lv_parameterType_2_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getParameterTypeAttributeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameterType_2_0=ruleAttributeType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"parameterType",
            						lv_parameterType_2_0,
            						"br.ufes.mdd.umltextual.UmlTextual.AttributeType");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleUnnamed"
    // InternalUmlTextual.g:1454:1: entryRuleUnnamed returns [String current=null] : iv_ruleUnnamed= ruleUnnamed EOF ;
    public final String entryRuleUnnamed() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnnamed = null;


        try {
            // InternalUmlTextual.g:1454:47: (iv_ruleUnnamed= ruleUnnamed EOF )
            // InternalUmlTextual.g:1455:2: iv_ruleUnnamed= ruleUnnamed EOF
            {
             newCompositeNode(grammarAccess.getUnnamedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnnamed=ruleUnnamed();

            state._fsp--;

             current =iv_ruleUnnamed.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnnamed"


    // $ANTLR start "ruleUnnamed"
    // InternalUmlTextual.g:1461:1: ruleUnnamed returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'unnamed' ;
    public final AntlrDatatypeRuleToken ruleUnnamed() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:1467:2: (kw= 'unnamed' )
            // InternalUmlTextual.g:1468:2: kw= 'unnamed'
            {
            kw=(Token)match(input,58,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUnnamedAccess().getUnnamedKeyword());
            	

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
    // $ANTLR end "ruleUnnamed"


    // $ANTLR start "entryRuleNavigation"
    // InternalUmlTextual.g:1476:1: entryRuleNavigation returns [String current=null] : iv_ruleNavigation= ruleNavigation EOF ;
    public final String entryRuleNavigation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigation = null;


        try {
            // InternalUmlTextual.g:1476:50: (iv_ruleNavigation= ruleNavigation EOF )
            // InternalUmlTextual.g:1477:2: iv_ruleNavigation= ruleNavigation EOF
            {
             newCompositeNode(grammarAccess.getNavigationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavigation=ruleNavigation();

            state._fsp--;

             current =iv_ruleNavigation.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNavigation"


    // $ANTLR start "ruleNavigation"
    // InternalUmlTextual.g:1483:1: ruleNavigation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'navigable' ;
    public final AntlrDatatypeRuleToken ruleNavigation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:1489:2: (kw= 'navigable' )
            // InternalUmlTextual.g:1490:2: kw= 'navigable'
            {
            kw=(Token)match(input,59,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNavigationAccess().getNavigableKeyword());
            	

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
    // $ANTLR end "ruleNavigation"


    // $ANTLR start "entryRuleAssociationConnector"
    // InternalUmlTextual.g:1498:1: entryRuleAssociationConnector returns [EObject current=null] : iv_ruleAssociationConnector= ruleAssociationConnector EOF ;
    public final EObject entryRuleAssociationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationConnector = null;


        try {
            // InternalUmlTextual.g:1498:61: (iv_ruleAssociationConnector= ruleAssociationConnector EOF )
            // InternalUmlTextual.g:1499:2: iv_ruleAssociationConnector= ruleAssociationConnector EOF
            {
             newCompositeNode(grammarAccess.getAssociationConnectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociationConnector=ruleAssociationConnector();

            state._fsp--;

             current =iv_ruleAssociationConnector; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssociationConnector"


    // $ANTLR start "ruleAssociationConnector"
    // InternalUmlTextual.g:1505:1: ruleAssociationConnector returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition ) ;
    public final EObject ruleAssociationConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Aggregation_1 = null;

        EObject this_Composition_2 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1511:2: ( (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition ) )
            // InternalUmlTextual.g:1512:2: (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition )
            {
            // InternalUmlTextual.g:1512:2: (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 60:
            case 61:
                {
                alt31=1;
                }
                break;
            case 66:
                {
                alt31=2;
                }
                break;
            case 67:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalUmlTextual.g:1513:3: this_Association_0= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getAssociationConnectorAccess().getAssociationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_0=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:1522:3: this_Aggregation_1= ruleAggregation
                    {

                    			newCompositeNode(grammarAccess.getAssociationConnectorAccess().getAggregationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Aggregation_1=ruleAggregation();

                    state._fsp--;


                    			current = this_Aggregation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:1531:3: this_Composition_2= ruleComposition
                    {

                    			newCompositeNode(grammarAccess.getAssociationConnectorAccess().getCompositionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Composition_2=ruleComposition();

                    state._fsp--;


                    			current = this_Composition_2;
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
    // $ANTLR end "ruleAssociationConnector"


    // $ANTLR start "entryRuleAssociation"
    // InternalUmlTextual.g:1543:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUmlTextual.g:1543:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUmlTextual.g:1544:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalUmlTextual.g:1550:1: ruleAssociation returns [EObject current=null] : ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' (otherlv_16= 'with' otherlv_17= 'associatedclass' ( ( ruleQualifiedName ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_2 = null;

        AntlrDatatypeRuleToken lv_navigation1_5_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity1_8_0 = null;

        AntlrDatatypeRuleToken lv_navigation2_11_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity2_14_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1556:2: ( ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' (otherlv_16= 'with' otherlv_17= 'associatedclass' ( ( ruleQualifiedName ) ) )? otherlv_19= '}' ) )
            // InternalUmlTextual.g:1557:2: ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' (otherlv_16= 'with' otherlv_17= 'associatedclass' ( ( ruleQualifiedName ) ) )? otherlv_19= '}' )
            {
            // InternalUmlTextual.g:1557:2: ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' (otherlv_16= 'with' otherlv_17= 'associatedclass' ( ( ruleQualifiedName ) ) )? otherlv_19= '}' )
            // InternalUmlTextual.g:1558:3: (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' (otherlv_16= 'with' otherlv_17= 'associatedclass' ( ( ruleQualifiedName ) ) )? otherlv_19= '}'
            {
            // InternalUmlTextual.g:1558:3: (otherlv_0= 'undirected' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==60) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUmlTextual.g:1559:4: otherlv_0= 'undirected'
                    {
                    otherlv_0=(Token)match(input,60,FOLLOW_40); 

                    				newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getUndirectedKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,61,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalUmlTextual.g:1568:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) )
            // InternalUmlTextual.g:1569:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) )
            {
            // InternalUmlTextual.g:1569:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) )
            // InternalUmlTextual.g:1570:5: (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed )
            {
            // InternalUmlTextual.g:1570:5: (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            else if ( (LA33_0==58) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalUmlTextual.g:1571:6: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_name_2_1, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:1586:6: lv_name_2_2= ruleUnnamed
                    {

                    						newCompositeNode(grammarAccess.getAssociationAccess().getNameUnnamedParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_2_2=ruleUnnamed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"br.ufes.mdd.umltextual.UmlTextual.Unnamed");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,62,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getFromKeyword_4());
            		
            // InternalUmlTextual.g:1612:3: ( (lv_navigation1_5_0= ruleNavigation ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUmlTextual.g:1613:4: (lv_navigation1_5_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:1613:4: (lv_navigation1_5_0= ruleNavigation )
                    // InternalUmlTextual.g:1614:5: lv_navigation1_5_0= ruleNavigation
                    {

                    					newCompositeNode(grammarAccess.getAssociationAccess().getNavigation1NavigationParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_navigation1_5_0=ruleNavigation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationRule());
                    					}
                    					set(
                    						current,
                    						"navigation1",
                    						lv_navigation1_5_0,
                    						"br.ufes.mdd.umltextual.UmlTextual.Navigation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:1631:3: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:1632:4: ( ruleQualifiedName )
            {
            // InternalUmlTextual.g:1632:4: ( ruleQualifiedName )
            // InternalUmlTextual.g:1633:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getClass1ClassCrossReference_6_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,51,FOLLOW_31); 

            			newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalUmlTextual.g:1651:3: ( (lv_multiplicity1_8_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1652:4: (lv_multiplicity1_8_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1652:4: (lv_multiplicity1_8_0= ruleMultiplicity )
            // InternalUmlTextual.g:1653:5: lv_multiplicity1_8_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicity1MultiplicityParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_32);
            lv_multiplicity1_8_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"multiplicity1",
            						lv_multiplicity1_8_0,
            						"br.ufes.mdd.umltextual.UmlTextual.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,52,FOLLOW_45); 

            			newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,63,FOLLOW_43); 

            			newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getToKeyword_10());
            		
            // InternalUmlTextual.g:1678:3: ( (lv_navigation2_11_0= ruleNavigation ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==59) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUmlTextual.g:1679:4: (lv_navigation2_11_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:1679:4: (lv_navigation2_11_0= ruleNavigation )
                    // InternalUmlTextual.g:1680:5: lv_navigation2_11_0= ruleNavigation
                    {

                    					newCompositeNode(grammarAccess.getAssociationAccess().getNavigation2NavigationParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_navigation2_11_0=ruleNavigation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssociationRule());
                    					}
                    					set(
                    						current,
                    						"navigation2",
                    						lv_navigation2_11_0,
                    						"br.ufes.mdd.umltextual.UmlTextual.Navigation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:1697:3: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:1698:4: ( ruleQualifiedName )
            {
            // InternalUmlTextual.g:1698:4: ( ruleQualifiedName )
            // InternalUmlTextual.g:1699:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getClass2ClassCrossReference_12_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,51,FOLLOW_31); 

            			newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_13());
            		
            // InternalUmlTextual.g:1717:3: ( (lv_multiplicity2_14_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1718:4: (lv_multiplicity2_14_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1718:4: (lv_multiplicity2_14_0= ruleMultiplicity )
            // InternalUmlTextual.g:1719:5: lv_multiplicity2_14_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicity2MultiplicityParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_32);
            lv_multiplicity2_14_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"multiplicity2",
            						lv_multiplicity2_14_0,
            						"br.ufes.mdd.umltextual.UmlTextual.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,52,FOLLOW_46); 

            			newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_15());
            		
            // InternalUmlTextual.g:1740:3: (otherlv_16= 'with' otherlv_17= 'associatedclass' ( ( ruleQualifiedName ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==64) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUmlTextual.g:1741:4: otherlv_16= 'with' otherlv_17= 'associatedclass' ( ( ruleQualifiedName ) )
                    {
                    otherlv_16=(Token)match(input,64,FOLLOW_47); 

                    				newLeafNode(otherlv_16, grammarAccess.getAssociationAccess().getWithKeyword_16_0());
                    			
                    otherlv_17=(Token)match(input,65,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getAssociatedclassKeyword_16_1());
                    			
                    // InternalUmlTextual.g:1749:4: ( ( ruleQualifiedName ) )
                    // InternalUmlTextual.g:1750:5: ( ruleQualifiedName )
                    {
                    // InternalUmlTextual.g:1750:5: ( ruleQualifiedName )
                    // InternalUmlTextual.g:1751:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssociationAccess().getClassClassCrossReference_16_2_0());
                    					
                    pushFollow(FOLLOW_48);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleAggregation"
    // InternalUmlTextual.g:1774:1: entryRuleAggregation returns [EObject current=null] : iv_ruleAggregation= ruleAggregation EOF ;
    public final EObject entryRuleAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregation = null;


        try {
            // InternalUmlTextual.g:1774:52: (iv_ruleAggregation= ruleAggregation EOF )
            // InternalUmlTextual.g:1775:2: iv_ruleAggregation= ruleAggregation EOF
            {
             newCompositeNode(grammarAccess.getAggregationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAggregation=ruleAggregation();

            state._fsp--;

             current =iv_ruleAggregation; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAggregation"


    // $ANTLR start "ruleAggregation"
    // InternalUmlTextual.g:1781:1: ruleAggregation returns [EObject current=null] : (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleQualifiedName ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' ) ;
    public final EObject ruleAggregation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_2 = null;

        AntlrDatatypeRuleToken lv_multiplicity1_6_0 = null;

        AntlrDatatypeRuleToken lv_navigation_9_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity2_12_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1787:2: ( (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleQualifiedName ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' ) )
            // InternalUmlTextual.g:1788:2: (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleQualifiedName ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' )
            {
            // InternalUmlTextual.g:1788:2: (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleQualifiedName ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' )
            // InternalUmlTextual.g:1789:3: otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleQualifiedName ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getAggregationAccess().getAggregationKeyword_0());
            		
            // InternalUmlTextual.g:1793:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) )
            // InternalUmlTextual.g:1794:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) )
            {
            // InternalUmlTextual.g:1794:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) )
            // InternalUmlTextual.g:1795:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed )
            {
            // InternalUmlTextual.g:1795:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            else if ( (LA37_0==58) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalUmlTextual.g:1796:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getAggregationAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAggregationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:1811:6: lv_name_1_2= ruleUnnamed
                    {

                    						newCompositeNode(grammarAccess.getAggregationAccess().getNameUnnamedParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_1_2=ruleUnnamed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAggregationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"br.ufes.mdd.umltextual.UmlTextual.Unnamed");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getAggregationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAggregationAccess().getFromKeyword_3());
            		
            // InternalUmlTextual.g:1837:3: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:1838:4: ( ruleQualifiedName )
            {
            // InternalUmlTextual.g:1838:4: ( ruleQualifiedName )
            // InternalUmlTextual.g:1839:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAggregationAccess().getClass1ClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalUmlTextual.g:1857:3: ( (lv_multiplicity1_6_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1858:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1858:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            // InternalUmlTextual.g:1859:5: lv_multiplicity1_6_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getMultiplicity1MultiplicityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_32);
            lv_multiplicity1_6_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregationRule());
            					}
            					set(
            						current,
            						"multiplicity1",
            						lv_multiplicity1_6_0,
            						"br.ufes.mdd.umltextual.UmlTextual.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,52,FOLLOW_45); 

            			newLeafNode(otherlv_7, grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,63,FOLLOW_43); 

            			newLeafNode(otherlv_8, grammarAccess.getAggregationAccess().getToKeyword_8());
            		
            // InternalUmlTextual.g:1884:3: ( (lv_navigation_9_0= ruleNavigation ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==59) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUmlTextual.g:1885:4: (lv_navigation_9_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:1885:4: (lv_navigation_9_0= ruleNavigation )
                    // InternalUmlTextual.g:1886:5: lv_navigation_9_0= ruleNavigation
                    {

                    					newCompositeNode(grammarAccess.getAggregationAccess().getNavigationNavigationParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_navigation_9_0=ruleNavigation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAggregationRule());
                    					}
                    					set(
                    						current,
                    						"navigation",
                    						lv_navigation_9_0,
                    						"br.ufes.mdd.umltextual.UmlTextual.Navigation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:1903:3: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:1904:4: ( ruleQualifiedName )
            {
            // InternalUmlTextual.g:1904:4: ( ruleQualifiedName )
            // InternalUmlTextual.g:1905:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAggregationAccess().getClass2ClassCrossReference_10_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,51,FOLLOW_31); 

            			newLeafNode(otherlv_11, grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalUmlTextual.g:1923:3: ( (lv_multiplicity2_12_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1924:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1924:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            // InternalUmlTextual.g:1925:5: lv_multiplicity2_12_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getMultiplicity2MultiplicityParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_32);
            lv_multiplicity2_12_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAggregationRule());
            					}
            					set(
            						current,
            						"multiplicity2",
            						lv_multiplicity2_12_0,
            						"br.ufes.mdd.umltextual.UmlTextual.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,52,FOLLOW_48); 

            			newLeafNode(otherlv_13, grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getAggregationAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleAggregation"


    // $ANTLR start "entryRuleComposition"
    // InternalUmlTextual.g:1954:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalUmlTextual.g:1954:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalUmlTextual.g:1955:2: iv_ruleComposition= ruleComposition EOF
            {
             newCompositeNode(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposition=ruleComposition();

            state._fsp--;

             current =iv_ruleComposition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalUmlTextual.g:1961:1: ruleComposition returns [EObject current=null] : (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleQualifiedName ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_2 = null;

        AntlrDatatypeRuleToken lv_multiplicity1_6_0 = null;

        AntlrDatatypeRuleToken lv_navigation_9_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity2_12_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1967:2: ( (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleQualifiedName ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' ) )
            // InternalUmlTextual.g:1968:2: (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleQualifiedName ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' )
            {
            // InternalUmlTextual.g:1968:2: (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleQualifiedName ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' )
            // InternalUmlTextual.g:1969:3: otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( ( ruleQualifiedName ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( ( ruleQualifiedName ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositionAccess().getCompositionKeyword_0());
            		
            // InternalUmlTextual.g:1973:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) )
            // InternalUmlTextual.g:1974:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) )
            {
            // InternalUmlTextual.g:1974:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) )
            // InternalUmlTextual.g:1975:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed )
            {
            // InternalUmlTextual.g:1975:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            else if ( (LA39_0==58) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalUmlTextual.g:1976:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_name_1_1, grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:1991:6: lv_name_1_2= ruleUnnamed
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getNameUnnamedParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_1_2=ruleUnnamed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"br.ufes.mdd.umltextual.UmlTextual.Unnamed");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getFromKeyword_3());
            		
            // InternalUmlTextual.g:2017:3: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:2018:4: ( ruleQualifiedName )
            {
            // InternalUmlTextual.g:2018:4: ( ruleQualifiedName )
            // InternalUmlTextual.g:2019:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositionAccess().getClass1ClassCrossReference_4_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,51,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalUmlTextual.g:2037:3: ( (lv_multiplicity1_6_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:2038:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:2038:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            // InternalUmlTextual.g:2039:5: lv_multiplicity1_6_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getMultiplicity1MultiplicityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_32);
            lv_multiplicity1_6_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"multiplicity1",
            						lv_multiplicity1_6_0,
            						"br.ufes.mdd.umltextual.UmlTextual.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,52,FOLLOW_45); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,63,FOLLOW_43); 

            			newLeafNode(otherlv_8, grammarAccess.getCompositionAccess().getToKeyword_8());
            		
            // InternalUmlTextual.g:2064:3: ( (lv_navigation_9_0= ruleNavigation ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==59) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUmlTextual.g:2065:4: (lv_navigation_9_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:2065:4: (lv_navigation_9_0= ruleNavigation )
                    // InternalUmlTextual.g:2066:5: lv_navigation_9_0= ruleNavigation
                    {

                    					newCompositeNode(grammarAccess.getCompositionAccess().getNavigationNavigationParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_navigation_9_0=ruleNavigation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCompositionRule());
                    					}
                    					set(
                    						current,
                    						"navigation",
                    						lv_navigation_9_0,
                    						"br.ufes.mdd.umltextual.UmlTextual.Navigation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:2083:3: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:2084:4: ( ruleQualifiedName )
            {
            // InternalUmlTextual.g:2084:4: ( ruleQualifiedName )
            // InternalUmlTextual.g:2085:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositionAccess().getClass2ClassCrossReference_10_0());
            				
            pushFollow(FOLLOW_44);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,51,FOLLOW_31); 

            			newLeafNode(otherlv_11, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalUmlTextual.g:2103:3: ( (lv_multiplicity2_12_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:2104:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:2104:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            // InternalUmlTextual.g:2105:5: lv_multiplicity2_12_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getMultiplicity2MultiplicityParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_32);
            lv_multiplicity2_12_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositionRule());
            					}
            					set(
            						current,
            						"multiplicity2",
            						lv_multiplicity2_12_0,
            						"br.ufes.mdd.umltextual.UmlTextual.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,52,FOLLOW_48); 

            			newLeafNode(otherlv_13, grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getCompositionAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleUseCaseDiagram"
    // InternalUmlTextual.g:2134:1: entryRuleUseCaseDiagram returns [EObject current=null] : iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF ;
    public final EObject entryRuleUseCaseDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseDiagram = null;


        try {
            // InternalUmlTextual.g:2134:55: (iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF )
            // InternalUmlTextual.g:2135:2: iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF
            {
             newCompositeNode(grammarAccess.getUseCaseDiagramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseDiagram=ruleUseCaseDiagram();

            state._fsp--;

             current =iv_ruleUseCaseDiagram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUseCaseDiagram"


    // $ANTLR start "ruleUseCaseDiagram"
    // InternalUmlTextual.g:2141:1: ruleUseCaseDiagram returns [EObject current=null] : (otherlv_0= 'usecase' otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUseCaseElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleUseCaseDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:2147:2: ( (otherlv_0= 'usecase' otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUseCaseElement ) )* otherlv_5= '}' ) )
            // InternalUmlTextual.g:2148:2: (otherlv_0= 'usecase' otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUseCaseElement ) )* otherlv_5= '}' )
            {
            // InternalUmlTextual.g:2148:2: (otherlv_0= 'usecase' otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUseCaseElement ) )* otherlv_5= '}' )
            // InternalUmlTextual.g:2149:3: otherlv_0= 'usecase' otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUseCaseElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_49); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseDiagramAccess().getUsecaseKeyword_0());
            		
            otherlv_1=(Token)match(input,69,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUseCaseDiagramAccess().getDiagramKeyword_1());
            		
            // InternalUmlTextual.g:2157:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlTextual.g:2158:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlTextual.g:2158:4: (lv_name_2_0= RULE_ID )
            // InternalUmlTextual.g:2159:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_2_0, grammarAccess.getUseCaseDiagramAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseDiagramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_50); 

            			newLeafNode(otherlv_3, grammarAccess.getUseCaseDiagramAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUmlTextual.g:2179:3: ( (lv_elements_4_0= ruleUseCaseElement ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==12||(LA41_0>=25 && LA41_0<=29)||LA41_0==68||(LA41_0>=70 && LA41_0<=71)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUmlTextual.g:2180:4: (lv_elements_4_0= ruleUseCaseElement )
            	    {
            	    // InternalUmlTextual.g:2180:4: (lv_elements_4_0= ruleUseCaseElement )
            	    // InternalUmlTextual.g:2181:5: lv_elements_4_0= ruleUseCaseElement
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseDiagramAccess().getElementsUseCaseElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_elements_4_0=ruleUseCaseElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUseCaseDiagramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"br.ufes.mdd.umltextual.UmlTextual.UseCaseElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getUseCaseDiagramAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleUseCaseDiagram"


    // $ANTLR start "entryRuleUseCaseElement"
    // InternalUmlTextual.g:2206:1: entryRuleUseCaseElement returns [EObject current=null] : iv_ruleUseCaseElement= ruleUseCaseElement EOF ;
    public final EObject entryRuleUseCaseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseElement = null;


        try {
            // InternalUmlTextual.g:2206:55: (iv_ruleUseCaseElement= ruleUseCaseElement EOF )
            // InternalUmlTextual.g:2207:2: iv_ruleUseCaseElement= ruleUseCaseElement EOF
            {
             newCompositeNode(grammarAccess.getUseCaseElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseElement=ruleUseCaseElement();

            state._fsp--;

             current =iv_ruleUseCaseElement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUseCaseElement"


    // $ANTLR start "ruleUseCaseElement"
    // InternalUmlTextual.g:2213:1: ruleUseCaseElement returns [EObject current=null] : (this_Actor_0= ruleActor | this_UseCase_1= ruleUseCase ) ;
    public final EObject ruleUseCaseElement() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_UseCase_1 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:2219:2: ( (this_Actor_0= ruleActor | this_UseCase_1= ruleUseCase ) )
            // InternalUmlTextual.g:2220:2: (this_Actor_0= ruleActor | this_UseCase_1= ruleUseCase )
            {
            // InternalUmlTextual.g:2220:2: (this_Actor_0= ruleActor | this_UseCase_1= ruleUseCase )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==12||(LA42_0>=25 && LA42_0<=29)||(LA42_0>=70 && LA42_0<=71)) ) {
                alt42=1;
            }
            else if ( (LA42_0==68) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalUmlTextual.g:2221:3: this_Actor_0= ruleActor
                    {

                    			newCompositeNode(grammarAccess.getUseCaseElementAccess().getActorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actor_0=ruleActor();

                    state._fsp--;


                    			current = this_Actor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:2230:3: this_UseCase_1= ruleUseCase
                    {

                    			newCompositeNode(grammarAccess.getUseCaseElementAccess().getUseCaseParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UseCase_1=ruleUseCase();

                    state._fsp--;


                    			current = this_UseCase_1;
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
    // $ANTLR end "ruleUseCaseElement"


    // $ANTLR start "entryRuleActor"
    // InternalUmlTextual.g:2242:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalUmlTextual.g:2242:46: (iv_ruleActor= ruleActor EOF )
            // InternalUmlTextual.g:2243:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalUmlTextual.g:2249:1: ruleActor returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= ruleAbstract ) )? ( (lv_active_2_0= ruleActive ) )? ( (lv_business_3_0= 'business' ) )? otherlv_4= 'actor' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_8= '{' (otherlv_9= 'uses' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )* otherlv_13= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_business_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_abstract_1_0 = null;

        AntlrDatatypeRuleToken lv_active_2_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:2255:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= ruleAbstract ) )? ( (lv_active_2_0= ruleActive ) )? ( (lv_business_3_0= 'business' ) )? otherlv_4= 'actor' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_8= '{' (otherlv_9= 'uses' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )* otherlv_13= '}' ) )
            // InternalUmlTextual.g:2256:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= ruleAbstract ) )? ( (lv_active_2_0= ruleActive ) )? ( (lv_business_3_0= 'business' ) )? otherlv_4= 'actor' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_8= '{' (otherlv_9= 'uses' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )* otherlv_13= '}' )
            {
            // InternalUmlTextual.g:2256:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= ruleAbstract ) )? ( (lv_active_2_0= ruleActive ) )? ( (lv_business_3_0= 'business' ) )? otherlv_4= 'actor' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_8= '{' (otherlv_9= 'uses' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )* otherlv_13= '}' )
            // InternalUmlTextual.g:2257:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= ruleAbstract ) )? ( (lv_active_2_0= ruleActive ) )? ( (lv_business_3_0= 'business' ) )? otherlv_4= 'actor' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_8= '{' (otherlv_9= 'uses' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )* otherlv_13= '}'
            {
            // InternalUmlTextual.g:2257:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==12||(LA43_0>=25 && LA43_0<=27)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUmlTextual.g:2258:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:2258:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalUmlTextual.g:2259:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getVisibilityVisibilityParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_51);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActorRule());
                    					}
                    					set(
                    						current,
                    						"visibility",
                    						lv_visibility_0_0,
                    						"br.ufes.mdd.umltextual.UmlTextual.Visibility");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:2276:3: ( (lv_abstract_1_0= ruleAbstract ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUmlTextual.g:2277:4: (lv_abstract_1_0= ruleAbstract )
                    {
                    // InternalUmlTextual.g:2277:4: (lv_abstract_1_0= ruleAbstract )
                    // InternalUmlTextual.g:2278:5: lv_abstract_1_0= ruleAbstract
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getAbstractAbstractParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_52);
                    lv_abstract_1_0=ruleAbstract();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActorRule());
                    					}
                    					set(
                    						current,
                    						"abstract",
                    						lv_abstract_1_0,
                    						"br.ufes.mdd.umltextual.UmlTextual.Abstract");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:2295:3: ( (lv_active_2_0= ruleActive ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==29) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUmlTextual.g:2296:4: (lv_active_2_0= ruleActive )
                    {
                    // InternalUmlTextual.g:2296:4: (lv_active_2_0= ruleActive )
                    // InternalUmlTextual.g:2297:5: lv_active_2_0= ruleActive
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getActiveActiveParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_53);
                    lv_active_2_0=ruleActive();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActorRule());
                    					}
                    					set(
                    						current,
                    						"active",
                    						lv_active_2_0,
                    						"br.ufes.mdd.umltextual.UmlTextual.Active");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:2314:3: ( (lv_business_3_0= 'business' ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==70) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUmlTextual.g:2315:4: (lv_business_3_0= 'business' )
                    {
                    // InternalUmlTextual.g:2315:4: (lv_business_3_0= 'business' )
                    // InternalUmlTextual.g:2316:5: lv_business_3_0= 'business'
                    {
                    lv_business_3_0=(Token)match(input,70,FOLLOW_54); 

                    					newLeafNode(lv_business_3_0, grammarAccess.getActorAccess().getBusinessBusinessKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActorRule());
                    					}
                    					setWithLastConsumed(current, "business", lv_business_3_0, "business");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,71,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getActorAccess().getActorKeyword_4());
            		
            // InternalUmlTextual.g:2332:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalUmlTextual.g:2333:4: (lv_name_5_0= RULE_ID )
            {
            // InternalUmlTextual.g:2333:4: (lv_name_5_0= RULE_ID )
            // InternalUmlTextual.g:2334:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_5_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUmlTextual.g:2350:3: (otherlv_6= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==21) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUmlTextual.g:2351:4: otherlv_6= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getActorAccess().getExtendsKeyword_6_0());
                    			
                    // InternalUmlTextual.g:2355:4: ( ( ruleQualifiedName ) )
                    // InternalUmlTextual.g:2356:5: ( ruleQualifiedName )
                    {
                    // InternalUmlTextual.g:2356:5: ( ruleQualifiedName )
                    // InternalUmlTextual.g:2357:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getActorAccess().getParentActorActorCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_55); 

            			newLeafNode(otherlv_8, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalUmlTextual.g:2376:3: (otherlv_9= 'uses' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==72) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalUmlTextual.g:2377:4: otherlv_9= 'uses' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
            	    {
            	    otherlv_9=(Token)match(input,72,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getActorAccess().getUsesKeyword_8_0());
            	    			
            	    // InternalUmlTextual.g:2381:4: ( ( ruleQualifiedName ) )
            	    // InternalUmlTextual.g:2382:5: ( ruleQualifiedName )
            	    {
            	    // InternalUmlTextual.g:2382:5: ( ruleQualifiedName )
            	    // InternalUmlTextual.g:2383:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getActorRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getActorAccess().getUseCasesUseCaseCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_56);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalUmlTextual.g:2397:4: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==23) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // InternalUmlTextual.g:2398:5: otherlv_11= ',' ( ( ruleQualifiedName ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,23,FOLLOW_5); 

            	    	    					newLeafNode(otherlv_11, grammarAccess.getActorAccess().getCommaKeyword_8_2_0());
            	    	    				
            	    	    // InternalUmlTextual.g:2402:5: ( ( ruleQualifiedName ) )
            	    	    // InternalUmlTextual.g:2403:6: ( ruleQualifiedName )
            	    	    {
            	    	    // InternalUmlTextual.g:2403:6: ( ruleQualifiedName )
            	    	    // InternalUmlTextual.g:2404:7: ruleQualifiedName
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getActorRule());
            	    	    							}
            	    	    						

            	    	    							newCompositeNode(grammarAccess.getActorAccess().getUseCasesUseCaseCrossReference_8_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_56);
            	    	    ruleQualifiedName();

            	    	    state._fsp--;


            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleUseCase"
    // InternalUmlTextual.g:2428:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUmlTextual.g:2428:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUmlTextual.g:2429:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUmlTextual.g:2435:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= '{' ( (otherlv_9= 'includes' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= 'extends' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* ) | (otherlv_17= 'extends' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* otherlv_21= 'includes' ( ( ruleQualifiedName ) ) (otherlv_23= ',' ( ( ruleQualifiedName ) ) )* ) ) otherlv_25= '}' )? ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:2441:2: ( (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= '{' ( (otherlv_9= 'includes' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= 'extends' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* ) | (otherlv_17= 'extends' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* otherlv_21= 'includes' ( ( ruleQualifiedName ) ) (otherlv_23= ',' ( ( ruleQualifiedName ) ) )* ) ) otherlv_25= '}' )? ) )
            // InternalUmlTextual.g:2442:2: (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= '{' ( (otherlv_9= 'includes' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= 'extends' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* ) | (otherlv_17= 'extends' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* otherlv_21= 'includes' ( ( ruleQualifiedName ) ) (otherlv_23= ',' ( ( ruleQualifiedName ) ) )* ) ) otherlv_25= '}' )? )
            {
            // InternalUmlTextual.g:2442:2: (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= '{' ( (otherlv_9= 'includes' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= 'extends' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* ) | (otherlv_17= 'extends' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* otherlv_21= 'includes' ( ( ruleQualifiedName ) ) (otherlv_23= ',' ( ( ruleQualifiedName ) ) )* ) ) otherlv_25= '}' )? )
            // InternalUmlTextual.g:2443:3: otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= '{' ( (otherlv_9= 'includes' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= 'extends' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* ) | (otherlv_17= 'extends' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* otherlv_21= 'includes' ( ( ruleQualifiedName ) ) (otherlv_23= ',' ( ( ruleQualifiedName ) ) )* ) ) otherlv_25= '}' )?
            {
            otherlv_0=(Token)match(input,68,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUsecaseKeyword_0());
            		
            // InternalUmlTextual.g:2447:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUmlTextual.g:2448:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUmlTextual.g:2448:4: (lv_name_1_0= RULE_ID )
            // InternalUmlTextual.g:2449:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_57); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalUmlTextual.g:2465:3: (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==73) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUmlTextual.g:2466:4: otherlv_2= 'includes' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,73,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getIncludesKeyword_2_0());
                    			
                    // InternalUmlTextual.g:2470:4: ( ( ruleQualifiedName ) )
                    // InternalUmlTextual.g:2471:5: ( ruleQualifiedName )
                    {
                    // InternalUmlTextual.g:2471:5: ( ruleQualifiedName )
                    // InternalUmlTextual.g:2472:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:2487:3: (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==21) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUmlTextual.g:2488:4: otherlv_4= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0());
                    			
                    // InternalUmlTextual.g:2492:4: ( ( ruleQualifiedName ) )
                    // InternalUmlTextual.g:2493:5: ( ruleQualifiedName )
                    {
                    // InternalUmlTextual.g:2493:5: ( ruleQualifiedName )
                    // InternalUmlTextual.g:2494:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,40,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getUseCaseAccess().getEqualsSignKeyword_4());
            		
            // InternalUmlTextual.g:2513:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalUmlTextual.g:2514:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalUmlTextual.g:2514:4: (lv_description_7_0= RULE_STRING )
            // InternalUmlTextual.g:2515:5: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            					newLeafNode(lv_description_7_0, grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUseCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalUmlTextual.g:2531:3: (otherlv_8= '{' ( (otherlv_9= 'includes' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= 'extends' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* ) | (otherlv_17= 'extends' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* otherlv_21= 'includes' ( ( ruleQualifiedName ) ) (otherlv_23= ',' ( ( ruleQualifiedName ) ) )* ) ) otherlv_25= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==16) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalUmlTextual.g:2532:4: otherlv_8= '{' ( (otherlv_9= 'includes' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= 'extends' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* ) | (otherlv_17= 'extends' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* otherlv_21= 'includes' ( ( ruleQualifiedName ) ) (otherlv_23= ',' ( ( ruleQualifiedName ) ) )* ) ) otherlv_25= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_60); 

                    				newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalUmlTextual.g:2536:4: ( (otherlv_9= 'includes' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= 'extends' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* ) | (otherlv_17= 'extends' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* otherlv_21= 'includes' ( ( ruleQualifiedName ) ) (otherlv_23= ',' ( ( ruleQualifiedName ) ) )* ) )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==73) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==21) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalUmlTextual.g:2537:5: (otherlv_9= 'includes' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= 'extends' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* )
                            {
                            // InternalUmlTextual.g:2537:5: (otherlv_9= 'includes' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= 'extends' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* )
                            // InternalUmlTextual.g:2538:6: otherlv_9= 'includes' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* otherlv_13= 'extends' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            otherlv_9=(Token)match(input,73,FOLLOW_5); 

                            						newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_0_0());
                            					
                            // InternalUmlTextual.g:2542:6: ( ( ruleQualifiedName ) )
                            // InternalUmlTextual.g:2543:7: ( ruleQualifiedName )
                            {
                            // InternalUmlTextual.g:2543:7: ( ruleQualifiedName )
                            // InternalUmlTextual.g:2544:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getUseCaseRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_0_1_0());
                            							
                            pushFollow(FOLLOW_61);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalUmlTextual.g:2558:6: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==23) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalUmlTextual.g:2559:7: otherlv_11= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_11=(Token)match(input,23,FOLLOW_5); 

                            	    							newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_0_2_0());
                            	    						
                            	    // InternalUmlTextual.g:2563:7: ( ( ruleQualifiedName ) )
                            	    // InternalUmlTextual.g:2564:8: ( ruleQualifiedName )
                            	    {
                            	    // InternalUmlTextual.g:2564:8: ( ruleQualifiedName )
                            	    // InternalUmlTextual.g:2565:9: ruleQualifiedName
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getUseCaseRule());
                            	    									}
                            	    								

                            	    									newCompositeNode(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_0_2_1_0());
                            	    								
                            	    pushFollow(FOLLOW_61);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,21,FOLLOW_5); 

                            						newLeafNode(otherlv_13, grammarAccess.getUseCaseAccess().getExtendsKeyword_6_1_0_3());
                            					
                            // InternalUmlTextual.g:2584:6: ( ( ruleQualifiedName ) )
                            // InternalUmlTextual.g:2585:7: ( ruleQualifiedName )
                            {
                            // InternalUmlTextual.g:2585:7: ( ruleQualifiedName )
                            // InternalUmlTextual.g:2586:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getUseCaseRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_0_4_0());
                            							
                            pushFollow(FOLLOW_62);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalUmlTextual.g:2600:6: (otherlv_15= ',' ( ( ruleQualifiedName ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==23) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // InternalUmlTextual.g:2601:7: otherlv_15= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_15=(Token)match(input,23,FOLLOW_5); 

                            	    							newLeafNode(otherlv_15, grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_0_5_0());
                            	    						
                            	    // InternalUmlTextual.g:2605:7: ( ( ruleQualifiedName ) )
                            	    // InternalUmlTextual.g:2606:8: ( ruleQualifiedName )
                            	    {
                            	    // InternalUmlTextual.g:2606:8: ( ruleQualifiedName )
                            	    // InternalUmlTextual.g:2607:9: ruleQualifiedName
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getUseCaseRule());
                            	    									}
                            	    								

                            	    									newCompositeNode(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_0_5_1_0());
                            	    								
                            	    pushFollow(FOLLOW_62);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalUmlTextual.g:2624:5: (otherlv_17= 'extends' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* otherlv_21= 'includes' ( ( ruleQualifiedName ) ) (otherlv_23= ',' ( ( ruleQualifiedName ) ) )* )
                            {
                            // InternalUmlTextual.g:2624:5: (otherlv_17= 'extends' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* otherlv_21= 'includes' ( ( ruleQualifiedName ) ) (otherlv_23= ',' ( ( ruleQualifiedName ) ) )* )
                            // InternalUmlTextual.g:2625:6: otherlv_17= 'extends' ( ( ruleQualifiedName ) ) (otherlv_19= ',' ( ( ruleQualifiedName ) ) )* otherlv_21= 'includes' ( ( ruleQualifiedName ) ) (otherlv_23= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            otherlv_17=(Token)match(input,21,FOLLOW_5); 

                            						newLeafNode(otherlv_17, grammarAccess.getUseCaseAccess().getExtendsKeyword_6_1_1_0());
                            					
                            // InternalUmlTextual.g:2629:6: ( ( ruleQualifiedName ) )
                            // InternalUmlTextual.g:2630:7: ( ruleQualifiedName )
                            {
                            // InternalUmlTextual.g:2630:7: ( ruleQualifiedName )
                            // InternalUmlTextual.g:2631:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getUseCaseRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_1_1_0());
                            							
                            pushFollow(FOLLOW_63);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalUmlTextual.g:2645:6: (otherlv_19= ',' ( ( ruleQualifiedName ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==23) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalUmlTextual.g:2646:7: otherlv_19= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_19=(Token)match(input,23,FOLLOW_5); 

                            	    							newLeafNode(otherlv_19, grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_1_2_0());
                            	    						
                            	    // InternalUmlTextual.g:2650:7: ( ( ruleQualifiedName ) )
                            	    // InternalUmlTextual.g:2651:8: ( ruleQualifiedName )
                            	    {
                            	    // InternalUmlTextual.g:2651:8: ( ruleQualifiedName )
                            	    // InternalUmlTextual.g:2652:9: ruleQualifiedName
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getUseCaseRule());
                            	    									}
                            	    								

                            	    									newCompositeNode(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_1_2_1_0());
                            	    								
                            	    pushFollow(FOLLOW_63);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);

                            otherlv_21=(Token)match(input,73,FOLLOW_5); 

                            						newLeafNode(otherlv_21, grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_1_3());
                            					
                            // InternalUmlTextual.g:2671:6: ( ( ruleQualifiedName ) )
                            // InternalUmlTextual.g:2672:7: ( ruleQualifiedName )
                            {
                            // InternalUmlTextual.g:2672:7: ( ruleQualifiedName )
                            // InternalUmlTextual.g:2673:8: ruleQualifiedName
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getUseCaseRule());
                            								}
                            							

                            								newCompositeNode(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_1_4_0());
                            							
                            pushFollow(FOLLOW_62);
                            ruleQualifiedName();

                            state._fsp--;


                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalUmlTextual.g:2687:6: (otherlv_23= ',' ( ( ruleQualifiedName ) ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==23) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // InternalUmlTextual.g:2688:7: otherlv_23= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_23=(Token)match(input,23,FOLLOW_5); 

                            	    							newLeafNode(otherlv_23, grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_1_5_0());
                            	    						
                            	    // InternalUmlTextual.g:2692:7: ( ( ruleQualifiedName ) )
                            	    // InternalUmlTextual.g:2693:8: ( ruleQualifiedName )
                            	    {
                            	    // InternalUmlTextual.g:2693:8: ( ruleQualifiedName )
                            	    // InternalUmlTextual.g:2694:9: ruleQualifiedName
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getUseCaseRule());
                            	    									}
                            	    								

                            	    									newCompositeNode(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_1_5_1_0());
                            	    								
                            	    pushFollow(FOLLOW_62);
                            	    ruleQualifiedName();

                            	    state._fsp--;


                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop55;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_25=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_6_2());
                    			

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
    // $ANTLR end "ruleUseCase"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\14\1\4\4\24\3\uffff\1\14";
    static final String dfa_3s = "\1\103\1\4\4\30\3\uffff\1\33";
    static final String dfa_4s = "\6\uffff\1\1\1\2\1\3\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\6\uffff\1\1\1\6\3\uffff\1\10\1\2\1\3\1\4\40\uffff\2\7\4\uffff\2\7",
            "\1\11",
            "\1\6\3\uffff\1\10",
            "\1\6\3\uffff\1\10",
            "\1\6\3\uffff\1\10",
            "\1\6\3\uffff\1\10",
            "",
            "",
            "",
            "\1\5\7\uffff\1\6\3\uffff\1\10\1\2\1\3\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "346:2: (this_Class_0= ruleClass | this_AssociationConnector_1= ruleAssociationConnector | this_Interface_2= ruleInterface )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\10\uffff\1\12\2\uffff";
    static final String dfa_9s = "\1\6\7\uffff\1\60\2\uffff";
    static final String dfa_10s = "\1\57\7\uffff\1\64\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\10";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\10\42\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\3\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1039:2: (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' | (kw= '0..' this_INT_6= RULE_INT ) | (kw= '1..' this_INT_8= RULE_INT ) | this_INT_9= RULE_INT | (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003802L,0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x300000800F1A1000L,0x000000000000000CL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x300000000F1A1000L,0x000000000000000CL});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000E101000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000610000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x006200001E021000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x006000001E021000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000F001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000200000E021000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000007FC0000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000FE0000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x006000000E001000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x004000000E001000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x000000003E021000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000030000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000020000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000100L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000820000L,0x0000000000000100L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000010000200000L,0x0000000000000200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000200L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000200L});

}