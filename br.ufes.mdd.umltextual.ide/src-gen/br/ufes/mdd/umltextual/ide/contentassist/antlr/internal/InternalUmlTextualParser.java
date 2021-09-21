package br.ufes.mdd.umltextual.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.ufes.mdd.umltextual.services.UmlTextualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUmlTextualParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'abstract'", "'active'", "'unamed'", "'navigable'", "'package'", "'subsystem'", "'public'", "'private'", "'protected'", "'1'", "'0..1'", "'0..*'", "'*'", "'1..*'", "'{'", "'}'", "'depends'", "'on'", "'class'", "'@'", "'extends'", "'implements'", "','", "'interface'", "'0..'", "'1..'", "'..'", "'attr'", "':'", "'['", "']'", "'static'", "'function'", "'('", "')'", "'->'", "'undirected'", "'association'", "'from'", "'to'", "'associatedclass'", "'='", "'aggregation'", "'composition'", "'usecase'", "'diagram'", "'actor'", "'includes'", "'uses'", "'string'", "'int'", "'double'", "'boolean'", "'byte'", "'char'", "'float'", "'short'", "'long'", "'business'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(UmlTextualGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalUmlTextual.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalUmlTextual.g:54:1: ( ruleModel EOF )
            // InternalUmlTextual.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalUmlTextual.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalUmlTextual.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalUmlTextual.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalUmlTextual.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalUmlTextual.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=16)||LA1_0==55) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUmlTextual.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelElement"
    // InternalUmlTextual.g:78:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // InternalUmlTextual.g:79:1: ( ruleModelElement EOF )
            // InternalUmlTextual.g:80:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_1);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // InternalUmlTextual.g:87:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:91:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // InternalUmlTextual.g:92:2: ( ( rule__ModelElement__Alternatives ) )
            {
            // InternalUmlTextual.g:92:2: ( ( rule__ModelElement__Alternatives ) )
            // InternalUmlTextual.g:93:3: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // InternalUmlTextual.g:94:3: ( rule__ModelElement__Alternatives )
            // InternalUmlTextual.g:94:4: rule__ModelElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRulePackage"
    // InternalUmlTextual.g:103:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalUmlTextual.g:104:1: ( rulePackage EOF )
            // InternalUmlTextual.g:105:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalUmlTextual.g:112:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:116:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalUmlTextual.g:117:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalUmlTextual.g:117:2: ( ( rule__Package__Group__0 ) )
            // InternalUmlTextual.g:118:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalUmlTextual.g:119:3: ( rule__Package__Group__0 )
            // InternalUmlTextual.g:119:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleElement"
    // InternalUmlTextual.g:128:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalUmlTextual.g:129:1: ( ruleElement EOF )
            // InternalUmlTextual.g:130:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalUmlTextual.g:137:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:141:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalUmlTextual.g:142:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalUmlTextual.g:142:2: ( ( rule__Element__Alternatives ) )
            // InternalUmlTextual.g:143:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalUmlTextual.g:144:3: ( rule__Element__Alternatives )
            // InternalUmlTextual.g:144:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleClass"
    // InternalUmlTextual.g:153:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalUmlTextual.g:154:1: ( ruleClass EOF )
            // InternalUmlTextual.g:155:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalUmlTextual.g:162:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:166:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalUmlTextual.g:167:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalUmlTextual.g:167:2: ( ( rule__Class__Group__0 ) )
            // InternalUmlTextual.g:168:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalUmlTextual.g:169:3: ( rule__Class__Group__0 )
            // InternalUmlTextual.g:169:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleInterface"
    // InternalUmlTextual.g:178:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalUmlTextual.g:179:1: ( ruleInterface EOF )
            // InternalUmlTextual.g:180:1: ruleInterface EOF
            {
             before(grammarAccess.getInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleInterface();

            state._fsp--;

             after(grammarAccess.getInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalUmlTextual.g:187:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:191:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalUmlTextual.g:192:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalUmlTextual.g:192:2: ( ( rule__Interface__Group__0 ) )
            // InternalUmlTextual.g:193:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalUmlTextual.g:194:3: ( rule__Interface__Group__0 )
            // InternalUmlTextual.g:194:4: rule__Interface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleVisibility"
    // InternalUmlTextual.g:203:1: entryRuleVisibility : ruleVisibility EOF ;
    public final void entryRuleVisibility() throws RecognitionException {
        try {
            // InternalUmlTextual.g:204:1: ( ruleVisibility EOF )
            // InternalUmlTextual.g:205:1: ruleVisibility EOF
            {
             before(grammarAccess.getVisibilityRule()); 
            pushFollow(FOLLOW_1);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getVisibilityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVisibility"


    // $ANTLR start "ruleVisibility"
    // InternalUmlTextual.g:212:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:216:2: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalUmlTextual.g:217:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalUmlTextual.g:217:2: ( ( rule__Visibility__Alternatives ) )
            // InternalUmlTextual.g:218:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalUmlTextual.g:219:3: ( rule__Visibility__Alternatives )
            // InternalUmlTextual.g:219:4: rule__Visibility__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Visibility__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "entryRuleAbstract"
    // InternalUmlTextual.g:228:1: entryRuleAbstract : ruleAbstract EOF ;
    public final void entryRuleAbstract() throws RecognitionException {
        try {
            // InternalUmlTextual.g:229:1: ( ruleAbstract EOF )
            // InternalUmlTextual.g:230:1: ruleAbstract EOF
            {
             before(grammarAccess.getAbstractRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getAbstractRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstract"


    // $ANTLR start "ruleAbstract"
    // InternalUmlTextual.g:237:1: ruleAbstract : ( 'abstract' ) ;
    public final void ruleAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:241:2: ( ( 'abstract' ) )
            // InternalUmlTextual.g:242:2: ( 'abstract' )
            {
            // InternalUmlTextual.g:242:2: ( 'abstract' )
            // InternalUmlTextual.g:243:3: 'abstract'
            {
             before(grammarAccess.getAbstractAccess().getAbstractKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getAbstractAccess().getAbstractKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstract"


    // $ANTLR start "entryRuleActive"
    // InternalUmlTextual.g:253:1: entryRuleActive : ruleActive EOF ;
    public final void entryRuleActive() throws RecognitionException {
        try {
            // InternalUmlTextual.g:254:1: ( ruleActive EOF )
            // InternalUmlTextual.g:255:1: ruleActive EOF
            {
             before(grammarAccess.getActiveRule()); 
            pushFollow(FOLLOW_1);
            ruleActive();

            state._fsp--;

             after(grammarAccess.getActiveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActive"


    // $ANTLR start "ruleActive"
    // InternalUmlTextual.g:262:1: ruleActive : ( 'active' ) ;
    public final void ruleActive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:266:2: ( ( 'active' ) )
            // InternalUmlTextual.g:267:2: ( 'active' )
            {
            // InternalUmlTextual.g:267:2: ( 'active' )
            // InternalUmlTextual.g:268:3: 'active'
            {
             before(grammarAccess.getActiveAccess().getActiveKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getActiveAccess().getActiveKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActive"


    // $ANTLR start "entryRuleAttributeType"
    // InternalUmlTextual.g:278:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalUmlTextual.g:279:1: ( ruleAttributeType EOF )
            // InternalUmlTextual.g:280:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalUmlTextual.g:287:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:291:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalUmlTextual.g:292:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalUmlTextual.g:292:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalUmlTextual.g:293:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalUmlTextual.g:294:3: ( rule__AttributeType__Alternatives )
            // InternalUmlTextual.g:294:4: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleDomainSpecificType"
    // InternalUmlTextual.g:303:1: entryRuleDomainSpecificType : ruleDomainSpecificType EOF ;
    public final void entryRuleDomainSpecificType() throws RecognitionException {
        try {
            // InternalUmlTextual.g:304:1: ( ruleDomainSpecificType EOF )
            // InternalUmlTextual.g:305:1: ruleDomainSpecificType EOF
            {
             before(grammarAccess.getDomainSpecificTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainSpecificType();

            state._fsp--;

             after(grammarAccess.getDomainSpecificTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainSpecificType"


    // $ANTLR start "ruleDomainSpecificType"
    // InternalUmlTextual.g:312:1: ruleDomainSpecificType : ( ( rule__DomainSpecificType__NameAssignment ) ) ;
    public final void ruleDomainSpecificType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:316:2: ( ( ( rule__DomainSpecificType__NameAssignment ) ) )
            // InternalUmlTextual.g:317:2: ( ( rule__DomainSpecificType__NameAssignment ) )
            {
            // InternalUmlTextual.g:317:2: ( ( rule__DomainSpecificType__NameAssignment ) )
            // InternalUmlTextual.g:318:3: ( rule__DomainSpecificType__NameAssignment )
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getNameAssignment()); 
            // InternalUmlTextual.g:319:3: ( rule__DomainSpecificType__NameAssignment )
            // InternalUmlTextual.g:319:4: rule__DomainSpecificType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainSpecificType"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalUmlTextual.g:328:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalUmlTextual.g:329:1: ( ruleMultiplicity EOF )
            // InternalUmlTextual.g:330:1: ruleMultiplicity EOF
            {
             before(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getMultiplicityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalUmlTextual.g:337:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:341:2: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalUmlTextual.g:342:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalUmlTextual.g:342:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalUmlTextual.g:343:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalUmlTextual.g:344:3: ( rule__Multiplicity__Alternatives )
            // InternalUmlTextual.g:344:4: rule__Multiplicity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleAttribute"
    // InternalUmlTextual.g:353:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalUmlTextual.g:354:1: ( ruleAttribute EOF )
            // InternalUmlTextual.g:355:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalUmlTextual.g:362:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:366:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalUmlTextual.g:367:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalUmlTextual.g:367:2: ( ( rule__Attribute__Group__0 ) )
            // InternalUmlTextual.g:368:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalUmlTextual.g:369:3: ( rule__Attribute__Group__0 )
            // InternalUmlTextual.g:369:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleMethod"
    // InternalUmlTextual.g:378:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalUmlTextual.g:379:1: ( ruleMethod EOF )
            // InternalUmlTextual.g:380:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalUmlTextual.g:387:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:391:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalUmlTextual.g:392:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalUmlTextual.g:392:2: ( ( rule__Method__Group__0 ) )
            // InternalUmlTextual.g:393:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalUmlTextual.g:394:3: ( rule__Method__Group__0 )
            // InternalUmlTextual.g:394:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // InternalUmlTextual.g:403:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalUmlTextual.g:404:1: ( ruleParameter EOF )
            // InternalUmlTextual.g:405:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalUmlTextual.g:412:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:416:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalUmlTextual.g:417:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalUmlTextual.g:417:2: ( ( rule__Parameter__Group__0 ) )
            // InternalUmlTextual.g:418:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalUmlTextual.g:419:3: ( rule__Parameter__Group__0 )
            // InternalUmlTextual.g:419:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleUnamed"
    // InternalUmlTextual.g:428:1: entryRuleUnamed : ruleUnamed EOF ;
    public final void entryRuleUnamed() throws RecognitionException {
        try {
            // InternalUmlTextual.g:429:1: ( ruleUnamed EOF )
            // InternalUmlTextual.g:430:1: ruleUnamed EOF
            {
             before(grammarAccess.getUnamedRule()); 
            pushFollow(FOLLOW_1);
            ruleUnamed();

            state._fsp--;

             after(grammarAccess.getUnamedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnamed"


    // $ANTLR start "ruleUnamed"
    // InternalUmlTextual.g:437:1: ruleUnamed : ( 'unamed' ) ;
    public final void ruleUnamed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:441:2: ( ( 'unamed' ) )
            // InternalUmlTextual.g:442:2: ( 'unamed' )
            {
            // InternalUmlTextual.g:442:2: ( 'unamed' )
            // InternalUmlTextual.g:443:3: 'unamed'
            {
             before(grammarAccess.getUnamedAccess().getUnamedKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUnamedAccess().getUnamedKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnamed"


    // $ANTLR start "entryRuleNavigation"
    // InternalUmlTextual.g:453:1: entryRuleNavigation : ruleNavigation EOF ;
    public final void entryRuleNavigation() throws RecognitionException {
        try {
            // InternalUmlTextual.g:454:1: ( ruleNavigation EOF )
            // InternalUmlTextual.g:455:1: ruleNavigation EOF
            {
             before(grammarAccess.getNavigationRule()); 
            pushFollow(FOLLOW_1);
            ruleNavigation();

            state._fsp--;

             after(grammarAccess.getNavigationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavigation"


    // $ANTLR start "ruleNavigation"
    // InternalUmlTextual.g:462:1: ruleNavigation : ( 'navigable' ) ;
    public final void ruleNavigation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:466:2: ( ( 'navigable' ) )
            // InternalUmlTextual.g:467:2: ( 'navigable' )
            {
            // InternalUmlTextual.g:467:2: ( 'navigable' )
            // InternalUmlTextual.g:468:3: 'navigable'
            {
             before(grammarAccess.getNavigationAccess().getNavigableKeyword()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNavigationAccess().getNavigableKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavigation"


    // $ANTLR start "entryRuleAssociationConnector"
    // InternalUmlTextual.g:478:1: entryRuleAssociationConnector : ruleAssociationConnector EOF ;
    public final void entryRuleAssociationConnector() throws RecognitionException {
        try {
            // InternalUmlTextual.g:479:1: ( ruleAssociationConnector EOF )
            // InternalUmlTextual.g:480:1: ruleAssociationConnector EOF
            {
             before(grammarAccess.getAssociationConnectorRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociationConnector();

            state._fsp--;

             after(grammarAccess.getAssociationConnectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociationConnector"


    // $ANTLR start "ruleAssociationConnector"
    // InternalUmlTextual.g:487:1: ruleAssociationConnector : ( ( rule__AssociationConnector__Alternatives ) ) ;
    public final void ruleAssociationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:491:2: ( ( ( rule__AssociationConnector__Alternatives ) ) )
            // InternalUmlTextual.g:492:2: ( ( rule__AssociationConnector__Alternatives ) )
            {
            // InternalUmlTextual.g:492:2: ( ( rule__AssociationConnector__Alternatives ) )
            // InternalUmlTextual.g:493:3: ( rule__AssociationConnector__Alternatives )
            {
             before(grammarAccess.getAssociationConnectorAccess().getAlternatives()); 
            // InternalUmlTextual.g:494:3: ( rule__AssociationConnector__Alternatives )
            // InternalUmlTextual.g:494:4: rule__AssociationConnector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AssociationConnector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssociationConnectorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociationConnector"


    // $ANTLR start "entryRuleAssociation"
    // InternalUmlTextual.g:503:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalUmlTextual.g:504:1: ( ruleAssociation EOF )
            // InternalUmlTextual.g:505:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalUmlTextual.g:512:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:516:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalUmlTextual.g:517:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalUmlTextual.g:517:2: ( ( rule__Association__Group__0 ) )
            // InternalUmlTextual.g:518:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalUmlTextual.g:519:3: ( rule__Association__Group__0 )
            // InternalUmlTextual.g:519:4: rule__Association__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleAggregation"
    // InternalUmlTextual.g:528:1: entryRuleAggregation : ruleAggregation EOF ;
    public final void entryRuleAggregation() throws RecognitionException {
        try {
            // InternalUmlTextual.g:529:1: ( ruleAggregation EOF )
            // InternalUmlTextual.g:530:1: ruleAggregation EOF
            {
             before(grammarAccess.getAggregationRule()); 
            pushFollow(FOLLOW_1);
            ruleAggregation();

            state._fsp--;

             after(grammarAccess.getAggregationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAggregation"


    // $ANTLR start "ruleAggregation"
    // InternalUmlTextual.g:537:1: ruleAggregation : ( ( rule__Aggregation__Group__0 ) ) ;
    public final void ruleAggregation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:541:2: ( ( ( rule__Aggregation__Group__0 ) ) )
            // InternalUmlTextual.g:542:2: ( ( rule__Aggregation__Group__0 ) )
            {
            // InternalUmlTextual.g:542:2: ( ( rule__Aggregation__Group__0 ) )
            // InternalUmlTextual.g:543:3: ( rule__Aggregation__Group__0 )
            {
             before(grammarAccess.getAggregationAccess().getGroup()); 
            // InternalUmlTextual.g:544:3: ( rule__Aggregation__Group__0 )
            // InternalUmlTextual.g:544:4: rule__Aggregation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAggregationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAggregation"


    // $ANTLR start "entryRuleComposition"
    // InternalUmlTextual.g:553:1: entryRuleComposition : ruleComposition EOF ;
    public final void entryRuleComposition() throws RecognitionException {
        try {
            // InternalUmlTextual.g:554:1: ( ruleComposition EOF )
            // InternalUmlTextual.g:555:1: ruleComposition EOF
            {
             before(grammarAccess.getCompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleComposition();

            state._fsp--;

             after(grammarAccess.getCompositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // InternalUmlTextual.g:562:1: ruleComposition : ( ( rule__Composition__Group__0 ) ) ;
    public final void ruleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:566:2: ( ( ( rule__Composition__Group__0 ) ) )
            // InternalUmlTextual.g:567:2: ( ( rule__Composition__Group__0 ) )
            {
            // InternalUmlTextual.g:567:2: ( ( rule__Composition__Group__0 ) )
            // InternalUmlTextual.g:568:3: ( rule__Composition__Group__0 )
            {
             before(grammarAccess.getCompositionAccess().getGroup()); 
            // InternalUmlTextual.g:569:3: ( rule__Composition__Group__0 )
            // InternalUmlTextual.g:569:4: rule__Composition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleUseCaseDiagram"
    // InternalUmlTextual.g:578:1: entryRuleUseCaseDiagram : ruleUseCaseDiagram EOF ;
    public final void entryRuleUseCaseDiagram() throws RecognitionException {
        try {
            // InternalUmlTextual.g:579:1: ( ruleUseCaseDiagram EOF )
            // InternalUmlTextual.g:580:1: ruleUseCaseDiagram EOF
            {
             before(grammarAccess.getUseCaseDiagramRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCaseDiagram();

            state._fsp--;

             after(grammarAccess.getUseCaseDiagramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUseCaseDiagram"


    // $ANTLR start "ruleUseCaseDiagram"
    // InternalUmlTextual.g:587:1: ruleUseCaseDiagram : ( ( rule__UseCaseDiagram__Group__0 ) ) ;
    public final void ruleUseCaseDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:591:2: ( ( ( rule__UseCaseDiagram__Group__0 ) ) )
            // InternalUmlTextual.g:592:2: ( ( rule__UseCaseDiagram__Group__0 ) )
            {
            // InternalUmlTextual.g:592:2: ( ( rule__UseCaseDiagram__Group__0 ) )
            // InternalUmlTextual.g:593:3: ( rule__UseCaseDiagram__Group__0 )
            {
             before(grammarAccess.getUseCaseDiagramAccess().getGroup()); 
            // InternalUmlTextual.g:594:3: ( rule__UseCaseDiagram__Group__0 )
            // InternalUmlTextual.g:594:4: rule__UseCaseDiagram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDiagram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseCaseDiagram"


    // $ANTLR start "entryRuleUseCaseElement"
    // InternalUmlTextual.g:603:1: entryRuleUseCaseElement : ruleUseCaseElement EOF ;
    public final void entryRuleUseCaseElement() throws RecognitionException {
        try {
            // InternalUmlTextual.g:604:1: ( ruleUseCaseElement EOF )
            // InternalUmlTextual.g:605:1: ruleUseCaseElement EOF
            {
             before(grammarAccess.getUseCaseElementRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCaseElement();

            state._fsp--;

             after(grammarAccess.getUseCaseElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUseCaseElement"


    // $ANTLR start "ruleUseCaseElement"
    // InternalUmlTextual.g:612:1: ruleUseCaseElement : ( ( rule__UseCaseElement__Alternatives ) ) ;
    public final void ruleUseCaseElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:616:2: ( ( ( rule__UseCaseElement__Alternatives ) ) )
            // InternalUmlTextual.g:617:2: ( ( rule__UseCaseElement__Alternatives ) )
            {
            // InternalUmlTextual.g:617:2: ( ( rule__UseCaseElement__Alternatives ) )
            // InternalUmlTextual.g:618:3: ( rule__UseCaseElement__Alternatives )
            {
             before(grammarAccess.getUseCaseElementAccess().getAlternatives()); 
            // InternalUmlTextual.g:619:3: ( rule__UseCaseElement__Alternatives )
            // InternalUmlTextual.g:619:4: rule__UseCaseElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseCaseElement"


    // $ANTLR start "entryRuleActor"
    // InternalUmlTextual.g:628:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalUmlTextual.g:629:1: ( ruleActor EOF )
            // InternalUmlTextual.g:630:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalUmlTextual.g:637:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:641:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalUmlTextual.g:642:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalUmlTextual.g:642:2: ( ( rule__Actor__Group__0 ) )
            // InternalUmlTextual.g:643:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalUmlTextual.g:644:3: ( rule__Actor__Group__0 )
            // InternalUmlTextual.g:644:4: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleUseCase"
    // InternalUmlTextual.g:653:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // InternalUmlTextual.g:654:1: ( ruleUseCase EOF )
            // InternalUmlTextual.g:655:1: ruleUseCase EOF
            {
             before(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_1);
            ruleUseCase();

            state._fsp--;

             after(grammarAccess.getUseCaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUmlTextual.g:662:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:666:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUmlTextual.g:667:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUmlTextual.g:667:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUmlTextual.g:668:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUmlTextual.g:669:3: ( rule__UseCase__Group__0 )
            // InternalUmlTextual.g:669:4: rule__UseCase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleActorUseCaseAssociation"
    // InternalUmlTextual.g:678:1: entryRuleActorUseCaseAssociation : ruleActorUseCaseAssociation EOF ;
    public final void entryRuleActorUseCaseAssociation() throws RecognitionException {
        try {
            // InternalUmlTextual.g:679:1: ( ruleActorUseCaseAssociation EOF )
            // InternalUmlTextual.g:680:1: ruleActorUseCaseAssociation EOF
            {
             before(grammarAccess.getActorUseCaseAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleActorUseCaseAssociation();

            state._fsp--;

             after(grammarAccess.getActorUseCaseAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActorUseCaseAssociation"


    // $ANTLR start "ruleActorUseCaseAssociation"
    // InternalUmlTextual.g:687:1: ruleActorUseCaseAssociation : ( ( rule__ActorUseCaseAssociation__Group__0 ) ) ;
    public final void ruleActorUseCaseAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:691:2: ( ( ( rule__ActorUseCaseAssociation__Group__0 ) ) )
            // InternalUmlTextual.g:692:2: ( ( rule__ActorUseCaseAssociation__Group__0 ) )
            {
            // InternalUmlTextual.g:692:2: ( ( rule__ActorUseCaseAssociation__Group__0 ) )
            // InternalUmlTextual.g:693:3: ( rule__ActorUseCaseAssociation__Group__0 )
            {
             before(grammarAccess.getActorUseCaseAssociationAccess().getGroup()); 
            // InternalUmlTextual.g:694:3: ( rule__ActorUseCaseAssociation__Group__0 )
            // InternalUmlTextual.g:694:4: rule__ActorUseCaseAssociation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActorUseCaseAssociation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActorUseCaseAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActorUseCaseAssociation"


    // $ANTLR start "rule__ModelElement__Alternatives"
    // InternalUmlTextual.g:702:1: rule__ModelElement__Alternatives : ( ( rulePackage ) | ( ruleUseCaseDiagram ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:706:1: ( ( rulePackage ) | ( ruleUseCaseDiagram ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=16)) ) {
                alt2=1;
            }
            else if ( (LA2_0==55) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUmlTextual.g:707:2: ( rulePackage )
                    {
                    // InternalUmlTextual.g:707:2: ( rulePackage )
                    // InternalUmlTextual.g:708:3: rulePackage
                    {
                     before(grammarAccess.getModelElementAccess().getPackageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getPackageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:713:2: ( ruleUseCaseDiagram )
                    {
                    // InternalUmlTextual.g:713:2: ( ruleUseCaseDiagram )
                    // InternalUmlTextual.g:714:3: ruleUseCaseDiagram
                    {
                     before(grammarAccess.getModelElementAccess().getUseCaseDiagramParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUseCaseDiagram();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getUseCaseDiagramParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelElement__Alternatives"


    // $ANTLR start "rule__Package__TypeAlternatives_0_0"
    // InternalUmlTextual.g:723:1: rule__Package__TypeAlternatives_0_0 : ( ( 'package' ) | ( 'subsystem' ) );
    public final void rule__Package__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:727:1: ( ( 'package' ) | ( 'subsystem' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalUmlTextual.g:728:2: ( 'package' )
                    {
                    // InternalUmlTextual.g:728:2: ( 'package' )
                    // InternalUmlTextual.g:729:3: 'package'
                    {
                     before(grammarAccess.getPackageAccess().getTypePackageKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getTypePackageKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:734:2: ( 'subsystem' )
                    {
                    // InternalUmlTextual.g:734:2: ( 'subsystem' )
                    // InternalUmlTextual.g:735:3: 'subsystem'
                    {
                     before(grammarAccess.getPackageAccess().getTypeSubsystemKeyword_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getTypeSubsystemKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__TypeAlternatives_0_0"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalUmlTextual.g:744:1: rule__Element__Alternatives : ( ( ruleClass ) | ( ruleAssociationConnector ) | ( ruleInterface ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:748:1: ( ( ruleClass ) | ( ruleAssociationConnector ) | ( ruleInterface ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalUmlTextual.g:749:2: ( ruleClass )
                    {
                    // InternalUmlTextual.g:749:2: ( ruleClass )
                    // InternalUmlTextual.g:750:3: ruleClass
                    {
                     before(grammarAccess.getElementAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:755:2: ( ruleAssociationConnector )
                    {
                    // InternalUmlTextual.g:755:2: ( ruleAssociationConnector )
                    // InternalUmlTextual.g:756:3: ruleAssociationConnector
                    {
                     before(grammarAccess.getElementAccess().getAssociationConnectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociationConnector();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getAssociationConnectorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:761:2: ( ruleInterface )
                    {
                    // InternalUmlTextual.g:761:2: ( ruleInterface )
                    // InternalUmlTextual.g:762:3: ruleInterface
                    {
                     before(grammarAccess.getElementAccess().getInterfaceParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInterface();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getInterfaceParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalUmlTextual.g:771:1: rule__Visibility__Alternatives : ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:775:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUmlTextual.g:776:2: ( 'public' )
                    {
                    // InternalUmlTextual.g:776:2: ( 'public' )
                    // InternalUmlTextual.g:777:3: 'public'
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getPublicKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:782:2: ( 'private' )
                    {
                    // InternalUmlTextual.g:782:2: ( 'private' )
                    // InternalUmlTextual.g:783:3: 'private'
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getPrivateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:788:2: ( 'protected' )
                    {
                    // InternalUmlTextual.g:788:2: ( 'protected' )
                    // InternalUmlTextual.g:789:3: 'protected'
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getProtectedKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:794:2: ( 'package' )
                    {
                    // InternalUmlTextual.g:794:2: ( 'package' )
                    // InternalUmlTextual.g:795:3: 'package'
                    {
                     before(grammarAccess.getVisibilityAccess().getPackageKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getPackageKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visibility__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // InternalUmlTextual.g:804:1: rule__AttributeType__Alternatives : ( ( ( rule__AttributeType__NameAssignment_0 ) ) | ( ( rule__AttributeType__NameAssignment_1 ) ) | ( ( rule__AttributeType__NameAssignment_2 ) ) | ( ( rule__AttributeType__NameAssignment_3 ) ) | ( ( rule__AttributeType__NameAssignment_4 ) ) | ( ( rule__AttributeType__NameAssignment_5 ) ) | ( ( rule__AttributeType__NameAssignment_6 ) ) | ( ( rule__AttributeType__NameAssignment_7 ) ) | ( ( rule__AttributeType__NameAssignment_8 ) ) | ( ruleDomainSpecificType ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:808:1: ( ( ( rule__AttributeType__NameAssignment_0 ) ) | ( ( rule__AttributeType__NameAssignment_1 ) ) | ( ( rule__AttributeType__NameAssignment_2 ) ) | ( ( rule__AttributeType__NameAssignment_3 ) ) | ( ( rule__AttributeType__NameAssignment_4 ) ) | ( ( rule__AttributeType__NameAssignment_5 ) ) | ( ( rule__AttributeType__NameAssignment_6 ) ) | ( ( rule__AttributeType__NameAssignment_7 ) ) | ( ( rule__AttributeType__NameAssignment_8 ) ) | ( ruleDomainSpecificType ) )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt6=1;
                }
                break;
            case 61:
                {
                alt6=2;
                }
                break;
            case 62:
                {
                alt6=3;
                }
                break;
            case 63:
                {
                alt6=4;
                }
                break;
            case 64:
                {
                alt6=5;
                }
                break;
            case 65:
                {
                alt6=6;
                }
                break;
            case 66:
                {
                alt6=7;
                }
                break;
            case 67:
                {
                alt6=8;
                }
                break;
            case 68:
                {
                alt6=9;
                }
                break;
            case RULE_ID:
                {
                alt6=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUmlTextual.g:809:2: ( ( rule__AttributeType__NameAssignment_0 ) )
                    {
                    // InternalUmlTextual.g:809:2: ( ( rule__AttributeType__NameAssignment_0 ) )
                    // InternalUmlTextual.g:810:3: ( rule__AttributeType__NameAssignment_0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_0()); 
                    // InternalUmlTextual.g:811:3: ( rule__AttributeType__NameAssignment_0 )
                    // InternalUmlTextual.g:811:4: rule__AttributeType__NameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:815:2: ( ( rule__AttributeType__NameAssignment_1 ) )
                    {
                    // InternalUmlTextual.g:815:2: ( ( rule__AttributeType__NameAssignment_1 ) )
                    // InternalUmlTextual.g:816:3: ( rule__AttributeType__NameAssignment_1 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_1()); 
                    // InternalUmlTextual.g:817:3: ( rule__AttributeType__NameAssignment_1 )
                    // InternalUmlTextual.g:817:4: rule__AttributeType__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getNameAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:821:2: ( ( rule__AttributeType__NameAssignment_2 ) )
                    {
                    // InternalUmlTextual.g:821:2: ( ( rule__AttributeType__NameAssignment_2 ) )
                    // InternalUmlTextual.g:822:3: ( rule__AttributeType__NameAssignment_2 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_2()); 
                    // InternalUmlTextual.g:823:3: ( rule__AttributeType__NameAssignment_2 )
                    // InternalUmlTextual.g:823:4: rule__AttributeType__NameAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__NameAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getNameAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:827:2: ( ( rule__AttributeType__NameAssignment_3 ) )
                    {
                    // InternalUmlTextual.g:827:2: ( ( rule__AttributeType__NameAssignment_3 ) )
                    // InternalUmlTextual.g:828:3: ( rule__AttributeType__NameAssignment_3 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_3()); 
                    // InternalUmlTextual.g:829:3: ( rule__AttributeType__NameAssignment_3 )
                    // InternalUmlTextual.g:829:4: rule__AttributeType__NameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__NameAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getNameAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUmlTextual.g:833:2: ( ( rule__AttributeType__NameAssignment_4 ) )
                    {
                    // InternalUmlTextual.g:833:2: ( ( rule__AttributeType__NameAssignment_4 ) )
                    // InternalUmlTextual.g:834:3: ( rule__AttributeType__NameAssignment_4 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_4()); 
                    // InternalUmlTextual.g:835:3: ( rule__AttributeType__NameAssignment_4 )
                    // InternalUmlTextual.g:835:4: rule__AttributeType__NameAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__NameAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getNameAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUmlTextual.g:839:2: ( ( rule__AttributeType__NameAssignment_5 ) )
                    {
                    // InternalUmlTextual.g:839:2: ( ( rule__AttributeType__NameAssignment_5 ) )
                    // InternalUmlTextual.g:840:3: ( rule__AttributeType__NameAssignment_5 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_5()); 
                    // InternalUmlTextual.g:841:3: ( rule__AttributeType__NameAssignment_5 )
                    // InternalUmlTextual.g:841:4: rule__AttributeType__NameAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__NameAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getNameAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUmlTextual.g:845:2: ( ( rule__AttributeType__NameAssignment_6 ) )
                    {
                    // InternalUmlTextual.g:845:2: ( ( rule__AttributeType__NameAssignment_6 ) )
                    // InternalUmlTextual.g:846:3: ( rule__AttributeType__NameAssignment_6 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_6()); 
                    // InternalUmlTextual.g:847:3: ( rule__AttributeType__NameAssignment_6 )
                    // InternalUmlTextual.g:847:4: rule__AttributeType__NameAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__NameAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getNameAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUmlTextual.g:851:2: ( ( rule__AttributeType__NameAssignment_7 ) )
                    {
                    // InternalUmlTextual.g:851:2: ( ( rule__AttributeType__NameAssignment_7 ) )
                    // InternalUmlTextual.g:852:3: ( rule__AttributeType__NameAssignment_7 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_7()); 
                    // InternalUmlTextual.g:853:3: ( rule__AttributeType__NameAssignment_7 )
                    // InternalUmlTextual.g:853:4: rule__AttributeType__NameAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__NameAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getNameAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUmlTextual.g:857:2: ( ( rule__AttributeType__NameAssignment_8 ) )
                    {
                    // InternalUmlTextual.g:857:2: ( ( rule__AttributeType__NameAssignment_8 ) )
                    // InternalUmlTextual.g:858:3: ( rule__AttributeType__NameAssignment_8 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_8()); 
                    // InternalUmlTextual.g:859:3: ( rule__AttributeType__NameAssignment_8 )
                    // InternalUmlTextual.g:859:4: rule__AttributeType__NameAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__NameAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getNameAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalUmlTextual.g:863:2: ( ruleDomainSpecificType )
                    {
                    // InternalUmlTextual.g:863:2: ( ruleDomainSpecificType )
                    // InternalUmlTextual.g:864:3: ruleDomainSpecificType
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDomainSpecificTypeParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleDomainSpecificType();

                    state._fsp--;

                     after(grammarAccess.getAttributeTypeAccess().getDomainSpecificTypeParserRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__Multiplicity__Alternatives"
    // InternalUmlTextual.g:873:1: rule__Multiplicity__Alternatives : ( ( '1' ) | ( '0..1' ) | ( '0..*' ) | ( '*' ) | ( '1..*' ) | ( ( rule__Multiplicity__Group_5__0 ) ) | ( ( rule__Multiplicity__Group_6__0 ) ) | ( RULE_INT ) | ( ( rule__Multiplicity__Group_8__0 ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:877:1: ( ( '1' ) | ( '0..1' ) | ( '0..*' ) | ( '*' ) | ( '1..*' ) | ( ( rule__Multiplicity__Group_5__0 ) ) | ( ( rule__Multiplicity__Group_6__0 ) ) | ( RULE_INT ) | ( ( rule__Multiplicity__Group_8__0 ) ) )
            int alt7=9;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalUmlTextual.g:878:2: ( '1' )
                    {
                    // InternalUmlTextual.g:878:2: ( '1' )
                    // InternalUmlTextual.g:879:3: '1'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitOneKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:884:2: ( '0..1' )
                    {
                    // InternalUmlTextual.g:884:2: ( '0..1' )
                    // InternalUmlTextual.g:885:3: '0..1'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:890:2: ( '0..*' )
                    {
                    // InternalUmlTextual.g:890:2: ( '0..*' )
                    // InternalUmlTextual.g:891:3: '0..*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:896:2: ( '*' )
                    {
                    // InternalUmlTextual.g:896:2: ( '*' )
                    // InternalUmlTextual.g:897:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUmlTextual.g:902:2: ( '1..*' )
                    {
                    // InternalUmlTextual.g:902:2: ( '1..*' )
                    // InternalUmlTextual.g:903:3: '1..*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopAsteriskKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopAsteriskKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUmlTextual.g:908:2: ( ( rule__Multiplicity__Group_5__0 ) )
                    {
                    // InternalUmlTextual.g:908:2: ( ( rule__Multiplicity__Group_5__0 ) )
                    // InternalUmlTextual.g:909:3: ( rule__Multiplicity__Group_5__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_5()); 
                    // InternalUmlTextual.g:910:3: ( rule__Multiplicity__Group_5__0 )
                    // InternalUmlTextual.g:910:4: rule__Multiplicity__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplicity__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicityAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUmlTextual.g:914:2: ( ( rule__Multiplicity__Group_6__0 ) )
                    {
                    // InternalUmlTextual.g:914:2: ( ( rule__Multiplicity__Group_6__0 ) )
                    // InternalUmlTextual.g:915:3: ( rule__Multiplicity__Group_6__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_6()); 
                    // InternalUmlTextual.g:916:3: ( rule__Multiplicity__Group_6__0 )
                    // InternalUmlTextual.g:916:4: rule__Multiplicity__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplicity__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicityAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUmlTextual.g:920:2: ( RULE_INT )
                    {
                    // InternalUmlTextual.g:920:2: ( RULE_INT )
                    // InternalUmlTextual.g:921:3: RULE_INT
                    {
                     before(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_7()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUmlTextual.g:926:2: ( ( rule__Multiplicity__Group_8__0 ) )
                    {
                    // InternalUmlTextual.g:926:2: ( ( rule__Multiplicity__Group_8__0 ) )
                    // InternalUmlTextual.g:927:3: ( rule__Multiplicity__Group_8__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_8()); 
                    // InternalUmlTextual.g:928:3: ( rule__Multiplicity__Group_8__0 )
                    // InternalUmlTextual.g:928:4: rule__Multiplicity__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplicity__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicityAccess().getGroup_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Alternatives"


    // $ANTLR start "rule__AssociationConnector__Alternatives"
    // InternalUmlTextual.g:936:1: rule__AssociationConnector__Alternatives : ( ( ruleAssociation ) | ( ruleAggregation ) | ( ruleComposition ) );
    public final void rule__AssociationConnector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:940:1: ( ( ruleAssociation ) | ( ruleAggregation ) | ( ruleComposition ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 47:
            case 48:
                {
                alt8=1;
                }
                break;
            case 53:
                {
                alt8=2;
                }
                break;
            case 54:
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
                    // InternalUmlTextual.g:941:2: ( ruleAssociation )
                    {
                    // InternalUmlTextual.g:941:2: ( ruleAssociation )
                    // InternalUmlTextual.g:942:3: ruleAssociation
                    {
                     before(grammarAccess.getAssociationConnectorAccess().getAssociationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAssociation();

                    state._fsp--;

                     after(grammarAccess.getAssociationConnectorAccess().getAssociationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:947:2: ( ruleAggregation )
                    {
                    // InternalUmlTextual.g:947:2: ( ruleAggregation )
                    // InternalUmlTextual.g:948:3: ruleAggregation
                    {
                     before(grammarAccess.getAssociationConnectorAccess().getAggregationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAggregation();

                    state._fsp--;

                     after(grammarAccess.getAssociationConnectorAccess().getAggregationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:953:2: ( ruleComposition )
                    {
                    // InternalUmlTextual.g:953:2: ( ruleComposition )
                    // InternalUmlTextual.g:954:3: ruleComposition
                    {
                     before(grammarAccess.getAssociationConnectorAccess().getCompositionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComposition();

                    state._fsp--;

                     after(grammarAccess.getAssociationConnectorAccess().getCompositionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssociationConnector__Alternatives"


    // $ANTLR start "rule__Association__NameAlternatives_2_0"
    // InternalUmlTextual.g:963:1: rule__Association__NameAlternatives_2_0 : ( ( RULE_ID ) | ( ruleUnamed ) );
    public final void rule__Association__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:967:1: ( ( RULE_ID ) | ( ruleUnamed ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUmlTextual.g:968:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:968:2: ( RULE_ID )
                    // InternalUmlTextual.g:969:3: RULE_ID
                    {
                     before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:974:2: ( ruleUnamed )
                    {
                    // InternalUmlTextual.g:974:2: ( ruleUnamed )
                    // InternalUmlTextual.g:975:3: ruleUnamed
                    {
                     before(grammarAccess.getAssociationAccess().getNameUnamedParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnamed();

                    state._fsp--;

                     after(grammarAccess.getAssociationAccess().getNameUnamedParserRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NameAlternatives_2_0"


    // $ANTLR start "rule__Aggregation__NameAlternatives_1_0"
    // InternalUmlTextual.g:984:1: rule__Aggregation__NameAlternatives_1_0 : ( ( RULE_ID ) | ( ruleUnamed ) );
    public final void rule__Aggregation__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:988:1: ( ( RULE_ID ) | ( ruleUnamed ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==13) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUmlTextual.g:989:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:989:2: ( RULE_ID )
                    // InternalUmlTextual.g:990:3: RULE_ID
                    {
                     before(grammarAccess.getAggregationAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAggregationAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:995:2: ( ruleUnamed )
                    {
                    // InternalUmlTextual.g:995:2: ( ruleUnamed )
                    // InternalUmlTextual.g:996:3: ruleUnamed
                    {
                     before(grammarAccess.getAggregationAccess().getNameUnamedParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnamed();

                    state._fsp--;

                     after(grammarAccess.getAggregationAccess().getNameUnamedParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__NameAlternatives_1_0"


    // $ANTLR start "rule__Composition__NameAlternatives_1_0"
    // InternalUmlTextual.g:1005:1: rule__Composition__NameAlternatives_1_0 : ( ( RULE_ID ) | ( ruleUnamed ) );
    public final void rule__Composition__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1009:1: ( ( RULE_ID ) | ( ruleUnamed ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==13) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUmlTextual.g:1010:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:1010:2: ( RULE_ID )
                    // InternalUmlTextual.g:1011:3: RULE_ID
                    {
                     before(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:1016:2: ( ruleUnamed )
                    {
                    // InternalUmlTextual.g:1016:2: ( ruleUnamed )
                    // InternalUmlTextual.g:1017:3: ruleUnamed
                    {
                     before(grammarAccess.getCompositionAccess().getNameUnamedParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnamed();

                    state._fsp--;

                     after(grammarAccess.getCompositionAccess().getNameUnamedParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__NameAlternatives_1_0"


    // $ANTLR start "rule__UseCaseElement__Alternatives"
    // InternalUmlTextual.g:1026:1: rule__UseCaseElement__Alternatives : ( ( ruleActor ) | ( ruleUseCase ) );
    public final void rule__UseCaseElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1030:1: ( ( ruleActor ) | ( ruleUseCase ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)||LA12_0==15||(LA12_0>=17 && LA12_0<=19)||LA12_0==57||LA12_0==69) ) {
                alt12=1;
            }
            else if ( (LA12_0==55) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUmlTextual.g:1031:2: ( ruleActor )
                    {
                    // InternalUmlTextual.g:1031:2: ( ruleActor )
                    // InternalUmlTextual.g:1032:3: ruleActor
                    {
                     before(grammarAccess.getUseCaseElementAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActor();

                    state._fsp--;

                     after(grammarAccess.getUseCaseElementAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:1037:2: ( ruleUseCase )
                    {
                    // InternalUmlTextual.g:1037:2: ( ruleUseCase )
                    // InternalUmlTextual.g:1038:3: ruleUseCase
                    {
                     before(grammarAccess.getUseCaseElementAccess().getUseCaseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUseCase();

                    state._fsp--;

                     after(grammarAccess.getUseCaseElementAccess().getUseCaseParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseElement__Alternatives"


    // $ANTLR start "rule__UseCase__Alternatives_6_1"
    // InternalUmlTextual.g:1047:1: rule__UseCase__Alternatives_6_1 : ( ( ( rule__UseCase__Group_6_1_0__0 ) ) | ( ( rule__UseCase__Group_6_1_1__0 ) ) );
    public final void rule__UseCase__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1051:1: ( ( ( rule__UseCase__Group_6_1_0__0 ) ) | ( ( rule__UseCase__Group_6_1_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==58) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUmlTextual.g:1052:2: ( ( rule__UseCase__Group_6_1_0__0 ) )
                    {
                    // InternalUmlTextual.g:1052:2: ( ( rule__UseCase__Group_6_1_0__0 ) )
                    // InternalUmlTextual.g:1053:3: ( rule__UseCase__Group_6_1_0__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_6_1_0()); 
                    // InternalUmlTextual.g:1054:3: ( rule__UseCase__Group_6_1_0__0 )
                    // InternalUmlTextual.g:1054:4: rule__UseCase__Group_6_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_6_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseAccess().getGroup_6_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:1058:2: ( ( rule__UseCase__Group_6_1_1__0 ) )
                    {
                    // InternalUmlTextual.g:1058:2: ( ( rule__UseCase__Group_6_1_1__0 ) )
                    // InternalUmlTextual.g:1059:3: ( rule__UseCase__Group_6_1_1__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_6_1_1()); 
                    // InternalUmlTextual.g:1060:3: ( rule__UseCase__Group_6_1_1__0 )
                    // InternalUmlTextual.g:1060:4: rule__UseCase__Group_6_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_6_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUseCaseAccess().getGroup_6_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Alternatives_6_1"


    // $ANTLR start "rule__Package__Group__0"
    // InternalUmlTextual.g:1068:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1072:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalUmlTextual.g:1073:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalUmlTextual.g:1080:1: rule__Package__Group__0__Impl : ( ( rule__Package__TypeAssignment_0 ) ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1084:1: ( ( ( rule__Package__TypeAssignment_0 ) ) )
            // InternalUmlTextual.g:1085:1: ( ( rule__Package__TypeAssignment_0 ) )
            {
            // InternalUmlTextual.g:1085:1: ( ( rule__Package__TypeAssignment_0 ) )
            // InternalUmlTextual.g:1086:2: ( rule__Package__TypeAssignment_0 )
            {
             before(grammarAccess.getPackageAccess().getTypeAssignment_0()); 
            // InternalUmlTextual.g:1087:2: ( rule__Package__TypeAssignment_0 )
            // InternalUmlTextual.g:1087:3: rule__Package__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalUmlTextual.g:1095:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1099:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalUmlTextual.g:1100:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalUmlTextual.g:1107:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1111:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:1112:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:1112:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalUmlTextual.g:1113:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:1114:2: ( rule__Package__NameAssignment_1 )
            // InternalUmlTextual.g:1114:3: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalUmlTextual.g:1122:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1126:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalUmlTextual.g:1127:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalUmlTextual.g:1134:1: rule__Package__Group__2__Impl : ( ( rule__Package__Group_2__0 )? ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1138:1: ( ( ( rule__Package__Group_2__0 )? ) )
            // InternalUmlTextual.g:1139:1: ( ( rule__Package__Group_2__0 )? )
            {
            // InternalUmlTextual.g:1139:1: ( ( rule__Package__Group_2__0 )? )
            // InternalUmlTextual.g:1140:2: ( rule__Package__Group_2__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_2()); 
            // InternalUmlTextual.g:1141:2: ( rule__Package__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUmlTextual.g:1141:3: rule__Package__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Package__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalUmlTextual.g:1149:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1153:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalUmlTextual.g:1154:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalUmlTextual.g:1161:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1165:1: ( ( '{' ) )
            // InternalUmlTextual.g:1166:1: ( '{' )
            {
            // InternalUmlTextual.g:1166:1: ( '{' )
            // InternalUmlTextual.g:1167:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalUmlTextual.g:1176:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1180:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalUmlTextual.g:1181:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalUmlTextual.g:1188:1: rule__Package__Group__4__Impl : ( ( rule__Package__ElementsAssignment_4 )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1192:1: ( ( ( rule__Package__ElementsAssignment_4 )* ) )
            // InternalUmlTextual.g:1193:1: ( ( rule__Package__ElementsAssignment_4 )* )
            {
            // InternalUmlTextual.g:1193:1: ( ( rule__Package__ElementsAssignment_4 )* )
            // InternalUmlTextual.g:1194:2: ( rule__Package__ElementsAssignment_4 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_4()); 
            // InternalUmlTextual.g:1195:2: ( rule__Package__ElementsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15||(LA15_0>=17 && LA15_0<=19)||(LA15_0>=29 && LA15_0<=30)||LA15_0==34||(LA15_0>=47 && LA15_0<=48)||(LA15_0>=53 && LA15_0<=54)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUmlTextual.g:1195:3: rule__Package__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Package__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalUmlTextual.g:1203:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1207:1: ( rule__Package__Group__5__Impl )
            // InternalUmlTextual.g:1208:2: rule__Package__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // InternalUmlTextual.g:1214:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1218:1: ( ( '}' ) )
            // InternalUmlTextual.g:1219:1: ( '}' )
            {
            // InternalUmlTextual.g:1219:1: ( '}' )
            // InternalUmlTextual.g:1220:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group_2__0"
    // InternalUmlTextual.g:1230:1: rule__Package__Group_2__0 : rule__Package__Group_2__0__Impl rule__Package__Group_2__1 ;
    public final void rule__Package__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1234:1: ( rule__Package__Group_2__0__Impl rule__Package__Group_2__1 )
            // InternalUmlTextual.g:1235:2: rule__Package__Group_2__0__Impl rule__Package__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Package__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__0"


    // $ANTLR start "rule__Package__Group_2__0__Impl"
    // InternalUmlTextual.g:1242:1: rule__Package__Group_2__0__Impl : ( 'depends' ) ;
    public final void rule__Package__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1246:1: ( ( 'depends' ) )
            // InternalUmlTextual.g:1247:1: ( 'depends' )
            {
            // InternalUmlTextual.g:1247:1: ( 'depends' )
            // InternalUmlTextual.g:1248:2: 'depends'
            {
             before(grammarAccess.getPackageAccess().getDependsKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getDependsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__0__Impl"


    // $ANTLR start "rule__Package__Group_2__1"
    // InternalUmlTextual.g:1257:1: rule__Package__Group_2__1 : rule__Package__Group_2__1__Impl rule__Package__Group_2__2 ;
    public final void rule__Package__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1261:1: ( rule__Package__Group_2__1__Impl rule__Package__Group_2__2 )
            // InternalUmlTextual.g:1262:2: rule__Package__Group_2__1__Impl rule__Package__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__1"


    // $ANTLR start "rule__Package__Group_2__1__Impl"
    // InternalUmlTextual.g:1269:1: rule__Package__Group_2__1__Impl : ( 'on' ) ;
    public final void rule__Package__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1273:1: ( ( 'on' ) )
            // InternalUmlTextual.g:1274:1: ( 'on' )
            {
            // InternalUmlTextual.g:1274:1: ( 'on' )
            // InternalUmlTextual.g:1275:2: 'on'
            {
             before(grammarAccess.getPackageAccess().getOnKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getOnKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__1__Impl"


    // $ANTLR start "rule__Package__Group_2__2"
    // InternalUmlTextual.g:1284:1: rule__Package__Group_2__2 : rule__Package__Group_2__2__Impl ;
    public final void rule__Package__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1288:1: ( rule__Package__Group_2__2__Impl )
            // InternalUmlTextual.g:1289:2: rule__Package__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__2"


    // $ANTLR start "rule__Package__Group_2__2__Impl"
    // InternalUmlTextual.g:1295:1: rule__Package__Group_2__2__Impl : ( ( rule__Package__ParentPackageAssignment_2_2 ) ) ;
    public final void rule__Package__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1299:1: ( ( ( rule__Package__ParentPackageAssignment_2_2 ) ) )
            // InternalUmlTextual.g:1300:1: ( ( rule__Package__ParentPackageAssignment_2_2 ) )
            {
            // InternalUmlTextual.g:1300:1: ( ( rule__Package__ParentPackageAssignment_2_2 ) )
            // InternalUmlTextual.g:1301:2: ( rule__Package__ParentPackageAssignment_2_2 )
            {
             before(grammarAccess.getPackageAccess().getParentPackageAssignment_2_2()); 
            // InternalUmlTextual.g:1302:2: ( rule__Package__ParentPackageAssignment_2_2 )
            // InternalUmlTextual.g:1302:3: rule__Package__ParentPackageAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__ParentPackageAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getParentPackageAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_2__2__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalUmlTextual.g:1311:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1315:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalUmlTextual.g:1316:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalUmlTextual.g:1323:1: rule__Class__Group__0__Impl : ( ( rule__Class__Group_0__0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1327:1: ( ( ( rule__Class__Group_0__0 )? ) )
            // InternalUmlTextual.g:1328:1: ( ( rule__Class__Group_0__0 )? )
            {
            // InternalUmlTextual.g:1328:1: ( ( rule__Class__Group_0__0 )? )
            // InternalUmlTextual.g:1329:2: ( rule__Class__Group_0__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_0()); 
            // InternalUmlTextual.g:1330:2: ( rule__Class__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUmlTextual.g:1330:3: rule__Class__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalUmlTextual.g:1338:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1342:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalUmlTextual.g:1343:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalUmlTextual.g:1350:1: rule__Class__Group__1__Impl : ( ( rule__Class__VisibilityAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1354:1: ( ( ( rule__Class__VisibilityAssignment_1 )? ) )
            // InternalUmlTextual.g:1355:1: ( ( rule__Class__VisibilityAssignment_1 )? )
            {
            // InternalUmlTextual.g:1355:1: ( ( rule__Class__VisibilityAssignment_1 )? )
            // InternalUmlTextual.g:1356:2: ( rule__Class__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_1()); 
            // InternalUmlTextual.g:1357:2: ( rule__Class__VisibilityAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15||(LA17_0>=17 && LA17_0<=19)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUmlTextual.g:1357:3: rule__Class__VisibilityAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__VisibilityAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getVisibilityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalUmlTextual.g:1365:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1369:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalUmlTextual.g:1370:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalUmlTextual.g:1377:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1381:1: ( ( 'class' ) )
            // InternalUmlTextual.g:1382:1: ( 'class' )
            {
            // InternalUmlTextual.g:1382:1: ( 'class' )
            // InternalUmlTextual.g:1383:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalUmlTextual.g:1392:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1396:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalUmlTextual.g:1397:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalUmlTextual.g:1404:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1408:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalUmlTextual.g:1409:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalUmlTextual.g:1409:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalUmlTextual.g:1410:2: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // InternalUmlTextual.g:1411:2: ( rule__Class__NameAssignment_3 )
            // InternalUmlTextual.g:1411:3: rule__Class__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalUmlTextual.g:1419:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1423:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalUmlTextual.g:1424:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalUmlTextual.g:1431:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1435:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalUmlTextual.g:1436:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalUmlTextual.g:1436:1: ( ( rule__Class__Group_4__0 )? )
            // InternalUmlTextual.g:1437:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalUmlTextual.g:1438:2: ( rule__Class__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUmlTextual.g:1438:3: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalUmlTextual.g:1446:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1450:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalUmlTextual.g:1451:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalUmlTextual.g:1458:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1462:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalUmlTextual.g:1463:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalUmlTextual.g:1463:1: ( ( rule__Class__Group_5__0 )? )
            // InternalUmlTextual.g:1464:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalUmlTextual.g:1465:2: ( rule__Class__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUmlTextual.g:1465:3: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalUmlTextual.g:1473:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1477:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalUmlTextual.g:1478:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalUmlTextual.g:1485:1: rule__Class__Group__6__Impl : ( '{' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1489:1: ( ( '{' ) )
            // InternalUmlTextual.g:1490:1: ( '{' )
            {
            // InternalUmlTextual.g:1490:1: ( '{' )
            // InternalUmlTextual.g:1491:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalUmlTextual.g:1500:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1504:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalUmlTextual.g:1505:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalUmlTextual.g:1512:1: rule__Class__Group__7__Impl : ( ( rule__Class__AttributesAssignment_7 )* ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1516:1: ( ( ( rule__Class__AttributesAssignment_7 )* ) )
            // InternalUmlTextual.g:1517:1: ( ( rule__Class__AttributesAssignment_7 )* )
            {
            // InternalUmlTextual.g:1517:1: ( ( rule__Class__AttributesAssignment_7 )* )
            // InternalUmlTextual.g:1518:2: ( rule__Class__AttributesAssignment_7 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_7()); 
            // InternalUmlTextual.g:1519:2: ( rule__Class__AttributesAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (LA20_2==38) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (LA20_3==38) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (LA20_4==38) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 15:
                    {
                    int LA20_5 = input.LA(2);

                    if ( (LA20_5==38) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 38:
                    {
                    alt20=1;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalUmlTextual.g:1519:3: rule__Class__AttributesAssignment_7
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Class__AttributesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAttributesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group__8"
    // InternalUmlTextual.g:1527:1: rule__Class__Group__8 : rule__Class__Group__8__Impl rule__Class__Group__9 ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1531:1: ( rule__Class__Group__8__Impl rule__Class__Group__9 )
            // InternalUmlTextual.g:1532:2: rule__Class__Group__8__Impl rule__Class__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Class__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8"


    // $ANTLR start "rule__Class__Group__8__Impl"
    // InternalUmlTextual.g:1539:1: rule__Class__Group__8__Impl : ( ( rule__Class__MethodsAssignment_8 )* ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1543:1: ( ( ( rule__Class__MethodsAssignment_8 )* ) )
            // InternalUmlTextual.g:1544:1: ( ( rule__Class__MethodsAssignment_8 )* )
            {
            // InternalUmlTextual.g:1544:1: ( ( rule__Class__MethodsAssignment_8 )* )
            // InternalUmlTextual.g:1545:2: ( rule__Class__MethodsAssignment_8 )*
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_8()); 
            // InternalUmlTextual.g:1546:2: ( rule__Class__MethodsAssignment_8 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==11||LA21_0==15||(LA21_0>=17 && LA21_0<=19)||(LA21_0>=42 && LA21_0<=43)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUmlTextual.g:1546:3: rule__Class__MethodsAssignment_8
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Class__MethodsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getMethodsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__8__Impl"


    // $ANTLR start "rule__Class__Group__9"
    // InternalUmlTextual.g:1554:1: rule__Class__Group__9 : rule__Class__Group__9__Impl ;
    public final void rule__Class__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1558:1: ( rule__Class__Group__9__Impl )
            // InternalUmlTextual.g:1559:2: rule__Class__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__9"


    // $ANTLR start "rule__Class__Group__9__Impl"
    // InternalUmlTextual.g:1565:1: rule__Class__Group__9__Impl : ( '}' ) ;
    public final void rule__Class__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1569:1: ( ( '}' ) )
            // InternalUmlTextual.g:1570:1: ( '}' )
            {
            // InternalUmlTextual.g:1570:1: ( '}' )
            // InternalUmlTextual.g:1571:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__9__Impl"


    // $ANTLR start "rule__Class__Group_0__0"
    // InternalUmlTextual.g:1581:1: rule__Class__Group_0__0 : rule__Class__Group_0__0__Impl rule__Class__Group_0__1 ;
    public final void rule__Class__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1585:1: ( rule__Class__Group_0__0__Impl rule__Class__Group_0__1 )
            // InternalUmlTextual.g:1586:2: rule__Class__Group_0__0__Impl rule__Class__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_0__0"


    // $ANTLR start "rule__Class__Group_0__0__Impl"
    // InternalUmlTextual.g:1593:1: rule__Class__Group_0__0__Impl : ( '@' ) ;
    public final void rule__Class__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1597:1: ( ( '@' ) )
            // InternalUmlTextual.g:1598:1: ( '@' )
            {
            // InternalUmlTextual.g:1598:1: ( '@' )
            // InternalUmlTextual.g:1599:2: '@'
            {
             before(grammarAccess.getClassAccess().getCommercialAtKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommercialAtKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_0__0__Impl"


    // $ANTLR start "rule__Class__Group_0__1"
    // InternalUmlTextual.g:1608:1: rule__Class__Group_0__1 : rule__Class__Group_0__1__Impl ;
    public final void rule__Class__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1612:1: ( rule__Class__Group_0__1__Impl )
            // InternalUmlTextual.g:1613:2: rule__Class__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_0__1"


    // $ANTLR start "rule__Class__Group_0__1__Impl"
    // InternalUmlTextual.g:1619:1: rule__Class__Group_0__1__Impl : ( ( rule__Class__StereotypeAssignment_0_1 ) ) ;
    public final void rule__Class__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1623:1: ( ( ( rule__Class__StereotypeAssignment_0_1 ) ) )
            // InternalUmlTextual.g:1624:1: ( ( rule__Class__StereotypeAssignment_0_1 ) )
            {
            // InternalUmlTextual.g:1624:1: ( ( rule__Class__StereotypeAssignment_0_1 ) )
            // InternalUmlTextual.g:1625:2: ( rule__Class__StereotypeAssignment_0_1 )
            {
             before(grammarAccess.getClassAccess().getStereotypeAssignment_0_1()); 
            // InternalUmlTextual.g:1626:2: ( rule__Class__StereotypeAssignment_0_1 )
            // InternalUmlTextual.g:1626:3: rule__Class__StereotypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__StereotypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getStereotypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_0__1__Impl"


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalUmlTextual.g:1635:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1639:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalUmlTextual.g:1640:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalUmlTextual.g:1647:1: rule__Class__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1651:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:1652:1: ( 'extends' )
            {
            // InternalUmlTextual.g:1652:1: ( 'extends' )
            // InternalUmlTextual.g:1653:2: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalUmlTextual.g:1662:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1666:1: ( rule__Class__Group_4__1__Impl )
            // InternalUmlTextual.g:1667:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalUmlTextual.g:1673:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__ParentClassAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1677:1: ( ( ( rule__Class__ParentClassAssignment_4_1 ) ) )
            // InternalUmlTextual.g:1678:1: ( ( rule__Class__ParentClassAssignment_4_1 ) )
            {
            // InternalUmlTextual.g:1678:1: ( ( rule__Class__ParentClassAssignment_4_1 ) )
            // InternalUmlTextual.g:1679:2: ( rule__Class__ParentClassAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getParentClassAssignment_4_1()); 
            // InternalUmlTextual.g:1680:2: ( rule__Class__ParentClassAssignment_4_1 )
            // InternalUmlTextual.g:1680:3: rule__Class__ParentClassAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__ParentClassAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getParentClassAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalUmlTextual.g:1689:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1693:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalUmlTextual.g:1694:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // InternalUmlTextual.g:1701:1: rule__Class__Group_5__0__Impl : ( 'implements' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1705:1: ( ( 'implements' ) )
            // InternalUmlTextual.g:1706:1: ( 'implements' )
            {
            // InternalUmlTextual.g:1706:1: ( 'implements' )
            // InternalUmlTextual.g:1707:2: 'implements'
            {
             before(grammarAccess.getClassAccess().getImplementsKeyword_5_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getImplementsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // InternalUmlTextual.g:1716:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1720:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalUmlTextual.g:1721:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__Class__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // InternalUmlTextual.g:1728:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__InterfaceAssignment_5_1 ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1732:1: ( ( ( rule__Class__InterfaceAssignment_5_1 ) ) )
            // InternalUmlTextual.g:1733:1: ( ( rule__Class__InterfaceAssignment_5_1 ) )
            {
            // InternalUmlTextual.g:1733:1: ( ( rule__Class__InterfaceAssignment_5_1 ) )
            // InternalUmlTextual.g:1734:2: ( rule__Class__InterfaceAssignment_5_1 )
            {
             before(grammarAccess.getClassAccess().getInterfaceAssignment_5_1()); 
            // InternalUmlTextual.g:1735:2: ( rule__Class__InterfaceAssignment_5_1 )
            // InternalUmlTextual.g:1735:3: rule__Class__InterfaceAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__InterfaceAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getInterfaceAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_5__2"
    // InternalUmlTextual.g:1743:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1747:1: ( rule__Class__Group_5__2__Impl )
            // InternalUmlTextual.g:1748:2: rule__Class__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2"


    // $ANTLR start "rule__Class__Group_5__2__Impl"
    // InternalUmlTextual.g:1754:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__Group_5_2__0 )* ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1758:1: ( ( ( rule__Class__Group_5_2__0 )* ) )
            // InternalUmlTextual.g:1759:1: ( ( rule__Class__Group_5_2__0 )* )
            {
            // InternalUmlTextual.g:1759:1: ( ( rule__Class__Group_5_2__0 )* )
            // InternalUmlTextual.g:1760:2: ( rule__Class__Group_5_2__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_5_2()); 
            // InternalUmlTextual.g:1761:2: ( rule__Class__Group_5_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==33) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUmlTextual.g:1761:3: rule__Class__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Class__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2__Impl"


    // $ANTLR start "rule__Class__Group_5_2__0"
    // InternalUmlTextual.g:1770:1: rule__Class__Group_5_2__0 : rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1 ;
    public final void rule__Class__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1774:1: ( rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1 )
            // InternalUmlTextual.g:1775:2: rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_2__0"


    // $ANTLR start "rule__Class__Group_5_2__0__Impl"
    // InternalUmlTextual.g:1782:1: rule__Class__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1786:1: ( ( ',' ) )
            // InternalUmlTextual.g:1787:1: ( ',' )
            {
            // InternalUmlTextual.g:1787:1: ( ',' )
            // InternalUmlTextual.g:1788:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_5_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_2__0__Impl"


    // $ANTLR start "rule__Class__Group_5_2__1"
    // InternalUmlTextual.g:1797:1: rule__Class__Group_5_2__1 : rule__Class__Group_5_2__1__Impl ;
    public final void rule__Class__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1801:1: ( rule__Class__Group_5_2__1__Impl )
            // InternalUmlTextual.g:1802:2: rule__Class__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_2__1"


    // $ANTLR start "rule__Class__Group_5_2__1__Impl"
    // InternalUmlTextual.g:1808:1: rule__Class__Group_5_2__1__Impl : ( ( rule__Class__InterfaceAssignment_5_2_1 ) ) ;
    public final void rule__Class__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1812:1: ( ( ( rule__Class__InterfaceAssignment_5_2_1 ) ) )
            // InternalUmlTextual.g:1813:1: ( ( rule__Class__InterfaceAssignment_5_2_1 ) )
            {
            // InternalUmlTextual.g:1813:1: ( ( rule__Class__InterfaceAssignment_5_2_1 ) )
            // InternalUmlTextual.g:1814:2: ( rule__Class__InterfaceAssignment_5_2_1 )
            {
             before(grammarAccess.getClassAccess().getInterfaceAssignment_5_2_1()); 
            // InternalUmlTextual.g:1815:2: ( rule__Class__InterfaceAssignment_5_2_1 )
            // InternalUmlTextual.g:1815:3: rule__Class__InterfaceAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__InterfaceAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getInterfaceAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_2__1__Impl"


    // $ANTLR start "rule__Interface__Group__0"
    // InternalUmlTextual.g:1824:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1828:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalUmlTextual.g:1829:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Interface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0"


    // $ANTLR start "rule__Interface__Group__0__Impl"
    // InternalUmlTextual.g:1836:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__Group_0__0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1840:1: ( ( ( rule__Interface__Group_0__0 )? ) )
            // InternalUmlTextual.g:1841:1: ( ( rule__Interface__Group_0__0 )? )
            {
            // InternalUmlTextual.g:1841:1: ( ( rule__Interface__Group_0__0 )? )
            // InternalUmlTextual.g:1842:2: ( rule__Interface__Group_0__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_0()); 
            // InternalUmlTextual.g:1843:2: ( rule__Interface__Group_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalUmlTextual.g:1843:3: rule__Interface__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__0__Impl"


    // $ANTLR start "rule__Interface__Group__1"
    // InternalUmlTextual.g:1851:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1855:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalUmlTextual.g:1856:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Interface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1"


    // $ANTLR start "rule__Interface__Group__1__Impl"
    // InternalUmlTextual.g:1863:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__VisibilityAssignment_1 )? ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1867:1: ( ( ( rule__Interface__VisibilityAssignment_1 )? ) )
            // InternalUmlTextual.g:1868:1: ( ( rule__Interface__VisibilityAssignment_1 )? )
            {
            // InternalUmlTextual.g:1868:1: ( ( rule__Interface__VisibilityAssignment_1 )? )
            // InternalUmlTextual.g:1869:2: ( rule__Interface__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityAssignment_1()); 
            // InternalUmlTextual.g:1870:2: ( rule__Interface__VisibilityAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15||(LA24_0>=17 && LA24_0<=19)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalUmlTextual.g:1870:3: rule__Interface__VisibilityAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__VisibilityAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getVisibilityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__1__Impl"


    // $ANTLR start "rule__Interface__Group__2"
    // InternalUmlTextual.g:1878:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1882:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalUmlTextual.g:1883:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Interface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2"


    // $ANTLR start "rule__Interface__Group__2__Impl"
    // InternalUmlTextual.g:1890:1: rule__Interface__Group__2__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1894:1: ( ( 'interface' ) )
            // InternalUmlTextual.g:1895:1: ( 'interface' )
            {
            // InternalUmlTextual.g:1895:1: ( 'interface' )
            // InternalUmlTextual.g:1896:2: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getInterfaceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__2__Impl"


    // $ANTLR start "rule__Interface__Group__3"
    // InternalUmlTextual.g:1905:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1909:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalUmlTextual.g:1910:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Interface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3"


    // $ANTLR start "rule__Interface__Group__3__Impl"
    // InternalUmlTextual.g:1917:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__NameAssignment_3 ) ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1921:1: ( ( ( rule__Interface__NameAssignment_3 ) ) )
            // InternalUmlTextual.g:1922:1: ( ( rule__Interface__NameAssignment_3 ) )
            {
            // InternalUmlTextual.g:1922:1: ( ( rule__Interface__NameAssignment_3 ) )
            // InternalUmlTextual.g:1923:2: ( rule__Interface__NameAssignment_3 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_3()); 
            // InternalUmlTextual.g:1924:2: ( rule__Interface__NameAssignment_3 )
            // InternalUmlTextual.g:1924:3: rule__Interface__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Interface__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__3__Impl"


    // $ANTLR start "rule__Interface__Group__4"
    // InternalUmlTextual.g:1932:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1936:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalUmlTextual.g:1937:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Interface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4"


    // $ANTLR start "rule__Interface__Group__4__Impl"
    // InternalUmlTextual.g:1944:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__Group_4__0 )? ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1948:1: ( ( ( rule__Interface__Group_4__0 )? ) )
            // InternalUmlTextual.g:1949:1: ( ( rule__Interface__Group_4__0 )? )
            {
            // InternalUmlTextual.g:1949:1: ( ( rule__Interface__Group_4__0 )? )
            // InternalUmlTextual.g:1950:2: ( rule__Interface__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4()); 
            // InternalUmlTextual.g:1951:2: ( rule__Interface__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUmlTextual.g:1951:3: rule__Interface__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Interface__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInterfaceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__4__Impl"


    // $ANTLR start "rule__Interface__Group__5"
    // InternalUmlTextual.g:1959:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1963:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // InternalUmlTextual.g:1964:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Interface__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5"


    // $ANTLR start "rule__Interface__Group__5__Impl"
    // InternalUmlTextual.g:1971:1: rule__Interface__Group__5__Impl : ( '{' ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1975:1: ( ( '{' ) )
            // InternalUmlTextual.g:1976:1: ( '{' )
            {
            // InternalUmlTextual.g:1976:1: ( '{' )
            // InternalUmlTextual.g:1977:2: '{'
            {
             before(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__5__Impl"


    // $ANTLR start "rule__Interface__Group__6"
    // InternalUmlTextual.g:1986:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl rule__Interface__Group__7 ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1990:1: ( rule__Interface__Group__6__Impl rule__Interface__Group__7 )
            // InternalUmlTextual.g:1991:2: rule__Interface__Group__6__Impl rule__Interface__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Interface__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6"


    // $ANTLR start "rule__Interface__Group__6__Impl"
    // InternalUmlTextual.g:1998:1: rule__Interface__Group__6__Impl : ( ( rule__Interface__AttributesAssignment_6 )* ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2002:1: ( ( ( rule__Interface__AttributesAssignment_6 )* ) )
            // InternalUmlTextual.g:2003:1: ( ( rule__Interface__AttributesAssignment_6 )* )
            {
            // InternalUmlTextual.g:2003:1: ( ( rule__Interface__AttributesAssignment_6 )* )
            // InternalUmlTextual.g:2004:2: ( rule__Interface__AttributesAssignment_6 )*
            {
             before(grammarAccess.getInterfaceAccess().getAttributesAssignment_6()); 
            // InternalUmlTextual.g:2005:2: ( rule__Interface__AttributesAssignment_6 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15||(LA26_0>=17 && LA26_0<=19)||LA26_0==38) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalUmlTextual.g:2005:3: rule__Interface__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Interface__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getInterfaceAccess().getAttributesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__6__Impl"


    // $ANTLR start "rule__Interface__Group__7"
    // InternalUmlTextual.g:2013:1: rule__Interface__Group__7 : rule__Interface__Group__7__Impl ;
    public final void rule__Interface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2017:1: ( rule__Interface__Group__7__Impl )
            // InternalUmlTextual.g:2018:2: rule__Interface__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__7"


    // $ANTLR start "rule__Interface__Group__7__Impl"
    // InternalUmlTextual.g:2024:1: rule__Interface__Group__7__Impl : ( '}' ) ;
    public final void rule__Interface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2028:1: ( ( '}' ) )
            // InternalUmlTextual.g:2029:1: ( '}' )
            {
            // InternalUmlTextual.g:2029:1: ( '}' )
            // InternalUmlTextual.g:2030:2: '}'
            {
             before(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group__7__Impl"


    // $ANTLR start "rule__Interface__Group_0__0"
    // InternalUmlTextual.g:2040:1: rule__Interface__Group_0__0 : rule__Interface__Group_0__0__Impl rule__Interface__Group_0__1 ;
    public final void rule__Interface__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2044:1: ( rule__Interface__Group_0__0__Impl rule__Interface__Group_0__1 )
            // InternalUmlTextual.g:2045:2: rule__Interface__Group_0__0__Impl rule__Interface__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Interface__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_0__0"


    // $ANTLR start "rule__Interface__Group_0__0__Impl"
    // InternalUmlTextual.g:2052:1: rule__Interface__Group_0__0__Impl : ( '@' ) ;
    public final void rule__Interface__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2056:1: ( ( '@' ) )
            // InternalUmlTextual.g:2057:1: ( '@' )
            {
            // InternalUmlTextual.g:2057:1: ( '@' )
            // InternalUmlTextual.g:2058:2: '@'
            {
             before(grammarAccess.getInterfaceAccess().getCommercialAtKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getCommercialAtKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_0__0__Impl"


    // $ANTLR start "rule__Interface__Group_0__1"
    // InternalUmlTextual.g:2067:1: rule__Interface__Group_0__1 : rule__Interface__Group_0__1__Impl ;
    public final void rule__Interface__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2071:1: ( rule__Interface__Group_0__1__Impl )
            // InternalUmlTextual.g:2072:2: rule__Interface__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_0__1"


    // $ANTLR start "rule__Interface__Group_0__1__Impl"
    // InternalUmlTextual.g:2078:1: rule__Interface__Group_0__1__Impl : ( ( rule__Interface__StereotypeAssignment_0_1 ) ) ;
    public final void rule__Interface__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2082:1: ( ( ( rule__Interface__StereotypeAssignment_0_1 ) ) )
            // InternalUmlTextual.g:2083:1: ( ( rule__Interface__StereotypeAssignment_0_1 ) )
            {
            // InternalUmlTextual.g:2083:1: ( ( rule__Interface__StereotypeAssignment_0_1 ) )
            // InternalUmlTextual.g:2084:2: ( rule__Interface__StereotypeAssignment_0_1 )
            {
             before(grammarAccess.getInterfaceAccess().getStereotypeAssignment_0_1()); 
            // InternalUmlTextual.g:2085:2: ( rule__Interface__StereotypeAssignment_0_1 )
            // InternalUmlTextual.g:2085:3: rule__Interface__StereotypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__StereotypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getStereotypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_0__1__Impl"


    // $ANTLR start "rule__Interface__Group_4__0"
    // InternalUmlTextual.g:2094:1: rule__Interface__Group_4__0 : rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 ;
    public final void rule__Interface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2098:1: ( rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 )
            // InternalUmlTextual.g:2099:2: rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Interface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__0"


    // $ANTLR start "rule__Interface__Group_4__0__Impl"
    // InternalUmlTextual.g:2106:1: rule__Interface__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Interface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2110:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:2111:1: ( 'extends' )
            {
            // InternalUmlTextual.g:2111:1: ( 'extends' )
            // InternalUmlTextual.g:2112:2: 'extends'
            {
             before(grammarAccess.getInterfaceAccess().getExtendsKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__0__Impl"


    // $ANTLR start "rule__Interface__Group_4__1"
    // InternalUmlTextual.g:2121:1: rule__Interface__Group_4__1 : rule__Interface__Group_4__1__Impl ;
    public final void rule__Interface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2125:1: ( rule__Interface__Group_4__1__Impl )
            // InternalUmlTextual.g:2126:2: rule__Interface__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interface__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__1"


    // $ANTLR start "rule__Interface__Group_4__1__Impl"
    // InternalUmlTextual.g:2132:1: rule__Interface__Group_4__1__Impl : ( ( rule__Interface__ParentClassAssignment_4_1 ) ) ;
    public final void rule__Interface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2136:1: ( ( ( rule__Interface__ParentClassAssignment_4_1 ) ) )
            // InternalUmlTextual.g:2137:1: ( ( rule__Interface__ParentClassAssignment_4_1 ) )
            {
            // InternalUmlTextual.g:2137:1: ( ( rule__Interface__ParentClassAssignment_4_1 ) )
            // InternalUmlTextual.g:2138:2: ( rule__Interface__ParentClassAssignment_4_1 )
            {
             before(grammarAccess.getInterfaceAccess().getParentClassAssignment_4_1()); 
            // InternalUmlTextual.g:2139:2: ( rule__Interface__ParentClassAssignment_4_1 )
            // InternalUmlTextual.g:2139:3: rule__Interface__ParentClassAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__ParentClassAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getParentClassAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__Group_4__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group_5__0"
    // InternalUmlTextual.g:2148:1: rule__Multiplicity__Group_5__0 : rule__Multiplicity__Group_5__0__Impl rule__Multiplicity__Group_5__1 ;
    public final void rule__Multiplicity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2152:1: ( rule__Multiplicity__Group_5__0__Impl rule__Multiplicity__Group_5__1 )
            // InternalUmlTextual.g:2153:2: rule__Multiplicity__Group_5__0__Impl rule__Multiplicity__Group_5__1
            {
            pushFollow(FOLLOW_19);
            rule__Multiplicity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_5__0"


    // $ANTLR start "rule__Multiplicity__Group_5__0__Impl"
    // InternalUmlTextual.g:2160:1: rule__Multiplicity__Group_5__0__Impl : ( '0..' ) ;
    public final void rule__Multiplicity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2164:1: ( ( '0..' ) )
            // InternalUmlTextual.g:2165:1: ( '0..' )
            {
            // InternalUmlTextual.g:2165:1: ( '0..' )
            // InternalUmlTextual.g:2166:2: '0..'
            {
             before(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_5__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group_5__1"
    // InternalUmlTextual.g:2175:1: rule__Multiplicity__Group_5__1 : rule__Multiplicity__Group_5__1__Impl ;
    public final void rule__Multiplicity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2179:1: ( rule__Multiplicity__Group_5__1__Impl )
            // InternalUmlTextual.g:2180:2: rule__Multiplicity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_5__1"


    // $ANTLR start "rule__Multiplicity__Group_5__1__Impl"
    // InternalUmlTextual.g:2186:1: rule__Multiplicity__Group_5__1__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2190:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2191:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2191:1: ( RULE_INT )
            // InternalUmlTextual.g:2192:2: RULE_INT
            {
             before(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_5_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_5__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group_6__0"
    // InternalUmlTextual.g:2202:1: rule__Multiplicity__Group_6__0 : rule__Multiplicity__Group_6__0__Impl rule__Multiplicity__Group_6__1 ;
    public final void rule__Multiplicity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2206:1: ( rule__Multiplicity__Group_6__0__Impl rule__Multiplicity__Group_6__1 )
            // InternalUmlTextual.g:2207:2: rule__Multiplicity__Group_6__0__Impl rule__Multiplicity__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__Multiplicity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_6__0"


    // $ANTLR start "rule__Multiplicity__Group_6__0__Impl"
    // InternalUmlTextual.g:2214:1: rule__Multiplicity__Group_6__0__Impl : ( '1..' ) ;
    public final void rule__Multiplicity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2218:1: ( ( '1..' ) )
            // InternalUmlTextual.g:2219:1: ( '1..' )
            {
            // InternalUmlTextual.g:2219:1: ( '1..' )
            // InternalUmlTextual.g:2220:2: '1..'
            {
             before(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_6__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group_6__1"
    // InternalUmlTextual.g:2229:1: rule__Multiplicity__Group_6__1 : rule__Multiplicity__Group_6__1__Impl ;
    public final void rule__Multiplicity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2233:1: ( rule__Multiplicity__Group_6__1__Impl )
            // InternalUmlTextual.g:2234:2: rule__Multiplicity__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_6__1"


    // $ANTLR start "rule__Multiplicity__Group_6__1__Impl"
    // InternalUmlTextual.g:2240:1: rule__Multiplicity__Group_6__1__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2244:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2245:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2245:1: ( RULE_INT )
            // InternalUmlTextual.g:2246:2: RULE_INT
            {
             before(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_6_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_6__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group_8__0"
    // InternalUmlTextual.g:2256:1: rule__Multiplicity__Group_8__0 : rule__Multiplicity__Group_8__0__Impl rule__Multiplicity__Group_8__1 ;
    public final void rule__Multiplicity__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2260:1: ( rule__Multiplicity__Group_8__0__Impl rule__Multiplicity__Group_8__1 )
            // InternalUmlTextual.g:2261:2: rule__Multiplicity__Group_8__0__Impl rule__Multiplicity__Group_8__1
            {
            pushFollow(FOLLOW_20);
            rule__Multiplicity__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_8__0"


    // $ANTLR start "rule__Multiplicity__Group_8__0__Impl"
    // InternalUmlTextual.g:2268:1: rule__Multiplicity__Group_8__0__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2272:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2273:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2273:1: ( RULE_INT )
            // InternalUmlTextual.g:2274:2: RULE_INT
            {
             before(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_8_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_8__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group_8__1"
    // InternalUmlTextual.g:2283:1: rule__Multiplicity__Group_8__1 : rule__Multiplicity__Group_8__1__Impl rule__Multiplicity__Group_8__2 ;
    public final void rule__Multiplicity__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2287:1: ( rule__Multiplicity__Group_8__1__Impl rule__Multiplicity__Group_8__2 )
            // InternalUmlTextual.g:2288:2: rule__Multiplicity__Group_8__1__Impl rule__Multiplicity__Group_8__2
            {
            pushFollow(FOLLOW_19);
            rule__Multiplicity__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_8__1"


    // $ANTLR start "rule__Multiplicity__Group_8__1__Impl"
    // InternalUmlTextual.g:2295:1: rule__Multiplicity__Group_8__1__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2299:1: ( ( '..' ) )
            // InternalUmlTextual.g:2300:1: ( '..' )
            {
            // InternalUmlTextual.g:2300:1: ( '..' )
            // InternalUmlTextual.g:2301:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_8_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_8__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group_8__2"
    // InternalUmlTextual.g:2310:1: rule__Multiplicity__Group_8__2 : rule__Multiplicity__Group_8__2__Impl ;
    public final void rule__Multiplicity__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2314:1: ( rule__Multiplicity__Group_8__2__Impl )
            // InternalUmlTextual.g:2315:2: rule__Multiplicity__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_8__2"


    // $ANTLR start "rule__Multiplicity__Group_8__2__Impl"
    // InternalUmlTextual.g:2321:1: rule__Multiplicity__Group_8__2__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2325:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2326:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2326:1: ( RULE_INT )
            // InternalUmlTextual.g:2327:2: RULE_INT
            {
             before(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_8_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplicity__Group_8__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalUmlTextual.g:2337:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2341:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUmlTextual.g:2342:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalUmlTextual.g:2349:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__VisibilityAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2353:1: ( ( ( rule__Attribute__VisibilityAssignment_0 )? ) )
            // InternalUmlTextual.g:2354:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            {
            // InternalUmlTextual.g:2354:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            // InternalUmlTextual.g:2355:2: ( rule__Attribute__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_0()); 
            // InternalUmlTextual.g:2356:2: ( rule__Attribute__VisibilityAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15||(LA27_0>=17 && LA27_0<=19)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUmlTextual.g:2356:3: rule__Attribute__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalUmlTextual.g:2364:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2368:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUmlTextual.g:2369:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalUmlTextual.g:2376:1: rule__Attribute__Group__1__Impl : ( 'attr' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2380:1: ( ( 'attr' ) )
            // InternalUmlTextual.g:2381:1: ( 'attr' )
            {
            // InternalUmlTextual.g:2381:1: ( 'attr' )
            // InternalUmlTextual.g:2382:2: 'attr'
            {
             before(grammarAccess.getAttributeAccess().getAttrKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttrKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalUmlTextual.g:2391:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2395:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalUmlTextual.g:2396:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalUmlTextual.g:2403:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2407:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:2408:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:2408:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalUmlTextual.g:2409:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:2410:2: ( rule__Attribute__NameAssignment_2 )
            // InternalUmlTextual.g:2410:3: rule__Attribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalUmlTextual.g:2418:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2422:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalUmlTextual.g:2423:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalUmlTextual.g:2430:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2434:1: ( ( ':' ) )
            // InternalUmlTextual.g:2435:1: ( ':' )
            {
            // InternalUmlTextual.g:2435:1: ( ':' )
            // InternalUmlTextual.g:2436:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalUmlTextual.g:2445:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2449:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalUmlTextual.g:2450:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalUmlTextual.g:2457:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2461:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalUmlTextual.g:2462:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalUmlTextual.g:2462:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalUmlTextual.g:2463:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalUmlTextual.g:2464:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalUmlTextual.g:2464:3: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalUmlTextual.g:2472:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2476:1: ( rule__Attribute__Group__5__Impl )
            // InternalUmlTextual.g:2477:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalUmlTextual.g:2483:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2487:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalUmlTextual.g:2488:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalUmlTextual.g:2488:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalUmlTextual.g:2489:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalUmlTextual.g:2490:2: ( rule__Attribute__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUmlTextual.g:2490:3: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // InternalUmlTextual.g:2499:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2503:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalUmlTextual.g:2504:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_25);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // InternalUmlTextual.g:2511:1: rule__Attribute__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2515:1: ( ( '[' ) )
            // InternalUmlTextual.g:2516:1: ( '[' )
            {
            // InternalUmlTextual.g:2516:1: ( '[' )
            // InternalUmlTextual.g:2517:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // InternalUmlTextual.g:2526:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2530:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalUmlTextual.g:2531:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // InternalUmlTextual.g:2538:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__MultiplicityAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2542:1: ( ( ( rule__Attribute__MultiplicityAssignment_5_1 ) ) )
            // InternalUmlTextual.g:2543:1: ( ( rule__Attribute__MultiplicityAssignment_5_1 ) )
            {
            // InternalUmlTextual.g:2543:1: ( ( rule__Attribute__MultiplicityAssignment_5_1 ) )
            // InternalUmlTextual.g:2544:2: ( rule__Attribute__MultiplicityAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_5_1()); 
            // InternalUmlTextual.g:2545:2: ( rule__Attribute__MultiplicityAssignment_5_1 )
            // InternalUmlTextual.g:2545:3: rule__Attribute__MultiplicityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__MultiplicityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getMultiplicityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5__2"
    // InternalUmlTextual.g:2553:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2557:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalUmlTextual.g:2558:2: rule__Attribute__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__2"


    // $ANTLR start "rule__Attribute__Group_5__2__Impl"
    // InternalUmlTextual.g:2564:1: rule__Attribute__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2568:1: ( ( ']' ) )
            // InternalUmlTextual.g:2569:1: ( ']' )
            {
            // InternalUmlTextual.g:2569:1: ( ']' )
            // InternalUmlTextual.g:2570:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_5__2__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalUmlTextual.g:2580:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2584:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalUmlTextual.g:2585:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalUmlTextual.g:2592:1: rule__Method__Group__0__Impl : ( ( 'abstract' )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2596:1: ( ( ( 'abstract' )? ) )
            // InternalUmlTextual.g:2597:1: ( ( 'abstract' )? )
            {
            // InternalUmlTextual.g:2597:1: ( ( 'abstract' )? )
            // InternalUmlTextual.g:2598:2: ( 'abstract' )?
            {
             before(grammarAccess.getMethodAccess().getAbstractKeyword_0()); 
            // InternalUmlTextual.g:2599:2: ( 'abstract' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==11) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUmlTextual.g:2599:3: 'abstract'
                    {
                    match(input,11,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getAbstractKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalUmlTextual.g:2607:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2611:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalUmlTextual.g:2612:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalUmlTextual.g:2619:1: rule__Method__Group__1__Impl : ( ( 'static' )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2623:1: ( ( ( 'static' )? ) )
            // InternalUmlTextual.g:2624:1: ( ( 'static' )? )
            {
            // InternalUmlTextual.g:2624:1: ( ( 'static' )? )
            // InternalUmlTextual.g:2625:2: ( 'static' )?
            {
             before(grammarAccess.getMethodAccess().getStaticKeyword_1()); 
            // InternalUmlTextual.g:2626:2: ( 'static' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUmlTextual.g:2626:3: 'static'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getStaticKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalUmlTextual.g:2634:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2638:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalUmlTextual.g:2639:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalUmlTextual.g:2646:1: rule__Method__Group__2__Impl : ( ( rule__Method__VisibilityAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2650:1: ( ( ( rule__Method__VisibilityAssignment_2 )? ) )
            // InternalUmlTextual.g:2651:1: ( ( rule__Method__VisibilityAssignment_2 )? )
            {
            // InternalUmlTextual.g:2651:1: ( ( rule__Method__VisibilityAssignment_2 )? )
            // InternalUmlTextual.g:2652:2: ( rule__Method__VisibilityAssignment_2 )?
            {
             before(grammarAccess.getMethodAccess().getVisibilityAssignment_2()); 
            // InternalUmlTextual.g:2653:2: ( rule__Method__VisibilityAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==15||(LA31_0>=17 && LA31_0<=19)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUmlTextual.g:2653:3: rule__Method__VisibilityAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__VisibilityAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getVisibilityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalUmlTextual.g:2661:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2665:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalUmlTextual.g:2666:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalUmlTextual.g:2673:1: rule__Method__Group__3__Impl : ( 'function' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2677:1: ( ( 'function' ) )
            // InternalUmlTextual.g:2678:1: ( 'function' )
            {
            // InternalUmlTextual.g:2678:1: ( 'function' )
            // InternalUmlTextual.g:2679:2: 'function'
            {
             before(grammarAccess.getMethodAccess().getFunctionKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getFunctionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__Method__Group__4"
    // InternalUmlTextual.g:2688:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2692:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalUmlTextual.g:2693:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Method__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4"


    // $ANTLR start "rule__Method__Group__4__Impl"
    // InternalUmlTextual.g:2700:1: rule__Method__Group__4__Impl : ( ( rule__Method__NameAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2704:1: ( ( ( rule__Method__NameAssignment_4 ) ) )
            // InternalUmlTextual.g:2705:1: ( ( rule__Method__NameAssignment_4 ) )
            {
            // InternalUmlTextual.g:2705:1: ( ( rule__Method__NameAssignment_4 ) )
            // InternalUmlTextual.g:2706:2: ( rule__Method__NameAssignment_4 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_4()); 
            // InternalUmlTextual.g:2707:2: ( rule__Method__NameAssignment_4 )
            // InternalUmlTextual.g:2707:3: rule__Method__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__4__Impl"


    // $ANTLR start "rule__Method__Group__5"
    // InternalUmlTextual.g:2715:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2719:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalUmlTextual.g:2720:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Method__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5"


    // $ANTLR start "rule__Method__Group__5__Impl"
    // InternalUmlTextual.g:2727:1: rule__Method__Group__5__Impl : ( '(' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2731:1: ( ( '(' ) )
            // InternalUmlTextual.g:2732:1: ( '(' )
            {
            // InternalUmlTextual.g:2732:1: ( '(' )
            // InternalUmlTextual.g:2733:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__5__Impl"


    // $ANTLR start "rule__Method__Group__6"
    // InternalUmlTextual.g:2742:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2746:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalUmlTextual.g:2747:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__Method__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6"


    // $ANTLR start "rule__Method__Group__6__Impl"
    // InternalUmlTextual.g:2754:1: rule__Method__Group__6__Impl : ( ( rule__Method__ParametersAssignment_6 )* ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2758:1: ( ( ( rule__Method__ParametersAssignment_6 )* ) )
            // InternalUmlTextual.g:2759:1: ( ( rule__Method__ParametersAssignment_6 )* )
            {
            // InternalUmlTextual.g:2759:1: ( ( rule__Method__ParametersAssignment_6 )* )
            // InternalUmlTextual.g:2760:2: ( rule__Method__ParametersAssignment_6 )*
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6()); 
            // InternalUmlTextual.g:2761:2: ( rule__Method__ParametersAssignment_6 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalUmlTextual.g:2761:3: rule__Method__ParametersAssignment_6
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Method__ParametersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getParametersAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__6__Impl"


    // $ANTLR start "rule__Method__Group__7"
    // InternalUmlTextual.g:2769:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2773:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalUmlTextual.g:2774:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_31);
            rule__Method__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7"


    // $ANTLR start "rule__Method__Group__7__Impl"
    // InternalUmlTextual.g:2781:1: rule__Method__Group__7__Impl : ( ')' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2785:1: ( ( ')' ) )
            // InternalUmlTextual.g:2786:1: ( ')' )
            {
            // InternalUmlTextual.g:2786:1: ( ')' )
            // InternalUmlTextual.g:2787:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__7__Impl"


    // $ANTLR start "rule__Method__Group__8"
    // InternalUmlTextual.g:2796:1: rule__Method__Group__8 : rule__Method__Group__8__Impl rule__Method__Group__9 ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2800:1: ( rule__Method__Group__8__Impl rule__Method__Group__9 )
            // InternalUmlTextual.g:2801:2: rule__Method__Group__8__Impl rule__Method__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__Method__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8"


    // $ANTLR start "rule__Method__Group__8__Impl"
    // InternalUmlTextual.g:2808:1: rule__Method__Group__8__Impl : ( '->' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2812:1: ( ( '->' ) )
            // InternalUmlTextual.g:2813:1: ( '->' )
            {
            // InternalUmlTextual.g:2813:1: ( '->' )
            // InternalUmlTextual.g:2814:2: '->'
            {
             before(grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_8()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__8__Impl"


    // $ANTLR start "rule__Method__Group__9"
    // InternalUmlTextual.g:2823:1: rule__Method__Group__9 : rule__Method__Group__9__Impl ;
    public final void rule__Method__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2827:1: ( rule__Method__Group__9__Impl )
            // InternalUmlTextual.g:2828:2: rule__Method__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__9"


    // $ANTLR start "rule__Method__Group__9__Impl"
    // InternalUmlTextual.g:2834:1: rule__Method__Group__9__Impl : ( ( rule__Method__ReturnTypeAssignment_9 ) ) ;
    public final void rule__Method__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2838:1: ( ( ( rule__Method__ReturnTypeAssignment_9 ) ) )
            // InternalUmlTextual.g:2839:1: ( ( rule__Method__ReturnTypeAssignment_9 ) )
            {
            // InternalUmlTextual.g:2839:1: ( ( rule__Method__ReturnTypeAssignment_9 ) )
            // InternalUmlTextual.g:2840:2: ( rule__Method__ReturnTypeAssignment_9 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_9()); 
            // InternalUmlTextual.g:2841:2: ( rule__Method__ReturnTypeAssignment_9 )
            // InternalUmlTextual.g:2841:3: rule__Method__ReturnTypeAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Method__ReturnTypeAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturnTypeAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__9__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalUmlTextual.g:2850:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2854:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalUmlTextual.g:2855:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalUmlTextual.g:2862:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2866:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalUmlTextual.g:2867:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalUmlTextual.g:2867:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalUmlTextual.g:2868:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalUmlTextual.g:2869:2: ( rule__Parameter__NameAssignment_0 )
            // InternalUmlTextual.g:2869:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalUmlTextual.g:2877:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2881:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalUmlTextual.g:2882:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalUmlTextual.g:2889:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2893:1: ( ( ':' ) )
            // InternalUmlTextual.g:2894:1: ( ':' )
            {
            // InternalUmlTextual.g:2894:1: ( ':' )
            // InternalUmlTextual.g:2895:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalUmlTextual.g:2904:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2908:1: ( rule__Parameter__Group__2__Impl )
            // InternalUmlTextual.g:2909:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalUmlTextual.g:2915:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__ParameterTypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2919:1: ( ( ( rule__Parameter__ParameterTypeAssignment_2 ) ) )
            // InternalUmlTextual.g:2920:1: ( ( rule__Parameter__ParameterTypeAssignment_2 ) )
            {
            // InternalUmlTextual.g:2920:1: ( ( rule__Parameter__ParameterTypeAssignment_2 ) )
            // InternalUmlTextual.g:2921:2: ( rule__Parameter__ParameterTypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getParameterTypeAssignment_2()); 
            // InternalUmlTextual.g:2922:2: ( rule__Parameter__ParameterTypeAssignment_2 )
            // InternalUmlTextual.g:2922:3: rule__Parameter__ParameterTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ParameterTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParameterTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // InternalUmlTextual.g:2931:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2935:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalUmlTextual.g:2936:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // InternalUmlTextual.g:2943:1: rule__Association__Group__0__Impl : ( ( 'undirected' )? ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2947:1: ( ( ( 'undirected' )? ) )
            // InternalUmlTextual.g:2948:1: ( ( 'undirected' )? )
            {
            // InternalUmlTextual.g:2948:1: ( ( 'undirected' )? )
            // InternalUmlTextual.g:2949:2: ( 'undirected' )?
            {
             before(grammarAccess.getAssociationAccess().getUndirectedKeyword_0()); 
            // InternalUmlTextual.g:2950:2: ( 'undirected' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==47) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUmlTextual.g:2950:3: 'undirected'
                    {
                    match(input,47,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getUndirectedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // InternalUmlTextual.g:2958:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2962:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalUmlTextual.g:2963:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // InternalUmlTextual.g:2970:1: rule__Association__Group__1__Impl : ( 'association' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2974:1: ( ( 'association' ) )
            // InternalUmlTextual.g:2975:1: ( 'association' )
            {
            // InternalUmlTextual.g:2975:1: ( 'association' )
            // InternalUmlTextual.g:2976:2: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // InternalUmlTextual.g:2985:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2989:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalUmlTextual.g:2990:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // InternalUmlTextual.g:2997:1: rule__Association__Group__2__Impl : ( ( rule__Association__NameAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3001:1: ( ( ( rule__Association__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:3002:1: ( ( rule__Association__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:3002:1: ( ( rule__Association__NameAssignment_2 ) )
            // InternalUmlTextual.g:3003:2: ( rule__Association__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:3004:2: ( rule__Association__NameAssignment_2 )
            // InternalUmlTextual.g:3004:3: rule__Association__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Association__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // InternalUmlTextual.g:3012:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3016:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalUmlTextual.g:3017:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // InternalUmlTextual.g:3024:1: rule__Association__Group__3__Impl : ( '{' ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3028:1: ( ( '{' ) )
            // InternalUmlTextual.g:3029:1: ( '{' )
            {
            // InternalUmlTextual.g:3029:1: ( '{' )
            // InternalUmlTextual.g:3030:2: '{'
            {
             before(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // InternalUmlTextual.g:3039:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3043:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalUmlTextual.g:3044:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Association__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // InternalUmlTextual.g:3051:1: rule__Association__Group__4__Impl : ( 'from' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3055:1: ( ( 'from' ) )
            // InternalUmlTextual.g:3056:1: ( 'from' )
            {
            // InternalUmlTextual.g:3056:1: ( 'from' )
            // InternalUmlTextual.g:3057:2: 'from'
            {
             before(grammarAccess.getAssociationAccess().getFromKeyword_4()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getFromKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Association__Group__5"
    // InternalUmlTextual.g:3066:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3070:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalUmlTextual.g:3071:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__Association__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5"


    // $ANTLR start "rule__Association__Group__5__Impl"
    // InternalUmlTextual.g:3078:1: rule__Association__Group__5__Impl : ( ( rule__Association__Navigation1Assignment_5 )? ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3082:1: ( ( ( rule__Association__Navigation1Assignment_5 )? ) )
            // InternalUmlTextual.g:3083:1: ( ( rule__Association__Navigation1Assignment_5 )? )
            {
            // InternalUmlTextual.g:3083:1: ( ( rule__Association__Navigation1Assignment_5 )? )
            // InternalUmlTextual.g:3084:2: ( rule__Association__Navigation1Assignment_5 )?
            {
             before(grammarAccess.getAssociationAccess().getNavigation1Assignment_5()); 
            // InternalUmlTextual.g:3085:2: ( rule__Association__Navigation1Assignment_5 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==14) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUmlTextual.g:3085:3: rule__Association__Navigation1Assignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__Navigation1Assignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getNavigation1Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5__Impl"


    // $ANTLR start "rule__Association__Group__6"
    // InternalUmlTextual.g:3093:1: rule__Association__Group__6 : rule__Association__Group__6__Impl rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3097:1: ( rule__Association__Group__6__Impl rule__Association__Group__7 )
            // InternalUmlTextual.g:3098:2: rule__Association__Group__6__Impl rule__Association__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Association__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6"


    // $ANTLR start "rule__Association__Group__6__Impl"
    // InternalUmlTextual.g:3105:1: rule__Association__Group__6__Impl : ( ( rule__Association__Class1Assignment_6 ) ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3109:1: ( ( ( rule__Association__Class1Assignment_6 ) ) )
            // InternalUmlTextual.g:3110:1: ( ( rule__Association__Class1Assignment_6 ) )
            {
            // InternalUmlTextual.g:3110:1: ( ( rule__Association__Class1Assignment_6 ) )
            // InternalUmlTextual.g:3111:2: ( rule__Association__Class1Assignment_6 )
            {
             before(grammarAccess.getAssociationAccess().getClass1Assignment_6()); 
            // InternalUmlTextual.g:3112:2: ( rule__Association__Class1Assignment_6 )
            // InternalUmlTextual.g:3112:3: rule__Association__Class1Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Association__Class1Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getClass1Assignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6__Impl"


    // $ANTLR start "rule__Association__Group__7"
    // InternalUmlTextual.g:3120:1: rule__Association__Group__7 : rule__Association__Group__7__Impl rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3124:1: ( rule__Association__Group__7__Impl rule__Association__Group__8 )
            // InternalUmlTextual.g:3125:2: rule__Association__Group__7__Impl rule__Association__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__Association__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__7"


    // $ANTLR start "rule__Association__Group__7__Impl"
    // InternalUmlTextual.g:3132:1: rule__Association__Group__7__Impl : ( '[' ) ;
    public final void rule__Association__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3136:1: ( ( '[' ) )
            // InternalUmlTextual.g:3137:1: ( '[' )
            {
            // InternalUmlTextual.g:3137:1: ( '[' )
            // InternalUmlTextual.g:3138:2: '['
            {
             before(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_7()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__7__Impl"


    // $ANTLR start "rule__Association__Group__8"
    // InternalUmlTextual.g:3147:1: rule__Association__Group__8 : rule__Association__Group__8__Impl rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3151:1: ( rule__Association__Group__8__Impl rule__Association__Group__9 )
            // InternalUmlTextual.g:3152:2: rule__Association__Group__8__Impl rule__Association__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Association__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__8"


    // $ANTLR start "rule__Association__Group__8__Impl"
    // InternalUmlTextual.g:3159:1: rule__Association__Group__8__Impl : ( ( rule__Association__Multiplicity1Assignment_8 ) ) ;
    public final void rule__Association__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3163:1: ( ( ( rule__Association__Multiplicity1Assignment_8 ) ) )
            // InternalUmlTextual.g:3164:1: ( ( rule__Association__Multiplicity1Assignment_8 ) )
            {
            // InternalUmlTextual.g:3164:1: ( ( rule__Association__Multiplicity1Assignment_8 ) )
            // InternalUmlTextual.g:3165:2: ( rule__Association__Multiplicity1Assignment_8 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicity1Assignment_8()); 
            // InternalUmlTextual.g:3166:2: ( rule__Association__Multiplicity1Assignment_8 )
            // InternalUmlTextual.g:3166:3: rule__Association__Multiplicity1Assignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Association__Multiplicity1Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getMultiplicity1Assignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__8__Impl"


    // $ANTLR start "rule__Association__Group__9"
    // InternalUmlTextual.g:3174:1: rule__Association__Group__9 : rule__Association__Group__9__Impl rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3178:1: ( rule__Association__Group__9__Impl rule__Association__Group__10 )
            // InternalUmlTextual.g:3179:2: rule__Association__Group__9__Impl rule__Association__Group__10
            {
            pushFollow(FOLLOW_37);
            rule__Association__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__9"


    // $ANTLR start "rule__Association__Group__9__Impl"
    // InternalUmlTextual.g:3186:1: rule__Association__Group__9__Impl : ( ']' ) ;
    public final void rule__Association__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3190:1: ( ( ']' ) )
            // InternalUmlTextual.g:3191:1: ( ']' )
            {
            // InternalUmlTextual.g:3191:1: ( ']' )
            // InternalUmlTextual.g:3192:2: ']'
            {
             before(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_9()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__9__Impl"


    // $ANTLR start "rule__Association__Group__10"
    // InternalUmlTextual.g:3201:1: rule__Association__Group__10 : rule__Association__Group__10__Impl rule__Association__Group__11 ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3205:1: ( rule__Association__Group__10__Impl rule__Association__Group__11 )
            // InternalUmlTextual.g:3206:2: rule__Association__Group__10__Impl rule__Association__Group__11
            {
            pushFollow(FOLLOW_36);
            rule__Association__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__10"


    // $ANTLR start "rule__Association__Group__10__Impl"
    // InternalUmlTextual.g:3213:1: rule__Association__Group__10__Impl : ( 'to' ) ;
    public final void rule__Association__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3217:1: ( ( 'to' ) )
            // InternalUmlTextual.g:3218:1: ( 'to' )
            {
            // InternalUmlTextual.g:3218:1: ( 'to' )
            // InternalUmlTextual.g:3219:2: 'to'
            {
             before(grammarAccess.getAssociationAccess().getToKeyword_10()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getToKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__10__Impl"


    // $ANTLR start "rule__Association__Group__11"
    // InternalUmlTextual.g:3228:1: rule__Association__Group__11 : rule__Association__Group__11__Impl rule__Association__Group__12 ;
    public final void rule__Association__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3232:1: ( rule__Association__Group__11__Impl rule__Association__Group__12 )
            // InternalUmlTextual.g:3233:2: rule__Association__Group__11__Impl rule__Association__Group__12
            {
            pushFollow(FOLLOW_36);
            rule__Association__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__11"


    // $ANTLR start "rule__Association__Group__11__Impl"
    // InternalUmlTextual.g:3240:1: rule__Association__Group__11__Impl : ( ( rule__Association__Navigation2Assignment_11 )? ) ;
    public final void rule__Association__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3244:1: ( ( ( rule__Association__Navigation2Assignment_11 )? ) )
            // InternalUmlTextual.g:3245:1: ( ( rule__Association__Navigation2Assignment_11 )? )
            {
            // InternalUmlTextual.g:3245:1: ( ( rule__Association__Navigation2Assignment_11 )? )
            // InternalUmlTextual.g:3246:2: ( rule__Association__Navigation2Assignment_11 )?
            {
             before(grammarAccess.getAssociationAccess().getNavigation2Assignment_11()); 
            // InternalUmlTextual.g:3247:2: ( rule__Association__Navigation2Assignment_11 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUmlTextual.g:3247:3: rule__Association__Navigation2Assignment_11
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__Navigation2Assignment_11();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getNavigation2Assignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__11__Impl"


    // $ANTLR start "rule__Association__Group__12"
    // InternalUmlTextual.g:3255:1: rule__Association__Group__12 : rule__Association__Group__12__Impl rule__Association__Group__13 ;
    public final void rule__Association__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3259:1: ( rule__Association__Group__12__Impl rule__Association__Group__13 )
            // InternalUmlTextual.g:3260:2: rule__Association__Group__12__Impl rule__Association__Group__13
            {
            pushFollow(FOLLOW_24);
            rule__Association__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__12"


    // $ANTLR start "rule__Association__Group__12__Impl"
    // InternalUmlTextual.g:3267:1: rule__Association__Group__12__Impl : ( ( rule__Association__Class2Assignment_12 ) ) ;
    public final void rule__Association__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3271:1: ( ( ( rule__Association__Class2Assignment_12 ) ) )
            // InternalUmlTextual.g:3272:1: ( ( rule__Association__Class2Assignment_12 ) )
            {
            // InternalUmlTextual.g:3272:1: ( ( rule__Association__Class2Assignment_12 ) )
            // InternalUmlTextual.g:3273:2: ( rule__Association__Class2Assignment_12 )
            {
             before(grammarAccess.getAssociationAccess().getClass2Assignment_12()); 
            // InternalUmlTextual.g:3274:2: ( rule__Association__Class2Assignment_12 )
            // InternalUmlTextual.g:3274:3: rule__Association__Class2Assignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Association__Class2Assignment_12();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getClass2Assignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__12__Impl"


    // $ANTLR start "rule__Association__Group__13"
    // InternalUmlTextual.g:3282:1: rule__Association__Group__13 : rule__Association__Group__13__Impl rule__Association__Group__14 ;
    public final void rule__Association__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3286:1: ( rule__Association__Group__13__Impl rule__Association__Group__14 )
            // InternalUmlTextual.g:3287:2: rule__Association__Group__13__Impl rule__Association__Group__14
            {
            pushFollow(FOLLOW_25);
            rule__Association__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__13"


    // $ANTLR start "rule__Association__Group__13__Impl"
    // InternalUmlTextual.g:3294:1: rule__Association__Group__13__Impl : ( '[' ) ;
    public final void rule__Association__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3298:1: ( ( '[' ) )
            // InternalUmlTextual.g:3299:1: ( '[' )
            {
            // InternalUmlTextual.g:3299:1: ( '[' )
            // InternalUmlTextual.g:3300:2: '['
            {
             before(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_13()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__13__Impl"


    // $ANTLR start "rule__Association__Group__14"
    // InternalUmlTextual.g:3309:1: rule__Association__Group__14 : rule__Association__Group__14__Impl rule__Association__Group__15 ;
    public final void rule__Association__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3313:1: ( rule__Association__Group__14__Impl rule__Association__Group__15 )
            // InternalUmlTextual.g:3314:2: rule__Association__Group__14__Impl rule__Association__Group__15
            {
            pushFollow(FOLLOW_26);
            rule__Association__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__14"


    // $ANTLR start "rule__Association__Group__14__Impl"
    // InternalUmlTextual.g:3321:1: rule__Association__Group__14__Impl : ( ( rule__Association__Multiplicity2Assignment_14 ) ) ;
    public final void rule__Association__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3325:1: ( ( ( rule__Association__Multiplicity2Assignment_14 ) ) )
            // InternalUmlTextual.g:3326:1: ( ( rule__Association__Multiplicity2Assignment_14 ) )
            {
            // InternalUmlTextual.g:3326:1: ( ( rule__Association__Multiplicity2Assignment_14 ) )
            // InternalUmlTextual.g:3327:2: ( rule__Association__Multiplicity2Assignment_14 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicity2Assignment_14()); 
            // InternalUmlTextual.g:3328:2: ( rule__Association__Multiplicity2Assignment_14 )
            // InternalUmlTextual.g:3328:3: rule__Association__Multiplicity2Assignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Association__Multiplicity2Assignment_14();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getMultiplicity2Assignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__14__Impl"


    // $ANTLR start "rule__Association__Group__15"
    // InternalUmlTextual.g:3336:1: rule__Association__Group__15 : rule__Association__Group__15__Impl rule__Association__Group__16 ;
    public final void rule__Association__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3340:1: ( rule__Association__Group__15__Impl rule__Association__Group__16 )
            // InternalUmlTextual.g:3341:2: rule__Association__Group__15__Impl rule__Association__Group__16
            {
            pushFollow(FOLLOW_38);
            rule__Association__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__15"


    // $ANTLR start "rule__Association__Group__15__Impl"
    // InternalUmlTextual.g:3348:1: rule__Association__Group__15__Impl : ( ']' ) ;
    public final void rule__Association__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3352:1: ( ( ']' ) )
            // InternalUmlTextual.g:3353:1: ( ']' )
            {
            // InternalUmlTextual.g:3353:1: ( ']' )
            // InternalUmlTextual.g:3354:2: ']'
            {
             before(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_15()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__15__Impl"


    // $ANTLR start "rule__Association__Group__16"
    // InternalUmlTextual.g:3363:1: rule__Association__Group__16 : rule__Association__Group__16__Impl rule__Association__Group__17 ;
    public final void rule__Association__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3367:1: ( rule__Association__Group__16__Impl rule__Association__Group__17 )
            // InternalUmlTextual.g:3368:2: rule__Association__Group__16__Impl rule__Association__Group__17
            {
            pushFollow(FOLLOW_38);
            rule__Association__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__16"


    // $ANTLR start "rule__Association__Group__16__Impl"
    // InternalUmlTextual.g:3375:1: rule__Association__Group__16__Impl : ( ( rule__Association__Group_16__0 )? ) ;
    public final void rule__Association__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3379:1: ( ( ( rule__Association__Group_16__0 )? ) )
            // InternalUmlTextual.g:3380:1: ( ( rule__Association__Group_16__0 )? )
            {
            // InternalUmlTextual.g:3380:1: ( ( rule__Association__Group_16__0 )? )
            // InternalUmlTextual.g:3381:2: ( rule__Association__Group_16__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_16()); 
            // InternalUmlTextual.g:3382:2: ( rule__Association__Group_16__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUmlTextual.g:3382:3: rule__Association__Group_16__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Association__Group_16__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssociationAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__16__Impl"


    // $ANTLR start "rule__Association__Group__17"
    // InternalUmlTextual.g:3390:1: rule__Association__Group__17 : rule__Association__Group__17__Impl ;
    public final void rule__Association__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3394:1: ( rule__Association__Group__17__Impl )
            // InternalUmlTextual.g:3395:2: rule__Association__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__17"


    // $ANTLR start "rule__Association__Group__17__Impl"
    // InternalUmlTextual.g:3401:1: rule__Association__Group__17__Impl : ( '}' ) ;
    public final void rule__Association__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3405:1: ( ( '}' ) )
            // InternalUmlTextual.g:3406:1: ( '}' )
            {
            // InternalUmlTextual.g:3406:1: ( '}' )
            // InternalUmlTextual.g:3407:2: '}'
            {
             before(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_17()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__17__Impl"


    // $ANTLR start "rule__Association__Group_16__0"
    // InternalUmlTextual.g:3417:1: rule__Association__Group_16__0 : rule__Association__Group_16__0__Impl rule__Association__Group_16__1 ;
    public final void rule__Association__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3421:1: ( rule__Association__Group_16__0__Impl rule__Association__Group_16__1 )
            // InternalUmlTextual.g:3422:2: rule__Association__Group_16__0__Impl rule__Association__Group_16__1
            {
            pushFollow(FOLLOW_39);
            rule__Association__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_16__0"


    // $ANTLR start "rule__Association__Group_16__0__Impl"
    // InternalUmlTextual.g:3429:1: rule__Association__Group_16__0__Impl : ( 'associatedclass' ) ;
    public final void rule__Association__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3433:1: ( ( 'associatedclass' ) )
            // InternalUmlTextual.g:3434:1: ( 'associatedclass' )
            {
            // InternalUmlTextual.g:3434:1: ( 'associatedclass' )
            // InternalUmlTextual.g:3435:2: 'associatedclass'
            {
             before(grammarAccess.getAssociationAccess().getAssociatedclassKeyword_16_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getAssociatedclassKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_16__0__Impl"


    // $ANTLR start "rule__Association__Group_16__1"
    // InternalUmlTextual.g:3444:1: rule__Association__Group_16__1 : rule__Association__Group_16__1__Impl rule__Association__Group_16__2 ;
    public final void rule__Association__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3448:1: ( rule__Association__Group_16__1__Impl rule__Association__Group_16__2 )
            // InternalUmlTextual.g:3449:2: rule__Association__Group_16__1__Impl rule__Association__Group_16__2
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group_16__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_16__1"


    // $ANTLR start "rule__Association__Group_16__1__Impl"
    // InternalUmlTextual.g:3456:1: rule__Association__Group_16__1__Impl : ( '=' ) ;
    public final void rule__Association__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3460:1: ( ( '=' ) )
            // InternalUmlTextual.g:3461:1: ( '=' )
            {
            // InternalUmlTextual.g:3461:1: ( '=' )
            // InternalUmlTextual.g:3462:2: '='
            {
             before(grammarAccess.getAssociationAccess().getEqualsSignKeyword_16_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getEqualsSignKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_16__1__Impl"


    // $ANTLR start "rule__Association__Group_16__2"
    // InternalUmlTextual.g:3471:1: rule__Association__Group_16__2 : rule__Association__Group_16__2__Impl ;
    public final void rule__Association__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3475:1: ( rule__Association__Group_16__2__Impl )
            // InternalUmlTextual.g:3476:2: rule__Association__Group_16__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group_16__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_16__2"


    // $ANTLR start "rule__Association__Group_16__2__Impl"
    // InternalUmlTextual.g:3482:1: rule__Association__Group_16__2__Impl : ( ( rule__Association__ClassAssignment_16_2 ) ) ;
    public final void rule__Association__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3486:1: ( ( ( rule__Association__ClassAssignment_16_2 ) ) )
            // InternalUmlTextual.g:3487:1: ( ( rule__Association__ClassAssignment_16_2 ) )
            {
            // InternalUmlTextual.g:3487:1: ( ( rule__Association__ClassAssignment_16_2 ) )
            // InternalUmlTextual.g:3488:2: ( rule__Association__ClassAssignment_16_2 )
            {
             before(grammarAccess.getAssociationAccess().getClassAssignment_16_2()); 
            // InternalUmlTextual.g:3489:2: ( rule__Association__ClassAssignment_16_2 )
            // InternalUmlTextual.g:3489:3: rule__Association__ClassAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__Association__ClassAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getClassAssignment_16_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_16__2__Impl"


    // $ANTLR start "rule__Aggregation__Group__0"
    // InternalUmlTextual.g:3498:1: rule__Aggregation__Group__0 : rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1 ;
    public final void rule__Aggregation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3502:1: ( rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1 )
            // InternalUmlTextual.g:3503:2: rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Aggregation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__0"


    // $ANTLR start "rule__Aggregation__Group__0__Impl"
    // InternalUmlTextual.g:3510:1: rule__Aggregation__Group__0__Impl : ( 'aggregation' ) ;
    public final void rule__Aggregation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3514:1: ( ( 'aggregation' ) )
            // InternalUmlTextual.g:3515:1: ( 'aggregation' )
            {
            // InternalUmlTextual.g:3515:1: ( 'aggregation' )
            // InternalUmlTextual.g:3516:2: 'aggregation'
            {
             before(grammarAccess.getAggregationAccess().getAggregationKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getAggregationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__0__Impl"


    // $ANTLR start "rule__Aggregation__Group__1"
    // InternalUmlTextual.g:3525:1: rule__Aggregation__Group__1 : rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2 ;
    public final void rule__Aggregation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3529:1: ( rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2 )
            // InternalUmlTextual.g:3530:2: rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Aggregation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__1"


    // $ANTLR start "rule__Aggregation__Group__1__Impl"
    // InternalUmlTextual.g:3537:1: rule__Aggregation__Group__1__Impl : ( ( rule__Aggregation__NameAssignment_1 ) ) ;
    public final void rule__Aggregation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3541:1: ( ( ( rule__Aggregation__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:3542:1: ( ( rule__Aggregation__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:3542:1: ( ( rule__Aggregation__NameAssignment_1 ) )
            // InternalUmlTextual.g:3543:2: ( rule__Aggregation__NameAssignment_1 )
            {
             before(grammarAccess.getAggregationAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:3544:2: ( rule__Aggregation__NameAssignment_1 )
            // InternalUmlTextual.g:3544:3: rule__Aggregation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAggregationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__1__Impl"


    // $ANTLR start "rule__Aggregation__Group__2"
    // InternalUmlTextual.g:3552:1: rule__Aggregation__Group__2 : rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3 ;
    public final void rule__Aggregation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3556:1: ( rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3 )
            // InternalUmlTextual.g:3557:2: rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Aggregation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__2"


    // $ANTLR start "rule__Aggregation__Group__2__Impl"
    // InternalUmlTextual.g:3564:1: rule__Aggregation__Group__2__Impl : ( '{' ) ;
    public final void rule__Aggregation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3568:1: ( ( '{' ) )
            // InternalUmlTextual.g:3569:1: ( '{' )
            {
            // InternalUmlTextual.g:3569:1: ( '{' )
            // InternalUmlTextual.g:3570:2: '{'
            {
             before(grammarAccess.getAggregationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__2__Impl"


    // $ANTLR start "rule__Aggregation__Group__3"
    // InternalUmlTextual.g:3579:1: rule__Aggregation__Group__3 : rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4 ;
    public final void rule__Aggregation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3583:1: ( rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4 )
            // InternalUmlTextual.g:3584:2: rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Aggregation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__3"


    // $ANTLR start "rule__Aggregation__Group__3__Impl"
    // InternalUmlTextual.g:3591:1: rule__Aggregation__Group__3__Impl : ( 'from' ) ;
    public final void rule__Aggregation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3595:1: ( ( 'from' ) )
            // InternalUmlTextual.g:3596:1: ( 'from' )
            {
            // InternalUmlTextual.g:3596:1: ( 'from' )
            // InternalUmlTextual.g:3597:2: 'from'
            {
             before(grammarAccess.getAggregationAccess().getFromKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__3__Impl"


    // $ANTLR start "rule__Aggregation__Group__4"
    // InternalUmlTextual.g:3606:1: rule__Aggregation__Group__4 : rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5 ;
    public final void rule__Aggregation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3610:1: ( rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5 )
            // InternalUmlTextual.g:3611:2: rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Aggregation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__4"


    // $ANTLR start "rule__Aggregation__Group__4__Impl"
    // InternalUmlTextual.g:3618:1: rule__Aggregation__Group__4__Impl : ( ( rule__Aggregation__Class1Assignment_4 ) ) ;
    public final void rule__Aggregation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3622:1: ( ( ( rule__Aggregation__Class1Assignment_4 ) ) )
            // InternalUmlTextual.g:3623:1: ( ( rule__Aggregation__Class1Assignment_4 ) )
            {
            // InternalUmlTextual.g:3623:1: ( ( rule__Aggregation__Class1Assignment_4 ) )
            // InternalUmlTextual.g:3624:2: ( rule__Aggregation__Class1Assignment_4 )
            {
             before(grammarAccess.getAggregationAccess().getClass1Assignment_4()); 
            // InternalUmlTextual.g:3625:2: ( rule__Aggregation__Class1Assignment_4 )
            // InternalUmlTextual.g:3625:3: rule__Aggregation__Class1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__Class1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAggregationAccess().getClass1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__4__Impl"


    // $ANTLR start "rule__Aggregation__Group__5"
    // InternalUmlTextual.g:3633:1: rule__Aggregation__Group__5 : rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6 ;
    public final void rule__Aggregation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3637:1: ( rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6 )
            // InternalUmlTextual.g:3638:2: rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Aggregation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__5"


    // $ANTLR start "rule__Aggregation__Group__5__Impl"
    // InternalUmlTextual.g:3645:1: rule__Aggregation__Group__5__Impl : ( '[' ) ;
    public final void rule__Aggregation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3649:1: ( ( '[' ) )
            // InternalUmlTextual.g:3650:1: ( '[' )
            {
            // InternalUmlTextual.g:3650:1: ( '[' )
            // InternalUmlTextual.g:3651:2: '['
            {
             before(grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__5__Impl"


    // $ANTLR start "rule__Aggregation__Group__6"
    // InternalUmlTextual.g:3660:1: rule__Aggregation__Group__6 : rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7 ;
    public final void rule__Aggregation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3664:1: ( rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7 )
            // InternalUmlTextual.g:3665:2: rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Aggregation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__6"


    // $ANTLR start "rule__Aggregation__Group__6__Impl"
    // InternalUmlTextual.g:3672:1: rule__Aggregation__Group__6__Impl : ( ( rule__Aggregation__Multiplicity1Assignment_6 ) ) ;
    public final void rule__Aggregation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3676:1: ( ( ( rule__Aggregation__Multiplicity1Assignment_6 ) ) )
            // InternalUmlTextual.g:3677:1: ( ( rule__Aggregation__Multiplicity1Assignment_6 ) )
            {
            // InternalUmlTextual.g:3677:1: ( ( rule__Aggregation__Multiplicity1Assignment_6 ) )
            // InternalUmlTextual.g:3678:2: ( rule__Aggregation__Multiplicity1Assignment_6 )
            {
             before(grammarAccess.getAggregationAccess().getMultiplicity1Assignment_6()); 
            // InternalUmlTextual.g:3679:2: ( rule__Aggregation__Multiplicity1Assignment_6 )
            // InternalUmlTextual.g:3679:3: rule__Aggregation__Multiplicity1Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__Multiplicity1Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAggregationAccess().getMultiplicity1Assignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__6__Impl"


    // $ANTLR start "rule__Aggregation__Group__7"
    // InternalUmlTextual.g:3687:1: rule__Aggregation__Group__7 : rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8 ;
    public final void rule__Aggregation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3691:1: ( rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8 )
            // InternalUmlTextual.g:3692:2: rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__Aggregation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__7"


    // $ANTLR start "rule__Aggregation__Group__7__Impl"
    // InternalUmlTextual.g:3699:1: rule__Aggregation__Group__7__Impl : ( ']' ) ;
    public final void rule__Aggregation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3703:1: ( ( ']' ) )
            // InternalUmlTextual.g:3704:1: ( ']' )
            {
            // InternalUmlTextual.g:3704:1: ( ']' )
            // InternalUmlTextual.g:3705:2: ']'
            {
             before(grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_7()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__7__Impl"


    // $ANTLR start "rule__Aggregation__Group__8"
    // InternalUmlTextual.g:3714:1: rule__Aggregation__Group__8 : rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9 ;
    public final void rule__Aggregation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3718:1: ( rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9 )
            // InternalUmlTextual.g:3719:2: rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9
            {
            pushFollow(FOLLOW_36);
            rule__Aggregation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__8"


    // $ANTLR start "rule__Aggregation__Group__8__Impl"
    // InternalUmlTextual.g:3726:1: rule__Aggregation__Group__8__Impl : ( 'to' ) ;
    public final void rule__Aggregation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3730:1: ( ( 'to' ) )
            // InternalUmlTextual.g:3731:1: ( 'to' )
            {
            // InternalUmlTextual.g:3731:1: ( 'to' )
            // InternalUmlTextual.g:3732:2: 'to'
            {
             before(grammarAccess.getAggregationAccess().getToKeyword_8()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getToKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__8__Impl"


    // $ANTLR start "rule__Aggregation__Group__9"
    // InternalUmlTextual.g:3741:1: rule__Aggregation__Group__9 : rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10 ;
    public final void rule__Aggregation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3745:1: ( rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10 )
            // InternalUmlTextual.g:3746:2: rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10
            {
            pushFollow(FOLLOW_36);
            rule__Aggregation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__9"


    // $ANTLR start "rule__Aggregation__Group__9__Impl"
    // InternalUmlTextual.g:3753:1: rule__Aggregation__Group__9__Impl : ( ( rule__Aggregation__NavigationAssignment_9 )? ) ;
    public final void rule__Aggregation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3757:1: ( ( ( rule__Aggregation__NavigationAssignment_9 )? ) )
            // InternalUmlTextual.g:3758:1: ( ( rule__Aggregation__NavigationAssignment_9 )? )
            {
            // InternalUmlTextual.g:3758:1: ( ( rule__Aggregation__NavigationAssignment_9 )? )
            // InternalUmlTextual.g:3759:2: ( rule__Aggregation__NavigationAssignment_9 )?
            {
             before(grammarAccess.getAggregationAccess().getNavigationAssignment_9()); 
            // InternalUmlTextual.g:3760:2: ( rule__Aggregation__NavigationAssignment_9 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUmlTextual.g:3760:3: rule__Aggregation__NavigationAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aggregation__NavigationAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAggregationAccess().getNavigationAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__9__Impl"


    // $ANTLR start "rule__Aggregation__Group__10"
    // InternalUmlTextual.g:3768:1: rule__Aggregation__Group__10 : rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11 ;
    public final void rule__Aggregation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3772:1: ( rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11 )
            // InternalUmlTextual.g:3773:2: rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__Aggregation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__10"


    // $ANTLR start "rule__Aggregation__Group__10__Impl"
    // InternalUmlTextual.g:3780:1: rule__Aggregation__Group__10__Impl : ( ( rule__Aggregation__Class2Assignment_10 ) ) ;
    public final void rule__Aggregation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3784:1: ( ( ( rule__Aggregation__Class2Assignment_10 ) ) )
            // InternalUmlTextual.g:3785:1: ( ( rule__Aggregation__Class2Assignment_10 ) )
            {
            // InternalUmlTextual.g:3785:1: ( ( rule__Aggregation__Class2Assignment_10 ) )
            // InternalUmlTextual.g:3786:2: ( rule__Aggregation__Class2Assignment_10 )
            {
             before(grammarAccess.getAggregationAccess().getClass2Assignment_10()); 
            // InternalUmlTextual.g:3787:2: ( rule__Aggregation__Class2Assignment_10 )
            // InternalUmlTextual.g:3787:3: rule__Aggregation__Class2Assignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__Class2Assignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAggregationAccess().getClass2Assignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__10__Impl"


    // $ANTLR start "rule__Aggregation__Group__11"
    // InternalUmlTextual.g:3795:1: rule__Aggregation__Group__11 : rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12 ;
    public final void rule__Aggregation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3799:1: ( rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12 )
            // InternalUmlTextual.g:3800:2: rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12
            {
            pushFollow(FOLLOW_25);
            rule__Aggregation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__11"


    // $ANTLR start "rule__Aggregation__Group__11__Impl"
    // InternalUmlTextual.g:3807:1: rule__Aggregation__Group__11__Impl : ( '[' ) ;
    public final void rule__Aggregation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3811:1: ( ( '[' ) )
            // InternalUmlTextual.g:3812:1: ( '[' )
            {
            // InternalUmlTextual.g:3812:1: ( '[' )
            // InternalUmlTextual.g:3813:2: '['
            {
             before(grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_11()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__11__Impl"


    // $ANTLR start "rule__Aggregation__Group__12"
    // InternalUmlTextual.g:3822:1: rule__Aggregation__Group__12 : rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13 ;
    public final void rule__Aggregation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3826:1: ( rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13 )
            // InternalUmlTextual.g:3827:2: rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13
            {
            pushFollow(FOLLOW_40);
            rule__Aggregation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__12"


    // $ANTLR start "rule__Aggregation__Group__12__Impl"
    // InternalUmlTextual.g:3834:1: rule__Aggregation__Group__12__Impl : ( ( rule__Aggregation__Multiplicity2Assignment_12 ) ) ;
    public final void rule__Aggregation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3838:1: ( ( ( rule__Aggregation__Multiplicity2Assignment_12 ) ) )
            // InternalUmlTextual.g:3839:1: ( ( rule__Aggregation__Multiplicity2Assignment_12 ) )
            {
            // InternalUmlTextual.g:3839:1: ( ( rule__Aggregation__Multiplicity2Assignment_12 ) )
            // InternalUmlTextual.g:3840:2: ( rule__Aggregation__Multiplicity2Assignment_12 )
            {
             before(grammarAccess.getAggregationAccess().getMultiplicity2Assignment_12()); 
            // InternalUmlTextual.g:3841:2: ( rule__Aggregation__Multiplicity2Assignment_12 )
            // InternalUmlTextual.g:3841:3: rule__Aggregation__Multiplicity2Assignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__Multiplicity2Assignment_12();

            state._fsp--;


            }

             after(grammarAccess.getAggregationAccess().getMultiplicity2Assignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__12__Impl"


    // $ANTLR start "rule__Aggregation__Group__13"
    // InternalUmlTextual.g:3849:1: rule__Aggregation__Group__13 : rule__Aggregation__Group__13__Impl ;
    public final void rule__Aggregation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3853:1: ( rule__Aggregation__Group__13__Impl )
            // InternalUmlTextual.g:3854:2: rule__Aggregation__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__13"


    // $ANTLR start "rule__Aggregation__Group__13__Impl"
    // InternalUmlTextual.g:3860:1: rule__Aggregation__Group__13__Impl : ( '}' ) ;
    public final void rule__Aggregation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3864:1: ( ( '}' ) )
            // InternalUmlTextual.g:3865:1: ( '}' )
            {
            // InternalUmlTextual.g:3865:1: ( '}' )
            // InternalUmlTextual.g:3866:2: '}'
            {
             before(grammarAccess.getAggregationAccess().getRightCurlyBracketKeyword_13()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__13__Impl"


    // $ANTLR start "rule__Composition__Group__0"
    // InternalUmlTextual.g:3876:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3880:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalUmlTextual.g:3881:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Composition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0"


    // $ANTLR start "rule__Composition__Group__0__Impl"
    // InternalUmlTextual.g:3888:1: rule__Composition__Group__0__Impl : ( 'composition' ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3892:1: ( ( 'composition' ) )
            // InternalUmlTextual.g:3893:1: ( 'composition' )
            {
            // InternalUmlTextual.g:3893:1: ( 'composition' )
            // InternalUmlTextual.g:3894:2: 'composition'
            {
             before(grammarAccess.getCompositionAccess().getCompositionKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getCompositionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__0__Impl"


    // $ANTLR start "rule__Composition__Group__1"
    // InternalUmlTextual.g:3903:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3907:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalUmlTextual.g:3908:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Composition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__1"


    // $ANTLR start "rule__Composition__Group__1__Impl"
    // InternalUmlTextual.g:3915:1: rule__Composition__Group__1__Impl : ( ( rule__Composition__NameAssignment_1 ) ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3919:1: ( ( ( rule__Composition__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:3920:1: ( ( rule__Composition__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:3920:1: ( ( rule__Composition__NameAssignment_1 ) )
            // InternalUmlTextual.g:3921:2: ( rule__Composition__NameAssignment_1 )
            {
             before(grammarAccess.getCompositionAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:3922:2: ( rule__Composition__NameAssignment_1 )
            // InternalUmlTextual.g:3922:3: rule__Composition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Composition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__1__Impl"


    // $ANTLR start "rule__Composition__Group__2"
    // InternalUmlTextual.g:3930:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl rule__Composition__Group__3 ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3934:1: ( rule__Composition__Group__2__Impl rule__Composition__Group__3 )
            // InternalUmlTextual.g:3935:2: rule__Composition__Group__2__Impl rule__Composition__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__Composition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__2"


    // $ANTLR start "rule__Composition__Group__2__Impl"
    // InternalUmlTextual.g:3942:1: rule__Composition__Group__2__Impl : ( '{' ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3946:1: ( ( '{' ) )
            // InternalUmlTextual.g:3947:1: ( '{' )
            {
            // InternalUmlTextual.g:3947:1: ( '{' )
            // InternalUmlTextual.g:3948:2: '{'
            {
             before(grammarAccess.getCompositionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__2__Impl"


    // $ANTLR start "rule__Composition__Group__3"
    // InternalUmlTextual.g:3957:1: rule__Composition__Group__3 : rule__Composition__Group__3__Impl rule__Composition__Group__4 ;
    public final void rule__Composition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3961:1: ( rule__Composition__Group__3__Impl rule__Composition__Group__4 )
            // InternalUmlTextual.g:3962:2: rule__Composition__Group__3__Impl rule__Composition__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Composition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__3"


    // $ANTLR start "rule__Composition__Group__3__Impl"
    // InternalUmlTextual.g:3969:1: rule__Composition__Group__3__Impl : ( 'from' ) ;
    public final void rule__Composition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3973:1: ( ( 'from' ) )
            // InternalUmlTextual.g:3974:1: ( 'from' )
            {
            // InternalUmlTextual.g:3974:1: ( 'from' )
            // InternalUmlTextual.g:3975:2: 'from'
            {
             before(grammarAccess.getCompositionAccess().getFromKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__3__Impl"


    // $ANTLR start "rule__Composition__Group__4"
    // InternalUmlTextual.g:3984:1: rule__Composition__Group__4 : rule__Composition__Group__4__Impl rule__Composition__Group__5 ;
    public final void rule__Composition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3988:1: ( rule__Composition__Group__4__Impl rule__Composition__Group__5 )
            // InternalUmlTextual.g:3989:2: rule__Composition__Group__4__Impl rule__Composition__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Composition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__4"


    // $ANTLR start "rule__Composition__Group__4__Impl"
    // InternalUmlTextual.g:3996:1: rule__Composition__Group__4__Impl : ( ( rule__Composition__Class1Assignment_4 ) ) ;
    public final void rule__Composition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4000:1: ( ( ( rule__Composition__Class1Assignment_4 ) ) )
            // InternalUmlTextual.g:4001:1: ( ( rule__Composition__Class1Assignment_4 ) )
            {
            // InternalUmlTextual.g:4001:1: ( ( rule__Composition__Class1Assignment_4 ) )
            // InternalUmlTextual.g:4002:2: ( rule__Composition__Class1Assignment_4 )
            {
             before(grammarAccess.getCompositionAccess().getClass1Assignment_4()); 
            // InternalUmlTextual.g:4003:2: ( rule__Composition__Class1Assignment_4 )
            // InternalUmlTextual.g:4003:3: rule__Composition__Class1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Class1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getClass1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__4__Impl"


    // $ANTLR start "rule__Composition__Group__5"
    // InternalUmlTextual.g:4011:1: rule__Composition__Group__5 : rule__Composition__Group__5__Impl rule__Composition__Group__6 ;
    public final void rule__Composition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4015:1: ( rule__Composition__Group__5__Impl rule__Composition__Group__6 )
            // InternalUmlTextual.g:4016:2: rule__Composition__Group__5__Impl rule__Composition__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__Composition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__5"


    // $ANTLR start "rule__Composition__Group__5__Impl"
    // InternalUmlTextual.g:4023:1: rule__Composition__Group__5__Impl : ( '[' ) ;
    public final void rule__Composition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4027:1: ( ( '[' ) )
            // InternalUmlTextual.g:4028:1: ( '[' )
            {
            // InternalUmlTextual.g:4028:1: ( '[' )
            // InternalUmlTextual.g:4029:2: '['
            {
             before(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_5()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__5__Impl"


    // $ANTLR start "rule__Composition__Group__6"
    // InternalUmlTextual.g:4038:1: rule__Composition__Group__6 : rule__Composition__Group__6__Impl rule__Composition__Group__7 ;
    public final void rule__Composition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4042:1: ( rule__Composition__Group__6__Impl rule__Composition__Group__7 )
            // InternalUmlTextual.g:4043:2: rule__Composition__Group__6__Impl rule__Composition__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Composition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__6"


    // $ANTLR start "rule__Composition__Group__6__Impl"
    // InternalUmlTextual.g:4050:1: rule__Composition__Group__6__Impl : ( ( rule__Composition__Multiplicity1Assignment_6 ) ) ;
    public final void rule__Composition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4054:1: ( ( ( rule__Composition__Multiplicity1Assignment_6 ) ) )
            // InternalUmlTextual.g:4055:1: ( ( rule__Composition__Multiplicity1Assignment_6 ) )
            {
            // InternalUmlTextual.g:4055:1: ( ( rule__Composition__Multiplicity1Assignment_6 ) )
            // InternalUmlTextual.g:4056:2: ( rule__Composition__Multiplicity1Assignment_6 )
            {
             before(grammarAccess.getCompositionAccess().getMultiplicity1Assignment_6()); 
            // InternalUmlTextual.g:4057:2: ( rule__Composition__Multiplicity1Assignment_6 )
            // InternalUmlTextual.g:4057:3: rule__Composition__Multiplicity1Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Multiplicity1Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getMultiplicity1Assignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__6__Impl"


    // $ANTLR start "rule__Composition__Group__7"
    // InternalUmlTextual.g:4065:1: rule__Composition__Group__7 : rule__Composition__Group__7__Impl rule__Composition__Group__8 ;
    public final void rule__Composition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4069:1: ( rule__Composition__Group__7__Impl rule__Composition__Group__8 )
            // InternalUmlTextual.g:4070:2: rule__Composition__Group__7__Impl rule__Composition__Group__8
            {
            pushFollow(FOLLOW_37);
            rule__Composition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__7"


    // $ANTLR start "rule__Composition__Group__7__Impl"
    // InternalUmlTextual.g:4077:1: rule__Composition__Group__7__Impl : ( ']' ) ;
    public final void rule__Composition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4081:1: ( ( ']' ) )
            // InternalUmlTextual.g:4082:1: ( ']' )
            {
            // InternalUmlTextual.g:4082:1: ( ']' )
            // InternalUmlTextual.g:4083:2: ']'
            {
             before(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_7()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__7__Impl"


    // $ANTLR start "rule__Composition__Group__8"
    // InternalUmlTextual.g:4092:1: rule__Composition__Group__8 : rule__Composition__Group__8__Impl rule__Composition__Group__9 ;
    public final void rule__Composition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4096:1: ( rule__Composition__Group__8__Impl rule__Composition__Group__9 )
            // InternalUmlTextual.g:4097:2: rule__Composition__Group__8__Impl rule__Composition__Group__9
            {
            pushFollow(FOLLOW_36);
            rule__Composition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__8"


    // $ANTLR start "rule__Composition__Group__8__Impl"
    // InternalUmlTextual.g:4104:1: rule__Composition__Group__8__Impl : ( 'to' ) ;
    public final void rule__Composition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4108:1: ( ( 'to' ) )
            // InternalUmlTextual.g:4109:1: ( 'to' )
            {
            // InternalUmlTextual.g:4109:1: ( 'to' )
            // InternalUmlTextual.g:4110:2: 'to'
            {
             before(grammarAccess.getCompositionAccess().getToKeyword_8()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getToKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__8__Impl"


    // $ANTLR start "rule__Composition__Group__9"
    // InternalUmlTextual.g:4119:1: rule__Composition__Group__9 : rule__Composition__Group__9__Impl rule__Composition__Group__10 ;
    public final void rule__Composition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4123:1: ( rule__Composition__Group__9__Impl rule__Composition__Group__10 )
            // InternalUmlTextual.g:4124:2: rule__Composition__Group__9__Impl rule__Composition__Group__10
            {
            pushFollow(FOLLOW_36);
            rule__Composition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__9"


    // $ANTLR start "rule__Composition__Group__9__Impl"
    // InternalUmlTextual.g:4131:1: rule__Composition__Group__9__Impl : ( ( rule__Composition__NavigationAssignment_9 )? ) ;
    public final void rule__Composition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4135:1: ( ( ( rule__Composition__NavigationAssignment_9 )? ) )
            // InternalUmlTextual.g:4136:1: ( ( rule__Composition__NavigationAssignment_9 )? )
            {
            // InternalUmlTextual.g:4136:1: ( ( rule__Composition__NavigationAssignment_9 )? )
            // InternalUmlTextual.g:4137:2: ( rule__Composition__NavigationAssignment_9 )?
            {
             before(grammarAccess.getCompositionAccess().getNavigationAssignment_9()); 
            // InternalUmlTextual.g:4138:2: ( rule__Composition__NavigationAssignment_9 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==14) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUmlTextual.g:4138:3: rule__Composition__NavigationAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Composition__NavigationAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositionAccess().getNavigationAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__9__Impl"


    // $ANTLR start "rule__Composition__Group__10"
    // InternalUmlTextual.g:4146:1: rule__Composition__Group__10 : rule__Composition__Group__10__Impl rule__Composition__Group__11 ;
    public final void rule__Composition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4150:1: ( rule__Composition__Group__10__Impl rule__Composition__Group__11 )
            // InternalUmlTextual.g:4151:2: rule__Composition__Group__10__Impl rule__Composition__Group__11
            {
            pushFollow(FOLLOW_24);
            rule__Composition__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__10"


    // $ANTLR start "rule__Composition__Group__10__Impl"
    // InternalUmlTextual.g:4158:1: rule__Composition__Group__10__Impl : ( ( rule__Composition__Class2Assignment_10 ) ) ;
    public final void rule__Composition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4162:1: ( ( ( rule__Composition__Class2Assignment_10 ) ) )
            // InternalUmlTextual.g:4163:1: ( ( rule__Composition__Class2Assignment_10 ) )
            {
            // InternalUmlTextual.g:4163:1: ( ( rule__Composition__Class2Assignment_10 ) )
            // InternalUmlTextual.g:4164:2: ( rule__Composition__Class2Assignment_10 )
            {
             before(grammarAccess.getCompositionAccess().getClass2Assignment_10()); 
            // InternalUmlTextual.g:4165:2: ( rule__Composition__Class2Assignment_10 )
            // InternalUmlTextual.g:4165:3: rule__Composition__Class2Assignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Class2Assignment_10();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getClass2Assignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__10__Impl"


    // $ANTLR start "rule__Composition__Group__11"
    // InternalUmlTextual.g:4173:1: rule__Composition__Group__11 : rule__Composition__Group__11__Impl rule__Composition__Group__12 ;
    public final void rule__Composition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4177:1: ( rule__Composition__Group__11__Impl rule__Composition__Group__12 )
            // InternalUmlTextual.g:4178:2: rule__Composition__Group__11__Impl rule__Composition__Group__12
            {
            pushFollow(FOLLOW_25);
            rule__Composition__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__11"


    // $ANTLR start "rule__Composition__Group__11__Impl"
    // InternalUmlTextual.g:4185:1: rule__Composition__Group__11__Impl : ( '[' ) ;
    public final void rule__Composition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4189:1: ( ( '[' ) )
            // InternalUmlTextual.g:4190:1: ( '[' )
            {
            // InternalUmlTextual.g:4190:1: ( '[' )
            // InternalUmlTextual.g:4191:2: '['
            {
             before(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_11()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__11__Impl"


    // $ANTLR start "rule__Composition__Group__12"
    // InternalUmlTextual.g:4200:1: rule__Composition__Group__12 : rule__Composition__Group__12__Impl rule__Composition__Group__13 ;
    public final void rule__Composition__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4204:1: ( rule__Composition__Group__12__Impl rule__Composition__Group__13 )
            // InternalUmlTextual.g:4205:2: rule__Composition__Group__12__Impl rule__Composition__Group__13
            {
            pushFollow(FOLLOW_40);
            rule__Composition__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__12"


    // $ANTLR start "rule__Composition__Group__12__Impl"
    // InternalUmlTextual.g:4212:1: rule__Composition__Group__12__Impl : ( ( rule__Composition__Multiplicity2Assignment_12 ) ) ;
    public final void rule__Composition__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4216:1: ( ( ( rule__Composition__Multiplicity2Assignment_12 ) ) )
            // InternalUmlTextual.g:4217:1: ( ( rule__Composition__Multiplicity2Assignment_12 ) )
            {
            // InternalUmlTextual.g:4217:1: ( ( rule__Composition__Multiplicity2Assignment_12 ) )
            // InternalUmlTextual.g:4218:2: ( rule__Composition__Multiplicity2Assignment_12 )
            {
             before(grammarAccess.getCompositionAccess().getMultiplicity2Assignment_12()); 
            // InternalUmlTextual.g:4219:2: ( rule__Composition__Multiplicity2Assignment_12 )
            // InternalUmlTextual.g:4219:3: rule__Composition__Multiplicity2Assignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Multiplicity2Assignment_12();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getMultiplicity2Assignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__12__Impl"


    // $ANTLR start "rule__Composition__Group__13"
    // InternalUmlTextual.g:4227:1: rule__Composition__Group__13 : rule__Composition__Group__13__Impl ;
    public final void rule__Composition__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4231:1: ( rule__Composition__Group__13__Impl )
            // InternalUmlTextual.g:4232:2: rule__Composition__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__13"


    // $ANTLR start "rule__Composition__Group__13__Impl"
    // InternalUmlTextual.g:4238:1: rule__Composition__Group__13__Impl : ( '}' ) ;
    public final void rule__Composition__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4242:1: ( ( '}' ) )
            // InternalUmlTextual.g:4243:1: ( '}' )
            {
            // InternalUmlTextual.g:4243:1: ( '}' )
            // InternalUmlTextual.g:4244:2: '}'
            {
             before(grammarAccess.getCompositionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__13__Impl"


    // $ANTLR start "rule__UseCaseDiagram__Group__0"
    // InternalUmlTextual.g:4254:1: rule__UseCaseDiagram__Group__0 : rule__UseCaseDiagram__Group__0__Impl rule__UseCaseDiagram__Group__1 ;
    public final void rule__UseCaseDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4258:1: ( rule__UseCaseDiagram__Group__0__Impl rule__UseCaseDiagram__Group__1 )
            // InternalUmlTextual.g:4259:2: rule__UseCaseDiagram__Group__0__Impl rule__UseCaseDiagram__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__UseCaseDiagram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDiagram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__0"


    // $ANTLR start "rule__UseCaseDiagram__Group__0__Impl"
    // InternalUmlTextual.g:4266:1: rule__UseCaseDiagram__Group__0__Impl : ( 'usecase' ) ;
    public final void rule__UseCaseDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4270:1: ( ( 'usecase' ) )
            // InternalUmlTextual.g:4271:1: ( 'usecase' )
            {
            // InternalUmlTextual.g:4271:1: ( 'usecase' )
            // InternalUmlTextual.g:4272:2: 'usecase'
            {
             before(grammarAccess.getUseCaseDiagramAccess().getUsecaseKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getUseCaseDiagramAccess().getUsecaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__0__Impl"


    // $ANTLR start "rule__UseCaseDiagram__Group__1"
    // InternalUmlTextual.g:4281:1: rule__UseCaseDiagram__Group__1 : rule__UseCaseDiagram__Group__1__Impl rule__UseCaseDiagram__Group__2 ;
    public final void rule__UseCaseDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4285:1: ( rule__UseCaseDiagram__Group__1__Impl rule__UseCaseDiagram__Group__2 )
            // InternalUmlTextual.g:4286:2: rule__UseCaseDiagram__Group__1__Impl rule__UseCaseDiagram__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UseCaseDiagram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDiagram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__1"


    // $ANTLR start "rule__UseCaseDiagram__Group__1__Impl"
    // InternalUmlTextual.g:4293:1: rule__UseCaseDiagram__Group__1__Impl : ( 'diagram' ) ;
    public final void rule__UseCaseDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4297:1: ( ( 'diagram' ) )
            // InternalUmlTextual.g:4298:1: ( 'diagram' )
            {
            // InternalUmlTextual.g:4298:1: ( 'diagram' )
            // InternalUmlTextual.g:4299:2: 'diagram'
            {
             before(grammarAccess.getUseCaseDiagramAccess().getDiagramKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getUseCaseDiagramAccess().getDiagramKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__1__Impl"


    // $ANTLR start "rule__UseCaseDiagram__Group__2"
    // InternalUmlTextual.g:4308:1: rule__UseCaseDiagram__Group__2 : rule__UseCaseDiagram__Group__2__Impl rule__UseCaseDiagram__Group__3 ;
    public final void rule__UseCaseDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4312:1: ( rule__UseCaseDiagram__Group__2__Impl rule__UseCaseDiagram__Group__3 )
            // InternalUmlTextual.g:4313:2: rule__UseCaseDiagram__Group__2__Impl rule__UseCaseDiagram__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__UseCaseDiagram__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDiagram__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__2"


    // $ANTLR start "rule__UseCaseDiagram__Group__2__Impl"
    // InternalUmlTextual.g:4320:1: rule__UseCaseDiagram__Group__2__Impl : ( ( rule__UseCaseDiagram__NameAssignment_2 ) ) ;
    public final void rule__UseCaseDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4324:1: ( ( ( rule__UseCaseDiagram__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:4325:1: ( ( rule__UseCaseDiagram__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:4325:1: ( ( rule__UseCaseDiagram__NameAssignment_2 ) )
            // InternalUmlTextual.g:4326:2: ( rule__UseCaseDiagram__NameAssignment_2 )
            {
             before(grammarAccess.getUseCaseDiagramAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:4327:2: ( rule__UseCaseDiagram__NameAssignment_2 )
            // InternalUmlTextual.g:4327:3: rule__UseCaseDiagram__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDiagram__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseDiagramAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__2__Impl"


    // $ANTLR start "rule__UseCaseDiagram__Group__3"
    // InternalUmlTextual.g:4335:1: rule__UseCaseDiagram__Group__3 : rule__UseCaseDiagram__Group__3__Impl rule__UseCaseDiagram__Group__4 ;
    public final void rule__UseCaseDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4339:1: ( rule__UseCaseDiagram__Group__3__Impl rule__UseCaseDiagram__Group__4 )
            // InternalUmlTextual.g:4340:2: rule__UseCaseDiagram__Group__3__Impl rule__UseCaseDiagram__Group__4
            {
            pushFollow(FOLLOW_42);
            rule__UseCaseDiagram__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDiagram__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__3"


    // $ANTLR start "rule__UseCaseDiagram__Group__3__Impl"
    // InternalUmlTextual.g:4347:1: rule__UseCaseDiagram__Group__3__Impl : ( '{' ) ;
    public final void rule__UseCaseDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4351:1: ( ( '{' ) )
            // InternalUmlTextual.g:4352:1: ( '{' )
            {
            // InternalUmlTextual.g:4352:1: ( '{' )
            // InternalUmlTextual.g:4353:2: '{'
            {
             before(grammarAccess.getUseCaseDiagramAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUseCaseDiagramAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__3__Impl"


    // $ANTLR start "rule__UseCaseDiagram__Group__4"
    // InternalUmlTextual.g:4362:1: rule__UseCaseDiagram__Group__4 : rule__UseCaseDiagram__Group__4__Impl rule__UseCaseDiagram__Group__5 ;
    public final void rule__UseCaseDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4366:1: ( rule__UseCaseDiagram__Group__4__Impl rule__UseCaseDiagram__Group__5 )
            // InternalUmlTextual.g:4367:2: rule__UseCaseDiagram__Group__4__Impl rule__UseCaseDiagram__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__UseCaseDiagram__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCaseDiagram__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__4"


    // $ANTLR start "rule__UseCaseDiagram__Group__4__Impl"
    // InternalUmlTextual.g:4374:1: rule__UseCaseDiagram__Group__4__Impl : ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* ) ;
    public final void rule__UseCaseDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4378:1: ( ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* ) )
            // InternalUmlTextual.g:4379:1: ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* )
            {
            // InternalUmlTextual.g:4379:1: ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* )
            // InternalUmlTextual.g:4380:2: ( rule__UseCaseDiagram__ElementsAssignment_4 )*
            {
             before(grammarAccess.getUseCaseDiagramAccess().getElementsAssignment_4()); 
            // InternalUmlTextual.g:4381:2: ( rule__UseCaseDiagram__ElementsAssignment_4 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=11 && LA39_0<=12)||LA39_0==15||(LA39_0>=17 && LA39_0<=19)||LA39_0==55||LA39_0==57||LA39_0==69) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalUmlTextual.g:4381:3: rule__UseCaseDiagram__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__UseCaseDiagram__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getUseCaseDiagramAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__4__Impl"


    // $ANTLR start "rule__UseCaseDiagram__Group__5"
    // InternalUmlTextual.g:4389:1: rule__UseCaseDiagram__Group__5 : rule__UseCaseDiagram__Group__5__Impl ;
    public final void rule__UseCaseDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4393:1: ( rule__UseCaseDiagram__Group__5__Impl )
            // InternalUmlTextual.g:4394:2: rule__UseCaseDiagram__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCaseDiagram__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__5"


    // $ANTLR start "rule__UseCaseDiagram__Group__5__Impl"
    // InternalUmlTextual.g:4400:1: rule__UseCaseDiagram__Group__5__Impl : ( '}' ) ;
    public final void rule__UseCaseDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4404:1: ( ( '}' ) )
            // InternalUmlTextual.g:4405:1: ( '}' )
            {
            // InternalUmlTextual.g:4405:1: ( '}' )
            // InternalUmlTextual.g:4406:2: '}'
            {
             before(grammarAccess.getUseCaseDiagramAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUseCaseDiagramAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__Group__5__Impl"


    // $ANTLR start "rule__Actor__Group__0"
    // InternalUmlTextual.g:4416:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4420:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalUmlTextual.g:4421:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Actor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0"


    // $ANTLR start "rule__Actor__Group__0__Impl"
    // InternalUmlTextual.g:4428:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__VisibilityAssignment_0 )? ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4432:1: ( ( ( rule__Actor__VisibilityAssignment_0 )? ) )
            // InternalUmlTextual.g:4433:1: ( ( rule__Actor__VisibilityAssignment_0 )? )
            {
            // InternalUmlTextual.g:4433:1: ( ( rule__Actor__VisibilityAssignment_0 )? )
            // InternalUmlTextual.g:4434:2: ( rule__Actor__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getActorAccess().getVisibilityAssignment_0()); 
            // InternalUmlTextual.g:4435:2: ( rule__Actor__VisibilityAssignment_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==15||(LA40_0>=17 && LA40_0<=19)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUmlTextual.g:4435:3: rule__Actor__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__0__Impl"


    // $ANTLR start "rule__Actor__Group__1"
    // InternalUmlTextual.g:4443:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4447:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalUmlTextual.g:4448:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__Actor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1"


    // $ANTLR start "rule__Actor__Group__1__Impl"
    // InternalUmlTextual.g:4455:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__AbstractAssignment_1 )? ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4459:1: ( ( ( rule__Actor__AbstractAssignment_1 )? ) )
            // InternalUmlTextual.g:4460:1: ( ( rule__Actor__AbstractAssignment_1 )? )
            {
            // InternalUmlTextual.g:4460:1: ( ( rule__Actor__AbstractAssignment_1 )? )
            // InternalUmlTextual.g:4461:2: ( rule__Actor__AbstractAssignment_1 )?
            {
             before(grammarAccess.getActorAccess().getAbstractAssignment_1()); 
            // InternalUmlTextual.g:4462:2: ( rule__Actor__AbstractAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==11) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUmlTextual.g:4462:3: rule__Actor__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__AbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getAbstractAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__1__Impl"


    // $ANTLR start "rule__Actor__Group__2"
    // InternalUmlTextual.g:4470:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4474:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalUmlTextual.g:4475:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__Actor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2"


    // $ANTLR start "rule__Actor__Group__2__Impl"
    // InternalUmlTextual.g:4482:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__ActiveAssignment_2 )? ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4486:1: ( ( ( rule__Actor__ActiveAssignment_2 )? ) )
            // InternalUmlTextual.g:4487:1: ( ( rule__Actor__ActiveAssignment_2 )? )
            {
            // InternalUmlTextual.g:4487:1: ( ( rule__Actor__ActiveAssignment_2 )? )
            // InternalUmlTextual.g:4488:2: ( rule__Actor__ActiveAssignment_2 )?
            {
             before(grammarAccess.getActorAccess().getActiveAssignment_2()); 
            // InternalUmlTextual.g:4489:2: ( rule__Actor__ActiveAssignment_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==12) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUmlTextual.g:4489:3: rule__Actor__ActiveAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__ActiveAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getActiveAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__2__Impl"


    // $ANTLR start "rule__Actor__Group__3"
    // InternalUmlTextual.g:4497:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4501:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // InternalUmlTextual.g:4502:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__Actor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3"


    // $ANTLR start "rule__Actor__Group__3__Impl"
    // InternalUmlTextual.g:4509:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__BusinessAssignment_3 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4513:1: ( ( ( rule__Actor__BusinessAssignment_3 )? ) )
            // InternalUmlTextual.g:4514:1: ( ( rule__Actor__BusinessAssignment_3 )? )
            {
            // InternalUmlTextual.g:4514:1: ( ( rule__Actor__BusinessAssignment_3 )? )
            // InternalUmlTextual.g:4515:2: ( rule__Actor__BusinessAssignment_3 )?
            {
             before(grammarAccess.getActorAccess().getBusinessAssignment_3()); 
            // InternalUmlTextual.g:4516:2: ( rule__Actor__BusinessAssignment_3 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==69) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUmlTextual.g:4516:3: rule__Actor__BusinessAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__BusinessAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getBusinessAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__3__Impl"


    // $ANTLR start "rule__Actor__Group__4"
    // InternalUmlTextual.g:4524:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl rule__Actor__Group__5 ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4528:1: ( rule__Actor__Group__4__Impl rule__Actor__Group__5 )
            // InternalUmlTextual.g:4529:2: rule__Actor__Group__4__Impl rule__Actor__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Actor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4"


    // $ANTLR start "rule__Actor__Group__4__Impl"
    // InternalUmlTextual.g:4536:1: rule__Actor__Group__4__Impl : ( 'actor' ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4540:1: ( ( 'actor' ) )
            // InternalUmlTextual.g:4541:1: ( 'actor' )
            {
            // InternalUmlTextual.g:4541:1: ( 'actor' )
            // InternalUmlTextual.g:4542:2: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_4()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getActorKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__4__Impl"


    // $ANTLR start "rule__Actor__Group__5"
    // InternalUmlTextual.g:4551:1: rule__Actor__Group__5 : rule__Actor__Group__5__Impl rule__Actor__Group__6 ;
    public final void rule__Actor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4555:1: ( rule__Actor__Group__5__Impl rule__Actor__Group__6 )
            // InternalUmlTextual.g:4556:2: rule__Actor__Group__5__Impl rule__Actor__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Actor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__5"


    // $ANTLR start "rule__Actor__Group__5__Impl"
    // InternalUmlTextual.g:4563:1: rule__Actor__Group__5__Impl : ( ( rule__Actor__NameAssignment_5 ) ) ;
    public final void rule__Actor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4567:1: ( ( ( rule__Actor__NameAssignment_5 ) ) )
            // InternalUmlTextual.g:4568:1: ( ( rule__Actor__NameAssignment_5 ) )
            {
            // InternalUmlTextual.g:4568:1: ( ( rule__Actor__NameAssignment_5 ) )
            // InternalUmlTextual.g:4569:2: ( rule__Actor__NameAssignment_5 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_5()); 
            // InternalUmlTextual.g:4570:2: ( rule__Actor__NameAssignment_5 )
            // InternalUmlTextual.g:4570:3: rule__Actor__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Actor__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__5__Impl"


    // $ANTLR start "rule__Actor__Group__6"
    // InternalUmlTextual.g:4578:1: rule__Actor__Group__6 : rule__Actor__Group__6__Impl rule__Actor__Group__7 ;
    public final void rule__Actor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4582:1: ( rule__Actor__Group__6__Impl rule__Actor__Group__7 )
            // InternalUmlTextual.g:4583:2: rule__Actor__Group__6__Impl rule__Actor__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Actor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__6"


    // $ANTLR start "rule__Actor__Group__6__Impl"
    // InternalUmlTextual.g:4590:1: rule__Actor__Group__6__Impl : ( ( rule__Actor__Group_6__0 )? ) ;
    public final void rule__Actor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4594:1: ( ( ( rule__Actor__Group_6__0 )? ) )
            // InternalUmlTextual.g:4595:1: ( ( rule__Actor__Group_6__0 )? )
            {
            // InternalUmlTextual.g:4595:1: ( ( rule__Actor__Group_6__0 )? )
            // InternalUmlTextual.g:4596:2: ( rule__Actor__Group_6__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_6()); 
            // InternalUmlTextual.g:4597:2: ( rule__Actor__Group_6__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==31) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUmlTextual.g:4597:3: rule__Actor__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actor__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__6__Impl"


    // $ANTLR start "rule__Actor__Group__7"
    // InternalUmlTextual.g:4605:1: rule__Actor__Group__7 : rule__Actor__Group__7__Impl rule__Actor__Group__8 ;
    public final void rule__Actor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4609:1: ( rule__Actor__Group__7__Impl rule__Actor__Group__8 )
            // InternalUmlTextual.g:4610:2: rule__Actor__Group__7__Impl rule__Actor__Group__8
            {
            pushFollow(FOLLOW_45);
            rule__Actor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__7"


    // $ANTLR start "rule__Actor__Group__7__Impl"
    // InternalUmlTextual.g:4617:1: rule__Actor__Group__7__Impl : ( '{' ) ;
    public final void rule__Actor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4621:1: ( ( '{' ) )
            // InternalUmlTextual.g:4622:1: ( '{' )
            {
            // InternalUmlTextual.g:4622:1: ( '{' )
            // InternalUmlTextual.g:4623:2: '{'
            {
             before(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__7__Impl"


    // $ANTLR start "rule__Actor__Group__8"
    // InternalUmlTextual.g:4632:1: rule__Actor__Group__8 : rule__Actor__Group__8__Impl rule__Actor__Group__9 ;
    public final void rule__Actor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4636:1: ( rule__Actor__Group__8__Impl rule__Actor__Group__9 )
            // InternalUmlTextual.g:4637:2: rule__Actor__Group__8__Impl rule__Actor__Group__9
            {
            pushFollow(FOLLOW_45);
            rule__Actor__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__8"


    // $ANTLR start "rule__Actor__Group__8__Impl"
    // InternalUmlTextual.g:4644:1: rule__Actor__Group__8__Impl : ( ( rule__Actor__UseCasesAssignment_8 )* ) ;
    public final void rule__Actor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4648:1: ( ( ( rule__Actor__UseCasesAssignment_8 )* ) )
            // InternalUmlTextual.g:4649:1: ( ( rule__Actor__UseCasesAssignment_8 )* )
            {
            // InternalUmlTextual.g:4649:1: ( ( rule__Actor__UseCasesAssignment_8 )* )
            // InternalUmlTextual.g:4650:2: ( rule__Actor__UseCasesAssignment_8 )*
            {
             before(grammarAccess.getActorAccess().getUseCasesAssignment_8()); 
            // InternalUmlTextual.g:4651:2: ( rule__Actor__UseCasesAssignment_8 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==59) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalUmlTextual.g:4651:3: rule__Actor__UseCasesAssignment_8
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__Actor__UseCasesAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getUseCasesAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__8__Impl"


    // $ANTLR start "rule__Actor__Group__9"
    // InternalUmlTextual.g:4659:1: rule__Actor__Group__9 : rule__Actor__Group__9__Impl ;
    public final void rule__Actor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4663:1: ( rule__Actor__Group__9__Impl )
            // InternalUmlTextual.g:4664:2: rule__Actor__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__9"


    // $ANTLR start "rule__Actor__Group__9__Impl"
    // InternalUmlTextual.g:4670:1: rule__Actor__Group__9__Impl : ( '}' ) ;
    public final void rule__Actor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4674:1: ( ( '}' ) )
            // InternalUmlTextual.g:4675:1: ( '}' )
            {
            // InternalUmlTextual.g:4675:1: ( '}' )
            // InternalUmlTextual.g:4676:2: '}'
            {
             before(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group__9__Impl"


    // $ANTLR start "rule__Actor__Group_6__0"
    // InternalUmlTextual.g:4686:1: rule__Actor__Group_6__0 : rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1 ;
    public final void rule__Actor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4690:1: ( rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1 )
            // InternalUmlTextual.g:4691:2: rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1
            {
            pushFollow(FOLLOW_44);
            rule__Actor__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_6__0"


    // $ANTLR start "rule__Actor__Group_6__0__Impl"
    // InternalUmlTextual.g:4698:1: rule__Actor__Group_6__0__Impl : ( 'extends' ) ;
    public final void rule__Actor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4702:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:4703:1: ( 'extends' )
            {
            // InternalUmlTextual.g:4703:1: ( 'extends' )
            // InternalUmlTextual.g:4704:2: 'extends'
            {
             before(grammarAccess.getActorAccess().getExtendsKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getExtendsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_6__0__Impl"


    // $ANTLR start "rule__Actor__Group_6__1"
    // InternalUmlTextual.g:4713:1: rule__Actor__Group_6__1 : rule__Actor__Group_6__1__Impl ;
    public final void rule__Actor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4717:1: ( rule__Actor__Group_6__1__Impl )
            // InternalUmlTextual.g:4718:2: rule__Actor__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_6__1"


    // $ANTLR start "rule__Actor__Group_6__1__Impl"
    // InternalUmlTextual.g:4724:1: rule__Actor__Group_6__1__Impl : ( ( rule__Actor__ParentActorAssignment_6_1 ) ) ;
    public final void rule__Actor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4728:1: ( ( ( rule__Actor__ParentActorAssignment_6_1 ) ) )
            // InternalUmlTextual.g:4729:1: ( ( rule__Actor__ParentActorAssignment_6_1 ) )
            {
            // InternalUmlTextual.g:4729:1: ( ( rule__Actor__ParentActorAssignment_6_1 ) )
            // InternalUmlTextual.g:4730:2: ( rule__Actor__ParentActorAssignment_6_1 )
            {
             before(grammarAccess.getActorAccess().getParentActorAssignment_6_1()); 
            // InternalUmlTextual.g:4731:2: ( rule__Actor__ParentActorAssignment_6_1 )
            // InternalUmlTextual.g:4731:3: rule__Actor__ParentActorAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__ParentActorAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getParentActorAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_6__1__Impl"


    // $ANTLR start "rule__UseCase__Group__0"
    // InternalUmlTextual.g:4740:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4744:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUmlTextual.g:4745:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UseCase__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0"


    // $ANTLR start "rule__UseCase__Group__0__Impl"
    // InternalUmlTextual.g:4752:1: rule__UseCase__Group__0__Impl : ( 'usecase' ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4756:1: ( ( 'usecase' ) )
            // InternalUmlTextual.g:4757:1: ( 'usecase' )
            {
            // InternalUmlTextual.g:4757:1: ( 'usecase' )
            // InternalUmlTextual.g:4758:2: 'usecase'
            {
             before(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__0__Impl"


    // $ANTLR start "rule__UseCase__Group__1"
    // InternalUmlTextual.g:4767:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4771:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUmlTextual.g:4772:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__UseCase__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1"


    // $ANTLR start "rule__UseCase__Group__1__Impl"
    // InternalUmlTextual.g:4779:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4783:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:4784:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:4784:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUmlTextual.g:4785:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:4786:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUmlTextual.g:4786:3: rule__UseCase__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__1__Impl"


    // $ANTLR start "rule__UseCase__Group__2"
    // InternalUmlTextual.g:4794:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4798:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUmlTextual.g:4799:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__UseCase__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__2"


    // $ANTLR start "rule__UseCase__Group__2__Impl"
    // InternalUmlTextual.g:4806:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__Group_2__0 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4810:1: ( ( ( rule__UseCase__Group_2__0 )? ) )
            // InternalUmlTextual.g:4811:1: ( ( rule__UseCase__Group_2__0 )? )
            {
            // InternalUmlTextual.g:4811:1: ( ( rule__UseCase__Group_2__0 )? )
            // InternalUmlTextual.g:4812:2: ( rule__UseCase__Group_2__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_2()); 
            // InternalUmlTextual.g:4813:2: ( rule__UseCase__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUmlTextual.g:4813:3: rule__UseCase__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__2__Impl"


    // $ANTLR start "rule__UseCase__Group__3"
    // InternalUmlTextual.g:4821:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4825:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUmlTextual.g:4826:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__UseCase__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__3"


    // $ANTLR start "rule__UseCase__Group__3__Impl"
    // InternalUmlTextual.g:4833:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__Group_3__0 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4837:1: ( ( ( rule__UseCase__Group_3__0 )? ) )
            // InternalUmlTextual.g:4838:1: ( ( rule__UseCase__Group_3__0 )? )
            {
            // InternalUmlTextual.g:4838:1: ( ( rule__UseCase__Group_3__0 )? )
            // InternalUmlTextual.g:4839:2: ( rule__UseCase__Group_3__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_3()); 
            // InternalUmlTextual.g:4840:2: ( rule__UseCase__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==31) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUmlTextual.g:4840:3: rule__UseCase__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__3__Impl"


    // $ANTLR start "rule__UseCase__Group__4"
    // InternalUmlTextual.g:4848:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4852:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUmlTextual.g:4853:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__UseCase__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__4"


    // $ANTLR start "rule__UseCase__Group__4__Impl"
    // InternalUmlTextual.g:4860:1: rule__UseCase__Group__4__Impl : ( '=' ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4864:1: ( ( '=' ) )
            // InternalUmlTextual.g:4865:1: ( '=' )
            {
            // InternalUmlTextual.g:4865:1: ( '=' )
            // InternalUmlTextual.g:4866:2: '='
            {
             before(grammarAccess.getUseCaseAccess().getEqualsSignKeyword_4()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__4__Impl"


    // $ANTLR start "rule__UseCase__Group__5"
    // InternalUmlTextual.g:4875:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4879:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUmlTextual.g:4880:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__UseCase__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__5"


    // $ANTLR start "rule__UseCase__Group__5__Impl"
    // InternalUmlTextual.g:4887:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__DescriptionAssignment_5 ) ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4891:1: ( ( ( rule__UseCase__DescriptionAssignment_5 ) ) )
            // InternalUmlTextual.g:4892:1: ( ( rule__UseCase__DescriptionAssignment_5 ) )
            {
            // InternalUmlTextual.g:4892:1: ( ( rule__UseCase__DescriptionAssignment_5 ) )
            // InternalUmlTextual.g:4893:2: ( rule__UseCase__DescriptionAssignment_5 )
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionAssignment_5()); 
            // InternalUmlTextual.g:4894:2: ( rule__UseCase__DescriptionAssignment_5 )
            // InternalUmlTextual.g:4894:3: rule__UseCase__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__DescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__5__Impl"


    // $ANTLR start "rule__UseCase__Group__6"
    // InternalUmlTextual.g:4902:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4906:1: ( rule__UseCase__Group__6__Impl )
            // InternalUmlTextual.g:4907:2: rule__UseCase__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__6"


    // $ANTLR start "rule__UseCase__Group__6__Impl"
    // InternalUmlTextual.g:4913:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__Group_6__0 )? ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4917:1: ( ( ( rule__UseCase__Group_6__0 )? ) )
            // InternalUmlTextual.g:4918:1: ( ( rule__UseCase__Group_6__0 )? )
            {
            // InternalUmlTextual.g:4918:1: ( ( rule__UseCase__Group_6__0 )? )
            // InternalUmlTextual.g:4919:2: ( rule__UseCase__Group_6__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6()); 
            // InternalUmlTextual.g:4920:2: ( rule__UseCase__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==25) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUmlTextual.g:4920:3: rule__UseCase__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UseCase__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUseCaseAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group__6__Impl"


    // $ANTLR start "rule__UseCase__Group_2__0"
    // InternalUmlTextual.g:4929:1: rule__UseCase__Group_2__0 : rule__UseCase__Group_2__0__Impl rule__UseCase__Group_2__1 ;
    public final void rule__UseCase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4933:1: ( rule__UseCase__Group_2__0__Impl rule__UseCase__Group_2__1 )
            // InternalUmlTextual.g:4934:2: rule__UseCase__Group_2__0__Impl rule__UseCase__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__UseCase__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_2__0"


    // $ANTLR start "rule__UseCase__Group_2__0__Impl"
    // InternalUmlTextual.g:4941:1: rule__UseCase__Group_2__0__Impl : ( 'includes' ) ;
    public final void rule__UseCase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4945:1: ( ( 'includes' ) )
            // InternalUmlTextual.g:4946:1: ( 'includes' )
            {
            // InternalUmlTextual.g:4946:1: ( 'includes' )
            // InternalUmlTextual.g:4947:2: 'includes'
            {
             before(grammarAccess.getUseCaseAccess().getIncludesKeyword_2_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_2__0__Impl"


    // $ANTLR start "rule__UseCase__Group_2__1"
    // InternalUmlTextual.g:4956:1: rule__UseCase__Group_2__1 : rule__UseCase__Group_2__1__Impl ;
    public final void rule__UseCase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4960:1: ( rule__UseCase__Group_2__1__Impl )
            // InternalUmlTextual.g:4961:2: rule__UseCase__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_2__1"


    // $ANTLR start "rule__UseCase__Group_2__1__Impl"
    // InternalUmlTextual.g:4967:1: rule__UseCase__Group_2__1__Impl : ( ( rule__UseCase__IncludedUseCaseAssignment_2_1 ) ) ;
    public final void rule__UseCase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4971:1: ( ( ( rule__UseCase__IncludedUseCaseAssignment_2_1 ) ) )
            // InternalUmlTextual.g:4972:1: ( ( rule__UseCase__IncludedUseCaseAssignment_2_1 ) )
            {
            // InternalUmlTextual.g:4972:1: ( ( rule__UseCase__IncludedUseCaseAssignment_2_1 ) )
            // InternalUmlTextual.g:4973:2: ( rule__UseCase__IncludedUseCaseAssignment_2_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseAssignment_2_1()); 
            // InternalUmlTextual.g:4974:2: ( rule__UseCase__IncludedUseCaseAssignment_2_1 )
            // InternalUmlTextual.g:4974:3: rule__UseCase__IncludedUseCaseAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__IncludedUseCaseAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_2__1__Impl"


    // $ANTLR start "rule__UseCase__Group_3__0"
    // InternalUmlTextual.g:4983:1: rule__UseCase__Group_3__0 : rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 ;
    public final void rule__UseCase__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4987:1: ( rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 )
            // InternalUmlTextual.g:4988:2: rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__UseCase__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_3__0"


    // $ANTLR start "rule__UseCase__Group_3__0__Impl"
    // InternalUmlTextual.g:4995:1: rule__UseCase__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__UseCase__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4999:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:5000:1: ( 'extends' )
            {
            // InternalUmlTextual.g:5000:1: ( 'extends' )
            // InternalUmlTextual.g:5001:2: 'extends'
            {
             before(grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_3__0__Impl"


    // $ANTLR start "rule__UseCase__Group_3__1"
    // InternalUmlTextual.g:5010:1: rule__UseCase__Group_3__1 : rule__UseCase__Group_3__1__Impl ;
    public final void rule__UseCase__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5014:1: ( rule__UseCase__Group_3__1__Impl )
            // InternalUmlTextual.g:5015:2: rule__UseCase__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_3__1"


    // $ANTLR start "rule__UseCase__Group_3__1__Impl"
    // InternalUmlTextual.g:5021:1: rule__UseCase__Group_3__1__Impl : ( ( rule__UseCase__ExtendedUseCaseAssignment_3_1 ) ) ;
    public final void rule__UseCase__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5025:1: ( ( ( rule__UseCase__ExtendedUseCaseAssignment_3_1 ) ) )
            // InternalUmlTextual.g:5026:1: ( ( rule__UseCase__ExtendedUseCaseAssignment_3_1 ) )
            {
            // InternalUmlTextual.g:5026:1: ( ( rule__UseCase__ExtendedUseCaseAssignment_3_1 ) )
            // InternalUmlTextual.g:5027:2: ( rule__UseCase__ExtendedUseCaseAssignment_3_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseAssignment_3_1()); 
            // InternalUmlTextual.g:5028:2: ( rule__UseCase__ExtendedUseCaseAssignment_3_1 )
            // InternalUmlTextual.g:5028:3: rule__UseCase__ExtendedUseCaseAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__ExtendedUseCaseAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_3__1__Impl"


    // $ANTLR start "rule__UseCase__Group_6__0"
    // InternalUmlTextual.g:5037:1: rule__UseCase__Group_6__0 : rule__UseCase__Group_6__0__Impl rule__UseCase__Group_6__1 ;
    public final void rule__UseCase__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5041:1: ( rule__UseCase__Group_6__0__Impl rule__UseCase__Group_6__1 )
            // InternalUmlTextual.g:5042:2: rule__UseCase__Group_6__0__Impl rule__UseCase__Group_6__1
            {
            pushFollow(FOLLOW_49);
            rule__UseCase__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6__0"


    // $ANTLR start "rule__UseCase__Group_6__0__Impl"
    // InternalUmlTextual.g:5049:1: rule__UseCase__Group_6__0__Impl : ( '{' ) ;
    public final void rule__UseCase__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5053:1: ( ( '{' ) )
            // InternalUmlTextual.g:5054:1: ( '{' )
            {
            // InternalUmlTextual.g:5054:1: ( '{' )
            // InternalUmlTextual.g:5055:2: '{'
            {
             before(grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6__0__Impl"


    // $ANTLR start "rule__UseCase__Group_6__1"
    // InternalUmlTextual.g:5064:1: rule__UseCase__Group_6__1 : rule__UseCase__Group_6__1__Impl rule__UseCase__Group_6__2 ;
    public final void rule__UseCase__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5068:1: ( rule__UseCase__Group_6__1__Impl rule__UseCase__Group_6__2 )
            // InternalUmlTextual.g:5069:2: rule__UseCase__Group_6__1__Impl rule__UseCase__Group_6__2
            {
            pushFollow(FOLLOW_40);
            rule__UseCase__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6__1"


    // $ANTLR start "rule__UseCase__Group_6__1__Impl"
    // InternalUmlTextual.g:5076:1: rule__UseCase__Group_6__1__Impl : ( ( rule__UseCase__Alternatives_6_1 ) ) ;
    public final void rule__UseCase__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5080:1: ( ( ( rule__UseCase__Alternatives_6_1 ) ) )
            // InternalUmlTextual.g:5081:1: ( ( rule__UseCase__Alternatives_6_1 ) )
            {
            // InternalUmlTextual.g:5081:1: ( ( rule__UseCase__Alternatives_6_1 ) )
            // InternalUmlTextual.g:5082:2: ( rule__UseCase__Alternatives_6_1 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_6_1()); 
            // InternalUmlTextual.g:5083:2: ( rule__UseCase__Alternatives_6_1 )
            // InternalUmlTextual.g:5083:3: rule__UseCase__Alternatives_6_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Alternatives_6_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getAlternatives_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6__1__Impl"


    // $ANTLR start "rule__UseCase__Group_6__2"
    // InternalUmlTextual.g:5091:1: rule__UseCase__Group_6__2 : rule__UseCase__Group_6__2__Impl ;
    public final void rule__UseCase__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5095:1: ( rule__UseCase__Group_6__2__Impl )
            // InternalUmlTextual.g:5096:2: rule__UseCase__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6__2"


    // $ANTLR start "rule__UseCase__Group_6__2__Impl"
    // InternalUmlTextual.g:5102:1: rule__UseCase__Group_6__2__Impl : ( '}' ) ;
    public final void rule__UseCase__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5106:1: ( ( '}' ) )
            // InternalUmlTextual.g:5107:1: ( '}' )
            {
            // InternalUmlTextual.g:5107:1: ( '}' )
            // InternalUmlTextual.g:5108:2: '}'
            {
             before(grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_6_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6__2__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_0__0"
    // InternalUmlTextual.g:5118:1: rule__UseCase__Group_6_1_0__0 : rule__UseCase__Group_6_1_0__0__Impl rule__UseCase__Group_6_1_0__1 ;
    public final void rule__UseCase__Group_6_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5122:1: ( rule__UseCase__Group_6_1_0__0__Impl rule__UseCase__Group_6_1_0__1 )
            // InternalUmlTextual.g:5123:2: rule__UseCase__Group_6_1_0__0__Impl rule__UseCase__Group_6_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__UseCase__Group_6_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__0"


    // $ANTLR start "rule__UseCase__Group_6_1_0__0__Impl"
    // InternalUmlTextual.g:5130:1: rule__UseCase__Group_6_1_0__0__Impl : ( 'includes' ) ;
    public final void rule__UseCase__Group_6_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5134:1: ( ( 'includes' ) )
            // InternalUmlTextual.g:5135:1: ( 'includes' )
            {
            // InternalUmlTextual.g:5135:1: ( 'includes' )
            // InternalUmlTextual.g:5136:2: 'includes'
            {
             before(grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_0_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__0__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_0__1"
    // InternalUmlTextual.g:5145:1: rule__UseCase__Group_6_1_0__1 : rule__UseCase__Group_6_1_0__1__Impl rule__UseCase__Group_6_1_0__2 ;
    public final void rule__UseCase__Group_6_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5149:1: ( rule__UseCase__Group_6_1_0__1__Impl rule__UseCase__Group_6_1_0__2 )
            // InternalUmlTextual.g:5150:2: rule__UseCase__Group_6_1_0__1__Impl rule__UseCase__Group_6_1_0__2
            {
            pushFollow(FOLLOW_50);
            rule__UseCase__Group_6_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__1"


    // $ANTLR start "rule__UseCase__Group_6_1_0__1__Impl"
    // InternalUmlTextual.g:5157:1: rule__UseCase__Group_6_1_0__1__Impl : ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_1 ) ) ;
    public final void rule__UseCase__Group_6_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5161:1: ( ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_1 ) ) )
            // InternalUmlTextual.g:5162:1: ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_1 ) )
            {
            // InternalUmlTextual.g:5162:1: ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_1 ) )
            // InternalUmlTextual.g:5163:2: ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseAssignment_6_1_0_1()); 
            // InternalUmlTextual.g:5164:2: ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_1 )
            // InternalUmlTextual.g:5164:3: rule__UseCase__IncludedUseCaseAssignment_6_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__IncludedUseCaseAssignment_6_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseAssignment_6_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__1__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_0__2"
    // InternalUmlTextual.g:5172:1: rule__UseCase__Group_6_1_0__2 : rule__UseCase__Group_6_1_0__2__Impl rule__UseCase__Group_6_1_0__3 ;
    public final void rule__UseCase__Group_6_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5176:1: ( rule__UseCase__Group_6_1_0__2__Impl rule__UseCase__Group_6_1_0__3 )
            // InternalUmlTextual.g:5177:2: rule__UseCase__Group_6_1_0__2__Impl rule__UseCase__Group_6_1_0__3
            {
            pushFollow(FOLLOW_50);
            rule__UseCase__Group_6_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__2"


    // $ANTLR start "rule__UseCase__Group_6_1_0__2__Impl"
    // InternalUmlTextual.g:5184:1: rule__UseCase__Group_6_1_0__2__Impl : ( ( rule__UseCase__Group_6_1_0_2__0 )* ) ;
    public final void rule__UseCase__Group_6_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5188:1: ( ( ( rule__UseCase__Group_6_1_0_2__0 )* ) )
            // InternalUmlTextual.g:5189:1: ( ( rule__UseCase__Group_6_1_0_2__0 )* )
            {
            // InternalUmlTextual.g:5189:1: ( ( rule__UseCase__Group_6_1_0_2__0 )* )
            // InternalUmlTextual.g:5190:2: ( rule__UseCase__Group_6_1_0_2__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_0_2()); 
            // InternalUmlTextual.g:5191:2: ( rule__UseCase__Group_6_1_0_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==33) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalUmlTextual.g:5191:3: rule__UseCase__Group_6_1_0_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__UseCase__Group_6_1_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getGroup_6_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__2__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_0__3"
    // InternalUmlTextual.g:5199:1: rule__UseCase__Group_6_1_0__3 : rule__UseCase__Group_6_1_0__3__Impl rule__UseCase__Group_6_1_0__4 ;
    public final void rule__UseCase__Group_6_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5203:1: ( rule__UseCase__Group_6_1_0__3__Impl rule__UseCase__Group_6_1_0__4 )
            // InternalUmlTextual.g:5204:2: rule__UseCase__Group_6_1_0__3__Impl rule__UseCase__Group_6_1_0__4
            {
            pushFollow(FOLLOW_4);
            rule__UseCase__Group_6_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__3"


    // $ANTLR start "rule__UseCase__Group_6_1_0__3__Impl"
    // InternalUmlTextual.g:5211:1: rule__UseCase__Group_6_1_0__3__Impl : ( 'extends' ) ;
    public final void rule__UseCase__Group_6_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5215:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:5216:1: ( 'extends' )
            {
            // InternalUmlTextual.g:5216:1: ( 'extends' )
            // InternalUmlTextual.g:5217:2: 'extends'
            {
             before(grammarAccess.getUseCaseAccess().getExtendsKeyword_6_1_0_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendsKeyword_6_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__3__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_0__4"
    // InternalUmlTextual.g:5226:1: rule__UseCase__Group_6_1_0__4 : rule__UseCase__Group_6_1_0__4__Impl rule__UseCase__Group_6_1_0__5 ;
    public final void rule__UseCase__Group_6_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5230:1: ( rule__UseCase__Group_6_1_0__4__Impl rule__UseCase__Group_6_1_0__5 )
            // InternalUmlTextual.g:5231:2: rule__UseCase__Group_6_1_0__4__Impl rule__UseCase__Group_6_1_0__5
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group_6_1_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__4"


    // $ANTLR start "rule__UseCase__Group_6_1_0__4__Impl"
    // InternalUmlTextual.g:5238:1: rule__UseCase__Group_6_1_0__4__Impl : ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4 ) ) ;
    public final void rule__UseCase__Group_6_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5242:1: ( ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4 ) ) )
            // InternalUmlTextual.g:5243:1: ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4 ) )
            {
            // InternalUmlTextual.g:5243:1: ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4 ) )
            // InternalUmlTextual.g:5244:2: ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseAssignment_6_1_0_4()); 
            // InternalUmlTextual.g:5245:2: ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4 )
            // InternalUmlTextual.g:5245:3: rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseAssignment_6_1_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__4__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_0__5"
    // InternalUmlTextual.g:5253:1: rule__UseCase__Group_6_1_0__5 : rule__UseCase__Group_6_1_0__5__Impl ;
    public final void rule__UseCase__Group_6_1_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5257:1: ( rule__UseCase__Group_6_1_0__5__Impl )
            // InternalUmlTextual.g:5258:2: rule__UseCase__Group_6_1_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__5"


    // $ANTLR start "rule__UseCase__Group_6_1_0__5__Impl"
    // InternalUmlTextual.g:5264:1: rule__UseCase__Group_6_1_0__5__Impl : ( ( rule__UseCase__Group_6_1_0_5__0 )* ) ;
    public final void rule__UseCase__Group_6_1_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5268:1: ( ( ( rule__UseCase__Group_6_1_0_5__0 )* ) )
            // InternalUmlTextual.g:5269:1: ( ( rule__UseCase__Group_6_1_0_5__0 )* )
            {
            // InternalUmlTextual.g:5269:1: ( ( rule__UseCase__Group_6_1_0_5__0 )* )
            // InternalUmlTextual.g:5270:2: ( rule__UseCase__Group_6_1_0_5__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_0_5()); 
            // InternalUmlTextual.g:5271:2: ( rule__UseCase__Group_6_1_0_5__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==33) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUmlTextual.g:5271:3: rule__UseCase__Group_6_1_0_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__UseCase__Group_6_1_0_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getGroup_6_1_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0__5__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_0_2__0"
    // InternalUmlTextual.g:5280:1: rule__UseCase__Group_6_1_0_2__0 : rule__UseCase__Group_6_1_0_2__0__Impl rule__UseCase__Group_6_1_0_2__1 ;
    public final void rule__UseCase__Group_6_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5284:1: ( rule__UseCase__Group_6_1_0_2__0__Impl rule__UseCase__Group_6_1_0_2__1 )
            // InternalUmlTextual.g:5285:2: rule__UseCase__Group_6_1_0_2__0__Impl rule__UseCase__Group_6_1_0_2__1
            {
            pushFollow(FOLLOW_4);
            rule__UseCase__Group_6_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0_2__0"


    // $ANTLR start "rule__UseCase__Group_6_1_0_2__0__Impl"
    // InternalUmlTextual.g:5292:1: rule__UseCase__Group_6_1_0_2__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5296:1: ( ( ',' ) )
            // InternalUmlTextual.g:5297:1: ( ',' )
            {
            // InternalUmlTextual.g:5297:1: ( ',' )
            // InternalUmlTextual.g:5298:2: ','
            {
             before(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_0_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0_2__0__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_0_2__1"
    // InternalUmlTextual.g:5307:1: rule__UseCase__Group_6_1_0_2__1 : rule__UseCase__Group_6_1_0_2__1__Impl ;
    public final void rule__UseCase__Group_6_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5311:1: ( rule__UseCase__Group_6_1_0_2__1__Impl )
            // InternalUmlTextual.g:5312:2: rule__UseCase__Group_6_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0_2__1"


    // $ANTLR start "rule__UseCase__Group_6_1_0_2__1__Impl"
    // InternalUmlTextual.g:5318:1: rule__UseCase__Group_6_1_0_2__1__Impl : ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1 ) ) ;
    public final void rule__UseCase__Group_6_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5322:1: ( ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1 ) ) )
            // InternalUmlTextual.g:5323:1: ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1 ) )
            {
            // InternalUmlTextual.g:5323:1: ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1 ) )
            // InternalUmlTextual.g:5324:2: ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseAssignment_6_1_0_2_1()); 
            // InternalUmlTextual.g:5325:2: ( rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1 )
            // InternalUmlTextual.g:5325:3: rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseAssignment_6_1_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0_2__1__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_0_5__0"
    // InternalUmlTextual.g:5334:1: rule__UseCase__Group_6_1_0_5__0 : rule__UseCase__Group_6_1_0_5__0__Impl rule__UseCase__Group_6_1_0_5__1 ;
    public final void rule__UseCase__Group_6_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5338:1: ( rule__UseCase__Group_6_1_0_5__0__Impl rule__UseCase__Group_6_1_0_5__1 )
            // InternalUmlTextual.g:5339:2: rule__UseCase__Group_6_1_0_5__0__Impl rule__UseCase__Group_6_1_0_5__1
            {
            pushFollow(FOLLOW_4);
            rule__UseCase__Group_6_1_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0_5__0"


    // $ANTLR start "rule__UseCase__Group_6_1_0_5__0__Impl"
    // InternalUmlTextual.g:5346:1: rule__UseCase__Group_6_1_0_5__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5350:1: ( ( ',' ) )
            // InternalUmlTextual.g:5351:1: ( ',' )
            {
            // InternalUmlTextual.g:5351:1: ( ',' )
            // InternalUmlTextual.g:5352:2: ','
            {
             before(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_0_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0_5__0__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_0_5__1"
    // InternalUmlTextual.g:5361:1: rule__UseCase__Group_6_1_0_5__1 : rule__UseCase__Group_6_1_0_5__1__Impl ;
    public final void rule__UseCase__Group_6_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5365:1: ( rule__UseCase__Group_6_1_0_5__1__Impl )
            // InternalUmlTextual.g:5366:2: rule__UseCase__Group_6_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0_5__1"


    // $ANTLR start "rule__UseCase__Group_6_1_0_5__1__Impl"
    // InternalUmlTextual.g:5372:1: rule__UseCase__Group_6_1_0_5__1__Impl : ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1 ) ) ;
    public final void rule__UseCase__Group_6_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5376:1: ( ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1 ) ) )
            // InternalUmlTextual.g:5377:1: ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1 ) )
            {
            // InternalUmlTextual.g:5377:1: ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1 ) )
            // InternalUmlTextual.g:5378:2: ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseAssignment_6_1_0_5_1()); 
            // InternalUmlTextual.g:5379:2: ( rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1 )
            // InternalUmlTextual.g:5379:3: rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseAssignment_6_1_0_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_0_5__1__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_1__0"
    // InternalUmlTextual.g:5388:1: rule__UseCase__Group_6_1_1__0 : rule__UseCase__Group_6_1_1__0__Impl rule__UseCase__Group_6_1_1__1 ;
    public final void rule__UseCase__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5392:1: ( rule__UseCase__Group_6_1_1__0__Impl rule__UseCase__Group_6_1_1__1 )
            // InternalUmlTextual.g:5393:2: rule__UseCase__Group_6_1_1__0__Impl rule__UseCase__Group_6_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__UseCase__Group_6_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__0"


    // $ANTLR start "rule__UseCase__Group_6_1_1__0__Impl"
    // InternalUmlTextual.g:5400:1: rule__UseCase__Group_6_1_1__0__Impl : ( 'extends' ) ;
    public final void rule__UseCase__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5404:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:5405:1: ( 'extends' )
            {
            // InternalUmlTextual.g:5405:1: ( 'extends' )
            // InternalUmlTextual.g:5406:2: 'extends'
            {
             before(grammarAccess.getUseCaseAccess().getExtendsKeyword_6_1_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendsKeyword_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__0__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_1__1"
    // InternalUmlTextual.g:5415:1: rule__UseCase__Group_6_1_1__1 : rule__UseCase__Group_6_1_1__1__Impl rule__UseCase__Group_6_1_1__2 ;
    public final void rule__UseCase__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5419:1: ( rule__UseCase__Group_6_1_1__1__Impl rule__UseCase__Group_6_1_1__2 )
            // InternalUmlTextual.g:5420:2: rule__UseCase__Group_6_1_1__1__Impl rule__UseCase__Group_6_1_1__2
            {
            pushFollow(FOLLOW_51);
            rule__UseCase__Group_6_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__1"


    // $ANTLR start "rule__UseCase__Group_6_1_1__1__Impl"
    // InternalUmlTextual.g:5427:1: rule__UseCase__Group_6_1_1__1__Impl : ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1 ) ) ;
    public final void rule__UseCase__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5431:1: ( ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1 ) ) )
            // InternalUmlTextual.g:5432:1: ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1 ) )
            {
            // InternalUmlTextual.g:5432:1: ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1 ) )
            // InternalUmlTextual.g:5433:2: ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseAssignment_6_1_1_1()); 
            // InternalUmlTextual.g:5434:2: ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1 )
            // InternalUmlTextual.g:5434:3: rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseAssignment_6_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__1__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_1__2"
    // InternalUmlTextual.g:5442:1: rule__UseCase__Group_6_1_1__2 : rule__UseCase__Group_6_1_1__2__Impl rule__UseCase__Group_6_1_1__3 ;
    public final void rule__UseCase__Group_6_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5446:1: ( rule__UseCase__Group_6_1_1__2__Impl rule__UseCase__Group_6_1_1__3 )
            // InternalUmlTextual.g:5447:2: rule__UseCase__Group_6_1_1__2__Impl rule__UseCase__Group_6_1_1__3
            {
            pushFollow(FOLLOW_51);
            rule__UseCase__Group_6_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__2"


    // $ANTLR start "rule__UseCase__Group_6_1_1__2__Impl"
    // InternalUmlTextual.g:5454:1: rule__UseCase__Group_6_1_1__2__Impl : ( ( rule__UseCase__Group_6_1_1_2__0 )* ) ;
    public final void rule__UseCase__Group_6_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5458:1: ( ( ( rule__UseCase__Group_6_1_1_2__0 )* ) )
            // InternalUmlTextual.g:5459:1: ( ( rule__UseCase__Group_6_1_1_2__0 )* )
            {
            // InternalUmlTextual.g:5459:1: ( ( rule__UseCase__Group_6_1_1_2__0 )* )
            // InternalUmlTextual.g:5460:2: ( rule__UseCase__Group_6_1_1_2__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_1_2()); 
            // InternalUmlTextual.g:5461:2: ( rule__UseCase__Group_6_1_1_2__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==33) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalUmlTextual.g:5461:3: rule__UseCase__Group_6_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__UseCase__Group_6_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getGroup_6_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__2__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_1__3"
    // InternalUmlTextual.g:5469:1: rule__UseCase__Group_6_1_1__3 : rule__UseCase__Group_6_1_1__3__Impl rule__UseCase__Group_6_1_1__4 ;
    public final void rule__UseCase__Group_6_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5473:1: ( rule__UseCase__Group_6_1_1__3__Impl rule__UseCase__Group_6_1_1__4 )
            // InternalUmlTextual.g:5474:2: rule__UseCase__Group_6_1_1__3__Impl rule__UseCase__Group_6_1_1__4
            {
            pushFollow(FOLLOW_4);
            rule__UseCase__Group_6_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__3"


    // $ANTLR start "rule__UseCase__Group_6_1_1__3__Impl"
    // InternalUmlTextual.g:5481:1: rule__UseCase__Group_6_1_1__3__Impl : ( 'includes' ) ;
    public final void rule__UseCase__Group_6_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5485:1: ( ( 'includes' ) )
            // InternalUmlTextual.g:5486:1: ( 'includes' )
            {
            // InternalUmlTextual.g:5486:1: ( 'includes' )
            // InternalUmlTextual.g:5487:2: 'includes'
            {
             before(grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_1_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__3__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_1__4"
    // InternalUmlTextual.g:5496:1: rule__UseCase__Group_6_1_1__4 : rule__UseCase__Group_6_1_1__4__Impl rule__UseCase__Group_6_1_1__5 ;
    public final void rule__UseCase__Group_6_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5500:1: ( rule__UseCase__Group_6_1_1__4__Impl rule__UseCase__Group_6_1_1__5 )
            // InternalUmlTextual.g:5501:2: rule__UseCase__Group_6_1_1__4__Impl rule__UseCase__Group_6_1_1__5
            {
            pushFollow(FOLLOW_14);
            rule__UseCase__Group_6_1_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__4"


    // $ANTLR start "rule__UseCase__Group_6_1_1__4__Impl"
    // InternalUmlTextual.g:5508:1: rule__UseCase__Group_6_1_1__4__Impl : ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_4 ) ) ;
    public final void rule__UseCase__Group_6_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5512:1: ( ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_4 ) ) )
            // InternalUmlTextual.g:5513:1: ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_4 ) )
            {
            // InternalUmlTextual.g:5513:1: ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_4 ) )
            // InternalUmlTextual.g:5514:2: ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_4 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseAssignment_6_1_1_4()); 
            // InternalUmlTextual.g:5515:2: ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_4 )
            // InternalUmlTextual.g:5515:3: rule__UseCase__IncludedUseCaseAssignment_6_1_1_4
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__IncludedUseCaseAssignment_6_1_1_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseAssignment_6_1_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__4__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_1__5"
    // InternalUmlTextual.g:5523:1: rule__UseCase__Group_6_1_1__5 : rule__UseCase__Group_6_1_1__5__Impl ;
    public final void rule__UseCase__Group_6_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5527:1: ( rule__UseCase__Group_6_1_1__5__Impl )
            // InternalUmlTextual.g:5528:2: rule__UseCase__Group_6_1_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__5"


    // $ANTLR start "rule__UseCase__Group_6_1_1__5__Impl"
    // InternalUmlTextual.g:5534:1: rule__UseCase__Group_6_1_1__5__Impl : ( ( rule__UseCase__Group_6_1_1_5__0 )* ) ;
    public final void rule__UseCase__Group_6_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5538:1: ( ( ( rule__UseCase__Group_6_1_1_5__0 )* ) )
            // InternalUmlTextual.g:5539:1: ( ( rule__UseCase__Group_6_1_1_5__0 )* )
            {
            // InternalUmlTextual.g:5539:1: ( ( rule__UseCase__Group_6_1_1_5__0 )* )
            // InternalUmlTextual.g:5540:2: ( rule__UseCase__Group_6_1_1_5__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_1_5()); 
            // InternalUmlTextual.g:5541:2: ( rule__UseCase__Group_6_1_1_5__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==33) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUmlTextual.g:5541:3: rule__UseCase__Group_6_1_1_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__UseCase__Group_6_1_1_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getUseCaseAccess().getGroup_6_1_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1__5__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_1_2__0"
    // InternalUmlTextual.g:5550:1: rule__UseCase__Group_6_1_1_2__0 : rule__UseCase__Group_6_1_1_2__0__Impl rule__UseCase__Group_6_1_1_2__1 ;
    public final void rule__UseCase__Group_6_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5554:1: ( rule__UseCase__Group_6_1_1_2__0__Impl rule__UseCase__Group_6_1_1_2__1 )
            // InternalUmlTextual.g:5555:2: rule__UseCase__Group_6_1_1_2__0__Impl rule__UseCase__Group_6_1_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__UseCase__Group_6_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1_2__0"


    // $ANTLR start "rule__UseCase__Group_6_1_1_2__0__Impl"
    // InternalUmlTextual.g:5562:1: rule__UseCase__Group_6_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5566:1: ( ( ',' ) )
            // InternalUmlTextual.g:5567:1: ( ',' )
            {
            // InternalUmlTextual.g:5567:1: ( ',' )
            // InternalUmlTextual.g:5568:2: ','
            {
             before(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_1_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1_2__0__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_1_2__1"
    // InternalUmlTextual.g:5577:1: rule__UseCase__Group_6_1_1_2__1 : rule__UseCase__Group_6_1_1_2__1__Impl ;
    public final void rule__UseCase__Group_6_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5581:1: ( rule__UseCase__Group_6_1_1_2__1__Impl )
            // InternalUmlTextual.g:5582:2: rule__UseCase__Group_6_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1_2__1"


    // $ANTLR start "rule__UseCase__Group_6_1_1_2__1__Impl"
    // InternalUmlTextual.g:5588:1: rule__UseCase__Group_6_1_1_2__1__Impl : ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1 ) ) ;
    public final void rule__UseCase__Group_6_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5592:1: ( ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1 ) ) )
            // InternalUmlTextual.g:5593:1: ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1 ) )
            {
            // InternalUmlTextual.g:5593:1: ( ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1 ) )
            // InternalUmlTextual.g:5594:2: ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseAssignment_6_1_1_2_1()); 
            // InternalUmlTextual.g:5595:2: ( rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1 )
            // InternalUmlTextual.g:5595:3: rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseAssignment_6_1_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1_2__1__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_1_5__0"
    // InternalUmlTextual.g:5604:1: rule__UseCase__Group_6_1_1_5__0 : rule__UseCase__Group_6_1_1_5__0__Impl rule__UseCase__Group_6_1_1_5__1 ;
    public final void rule__UseCase__Group_6_1_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5608:1: ( rule__UseCase__Group_6_1_1_5__0__Impl rule__UseCase__Group_6_1_1_5__1 )
            // InternalUmlTextual.g:5609:2: rule__UseCase__Group_6_1_1_5__0__Impl rule__UseCase__Group_6_1_1_5__1
            {
            pushFollow(FOLLOW_4);
            rule__UseCase__Group_6_1_1_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_1_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1_5__0"


    // $ANTLR start "rule__UseCase__Group_6_1_1_5__0__Impl"
    // InternalUmlTextual.g:5616:1: rule__UseCase__Group_6_1_1_5__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5620:1: ( ( ',' ) )
            // InternalUmlTextual.g:5621:1: ( ',' )
            {
            // InternalUmlTextual.g:5621:1: ( ',' )
            // InternalUmlTextual.g:5622:2: ','
            {
             before(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_1_5_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_1_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1_5__0__Impl"


    // $ANTLR start "rule__UseCase__Group_6_1_1_5__1"
    // InternalUmlTextual.g:5631:1: rule__UseCase__Group_6_1_1_5__1 : rule__UseCase__Group_6_1_1_5__1__Impl ;
    public final void rule__UseCase__Group_6_1_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5635:1: ( rule__UseCase__Group_6_1_1_5__1__Impl )
            // InternalUmlTextual.g:5636:2: rule__UseCase__Group_6_1_1_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__Group_6_1_1_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1_5__1"


    // $ANTLR start "rule__UseCase__Group_6_1_1_5__1__Impl"
    // InternalUmlTextual.g:5642:1: rule__UseCase__Group_6_1_1_5__1__Impl : ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1 ) ) ;
    public final void rule__UseCase__Group_6_1_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5646:1: ( ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1 ) ) )
            // InternalUmlTextual.g:5647:1: ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1 ) )
            {
            // InternalUmlTextual.g:5647:1: ( ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1 ) )
            // InternalUmlTextual.g:5648:2: ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseAssignment_6_1_1_5_1()); 
            // InternalUmlTextual.g:5649:2: ( rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1 )
            // InternalUmlTextual.g:5649:3: rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseAssignment_6_1_1_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__Group_6_1_1_5__1__Impl"


    // $ANTLR start "rule__ActorUseCaseAssociation__Group__0"
    // InternalUmlTextual.g:5658:1: rule__ActorUseCaseAssociation__Group__0 : rule__ActorUseCaseAssociation__Group__0__Impl rule__ActorUseCaseAssociation__Group__1 ;
    public final void rule__ActorUseCaseAssociation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5662:1: ( rule__ActorUseCaseAssociation__Group__0__Impl rule__ActorUseCaseAssociation__Group__1 )
            // InternalUmlTextual.g:5663:2: rule__ActorUseCaseAssociation__Group__0__Impl rule__ActorUseCaseAssociation__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ActorUseCaseAssociation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorUseCaseAssociation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__Group__0"


    // $ANTLR start "rule__ActorUseCaseAssociation__Group__0__Impl"
    // InternalUmlTextual.g:5670:1: rule__ActorUseCaseAssociation__Group__0__Impl : ( 'uses' ) ;
    public final void rule__ActorUseCaseAssociation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5674:1: ( ( 'uses' ) )
            // InternalUmlTextual.g:5675:1: ( 'uses' )
            {
            // InternalUmlTextual.g:5675:1: ( 'uses' )
            // InternalUmlTextual.g:5676:2: 'uses'
            {
             before(grammarAccess.getActorUseCaseAssociationAccess().getUsesKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getActorUseCaseAssociationAccess().getUsesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__Group__0__Impl"


    // $ANTLR start "rule__ActorUseCaseAssociation__Group__1"
    // InternalUmlTextual.g:5685:1: rule__ActorUseCaseAssociation__Group__1 : rule__ActorUseCaseAssociation__Group__1__Impl rule__ActorUseCaseAssociation__Group__2 ;
    public final void rule__ActorUseCaseAssociation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5689:1: ( rule__ActorUseCaseAssociation__Group__1__Impl rule__ActorUseCaseAssociation__Group__2 )
            // InternalUmlTextual.g:5690:2: rule__ActorUseCaseAssociation__Group__1__Impl rule__ActorUseCaseAssociation__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ActorUseCaseAssociation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorUseCaseAssociation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__Group__1"


    // $ANTLR start "rule__ActorUseCaseAssociation__Group__1__Impl"
    // InternalUmlTextual.g:5697:1: rule__ActorUseCaseAssociation__Group__1__Impl : ( ( rule__ActorUseCaseAssociation__UseCaseAssignment_1 ) ) ;
    public final void rule__ActorUseCaseAssociation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5701:1: ( ( ( rule__ActorUseCaseAssociation__UseCaseAssignment_1 ) ) )
            // InternalUmlTextual.g:5702:1: ( ( rule__ActorUseCaseAssociation__UseCaseAssignment_1 ) )
            {
            // InternalUmlTextual.g:5702:1: ( ( rule__ActorUseCaseAssociation__UseCaseAssignment_1 ) )
            // InternalUmlTextual.g:5703:2: ( rule__ActorUseCaseAssociation__UseCaseAssignment_1 )
            {
             before(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseAssignment_1()); 
            // InternalUmlTextual.g:5704:2: ( rule__ActorUseCaseAssociation__UseCaseAssignment_1 )
            // InternalUmlTextual.g:5704:3: rule__ActorUseCaseAssociation__UseCaseAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActorUseCaseAssociation__UseCaseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__Group__1__Impl"


    // $ANTLR start "rule__ActorUseCaseAssociation__Group__2"
    // InternalUmlTextual.g:5712:1: rule__ActorUseCaseAssociation__Group__2 : rule__ActorUseCaseAssociation__Group__2__Impl ;
    public final void rule__ActorUseCaseAssociation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5716:1: ( rule__ActorUseCaseAssociation__Group__2__Impl )
            // InternalUmlTextual.g:5717:2: rule__ActorUseCaseAssociation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActorUseCaseAssociation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__Group__2"


    // $ANTLR start "rule__ActorUseCaseAssociation__Group__2__Impl"
    // InternalUmlTextual.g:5723:1: rule__ActorUseCaseAssociation__Group__2__Impl : ( ( rule__ActorUseCaseAssociation__Group_2__0 )* ) ;
    public final void rule__ActorUseCaseAssociation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5727:1: ( ( ( rule__ActorUseCaseAssociation__Group_2__0 )* ) )
            // InternalUmlTextual.g:5728:1: ( ( rule__ActorUseCaseAssociation__Group_2__0 )* )
            {
            // InternalUmlTextual.g:5728:1: ( ( rule__ActorUseCaseAssociation__Group_2__0 )* )
            // InternalUmlTextual.g:5729:2: ( rule__ActorUseCaseAssociation__Group_2__0 )*
            {
             before(grammarAccess.getActorUseCaseAssociationAccess().getGroup_2()); 
            // InternalUmlTextual.g:5730:2: ( rule__ActorUseCaseAssociation__Group_2__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==33) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalUmlTextual.g:5730:3: rule__ActorUseCaseAssociation__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ActorUseCaseAssociation__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getActorUseCaseAssociationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__Group__2__Impl"


    // $ANTLR start "rule__ActorUseCaseAssociation__Group_2__0"
    // InternalUmlTextual.g:5739:1: rule__ActorUseCaseAssociation__Group_2__0 : rule__ActorUseCaseAssociation__Group_2__0__Impl rule__ActorUseCaseAssociation__Group_2__1 ;
    public final void rule__ActorUseCaseAssociation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5743:1: ( rule__ActorUseCaseAssociation__Group_2__0__Impl rule__ActorUseCaseAssociation__Group_2__1 )
            // InternalUmlTextual.g:5744:2: rule__ActorUseCaseAssociation__Group_2__0__Impl rule__ActorUseCaseAssociation__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__ActorUseCaseAssociation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActorUseCaseAssociation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__Group_2__0"


    // $ANTLR start "rule__ActorUseCaseAssociation__Group_2__0__Impl"
    // InternalUmlTextual.g:5751:1: rule__ActorUseCaseAssociation__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ActorUseCaseAssociation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5755:1: ( ( ',' ) )
            // InternalUmlTextual.g:5756:1: ( ',' )
            {
            // InternalUmlTextual.g:5756:1: ( ',' )
            // InternalUmlTextual.g:5757:2: ','
            {
             before(grammarAccess.getActorUseCaseAssociationAccess().getCommaKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getActorUseCaseAssociationAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__Group_2__0__Impl"


    // $ANTLR start "rule__ActorUseCaseAssociation__Group_2__1"
    // InternalUmlTextual.g:5766:1: rule__ActorUseCaseAssociation__Group_2__1 : rule__ActorUseCaseAssociation__Group_2__1__Impl ;
    public final void rule__ActorUseCaseAssociation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5770:1: ( rule__ActorUseCaseAssociation__Group_2__1__Impl )
            // InternalUmlTextual.g:5771:2: rule__ActorUseCaseAssociation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActorUseCaseAssociation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__Group_2__1"


    // $ANTLR start "rule__ActorUseCaseAssociation__Group_2__1__Impl"
    // InternalUmlTextual.g:5777:1: rule__ActorUseCaseAssociation__Group_2__1__Impl : ( ( rule__ActorUseCaseAssociation__UseCaseAssignment_2_1 ) ) ;
    public final void rule__ActorUseCaseAssociation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5781:1: ( ( ( rule__ActorUseCaseAssociation__UseCaseAssignment_2_1 ) ) )
            // InternalUmlTextual.g:5782:1: ( ( rule__ActorUseCaseAssociation__UseCaseAssignment_2_1 ) )
            {
            // InternalUmlTextual.g:5782:1: ( ( rule__ActorUseCaseAssociation__UseCaseAssignment_2_1 ) )
            // InternalUmlTextual.g:5783:2: ( rule__ActorUseCaseAssociation__UseCaseAssignment_2_1 )
            {
             before(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseAssignment_2_1()); 
            // InternalUmlTextual.g:5784:2: ( rule__ActorUseCaseAssociation__UseCaseAssignment_2_1 )
            // InternalUmlTextual.g:5784:3: rule__ActorUseCaseAssociation__UseCaseAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ActorUseCaseAssociation__UseCaseAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__Group_2__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalUmlTextual.g:5793:1: rule__Model__ElementsAssignment : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5797:1: ( ( ruleModelElement ) )
            // InternalUmlTextual.g:5798:2: ( ruleModelElement )
            {
            // InternalUmlTextual.g:5798:2: ( ruleModelElement )
            // InternalUmlTextual.g:5799:3: ruleModelElement
            {
             before(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsModelElementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Package__TypeAssignment_0"
    // InternalUmlTextual.g:5808:1: rule__Package__TypeAssignment_0 : ( ( rule__Package__TypeAlternatives_0_0 ) ) ;
    public final void rule__Package__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5812:1: ( ( ( rule__Package__TypeAlternatives_0_0 ) ) )
            // InternalUmlTextual.g:5813:2: ( ( rule__Package__TypeAlternatives_0_0 ) )
            {
            // InternalUmlTextual.g:5813:2: ( ( rule__Package__TypeAlternatives_0_0 ) )
            // InternalUmlTextual.g:5814:3: ( rule__Package__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getPackageAccess().getTypeAlternatives_0_0()); 
            // InternalUmlTextual.g:5815:3: ( rule__Package__TypeAlternatives_0_0 )
            // InternalUmlTextual.g:5815:4: rule__Package__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTypeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__TypeAssignment_0"


    // $ANTLR start "rule__Package__NameAssignment_1"
    // InternalUmlTextual.g:5823:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5827:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:5828:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:5828:2: ( RULE_ID )
            // InternalUmlTextual.g:5829:3: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_1"


    // $ANTLR start "rule__Package__ParentPackageAssignment_2_2"
    // InternalUmlTextual.g:5838:1: rule__Package__ParentPackageAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__Package__ParentPackageAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5842:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:5843:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:5843:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:5844:3: ( RULE_ID )
            {
             before(grammarAccess.getPackageAccess().getParentPackagePackageCrossReference_2_2_0()); 
            // InternalUmlTextual.g:5845:3: ( RULE_ID )
            // InternalUmlTextual.g:5846:4: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getParentPackagePackageIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getParentPackagePackageIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getPackageAccess().getParentPackagePackageCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ParentPackageAssignment_2_2"


    // $ANTLR start "rule__Package__ElementsAssignment_4"
    // InternalUmlTextual.g:5857:1: rule__Package__ElementsAssignment_4 : ( ruleElement ) ;
    public final void rule__Package__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5861:1: ( ( ruleElement ) )
            // InternalUmlTextual.g:5862:2: ( ruleElement )
            {
            // InternalUmlTextual.g:5862:2: ( ruleElement )
            // InternalUmlTextual.g:5863:3: ruleElement
            {
             before(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ElementsAssignment_4"


    // $ANTLR start "rule__Class__StereotypeAssignment_0_1"
    // InternalUmlTextual.g:5872:1: rule__Class__StereotypeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Class__StereotypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5876:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:5877:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:5877:2: ( RULE_ID )
            // InternalUmlTextual.g:5878:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getStereotypeIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getStereotypeIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__StereotypeAssignment_0_1"


    // $ANTLR start "rule__Class__VisibilityAssignment_1"
    // InternalUmlTextual.g:5887:1: rule__Class__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5891:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:5892:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:5892:2: ( ruleVisibility )
            // InternalUmlTextual.g:5893:3: ruleVisibility
            {
             before(grammarAccess.getClassAccess().getVisibilityVisibilityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getClassAccess().getVisibilityVisibilityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__VisibilityAssignment_1"


    // $ANTLR start "rule__Class__NameAssignment_3"
    // InternalUmlTextual.g:5902:1: rule__Class__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5906:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:5907:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:5907:2: ( RULE_ID )
            // InternalUmlTextual.g:5908:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_3"


    // $ANTLR start "rule__Class__ParentClassAssignment_4_1"
    // InternalUmlTextual.g:5917:1: rule__Class__ParentClassAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ParentClassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5921:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:5922:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:5922:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:5923:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getParentClassClassCrossReference_4_1_0()); 
            // InternalUmlTextual.g:5924:3: ( RULE_ID )
            // InternalUmlTextual.g:5925:4: RULE_ID
            {
             before(grammarAccess.getClassAccess().getParentClassClassIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getParentClassClassIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getParentClassClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__ParentClassAssignment_4_1"


    // $ANTLR start "rule__Class__InterfaceAssignment_5_1"
    // InternalUmlTextual.g:5936:1: rule__Class__InterfaceAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__InterfaceAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5940:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:5941:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:5941:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:5942:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getInterfaceInterfaceCrossReference_5_1_0()); 
            // InternalUmlTextual.g:5943:3: ( RULE_ID )
            // InternalUmlTextual.g:5944:4: RULE_ID
            {
             before(grammarAccess.getClassAccess().getInterfaceInterfaceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getInterfaceInterfaceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getInterfaceInterfaceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__InterfaceAssignment_5_1"


    // $ANTLR start "rule__Class__InterfaceAssignment_5_2_1"
    // InternalUmlTextual.g:5955:1: rule__Class__InterfaceAssignment_5_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__InterfaceAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5959:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:5960:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:5960:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:5961:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getInterfaceInterfaceCrossReference_5_2_1_0()); 
            // InternalUmlTextual.g:5962:3: ( RULE_ID )
            // InternalUmlTextual.g:5963:4: RULE_ID
            {
             before(grammarAccess.getClassAccess().getInterfaceInterfaceIDTerminalRuleCall_5_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getInterfaceInterfaceIDTerminalRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getInterfaceInterfaceCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__InterfaceAssignment_5_2_1"


    // $ANTLR start "rule__Class__AttributesAssignment_7"
    // InternalUmlTextual.g:5974:1: rule__Class__AttributesAssignment_7 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5978:1: ( ( ruleAttribute ) )
            // InternalUmlTextual.g:5979:2: ( ruleAttribute )
            {
            // InternalUmlTextual.g:5979:2: ( ruleAttribute )
            // InternalUmlTextual.g:5980:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_7"


    // $ANTLR start "rule__Class__MethodsAssignment_8"
    // InternalUmlTextual.g:5989:1: rule__Class__MethodsAssignment_8 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5993:1: ( ( ruleMethod ) )
            // InternalUmlTextual.g:5994:2: ( ruleMethod )
            {
            // InternalUmlTextual.g:5994:2: ( ruleMethod )
            // InternalUmlTextual.g:5995:3: ruleMethod
            {
             before(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getClassAccess().getMethodsMethodParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__MethodsAssignment_8"


    // $ANTLR start "rule__Interface__StereotypeAssignment_0_1"
    // InternalUmlTextual.g:6004:1: rule__Interface__StereotypeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Interface__StereotypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6008:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6009:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6009:2: ( RULE_ID )
            // InternalUmlTextual.g:6010:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getStereotypeIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getStereotypeIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__StereotypeAssignment_0_1"


    // $ANTLR start "rule__Interface__VisibilityAssignment_1"
    // InternalUmlTextual.g:6019:1: rule__Interface__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Interface__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6023:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6024:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6024:2: ( ruleVisibility )
            // InternalUmlTextual.g:6025:3: ruleVisibility
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityVisibilityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getVisibilityVisibilityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__VisibilityAssignment_1"


    // $ANTLR start "rule__Interface__NameAssignment_3"
    // InternalUmlTextual.g:6034:1: rule__Interface__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6038:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6039:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6039:2: ( RULE_ID )
            // InternalUmlTextual.g:6040:3: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__NameAssignment_3"


    // $ANTLR start "rule__Interface__ParentClassAssignment_4_1"
    // InternalUmlTextual.g:6049:1: rule__Interface__ParentClassAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__ParentClassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6053:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6054:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6054:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6055:3: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getParentClassClassCrossReference_4_1_0()); 
            // InternalUmlTextual.g:6056:3: ( RULE_ID )
            // InternalUmlTextual.g:6057:4: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getParentClassClassIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getParentClassClassIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getParentClassClassCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__ParentClassAssignment_4_1"


    // $ANTLR start "rule__Interface__AttributesAssignment_6"
    // InternalUmlTextual.g:6068:1: rule__Interface__AttributesAssignment_6 : ( ruleAttribute ) ;
    public final void rule__Interface__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6072:1: ( ( ruleAttribute ) )
            // InternalUmlTextual.g:6073:2: ( ruleAttribute )
            {
            // InternalUmlTextual.g:6073:2: ( ruleAttribute )
            // InternalUmlTextual.g:6074:3: ruleAttribute
            {
             before(grammarAccess.getInterfaceAccess().getAttributesAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getAttributesAttributeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__AttributesAssignment_6"


    // $ANTLR start "rule__AttributeType__NameAssignment_0"
    // InternalUmlTextual.g:6083:1: rule__AttributeType__NameAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__AttributeType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6087:1: ( ( ( 'string' ) ) )
            // InternalUmlTextual.g:6088:2: ( ( 'string' ) )
            {
            // InternalUmlTextual.g:6088:2: ( ( 'string' ) )
            // InternalUmlTextual.g:6089:3: ( 'string' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameStringKeyword_0_0()); 
            // InternalUmlTextual.g:6090:3: ( 'string' )
            // InternalUmlTextual.g:6091:4: 'string'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameStringKeyword_0_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getNameStringKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getNameStringKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment_0"


    // $ANTLR start "rule__AttributeType__NameAssignment_1"
    // InternalUmlTextual.g:6102:1: rule__AttributeType__NameAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__AttributeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6106:1: ( ( ( 'int' ) ) )
            // InternalUmlTextual.g:6107:2: ( ( 'int' ) )
            {
            // InternalUmlTextual.g:6107:2: ( ( 'int' ) )
            // InternalUmlTextual.g:6108:3: ( 'int' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameIntKeyword_1_0()); 
            // InternalUmlTextual.g:6109:3: ( 'int' )
            // InternalUmlTextual.g:6110:4: 'int'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameIntKeyword_1_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getNameIntKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getNameIntKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment_1"


    // $ANTLR start "rule__AttributeType__NameAssignment_2"
    // InternalUmlTextual.g:6121:1: rule__AttributeType__NameAssignment_2 : ( ( 'double' ) ) ;
    public final void rule__AttributeType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6125:1: ( ( ( 'double' ) ) )
            // InternalUmlTextual.g:6126:2: ( ( 'double' ) )
            {
            // InternalUmlTextual.g:6126:2: ( ( 'double' ) )
            // InternalUmlTextual.g:6127:3: ( 'double' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameDoubleKeyword_2_0()); 
            // InternalUmlTextual.g:6128:3: ( 'double' )
            // InternalUmlTextual.g:6129:4: 'double'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameDoubleKeyword_2_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getNameDoubleKeyword_2_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getNameDoubleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment_2"


    // $ANTLR start "rule__AttributeType__NameAssignment_3"
    // InternalUmlTextual.g:6140:1: rule__AttributeType__NameAssignment_3 : ( ( 'boolean' ) ) ;
    public final void rule__AttributeType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6144:1: ( ( ( 'boolean' ) ) )
            // InternalUmlTextual.g:6145:2: ( ( 'boolean' ) )
            {
            // InternalUmlTextual.g:6145:2: ( ( 'boolean' ) )
            // InternalUmlTextual.g:6146:3: ( 'boolean' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_3_0()); 
            // InternalUmlTextual.g:6147:3: ( 'boolean' )
            // InternalUmlTextual.g:6148:4: 'boolean'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_3_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_3_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment_3"


    // $ANTLR start "rule__AttributeType__NameAssignment_4"
    // InternalUmlTextual.g:6159:1: rule__AttributeType__NameAssignment_4 : ( ( 'byte' ) ) ;
    public final void rule__AttributeType__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6163:1: ( ( ( 'byte' ) ) )
            // InternalUmlTextual.g:6164:2: ( ( 'byte' ) )
            {
            // InternalUmlTextual.g:6164:2: ( ( 'byte' ) )
            // InternalUmlTextual.g:6165:3: ( 'byte' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameByteKeyword_4_0()); 
            // InternalUmlTextual.g:6166:3: ( 'byte' )
            // InternalUmlTextual.g:6167:4: 'byte'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameByteKeyword_4_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getNameByteKeyword_4_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getNameByteKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment_4"


    // $ANTLR start "rule__AttributeType__NameAssignment_5"
    // InternalUmlTextual.g:6178:1: rule__AttributeType__NameAssignment_5 : ( ( 'char' ) ) ;
    public final void rule__AttributeType__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6182:1: ( ( ( 'char' ) ) )
            // InternalUmlTextual.g:6183:2: ( ( 'char' ) )
            {
            // InternalUmlTextual.g:6183:2: ( ( 'char' ) )
            // InternalUmlTextual.g:6184:3: ( 'char' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameCharKeyword_5_0()); 
            // InternalUmlTextual.g:6185:3: ( 'char' )
            // InternalUmlTextual.g:6186:4: 'char'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameCharKeyword_5_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getNameCharKeyword_5_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getNameCharKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment_5"


    // $ANTLR start "rule__AttributeType__NameAssignment_6"
    // InternalUmlTextual.g:6197:1: rule__AttributeType__NameAssignment_6 : ( ( 'float' ) ) ;
    public final void rule__AttributeType__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6201:1: ( ( ( 'float' ) ) )
            // InternalUmlTextual.g:6202:2: ( ( 'float' ) )
            {
            // InternalUmlTextual.g:6202:2: ( ( 'float' ) )
            // InternalUmlTextual.g:6203:3: ( 'float' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameFloatKeyword_6_0()); 
            // InternalUmlTextual.g:6204:3: ( 'float' )
            // InternalUmlTextual.g:6205:4: 'float'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameFloatKeyword_6_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getNameFloatKeyword_6_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getNameFloatKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment_6"


    // $ANTLR start "rule__AttributeType__NameAssignment_7"
    // InternalUmlTextual.g:6216:1: rule__AttributeType__NameAssignment_7 : ( ( 'short' ) ) ;
    public final void rule__AttributeType__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6220:1: ( ( ( 'short' ) ) )
            // InternalUmlTextual.g:6221:2: ( ( 'short' ) )
            {
            // InternalUmlTextual.g:6221:2: ( ( 'short' ) )
            // InternalUmlTextual.g:6222:3: ( 'short' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameShortKeyword_7_0()); 
            // InternalUmlTextual.g:6223:3: ( 'short' )
            // InternalUmlTextual.g:6224:4: 'short'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameShortKeyword_7_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getNameShortKeyword_7_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getNameShortKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment_7"


    // $ANTLR start "rule__AttributeType__NameAssignment_8"
    // InternalUmlTextual.g:6235:1: rule__AttributeType__NameAssignment_8 : ( ( 'long' ) ) ;
    public final void rule__AttributeType__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6239:1: ( ( ( 'long' ) ) )
            // InternalUmlTextual.g:6240:2: ( ( 'long' ) )
            {
            // InternalUmlTextual.g:6240:2: ( ( 'long' ) )
            // InternalUmlTextual.g:6241:3: ( 'long' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameLongKeyword_8_0()); 
            // InternalUmlTextual.g:6242:3: ( 'long' )
            // InternalUmlTextual.g:6243:4: 'long'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameLongKeyword_8_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getNameLongKeyword_8_0()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getNameLongKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__NameAssignment_8"


    // $ANTLR start "rule__DomainSpecificType__NameAssignment"
    // InternalUmlTextual.g:6254:1: rule__DomainSpecificType__NameAssignment : ( RULE_ID ) ;
    public final void rule__DomainSpecificType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6258:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6259:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6259:2: ( RULE_ID )
            // InternalUmlTextual.g:6260:3: RULE_ID
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificTypeAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificType__NameAssignment"


    // $ANTLR start "rule__Attribute__VisibilityAssignment_0"
    // InternalUmlTextual.g:6269:1: rule__Attribute__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6273:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6274:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6274:2: ( ruleVisibility )
            // InternalUmlTextual.g:6275:3: ruleVisibility
            {
             before(grammarAccess.getAttributeAccess().getVisibilityVisibilityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getVisibilityVisibilityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__VisibilityAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_2"
    // InternalUmlTextual.g:6284:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6288:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6289:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6289:2: ( RULE_ID )
            // InternalUmlTextual.g:6290:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_2"


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // InternalUmlTextual.g:6299:1: rule__Attribute__TypeAssignment_4 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6303:1: ( ( ruleAttributeType ) )
            // InternalUmlTextual.g:6304:2: ( ruleAttributeType )
            {
            // InternalUmlTextual.g:6304:2: ( ruleAttributeType )
            // InternalUmlTextual.g:6305:3: ruleAttributeType
            {
             before(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__Attribute__MultiplicityAssignment_5_1"
    // InternalUmlTextual.g:6314:1: rule__Attribute__MultiplicityAssignment_5_1 : ( ruleMultiplicity ) ;
    public final void rule__Attribute__MultiplicityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6318:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6319:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6319:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6320:3: ruleMultiplicity
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getMultiplicityMultiplicityParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__MultiplicityAssignment_5_1"


    // $ANTLR start "rule__Method__VisibilityAssignment_2"
    // InternalUmlTextual.g:6329:1: rule__Method__VisibilityAssignment_2 : ( ruleVisibility ) ;
    public final void rule__Method__VisibilityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6333:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6334:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6334:2: ( ruleVisibility )
            // InternalUmlTextual.g:6335:3: ruleVisibility
            {
             before(grammarAccess.getMethodAccess().getVisibilityVisibilityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getVisibilityVisibilityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__VisibilityAssignment_2"


    // $ANTLR start "rule__Method__NameAssignment_4"
    // InternalUmlTextual.g:6344:1: rule__Method__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6348:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6349:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6349:2: ( RULE_ID )
            // InternalUmlTextual.g:6350:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__NameAssignment_4"


    // $ANTLR start "rule__Method__ParametersAssignment_6"
    // InternalUmlTextual.g:6359:1: rule__Method__ParametersAssignment_6 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6363:1: ( ( ruleParameter ) )
            // InternalUmlTextual.g:6364:2: ( ruleParameter )
            {
            // InternalUmlTextual.g:6364:2: ( ruleParameter )
            // InternalUmlTextual.g:6365:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_6"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_9"
    // InternalUmlTextual.g:6374:1: rule__Method__ReturnTypeAssignment_9 : ( ruleAttributeType ) ;
    public final void rule__Method__ReturnTypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6378:1: ( ( ruleAttributeType ) )
            // InternalUmlTextual.g:6379:2: ( ruleAttributeType )
            {
            // InternalUmlTextual.g:6379:2: ( ruleAttributeType )
            // InternalUmlTextual.g:6380:3: ruleAttributeType
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAttributeTypeParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypeAttributeTypeParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeAssignment_9"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalUmlTextual.g:6389:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6393:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6394:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6394:2: ( RULE_ID )
            // InternalUmlTextual.g:6395:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__ParameterTypeAssignment_2"
    // InternalUmlTextual.g:6404:1: rule__Parameter__ParameterTypeAssignment_2 : ( ruleAttributeType ) ;
    public final void rule__Parameter__ParameterTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6408:1: ( ( ruleAttributeType ) )
            // InternalUmlTextual.g:6409:2: ( ruleAttributeType )
            {
            // InternalUmlTextual.g:6409:2: ( ruleAttributeType )
            // InternalUmlTextual.g:6410:3: ruleAttributeType
            {
             before(grammarAccess.getParameterAccess().getParameterTypeAttributeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getParameterTypeAttributeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ParameterTypeAssignment_2"


    // $ANTLR start "rule__Association__NameAssignment_2"
    // InternalUmlTextual.g:6419:1: rule__Association__NameAssignment_2 : ( ( rule__Association__NameAlternatives_2_0 ) ) ;
    public final void rule__Association__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6423:1: ( ( ( rule__Association__NameAlternatives_2_0 ) ) )
            // InternalUmlTextual.g:6424:2: ( ( rule__Association__NameAlternatives_2_0 ) )
            {
            // InternalUmlTextual.g:6424:2: ( ( rule__Association__NameAlternatives_2_0 ) )
            // InternalUmlTextual.g:6425:3: ( rule__Association__NameAlternatives_2_0 )
            {
             before(grammarAccess.getAssociationAccess().getNameAlternatives_2_0()); 
            // InternalUmlTextual.g:6426:3: ( rule__Association__NameAlternatives_2_0 )
            // InternalUmlTextual.g:6426:4: rule__Association__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Association__NameAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NameAssignment_2"


    // $ANTLR start "rule__Association__Navigation1Assignment_5"
    // InternalUmlTextual.g:6434:1: rule__Association__Navigation1Assignment_5 : ( ruleNavigation ) ;
    public final void rule__Association__Navigation1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6438:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:6439:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:6439:2: ( ruleNavigation )
            // InternalUmlTextual.g:6440:3: ruleNavigation
            {
             before(grammarAccess.getAssociationAccess().getNavigation1NavigationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigation();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getNavigation1NavigationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Navigation1Assignment_5"


    // $ANTLR start "rule__Association__Class1Assignment_6"
    // InternalUmlTextual.g:6449:1: rule__Association__Class1Assignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Association__Class1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6453:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6454:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6454:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6455:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getClass1ClassCrossReference_6_0()); 
            // InternalUmlTextual.g:6456:3: ( RULE_ID )
            // InternalUmlTextual.g:6457:4: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getClass1ClassIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getClass1ClassIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getClass1ClassCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Class1Assignment_6"


    // $ANTLR start "rule__Association__Multiplicity1Assignment_8"
    // InternalUmlTextual.g:6468:1: rule__Association__Multiplicity1Assignment_8 : ( ruleMultiplicity ) ;
    public final void rule__Association__Multiplicity1Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6472:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6473:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6473:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6474:3: ruleMultiplicity
            {
             before(grammarAccess.getAssociationAccess().getMultiplicity1MultiplicityParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getMultiplicity1MultiplicityParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Multiplicity1Assignment_8"


    // $ANTLR start "rule__Association__Navigation2Assignment_11"
    // InternalUmlTextual.g:6483:1: rule__Association__Navigation2Assignment_11 : ( ruleNavigation ) ;
    public final void rule__Association__Navigation2Assignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6487:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:6488:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:6488:2: ( ruleNavigation )
            // InternalUmlTextual.g:6489:3: ruleNavigation
            {
             before(grammarAccess.getAssociationAccess().getNavigation2NavigationParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigation();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getNavigation2NavigationParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Navigation2Assignment_11"


    // $ANTLR start "rule__Association__Class2Assignment_12"
    // InternalUmlTextual.g:6498:1: rule__Association__Class2Assignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Association__Class2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6502:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6503:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6503:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6504:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getClass2ClassCrossReference_12_0()); 
            // InternalUmlTextual.g:6505:3: ( RULE_ID )
            // InternalUmlTextual.g:6506:4: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getClass2ClassIDTerminalRuleCall_12_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getClass2ClassIDTerminalRuleCall_12_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getClass2ClassCrossReference_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Class2Assignment_12"


    // $ANTLR start "rule__Association__Multiplicity2Assignment_14"
    // InternalUmlTextual.g:6517:1: rule__Association__Multiplicity2Assignment_14 : ( ruleMultiplicity ) ;
    public final void rule__Association__Multiplicity2Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6521:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6522:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6522:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6523:3: ruleMultiplicity
            {
             before(grammarAccess.getAssociationAccess().getMultiplicity2MultiplicityParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getMultiplicity2MultiplicityParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Multiplicity2Assignment_14"


    // $ANTLR start "rule__Association__ClassAssignment_16_2"
    // InternalUmlTextual.g:6532:1: rule__Association__ClassAssignment_16_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__ClassAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6536:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6537:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6537:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6538:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getClassClassCrossReference_16_2_0()); 
            // InternalUmlTextual.g:6539:3: ( RULE_ID )
            // InternalUmlTextual.g:6540:4: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getClassClassIDTerminalRuleCall_16_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getClassClassIDTerminalRuleCall_16_2_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getClassClassCrossReference_16_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__ClassAssignment_16_2"


    // $ANTLR start "rule__Aggregation__NameAssignment_1"
    // InternalUmlTextual.g:6551:1: rule__Aggregation__NameAssignment_1 : ( ( rule__Aggregation__NameAlternatives_1_0 ) ) ;
    public final void rule__Aggregation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6555:1: ( ( ( rule__Aggregation__NameAlternatives_1_0 ) ) )
            // InternalUmlTextual.g:6556:2: ( ( rule__Aggregation__NameAlternatives_1_0 ) )
            {
            // InternalUmlTextual.g:6556:2: ( ( rule__Aggregation__NameAlternatives_1_0 ) )
            // InternalUmlTextual.g:6557:3: ( rule__Aggregation__NameAlternatives_1_0 )
            {
             before(grammarAccess.getAggregationAccess().getNameAlternatives_1_0()); 
            // InternalUmlTextual.g:6558:3: ( rule__Aggregation__NameAlternatives_1_0 )
            // InternalUmlTextual.g:6558:4: rule__Aggregation__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAggregationAccess().getNameAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__NameAssignment_1"


    // $ANTLR start "rule__Aggregation__Class1Assignment_4"
    // InternalUmlTextual.g:6566:1: rule__Aggregation__Class1Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Aggregation__Class1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6570:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6571:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6571:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6572:3: ( RULE_ID )
            {
             before(grammarAccess.getAggregationAccess().getClass1ClassCrossReference_4_0()); 
            // InternalUmlTextual.g:6573:3: ( RULE_ID )
            // InternalUmlTextual.g:6574:4: RULE_ID
            {
             before(grammarAccess.getAggregationAccess().getClass1ClassIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getClass1ClassIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAggregationAccess().getClass1ClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Class1Assignment_4"


    // $ANTLR start "rule__Aggregation__Multiplicity1Assignment_6"
    // InternalUmlTextual.g:6585:1: rule__Aggregation__Multiplicity1Assignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Aggregation__Multiplicity1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6589:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6590:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6590:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6591:3: ruleMultiplicity
            {
             before(grammarAccess.getAggregationAccess().getMultiplicity1MultiplicityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAggregationAccess().getMultiplicity1MultiplicityParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Multiplicity1Assignment_6"


    // $ANTLR start "rule__Aggregation__NavigationAssignment_9"
    // InternalUmlTextual.g:6600:1: rule__Aggregation__NavigationAssignment_9 : ( ruleNavigation ) ;
    public final void rule__Aggregation__NavigationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6604:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:6605:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:6605:2: ( ruleNavigation )
            // InternalUmlTextual.g:6606:3: ruleNavigation
            {
             before(grammarAccess.getAggregationAccess().getNavigationNavigationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigation();

            state._fsp--;

             after(grammarAccess.getAggregationAccess().getNavigationNavigationParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__NavigationAssignment_9"


    // $ANTLR start "rule__Aggregation__Class2Assignment_10"
    // InternalUmlTextual.g:6615:1: rule__Aggregation__Class2Assignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Aggregation__Class2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6619:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6620:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6620:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6621:3: ( RULE_ID )
            {
             before(grammarAccess.getAggregationAccess().getClass2ClassCrossReference_10_0()); 
            // InternalUmlTextual.g:6622:3: ( RULE_ID )
            // InternalUmlTextual.g:6623:4: RULE_ID
            {
             before(grammarAccess.getAggregationAccess().getClass2ClassIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getClass2ClassIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getAggregationAccess().getClass2ClassCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Class2Assignment_10"


    // $ANTLR start "rule__Aggregation__Multiplicity2Assignment_12"
    // InternalUmlTextual.g:6634:1: rule__Aggregation__Multiplicity2Assignment_12 : ( ruleMultiplicity ) ;
    public final void rule__Aggregation__Multiplicity2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6638:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6639:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6639:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6640:3: ruleMultiplicity
            {
             before(grammarAccess.getAggregationAccess().getMultiplicity2MultiplicityParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAggregationAccess().getMultiplicity2MultiplicityParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Multiplicity2Assignment_12"


    // $ANTLR start "rule__Composition__NameAssignment_1"
    // InternalUmlTextual.g:6649:1: rule__Composition__NameAssignment_1 : ( ( rule__Composition__NameAlternatives_1_0 ) ) ;
    public final void rule__Composition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6653:1: ( ( ( rule__Composition__NameAlternatives_1_0 ) ) )
            // InternalUmlTextual.g:6654:2: ( ( rule__Composition__NameAlternatives_1_0 ) )
            {
            // InternalUmlTextual.g:6654:2: ( ( rule__Composition__NameAlternatives_1_0 ) )
            // InternalUmlTextual.g:6655:3: ( rule__Composition__NameAlternatives_1_0 )
            {
             before(grammarAccess.getCompositionAccess().getNameAlternatives_1_0()); 
            // InternalUmlTextual.g:6656:3: ( rule__Composition__NameAlternatives_1_0 )
            // InternalUmlTextual.g:6656:4: rule__Composition__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Composition__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositionAccess().getNameAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__NameAssignment_1"


    // $ANTLR start "rule__Composition__Class1Assignment_4"
    // InternalUmlTextual.g:6664:1: rule__Composition__Class1Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Composition__Class1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6668:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6669:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6669:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6670:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionAccess().getClass1ClassCrossReference_4_0()); 
            // InternalUmlTextual.g:6671:3: ( RULE_ID )
            // InternalUmlTextual.g:6672:4: RULE_ID
            {
             before(grammarAccess.getCompositionAccess().getClass1ClassIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getClass1ClassIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCompositionAccess().getClass1ClassCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Class1Assignment_4"


    // $ANTLR start "rule__Composition__Multiplicity1Assignment_6"
    // InternalUmlTextual.g:6683:1: rule__Composition__Multiplicity1Assignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Composition__Multiplicity1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6687:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6688:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6688:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6689:3: ruleMultiplicity
            {
             before(grammarAccess.getCompositionAccess().getMultiplicity1MultiplicityParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getMultiplicity1MultiplicityParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Multiplicity1Assignment_6"


    // $ANTLR start "rule__Composition__NavigationAssignment_9"
    // InternalUmlTextual.g:6698:1: rule__Composition__NavigationAssignment_9 : ( ruleNavigation ) ;
    public final void rule__Composition__NavigationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6702:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:6703:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:6703:2: ( ruleNavigation )
            // InternalUmlTextual.g:6704:3: ruleNavigation
            {
             before(grammarAccess.getCompositionAccess().getNavigationNavigationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleNavigation();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getNavigationNavigationParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__NavigationAssignment_9"


    // $ANTLR start "rule__Composition__Class2Assignment_10"
    // InternalUmlTextual.g:6713:1: rule__Composition__Class2Assignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Composition__Class2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6717:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6718:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6718:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6719:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionAccess().getClass2ClassCrossReference_10_0()); 
            // InternalUmlTextual.g:6720:3: ( RULE_ID )
            // InternalUmlTextual.g:6721:4: RULE_ID
            {
             before(grammarAccess.getCompositionAccess().getClass2ClassIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getClass2ClassIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getCompositionAccess().getClass2ClassCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Class2Assignment_10"


    // $ANTLR start "rule__Composition__Multiplicity2Assignment_12"
    // InternalUmlTextual.g:6732:1: rule__Composition__Multiplicity2Assignment_12 : ( ruleMultiplicity ) ;
    public final void rule__Composition__Multiplicity2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6736:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6737:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6737:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6738:3: ruleMultiplicity
            {
             before(grammarAccess.getCompositionAccess().getMultiplicity2MultiplicityParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getMultiplicity2MultiplicityParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Multiplicity2Assignment_12"


    // $ANTLR start "rule__UseCaseDiagram__NameAssignment_2"
    // InternalUmlTextual.g:6747:1: rule__UseCaseDiagram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__UseCaseDiagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6751:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6752:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6752:2: ( RULE_ID )
            // InternalUmlTextual.g:6753:3: RULE_ID
            {
             before(grammarAccess.getUseCaseDiagramAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseDiagramAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__NameAssignment_2"


    // $ANTLR start "rule__UseCaseDiagram__ElementsAssignment_4"
    // InternalUmlTextual.g:6762:1: rule__UseCaseDiagram__ElementsAssignment_4 : ( ruleUseCaseElement ) ;
    public final void rule__UseCaseDiagram__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6766:1: ( ( ruleUseCaseElement ) )
            // InternalUmlTextual.g:6767:2: ( ruleUseCaseElement )
            {
            // InternalUmlTextual.g:6767:2: ( ruleUseCaseElement )
            // InternalUmlTextual.g:6768:3: ruleUseCaseElement
            {
             before(grammarAccess.getUseCaseDiagramAccess().getElementsUseCaseElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUseCaseElement();

            state._fsp--;

             after(grammarAccess.getUseCaseDiagramAccess().getElementsUseCaseElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCaseDiagram__ElementsAssignment_4"


    // $ANTLR start "rule__Actor__VisibilityAssignment_0"
    // InternalUmlTextual.g:6777:1: rule__Actor__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Actor__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6781:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6782:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6782:2: ( ruleVisibility )
            // InternalUmlTextual.g:6783:3: ruleVisibility
            {
             before(grammarAccess.getActorAccess().getVisibilityVisibilityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibility();

            state._fsp--;

             after(grammarAccess.getActorAccess().getVisibilityVisibilityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__VisibilityAssignment_0"


    // $ANTLR start "rule__Actor__AbstractAssignment_1"
    // InternalUmlTextual.g:6792:1: rule__Actor__AbstractAssignment_1 : ( ruleAbstract ) ;
    public final void rule__Actor__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6796:1: ( ( ruleAbstract ) )
            // InternalUmlTextual.g:6797:2: ( ruleAbstract )
            {
            // InternalUmlTextual.g:6797:2: ( ruleAbstract )
            // InternalUmlTextual.g:6798:3: ruleAbstract
            {
             before(grammarAccess.getActorAccess().getAbstractAbstractParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstract();

            state._fsp--;

             after(grammarAccess.getActorAccess().getAbstractAbstractParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__AbstractAssignment_1"


    // $ANTLR start "rule__Actor__ActiveAssignment_2"
    // InternalUmlTextual.g:6807:1: rule__Actor__ActiveAssignment_2 : ( ruleActive ) ;
    public final void rule__Actor__ActiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6811:1: ( ( ruleActive ) )
            // InternalUmlTextual.g:6812:2: ( ruleActive )
            {
            // InternalUmlTextual.g:6812:2: ( ruleActive )
            // InternalUmlTextual.g:6813:3: ruleActive
            {
             before(grammarAccess.getActorAccess().getActiveActiveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActive();

            state._fsp--;

             after(grammarAccess.getActorAccess().getActiveActiveParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__ActiveAssignment_2"


    // $ANTLR start "rule__Actor__BusinessAssignment_3"
    // InternalUmlTextual.g:6822:1: rule__Actor__BusinessAssignment_3 : ( ( 'business' ) ) ;
    public final void rule__Actor__BusinessAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6826:1: ( ( ( 'business' ) ) )
            // InternalUmlTextual.g:6827:2: ( ( 'business' ) )
            {
            // InternalUmlTextual.g:6827:2: ( ( 'business' ) )
            // InternalUmlTextual.g:6828:3: ( 'business' )
            {
             before(grammarAccess.getActorAccess().getBusinessBusinessKeyword_3_0()); 
            // InternalUmlTextual.g:6829:3: ( 'business' )
            // InternalUmlTextual.g:6830:4: 'business'
            {
             before(grammarAccess.getActorAccess().getBusinessBusinessKeyword_3_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getBusinessBusinessKeyword_3_0()); 

            }

             after(grammarAccess.getActorAccess().getBusinessBusinessKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__BusinessAssignment_3"


    // $ANTLR start "rule__Actor__NameAssignment_5"
    // InternalUmlTextual.g:6841:1: rule__Actor__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6845:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6846:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6846:2: ( RULE_ID )
            // InternalUmlTextual.g:6847:3: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__NameAssignment_5"


    // $ANTLR start "rule__Actor__ParentActorAssignment_6_1"
    // InternalUmlTextual.g:6856:1: rule__Actor__ParentActorAssignment_6_1 : ( ruleActor ) ;
    public final void rule__Actor__ParentActorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6860:1: ( ( ruleActor ) )
            // InternalUmlTextual.g:6861:2: ( ruleActor )
            {
            // InternalUmlTextual.g:6861:2: ( ruleActor )
            // InternalUmlTextual.g:6862:3: ruleActor
            {
             before(grammarAccess.getActorAccess().getParentActorActorParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActor();

            state._fsp--;

             after(grammarAccess.getActorAccess().getParentActorActorParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__ParentActorAssignment_6_1"


    // $ANTLR start "rule__Actor__UseCasesAssignment_8"
    // InternalUmlTextual.g:6871:1: rule__Actor__UseCasesAssignment_8 : ( ruleActorUseCaseAssociation ) ;
    public final void rule__Actor__UseCasesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6875:1: ( ( ruleActorUseCaseAssociation ) )
            // InternalUmlTextual.g:6876:2: ( ruleActorUseCaseAssociation )
            {
            // InternalUmlTextual.g:6876:2: ( ruleActorUseCaseAssociation )
            // InternalUmlTextual.g:6877:3: ruleActorUseCaseAssociation
            {
             before(grammarAccess.getActorAccess().getUseCasesActorUseCaseAssociationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleActorUseCaseAssociation();

            state._fsp--;

             after(grammarAccess.getActorAccess().getUseCasesActorUseCaseAssociationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__UseCasesAssignment_8"


    // $ANTLR start "rule__UseCase__NameAssignment_1"
    // InternalUmlTextual.g:6886:1: rule__UseCase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6890:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6891:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6891:2: ( RULE_ID )
            // InternalUmlTextual.g:6892:3: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__NameAssignment_1"


    // $ANTLR start "rule__UseCase__IncludedUseCaseAssignment_2_1"
    // InternalUmlTextual.g:6901:1: rule__UseCase__IncludedUseCaseAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__IncludedUseCaseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6905:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6906:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6906:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6907:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseCrossReference_2_1_0()); 
            // InternalUmlTextual.g:6908:3: ( RULE_ID )
            // InternalUmlTextual.g:6909:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__IncludedUseCaseAssignment_2_1"


    // $ANTLR start "rule__UseCase__ExtendedUseCaseAssignment_3_1"
    // InternalUmlTextual.g:6920:1: rule__UseCase__ExtendedUseCaseAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ExtendedUseCaseAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6924:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6925:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6925:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6926:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseCrossReference_3_1_0()); 
            // InternalUmlTextual.g:6927:3: ( RULE_ID )
            // InternalUmlTextual.g:6928:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ExtendedUseCaseAssignment_3_1"


    // $ANTLR start "rule__UseCase__DescriptionAssignment_5"
    // InternalUmlTextual.g:6939:1: rule__UseCase__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__UseCase__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6943:1: ( ( RULE_STRING ) )
            // InternalUmlTextual.g:6944:2: ( RULE_STRING )
            {
            // InternalUmlTextual.g:6944:2: ( RULE_STRING )
            // InternalUmlTextual.g:6945:3: RULE_STRING
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__DescriptionAssignment_5"


    // $ANTLR start "rule__UseCase__IncludedUseCaseAssignment_6_1_0_1"
    // InternalUmlTextual.g:6954:1: rule__UseCase__IncludedUseCaseAssignment_6_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__IncludedUseCaseAssignment_6_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6958:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6959:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6959:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6960:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseCrossReference_6_1_0_1_0()); 
            // InternalUmlTextual.g:6961:3: ( RULE_ID )
            // InternalUmlTextual.g:6962:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseIDTerminalRuleCall_6_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseIDTerminalRuleCall_6_1_0_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseCrossReference_6_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__IncludedUseCaseAssignment_6_1_0_1"


    // $ANTLR start "rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1"
    // InternalUmlTextual.g:6973:1: rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6977:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6978:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6978:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6979:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseCrossReference_6_1_0_2_1_0()); 
            // InternalUmlTextual.g:6980:3: ( RULE_ID )
            // InternalUmlTextual.g:6981:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseIDTerminalRuleCall_6_1_0_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseIDTerminalRuleCall_6_1_0_2_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseCrossReference_6_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__IncludedUseCaseAssignment_6_1_0_2_1"


    // $ANTLR start "rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4"
    // InternalUmlTextual.g:6992:1: rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6996:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6997:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6997:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6998:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseCrossReference_6_1_0_4_0()); 
            // InternalUmlTextual.g:6999:3: ( RULE_ID )
            // InternalUmlTextual.g:7000:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseIDTerminalRuleCall_6_1_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseIDTerminalRuleCall_6_1_0_4_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseCrossReference_6_1_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ExtendedUseCaseAssignment_6_1_0_4"


    // $ANTLR start "rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1"
    // InternalUmlTextual.g:7011:1: rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7015:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7016:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7016:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7017:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseCrossReference_6_1_0_5_1_0()); 
            // InternalUmlTextual.g:7018:3: ( RULE_ID )
            // InternalUmlTextual.g:7019:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseIDTerminalRuleCall_6_1_0_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseIDTerminalRuleCall_6_1_0_5_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseCrossReference_6_1_0_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ExtendedUseCaseAssignment_6_1_0_5_1"


    // $ANTLR start "rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1"
    // InternalUmlTextual.g:7030:1: rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7034:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7035:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7035:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7036:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseCrossReference_6_1_1_1_0()); 
            // InternalUmlTextual.g:7037:3: ( RULE_ID )
            // InternalUmlTextual.g:7038:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseIDTerminalRuleCall_6_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseIDTerminalRuleCall_6_1_1_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseCrossReference_6_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ExtendedUseCaseAssignment_6_1_1_1"


    // $ANTLR start "rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1"
    // InternalUmlTextual.g:7049:1: rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7053:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7054:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7054:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7055:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseCrossReference_6_1_1_2_1_0()); 
            // InternalUmlTextual.g:7056:3: ( RULE_ID )
            // InternalUmlTextual.g:7057:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseIDTerminalRuleCall_6_1_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseIDTerminalRuleCall_6_1_1_2_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCaseUseCaseCrossReference_6_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ExtendedUseCaseAssignment_6_1_1_2_1"


    // $ANTLR start "rule__UseCase__IncludedUseCaseAssignment_6_1_1_4"
    // InternalUmlTextual.g:7068:1: rule__UseCase__IncludedUseCaseAssignment_6_1_1_4 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__IncludedUseCaseAssignment_6_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7072:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7073:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7073:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7074:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseCrossReference_6_1_1_4_0()); 
            // InternalUmlTextual.g:7075:3: ( RULE_ID )
            // InternalUmlTextual.g:7076:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseIDTerminalRuleCall_6_1_1_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseIDTerminalRuleCall_6_1_1_4_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseCrossReference_6_1_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__IncludedUseCaseAssignment_6_1_1_4"


    // $ANTLR start "rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1"
    // InternalUmlTextual.g:7087:1: rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7091:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7092:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7092:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7093:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseCrossReference_6_1_1_5_1_0()); 
            // InternalUmlTextual.g:7094:3: ( RULE_ID )
            // InternalUmlTextual.g:7095:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseIDTerminalRuleCall_6_1_1_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseIDTerminalRuleCall_6_1_1_5_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCaseUseCaseCrossReference_6_1_1_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__IncludedUseCaseAssignment_6_1_1_5_1"


    // $ANTLR start "rule__ActorUseCaseAssociation__UseCaseAssignment_1"
    // InternalUmlTextual.g:7106:1: rule__ActorUseCaseAssociation__UseCaseAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActorUseCaseAssociation__UseCaseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7110:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7111:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7111:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7112:3: ( RULE_ID )
            {
             before(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseUseCaseCrossReference_1_0()); 
            // InternalUmlTextual.g:7113:3: ( RULE_ID )
            // InternalUmlTextual.g:7114:4: RULE_ID
            {
             before(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseUseCaseIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseUseCaseIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseUseCaseCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__UseCaseAssignment_1"


    // $ANTLR start "rule__ActorUseCaseAssociation__UseCaseAssignment_2_1"
    // InternalUmlTextual.g:7125:1: rule__ActorUseCaseAssociation__UseCaseAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActorUseCaseAssociation__UseCaseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7129:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7130:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7130:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7131:3: ( RULE_ID )
            {
             before(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseUseCaseCrossReference_2_1_0()); 
            // InternalUmlTextual.g:7132:3: ( RULE_ID )
            // InternalUmlTextual.g:7133:4: RULE_ID
            {
             before(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseUseCaseIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseUseCaseIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getActorUseCaseAssociationAccess().getUseCaseUseCaseCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActorUseCaseAssociation__UseCaseAssignment_2_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\17\1\5\4\35\3\uffff\1\17";
    static final String dfa_3s = "\1\66\1\5\4\42\3\uffff\1\42";
    static final String dfa_4s = "\6\uffff\1\1\1\2\1\3\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\uffff\1\2\1\3\1\4\11\uffff\1\6\1\1\3\uffff\1\10\14\uffff\2\7\4\uffff\2\7",
            "\1\11",
            "\1\6\4\uffff\1\10",
            "\1\6\4\uffff\1\10",
            "\1\6\4\uffff\1\10",
            "\1\6\4\uffff\1\10",
            "",
            "",
            "",
            "\1\5\1\uffff\1\2\1\3\1\4\11\uffff\1\6\4\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "744:1: rule__Element__Alternatives : ( ( ruleClass ) | ( ruleAssociationConnector ) | ( ruleInterface ) );";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\10\uffff\1\12\2\uffff";
    static final String dfa_9s = "\1\4\7\uffff\1\32\2\uffff";
    static final String dfa_10s = "\1\44\7\uffff\1\51\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\10";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\10\17\uffff\1\1\1\2\1\3\1\4\1\5\12\uffff\1\6\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\12\uffff\1\11\3\uffff\1\12",
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

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "873:1: rule__Multiplicity__Alternatives : ( ( '1' ) | ( '0..1' ) | ( '0..*' ) | ( '*' ) | ( '1..*' ) | ( ( rule__Multiplicity__Group_5__0 ) ) | ( ( rule__Multiplicity__Group_6__0 ) ) | ( RULE_INT ) | ( ( rule__Multiplicity__Group_8__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0080000000018002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00618004640E8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00618004600E8002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000600E8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000182000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000C40040E8800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000040000E8002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000C00000E8802L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00618004600E8000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000040040E8000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000040000E8000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0xF000000000000020L,0x000000000000001FL});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001801F00010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000C00000E8800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000004000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x02800000040E9800L,0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x02800000000E9802L,0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x02000000000E9800L,0x0000000000000020L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0800000004000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0410000080000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0400000080000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0400000200000000L});

}