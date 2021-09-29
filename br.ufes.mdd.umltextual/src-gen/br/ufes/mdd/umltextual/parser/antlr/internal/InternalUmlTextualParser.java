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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'instantiable'", "'package'", "'subsystem'", "'depends'", "'on'", "'{'", "'}'", "'@'", "'class'", "'extends'", "'implements'", "','", "'interface'", "'public'", "'private'", "'protected'", "'abstract'", "'active'", "'string'", "'int'", "'double'", "'boolean'", "'byte'", "'char'", "'float'", "'short'", "'long'", "'domaintype'", "'='", "'1'", "'0..1'", "'0..*'", "'*'", "'1..*'", "'0..'", "'1..'", "'..'", "'attr'", "':'", "'['", "']'", "'static'", "'function'", "'('", "')'", "'->'", "'unnamed'", "'navigable'", "'undirected'", "'association'", "'from'", "'to'", "'with'", "'associatedclass'", "'aggregation'", "'composition'", "'usecase'", "'diagram'", "'business'", "'actor'", "'uses'", "'includes'"
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

                if ( ((LA1_0>=11 && LA1_0<=13)||LA1_0==67) ) {
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
            else if ( (LA2_0==67) ) {
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

                if ( (LA6_0==38) ) {
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

                if ( (LA7_0==12||(LA7_0>=18 && LA7_0<=19)||(LA7_0>=23 && LA7_0<=26)||(LA7_0>=59 && LA7_0<=60)||(LA7_0>=65 && LA7_0<=66)) ) {
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


    // $ANTLR start "entryRuleElement"
    // InternalUmlTextual.g:283:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalUmlTextual.g:283:48: (iv_ruleElement= ruleElement EOF )
            // InternalUmlTextual.g:284:2: iv_ruleElement= ruleElement EOF
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
    // InternalUmlTextual.g:290:1: ruleElement returns [EObject current=null] : (this_Class_0= ruleClass | this_AssociationConnector_1= ruleAssociationConnector | this_Interface_2= ruleInterface ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_AssociationConnector_1 = null;

        EObject this_Interface_2 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:296:2: ( (this_Class_0= ruleClass | this_AssociationConnector_1= ruleAssociationConnector | this_Interface_2= ruleInterface ) )
            // InternalUmlTextual.g:297:2: (this_Class_0= ruleClass | this_AssociationConnector_1= ruleAssociationConnector | this_Interface_2= ruleInterface )
            {
            // InternalUmlTextual.g:297:2: (this_Class_0= ruleClass | this_AssociationConnector_1= ruleAssociationConnector | this_Interface_2= ruleInterface )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalUmlTextual.g:298:3: this_Class_0= ruleClass
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
                    // InternalUmlTextual.g:307:3: this_AssociationConnector_1= ruleAssociationConnector
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
                    // InternalUmlTextual.g:316:3: this_Interface_2= ruleInterface
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
    // InternalUmlTextual.g:328:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalUmlTextual.g:328:46: (iv_ruleClass= ruleClass EOF )
            // InternalUmlTextual.g:329:2: iv_ruleClass= ruleClass EOF
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
    // InternalUmlTextual.g:335:1: ruleClass returns [EObject current=null] : ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'implements' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) )* ( (lv_methods_13_0= ruleMethod ) )* otherlv_14= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stereotype_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_visibility_2_0 = null;

        EObject lv_attributes_12_0 = null;

        EObject lv_methods_13_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:341:2: ( ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'implements' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) )* ( (lv_methods_13_0= ruleMethod ) )* otherlv_14= '}' ) )
            // InternalUmlTextual.g:342:2: ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'implements' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) )* ( (lv_methods_13_0= ruleMethod ) )* otherlv_14= '}' )
            {
            // InternalUmlTextual.g:342:2: ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'implements' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) )* ( (lv_methods_13_0= ruleMethod ) )* otherlv_14= '}' )
            // InternalUmlTextual.g:343:3: (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? (otherlv_7= 'implements' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '{' ( (lv_attributes_12_0= ruleAttribute ) )* ( (lv_methods_13_0= ruleMethod ) )* otherlv_14= '}'
            {
            // InternalUmlTextual.g:343:3: (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalUmlTextual.g:344:4: otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassAccess().getCommercialAtKeyword_0_0());
                    			
                    // InternalUmlTextual.g:348:4: ( (lv_stereotype_1_0= RULE_ID ) )
                    // InternalUmlTextual.g:349:5: (lv_stereotype_1_0= RULE_ID )
                    {
                    // InternalUmlTextual.g:349:5: (lv_stereotype_1_0= RULE_ID )
                    // InternalUmlTextual.g:350:6: lv_stereotype_1_0= RULE_ID
                    {
                    lv_stereotype_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

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

            // InternalUmlTextual.g:367:3: ( (lv_visibility_2_0= ruleVisibility ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12||(LA10_0>=24 && LA10_0<=26)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUmlTextual.g:368:4: (lv_visibility_2_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:368:4: (lv_visibility_2_0= ruleVisibility )
                    // InternalUmlTextual.g:369:5: lv_visibility_2_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getVisibilityVisibilityParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_12);
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

            otherlv_3=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassKeyword_2());
            		
            // InternalUmlTextual.g:390:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalUmlTextual.g:391:4: (lv_name_4_0= RULE_ID )
            {
            // InternalUmlTextual.g:391:4: (lv_name_4_0= RULE_ID )
            // InternalUmlTextual.g:392:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalUmlTextual.g:408:3: (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUmlTextual.g:409:4: otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getExtendsKeyword_4_0());
                    			
                    // InternalUmlTextual.g:413:4: ( (otherlv_6= RULE_ID ) )
                    // InternalUmlTextual.g:414:5: (otherlv_6= RULE_ID )
                    {
                    // InternalUmlTextual.g:414:5: (otherlv_6= RULE_ID )
                    // InternalUmlTextual.g:415:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_6, grammarAccess.getClassAccess().getParentClassClassCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:427:3: (otherlv_7= 'implements' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUmlTextual.g:428:4: otherlv_7= 'implements' ( (otherlv_8= RULE_ID ) ) (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getImplementsKeyword_5_0());
                    			
                    // InternalUmlTextual.g:432:4: ( (otherlv_8= RULE_ID ) )
                    // InternalUmlTextual.g:433:5: (otherlv_8= RULE_ID )
                    {
                    // InternalUmlTextual.g:433:5: (otherlv_8= RULE_ID )
                    // InternalUmlTextual.g:434:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_8, grammarAccess.getClassAccess().getInterfacesInterfaceCrossReference_5_1_0());
                    					

                    }


                    }

                    // InternalUmlTextual.g:445:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==22) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalUmlTextual.g:446:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FOLLOW_5); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalUmlTextual.g:450:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalUmlTextual.g:451:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalUmlTextual.g:451:6: (otherlv_10= RULE_ID )
                    	    // InternalUmlTextual.g:452:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getClassRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getClassAccess().getInterfacesInterfaceCrossReference_5_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_11, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalUmlTextual.g:469:3: ( (lv_attributes_12_0= ruleAttribute ) )*
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case 24:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==48) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (LA14_3==48) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (LA14_4==48) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 12:
                    {
                    int LA14_5 = input.LA(2);

                    if ( (LA14_5==48) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 48:
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // InternalUmlTextual.g:470:4: (lv_attributes_12_0= ruleAttribute )
            	    {
            	    // InternalUmlTextual.g:470:4: (lv_attributes_12_0= ruleAttribute )
            	    // InternalUmlTextual.g:471:5: lv_attributes_12_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_16);
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
            	    break loop14;
                }
            } while (true);

            // InternalUmlTextual.g:488:3: ( (lv_methods_13_0= ruleMethod ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12||(LA15_0>=24 && LA15_0<=27)||(LA15_0>=52 && LA15_0<=53)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUmlTextual.g:489:4: (lv_methods_13_0= ruleMethod )
            	    {
            	    // InternalUmlTextual.g:489:4: (lv_methods_13_0= ruleMethod )
            	    // InternalUmlTextual.g:490:5: lv_methods_13_0= ruleMethod
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop15;
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
    // InternalUmlTextual.g:515:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalUmlTextual.g:515:50: (iv_ruleInterface= ruleInterface EOF )
            // InternalUmlTextual.g:516:2: iv_ruleInterface= ruleInterface EOF
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
    // InternalUmlTextual.g:522:1: ruleInterface returns [EObject current=null] : ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stereotype_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_visibility_2_0 = null;

        EObject lv_attributes_8_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:528:2: ( ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) )
            // InternalUmlTextual.g:529:2: ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            {
            // InternalUmlTextual.g:529:2: ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            // InternalUmlTextual.g:530:3: (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'interface' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
            {
            // InternalUmlTextual.g:530:3: (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUmlTextual.g:531:4: otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getCommercialAtKeyword_0_0());
                    			
                    // InternalUmlTextual.g:535:4: ( (lv_stereotype_1_0= RULE_ID ) )
                    // InternalUmlTextual.g:536:5: (lv_stereotype_1_0= RULE_ID )
                    {
                    // InternalUmlTextual.g:536:5: (lv_stereotype_1_0= RULE_ID )
                    // InternalUmlTextual.g:537:6: lv_stereotype_1_0= RULE_ID
                    {
                    lv_stereotype_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

            // InternalUmlTextual.g:554:3: ( (lv_visibility_2_0= ruleVisibility ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12||(LA17_0>=24 && LA17_0<=26)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUmlTextual.g:555:4: (lv_visibility_2_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:555:4: (lv_visibility_2_0= ruleVisibility )
                    // InternalUmlTextual.g:556:5: lv_visibility_2_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getInterfaceAccess().getVisibilityVisibilityParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_19);
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

            otherlv_3=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getInterfaceAccess().getInterfaceKeyword_2());
            		
            // InternalUmlTextual.g:577:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalUmlTextual.g:578:4: (lv_name_4_0= RULE_ID )
            {
            // InternalUmlTextual.g:578:4: (lv_name_4_0= RULE_ID )
            // InternalUmlTextual.g:579:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalUmlTextual.g:595:3: (otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUmlTextual.g:596:4: otherlv_5= 'extends' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getInterfaceAccess().getExtendsKeyword_4_0());
                    			
                    // InternalUmlTextual.g:600:4: ( (otherlv_6= RULE_ID ) )
                    // InternalUmlTextual.g:601:5: (otherlv_6= RULE_ID )
                    {
                    // InternalUmlTextual.g:601:5: (otherlv_6= RULE_ID )
                    // InternalUmlTextual.g:602:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInterfaceRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getParentInterfaceInterfaceCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalUmlTextual.g:618:3: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12||(LA19_0>=24 && LA19_0<=26)||LA19_0==48) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUmlTextual.g:619:4: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // InternalUmlTextual.g:619:4: (lv_attributes_8_0= ruleAttribute )
            	    // InternalUmlTextual.g:620:5: lv_attributes_8_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getInterfaceAccess().getAttributesAttributeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_21);
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
            	    break loop19;
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
    // InternalUmlTextual.g:645:1: entryRuleVisibility returns [String current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final String entryRuleVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVisibility = null;


        try {
            // InternalUmlTextual.g:645:50: (iv_ruleVisibility= ruleVisibility EOF )
            // InternalUmlTextual.g:646:2: iv_ruleVisibility= ruleVisibility EOF
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
    // InternalUmlTextual.g:652:1: ruleVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'package' ) ;
    public final AntlrDatatypeRuleToken ruleVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:658:2: ( (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'package' ) )
            // InternalUmlTextual.g:659:2: (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'package' )
            {
            // InternalUmlTextual.g:659:2: (kw= 'public' | kw= 'private' | kw= 'protected' | kw= 'package' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt20=1;
                }
                break;
            case 25:
                {
                alt20=2;
                }
                break;
            case 26:
                {
                alt20=3;
                }
                break;
            case 12:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalUmlTextual.g:660:3: kw= 'public'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityAccess().getPublicKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:666:3: kw= 'private'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityAccess().getPrivateKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:672:3: kw= 'protected'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityAccess().getProtectedKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:678:3: kw= 'package'
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
    // InternalUmlTextual.g:687:1: entryRuleAbstract returns [String current=null] : iv_ruleAbstract= ruleAbstract EOF ;
    public final String entryRuleAbstract() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAbstract = null;


        try {
            // InternalUmlTextual.g:687:48: (iv_ruleAbstract= ruleAbstract EOF )
            // InternalUmlTextual.g:688:2: iv_ruleAbstract= ruleAbstract EOF
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
    // InternalUmlTextual.g:694:1: ruleAbstract returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'abstract' ;
    public final AntlrDatatypeRuleToken ruleAbstract() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:700:2: (kw= 'abstract' )
            // InternalUmlTextual.g:701:2: kw= 'abstract'
            {
            kw=(Token)match(input,27,FOLLOW_2); 

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
    // InternalUmlTextual.g:709:1: entryRuleActive returns [String current=null] : iv_ruleActive= ruleActive EOF ;
    public final String entryRuleActive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActive = null;


        try {
            // InternalUmlTextual.g:709:46: (iv_ruleActive= ruleActive EOF )
            // InternalUmlTextual.g:710:2: iv_ruleActive= ruleActive EOF
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
    // InternalUmlTextual.g:716:1: ruleActive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'active' ;
    public final AntlrDatatypeRuleToken ruleActive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:722:2: (kw= 'active' )
            // InternalUmlTextual.g:723:2: kw= 'active'
            {
            kw=(Token)match(input,28,FOLLOW_2); 

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
    // InternalUmlTextual.g:731:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalUmlTextual.g:731:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalUmlTextual.g:732:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalUmlTextual.g:738:1: ruleAttributeType returns [EObject current=null] : ( ( (lv_name_0_0= 'string' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'double' ) ) | ( (lv_name_3_0= 'boolean' ) ) | ( (lv_name_4_0= 'byte' ) ) | ( (lv_name_5_0= 'char' ) ) | ( (lv_name_6_0= 'float' ) ) | ( (lv_name_7_0= 'short' ) ) | ( (lv_name_8_0= 'long' ) ) | ( (otherlv_9= RULE_ID ) ) ) ;
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
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:744:2: ( ( ( (lv_name_0_0= 'string' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'double' ) ) | ( (lv_name_3_0= 'boolean' ) ) | ( (lv_name_4_0= 'byte' ) ) | ( (lv_name_5_0= 'char' ) ) | ( (lv_name_6_0= 'float' ) ) | ( (lv_name_7_0= 'short' ) ) | ( (lv_name_8_0= 'long' ) ) | ( (otherlv_9= RULE_ID ) ) ) )
            // InternalUmlTextual.g:745:2: ( ( (lv_name_0_0= 'string' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'double' ) ) | ( (lv_name_3_0= 'boolean' ) ) | ( (lv_name_4_0= 'byte' ) ) | ( (lv_name_5_0= 'char' ) ) | ( (lv_name_6_0= 'float' ) ) | ( (lv_name_7_0= 'short' ) ) | ( (lv_name_8_0= 'long' ) ) | ( (otherlv_9= RULE_ID ) ) )
            {
            // InternalUmlTextual.g:745:2: ( ( (lv_name_0_0= 'string' ) ) | ( (lv_name_1_0= 'int' ) ) | ( (lv_name_2_0= 'double' ) ) | ( (lv_name_3_0= 'boolean' ) ) | ( (lv_name_4_0= 'byte' ) ) | ( (lv_name_5_0= 'char' ) ) | ( (lv_name_6_0= 'float' ) ) | ( (lv_name_7_0= 'short' ) ) | ( (lv_name_8_0= 'long' ) ) | ( (otherlv_9= RULE_ID ) ) )
            int alt21=10;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt21=1;
                }
                break;
            case 30:
                {
                alt21=2;
                }
                break;
            case 31:
                {
                alt21=3;
                }
                break;
            case 32:
                {
                alt21=4;
                }
                break;
            case 33:
                {
                alt21=5;
                }
                break;
            case 34:
                {
                alt21=6;
                }
                break;
            case 35:
                {
                alt21=7;
                }
                break;
            case 36:
                {
                alt21=8;
                }
                break;
            case 37:
                {
                alt21=9;
                }
                break;
            case RULE_ID:
                {
                alt21=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalUmlTextual.g:746:3: ( (lv_name_0_0= 'string' ) )
                    {
                    // InternalUmlTextual.g:746:3: ( (lv_name_0_0= 'string' ) )
                    // InternalUmlTextual.g:747:4: (lv_name_0_0= 'string' )
                    {
                    // InternalUmlTextual.g:747:4: (lv_name_0_0= 'string' )
                    // InternalUmlTextual.g:748:5: lv_name_0_0= 'string'
                    {
                    lv_name_0_0=(Token)match(input,29,FOLLOW_2); 

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
                    // InternalUmlTextual.g:761:3: ( (lv_name_1_0= 'int' ) )
                    {
                    // InternalUmlTextual.g:761:3: ( (lv_name_1_0= 'int' ) )
                    // InternalUmlTextual.g:762:4: (lv_name_1_0= 'int' )
                    {
                    // InternalUmlTextual.g:762:4: (lv_name_1_0= 'int' )
                    // InternalUmlTextual.g:763:5: lv_name_1_0= 'int'
                    {
                    lv_name_1_0=(Token)match(input,30,FOLLOW_2); 

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
                    // InternalUmlTextual.g:776:3: ( (lv_name_2_0= 'double' ) )
                    {
                    // InternalUmlTextual.g:776:3: ( (lv_name_2_0= 'double' ) )
                    // InternalUmlTextual.g:777:4: (lv_name_2_0= 'double' )
                    {
                    // InternalUmlTextual.g:777:4: (lv_name_2_0= 'double' )
                    // InternalUmlTextual.g:778:5: lv_name_2_0= 'double'
                    {
                    lv_name_2_0=(Token)match(input,31,FOLLOW_2); 

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
                    // InternalUmlTextual.g:791:3: ( (lv_name_3_0= 'boolean' ) )
                    {
                    // InternalUmlTextual.g:791:3: ( (lv_name_3_0= 'boolean' ) )
                    // InternalUmlTextual.g:792:4: (lv_name_3_0= 'boolean' )
                    {
                    // InternalUmlTextual.g:792:4: (lv_name_3_0= 'boolean' )
                    // InternalUmlTextual.g:793:5: lv_name_3_0= 'boolean'
                    {
                    lv_name_3_0=(Token)match(input,32,FOLLOW_2); 

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
                    // InternalUmlTextual.g:806:3: ( (lv_name_4_0= 'byte' ) )
                    {
                    // InternalUmlTextual.g:806:3: ( (lv_name_4_0= 'byte' ) )
                    // InternalUmlTextual.g:807:4: (lv_name_4_0= 'byte' )
                    {
                    // InternalUmlTextual.g:807:4: (lv_name_4_0= 'byte' )
                    // InternalUmlTextual.g:808:5: lv_name_4_0= 'byte'
                    {
                    lv_name_4_0=(Token)match(input,33,FOLLOW_2); 

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
                    // InternalUmlTextual.g:821:3: ( (lv_name_5_0= 'char' ) )
                    {
                    // InternalUmlTextual.g:821:3: ( (lv_name_5_0= 'char' ) )
                    // InternalUmlTextual.g:822:4: (lv_name_5_0= 'char' )
                    {
                    // InternalUmlTextual.g:822:4: (lv_name_5_0= 'char' )
                    // InternalUmlTextual.g:823:5: lv_name_5_0= 'char'
                    {
                    lv_name_5_0=(Token)match(input,34,FOLLOW_2); 

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
                    // InternalUmlTextual.g:836:3: ( (lv_name_6_0= 'float' ) )
                    {
                    // InternalUmlTextual.g:836:3: ( (lv_name_6_0= 'float' ) )
                    // InternalUmlTextual.g:837:4: (lv_name_6_0= 'float' )
                    {
                    // InternalUmlTextual.g:837:4: (lv_name_6_0= 'float' )
                    // InternalUmlTextual.g:838:5: lv_name_6_0= 'float'
                    {
                    lv_name_6_0=(Token)match(input,35,FOLLOW_2); 

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
                    // InternalUmlTextual.g:851:3: ( (lv_name_7_0= 'short' ) )
                    {
                    // InternalUmlTextual.g:851:3: ( (lv_name_7_0= 'short' ) )
                    // InternalUmlTextual.g:852:4: (lv_name_7_0= 'short' )
                    {
                    // InternalUmlTextual.g:852:4: (lv_name_7_0= 'short' )
                    // InternalUmlTextual.g:853:5: lv_name_7_0= 'short'
                    {
                    lv_name_7_0=(Token)match(input,36,FOLLOW_2); 

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
                    // InternalUmlTextual.g:866:3: ( (lv_name_8_0= 'long' ) )
                    {
                    // InternalUmlTextual.g:866:3: ( (lv_name_8_0= 'long' ) )
                    // InternalUmlTextual.g:867:4: (lv_name_8_0= 'long' )
                    {
                    // InternalUmlTextual.g:867:4: (lv_name_8_0= 'long' )
                    // InternalUmlTextual.g:868:5: lv_name_8_0= 'long'
                    {
                    lv_name_8_0=(Token)match(input,37,FOLLOW_2); 

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
                    // InternalUmlTextual.g:881:3: ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalUmlTextual.g:881:3: ( (otherlv_9= RULE_ID ) )
                    // InternalUmlTextual.g:882:4: (otherlv_9= RULE_ID )
                    {
                    // InternalUmlTextual.g:882:4: (otherlv_9= RULE_ID )
                    // InternalUmlTextual.g:883:5: otherlv_9= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeTypeRule());
                    					}
                    				
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getAttributeTypeAccess().getDomainTypeDomainSpecificTypeCrossReference_9_0());
                    				

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
    // InternalUmlTextual.g:898:1: entryRuleDomainSpecificType returns [EObject current=null] : iv_ruleDomainSpecificType= ruleDomainSpecificType EOF ;
    public final EObject entryRuleDomainSpecificType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpecificType = null;


        try {
            // InternalUmlTextual.g:898:59: (iv_ruleDomainSpecificType= ruleDomainSpecificType EOF )
            // InternalUmlTextual.g:899:2: iv_ruleDomainSpecificType= ruleDomainSpecificType EOF
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
    // InternalUmlTextual.g:905:1: ruleDomainSpecificType returns [EObject current=null] : (otherlv_0= 'domaintype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleDomainSpecificType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_description_3_0=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:911:2: ( (otherlv_0= 'domaintype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= RULE_STRING ) ) ) )
            // InternalUmlTextual.g:912:2: (otherlv_0= 'domaintype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= RULE_STRING ) ) )
            {
            // InternalUmlTextual.g:912:2: (otherlv_0= 'domaintype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= RULE_STRING ) ) )
            // InternalUmlTextual.g:913:3: otherlv_0= 'domaintype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_description_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainSpecificTypeAccess().getDomaintypeKeyword_0());
            		
            // InternalUmlTextual.g:917:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUmlTextual.g:918:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUmlTextual.g:918:4: (lv_name_1_0= RULE_ID )
            // InternalUmlTextual.g:919:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            otherlv_2=(Token)match(input,39,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainSpecificTypeAccess().getEqualsSignKeyword_2());
            		
            // InternalUmlTextual.g:939:3: ( (lv_description_3_0= RULE_STRING ) )
            // InternalUmlTextual.g:940:4: (lv_description_3_0= RULE_STRING )
            {
            // InternalUmlTextual.g:940:4: (lv_description_3_0= RULE_STRING )
            // InternalUmlTextual.g:941:5: lv_description_3_0= RULE_STRING
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
    // InternalUmlTextual.g:961:1: entryRuleMultiplicity returns [String current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final String entryRuleMultiplicity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicity = null;


        try {
            // InternalUmlTextual.g:961:52: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalUmlTextual.g:962:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalUmlTextual.g:968:1: ruleMultiplicity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' | (kw= '0..' this_INT_6= RULE_INT ) | (kw= '1..' this_INT_8= RULE_INT ) | this_INT_9= RULE_INT | (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT ) ) ;
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
            // InternalUmlTextual.g:974:2: ( (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' | (kw= '0..' this_INT_6= RULE_INT ) | (kw= '1..' this_INT_8= RULE_INT ) | this_INT_9= RULE_INT | (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT ) ) )
            // InternalUmlTextual.g:975:2: (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' | (kw= '0..' this_INT_6= RULE_INT ) | (kw= '1..' this_INT_8= RULE_INT ) | this_INT_9= RULE_INT | (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT ) )
            {
            // InternalUmlTextual.g:975:2: (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' | (kw= '0..' this_INT_6= RULE_INT ) | (kw= '1..' this_INT_8= RULE_INT ) | this_INT_9= RULE_INT | (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT ) )
            int alt22=9;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalUmlTextual.g:976:3: kw= '1'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitOneKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:982:3: kw= '0..1'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:988:3: kw= '0..*'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:994:3: kw= '*'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalUmlTextual.g:1000:3: kw= '1..*'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopAsteriskKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalUmlTextual.g:1006:3: (kw= '0..' this_INT_6= RULE_INT )
                    {
                    // InternalUmlTextual.g:1006:3: (kw= '0..' this_INT_6= RULE_INT )
                    // InternalUmlTextual.g:1007:4: kw= '0..' this_INT_6= RULE_INT
                    {
                    kw=(Token)match(input,45,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopKeyword_5_0());
                    			
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_6);
                    			

                    				newLeafNode(this_INT_6, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalUmlTextual.g:1021:3: (kw= '1..' this_INT_8= RULE_INT )
                    {
                    // InternalUmlTextual.g:1021:3: (kw= '1..' this_INT_8= RULE_INT )
                    // InternalUmlTextual.g:1022:4: kw= '1..' this_INT_8= RULE_INT
                    {
                    kw=(Token)match(input,46,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopKeyword_6_0());
                    			
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_8);
                    			

                    				newLeafNode(this_INT_8, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_6_1());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalUmlTextual.g:1036:3: this_INT_9= RULE_INT
                    {
                    this_INT_9=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_9);
                    		

                    			newLeafNode(this_INT_9, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalUmlTextual.g:1044:3: (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT )
                    {
                    // InternalUmlTextual.g:1044:3: (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT )
                    // InternalUmlTextual.g:1045:4: this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT
                    {
                    this_INT_10=(Token)match(input,RULE_INT,FOLLOW_25); 

                    				current.merge(this_INT_10);
                    			

                    				newLeafNode(this_INT_10, grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_8_0());
                    			
                    kw=(Token)match(input,47,FOLLOW_24); 

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
    // InternalUmlTextual.g:1069:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUmlTextual.g:1069:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUmlTextual.g:1070:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalUmlTextual.g:1076:1: ruleAttribute returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? ) ;
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
            // InternalUmlTextual.g:1082:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? ) )
            // InternalUmlTextual.g:1083:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? )
            {
            // InternalUmlTextual.g:1083:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? )
            // InternalUmlTextual.g:1084:3: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )?
            {
            // InternalUmlTextual.g:1084:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==12||(LA23_0>=24 && LA23_0<=26)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUmlTextual.g:1085:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:1085:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalUmlTextual.g:1086:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_26);
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

            otherlv_1=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttrKeyword_1());
            		
            // InternalUmlTextual.g:1107:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlTextual.g:1108:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlTextual.g:1108:4: (lv_name_2_0= RULE_ID )
            // InternalUmlTextual.g:1109:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_3=(Token)match(input,49,FOLLOW_28); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalUmlTextual.g:1129:3: ( (lv_type_4_0= ruleAttributeType ) )
            // InternalUmlTextual.g:1130:4: (lv_type_4_0= ruleAttributeType )
            {
            // InternalUmlTextual.g:1130:4: (lv_type_4_0= ruleAttributeType )
            // InternalUmlTextual.g:1131:5: lv_type_4_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalUmlTextual.g:1148:3: (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUmlTextual.g:1149:4: otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,50,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUmlTextual.g:1153:4: ( (lv_multiplicity_6_0= ruleMultiplicity ) )
                    // InternalUmlTextual.g:1154:5: (lv_multiplicity_6_0= ruleMultiplicity )
                    {
                    // InternalUmlTextual.g:1154:5: (lv_multiplicity_6_0= ruleMultiplicity )
                    // InternalUmlTextual.g:1155:6: lv_multiplicity_6_0= ruleMultiplicity
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

                    otherlv_7=(Token)match(input,51,FOLLOW_2); 

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
    // InternalUmlTextual.g:1181:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalUmlTextual.g:1181:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalUmlTextual.g:1182:2: iv_ruleMethod= ruleMethod EOF
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
    // InternalUmlTextual.g:1188:1: ruleMethod returns [EObject current=null] : ( (otherlv_0= 'abstract' )? (otherlv_1= 'static' )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'function' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) )? (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')' otherlv_10= '->' ( (lv_returnType_11_0= ruleAttributeType ) ) ) ;
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
            // InternalUmlTextual.g:1194:2: ( ( (otherlv_0= 'abstract' )? (otherlv_1= 'static' )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'function' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) )? (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')' otherlv_10= '->' ( (lv_returnType_11_0= ruleAttributeType ) ) ) )
            // InternalUmlTextual.g:1195:2: ( (otherlv_0= 'abstract' )? (otherlv_1= 'static' )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'function' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) )? (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')' otherlv_10= '->' ( (lv_returnType_11_0= ruleAttributeType ) ) )
            {
            // InternalUmlTextual.g:1195:2: ( (otherlv_0= 'abstract' )? (otherlv_1= 'static' )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'function' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) )? (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')' otherlv_10= '->' ( (lv_returnType_11_0= ruleAttributeType ) ) )
            // InternalUmlTextual.g:1196:3: (otherlv_0= 'abstract' )? (otherlv_1= 'static' )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'function' ( (lv_name_4_0= RULE_ID ) ) otherlv_5= '(' ( (lv_parameters_6_0= ruleParameter ) )? (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= ')' otherlv_10= '->' ( (lv_returnType_11_0= ruleAttributeType ) )
            {
            // InternalUmlTextual.g:1196:3: (otherlv_0= 'abstract' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUmlTextual.g:1197:4: otherlv_0= 'abstract'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_32); 

                    				newLeafNode(otherlv_0, grammarAccess.getMethodAccess().getAbstractKeyword_0());
                    			

                    }
                    break;

            }

            // InternalUmlTextual.g:1202:3: (otherlv_1= 'static' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==52) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUmlTextual.g:1203:4: otherlv_1= 'static'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getMethodAccess().getStaticKeyword_1());
                    			

                    }
                    break;

            }

            // InternalUmlTextual.g:1208:3: ( (lv_visibility_2_0= ruleVisibility ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12||(LA27_0>=24 && LA27_0<=26)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUmlTextual.g:1209:4: (lv_visibility_2_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:1209:4: (lv_visibility_2_0= ruleVisibility )
                    // InternalUmlTextual.g:1210:5: lv_visibility_2_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getVisibilityVisibilityParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_34);
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

            otherlv_3=(Token)match(input,53,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMethodAccess().getFunctionKeyword_3());
            		
            // InternalUmlTextual.g:1231:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalUmlTextual.g:1232:4: (lv_name_4_0= RULE_ID )
            {
            // InternalUmlTextual.g:1232:4: (lv_name_4_0= RULE_ID )
            // InternalUmlTextual.g:1233:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_35); 

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

            otherlv_5=(Token)match(input,54,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5());
            		
            // InternalUmlTextual.g:1253:3: ( (lv_parameters_6_0= ruleParameter ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUmlTextual.g:1254:4: (lv_parameters_6_0= ruleParameter )
                    {
                    // InternalUmlTextual.g:1254:4: (lv_parameters_6_0= ruleParameter )
                    // InternalUmlTextual.g:1255:5: lv_parameters_6_0= ruleParameter
                    {

                    					newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_37);
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
                    break;

            }

            // InternalUmlTextual.g:1272:3: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==22) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUmlTextual.g:1273:4: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalUmlTextual.g:1277:4: ( (lv_parameters_8_0= ruleParameter ) )
            	    // InternalUmlTextual.g:1278:5: (lv_parameters_8_0= ruleParameter )
            	    {
            	    // InternalUmlTextual.g:1278:5: (lv_parameters_8_0= ruleParameter )
            	    // InternalUmlTextual.g:1279:6: lv_parameters_8_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
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

            otherlv_9=(Token)match(input,55,FOLLOW_38); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,56,FOLLOW_28); 

            			newLeafNode(otherlv_10, grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_9());
            		
            // InternalUmlTextual.g:1305:3: ( (lv_returnType_11_0= ruleAttributeType ) )
            // InternalUmlTextual.g:1306:4: (lv_returnType_11_0= ruleAttributeType )
            {
            // InternalUmlTextual.g:1306:4: (lv_returnType_11_0= ruleAttributeType )
            // InternalUmlTextual.g:1307:5: lv_returnType_11_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getMethodAccess().getReturnTypeAttributeTypeParserRuleCall_10_0());
            				
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
    // InternalUmlTextual.g:1328:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalUmlTextual.g:1328:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalUmlTextual.g:1329:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalUmlTextual.g:1335:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleAttributeType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_parameterType_2_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1341:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleAttributeType ) ) ) )
            // InternalUmlTextual.g:1342:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleAttributeType ) ) )
            {
            // InternalUmlTextual.g:1342:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleAttributeType ) ) )
            // InternalUmlTextual.g:1343:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_parameterType_2_0= ruleAttributeType ) )
            {
            // InternalUmlTextual.g:1343:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalUmlTextual.g:1344:4: (lv_name_0_0= RULE_ID )
            {
            // InternalUmlTextual.g:1344:4: (lv_name_0_0= RULE_ID )
            // InternalUmlTextual.g:1345:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

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

            otherlv_1=(Token)match(input,49,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalUmlTextual.g:1365:3: ( (lv_parameterType_2_0= ruleAttributeType ) )
            // InternalUmlTextual.g:1366:4: (lv_parameterType_2_0= ruleAttributeType )
            {
            // InternalUmlTextual.g:1366:4: (lv_parameterType_2_0= ruleAttributeType )
            // InternalUmlTextual.g:1367:5: lv_parameterType_2_0= ruleAttributeType
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
    // InternalUmlTextual.g:1388:1: entryRuleUnnamed returns [String current=null] : iv_ruleUnnamed= ruleUnnamed EOF ;
    public final String entryRuleUnnamed() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnnamed = null;


        try {
            // InternalUmlTextual.g:1388:47: (iv_ruleUnnamed= ruleUnnamed EOF )
            // InternalUmlTextual.g:1389:2: iv_ruleUnnamed= ruleUnnamed EOF
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
    // InternalUmlTextual.g:1395:1: ruleUnnamed returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'unnamed' ;
    public final AntlrDatatypeRuleToken ruleUnnamed() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:1401:2: (kw= 'unnamed' )
            // InternalUmlTextual.g:1402:2: kw= 'unnamed'
            {
            kw=(Token)match(input,57,FOLLOW_2); 

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
    // InternalUmlTextual.g:1410:1: entryRuleNavigation returns [String current=null] : iv_ruleNavigation= ruleNavigation EOF ;
    public final String entryRuleNavigation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigation = null;


        try {
            // InternalUmlTextual.g:1410:50: (iv_ruleNavigation= ruleNavigation EOF )
            // InternalUmlTextual.g:1411:2: iv_ruleNavigation= ruleNavigation EOF
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
    // InternalUmlTextual.g:1417:1: ruleNavigation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'navigable' ;
    public final AntlrDatatypeRuleToken ruleNavigation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:1423:2: (kw= 'navigable' )
            // InternalUmlTextual.g:1424:2: kw= 'navigable'
            {
            kw=(Token)match(input,58,FOLLOW_2); 

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
    // InternalUmlTextual.g:1432:1: entryRuleAssociationConnector returns [EObject current=null] : iv_ruleAssociationConnector= ruleAssociationConnector EOF ;
    public final EObject entryRuleAssociationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationConnector = null;


        try {
            // InternalUmlTextual.g:1432:61: (iv_ruleAssociationConnector= ruleAssociationConnector EOF )
            // InternalUmlTextual.g:1433:2: iv_ruleAssociationConnector= ruleAssociationConnector EOF
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
    // InternalUmlTextual.g:1439:1: ruleAssociationConnector returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition ) ;
    public final EObject ruleAssociationConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Aggregation_1 = null;

        EObject this_Composition_2 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1445:2: ( (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition ) )
            // InternalUmlTextual.g:1446:2: (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition )
            {
            // InternalUmlTextual.g:1446:2: (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 59:
            case 60:
                {
                alt30=1;
                }
                break;
            case 65:
                {
                alt30=2;
                }
                break;
            case 66:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalUmlTextual.g:1447:3: this_Association_0= ruleAssociation
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
                    // InternalUmlTextual.g:1456:3: this_Aggregation_1= ruleAggregation
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
                    // InternalUmlTextual.g:1465:3: this_Composition_2= ruleComposition
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
    // InternalUmlTextual.g:1477:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUmlTextual.g:1477:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUmlTextual.g:1478:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalUmlTextual.g:1484:1: ruleAssociation returns [EObject current=null] : ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( (otherlv_12= RULE_ID ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' (otherlv_16= 'with' otherlv_17= 'associatedclass' ( (otherlv_18= RULE_ID ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_2 = null;

        AntlrDatatypeRuleToken lv_navigation1_5_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity1_8_0 = null;

        AntlrDatatypeRuleToken lv_navigation2_11_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity2_14_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1490:2: ( ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( (otherlv_12= RULE_ID ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' (otherlv_16= 'with' otherlv_17= 'associatedclass' ( (otherlv_18= RULE_ID ) ) )? otherlv_19= '}' ) )
            // InternalUmlTextual.g:1491:2: ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( (otherlv_12= RULE_ID ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' (otherlv_16= 'with' otherlv_17= 'associatedclass' ( (otherlv_18= RULE_ID ) ) )? otherlv_19= '}' )
            {
            // InternalUmlTextual.g:1491:2: ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( (otherlv_12= RULE_ID ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' (otherlv_16= 'with' otherlv_17= 'associatedclass' ( (otherlv_18= RULE_ID ) ) )? otherlv_19= '}' )
            // InternalUmlTextual.g:1492:3: (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( (otherlv_12= RULE_ID ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' (otherlv_16= 'with' otherlv_17= 'associatedclass' ( (otherlv_18= RULE_ID ) ) )? otherlv_19= '}'
            {
            // InternalUmlTextual.g:1492:3: (otherlv_0= 'undirected' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==59) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUmlTextual.g:1493:4: otherlv_0= 'undirected'
                    {
                    otherlv_0=(Token)match(input,59,FOLLOW_39); 

                    				newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getUndirectedKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,60,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalUmlTextual.g:1502:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) ) )
            // InternalUmlTextual.g:1503:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) )
            {
            // InternalUmlTextual.g:1503:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed ) )
            // InternalUmlTextual.g:1504:5: (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed )
            {
            // InternalUmlTextual.g:1504:5: (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnnamed )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==57) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalUmlTextual.g:1505:6: lv_name_2_1= RULE_ID
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
                    // InternalUmlTextual.g:1520:6: lv_name_2_2= ruleUnnamed
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

            otherlv_3=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,61,FOLLOW_42); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getFromKeyword_4());
            		
            // InternalUmlTextual.g:1546:3: ( (lv_navigation1_5_0= ruleNavigation ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==58) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUmlTextual.g:1547:4: (lv_navigation1_5_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:1547:4: (lv_navigation1_5_0= ruleNavigation )
                    // InternalUmlTextual.g:1548:5: lv_navigation1_5_0= ruleNavigation
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

            // InternalUmlTextual.g:1565:3: ( (otherlv_6= RULE_ID ) )
            // InternalUmlTextual.g:1566:4: (otherlv_6= RULE_ID )
            {
            // InternalUmlTextual.g:1566:4: (otherlv_6= RULE_ID )
            // InternalUmlTextual.g:1567:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getClass1ClassCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,50,FOLLOW_30); 

            			newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalUmlTextual.g:1582:3: ( (lv_multiplicity1_8_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1583:4: (lv_multiplicity1_8_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1583:4: (lv_multiplicity1_8_0= ruleMultiplicity )
            // InternalUmlTextual.g:1584:5: lv_multiplicity1_8_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicity1MultiplicityParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_9=(Token)match(input,51,FOLLOW_44); 

            			newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,62,FOLLOW_42); 

            			newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getToKeyword_10());
            		
            // InternalUmlTextual.g:1609:3: ( (lv_navigation2_11_0= ruleNavigation ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==58) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUmlTextual.g:1610:4: (lv_navigation2_11_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:1610:4: (lv_navigation2_11_0= ruleNavigation )
                    // InternalUmlTextual.g:1611:5: lv_navigation2_11_0= ruleNavigation
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

            // InternalUmlTextual.g:1628:3: ( (otherlv_12= RULE_ID ) )
            // InternalUmlTextual.g:1629:4: (otherlv_12= RULE_ID )
            {
            // InternalUmlTextual.g:1629:4: (otherlv_12= RULE_ID )
            // InternalUmlTextual.g:1630:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_12, grammarAccess.getAssociationAccess().getClass2ClassCrossReference_12_0());
            				

            }


            }

            otherlv_13=(Token)match(input,50,FOLLOW_30); 

            			newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_13());
            		
            // InternalUmlTextual.g:1645:3: ( (lv_multiplicity2_14_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1646:4: (lv_multiplicity2_14_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1646:4: (lv_multiplicity2_14_0= ruleMultiplicity )
            // InternalUmlTextual.g:1647:5: lv_multiplicity2_14_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicity2MultiplicityParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_15=(Token)match(input,51,FOLLOW_45); 

            			newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_15());
            		
            // InternalUmlTextual.g:1668:3: (otherlv_16= 'with' otherlv_17= 'associatedclass' ( (otherlv_18= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==63) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUmlTextual.g:1669:4: otherlv_16= 'with' otherlv_17= 'associatedclass' ( (otherlv_18= RULE_ID ) )
                    {
                    otherlv_16=(Token)match(input,63,FOLLOW_46); 

                    				newLeafNode(otherlv_16, grammarAccess.getAssociationAccess().getWithKeyword_16_0());
                    			
                    otherlv_17=(Token)match(input,64,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getAssociationAccess().getAssociatedclassKeyword_16_1());
                    			
                    // InternalUmlTextual.g:1677:4: ( (otherlv_18= RULE_ID ) )
                    // InternalUmlTextual.g:1678:5: (otherlv_18= RULE_ID )
                    {
                    // InternalUmlTextual.g:1678:5: (otherlv_18= RULE_ID )
                    // InternalUmlTextual.g:1679:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssociationRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_47); 

                    						newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getClassClassCrossReference_16_2_0());
                    					

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
    // InternalUmlTextual.g:1699:1: entryRuleAggregation returns [EObject current=null] : iv_ruleAggregation= ruleAggregation EOF ;
    public final EObject entryRuleAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregation = null;


        try {
            // InternalUmlTextual.g:1699:52: (iv_ruleAggregation= ruleAggregation EOF )
            // InternalUmlTextual.g:1700:2: iv_ruleAggregation= ruleAggregation EOF
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
    // InternalUmlTextual.g:1706:1: ruleAggregation returns [EObject current=null] : (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' ) ;
    public final EObject ruleAggregation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_2 = null;

        AntlrDatatypeRuleToken lv_multiplicity1_6_0 = null;

        AntlrDatatypeRuleToken lv_navigation_9_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity2_12_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1712:2: ( (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' ) )
            // InternalUmlTextual.g:1713:2: (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' )
            {
            // InternalUmlTextual.g:1713:2: (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' )
            // InternalUmlTextual.g:1714:3: otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getAggregationAccess().getAggregationKeyword_0());
            		
            // InternalUmlTextual.g:1718:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) )
            // InternalUmlTextual.g:1719:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) )
            {
            // InternalUmlTextual.g:1719:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) )
            // InternalUmlTextual.g:1720:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed )
            {
            // InternalUmlTextual.g:1720:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==57) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalUmlTextual.g:1721:6: lv_name_1_1= RULE_ID
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
                    // InternalUmlTextual.g:1736:6: lv_name_1_2= ruleUnnamed
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

            otherlv_2=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getAggregationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getAggregationAccess().getFromKeyword_3());
            		
            // InternalUmlTextual.g:1762:3: ( (otherlv_4= RULE_ID ) )
            // InternalUmlTextual.g:1763:4: (otherlv_4= RULE_ID )
            {
            // InternalUmlTextual.g:1763:4: (otherlv_4= RULE_ID )
            // InternalUmlTextual.g:1764:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_4, grammarAccess.getAggregationAccess().getClass1ClassCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalUmlTextual.g:1779:3: ( (lv_multiplicity1_6_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1780:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1780:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            // InternalUmlTextual.g:1781:5: lv_multiplicity1_6_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getMultiplicity1MultiplicityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_7=(Token)match(input,51,FOLLOW_44); 

            			newLeafNode(otherlv_7, grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,62,FOLLOW_42); 

            			newLeafNode(otherlv_8, grammarAccess.getAggregationAccess().getToKeyword_8());
            		
            // InternalUmlTextual.g:1806:3: ( (lv_navigation_9_0= ruleNavigation ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==58) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUmlTextual.g:1807:4: (lv_navigation_9_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:1807:4: (lv_navigation_9_0= ruleNavigation )
                    // InternalUmlTextual.g:1808:5: lv_navigation_9_0= ruleNavigation
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

            // InternalUmlTextual.g:1825:3: ( (otherlv_10= RULE_ID ) )
            // InternalUmlTextual.g:1826:4: (otherlv_10= RULE_ID )
            {
            // InternalUmlTextual.g:1826:4: (otherlv_10= RULE_ID )
            // InternalUmlTextual.g:1827:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_10, grammarAccess.getAggregationAccess().getClass2ClassCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,50,FOLLOW_30); 

            			newLeafNode(otherlv_11, grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalUmlTextual.g:1842:3: ( (lv_multiplicity2_12_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1843:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1843:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            // InternalUmlTextual.g:1844:5: lv_multiplicity2_12_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getMultiplicity2MultiplicityParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_13=(Token)match(input,51,FOLLOW_47); 

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
    // InternalUmlTextual.g:1873:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalUmlTextual.g:1873:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalUmlTextual.g:1874:2: iv_ruleComposition= ruleComposition EOF
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
    // InternalUmlTextual.g:1880:1: ruleComposition returns [EObject current=null] : (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_2 = null;

        AntlrDatatypeRuleToken lv_multiplicity1_6_0 = null;

        AntlrDatatypeRuleToken lv_navigation_9_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity2_12_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1886:2: ( (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' ) )
            // InternalUmlTextual.g:1887:2: (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' )
            {
            // InternalUmlTextual.g:1887:2: (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}' )
            // InternalUmlTextual.g:1888:3: otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= ']' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositionAccess().getCompositionKeyword_0());
            		
            // InternalUmlTextual.g:1892:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) ) )
            // InternalUmlTextual.g:1893:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) )
            {
            // InternalUmlTextual.g:1893:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed ) )
            // InternalUmlTextual.g:1894:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed )
            {
            // InternalUmlTextual.g:1894:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnnamed )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==57) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalUmlTextual.g:1895:6: lv_name_1_1= RULE_ID
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
                    // InternalUmlTextual.g:1910:6: lv_name_1_2= ruleUnnamed
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

            otherlv_2=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,61,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getFromKeyword_3());
            		
            // InternalUmlTextual.g:1936:3: ( (otherlv_4= RULE_ID ) )
            // InternalUmlTextual.g:1937:4: (otherlv_4= RULE_ID )
            {
            // InternalUmlTextual.g:1937:4: (otherlv_4= RULE_ID )
            // InternalUmlTextual.g:1938:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_4, grammarAccess.getCompositionAccess().getClass1ClassCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,50,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalUmlTextual.g:1953:3: ( (lv_multiplicity1_6_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1954:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1954:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            // InternalUmlTextual.g:1955:5: lv_multiplicity1_6_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getMultiplicity1MultiplicityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_7=(Token)match(input,51,FOLLOW_44); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,62,FOLLOW_42); 

            			newLeafNode(otherlv_8, grammarAccess.getCompositionAccess().getToKeyword_8());
            		
            // InternalUmlTextual.g:1980:3: ( (lv_navigation_9_0= ruleNavigation ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==58) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUmlTextual.g:1981:4: (lv_navigation_9_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:1981:4: (lv_navigation_9_0= ruleNavigation )
                    // InternalUmlTextual.g:1982:5: lv_navigation_9_0= ruleNavigation
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

            // InternalUmlTextual.g:1999:3: ( (otherlv_10= RULE_ID ) )
            // InternalUmlTextual.g:2000:4: (otherlv_10= RULE_ID )
            {
            // InternalUmlTextual.g:2000:4: (otherlv_10= RULE_ID )
            // InternalUmlTextual.g:2001:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_43); 

            					newLeafNode(otherlv_10, grammarAccess.getCompositionAccess().getClass2ClassCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,50,FOLLOW_30); 

            			newLeafNode(otherlv_11, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalUmlTextual.g:2016:3: ( (lv_multiplicity2_12_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:2017:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:2017:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            // InternalUmlTextual.g:2018:5: lv_multiplicity2_12_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getMultiplicity2MultiplicityParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_31);
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

            otherlv_13=(Token)match(input,51,FOLLOW_47); 

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
    // InternalUmlTextual.g:2047:1: entryRuleUseCaseDiagram returns [EObject current=null] : iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF ;
    public final EObject entryRuleUseCaseDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseDiagram = null;


        try {
            // InternalUmlTextual.g:2047:55: (iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF )
            // InternalUmlTextual.g:2048:2: iv_ruleUseCaseDiagram= ruleUseCaseDiagram EOF
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
    // InternalUmlTextual.g:2054:1: ruleUseCaseDiagram returns [EObject current=null] : (otherlv_0= 'usecase' otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUseCaseElement ) )* otherlv_5= '}' ) ;
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
            // InternalUmlTextual.g:2060:2: ( (otherlv_0= 'usecase' otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUseCaseElement ) )* otherlv_5= '}' ) )
            // InternalUmlTextual.g:2061:2: (otherlv_0= 'usecase' otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUseCaseElement ) )* otherlv_5= '}' )
            {
            // InternalUmlTextual.g:2061:2: (otherlv_0= 'usecase' otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUseCaseElement ) )* otherlv_5= '}' )
            // InternalUmlTextual.g:2062:3: otherlv_0= 'usecase' otherlv_1= 'diagram' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_elements_4_0= ruleUseCaseElement ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseDiagramAccess().getUsecaseKeyword_0());
            		
            otherlv_1=(Token)match(input,68,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUseCaseDiagramAccess().getDiagramKeyword_1());
            		
            // InternalUmlTextual.g:2070:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlTextual.g:2071:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlTextual.g:2071:4: (lv_name_2_0= RULE_ID )
            // InternalUmlTextual.g:2072:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,16,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getUseCaseDiagramAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUmlTextual.g:2092:3: ( (lv_elements_4_0= ruleUseCaseElement ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==12||(LA40_0>=24 && LA40_0<=28)||LA40_0==67||(LA40_0>=69 && LA40_0<=70)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalUmlTextual.g:2093:4: (lv_elements_4_0= ruleUseCaseElement )
            	    {
            	    // InternalUmlTextual.g:2093:4: (lv_elements_4_0= ruleUseCaseElement )
            	    // InternalUmlTextual.g:2094:5: lv_elements_4_0= ruleUseCaseElement
            	    {

            	    					newCompositeNode(grammarAccess.getUseCaseDiagramAccess().getElementsUseCaseElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_49);
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
            	    break loop40;
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
    // InternalUmlTextual.g:2119:1: entryRuleUseCaseElement returns [EObject current=null] : iv_ruleUseCaseElement= ruleUseCaseElement EOF ;
    public final EObject entryRuleUseCaseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseElement = null;


        try {
            // InternalUmlTextual.g:2119:55: (iv_ruleUseCaseElement= ruleUseCaseElement EOF )
            // InternalUmlTextual.g:2120:2: iv_ruleUseCaseElement= ruleUseCaseElement EOF
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
    // InternalUmlTextual.g:2126:1: ruleUseCaseElement returns [EObject current=null] : (this_Actor_0= ruleActor | this_UseCase_1= ruleUseCase ) ;
    public final EObject ruleUseCaseElement() throws RecognitionException {
        EObject current = null;

        EObject this_Actor_0 = null;

        EObject this_UseCase_1 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:2132:2: ( (this_Actor_0= ruleActor | this_UseCase_1= ruleUseCase ) )
            // InternalUmlTextual.g:2133:2: (this_Actor_0= ruleActor | this_UseCase_1= ruleUseCase )
            {
            // InternalUmlTextual.g:2133:2: (this_Actor_0= ruleActor | this_UseCase_1= ruleUseCase )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==12||(LA41_0>=24 && LA41_0<=28)||(LA41_0>=69 && LA41_0<=70)) ) {
                alt41=1;
            }
            else if ( (LA41_0==67) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalUmlTextual.g:2134:3: this_Actor_0= ruleActor
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
                    // InternalUmlTextual.g:2143:3: this_UseCase_1= ruleUseCase
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
    // InternalUmlTextual.g:2155:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalUmlTextual.g:2155:46: (iv_ruleActor= ruleActor EOF )
            // InternalUmlTextual.g:2156:2: iv_ruleActor= ruleActor EOF
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
    // InternalUmlTextual.g:2162:1: ruleActor returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= ruleAbstract ) )? ( (lv_active_2_0= ruleActive ) )? ( (lv_business_3_0= 'business' ) )? otherlv_4= 'actor' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( (lv_parentActor_7_0= ruleActor ) ) )? otherlv_8= '{' (otherlv_9= 'uses' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )* otherlv_13= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token lv_business_3_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_abstract_1_0 = null;

        AntlrDatatypeRuleToken lv_active_2_0 = null;

        EObject lv_parentActor_7_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:2168:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= ruleAbstract ) )? ( (lv_active_2_0= ruleActive ) )? ( (lv_business_3_0= 'business' ) )? otherlv_4= 'actor' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( (lv_parentActor_7_0= ruleActor ) ) )? otherlv_8= '{' (otherlv_9= 'uses' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )* otherlv_13= '}' ) )
            // InternalUmlTextual.g:2169:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= ruleAbstract ) )? ( (lv_active_2_0= ruleActive ) )? ( (lv_business_3_0= 'business' ) )? otherlv_4= 'actor' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( (lv_parentActor_7_0= ruleActor ) ) )? otherlv_8= '{' (otherlv_9= 'uses' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )* otherlv_13= '}' )
            {
            // InternalUmlTextual.g:2169:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= ruleAbstract ) )? ( (lv_active_2_0= ruleActive ) )? ( (lv_business_3_0= 'business' ) )? otherlv_4= 'actor' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( (lv_parentActor_7_0= ruleActor ) ) )? otherlv_8= '{' (otherlv_9= 'uses' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )* otherlv_13= '}' )
            // InternalUmlTextual.g:2170:3: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_abstract_1_0= ruleAbstract ) )? ( (lv_active_2_0= ruleActive ) )? ( (lv_business_3_0= 'business' ) )? otherlv_4= 'actor' ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= 'extends' ( (lv_parentActor_7_0= ruleActor ) ) )? otherlv_8= '{' (otherlv_9= 'uses' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )* otherlv_13= '}'
            {
            // InternalUmlTextual.g:2170:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==12||(LA42_0>=24 && LA42_0<=26)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUmlTextual.g:2171:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:2171:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalUmlTextual.g:2172:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getVisibilityVisibilityParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_50);
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

            // InternalUmlTextual.g:2189:3: ( (lv_abstract_1_0= ruleAbstract ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==27) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUmlTextual.g:2190:4: (lv_abstract_1_0= ruleAbstract )
                    {
                    // InternalUmlTextual.g:2190:4: (lv_abstract_1_0= ruleAbstract )
                    // InternalUmlTextual.g:2191:5: lv_abstract_1_0= ruleAbstract
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getAbstractAbstractParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_51);
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

            // InternalUmlTextual.g:2208:3: ( (lv_active_2_0= ruleActive ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUmlTextual.g:2209:4: (lv_active_2_0= ruleActive )
                    {
                    // InternalUmlTextual.g:2209:4: (lv_active_2_0= ruleActive )
                    // InternalUmlTextual.g:2210:5: lv_active_2_0= ruleActive
                    {

                    					newCompositeNode(grammarAccess.getActorAccess().getActiveActiveParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_52);
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

            // InternalUmlTextual.g:2227:3: ( (lv_business_3_0= 'business' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==69) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUmlTextual.g:2228:4: (lv_business_3_0= 'business' )
                    {
                    // InternalUmlTextual.g:2228:4: (lv_business_3_0= 'business' )
                    // InternalUmlTextual.g:2229:5: lv_business_3_0= 'business'
                    {
                    lv_business_3_0=(Token)match(input,69,FOLLOW_53); 

                    					newLeafNode(lv_business_3_0, grammarAccess.getActorAccess().getBusinessBusinessKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActorRule());
                    					}
                    					setWithLastConsumed(current, "business", lv_business_3_0, "business");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,70,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getActorAccess().getActorKeyword_4());
            		
            // InternalUmlTextual.g:2245:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalUmlTextual.g:2246:4: (lv_name_5_0= RULE_ID )
            {
            // InternalUmlTextual.g:2246:4: (lv_name_5_0= RULE_ID )
            // InternalUmlTextual.g:2247:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_20); 

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

            // InternalUmlTextual.g:2263:3: (otherlv_6= 'extends' ( (lv_parentActor_7_0= ruleActor ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==20) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUmlTextual.g:2264:4: otherlv_6= 'extends' ( (lv_parentActor_7_0= ruleActor ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_54); 

                    				newLeafNode(otherlv_6, grammarAccess.getActorAccess().getExtendsKeyword_6_0());
                    			
                    // InternalUmlTextual.g:2268:4: ( (lv_parentActor_7_0= ruleActor ) )
                    // InternalUmlTextual.g:2269:5: (lv_parentActor_7_0= ruleActor )
                    {
                    // InternalUmlTextual.g:2269:5: (lv_parentActor_7_0= ruleActor )
                    // InternalUmlTextual.g:2270:6: lv_parentActor_7_0= ruleActor
                    {

                    						newCompositeNode(grammarAccess.getActorAccess().getParentActorActorParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parentActor_7_0=ruleActor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActorRule());
                    						}
                    						set(
                    							current,
                    							"parentActor",
                    							lv_parentActor_7_0,
                    							"br.ufes.mdd.umltextual.UmlTextual.Actor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_55); 

            			newLeafNode(otherlv_8, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalUmlTextual.g:2292:3: (otherlv_9= 'uses' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==71) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUmlTextual.g:2293:4: otherlv_9= 'uses' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            	    {
            	    otherlv_9=(Token)match(input,71,FOLLOW_5); 

            	    				newLeafNode(otherlv_9, grammarAccess.getActorAccess().getUsesKeyword_8_0());
            	    			
            	    // InternalUmlTextual.g:2297:4: ( (otherlv_10= RULE_ID ) )
            	    // InternalUmlTextual.g:2298:5: (otherlv_10= RULE_ID )
            	    {
            	    // InternalUmlTextual.g:2298:5: (otherlv_10= RULE_ID )
            	    // InternalUmlTextual.g:2299:6: otherlv_10= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getActorRule());
            	    						}
            	    					
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_56); 

            	    						newLeafNode(otherlv_10, grammarAccess.getActorAccess().getUseCasesUseCaseCrossReference_8_1_0());
            	    					

            	    }


            	    }

            	    // InternalUmlTextual.g:2310:4: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==22) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // InternalUmlTextual.g:2311:5: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    	    {
            	    	    otherlv_11=(Token)match(input,22,FOLLOW_5); 

            	    	    					newLeafNode(otherlv_11, grammarAccess.getActorAccess().getCommaKeyword_8_2_0());
            	    	    				
            	    	    // InternalUmlTextual.g:2315:5: ( (otherlv_12= RULE_ID ) )
            	    	    // InternalUmlTextual.g:2316:6: (otherlv_12= RULE_ID )
            	    	    {
            	    	    // InternalUmlTextual.g:2316:6: (otherlv_12= RULE_ID )
            	    	    // InternalUmlTextual.g:2317:7: otherlv_12= RULE_ID
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getActorRule());
            	    	    							}
            	    	    						
            	    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_56); 

            	    	    							newLeafNode(otherlv_12, grammarAccess.getActorAccess().getUseCasesUseCaseCrossReference_8_2_1_0());
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalUmlTextual.g:2338:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUmlTextual.g:2338:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUmlTextual.g:2339:2: iv_ruleUseCase= ruleUseCase EOF
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
    // InternalUmlTextual.g:2345:1: ruleUseCase returns [EObject current=null] : (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= '{' ( (otherlv_9= 'includes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'extends' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= 'includes' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* ) ) otherlv_25= '}' )? ) ;
    public final EObject ruleUseCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:2351:2: ( (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= '{' ( (otherlv_9= 'includes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'extends' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= 'includes' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* ) ) otherlv_25= '}' )? ) )
            // InternalUmlTextual.g:2352:2: (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= '{' ( (otherlv_9= 'includes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'extends' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= 'includes' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* ) ) otherlv_25= '}' )? )
            {
            // InternalUmlTextual.g:2352:2: (otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= '{' ( (otherlv_9= 'includes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'extends' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= 'includes' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* ) ) otherlv_25= '}' )? )
            // InternalUmlTextual.g:2353:3: otherlv_0= 'usecase' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? otherlv_6= '=' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= '{' ( (otherlv_9= 'includes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'extends' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= 'includes' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* ) ) otherlv_25= '}' )?
            {
            otherlv_0=(Token)match(input,67,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getUseCaseAccess().getUsecaseKeyword_0());
            		
            // InternalUmlTextual.g:2357:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUmlTextual.g:2358:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUmlTextual.g:2358:4: (lv_name_1_0= RULE_ID )
            // InternalUmlTextual.g:2359:5: lv_name_1_0= RULE_ID
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

            // InternalUmlTextual.g:2375:3: (otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==72) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUmlTextual.g:2376:4: otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getUseCaseAccess().getIncludesKeyword_2_0());
                    			
                    // InternalUmlTextual.g:2380:4: ( (otherlv_3= RULE_ID ) )
                    // InternalUmlTextual.g:2381:5: (otherlv_3= RULE_ID )
                    {
                    // InternalUmlTextual.g:2381:5: (otherlv_3= RULE_ID )
                    // InternalUmlTextual.g:2382:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_58); 

                    						newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalUmlTextual.g:2394:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==20) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUmlTextual.g:2395:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0());
                    			
                    // InternalUmlTextual.g:2399:4: ( (otherlv_5= RULE_ID ) )
                    // InternalUmlTextual.g:2400:5: (otherlv_5= RULE_ID )
                    {
                    // InternalUmlTextual.g:2400:5: (otherlv_5= RULE_ID )
                    // InternalUmlTextual.g:2401:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getUseCaseRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,39,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getUseCaseAccess().getEqualsSignKeyword_4());
            		
            // InternalUmlTextual.g:2417:3: ( (lv_description_7_0= RULE_STRING ) )
            // InternalUmlTextual.g:2418:4: (lv_description_7_0= RULE_STRING )
            {
            // InternalUmlTextual.g:2418:4: (lv_description_7_0= RULE_STRING )
            // InternalUmlTextual.g:2419:5: lv_description_7_0= RULE_STRING
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

            // InternalUmlTextual.g:2435:3: (otherlv_8= '{' ( (otherlv_9= 'includes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'extends' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= 'includes' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* ) ) otherlv_25= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==16) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalUmlTextual.g:2436:4: otherlv_8= '{' ( (otherlv_9= 'includes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'extends' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= 'includes' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* ) ) otherlv_25= '}'
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_60); 

                    				newLeafNode(otherlv_8, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalUmlTextual.g:2440:4: ( (otherlv_9= 'includes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* ) | (otherlv_17= 'extends' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= 'includes' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* ) )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==72) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==20) ) {
                        alt55=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalUmlTextual.g:2441:5: (otherlv_9= 'includes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )
                            {
                            // InternalUmlTextual.g:2441:5: (otherlv_9= 'includes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )
                            // InternalUmlTextual.g:2442:6: otherlv_9= 'includes' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= 'extends' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                            {
                            otherlv_9=(Token)match(input,72,FOLLOW_5); 

                            						newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_0_0());
                            					
                            // InternalUmlTextual.g:2446:6: ( (otherlv_10= RULE_ID ) )
                            // InternalUmlTextual.g:2447:7: (otherlv_10= RULE_ID )
                            {
                            // InternalUmlTextual.g:2447:7: (otherlv_10= RULE_ID )
                            // InternalUmlTextual.g:2448:8: otherlv_10= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getUseCaseRule());
                            								}
                            							
                            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_61); 

                            								newLeafNode(otherlv_10, grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_0_1_0());
                            							

                            }


                            }

                            // InternalUmlTextual.g:2459:6: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==22) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // InternalUmlTextual.g:2460:7: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                            	    {
                            	    otherlv_11=(Token)match(input,22,FOLLOW_5); 

                            	    							newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_0_2_0());
                            	    						
                            	    // InternalUmlTextual.g:2464:7: ( (otherlv_12= RULE_ID ) )
                            	    // InternalUmlTextual.g:2465:8: (otherlv_12= RULE_ID )
                            	    {
                            	    // InternalUmlTextual.g:2465:8: (otherlv_12= RULE_ID )
                            	    // InternalUmlTextual.g:2466:9: otherlv_12= RULE_ID
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getUseCaseRule());
                            	    									}
                            	    								
                            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_61); 

                            	    									newLeafNode(otherlv_12, grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_0_2_1_0());
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,20,FOLLOW_5); 

                            						newLeafNode(otherlv_13, grammarAccess.getUseCaseAccess().getExtendsKeyword_6_1_0_3());
                            					
                            // InternalUmlTextual.g:2482:6: ( (otherlv_14= RULE_ID ) )
                            // InternalUmlTextual.g:2483:7: (otherlv_14= RULE_ID )
                            {
                            // InternalUmlTextual.g:2483:7: (otherlv_14= RULE_ID )
                            // InternalUmlTextual.g:2484:8: otherlv_14= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getUseCaseRule());
                            								}
                            							
                            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_62); 

                            								newLeafNode(otherlv_14, grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_0_4_0());
                            							

                            }


                            }

                            // InternalUmlTextual.g:2495:6: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                            loop52:
                            do {
                                int alt52=2;
                                int LA52_0 = input.LA(1);

                                if ( (LA52_0==22) ) {
                                    alt52=1;
                                }


                                switch (alt52) {
                            	case 1 :
                            	    // InternalUmlTextual.g:2496:7: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
                            	    {
                            	    otherlv_15=(Token)match(input,22,FOLLOW_5); 

                            	    							newLeafNode(otherlv_15, grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_0_5_0());
                            	    						
                            	    // InternalUmlTextual.g:2500:7: ( (otherlv_16= RULE_ID ) )
                            	    // InternalUmlTextual.g:2501:8: (otherlv_16= RULE_ID )
                            	    {
                            	    // InternalUmlTextual.g:2501:8: (otherlv_16= RULE_ID )
                            	    // InternalUmlTextual.g:2502:9: otherlv_16= RULE_ID
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getUseCaseRule());
                            	    									}
                            	    								
                            	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_62); 

                            	    									newLeafNode(otherlv_16, grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_0_5_1_0());
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop52;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalUmlTextual.g:2516:5: (otherlv_17= 'extends' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= 'includes' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* )
                            {
                            // InternalUmlTextual.g:2516:5: (otherlv_17= 'extends' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= 'includes' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )* )
                            // InternalUmlTextual.g:2517:6: otherlv_17= 'extends' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= 'includes' ( (otherlv_22= RULE_ID ) ) (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )*
                            {
                            otherlv_17=(Token)match(input,20,FOLLOW_5); 

                            						newLeafNode(otherlv_17, grammarAccess.getUseCaseAccess().getExtendsKeyword_6_1_1_0());
                            					
                            // InternalUmlTextual.g:2521:6: ( (otherlv_18= RULE_ID ) )
                            // InternalUmlTextual.g:2522:7: (otherlv_18= RULE_ID )
                            {
                            // InternalUmlTextual.g:2522:7: (otherlv_18= RULE_ID )
                            // InternalUmlTextual.g:2523:8: otherlv_18= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getUseCaseRule());
                            								}
                            							
                            otherlv_18=(Token)match(input,RULE_ID,FOLLOW_63); 

                            								newLeafNode(otherlv_18, grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_1_1_0());
                            							

                            }


                            }

                            // InternalUmlTextual.g:2534:6: (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
                            loop53:
                            do {
                                int alt53=2;
                                int LA53_0 = input.LA(1);

                                if ( (LA53_0==22) ) {
                                    alt53=1;
                                }


                                switch (alt53) {
                            	case 1 :
                            	    // InternalUmlTextual.g:2535:7: otherlv_19= ',' ( (otherlv_20= RULE_ID ) )
                            	    {
                            	    otherlv_19=(Token)match(input,22,FOLLOW_5); 

                            	    							newLeafNode(otherlv_19, grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_1_2_0());
                            	    						
                            	    // InternalUmlTextual.g:2539:7: ( (otherlv_20= RULE_ID ) )
                            	    // InternalUmlTextual.g:2540:8: (otherlv_20= RULE_ID )
                            	    {
                            	    // InternalUmlTextual.g:2540:8: (otherlv_20= RULE_ID )
                            	    // InternalUmlTextual.g:2541:9: otherlv_20= RULE_ID
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getUseCaseRule());
                            	    									}
                            	    								
                            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_63); 

                            	    									newLeafNode(otherlv_20, grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_1_2_1_0());
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop53;
                                }
                            } while (true);

                            otherlv_21=(Token)match(input,72,FOLLOW_5); 

                            						newLeafNode(otherlv_21, grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_1_3());
                            					
                            // InternalUmlTextual.g:2557:6: ( (otherlv_22= RULE_ID ) )
                            // InternalUmlTextual.g:2558:7: (otherlv_22= RULE_ID )
                            {
                            // InternalUmlTextual.g:2558:7: (otherlv_22= RULE_ID )
                            // InternalUmlTextual.g:2559:8: otherlv_22= RULE_ID
                            {

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getUseCaseRule());
                            								}
                            							
                            otherlv_22=(Token)match(input,RULE_ID,FOLLOW_62); 

                            								newLeafNode(otherlv_22, grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_1_4_0());
                            							

                            }


                            }

                            // InternalUmlTextual.g:2570:6: (otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( (LA54_0==22) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // InternalUmlTextual.g:2571:7: otherlv_23= ',' ( (otherlv_24= RULE_ID ) )
                            	    {
                            	    otherlv_23=(Token)match(input,22,FOLLOW_5); 

                            	    							newLeafNode(otherlv_23, grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_1_5_0());
                            	    						
                            	    // InternalUmlTextual.g:2575:7: ( (otherlv_24= RULE_ID ) )
                            	    // InternalUmlTextual.g:2576:8: (otherlv_24= RULE_ID )
                            	    {
                            	    // InternalUmlTextual.g:2576:8: (otherlv_24= RULE_ID )
                            	    // InternalUmlTextual.g:2577:9: otherlv_24= RULE_ID
                            	    {

                            	    									if (current==null) {
                            	    										current = createModelElement(grammarAccess.getUseCaseRule());
                            	    									}
                            	    								
                            	    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_62); 

                            	    									newLeafNode(otherlv_24, grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_1_5_1_0());
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\14\1\4\4\23\3\uffff\1\14";
    static final String dfa_3s = "\1\102\1\4\4\27\3\uffff\1\32";
    static final String dfa_4s = "\6\uffff\1\1\1\2\1\3\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\5\uffff\1\1\1\6\3\uffff\1\10\1\2\1\3\1\4\40\uffff\2\7\4\uffff\2\7",
            "\1\11",
            "\1\6\3\uffff\1\10",
            "\1\6\3\uffff\1\10",
            "\1\6\3\uffff\1\10",
            "\1\6\3\uffff\1\10",
            "",
            "",
            "",
            "\1\5\6\uffff\1\6\3\uffff\1\10\1\2\1\3\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "297:2: (this_Class_0= ruleClass | this_AssociationConnector_1= ruleAssociationConnector | this_Interface_2= ruleInterface )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\10\uffff\1\11\2\uffff";
    static final String dfa_9s = "\1\6\7\uffff\1\57\2\uffff";
    static final String dfa_10s = "\1\56\7\uffff\1\63\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\10\41\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\3\uffff\1\11",
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

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "975:2: (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' | (kw= '0..' this_INT_6= RULE_INT ) | (kw= '1..' this_INT_8= RULE_INT ) | this_INT_9= RULE_INT | (this_INT_10= RULE_INT kw= '..' this_INT_12= RULE_INT ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003802L,0x0000000000000008L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x18000040078E1000L,0x0000000000000006L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x18000000078E1000L,0x0000000000000006L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000007081000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x003100000F021000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x003000000F021000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007801000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000007021000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000003FE0000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00007F0000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0030000007001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000007001000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000400010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0200000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000020000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000001F021000L,0x0000000000000068L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000018000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000000001F001000L,0x0000000000000060L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000080L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000420000L,0x0000000000000080L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000008000100000L,0x0000000000000100L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000100L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});

}