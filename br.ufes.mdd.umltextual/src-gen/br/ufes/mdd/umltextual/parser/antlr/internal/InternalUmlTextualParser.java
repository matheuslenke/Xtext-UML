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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'subsystem'", "'{'", "'}'", "'@'", "'class'", "'extends'", "'public'", "'private'", "'string'", "'int'", "'double'", "'boolean'", "'byte'", "'char'", "'float'", "'short'", "'long'", "'1'", "'0..1'", "'0..*'", "'*'", "'1..*'", "'attr'", "':'", "'['", "']'", "'unamed'", "'navigable'", "'undirected'", "'association'", "'from'", "'to'", "'aggregation'", "'composition'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
    public static final int T__44=44;
    public static final int T__45=45;
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
    // InternalUmlTextual.g:71:1: ruleModel returns [EObject current=null] : ( (lv_packages_0_0= rulePackage ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_packages_0_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:77:2: ( ( (lv_packages_0_0= rulePackage ) )* )
            // InternalUmlTextual.g:78:2: ( (lv_packages_0_0= rulePackage ) )*
            {
            // InternalUmlTextual.g:78:2: ( (lv_packages_0_0= rulePackage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUmlTextual.g:79:3: (lv_packages_0_0= rulePackage )
            	    {
            	    // InternalUmlTextual.g:79:3: (lv_packages_0_0= rulePackage )
            	    // InternalUmlTextual.g:80:4: lv_packages_0_0= rulePackage
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_packages_0_0=rulePackage();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"packages",
            	    					lv_packages_0_0,
            	    					"br.ufes.mdd.umltextual.UmlTextual.Package");
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


    // $ANTLR start "entryRulePackage"
    // InternalUmlTextual.g:100:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalUmlTextual.g:100:48: (iv_rulePackage= rulePackage EOF )
            // InternalUmlTextual.g:101:2: iv_rulePackage= rulePackage EOF
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
    // InternalUmlTextual.g:107:1: rulePackage returns [EObject current=null] : ( ( ( (lv_type_0_1= 'package' | lv_type_0_2= 'subsystem' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_classes_3_0= ruleClass ) )* ( (lv_associations_4_0= ruleAssociationConnector ) )* otherlv_5= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_classes_3_0 = null;

        EObject lv_associations_4_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:113:2: ( ( ( ( (lv_type_0_1= 'package' | lv_type_0_2= 'subsystem' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_classes_3_0= ruleClass ) )* ( (lv_associations_4_0= ruleAssociationConnector ) )* otherlv_5= '}' ) )
            // InternalUmlTextual.g:114:2: ( ( ( (lv_type_0_1= 'package' | lv_type_0_2= 'subsystem' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_classes_3_0= ruleClass ) )* ( (lv_associations_4_0= ruleAssociationConnector ) )* otherlv_5= '}' )
            {
            // InternalUmlTextual.g:114:2: ( ( ( (lv_type_0_1= 'package' | lv_type_0_2= 'subsystem' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_classes_3_0= ruleClass ) )* ( (lv_associations_4_0= ruleAssociationConnector ) )* otherlv_5= '}' )
            // InternalUmlTextual.g:115:3: ( ( (lv_type_0_1= 'package' | lv_type_0_2= 'subsystem' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_classes_3_0= ruleClass ) )* ( (lv_associations_4_0= ruleAssociationConnector ) )* otherlv_5= '}'
            {
            // InternalUmlTextual.g:115:3: ( ( (lv_type_0_1= 'package' | lv_type_0_2= 'subsystem' ) ) )
            // InternalUmlTextual.g:116:4: ( (lv_type_0_1= 'package' | lv_type_0_2= 'subsystem' ) )
            {
            // InternalUmlTextual.g:116:4: ( (lv_type_0_1= 'package' | lv_type_0_2= 'subsystem' ) )
            // InternalUmlTextual.g:117:5: (lv_type_0_1= 'package' | lv_type_0_2= 'subsystem' )
            {
            // InternalUmlTextual.g:117:5: (lv_type_0_1= 'package' | lv_type_0_2= 'subsystem' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUmlTextual.g:118:6: lv_type_0_1= 'package'
                    {
                    lv_type_0_1=(Token)match(input,11,FOLLOW_4); 

                    						newLeafNode(lv_type_0_1, grammarAccess.getPackageAccess().getTypePackageKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:129:6: lv_type_0_2= 'subsystem'
                    {
                    lv_type_0_2=(Token)match(input,12,FOLLOW_4); 

                    						newLeafNode(lv_type_0_2, grammarAccess.getPackageAccess().getTypeSubsystemKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPackageRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalUmlTextual.g:142:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUmlTextual.g:143:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUmlTextual.g:143:4: (lv_name_1_0= RULE_ID )
            // InternalUmlTextual.g:144:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalUmlTextual.g:164:3: ( (lv_classes_3_0= ruleClass ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=16)||(LA3_0>=18 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUmlTextual.g:165:4: (lv_classes_3_0= ruleClass )
            	    {
            	    // InternalUmlTextual.g:165:4: (lv_classes_3_0= ruleClass )
            	    // InternalUmlTextual.g:166:5: lv_classes_3_0= ruleClass
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getClassesClassParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_classes_3_0=ruleClass();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classes",
            	    						lv_classes_3_0,
            	    						"br.ufes.mdd.umltextual.UmlTextual.Class");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalUmlTextual.g:183:3: ( (lv_associations_4_0= ruleAssociationConnector ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=40 && LA4_0<=41)||(LA4_0>=44 && LA4_0<=45)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUmlTextual.g:184:4: (lv_associations_4_0= ruleAssociationConnector )
            	    {
            	    // InternalUmlTextual.g:184:4: (lv_associations_4_0= ruleAssociationConnector )
            	    // InternalUmlTextual.g:185:5: lv_associations_4_0= ruleAssociationConnector
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getAssociationsAssociationConnectorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_associations_4_0=ruleAssociationConnector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"associations",
            	    						lv_associations_4_0,
            	    						"br.ufes.mdd.umltextual.UmlTextual.AssociationConnector");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleClass"
    // InternalUmlTextual.g:210:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalUmlTextual.g:210:46: (iv_ruleClass= ruleClass EOF )
            // InternalUmlTextual.g:211:2: iv_ruleClass= ruleClass EOF
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
    // InternalUmlTextual.g:217:1: ruleClass returns [EObject current=null] : ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (lv_parentClass_6_0= ruleClass ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stereotype_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_visibility_2_0 = null;

        EObject lv_parentClass_6_0 = null;

        EObject lv_attributes_8_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:223:2: ( ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (lv_parentClass_6_0= ruleClass ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' ) )
            // InternalUmlTextual.g:224:2: ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (lv_parentClass_6_0= ruleClass ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            {
            // InternalUmlTextual.g:224:2: ( (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (lv_parentClass_6_0= ruleClass ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}' )
            // InternalUmlTextual.g:225:3: (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )? ( (lv_visibility_2_0= ruleVisibility ) )? otherlv_3= 'class' ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'extends' ( (lv_parentClass_6_0= ruleClass ) ) )? otherlv_7= '{' ( (lv_attributes_8_0= ruleAttribute ) )* otherlv_9= '}'
            {
            // InternalUmlTextual.g:225:3: (otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalUmlTextual.g:226:4: otherlv_0= '@' ( (lv_stereotype_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getClassAccess().getCommercialAtKeyword_0_0());
                    			
                    // InternalUmlTextual.g:230:4: ( (lv_stereotype_1_0= RULE_ID ) )
                    // InternalUmlTextual.g:231:5: (lv_stereotype_1_0= RULE_ID )
                    {
                    // InternalUmlTextual.g:231:5: (lv_stereotype_1_0= RULE_ID )
                    // InternalUmlTextual.g:232:6: lv_stereotype_1_0= RULE_ID
                    {
                    lv_stereotype_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            // InternalUmlTextual.g:249:3: ( (lv_visibility_2_0= ruleVisibility ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=18 && LA6_0<=19)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUmlTextual.g:250:4: (lv_visibility_2_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:250:4: (lv_visibility_2_0= ruleVisibility )
                    // InternalUmlTextual.g:251:5: lv_visibility_2_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getClassAccess().getVisibilityVisibilityParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_9);
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

            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassKeyword_2());
            		
            // InternalUmlTextual.g:272:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalUmlTextual.g:273:4: (lv_name_4_0= RULE_ID )
            {
            // InternalUmlTextual.g:273:4: (lv_name_4_0= RULE_ID )
            // InternalUmlTextual.g:274:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalUmlTextual.g:290:3: (otherlv_5= 'extends' ( (lv_parentClass_6_0= ruleClass ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalUmlTextual.g:291:4: otherlv_5= 'extends' ( (lv_parentClass_6_0= ruleClass ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassAccess().getExtendsKeyword_4_0());
                    			
                    // InternalUmlTextual.g:295:4: ( (lv_parentClass_6_0= ruleClass ) )
                    // InternalUmlTextual.g:296:5: (lv_parentClass_6_0= ruleClass )
                    {
                    // InternalUmlTextual.g:296:5: (lv_parentClass_6_0= ruleClass )
                    // InternalUmlTextual.g:297:6: lv_parentClass_6_0= ruleClass
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getParentClassClassParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_parentClass_6_0=ruleClass();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						set(
                    							current,
                    							"parentClass",
                    							lv_parentClass_6_0,
                    							"br.ufes.mdd.umltextual.UmlTextual.Class");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalUmlTextual.g:319:3: ( (lv_attributes_8_0= ruleAttribute ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=19)||LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUmlTextual.g:320:4: (lv_attributes_8_0= ruleAttribute )
            	    {
            	    // InternalUmlTextual.g:320:4: (lv_attributes_8_0= ruleAttribute )
            	    // InternalUmlTextual.g:321:5: lv_attributes_8_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_attributes_8_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassRule());
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
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleVisibility"
    // InternalUmlTextual.g:346:1: entryRuleVisibility returns [String current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final String entryRuleVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVisibility = null;


        try {
            // InternalUmlTextual.g:346:50: (iv_ruleVisibility= ruleVisibility EOF )
            // InternalUmlTextual.g:347:2: iv_ruleVisibility= ruleVisibility EOF
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
    // InternalUmlTextual.g:353:1: ruleVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'public' | kw= 'private' ) ;
    public final AntlrDatatypeRuleToken ruleVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:359:2: ( (kw= 'public' | kw= 'private' ) )
            // InternalUmlTextual.g:360:2: (kw= 'public' | kw= 'private' )
            {
            // InternalUmlTextual.g:360:2: (kw= 'public' | kw= 'private' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUmlTextual.g:361:3: kw= 'public'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityAccess().getPublicKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:367:3: kw= 'private'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVisibilityAccess().getPrivateKeyword_1());
                    		

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


    // $ANTLR start "entryRuleAttributeType"
    // InternalUmlTextual.g:376:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalUmlTextual.g:376:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalUmlTextual.g:377:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalUmlTextual.g:383:1: ruleAttributeType returns [EObject current=null] : ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'double' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'byte' ) | ( () otherlv_11= 'char' ) | ( () otherlv_13= 'float' ) | ( () otherlv_15= 'short' ) | ( () otherlv_17= 'long' ) | this_DomainSpecificType_18= ruleDomainSpecificType ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject this_DomainSpecificType_18 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:389:2: ( ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'double' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'byte' ) | ( () otherlv_11= 'char' ) | ( () otherlv_13= 'float' ) | ( () otherlv_15= 'short' ) | ( () otherlv_17= 'long' ) | this_DomainSpecificType_18= ruleDomainSpecificType ) )
            // InternalUmlTextual.g:390:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'double' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'byte' ) | ( () otherlv_11= 'char' ) | ( () otherlv_13= 'float' ) | ( () otherlv_15= 'short' ) | ( () otherlv_17= 'long' ) | this_DomainSpecificType_18= ruleDomainSpecificType )
            {
            // InternalUmlTextual.g:390:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'int' ) | ( () otherlv_5= 'double' ) | ( () otherlv_7= 'boolean' ) | ( () otherlv_9= 'byte' ) | ( () otherlv_11= 'char' ) | ( () otherlv_13= 'float' ) | ( () otherlv_15= 'short' ) | ( () otherlv_17= 'long' ) | this_DomainSpecificType_18= ruleDomainSpecificType )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 24:
                {
                alt10=5;
                }
                break;
            case 25:
                {
                alt10=6;
                }
                break;
            case 26:
                {
                alt10=7;
                }
                break;
            case 27:
                {
                alt10=8;
                }
                break;
            case 28:
                {
                alt10=9;
                }
                break;
            case RULE_ID:
                {
                alt10=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalUmlTextual.g:391:3: ( () otherlv_1= 'string' )
                    {
                    // InternalUmlTextual.g:391:3: ( () otherlv_1= 'string' )
                    // InternalUmlTextual.g:392:4: () otherlv_1= 'string'
                    {
                    // InternalUmlTextual.g:392:4: ()
                    // InternalUmlTextual.g:393:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeTypeAccess().getStringKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:405:3: ( () otherlv_3= 'int' )
                    {
                    // InternalUmlTextual.g:405:3: ( () otherlv_3= 'int' )
                    // InternalUmlTextual.g:406:4: () otherlv_3= 'int'
                    {
                    // InternalUmlTextual.g:406:4: ()
                    // InternalUmlTextual.g:407:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getAttributeTypeAccess().getIntKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:419:3: ( () otherlv_5= 'double' )
                    {
                    // InternalUmlTextual.g:419:3: ( () otherlv_5= 'double' )
                    // InternalUmlTextual.g:420:4: () otherlv_5= 'double'
                    {
                    // InternalUmlTextual.g:420:4: ()
                    // InternalUmlTextual.g:421:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeTypeAccess().getDoubleKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:433:3: ( () otherlv_7= 'boolean' )
                    {
                    // InternalUmlTextual.g:433:3: ( () otherlv_7= 'boolean' )
                    // InternalUmlTextual.g:434:4: () otherlv_7= 'boolean'
                    {
                    // InternalUmlTextual.g:434:4: ()
                    // InternalUmlTextual.g:435:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAttributeTypeAccess().getBooleanKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalUmlTextual.g:447:3: ( () otherlv_9= 'byte' )
                    {
                    // InternalUmlTextual.g:447:3: ( () otherlv_9= 'byte' )
                    // InternalUmlTextual.g:448:4: () otherlv_9= 'byte'
                    {
                    // InternalUmlTextual.g:448:4: ()
                    // InternalUmlTextual.g:449:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,24,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getAttributeTypeAccess().getByteKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalUmlTextual.g:461:3: ( () otherlv_11= 'char' )
                    {
                    // InternalUmlTextual.g:461:3: ( () otherlv_11= 'char' )
                    // InternalUmlTextual.g:462:4: () otherlv_11= 'char'
                    {
                    // InternalUmlTextual.g:462:4: ()
                    // InternalUmlTextual.g:463:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getAttributeTypeAccess().getCharKeyword_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalUmlTextual.g:475:3: ( () otherlv_13= 'float' )
                    {
                    // InternalUmlTextual.g:475:3: ( () otherlv_13= 'float' )
                    // InternalUmlTextual.g:476:4: () otherlv_13= 'float'
                    {
                    // InternalUmlTextual.g:476:4: ()
                    // InternalUmlTextual.g:477:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_6_0(),
                    						current);
                    				

                    }

                    otherlv_13=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getAttributeTypeAccess().getFloatKeyword_6_1());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalUmlTextual.g:489:3: ( () otherlv_15= 'short' )
                    {
                    // InternalUmlTextual.g:489:3: ( () otherlv_15= 'short' )
                    // InternalUmlTextual.g:490:4: () otherlv_15= 'short'
                    {
                    // InternalUmlTextual.g:490:4: ()
                    // InternalUmlTextual.g:491:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_15=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getAttributeTypeAccess().getShortKeyword_7_1());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalUmlTextual.g:503:3: ( () otherlv_17= 'long' )
                    {
                    // InternalUmlTextual.g:503:3: ( () otherlv_17= 'long' )
                    // InternalUmlTextual.g:504:4: () otherlv_17= 'long'
                    {
                    // InternalUmlTextual.g:504:4: ()
                    // InternalUmlTextual.g:505:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_17=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_17, grammarAccess.getAttributeTypeAccess().getLongKeyword_8_1());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalUmlTextual.g:517:3: this_DomainSpecificType_18= ruleDomainSpecificType
                    {

                    			newCompositeNode(grammarAccess.getAttributeTypeAccess().getDomainSpecificTypeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_DomainSpecificType_18=ruleDomainSpecificType();

                    state._fsp--;


                    			current = this_DomainSpecificType_18;
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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleDomainSpecificType"
    // InternalUmlTextual.g:529:1: entryRuleDomainSpecificType returns [EObject current=null] : iv_ruleDomainSpecificType= ruleDomainSpecificType EOF ;
    public final EObject entryRuleDomainSpecificType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainSpecificType = null;


        try {
            // InternalUmlTextual.g:529:59: (iv_ruleDomainSpecificType= ruleDomainSpecificType EOF )
            // InternalUmlTextual.g:530:2: iv_ruleDomainSpecificType= ruleDomainSpecificType EOF
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
    // InternalUmlTextual.g:536:1: ruleDomainSpecificType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleDomainSpecificType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:542:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalUmlTextual.g:543:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalUmlTextual.g:543:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalUmlTextual.g:544:3: (lv_name_0_0= RULE_ID )
            {
            // InternalUmlTextual.g:544:3: (lv_name_0_0= RULE_ID )
            // InternalUmlTextual.g:545:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getDomainSpecificTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDomainSpecificTypeRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // InternalUmlTextual.g:564:1: entryRuleMultiplicity returns [String current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final String entryRuleMultiplicity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicity = null;


        try {
            // InternalUmlTextual.g:564:52: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalUmlTextual.g:565:2: iv_ruleMultiplicity= ruleMultiplicity EOF
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
    // InternalUmlTextual.g:571:1: ruleMultiplicity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:577:2: ( (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' ) )
            // InternalUmlTextual.g:578:2: (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' )
            {
            // InternalUmlTextual.g:578:2: (kw= '1' | kw= '0..1' | kw= '0..*' | kw= '*' | kw= '1..*' )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            case 33:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalUmlTextual.g:579:3: kw= '1'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitOneKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:585:3: kw= '0..1'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:591:3: kw= '0..*'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:597:3: kw= '*'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalUmlTextual.g:603:3: kw= '1..*'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopAsteriskKeyword_4());
                    		

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
    // InternalUmlTextual.g:612:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalUmlTextual.g:612:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalUmlTextual.g:613:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalUmlTextual.g:619:1: ruleAttribute returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? ) ;
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
            // InternalUmlTextual.g:625:2: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? ) )
            // InternalUmlTextual.g:626:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? )
            {
            // InternalUmlTextual.g:626:2: ( ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )? )
            // InternalUmlTextual.g:627:3: ( (lv_visibility_0_0= ruleVisibility ) )? otherlv_1= 'attr' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )?
            {
            // InternalUmlTextual.g:627:3: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=18 && LA12_0<=19)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUmlTextual.g:628:4: (lv_visibility_0_0= ruleVisibility )
                    {
                    // InternalUmlTextual.g:628:4: (lv_visibility_0_0= ruleVisibility )
                    // InternalUmlTextual.g:629:5: lv_visibility_0_0= ruleVisibility
                    {

                    					newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_13);
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

            otherlv_1=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttrKeyword_1());
            		
            // InternalUmlTextual.g:650:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUmlTextual.g:651:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUmlTextual.g:651:4: (lv_name_2_0= RULE_ID )
            // InternalUmlTextual.g:652:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_3=(Token)match(input,35,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalUmlTextual.g:672:3: ( (lv_type_4_0= ruleAttributeType ) )
            // InternalUmlTextual.g:673:4: (lv_type_4_0= ruleAttributeType )
            {
            // InternalUmlTextual.g:673:4: (lv_type_4_0= ruleAttributeType )
            // InternalUmlTextual.g:674:5: lv_type_4_0= ruleAttributeType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalUmlTextual.g:691:3: (otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUmlTextual.g:692:4: otherlv_5= '[' ( (lv_multiplicity_6_0= ruleMultiplicity ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,36,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0());
                    			
                    // InternalUmlTextual.g:696:4: ( (lv_multiplicity_6_0= ruleMultiplicity ) )
                    // InternalUmlTextual.g:697:5: (lv_multiplicity_6_0= ruleMultiplicity )
                    {
                    // InternalUmlTextual.g:697:5: (lv_multiplicity_6_0= ruleMultiplicity )
                    // InternalUmlTextual.g:698:6: lv_multiplicity_6_0= ruleMultiplicity
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    otherlv_7=(Token)match(input,37,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUnamed"
    // InternalUmlTextual.g:724:1: entryRuleUnamed returns [String current=null] : iv_ruleUnamed= ruleUnamed EOF ;
    public final String entryRuleUnamed() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnamed = null;


        try {
            // InternalUmlTextual.g:724:46: (iv_ruleUnamed= ruleUnamed EOF )
            // InternalUmlTextual.g:725:2: iv_ruleUnamed= ruleUnamed EOF
            {
             newCompositeNode(grammarAccess.getUnamedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnamed=ruleUnamed();

            state._fsp--;

             current =iv_ruleUnamed.getText(); 
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
    // $ANTLR end "entryRuleUnamed"


    // $ANTLR start "ruleUnamed"
    // InternalUmlTextual.g:731:1: ruleUnamed returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'unamed' ;
    public final AntlrDatatypeRuleToken ruleUnamed() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:737:2: (kw= 'unamed' )
            // InternalUmlTextual.g:738:2: kw= 'unamed'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getUnamedAccess().getUnamedKeyword());
            	

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
    // $ANTLR end "ruleUnamed"


    // $ANTLR start "entryRuleNavigation"
    // InternalUmlTextual.g:746:1: entryRuleNavigation returns [String current=null] : iv_ruleNavigation= ruleNavigation EOF ;
    public final String entryRuleNavigation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNavigation = null;


        try {
            // InternalUmlTextual.g:746:50: (iv_ruleNavigation= ruleNavigation EOF )
            // InternalUmlTextual.g:747:2: iv_ruleNavigation= ruleNavigation EOF
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
    // InternalUmlTextual.g:753:1: ruleNavigation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'navigable' ;
    public final AntlrDatatypeRuleToken ruleNavigation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUmlTextual.g:759:2: (kw= 'navigable' )
            // InternalUmlTextual.g:760:2: kw= 'navigable'
            {
            kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalUmlTextual.g:768:1: entryRuleAssociationConnector returns [EObject current=null] : iv_ruleAssociationConnector= ruleAssociationConnector EOF ;
    public final EObject entryRuleAssociationConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationConnector = null;


        try {
            // InternalUmlTextual.g:768:61: (iv_ruleAssociationConnector= ruleAssociationConnector EOF )
            // InternalUmlTextual.g:769:2: iv_ruleAssociationConnector= ruleAssociationConnector EOF
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
    // InternalUmlTextual.g:775:1: ruleAssociationConnector returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition ) ;
    public final EObject ruleAssociationConnector() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Aggregation_1 = null;

        EObject this_Composition_2 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:781:2: ( (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition ) )
            // InternalUmlTextual.g:782:2: (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition )
            {
            // InternalUmlTextual.g:782:2: (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 45:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalUmlTextual.g:783:3: this_Association_0= ruleAssociation
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
                    // InternalUmlTextual.g:792:3: this_Aggregation_1= ruleAggregation
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
                    // InternalUmlTextual.g:801:3: this_Composition_2= ruleComposition
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
    // InternalUmlTextual.g:813:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUmlTextual.g:813:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUmlTextual.g:814:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalUmlTextual.g:820:1: ruleAssociation returns [EObject current=null] : ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( (otherlv_12= RULE_ID ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' otherlv_16= '}' ) ;
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
        AntlrDatatypeRuleToken lv_name_2_2 = null;

        AntlrDatatypeRuleToken lv_navigation1_5_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity1_8_0 = null;

        AntlrDatatypeRuleToken lv_navigation2_11_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity2_14_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:826:2: ( ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( (otherlv_12= RULE_ID ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' otherlv_16= '}' ) )
            // InternalUmlTextual.g:827:2: ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( (otherlv_12= RULE_ID ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' otherlv_16= '}' )
            {
            // InternalUmlTextual.g:827:2: ( (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( (otherlv_12= RULE_ID ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' otherlv_16= '}' )
            // InternalUmlTextual.g:828:3: (otherlv_0= 'undirected' )? otherlv_1= 'association' ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnamed ) ) ) otherlv_3= '{' otherlv_4= 'from' ( (lv_navigation1_5_0= ruleNavigation ) )? ( (otherlv_6= RULE_ID ) ) otherlv_7= '[' ( (lv_multiplicity1_8_0= ruleMultiplicity ) ) otherlv_9= ']' otherlv_10= 'to' ( (lv_navigation2_11_0= ruleNavigation ) )? ( (otherlv_12= RULE_ID ) ) otherlv_13= '[' ( (lv_multiplicity2_14_0= ruleMultiplicity ) ) otherlv_15= ']' otherlv_16= '}'
            {
            // InternalUmlTextual.g:828:3: (otherlv_0= 'undirected' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUmlTextual.g:829:4: otherlv_0= 'undirected'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_19); 

                    				newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getUndirectedKeyword_0());
                    			

                    }
                    break;

            }

            otherlv_1=(Token)match(input,41,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
            		
            // InternalUmlTextual.g:838:3: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnamed ) ) )
            // InternalUmlTextual.g:839:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnamed ) )
            {
            // InternalUmlTextual.g:839:4: ( (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnamed ) )
            // InternalUmlTextual.g:840:5: (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnamed )
            {
            // InternalUmlTextual.g:840:5: (lv_name_2_1= RULE_ID | lv_name_2_2= ruleUnamed )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==38) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalUmlTextual.g:841:6: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_5); 

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
                    // InternalUmlTextual.g:856:6: lv_name_2_2= ruleUnamed
                    {

                    						newCompositeNode(grammarAccess.getAssociationAccess().getNameUnamedParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_name_2_2=ruleUnamed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssociationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_2,
                    							"br.ufes.mdd.umltextual.UmlTextual.Unamed");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,42,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getFromKeyword_4());
            		
            // InternalUmlTextual.g:882:3: ( (lv_navigation1_5_0= ruleNavigation ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUmlTextual.g:883:4: (lv_navigation1_5_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:883:4: (lv_navigation1_5_0= ruleNavigation )
                    // InternalUmlTextual.g:884:5: lv_navigation1_5_0= ruleNavigation
                    {

                    					newCompositeNode(grammarAccess.getAssociationAccess().getNavigation1NavigationParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_4);
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

            // InternalUmlTextual.g:901:3: ( (otherlv_6= RULE_ID ) )
            // InternalUmlTextual.g:902:4: (otherlv_6= RULE_ID )
            {
            // InternalUmlTextual.g:902:4: (otherlv_6= RULE_ID )
            // InternalUmlTextual.g:903:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getClass1ClassCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalUmlTextual.g:918:3: ( (lv_multiplicity1_8_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:919:4: (lv_multiplicity1_8_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:919:4: (lv_multiplicity1_8_0= ruleMultiplicity )
            // InternalUmlTextual.g:920:5: lv_multiplicity1_8_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicity1MultiplicityParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_9=(Token)match(input,37,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_10=(Token)match(input,43,FOLLOW_22); 

            			newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getToKeyword_10());
            		
            // InternalUmlTextual.g:945:3: ( (lv_navigation2_11_0= ruleNavigation ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUmlTextual.g:946:4: (lv_navigation2_11_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:946:4: (lv_navigation2_11_0= ruleNavigation )
                    // InternalUmlTextual.g:947:5: lv_navigation2_11_0= ruleNavigation
                    {

                    					newCompositeNode(grammarAccess.getAssociationAccess().getNavigation2NavigationParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_4);
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

            // InternalUmlTextual.g:964:3: ( (otherlv_12= RULE_ID ) )
            // InternalUmlTextual.g:965:4: (otherlv_12= RULE_ID )
            {
            // InternalUmlTextual.g:965:4: (otherlv_12= RULE_ID )
            // InternalUmlTextual.g:966:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_12, grammarAccess.getAssociationAccess().getClass2ClassCrossReference_12_0());
            				

            }


            }

            otherlv_13=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_13());
            		
            // InternalUmlTextual.g:981:3: ( (lv_multiplicity2_14_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:982:4: (lv_multiplicity2_14_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:982:4: (lv_multiplicity2_14_0= ruleMultiplicity )
            // InternalUmlTextual.g:983:5: lv_multiplicity2_14_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getMultiplicity2MultiplicityParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_15=(Token)match(input,37,FOLLOW_25); 

            			newLeafNode(otherlv_15, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_15());
            		
            otherlv_16=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalUmlTextual.g:1012:1: entryRuleAggregation returns [EObject current=null] : iv_ruleAggregation= ruleAggregation EOF ;
    public final EObject entryRuleAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregation = null;


        try {
            // InternalUmlTextual.g:1012:52: (iv_ruleAggregation= ruleAggregation EOF )
            // InternalUmlTextual.g:1013:2: iv_ruleAggregation= ruleAggregation EOF
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
    // InternalUmlTextual.g:1019:1: ruleAggregation returns [EObject current=null] : (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= '}' ) ;
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
        AntlrDatatypeRuleToken lv_name_1_2 = null;

        AntlrDatatypeRuleToken lv_multiplicity1_6_0 = null;

        AntlrDatatypeRuleToken lv_navigation_9_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity2_12_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1025:2: ( (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= '}' ) )
            // InternalUmlTextual.g:1026:2: (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= '}' )
            {
            // InternalUmlTextual.g:1026:2: (otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= '}' )
            // InternalUmlTextual.g:1027:3: otherlv_0= 'aggregation' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getAggregationAccess().getAggregationKeyword_0());
            		
            // InternalUmlTextual.g:1031:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) )
            // InternalUmlTextual.g:1032:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) )
            {
            // InternalUmlTextual.g:1032:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) )
            // InternalUmlTextual.g:1033:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed )
            {
            // InternalUmlTextual.g:1033:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==38) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalUmlTextual.g:1034:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_5); 

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
                    // InternalUmlTextual.g:1049:6: lv_name_1_2= ruleUnamed
                    {

                    						newCompositeNode(grammarAccess.getAggregationAccess().getNameUnamedParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_name_1_2=ruleUnamed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAggregationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"br.ufes.mdd.umltextual.UmlTextual.Unamed");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getAggregationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAggregationAccess().getFromKeyword_3());
            		
            // InternalUmlTextual.g:1075:3: ( (otherlv_4= RULE_ID ) )
            // InternalUmlTextual.g:1076:4: (otherlv_4= RULE_ID )
            {
            // InternalUmlTextual.g:1076:4: (otherlv_4= RULE_ID )
            // InternalUmlTextual.g:1077:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_4, grammarAccess.getAggregationAccess().getClass1ClassCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalUmlTextual.g:1092:3: ( (lv_multiplicity1_6_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1093:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1093:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            // InternalUmlTextual.g:1094:5: lv_multiplicity1_6_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getMultiplicity1MultiplicityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_7=(Token)match(input,37,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,43,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getAggregationAccess().getToKeyword_8());
            		
            // InternalUmlTextual.g:1119:3: ( (lv_navigation_9_0= ruleNavigation ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUmlTextual.g:1120:4: (lv_navigation_9_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:1120:4: (lv_navigation_9_0= ruleNavigation )
                    // InternalUmlTextual.g:1121:5: lv_navigation_9_0= ruleNavigation
                    {

                    					newCompositeNode(grammarAccess.getAggregationAccess().getNavigationNavigationParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_4);
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

            // InternalUmlTextual.g:1138:3: ( (otherlv_10= RULE_ID ) )
            // InternalUmlTextual.g:1139:4: (otherlv_10= RULE_ID )
            {
            // InternalUmlTextual.g:1139:4: (otherlv_10= RULE_ID )
            // InternalUmlTextual.g:1140:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAggregationRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_10, grammarAccess.getAggregationAccess().getClass2ClassCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalUmlTextual.g:1155:3: ( (lv_multiplicity2_12_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1156:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1156:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            // InternalUmlTextual.g:1157:5: lv_multiplicity2_12_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAggregationAccess().getMultiplicity2MultiplicityParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAggregationAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalUmlTextual.g:1182:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // InternalUmlTextual.g:1182:52: (iv_ruleComposition= ruleComposition EOF )
            // InternalUmlTextual.g:1183:2: iv_ruleComposition= ruleComposition EOF
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
    // InternalUmlTextual.g:1189:1: ruleComposition returns [EObject current=null] : (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= '}' ) ;
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
        AntlrDatatypeRuleToken lv_name_1_2 = null;

        AntlrDatatypeRuleToken lv_multiplicity1_6_0 = null;

        AntlrDatatypeRuleToken lv_navigation_9_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity2_12_0 = null;



        	enterRule();

        try {
            // InternalUmlTextual.g:1195:2: ( (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= '}' ) )
            // InternalUmlTextual.g:1196:2: (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= '}' )
            {
            // InternalUmlTextual.g:1196:2: (otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= '}' )
            // InternalUmlTextual.g:1197:3: otherlv_0= 'composition' ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) ) otherlv_2= '{' otherlv_3= 'from' ( (otherlv_4= RULE_ID ) ) otherlv_5= '[' ( (lv_multiplicity1_6_0= ruleMultiplicity ) ) otherlv_7= ']' otherlv_8= 'to' ( (lv_navigation_9_0= ruleNavigation ) )? ( (otherlv_10= RULE_ID ) ) otherlv_11= '[' ( (lv_multiplicity2_12_0= ruleMultiplicity ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositionAccess().getCompositionKeyword_0());
            		
            // InternalUmlTextual.g:1201:3: ( ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) ) )
            // InternalUmlTextual.g:1202:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) )
            {
            // InternalUmlTextual.g:1202:4: ( (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed ) )
            // InternalUmlTextual.g:1203:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed )
            {
            // InternalUmlTextual.g:1203:5: (lv_name_1_1= RULE_ID | lv_name_1_2= ruleUnamed )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==38) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalUmlTextual.g:1204:6: lv_name_1_1= RULE_ID
                    {
                    lv_name_1_1=(Token)match(input,RULE_ID,FOLLOW_5); 

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
                    // InternalUmlTextual.g:1219:6: lv_name_1_2= ruleUnamed
                    {

                    						newCompositeNode(grammarAccess.getCompositionAccess().getNameUnamedParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_5);
                    lv_name_1_2=ruleUnamed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositionRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_2,
                    							"br.ufes.mdd.umltextual.UmlTextual.Unamed");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositionAccess().getFromKeyword_3());
            		
            // InternalUmlTextual.g:1245:3: ( (otherlv_4= RULE_ID ) )
            // InternalUmlTextual.g:1246:4: (otherlv_4= RULE_ID )
            {
            // InternalUmlTextual.g:1246:4: (otherlv_4= RULE_ID )
            // InternalUmlTextual.g:1247:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_4, grammarAccess.getCompositionAccess().getClass1ClassCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalUmlTextual.g:1262:3: ( (lv_multiplicity1_6_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1263:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1263:4: (lv_multiplicity1_6_0= ruleMultiplicity )
            // InternalUmlTextual.g:1264:5: lv_multiplicity1_6_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getMultiplicity1MultiplicityParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_7=(Token)match(input,37,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,43,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getCompositionAccess().getToKeyword_8());
            		
            // InternalUmlTextual.g:1289:3: ( (lv_navigation_9_0= ruleNavigation ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUmlTextual.g:1290:4: (lv_navigation_9_0= ruleNavigation )
                    {
                    // InternalUmlTextual.g:1290:4: (lv_navigation_9_0= ruleNavigation )
                    // InternalUmlTextual.g:1291:5: lv_navigation_9_0= ruleNavigation
                    {

                    					newCompositeNode(grammarAccess.getCompositionAccess().getNavigationNavigationParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_4);
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

            // InternalUmlTextual.g:1308:3: ( (otherlv_10= RULE_ID ) )
            // InternalUmlTextual.g:1309:4: (otherlv_10= RULE_ID )
            {
            // InternalUmlTextual.g:1309:4: (otherlv_10= RULE_ID )
            // InternalUmlTextual.g:1310:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositionRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_10, grammarAccess.getCompositionAccess().getClass2ClassCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalUmlTextual.g:1325:3: ( (lv_multiplicity2_12_0= ruleMultiplicity ) )
            // InternalUmlTextual.g:1326:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            {
            // InternalUmlTextual.g:1326:4: (lv_multiplicity2_12_0= ruleMultiplicity )
            // InternalUmlTextual.g:1327:5: lv_multiplicity2_12_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getCompositionAccess().getMultiplicity2MultiplicityParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getCompositionAccess().getRightCurlyBracketKeyword_13());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00003300000DC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000330000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000D8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000004000C4000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001FF00010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000004000L});

}