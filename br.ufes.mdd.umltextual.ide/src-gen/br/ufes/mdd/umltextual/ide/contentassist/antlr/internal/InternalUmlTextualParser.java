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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'abstract'", "'active'", "'unnamed'", "'navigable'", "'package'", "'subsystem'", "'public'", "'private'", "'protected'", "'1'", "'0..1'", "'0..*'", "'*'", "'1..*'", "'{'", "'}'", "'depends'", "'on'", "'class'", "'@'", "'extends'", "'implements'", "','", "'interface'", "'domaintype'", "'='", "'0..'", "'1..'", "'..'", "'attr'", "':'", "'['", "']'", "'static'", "'function'", "'('", "')'", "'->'", "'undirected'", "'association'", "'from'", "'to'", "'with'", "'associatedclass'", "'aggregation'", "'composition'", "'usecase'", "'diagram'", "'actor'", "'uses'", "'includes'", "'instantiable'", "'string'", "'int'", "'double'", "'boolean'", "'byte'", "'char'", "'float'", "'short'", "'long'", "'business'"
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
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

                if ( ((LA1_0>=15 && LA1_0<=16)||LA1_0==57||LA1_0==62) ) {
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
    // InternalUmlTextual.g:312:1: ruleDomainSpecificType : ( ( rule__DomainSpecificType__Group__0 ) ) ;
    public final void ruleDomainSpecificType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:316:2: ( ( ( rule__DomainSpecificType__Group__0 ) ) )
            // InternalUmlTextual.g:317:2: ( ( rule__DomainSpecificType__Group__0 ) )
            {
            // InternalUmlTextual.g:317:2: ( ( rule__DomainSpecificType__Group__0 ) )
            // InternalUmlTextual.g:318:3: ( rule__DomainSpecificType__Group__0 )
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getGroup()); 
            // InternalUmlTextual.g:319:3: ( rule__DomainSpecificType__Group__0 )
            // InternalUmlTextual.g:319:4: rule__DomainSpecificType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificTypeAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleUnnamed"
    // InternalUmlTextual.g:428:1: entryRuleUnnamed : ruleUnnamed EOF ;
    public final void entryRuleUnnamed() throws RecognitionException {
        try {
            // InternalUmlTextual.g:429:1: ( ruleUnnamed EOF )
            // InternalUmlTextual.g:430:1: ruleUnnamed EOF
            {
             before(grammarAccess.getUnnamedRule()); 
            pushFollow(FOLLOW_1);
            ruleUnnamed();

            state._fsp--;

             after(grammarAccess.getUnnamedRule()); 
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
    // $ANTLR end "entryRuleUnnamed"


    // $ANTLR start "ruleUnnamed"
    // InternalUmlTextual.g:437:1: ruleUnnamed : ( 'unnamed' ) ;
    public final void ruleUnnamed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:441:2: ( ( 'unnamed' ) )
            // InternalUmlTextual.g:442:2: ( 'unnamed' )
            {
            // InternalUmlTextual.g:442:2: ( 'unnamed' )
            // InternalUmlTextual.g:443:3: 'unnamed'
            {
             before(grammarAccess.getUnnamedAccess().getUnnamedKeyword()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUnnamedAccess().getUnnamedKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnnamed"


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


    // $ANTLR start "rule__ModelElement__Alternatives"
    // InternalUmlTextual.g:677:1: rule__ModelElement__Alternatives : ( ( rulePackage ) | ( ruleUseCaseDiagram ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:681:1: ( ( rulePackage ) | ( ruleUseCaseDiagram ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=16)||LA2_0==62) ) {
                alt2=1;
            }
            else if ( (LA2_0==57) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUmlTextual.g:682:2: ( rulePackage )
                    {
                    // InternalUmlTextual.g:682:2: ( rulePackage )
                    // InternalUmlTextual.g:683:3: rulePackage
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
                    // InternalUmlTextual.g:688:2: ( ruleUseCaseDiagram )
                    {
                    // InternalUmlTextual.g:688:2: ( ruleUseCaseDiagram )
                    // InternalUmlTextual.g:689:3: ruleUseCaseDiagram
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


    // $ANTLR start "rule__Package__TypeAlternatives_1_0"
    // InternalUmlTextual.g:698:1: rule__Package__TypeAlternatives_1_0 : ( ( 'package' ) | ( 'subsystem' ) );
    public final void rule__Package__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:702:1: ( ( 'package' ) | ( 'subsystem' ) )
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
                    // InternalUmlTextual.g:703:2: ( 'package' )
                    {
                    // InternalUmlTextual.g:703:2: ( 'package' )
                    // InternalUmlTextual.g:704:3: 'package'
                    {
                     before(grammarAccess.getPackageAccess().getTypePackageKeyword_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getTypePackageKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:709:2: ( 'subsystem' )
                    {
                    // InternalUmlTextual.g:709:2: ( 'subsystem' )
                    // InternalUmlTextual.g:710:3: 'subsystem'
                    {
                     before(grammarAccess.getPackageAccess().getTypeSubsystemKeyword_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getTypeSubsystemKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Package__TypeAlternatives_1_0"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalUmlTextual.g:719:1: rule__Element__Alternatives : ( ( ruleClass ) | ( ruleAssociationConnector ) | ( ruleInterface ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:723:1: ( ( ruleClass ) | ( ruleAssociationConnector ) | ( ruleInterface ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalUmlTextual.g:724:2: ( ruleClass )
                    {
                    // InternalUmlTextual.g:724:2: ( ruleClass )
                    // InternalUmlTextual.g:725:3: ruleClass
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
                    // InternalUmlTextual.g:730:2: ( ruleAssociationConnector )
                    {
                    // InternalUmlTextual.g:730:2: ( ruleAssociationConnector )
                    // InternalUmlTextual.g:731:3: ruleAssociationConnector
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
                    // InternalUmlTextual.g:736:2: ( ruleInterface )
                    {
                    // InternalUmlTextual.g:736:2: ( ruleInterface )
                    // InternalUmlTextual.g:737:3: ruleInterface
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
    // InternalUmlTextual.g:746:1: rule__Visibility__Alternatives : ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:750:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )
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
                    // InternalUmlTextual.g:751:2: ( 'public' )
                    {
                    // InternalUmlTextual.g:751:2: ( 'public' )
                    // InternalUmlTextual.g:752:3: 'public'
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getPublicKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:757:2: ( 'private' )
                    {
                    // InternalUmlTextual.g:757:2: ( 'private' )
                    // InternalUmlTextual.g:758:3: 'private'
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getPrivateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:763:2: ( 'protected' )
                    {
                    // InternalUmlTextual.g:763:2: ( 'protected' )
                    // InternalUmlTextual.g:764:3: 'protected'
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getProtectedKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:769:2: ( 'package' )
                    {
                    // InternalUmlTextual.g:769:2: ( 'package' )
                    // InternalUmlTextual.g:770:3: 'package'
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
    // InternalUmlTextual.g:779:1: rule__AttributeType__Alternatives : ( ( ( rule__AttributeType__NameAssignment_0 ) ) | ( ( rule__AttributeType__NameAssignment_1 ) ) | ( ( rule__AttributeType__NameAssignment_2 ) ) | ( ( rule__AttributeType__NameAssignment_3 ) ) | ( ( rule__AttributeType__NameAssignment_4 ) ) | ( ( rule__AttributeType__NameAssignment_5 ) ) | ( ( rule__AttributeType__NameAssignment_6 ) ) | ( ( rule__AttributeType__NameAssignment_7 ) ) | ( ( rule__AttributeType__NameAssignment_8 ) ) | ( ( rule__AttributeType__DomainTypeAssignment_9 ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:783:1: ( ( ( rule__AttributeType__NameAssignment_0 ) ) | ( ( rule__AttributeType__NameAssignment_1 ) ) | ( ( rule__AttributeType__NameAssignment_2 ) ) | ( ( rule__AttributeType__NameAssignment_3 ) ) | ( ( rule__AttributeType__NameAssignment_4 ) ) | ( ( rule__AttributeType__NameAssignment_5 ) ) | ( ( rule__AttributeType__NameAssignment_6 ) ) | ( ( rule__AttributeType__NameAssignment_7 ) ) | ( ( rule__AttributeType__NameAssignment_8 ) ) | ( ( rule__AttributeType__DomainTypeAssignment_9 ) ) )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt6=1;
                }
                break;
            case 64:
                {
                alt6=2;
                }
                break;
            case 65:
                {
                alt6=3;
                }
                break;
            case 66:
                {
                alt6=4;
                }
                break;
            case 67:
                {
                alt6=5;
                }
                break;
            case 68:
                {
                alt6=6;
                }
                break;
            case 69:
                {
                alt6=7;
                }
                break;
            case 70:
                {
                alt6=8;
                }
                break;
            case 71:
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
                    // InternalUmlTextual.g:784:2: ( ( rule__AttributeType__NameAssignment_0 ) )
                    {
                    // InternalUmlTextual.g:784:2: ( ( rule__AttributeType__NameAssignment_0 ) )
                    // InternalUmlTextual.g:785:3: ( rule__AttributeType__NameAssignment_0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_0()); 
                    // InternalUmlTextual.g:786:3: ( rule__AttributeType__NameAssignment_0 )
                    // InternalUmlTextual.g:786:4: rule__AttributeType__NameAssignment_0
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
                    // InternalUmlTextual.g:790:2: ( ( rule__AttributeType__NameAssignment_1 ) )
                    {
                    // InternalUmlTextual.g:790:2: ( ( rule__AttributeType__NameAssignment_1 ) )
                    // InternalUmlTextual.g:791:3: ( rule__AttributeType__NameAssignment_1 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_1()); 
                    // InternalUmlTextual.g:792:3: ( rule__AttributeType__NameAssignment_1 )
                    // InternalUmlTextual.g:792:4: rule__AttributeType__NameAssignment_1
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
                    // InternalUmlTextual.g:796:2: ( ( rule__AttributeType__NameAssignment_2 ) )
                    {
                    // InternalUmlTextual.g:796:2: ( ( rule__AttributeType__NameAssignment_2 ) )
                    // InternalUmlTextual.g:797:3: ( rule__AttributeType__NameAssignment_2 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_2()); 
                    // InternalUmlTextual.g:798:3: ( rule__AttributeType__NameAssignment_2 )
                    // InternalUmlTextual.g:798:4: rule__AttributeType__NameAssignment_2
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
                    // InternalUmlTextual.g:802:2: ( ( rule__AttributeType__NameAssignment_3 ) )
                    {
                    // InternalUmlTextual.g:802:2: ( ( rule__AttributeType__NameAssignment_3 ) )
                    // InternalUmlTextual.g:803:3: ( rule__AttributeType__NameAssignment_3 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_3()); 
                    // InternalUmlTextual.g:804:3: ( rule__AttributeType__NameAssignment_3 )
                    // InternalUmlTextual.g:804:4: rule__AttributeType__NameAssignment_3
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
                    // InternalUmlTextual.g:808:2: ( ( rule__AttributeType__NameAssignment_4 ) )
                    {
                    // InternalUmlTextual.g:808:2: ( ( rule__AttributeType__NameAssignment_4 ) )
                    // InternalUmlTextual.g:809:3: ( rule__AttributeType__NameAssignment_4 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_4()); 
                    // InternalUmlTextual.g:810:3: ( rule__AttributeType__NameAssignment_4 )
                    // InternalUmlTextual.g:810:4: rule__AttributeType__NameAssignment_4
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
                    // InternalUmlTextual.g:814:2: ( ( rule__AttributeType__NameAssignment_5 ) )
                    {
                    // InternalUmlTextual.g:814:2: ( ( rule__AttributeType__NameAssignment_5 ) )
                    // InternalUmlTextual.g:815:3: ( rule__AttributeType__NameAssignment_5 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_5()); 
                    // InternalUmlTextual.g:816:3: ( rule__AttributeType__NameAssignment_5 )
                    // InternalUmlTextual.g:816:4: rule__AttributeType__NameAssignment_5
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
                    // InternalUmlTextual.g:820:2: ( ( rule__AttributeType__NameAssignment_6 ) )
                    {
                    // InternalUmlTextual.g:820:2: ( ( rule__AttributeType__NameAssignment_6 ) )
                    // InternalUmlTextual.g:821:3: ( rule__AttributeType__NameAssignment_6 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_6()); 
                    // InternalUmlTextual.g:822:3: ( rule__AttributeType__NameAssignment_6 )
                    // InternalUmlTextual.g:822:4: rule__AttributeType__NameAssignment_6
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
                    // InternalUmlTextual.g:826:2: ( ( rule__AttributeType__NameAssignment_7 ) )
                    {
                    // InternalUmlTextual.g:826:2: ( ( rule__AttributeType__NameAssignment_7 ) )
                    // InternalUmlTextual.g:827:3: ( rule__AttributeType__NameAssignment_7 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_7()); 
                    // InternalUmlTextual.g:828:3: ( rule__AttributeType__NameAssignment_7 )
                    // InternalUmlTextual.g:828:4: rule__AttributeType__NameAssignment_7
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
                    // InternalUmlTextual.g:832:2: ( ( rule__AttributeType__NameAssignment_8 ) )
                    {
                    // InternalUmlTextual.g:832:2: ( ( rule__AttributeType__NameAssignment_8 ) )
                    // InternalUmlTextual.g:833:3: ( rule__AttributeType__NameAssignment_8 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_8()); 
                    // InternalUmlTextual.g:834:3: ( rule__AttributeType__NameAssignment_8 )
                    // InternalUmlTextual.g:834:4: rule__AttributeType__NameAssignment_8
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
                    // InternalUmlTextual.g:838:2: ( ( rule__AttributeType__DomainTypeAssignment_9 ) )
                    {
                    // InternalUmlTextual.g:838:2: ( ( rule__AttributeType__DomainTypeAssignment_9 ) )
                    // InternalUmlTextual.g:839:3: ( rule__AttributeType__DomainTypeAssignment_9 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDomainTypeAssignment_9()); 
                    // InternalUmlTextual.g:840:3: ( rule__AttributeType__DomainTypeAssignment_9 )
                    // InternalUmlTextual.g:840:4: rule__AttributeType__DomainTypeAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__DomainTypeAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getDomainTypeAssignment_9()); 

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
    // InternalUmlTextual.g:848:1: rule__Multiplicity__Alternatives : ( ( '1' ) | ( '0..1' ) | ( '0..*' ) | ( '*' ) | ( '1..*' ) | ( ( rule__Multiplicity__Group_5__0 ) ) | ( ( rule__Multiplicity__Group_6__0 ) ) | ( RULE_INT ) | ( ( rule__Multiplicity__Group_8__0 ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:852:1: ( ( '1' ) | ( '0..1' ) | ( '0..*' ) | ( '*' ) | ( '1..*' ) | ( ( rule__Multiplicity__Group_5__0 ) ) | ( ( rule__Multiplicity__Group_6__0 ) ) | ( RULE_INT ) | ( ( rule__Multiplicity__Group_8__0 ) ) )
            int alt7=9;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalUmlTextual.g:853:2: ( '1' )
                    {
                    // InternalUmlTextual.g:853:2: ( '1' )
                    // InternalUmlTextual.g:854:3: '1'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitOneKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:859:2: ( '0..1' )
                    {
                    // InternalUmlTextual.g:859:2: ( '0..1' )
                    // InternalUmlTextual.g:860:3: '0..1'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:865:2: ( '0..*' )
                    {
                    // InternalUmlTextual.g:865:2: ( '0..*' )
                    // InternalUmlTextual.g:866:3: '0..*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:871:2: ( '*' )
                    {
                    // InternalUmlTextual.g:871:2: ( '*' )
                    // InternalUmlTextual.g:872:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUmlTextual.g:877:2: ( '1..*' )
                    {
                    // InternalUmlTextual.g:877:2: ( '1..*' )
                    // InternalUmlTextual.g:878:3: '1..*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopAsteriskKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopAsteriskKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUmlTextual.g:883:2: ( ( rule__Multiplicity__Group_5__0 ) )
                    {
                    // InternalUmlTextual.g:883:2: ( ( rule__Multiplicity__Group_5__0 ) )
                    // InternalUmlTextual.g:884:3: ( rule__Multiplicity__Group_5__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_5()); 
                    // InternalUmlTextual.g:885:3: ( rule__Multiplicity__Group_5__0 )
                    // InternalUmlTextual.g:885:4: rule__Multiplicity__Group_5__0
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
                    // InternalUmlTextual.g:889:2: ( ( rule__Multiplicity__Group_6__0 ) )
                    {
                    // InternalUmlTextual.g:889:2: ( ( rule__Multiplicity__Group_6__0 ) )
                    // InternalUmlTextual.g:890:3: ( rule__Multiplicity__Group_6__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_6()); 
                    // InternalUmlTextual.g:891:3: ( rule__Multiplicity__Group_6__0 )
                    // InternalUmlTextual.g:891:4: rule__Multiplicity__Group_6__0
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
                    // InternalUmlTextual.g:895:2: ( RULE_INT )
                    {
                    // InternalUmlTextual.g:895:2: ( RULE_INT )
                    // InternalUmlTextual.g:896:3: RULE_INT
                    {
                     before(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_7()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUmlTextual.g:901:2: ( ( rule__Multiplicity__Group_8__0 ) )
                    {
                    // InternalUmlTextual.g:901:2: ( ( rule__Multiplicity__Group_8__0 ) )
                    // InternalUmlTextual.g:902:3: ( rule__Multiplicity__Group_8__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_8()); 
                    // InternalUmlTextual.g:903:3: ( rule__Multiplicity__Group_8__0 )
                    // InternalUmlTextual.g:903:4: rule__Multiplicity__Group_8__0
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
    // InternalUmlTextual.g:911:1: rule__AssociationConnector__Alternatives : ( ( ruleAssociation ) | ( ruleAggregation ) | ( ruleComposition ) );
    public final void rule__AssociationConnector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:915:1: ( ( ruleAssociation ) | ( ruleAggregation ) | ( ruleComposition ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 49:
            case 50:
                {
                alt8=1;
                }
                break;
            case 55:
                {
                alt8=2;
                }
                break;
            case 56:
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
                    // InternalUmlTextual.g:916:2: ( ruleAssociation )
                    {
                    // InternalUmlTextual.g:916:2: ( ruleAssociation )
                    // InternalUmlTextual.g:917:3: ruleAssociation
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
                    // InternalUmlTextual.g:922:2: ( ruleAggregation )
                    {
                    // InternalUmlTextual.g:922:2: ( ruleAggregation )
                    // InternalUmlTextual.g:923:3: ruleAggregation
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
                    // InternalUmlTextual.g:928:2: ( ruleComposition )
                    {
                    // InternalUmlTextual.g:928:2: ( ruleComposition )
                    // InternalUmlTextual.g:929:3: ruleComposition
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
    // InternalUmlTextual.g:938:1: rule__Association__NameAlternatives_2_0 : ( ( RULE_ID ) | ( ruleUnnamed ) );
    public final void rule__Association__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:942:1: ( ( RULE_ID ) | ( ruleUnnamed ) )
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
                    // InternalUmlTextual.g:943:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:943:2: ( RULE_ID )
                    // InternalUmlTextual.g:944:3: RULE_ID
                    {
                     before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:949:2: ( ruleUnnamed )
                    {
                    // InternalUmlTextual.g:949:2: ( ruleUnnamed )
                    // InternalUmlTextual.g:950:3: ruleUnnamed
                    {
                     before(grammarAccess.getAssociationAccess().getNameUnnamedParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnnamed();

                    state._fsp--;

                     after(grammarAccess.getAssociationAccess().getNameUnnamedParserRuleCall_2_0_1()); 

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
    // InternalUmlTextual.g:959:1: rule__Aggregation__NameAlternatives_1_0 : ( ( RULE_ID ) | ( ruleUnnamed ) );
    public final void rule__Aggregation__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:963:1: ( ( RULE_ID ) | ( ruleUnnamed ) )
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
                    // InternalUmlTextual.g:964:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:964:2: ( RULE_ID )
                    // InternalUmlTextual.g:965:3: RULE_ID
                    {
                     before(grammarAccess.getAggregationAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAggregationAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:970:2: ( ruleUnnamed )
                    {
                    // InternalUmlTextual.g:970:2: ( ruleUnnamed )
                    // InternalUmlTextual.g:971:3: ruleUnnamed
                    {
                     before(grammarAccess.getAggregationAccess().getNameUnnamedParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnnamed();

                    state._fsp--;

                     after(grammarAccess.getAggregationAccess().getNameUnnamedParserRuleCall_1_0_1()); 

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
    // InternalUmlTextual.g:980:1: rule__Composition__NameAlternatives_1_0 : ( ( RULE_ID ) | ( ruleUnnamed ) );
    public final void rule__Composition__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:984:1: ( ( RULE_ID ) | ( ruleUnnamed ) )
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
                    // InternalUmlTextual.g:985:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:985:2: ( RULE_ID )
                    // InternalUmlTextual.g:986:3: RULE_ID
                    {
                     before(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:991:2: ( ruleUnnamed )
                    {
                    // InternalUmlTextual.g:991:2: ( ruleUnnamed )
                    // InternalUmlTextual.g:992:3: ruleUnnamed
                    {
                     before(grammarAccess.getCompositionAccess().getNameUnnamedParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleUnnamed();

                    state._fsp--;

                     after(grammarAccess.getCompositionAccess().getNameUnnamedParserRuleCall_1_0_1()); 

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
    // InternalUmlTextual.g:1001:1: rule__UseCaseElement__Alternatives : ( ( ruleActor ) | ( ruleUseCase ) );
    public final void rule__UseCaseElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1005:1: ( ( ruleActor ) | ( ruleUseCase ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)||LA12_0==15||(LA12_0>=17 && LA12_0<=19)||LA12_0==59||LA12_0==72) ) {
                alt12=1;
            }
            else if ( (LA12_0==57) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUmlTextual.g:1006:2: ( ruleActor )
                    {
                    // InternalUmlTextual.g:1006:2: ( ruleActor )
                    // InternalUmlTextual.g:1007:3: ruleActor
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
                    // InternalUmlTextual.g:1012:2: ( ruleUseCase )
                    {
                    // InternalUmlTextual.g:1012:2: ( ruleUseCase )
                    // InternalUmlTextual.g:1013:3: ruleUseCase
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
    // InternalUmlTextual.g:1022:1: rule__UseCase__Alternatives_6_1 : ( ( ( rule__UseCase__Group_6_1_0__0 ) ) | ( ( rule__UseCase__Group_6_1_1__0 ) ) );
    public final void rule__UseCase__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1026:1: ( ( ( rule__UseCase__Group_6_1_0__0 ) ) | ( ( rule__UseCase__Group_6_1_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==61) ) {
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
                    // InternalUmlTextual.g:1027:2: ( ( rule__UseCase__Group_6_1_0__0 ) )
                    {
                    // InternalUmlTextual.g:1027:2: ( ( rule__UseCase__Group_6_1_0__0 ) )
                    // InternalUmlTextual.g:1028:3: ( rule__UseCase__Group_6_1_0__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_6_1_0()); 
                    // InternalUmlTextual.g:1029:3: ( rule__UseCase__Group_6_1_0__0 )
                    // InternalUmlTextual.g:1029:4: rule__UseCase__Group_6_1_0__0
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
                    // InternalUmlTextual.g:1033:2: ( ( rule__UseCase__Group_6_1_1__0 ) )
                    {
                    // InternalUmlTextual.g:1033:2: ( ( rule__UseCase__Group_6_1_1__0 ) )
                    // InternalUmlTextual.g:1034:3: ( rule__UseCase__Group_6_1_1__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_6_1_1()); 
                    // InternalUmlTextual.g:1035:3: ( rule__UseCase__Group_6_1_1__0 )
                    // InternalUmlTextual.g:1035:4: rule__UseCase__Group_6_1_1__0
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
    // InternalUmlTextual.g:1043:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1047:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalUmlTextual.g:1048:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalUmlTextual.g:1055:1: rule__Package__Group__0__Impl : ( ( rule__Package__InstantiableAssignment_0 )? ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1059:1: ( ( ( rule__Package__InstantiableAssignment_0 )? ) )
            // InternalUmlTextual.g:1060:1: ( ( rule__Package__InstantiableAssignment_0 )? )
            {
            // InternalUmlTextual.g:1060:1: ( ( rule__Package__InstantiableAssignment_0 )? )
            // InternalUmlTextual.g:1061:2: ( rule__Package__InstantiableAssignment_0 )?
            {
             before(grammarAccess.getPackageAccess().getInstantiableAssignment_0()); 
            // InternalUmlTextual.g:1062:2: ( rule__Package__InstantiableAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==62) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUmlTextual.g:1062:3: rule__Package__InstantiableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Package__InstantiableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getInstantiableAssignment_0()); 

            }


            }

        }
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
    // InternalUmlTextual.g:1070:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1074:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalUmlTextual.g:1075:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalUmlTextual.g:1082:1: rule__Package__Group__1__Impl : ( ( rule__Package__TypeAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1086:1: ( ( ( rule__Package__TypeAssignment_1 ) ) )
            // InternalUmlTextual.g:1087:1: ( ( rule__Package__TypeAssignment_1 ) )
            {
            // InternalUmlTextual.g:1087:1: ( ( rule__Package__TypeAssignment_1 ) )
            // InternalUmlTextual.g:1088:2: ( rule__Package__TypeAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getTypeAssignment_1()); 
            // InternalUmlTextual.g:1089:2: ( rule__Package__TypeAssignment_1 )
            // InternalUmlTextual.g:1089:3: rule__Package__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // InternalUmlTextual.g:1097:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1101:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalUmlTextual.g:1102:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalUmlTextual.g:1109:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1113:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:1114:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:1114:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalUmlTextual.g:1115:2: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:1116:2: ( rule__Package__NameAssignment_2 )
            // InternalUmlTextual.g:1116:3: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalUmlTextual.g:1124:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1128:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalUmlTextual.g:1129:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalUmlTextual.g:1136:1: rule__Package__Group__3__Impl : ( ( rule__Package__Group_3__0 )? ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1140:1: ( ( ( rule__Package__Group_3__0 )? ) )
            // InternalUmlTextual.g:1141:1: ( ( rule__Package__Group_3__0 )? )
            {
            // InternalUmlTextual.g:1141:1: ( ( rule__Package__Group_3__0 )? )
            // InternalUmlTextual.g:1142:2: ( rule__Package__Group_3__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_3()); 
            // InternalUmlTextual.g:1143:2: ( rule__Package__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUmlTextual.g:1143:3: rule__Package__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Package__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalUmlTextual.g:1151:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1155:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalUmlTextual.g:1156:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalUmlTextual.g:1163:1: rule__Package__Group__4__Impl : ( '{' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1167:1: ( ( '{' ) )
            // InternalUmlTextual.g:1168:1: ( '{' )
            {
            // InternalUmlTextual.g:1168:1: ( '{' )
            // InternalUmlTextual.g:1169:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalUmlTextual.g:1178:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1182:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalUmlTextual.g:1183:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__6();

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
    // InternalUmlTextual.g:1190:1: rule__Package__Group__5__Impl : ( ( rule__Package__DomainSpecificTypesAssignment_5 )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1194:1: ( ( ( rule__Package__DomainSpecificTypesAssignment_5 )* ) )
            // InternalUmlTextual.g:1195:1: ( ( rule__Package__DomainSpecificTypesAssignment_5 )* )
            {
            // InternalUmlTextual.g:1195:1: ( ( rule__Package__DomainSpecificTypesAssignment_5 )* )
            // InternalUmlTextual.g:1196:2: ( rule__Package__DomainSpecificTypesAssignment_5 )*
            {
             before(grammarAccess.getPackageAccess().getDomainSpecificTypesAssignment_5()); 
            // InternalUmlTextual.g:1197:2: ( rule__Package__DomainSpecificTypesAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUmlTextual.g:1197:3: rule__Package__DomainSpecificTypesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Package__DomainSpecificTypesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getDomainSpecificTypesAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Package__Group__6"
    // InternalUmlTextual.g:1205:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1209:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalUmlTextual.g:1210:2: rule__Package__Group__6__Impl rule__Package__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__7();

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
    // $ANTLR end "rule__Package__Group__6"


    // $ANTLR start "rule__Package__Group__6__Impl"
    // InternalUmlTextual.g:1217:1: rule__Package__Group__6__Impl : ( ( rule__Package__ElementsAssignment_6 )* ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1221:1: ( ( ( rule__Package__ElementsAssignment_6 )* ) )
            // InternalUmlTextual.g:1222:1: ( ( rule__Package__ElementsAssignment_6 )* )
            {
            // InternalUmlTextual.g:1222:1: ( ( rule__Package__ElementsAssignment_6 )* )
            // InternalUmlTextual.g:1223:2: ( rule__Package__ElementsAssignment_6 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_6()); 
            // InternalUmlTextual.g:1224:2: ( rule__Package__ElementsAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15||(LA17_0>=17 && LA17_0<=19)||(LA17_0>=29 && LA17_0<=30)||LA17_0==34||(LA17_0>=49 && LA17_0<=50)||(LA17_0>=55 && LA17_0<=56)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUmlTextual.g:1224:3: rule__Package__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Package__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getElementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__Package__Group__7"
    // InternalUmlTextual.g:1232:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1236:1: ( rule__Package__Group__7__Impl )
            // InternalUmlTextual.g:1237:2: rule__Package__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__7__Impl();

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
    // $ANTLR end "rule__Package__Group__7"


    // $ANTLR start "rule__Package__Group__7__Impl"
    // InternalUmlTextual.g:1243:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1247:1: ( ( '}' ) )
            // InternalUmlTextual.g:1248:1: ( '}' )
            {
            // InternalUmlTextual.g:1248:1: ( '}' )
            // InternalUmlTextual.g:1249:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__7__Impl"


    // $ANTLR start "rule__Package__Group_3__0"
    // InternalUmlTextual.g:1259:1: rule__Package__Group_3__0 : rule__Package__Group_3__0__Impl rule__Package__Group_3__1 ;
    public final void rule__Package__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1263:1: ( rule__Package__Group_3__0__Impl rule__Package__Group_3__1 )
            // InternalUmlTextual.g:1264:2: rule__Package__Group_3__0__Impl rule__Package__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__Package__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_3__1();

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
    // $ANTLR end "rule__Package__Group_3__0"


    // $ANTLR start "rule__Package__Group_3__0__Impl"
    // InternalUmlTextual.g:1271:1: rule__Package__Group_3__0__Impl : ( 'depends' ) ;
    public final void rule__Package__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1275:1: ( ( 'depends' ) )
            // InternalUmlTextual.g:1276:1: ( 'depends' )
            {
            // InternalUmlTextual.g:1276:1: ( 'depends' )
            // InternalUmlTextual.g:1277:2: 'depends'
            {
             before(grammarAccess.getPackageAccess().getDependsKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getDependsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__0__Impl"


    // $ANTLR start "rule__Package__Group_3__1"
    // InternalUmlTextual.g:1286:1: rule__Package__Group_3__1 : rule__Package__Group_3__1__Impl rule__Package__Group_3__2 ;
    public final void rule__Package__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1290:1: ( rule__Package__Group_3__1__Impl rule__Package__Group_3__2 )
            // InternalUmlTextual.g:1291:2: rule__Package__Group_3__1__Impl rule__Package__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_3__2();

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
    // $ANTLR end "rule__Package__Group_3__1"


    // $ANTLR start "rule__Package__Group_3__1__Impl"
    // InternalUmlTextual.g:1298:1: rule__Package__Group_3__1__Impl : ( 'on' ) ;
    public final void rule__Package__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1302:1: ( ( 'on' ) )
            // InternalUmlTextual.g:1303:1: ( 'on' )
            {
            // InternalUmlTextual.g:1303:1: ( 'on' )
            // InternalUmlTextual.g:1304:2: 'on'
            {
             before(grammarAccess.getPackageAccess().getOnKeyword_3_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getOnKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__1__Impl"


    // $ANTLR start "rule__Package__Group_3__2"
    // InternalUmlTextual.g:1313:1: rule__Package__Group_3__2 : rule__Package__Group_3__2__Impl ;
    public final void rule__Package__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1317:1: ( rule__Package__Group_3__2__Impl )
            // InternalUmlTextual.g:1318:2: rule__Package__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_3__2__Impl();

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
    // $ANTLR end "rule__Package__Group_3__2"


    // $ANTLR start "rule__Package__Group_3__2__Impl"
    // InternalUmlTextual.g:1324:1: rule__Package__Group_3__2__Impl : ( ( rule__Package__ParentPackageAssignment_3_2 ) ) ;
    public final void rule__Package__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1328:1: ( ( ( rule__Package__ParentPackageAssignment_3_2 ) ) )
            // InternalUmlTextual.g:1329:1: ( ( rule__Package__ParentPackageAssignment_3_2 ) )
            {
            // InternalUmlTextual.g:1329:1: ( ( rule__Package__ParentPackageAssignment_3_2 ) )
            // InternalUmlTextual.g:1330:2: ( rule__Package__ParentPackageAssignment_3_2 )
            {
             before(grammarAccess.getPackageAccess().getParentPackageAssignment_3_2()); 
            // InternalUmlTextual.g:1331:2: ( rule__Package__ParentPackageAssignment_3_2 )
            // InternalUmlTextual.g:1331:3: rule__Package__ParentPackageAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__ParentPackageAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getParentPackageAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_3__2__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalUmlTextual.g:1340:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1344:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalUmlTextual.g:1345:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalUmlTextual.g:1352:1: rule__Class__Group__0__Impl : ( ( rule__Class__Group_0__0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1356:1: ( ( ( rule__Class__Group_0__0 )? ) )
            // InternalUmlTextual.g:1357:1: ( ( rule__Class__Group_0__0 )? )
            {
            // InternalUmlTextual.g:1357:1: ( ( rule__Class__Group_0__0 )? )
            // InternalUmlTextual.g:1358:2: ( rule__Class__Group_0__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_0()); 
            // InternalUmlTextual.g:1359:2: ( rule__Class__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUmlTextual.g:1359:3: rule__Class__Group_0__0
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
    // InternalUmlTextual.g:1367:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1371:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalUmlTextual.g:1372:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalUmlTextual.g:1379:1: rule__Class__Group__1__Impl : ( ( rule__Class__VisibilityAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1383:1: ( ( ( rule__Class__VisibilityAssignment_1 )? ) )
            // InternalUmlTextual.g:1384:1: ( ( rule__Class__VisibilityAssignment_1 )? )
            {
            // InternalUmlTextual.g:1384:1: ( ( rule__Class__VisibilityAssignment_1 )? )
            // InternalUmlTextual.g:1385:2: ( rule__Class__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_1()); 
            // InternalUmlTextual.g:1386:2: ( rule__Class__VisibilityAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15||(LA19_0>=17 && LA19_0<=19)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUmlTextual.g:1386:3: rule__Class__VisibilityAssignment_1
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
    // InternalUmlTextual.g:1394:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1398:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalUmlTextual.g:1399:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:1406:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1410:1: ( ( 'class' ) )
            // InternalUmlTextual.g:1411:1: ( 'class' )
            {
            // InternalUmlTextual.g:1411:1: ( 'class' )
            // InternalUmlTextual.g:1412:2: 'class'
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
    // InternalUmlTextual.g:1421:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1425:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalUmlTextual.g:1426:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalUmlTextual.g:1433:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1437:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalUmlTextual.g:1438:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalUmlTextual.g:1438:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalUmlTextual.g:1439:2: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // InternalUmlTextual.g:1440:2: ( rule__Class__NameAssignment_3 )
            // InternalUmlTextual.g:1440:3: rule__Class__NameAssignment_3
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
    // InternalUmlTextual.g:1448:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1452:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalUmlTextual.g:1453:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalUmlTextual.g:1460:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1464:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalUmlTextual.g:1465:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalUmlTextual.g:1465:1: ( ( rule__Class__Group_4__0 )? )
            // InternalUmlTextual.g:1466:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalUmlTextual.g:1467:2: ( rule__Class__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUmlTextual.g:1467:3: rule__Class__Group_4__0
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
    // InternalUmlTextual.g:1475:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1479:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalUmlTextual.g:1480:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalUmlTextual.g:1487:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1491:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalUmlTextual.g:1492:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalUmlTextual.g:1492:1: ( ( rule__Class__Group_5__0 )? )
            // InternalUmlTextual.g:1493:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalUmlTextual.g:1494:2: ( rule__Class__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUmlTextual.g:1494:3: rule__Class__Group_5__0
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
    // InternalUmlTextual.g:1502:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1506:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalUmlTextual.g:1507:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalUmlTextual.g:1514:1: rule__Class__Group__6__Impl : ( '{' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1518:1: ( ( '{' ) )
            // InternalUmlTextual.g:1519:1: ( '{' )
            {
            // InternalUmlTextual.g:1519:1: ( '{' )
            // InternalUmlTextual.g:1520:2: '{'
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
    // InternalUmlTextual.g:1529:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1533:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalUmlTextual.g:1534:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalUmlTextual.g:1541:1: rule__Class__Group__7__Impl : ( ( rule__Class__AttributesAssignment_7 )* ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1545:1: ( ( ( rule__Class__AttributesAssignment_7 )* ) )
            // InternalUmlTextual.g:1546:1: ( ( rule__Class__AttributesAssignment_7 )* )
            {
            // InternalUmlTextual.g:1546:1: ( ( rule__Class__AttributesAssignment_7 )* )
            // InternalUmlTextual.g:1547:2: ( rule__Class__AttributesAssignment_7 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_7()); 
            // InternalUmlTextual.g:1548:2: ( rule__Class__AttributesAssignment_7 )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA22_2 = input.LA(2);

                    if ( (LA22_2==40) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA22_3 = input.LA(2);

                    if ( (LA22_3==40) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA22_4 = input.LA(2);

                    if ( (LA22_4==40) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 15:
                    {
                    int LA22_5 = input.LA(2);

                    if ( (LA22_5==40) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 40:
                    {
                    alt22=1;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // InternalUmlTextual.g:1548:3: rule__Class__AttributesAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Class__AttributesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalUmlTextual.g:1556:1: rule__Class__Group__8 : rule__Class__Group__8__Impl rule__Class__Group__9 ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1560:1: ( rule__Class__Group__8__Impl rule__Class__Group__9 )
            // InternalUmlTextual.g:1561:2: rule__Class__Group__8__Impl rule__Class__Group__9
            {
            pushFollow(FOLLOW_13);
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
    // InternalUmlTextual.g:1568:1: rule__Class__Group__8__Impl : ( ( rule__Class__MethodsAssignment_8 )* ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1572:1: ( ( ( rule__Class__MethodsAssignment_8 )* ) )
            // InternalUmlTextual.g:1573:1: ( ( rule__Class__MethodsAssignment_8 )* )
            {
            // InternalUmlTextual.g:1573:1: ( ( rule__Class__MethodsAssignment_8 )* )
            // InternalUmlTextual.g:1574:2: ( rule__Class__MethodsAssignment_8 )*
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_8()); 
            // InternalUmlTextual.g:1575:2: ( rule__Class__MethodsAssignment_8 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==11||LA23_0==15||(LA23_0>=17 && LA23_0<=19)||(LA23_0>=44 && LA23_0<=45)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalUmlTextual.g:1575:3: rule__Class__MethodsAssignment_8
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Class__MethodsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalUmlTextual.g:1583:1: rule__Class__Group__9 : rule__Class__Group__9__Impl ;
    public final void rule__Class__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1587:1: ( rule__Class__Group__9__Impl )
            // InternalUmlTextual.g:1588:2: rule__Class__Group__9__Impl
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
    // InternalUmlTextual.g:1594:1: rule__Class__Group__9__Impl : ( '}' ) ;
    public final void rule__Class__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1598:1: ( ( '}' ) )
            // InternalUmlTextual.g:1599:1: ( '}' )
            {
            // InternalUmlTextual.g:1599:1: ( '}' )
            // InternalUmlTextual.g:1600:2: '}'
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
    // InternalUmlTextual.g:1610:1: rule__Class__Group_0__0 : rule__Class__Group_0__0__Impl rule__Class__Group_0__1 ;
    public final void rule__Class__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1614:1: ( rule__Class__Group_0__0__Impl rule__Class__Group_0__1 )
            // InternalUmlTextual.g:1615:2: rule__Class__Group_0__0__Impl rule__Class__Group_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:1622:1: rule__Class__Group_0__0__Impl : ( '@' ) ;
    public final void rule__Class__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1626:1: ( ( '@' ) )
            // InternalUmlTextual.g:1627:1: ( '@' )
            {
            // InternalUmlTextual.g:1627:1: ( '@' )
            // InternalUmlTextual.g:1628:2: '@'
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
    // InternalUmlTextual.g:1637:1: rule__Class__Group_0__1 : rule__Class__Group_0__1__Impl ;
    public final void rule__Class__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1641:1: ( rule__Class__Group_0__1__Impl )
            // InternalUmlTextual.g:1642:2: rule__Class__Group_0__1__Impl
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
    // InternalUmlTextual.g:1648:1: rule__Class__Group_0__1__Impl : ( ( rule__Class__StereotypeAssignment_0_1 ) ) ;
    public final void rule__Class__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1652:1: ( ( ( rule__Class__StereotypeAssignment_0_1 ) ) )
            // InternalUmlTextual.g:1653:1: ( ( rule__Class__StereotypeAssignment_0_1 ) )
            {
            // InternalUmlTextual.g:1653:1: ( ( rule__Class__StereotypeAssignment_0_1 ) )
            // InternalUmlTextual.g:1654:2: ( rule__Class__StereotypeAssignment_0_1 )
            {
             before(grammarAccess.getClassAccess().getStereotypeAssignment_0_1()); 
            // InternalUmlTextual.g:1655:2: ( rule__Class__StereotypeAssignment_0_1 )
            // InternalUmlTextual.g:1655:3: rule__Class__StereotypeAssignment_0_1
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
    // InternalUmlTextual.g:1664:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1668:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalUmlTextual.g:1669:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:1676:1: rule__Class__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1680:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:1681:1: ( 'extends' )
            {
            // InternalUmlTextual.g:1681:1: ( 'extends' )
            // InternalUmlTextual.g:1682:2: 'extends'
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
    // InternalUmlTextual.g:1691:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1695:1: ( rule__Class__Group_4__1__Impl )
            // InternalUmlTextual.g:1696:2: rule__Class__Group_4__1__Impl
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
    // InternalUmlTextual.g:1702:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__ParentClassAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1706:1: ( ( ( rule__Class__ParentClassAssignment_4_1 ) ) )
            // InternalUmlTextual.g:1707:1: ( ( rule__Class__ParentClassAssignment_4_1 ) )
            {
            // InternalUmlTextual.g:1707:1: ( ( rule__Class__ParentClassAssignment_4_1 ) )
            // InternalUmlTextual.g:1708:2: ( rule__Class__ParentClassAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getParentClassAssignment_4_1()); 
            // InternalUmlTextual.g:1709:2: ( rule__Class__ParentClassAssignment_4_1 )
            // InternalUmlTextual.g:1709:3: rule__Class__ParentClassAssignment_4_1
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
    // InternalUmlTextual.g:1718:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1722:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalUmlTextual.g:1723:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:1730:1: rule__Class__Group_5__0__Impl : ( 'implements' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1734:1: ( ( 'implements' ) )
            // InternalUmlTextual.g:1735:1: ( 'implements' )
            {
            // InternalUmlTextual.g:1735:1: ( 'implements' )
            // InternalUmlTextual.g:1736:2: 'implements'
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
    // InternalUmlTextual.g:1745:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1749:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalUmlTextual.g:1750:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalUmlTextual.g:1757:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__InterfacesAssignment_5_1 ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1761:1: ( ( ( rule__Class__InterfacesAssignment_5_1 ) ) )
            // InternalUmlTextual.g:1762:1: ( ( rule__Class__InterfacesAssignment_5_1 ) )
            {
            // InternalUmlTextual.g:1762:1: ( ( rule__Class__InterfacesAssignment_5_1 ) )
            // InternalUmlTextual.g:1763:2: ( rule__Class__InterfacesAssignment_5_1 )
            {
             before(grammarAccess.getClassAccess().getInterfacesAssignment_5_1()); 
            // InternalUmlTextual.g:1764:2: ( rule__Class__InterfacesAssignment_5_1 )
            // InternalUmlTextual.g:1764:3: rule__Class__InterfacesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__InterfacesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getInterfacesAssignment_5_1()); 

            }


            }

        }
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
    // InternalUmlTextual.g:1772:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1776:1: ( rule__Class__Group_5__2__Impl )
            // InternalUmlTextual.g:1777:2: rule__Class__Group_5__2__Impl
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
    // InternalUmlTextual.g:1783:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__Group_5_2__0 )* ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1787:1: ( ( ( rule__Class__Group_5_2__0 )* ) )
            // InternalUmlTextual.g:1788:1: ( ( rule__Class__Group_5_2__0 )* )
            {
            // InternalUmlTextual.g:1788:1: ( ( rule__Class__Group_5_2__0 )* )
            // InternalUmlTextual.g:1789:2: ( rule__Class__Group_5_2__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_5_2()); 
            // InternalUmlTextual.g:1790:2: ( rule__Class__Group_5_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUmlTextual.g:1790:3: rule__Class__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Class__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalUmlTextual.g:1799:1: rule__Class__Group_5_2__0 : rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1 ;
    public final void rule__Class__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1803:1: ( rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1 )
            // InternalUmlTextual.g:1804:2: rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:1811:1: rule__Class__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1815:1: ( ( ',' ) )
            // InternalUmlTextual.g:1816:1: ( ',' )
            {
            // InternalUmlTextual.g:1816:1: ( ',' )
            // InternalUmlTextual.g:1817:2: ','
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
    // InternalUmlTextual.g:1826:1: rule__Class__Group_5_2__1 : rule__Class__Group_5_2__1__Impl ;
    public final void rule__Class__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1830:1: ( rule__Class__Group_5_2__1__Impl )
            // InternalUmlTextual.g:1831:2: rule__Class__Group_5_2__1__Impl
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
    // InternalUmlTextual.g:1837:1: rule__Class__Group_5_2__1__Impl : ( ( rule__Class__InterfacesAssignment_5_2_1 ) ) ;
    public final void rule__Class__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1841:1: ( ( ( rule__Class__InterfacesAssignment_5_2_1 ) ) )
            // InternalUmlTextual.g:1842:1: ( ( rule__Class__InterfacesAssignment_5_2_1 ) )
            {
            // InternalUmlTextual.g:1842:1: ( ( rule__Class__InterfacesAssignment_5_2_1 ) )
            // InternalUmlTextual.g:1843:2: ( rule__Class__InterfacesAssignment_5_2_1 )
            {
             before(grammarAccess.getClassAccess().getInterfacesAssignment_5_2_1()); 
            // InternalUmlTextual.g:1844:2: ( rule__Class__InterfacesAssignment_5_2_1 )
            // InternalUmlTextual.g:1844:3: rule__Class__InterfacesAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__InterfacesAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getInterfacesAssignment_5_2_1()); 

            }


            }

        }
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
    // InternalUmlTextual.g:1853:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1857:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalUmlTextual.g:1858:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalUmlTextual.g:1865:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__Group_0__0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1869:1: ( ( ( rule__Interface__Group_0__0 )? ) )
            // InternalUmlTextual.g:1870:1: ( ( rule__Interface__Group_0__0 )? )
            {
            // InternalUmlTextual.g:1870:1: ( ( rule__Interface__Group_0__0 )? )
            // InternalUmlTextual.g:1871:2: ( rule__Interface__Group_0__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_0()); 
            // InternalUmlTextual.g:1872:2: ( rule__Interface__Group_0__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUmlTextual.g:1872:3: rule__Interface__Group_0__0
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
    // InternalUmlTextual.g:1880:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1884:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalUmlTextual.g:1885:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalUmlTextual.g:1892:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__VisibilityAssignment_1 )? ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1896:1: ( ( ( rule__Interface__VisibilityAssignment_1 )? ) )
            // InternalUmlTextual.g:1897:1: ( ( rule__Interface__VisibilityAssignment_1 )? )
            {
            // InternalUmlTextual.g:1897:1: ( ( rule__Interface__VisibilityAssignment_1 )? )
            // InternalUmlTextual.g:1898:2: ( rule__Interface__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityAssignment_1()); 
            // InternalUmlTextual.g:1899:2: ( rule__Interface__VisibilityAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15||(LA26_0>=17 && LA26_0<=19)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUmlTextual.g:1899:3: rule__Interface__VisibilityAssignment_1
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
    // InternalUmlTextual.g:1907:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1911:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalUmlTextual.g:1912:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:1919:1: rule__Interface__Group__2__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1923:1: ( ( 'interface' ) )
            // InternalUmlTextual.g:1924:1: ( 'interface' )
            {
            // InternalUmlTextual.g:1924:1: ( 'interface' )
            // InternalUmlTextual.g:1925:2: 'interface'
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
    // InternalUmlTextual.g:1934:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1938:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalUmlTextual.g:1939:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalUmlTextual.g:1946:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__NameAssignment_3 ) ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1950:1: ( ( ( rule__Interface__NameAssignment_3 ) ) )
            // InternalUmlTextual.g:1951:1: ( ( rule__Interface__NameAssignment_3 ) )
            {
            // InternalUmlTextual.g:1951:1: ( ( rule__Interface__NameAssignment_3 ) )
            // InternalUmlTextual.g:1952:2: ( rule__Interface__NameAssignment_3 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_3()); 
            // InternalUmlTextual.g:1953:2: ( rule__Interface__NameAssignment_3 )
            // InternalUmlTextual.g:1953:3: rule__Interface__NameAssignment_3
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
    // InternalUmlTextual.g:1961:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1965:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalUmlTextual.g:1966:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalUmlTextual.g:1973:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__Group_4__0 )? ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1977:1: ( ( ( rule__Interface__Group_4__0 )? ) )
            // InternalUmlTextual.g:1978:1: ( ( rule__Interface__Group_4__0 )? )
            {
            // InternalUmlTextual.g:1978:1: ( ( rule__Interface__Group_4__0 )? )
            // InternalUmlTextual.g:1979:2: ( rule__Interface__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4()); 
            // InternalUmlTextual.g:1980:2: ( rule__Interface__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUmlTextual.g:1980:3: rule__Interface__Group_4__0
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
    // InternalUmlTextual.g:1988:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1992:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // InternalUmlTextual.g:1993:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalUmlTextual.g:2000:1: rule__Interface__Group__5__Impl : ( '{' ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2004:1: ( ( '{' ) )
            // InternalUmlTextual.g:2005:1: ( '{' )
            {
            // InternalUmlTextual.g:2005:1: ( '{' )
            // InternalUmlTextual.g:2006:2: '{'
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
    // InternalUmlTextual.g:2015:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl rule__Interface__Group__7 ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2019:1: ( rule__Interface__Group__6__Impl rule__Interface__Group__7 )
            // InternalUmlTextual.g:2020:2: rule__Interface__Group__6__Impl rule__Interface__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalUmlTextual.g:2027:1: rule__Interface__Group__6__Impl : ( ( rule__Interface__AttributesAssignment_6 )* ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2031:1: ( ( ( rule__Interface__AttributesAssignment_6 )* ) )
            // InternalUmlTextual.g:2032:1: ( ( rule__Interface__AttributesAssignment_6 )* )
            {
            // InternalUmlTextual.g:2032:1: ( ( rule__Interface__AttributesAssignment_6 )* )
            // InternalUmlTextual.g:2033:2: ( rule__Interface__AttributesAssignment_6 )*
            {
             before(grammarAccess.getInterfaceAccess().getAttributesAssignment_6()); 
            // InternalUmlTextual.g:2034:2: ( rule__Interface__AttributesAssignment_6 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15||(LA28_0>=17 && LA28_0<=19)||LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalUmlTextual.g:2034:3: rule__Interface__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Interface__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalUmlTextual.g:2042:1: rule__Interface__Group__7 : rule__Interface__Group__7__Impl ;
    public final void rule__Interface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2046:1: ( rule__Interface__Group__7__Impl )
            // InternalUmlTextual.g:2047:2: rule__Interface__Group__7__Impl
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
    // InternalUmlTextual.g:2053:1: rule__Interface__Group__7__Impl : ( '}' ) ;
    public final void rule__Interface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2057:1: ( ( '}' ) )
            // InternalUmlTextual.g:2058:1: ( '}' )
            {
            // InternalUmlTextual.g:2058:1: ( '}' )
            // InternalUmlTextual.g:2059:2: '}'
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
    // InternalUmlTextual.g:2069:1: rule__Interface__Group_0__0 : rule__Interface__Group_0__0__Impl rule__Interface__Group_0__1 ;
    public final void rule__Interface__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2073:1: ( rule__Interface__Group_0__0__Impl rule__Interface__Group_0__1 )
            // InternalUmlTextual.g:2074:2: rule__Interface__Group_0__0__Impl rule__Interface__Group_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:2081:1: rule__Interface__Group_0__0__Impl : ( '@' ) ;
    public final void rule__Interface__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2085:1: ( ( '@' ) )
            // InternalUmlTextual.g:2086:1: ( '@' )
            {
            // InternalUmlTextual.g:2086:1: ( '@' )
            // InternalUmlTextual.g:2087:2: '@'
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
    // InternalUmlTextual.g:2096:1: rule__Interface__Group_0__1 : rule__Interface__Group_0__1__Impl ;
    public final void rule__Interface__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2100:1: ( rule__Interface__Group_0__1__Impl )
            // InternalUmlTextual.g:2101:2: rule__Interface__Group_0__1__Impl
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
    // InternalUmlTextual.g:2107:1: rule__Interface__Group_0__1__Impl : ( ( rule__Interface__StereotypeAssignment_0_1 ) ) ;
    public final void rule__Interface__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2111:1: ( ( ( rule__Interface__StereotypeAssignment_0_1 ) ) )
            // InternalUmlTextual.g:2112:1: ( ( rule__Interface__StereotypeAssignment_0_1 ) )
            {
            // InternalUmlTextual.g:2112:1: ( ( rule__Interface__StereotypeAssignment_0_1 ) )
            // InternalUmlTextual.g:2113:2: ( rule__Interface__StereotypeAssignment_0_1 )
            {
             before(grammarAccess.getInterfaceAccess().getStereotypeAssignment_0_1()); 
            // InternalUmlTextual.g:2114:2: ( rule__Interface__StereotypeAssignment_0_1 )
            // InternalUmlTextual.g:2114:3: rule__Interface__StereotypeAssignment_0_1
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
    // InternalUmlTextual.g:2123:1: rule__Interface__Group_4__0 : rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 ;
    public final void rule__Interface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2127:1: ( rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 )
            // InternalUmlTextual.g:2128:2: rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:2135:1: rule__Interface__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Interface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2139:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:2140:1: ( 'extends' )
            {
            // InternalUmlTextual.g:2140:1: ( 'extends' )
            // InternalUmlTextual.g:2141:2: 'extends'
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
    // InternalUmlTextual.g:2150:1: rule__Interface__Group_4__1 : rule__Interface__Group_4__1__Impl ;
    public final void rule__Interface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2154:1: ( rule__Interface__Group_4__1__Impl )
            // InternalUmlTextual.g:2155:2: rule__Interface__Group_4__1__Impl
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
    // InternalUmlTextual.g:2161:1: rule__Interface__Group_4__1__Impl : ( ( rule__Interface__ParentInterfaceAssignment_4_1 ) ) ;
    public final void rule__Interface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2165:1: ( ( ( rule__Interface__ParentInterfaceAssignment_4_1 ) ) )
            // InternalUmlTextual.g:2166:1: ( ( rule__Interface__ParentInterfaceAssignment_4_1 ) )
            {
            // InternalUmlTextual.g:2166:1: ( ( rule__Interface__ParentInterfaceAssignment_4_1 ) )
            // InternalUmlTextual.g:2167:2: ( rule__Interface__ParentInterfaceAssignment_4_1 )
            {
             before(grammarAccess.getInterfaceAccess().getParentInterfaceAssignment_4_1()); 
            // InternalUmlTextual.g:2168:2: ( rule__Interface__ParentInterfaceAssignment_4_1 )
            // InternalUmlTextual.g:2168:3: rule__Interface__ParentInterfaceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Interface__ParentInterfaceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceAccess().getParentInterfaceAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DomainSpecificType__Group__0"
    // InternalUmlTextual.g:2177:1: rule__DomainSpecificType__Group__0 : rule__DomainSpecificType__Group__0__Impl rule__DomainSpecificType__Group__1 ;
    public final void rule__DomainSpecificType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2181:1: ( rule__DomainSpecificType__Group__0__Impl rule__DomainSpecificType__Group__1 )
            // InternalUmlTextual.g:2182:2: rule__DomainSpecificType__Group__0__Impl rule__DomainSpecificType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DomainSpecificType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificType__Group__1();

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
    // $ANTLR end "rule__DomainSpecificType__Group__0"


    // $ANTLR start "rule__DomainSpecificType__Group__0__Impl"
    // InternalUmlTextual.g:2189:1: rule__DomainSpecificType__Group__0__Impl : ( 'domaintype' ) ;
    public final void rule__DomainSpecificType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2193:1: ( ( 'domaintype' ) )
            // InternalUmlTextual.g:2194:1: ( 'domaintype' )
            {
            // InternalUmlTextual.g:2194:1: ( 'domaintype' )
            // InternalUmlTextual.g:2195:2: 'domaintype'
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getDomaintypeKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificTypeAccess().getDomaintypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificType__Group__0__Impl"


    // $ANTLR start "rule__DomainSpecificType__Group__1"
    // InternalUmlTextual.g:2204:1: rule__DomainSpecificType__Group__1 : rule__DomainSpecificType__Group__1__Impl rule__DomainSpecificType__Group__2 ;
    public final void rule__DomainSpecificType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2208:1: ( rule__DomainSpecificType__Group__1__Impl rule__DomainSpecificType__Group__2 )
            // InternalUmlTextual.g:2209:2: rule__DomainSpecificType__Group__1__Impl rule__DomainSpecificType__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__DomainSpecificType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificType__Group__2();

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
    // $ANTLR end "rule__DomainSpecificType__Group__1"


    // $ANTLR start "rule__DomainSpecificType__Group__1__Impl"
    // InternalUmlTextual.g:2216:1: rule__DomainSpecificType__Group__1__Impl : ( ( rule__DomainSpecificType__NameAssignment_1 ) ) ;
    public final void rule__DomainSpecificType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2220:1: ( ( ( rule__DomainSpecificType__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:2221:1: ( ( rule__DomainSpecificType__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:2221:1: ( ( rule__DomainSpecificType__NameAssignment_1 ) )
            // InternalUmlTextual.g:2222:2: ( rule__DomainSpecificType__NameAssignment_1 )
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:2223:2: ( rule__DomainSpecificType__NameAssignment_1 )
            // InternalUmlTextual.g:2223:3: rule__DomainSpecificType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificType__Group__1__Impl"


    // $ANTLR start "rule__DomainSpecificType__Group__2"
    // InternalUmlTextual.g:2231:1: rule__DomainSpecificType__Group__2 : rule__DomainSpecificType__Group__2__Impl rule__DomainSpecificType__Group__3 ;
    public final void rule__DomainSpecificType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2235:1: ( rule__DomainSpecificType__Group__2__Impl rule__DomainSpecificType__Group__3 )
            // InternalUmlTextual.g:2236:2: rule__DomainSpecificType__Group__2__Impl rule__DomainSpecificType__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__DomainSpecificType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainSpecificType__Group__3();

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
    // $ANTLR end "rule__DomainSpecificType__Group__2"


    // $ANTLR start "rule__DomainSpecificType__Group__2__Impl"
    // InternalUmlTextual.g:2243:1: rule__DomainSpecificType__Group__2__Impl : ( '=' ) ;
    public final void rule__DomainSpecificType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2247:1: ( ( '=' ) )
            // InternalUmlTextual.g:2248:1: ( '=' )
            {
            // InternalUmlTextual.g:2248:1: ( '=' )
            // InternalUmlTextual.g:2249:2: '='
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getEqualsSignKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificTypeAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificType__Group__2__Impl"


    // $ANTLR start "rule__DomainSpecificType__Group__3"
    // InternalUmlTextual.g:2258:1: rule__DomainSpecificType__Group__3 : rule__DomainSpecificType__Group__3__Impl ;
    public final void rule__DomainSpecificType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2262:1: ( rule__DomainSpecificType__Group__3__Impl )
            // InternalUmlTextual.g:2263:2: rule__DomainSpecificType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificType__Group__3__Impl();

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
    // $ANTLR end "rule__DomainSpecificType__Group__3"


    // $ANTLR start "rule__DomainSpecificType__Group__3__Impl"
    // InternalUmlTextual.g:2269:1: rule__DomainSpecificType__Group__3__Impl : ( ( rule__DomainSpecificType__DescriptionAssignment_3 ) ) ;
    public final void rule__DomainSpecificType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2273:1: ( ( ( rule__DomainSpecificType__DescriptionAssignment_3 ) ) )
            // InternalUmlTextual.g:2274:1: ( ( rule__DomainSpecificType__DescriptionAssignment_3 ) )
            {
            // InternalUmlTextual.g:2274:1: ( ( rule__DomainSpecificType__DescriptionAssignment_3 ) )
            // InternalUmlTextual.g:2275:2: ( rule__DomainSpecificType__DescriptionAssignment_3 )
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getDescriptionAssignment_3()); 
            // InternalUmlTextual.g:2276:2: ( rule__DomainSpecificType__DescriptionAssignment_3 )
            // InternalUmlTextual.g:2276:3: rule__DomainSpecificType__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DomainSpecificType__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainSpecificTypeAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificType__Group__3__Impl"


    // $ANTLR start "rule__Multiplicity__Group_5__0"
    // InternalUmlTextual.g:2285:1: rule__Multiplicity__Group_5__0 : rule__Multiplicity__Group_5__0__Impl rule__Multiplicity__Group_5__1 ;
    public final void rule__Multiplicity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2289:1: ( rule__Multiplicity__Group_5__0__Impl rule__Multiplicity__Group_5__1 )
            // InternalUmlTextual.g:2290:2: rule__Multiplicity__Group_5__0__Impl rule__Multiplicity__Group_5__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalUmlTextual.g:2297:1: rule__Multiplicity__Group_5__0__Impl : ( '0..' ) ;
    public final void rule__Multiplicity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2301:1: ( ( '0..' ) )
            // InternalUmlTextual.g:2302:1: ( '0..' )
            {
            // InternalUmlTextual.g:2302:1: ( '0..' )
            // InternalUmlTextual.g:2303:2: '0..'
            {
             before(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUmlTextual.g:2312:1: rule__Multiplicity__Group_5__1 : rule__Multiplicity__Group_5__1__Impl ;
    public final void rule__Multiplicity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2316:1: ( rule__Multiplicity__Group_5__1__Impl )
            // InternalUmlTextual.g:2317:2: rule__Multiplicity__Group_5__1__Impl
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
    // InternalUmlTextual.g:2323:1: rule__Multiplicity__Group_5__1__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2327:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2328:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2328:1: ( RULE_INT )
            // InternalUmlTextual.g:2329:2: RULE_INT
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
    // InternalUmlTextual.g:2339:1: rule__Multiplicity__Group_6__0 : rule__Multiplicity__Group_6__0__Impl rule__Multiplicity__Group_6__1 ;
    public final void rule__Multiplicity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2343:1: ( rule__Multiplicity__Group_6__0__Impl rule__Multiplicity__Group_6__1 )
            // InternalUmlTextual.g:2344:2: rule__Multiplicity__Group_6__0__Impl rule__Multiplicity__Group_6__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalUmlTextual.g:2351:1: rule__Multiplicity__Group_6__0__Impl : ( '1..' ) ;
    public final void rule__Multiplicity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2355:1: ( ( '1..' ) )
            // InternalUmlTextual.g:2356:1: ( '1..' )
            {
            // InternalUmlTextual.g:2356:1: ( '1..' )
            // InternalUmlTextual.g:2357:2: '1..'
            {
             before(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUmlTextual.g:2366:1: rule__Multiplicity__Group_6__1 : rule__Multiplicity__Group_6__1__Impl ;
    public final void rule__Multiplicity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2370:1: ( rule__Multiplicity__Group_6__1__Impl )
            // InternalUmlTextual.g:2371:2: rule__Multiplicity__Group_6__1__Impl
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
    // InternalUmlTextual.g:2377:1: rule__Multiplicity__Group_6__1__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2381:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2382:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2382:1: ( RULE_INT )
            // InternalUmlTextual.g:2383:2: RULE_INT
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
    // InternalUmlTextual.g:2393:1: rule__Multiplicity__Group_8__0 : rule__Multiplicity__Group_8__0__Impl rule__Multiplicity__Group_8__1 ;
    public final void rule__Multiplicity__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2397:1: ( rule__Multiplicity__Group_8__0__Impl rule__Multiplicity__Group_8__1 )
            // InternalUmlTextual.g:2398:2: rule__Multiplicity__Group_8__0__Impl rule__Multiplicity__Group_8__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalUmlTextual.g:2405:1: rule__Multiplicity__Group_8__0__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2409:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2410:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2410:1: ( RULE_INT )
            // InternalUmlTextual.g:2411:2: RULE_INT
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
    // InternalUmlTextual.g:2420:1: rule__Multiplicity__Group_8__1 : rule__Multiplicity__Group_8__1__Impl rule__Multiplicity__Group_8__2 ;
    public final void rule__Multiplicity__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2424:1: ( rule__Multiplicity__Group_8__1__Impl rule__Multiplicity__Group_8__2 )
            // InternalUmlTextual.g:2425:2: rule__Multiplicity__Group_8__1__Impl rule__Multiplicity__Group_8__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalUmlTextual.g:2432:1: rule__Multiplicity__Group_8__1__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2436:1: ( ( '..' ) )
            // InternalUmlTextual.g:2437:1: ( '..' )
            {
            // InternalUmlTextual.g:2437:1: ( '..' )
            // InternalUmlTextual.g:2438:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_8_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUmlTextual.g:2447:1: rule__Multiplicity__Group_8__2 : rule__Multiplicity__Group_8__2__Impl ;
    public final void rule__Multiplicity__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2451:1: ( rule__Multiplicity__Group_8__2__Impl )
            // InternalUmlTextual.g:2452:2: rule__Multiplicity__Group_8__2__Impl
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
    // InternalUmlTextual.g:2458:1: rule__Multiplicity__Group_8__2__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2462:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2463:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2463:1: ( RULE_INT )
            // InternalUmlTextual.g:2464:2: RULE_INT
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
    // InternalUmlTextual.g:2474:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2478:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUmlTextual.g:2479:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalUmlTextual.g:2486:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__VisibilityAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2490:1: ( ( ( rule__Attribute__VisibilityAssignment_0 )? ) )
            // InternalUmlTextual.g:2491:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            {
            // InternalUmlTextual.g:2491:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            // InternalUmlTextual.g:2492:2: ( rule__Attribute__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_0()); 
            // InternalUmlTextual.g:2493:2: ( rule__Attribute__VisibilityAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==15||(LA29_0>=17 && LA29_0<=19)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalUmlTextual.g:2493:3: rule__Attribute__VisibilityAssignment_0
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
    // InternalUmlTextual.g:2501:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2505:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUmlTextual.g:2506:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:2513:1: rule__Attribute__Group__1__Impl : ( 'attr' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2517:1: ( ( 'attr' ) )
            // InternalUmlTextual.g:2518:1: ( 'attr' )
            {
            // InternalUmlTextual.g:2518:1: ( 'attr' )
            // InternalUmlTextual.g:2519:2: 'attr'
            {
             before(grammarAccess.getAttributeAccess().getAttrKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUmlTextual.g:2528:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2532:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalUmlTextual.g:2533:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalUmlTextual.g:2540:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2544:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:2545:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:2545:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalUmlTextual.g:2546:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:2547:2: ( rule__Attribute__NameAssignment_2 )
            // InternalUmlTextual.g:2547:3: rule__Attribute__NameAssignment_2
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
    // InternalUmlTextual.g:2555:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2559:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalUmlTextual.g:2560:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalUmlTextual.g:2567:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2571:1: ( ( ':' ) )
            // InternalUmlTextual.g:2572:1: ( ':' )
            {
            // InternalUmlTextual.g:2572:1: ( ':' )
            // InternalUmlTextual.g:2573:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUmlTextual.g:2582:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2586:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalUmlTextual.g:2587:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalUmlTextual.g:2594:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2598:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalUmlTextual.g:2599:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalUmlTextual.g:2599:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalUmlTextual.g:2600:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalUmlTextual.g:2601:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalUmlTextual.g:2601:3: rule__Attribute__TypeAssignment_4
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
    // InternalUmlTextual.g:2609:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2613:1: ( rule__Attribute__Group__5__Impl )
            // InternalUmlTextual.g:2614:2: rule__Attribute__Group__5__Impl
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
    // InternalUmlTextual.g:2620:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2624:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalUmlTextual.g:2625:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalUmlTextual.g:2625:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalUmlTextual.g:2626:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalUmlTextual.g:2627:2: ( rule__Attribute__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUmlTextual.g:2627:3: rule__Attribute__Group_5__0
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
    // InternalUmlTextual.g:2636:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2640:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalUmlTextual.g:2641:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:2648:1: rule__Attribute__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2652:1: ( ( '[' ) )
            // InternalUmlTextual.g:2653:1: ( '[' )
            {
            // InternalUmlTextual.g:2653:1: ( '[' )
            // InternalUmlTextual.g:2654:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:2663:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2667:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalUmlTextual.g:2668:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:2675:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__MultiplicityAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2679:1: ( ( ( rule__Attribute__MultiplicityAssignment_5_1 ) ) )
            // InternalUmlTextual.g:2680:1: ( ( rule__Attribute__MultiplicityAssignment_5_1 ) )
            {
            // InternalUmlTextual.g:2680:1: ( ( rule__Attribute__MultiplicityAssignment_5_1 ) )
            // InternalUmlTextual.g:2681:2: ( rule__Attribute__MultiplicityAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_5_1()); 
            // InternalUmlTextual.g:2682:2: ( rule__Attribute__MultiplicityAssignment_5_1 )
            // InternalUmlTextual.g:2682:3: rule__Attribute__MultiplicityAssignment_5_1
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
    // InternalUmlTextual.g:2690:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2694:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalUmlTextual.g:2695:2: rule__Attribute__Group_5__2__Impl
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
    // InternalUmlTextual.g:2701:1: rule__Attribute__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2705:1: ( ( ']' ) )
            // InternalUmlTextual.g:2706:1: ( ']' )
            {
            // InternalUmlTextual.g:2706:1: ( ']' )
            // InternalUmlTextual.g:2707:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:2717:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2721:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalUmlTextual.g:2722:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:2729:1: rule__Method__Group__0__Impl : ( ( 'abstract' )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2733:1: ( ( ( 'abstract' )? ) )
            // InternalUmlTextual.g:2734:1: ( ( 'abstract' )? )
            {
            // InternalUmlTextual.g:2734:1: ( ( 'abstract' )? )
            // InternalUmlTextual.g:2735:2: ( 'abstract' )?
            {
             before(grammarAccess.getMethodAccess().getAbstractKeyword_0()); 
            // InternalUmlTextual.g:2736:2: ( 'abstract' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==11) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUmlTextual.g:2736:3: 'abstract'
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
    // InternalUmlTextual.g:2744:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2748:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalUmlTextual.g:2749:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:2756:1: rule__Method__Group__1__Impl : ( ( 'static' )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2760:1: ( ( ( 'static' )? ) )
            // InternalUmlTextual.g:2761:1: ( ( 'static' )? )
            {
            // InternalUmlTextual.g:2761:1: ( ( 'static' )? )
            // InternalUmlTextual.g:2762:2: ( 'static' )?
            {
             before(grammarAccess.getMethodAccess().getStaticKeyword_1()); 
            // InternalUmlTextual.g:2763:2: ( 'static' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUmlTextual.g:2763:3: 'static'
                    {
                    match(input,44,FOLLOW_2); 

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
    // InternalUmlTextual.g:2771:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2775:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalUmlTextual.g:2776:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:2783:1: rule__Method__Group__2__Impl : ( ( rule__Method__VisibilityAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2787:1: ( ( ( rule__Method__VisibilityAssignment_2 )? ) )
            // InternalUmlTextual.g:2788:1: ( ( rule__Method__VisibilityAssignment_2 )? )
            {
            // InternalUmlTextual.g:2788:1: ( ( rule__Method__VisibilityAssignment_2 )? )
            // InternalUmlTextual.g:2789:2: ( rule__Method__VisibilityAssignment_2 )?
            {
             before(grammarAccess.getMethodAccess().getVisibilityAssignment_2()); 
            // InternalUmlTextual.g:2790:2: ( rule__Method__VisibilityAssignment_2 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==15||(LA33_0>=17 && LA33_0<=19)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUmlTextual.g:2790:3: rule__Method__VisibilityAssignment_2
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
    // InternalUmlTextual.g:2798:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2802:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalUmlTextual.g:2803:2: rule__Method__Group__3__Impl rule__Method__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:2810:1: rule__Method__Group__3__Impl : ( 'function' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2814:1: ( ( 'function' ) )
            // InternalUmlTextual.g:2815:1: ( 'function' )
            {
            // InternalUmlTextual.g:2815:1: ( 'function' )
            // InternalUmlTextual.g:2816:2: 'function'
            {
             before(grammarAccess.getMethodAccess().getFunctionKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUmlTextual.g:2825:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2829:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalUmlTextual.g:2830:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalUmlTextual.g:2837:1: rule__Method__Group__4__Impl : ( ( rule__Method__NameAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2841:1: ( ( ( rule__Method__NameAssignment_4 ) ) )
            // InternalUmlTextual.g:2842:1: ( ( rule__Method__NameAssignment_4 ) )
            {
            // InternalUmlTextual.g:2842:1: ( ( rule__Method__NameAssignment_4 ) )
            // InternalUmlTextual.g:2843:2: ( rule__Method__NameAssignment_4 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_4()); 
            // InternalUmlTextual.g:2844:2: ( rule__Method__NameAssignment_4 )
            // InternalUmlTextual.g:2844:3: rule__Method__NameAssignment_4
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
    // InternalUmlTextual.g:2852:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2856:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalUmlTextual.g:2857:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalUmlTextual.g:2864:1: rule__Method__Group__5__Impl : ( '(' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2868:1: ( ( '(' ) )
            // InternalUmlTextual.g:2869:1: ( '(' )
            {
            // InternalUmlTextual.g:2869:1: ( '(' )
            // InternalUmlTextual.g:2870:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 
            match(input,46,FOLLOW_2); 
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
    // InternalUmlTextual.g:2879:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2883:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalUmlTextual.g:2884:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_33);
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
    // InternalUmlTextual.g:2891:1: rule__Method__Group__6__Impl : ( ( rule__Method__ParametersAssignment_6 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2895:1: ( ( ( rule__Method__ParametersAssignment_6 )? ) )
            // InternalUmlTextual.g:2896:1: ( ( rule__Method__ParametersAssignment_6 )? )
            {
            // InternalUmlTextual.g:2896:1: ( ( rule__Method__ParametersAssignment_6 )? )
            // InternalUmlTextual.g:2897:2: ( rule__Method__ParametersAssignment_6 )?
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6()); 
            // InternalUmlTextual.g:2898:2: ( rule__Method__ParametersAssignment_6 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUmlTextual.g:2898:3: rule__Method__ParametersAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__ParametersAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalUmlTextual.g:2906:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2910:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalUmlTextual.g:2911:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_33);
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
    // InternalUmlTextual.g:2918:1: rule__Method__Group__7__Impl : ( ( rule__Method__Group_7__0 )* ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2922:1: ( ( ( rule__Method__Group_7__0 )* ) )
            // InternalUmlTextual.g:2923:1: ( ( rule__Method__Group_7__0 )* )
            {
            // InternalUmlTextual.g:2923:1: ( ( rule__Method__Group_7__0 )* )
            // InternalUmlTextual.g:2924:2: ( rule__Method__Group_7__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_7()); 
            // InternalUmlTextual.g:2925:2: ( rule__Method__Group_7__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==33) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalUmlTextual.g:2925:3: rule__Method__Group_7__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Method__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalUmlTextual.g:2933:1: rule__Method__Group__8 : rule__Method__Group__8__Impl rule__Method__Group__9 ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2937:1: ( rule__Method__Group__8__Impl rule__Method__Group__9 )
            // InternalUmlTextual.g:2938:2: rule__Method__Group__8__Impl rule__Method__Group__9
            {
            pushFollow(FOLLOW_34);
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
    // InternalUmlTextual.g:2945:1: rule__Method__Group__8__Impl : ( ')' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2949:1: ( ( ')' ) )
            // InternalUmlTextual.g:2950:1: ( ')' )
            {
            // InternalUmlTextual.g:2950:1: ( ')' )
            // InternalUmlTextual.g:2951:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_8()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
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
    // InternalUmlTextual.g:2960:1: rule__Method__Group__9 : rule__Method__Group__9__Impl rule__Method__Group__10 ;
    public final void rule__Method__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2964:1: ( rule__Method__Group__9__Impl rule__Method__Group__10 )
            // InternalUmlTextual.g:2965:2: rule__Method__Group__9__Impl rule__Method__Group__10
            {
            pushFollow(FOLLOW_27);
            rule__Method__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__10();

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
    // InternalUmlTextual.g:2972:1: rule__Method__Group__9__Impl : ( '->' ) ;
    public final void rule__Method__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2976:1: ( ( '->' ) )
            // InternalUmlTextual.g:2977:1: ( '->' )
            {
            // InternalUmlTextual.g:2977:1: ( '->' )
            // InternalUmlTextual.g:2978:2: '->'
            {
             before(grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_9()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Method__Group__10"
    // InternalUmlTextual.g:2987:1: rule__Method__Group__10 : rule__Method__Group__10__Impl ;
    public final void rule__Method__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2991:1: ( rule__Method__Group__10__Impl )
            // InternalUmlTextual.g:2992:2: rule__Method__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__10__Impl();

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
    // $ANTLR end "rule__Method__Group__10"


    // $ANTLR start "rule__Method__Group__10__Impl"
    // InternalUmlTextual.g:2998:1: rule__Method__Group__10__Impl : ( ( rule__Method__ReturnTypeAssignment_10 ) ) ;
    public final void rule__Method__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3002:1: ( ( ( rule__Method__ReturnTypeAssignment_10 ) ) )
            // InternalUmlTextual.g:3003:1: ( ( rule__Method__ReturnTypeAssignment_10 ) )
            {
            // InternalUmlTextual.g:3003:1: ( ( rule__Method__ReturnTypeAssignment_10 ) )
            // InternalUmlTextual.g:3004:2: ( rule__Method__ReturnTypeAssignment_10 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_10()); 
            // InternalUmlTextual.g:3005:2: ( rule__Method__ReturnTypeAssignment_10 )
            // InternalUmlTextual.g:3005:3: rule__Method__ReturnTypeAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Method__ReturnTypeAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getReturnTypeAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group__10__Impl"


    // $ANTLR start "rule__Method__Group_7__0"
    // InternalUmlTextual.g:3014:1: rule__Method__Group_7__0 : rule__Method__Group_7__0__Impl rule__Method__Group_7__1 ;
    public final void rule__Method__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3018:1: ( rule__Method__Group_7__0__Impl rule__Method__Group_7__1 )
            // InternalUmlTextual.g:3019:2: rule__Method__Group_7__0__Impl rule__Method__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Method__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_7__1();

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
    // $ANTLR end "rule__Method__Group_7__0"


    // $ANTLR start "rule__Method__Group_7__0__Impl"
    // InternalUmlTextual.g:3026:1: rule__Method__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3030:1: ( ( ',' ) )
            // InternalUmlTextual.g:3031:1: ( ',' )
            {
            // InternalUmlTextual.g:3031:1: ( ',' )
            // InternalUmlTextual.g:3032:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_7_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_7__0__Impl"


    // $ANTLR start "rule__Method__Group_7__1"
    // InternalUmlTextual.g:3041:1: rule__Method__Group_7__1 : rule__Method__Group_7__1__Impl ;
    public final void rule__Method__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3045:1: ( rule__Method__Group_7__1__Impl )
            // InternalUmlTextual.g:3046:2: rule__Method__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_7__1__Impl();

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
    // $ANTLR end "rule__Method__Group_7__1"


    // $ANTLR start "rule__Method__Group_7__1__Impl"
    // InternalUmlTextual.g:3052:1: rule__Method__Group_7__1__Impl : ( ( rule__Method__ParametersAssignment_7_1 ) ) ;
    public final void rule__Method__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3056:1: ( ( ( rule__Method__ParametersAssignment_7_1 ) ) )
            // InternalUmlTextual.g:3057:1: ( ( rule__Method__ParametersAssignment_7_1 ) )
            {
            // InternalUmlTextual.g:3057:1: ( ( rule__Method__ParametersAssignment_7_1 ) )
            // InternalUmlTextual.g:3058:2: ( rule__Method__ParametersAssignment_7_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_7_1()); 
            // InternalUmlTextual.g:3059:2: ( rule__Method__ParametersAssignment_7_1 )
            // InternalUmlTextual.g:3059:3: rule__Method__ParametersAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_7__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalUmlTextual.g:3068:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3072:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalUmlTextual.g:3073:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalUmlTextual.g:3080:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3084:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalUmlTextual.g:3085:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalUmlTextual.g:3085:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalUmlTextual.g:3086:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalUmlTextual.g:3087:2: ( rule__Parameter__NameAssignment_0 )
            // InternalUmlTextual.g:3087:3: rule__Parameter__NameAssignment_0
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
    // InternalUmlTextual.g:3095:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3099:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalUmlTextual.g:3100:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalUmlTextual.g:3107:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3111:1: ( ( ':' ) )
            // InternalUmlTextual.g:3112:1: ( ':' )
            {
            // InternalUmlTextual.g:3112:1: ( ':' )
            // InternalUmlTextual.g:3113:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUmlTextual.g:3122:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3126:1: ( rule__Parameter__Group__2__Impl )
            // InternalUmlTextual.g:3127:2: rule__Parameter__Group__2__Impl
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
    // InternalUmlTextual.g:3133:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__ParameterTypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3137:1: ( ( ( rule__Parameter__ParameterTypeAssignment_2 ) ) )
            // InternalUmlTextual.g:3138:1: ( ( rule__Parameter__ParameterTypeAssignment_2 ) )
            {
            // InternalUmlTextual.g:3138:1: ( ( rule__Parameter__ParameterTypeAssignment_2 ) )
            // InternalUmlTextual.g:3139:2: ( rule__Parameter__ParameterTypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getParameterTypeAssignment_2()); 
            // InternalUmlTextual.g:3140:2: ( rule__Parameter__ParameterTypeAssignment_2 )
            // InternalUmlTextual.g:3140:3: rule__Parameter__ParameterTypeAssignment_2
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
    // InternalUmlTextual.g:3149:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3153:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalUmlTextual.g:3154:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalUmlTextual.g:3161:1: rule__Association__Group__0__Impl : ( ( 'undirected' )? ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3165:1: ( ( ( 'undirected' )? ) )
            // InternalUmlTextual.g:3166:1: ( ( 'undirected' )? )
            {
            // InternalUmlTextual.g:3166:1: ( ( 'undirected' )? )
            // InternalUmlTextual.g:3167:2: ( 'undirected' )?
            {
             before(grammarAccess.getAssociationAccess().getUndirectedKeyword_0()); 
            // InternalUmlTextual.g:3168:2: ( 'undirected' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalUmlTextual.g:3168:3: 'undirected'
                    {
                    match(input,49,FOLLOW_2); 

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
    // InternalUmlTextual.g:3176:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3180:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalUmlTextual.g:3181:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalUmlTextual.g:3188:1: rule__Association__Group__1__Impl : ( 'association' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3192:1: ( ( 'association' ) )
            // InternalUmlTextual.g:3193:1: ( 'association' )
            {
            // InternalUmlTextual.g:3193:1: ( 'association' )
            // InternalUmlTextual.g:3194:2: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalUmlTextual.g:3203:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3207:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalUmlTextual.g:3208:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalUmlTextual.g:3215:1: rule__Association__Group__2__Impl : ( ( rule__Association__NameAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3219:1: ( ( ( rule__Association__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:3220:1: ( ( rule__Association__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:3220:1: ( ( rule__Association__NameAssignment_2 ) )
            // InternalUmlTextual.g:3221:2: ( rule__Association__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:3222:2: ( rule__Association__NameAssignment_2 )
            // InternalUmlTextual.g:3222:3: rule__Association__NameAssignment_2
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
    // InternalUmlTextual.g:3230:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3234:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalUmlTextual.g:3235:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalUmlTextual.g:3242:1: rule__Association__Group__3__Impl : ( '{' ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3246:1: ( ( '{' ) )
            // InternalUmlTextual.g:3247:1: ( '{' )
            {
            // InternalUmlTextual.g:3247:1: ( '{' )
            // InternalUmlTextual.g:3248:2: '{'
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
    // InternalUmlTextual.g:3257:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3261:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalUmlTextual.g:3262:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:3269:1: rule__Association__Group__4__Impl : ( 'from' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3273:1: ( ( 'from' ) )
            // InternalUmlTextual.g:3274:1: ( 'from' )
            {
            // InternalUmlTextual.g:3274:1: ( 'from' )
            // InternalUmlTextual.g:3275:2: 'from'
            {
             before(grammarAccess.getAssociationAccess().getFromKeyword_4()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUmlTextual.g:3284:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3288:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalUmlTextual.g:3289:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:3296:1: rule__Association__Group__5__Impl : ( ( rule__Association__Navigation1Assignment_5 )? ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3300:1: ( ( ( rule__Association__Navigation1Assignment_5 )? ) )
            // InternalUmlTextual.g:3301:1: ( ( rule__Association__Navigation1Assignment_5 )? )
            {
            // InternalUmlTextual.g:3301:1: ( ( rule__Association__Navigation1Assignment_5 )? )
            // InternalUmlTextual.g:3302:2: ( rule__Association__Navigation1Assignment_5 )?
            {
             before(grammarAccess.getAssociationAccess().getNavigation1Assignment_5()); 
            // InternalUmlTextual.g:3303:2: ( rule__Association__Navigation1Assignment_5 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUmlTextual.g:3303:3: rule__Association__Navigation1Assignment_5
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
    // InternalUmlTextual.g:3311:1: rule__Association__Group__6 : rule__Association__Group__6__Impl rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3315:1: ( rule__Association__Group__6__Impl rule__Association__Group__7 )
            // InternalUmlTextual.g:3316:2: rule__Association__Group__6__Impl rule__Association__Group__7
            {
            pushFollow(FOLLOW_28);
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
    // InternalUmlTextual.g:3323:1: rule__Association__Group__6__Impl : ( ( rule__Association__Class1Assignment_6 ) ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3327:1: ( ( ( rule__Association__Class1Assignment_6 ) ) )
            // InternalUmlTextual.g:3328:1: ( ( rule__Association__Class1Assignment_6 ) )
            {
            // InternalUmlTextual.g:3328:1: ( ( rule__Association__Class1Assignment_6 ) )
            // InternalUmlTextual.g:3329:2: ( rule__Association__Class1Assignment_6 )
            {
             before(grammarAccess.getAssociationAccess().getClass1Assignment_6()); 
            // InternalUmlTextual.g:3330:2: ( rule__Association__Class1Assignment_6 )
            // InternalUmlTextual.g:3330:3: rule__Association__Class1Assignment_6
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
    // InternalUmlTextual.g:3338:1: rule__Association__Group__7 : rule__Association__Group__7__Impl rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3342:1: ( rule__Association__Group__7__Impl rule__Association__Group__8 )
            // InternalUmlTextual.g:3343:2: rule__Association__Group__7__Impl rule__Association__Group__8
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:3350:1: rule__Association__Group__7__Impl : ( '[' ) ;
    public final void rule__Association__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3354:1: ( ( '[' ) )
            // InternalUmlTextual.g:3355:1: ( '[' )
            {
            // InternalUmlTextual.g:3355:1: ( '[' )
            // InternalUmlTextual.g:3356:2: '['
            {
             before(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_7()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:3365:1: rule__Association__Group__8 : rule__Association__Group__8__Impl rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3369:1: ( rule__Association__Group__8__Impl rule__Association__Group__9 )
            // InternalUmlTextual.g:3370:2: rule__Association__Group__8__Impl rule__Association__Group__9
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:3377:1: rule__Association__Group__8__Impl : ( ( rule__Association__Multiplicity1Assignment_8 ) ) ;
    public final void rule__Association__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3381:1: ( ( ( rule__Association__Multiplicity1Assignment_8 ) ) )
            // InternalUmlTextual.g:3382:1: ( ( rule__Association__Multiplicity1Assignment_8 ) )
            {
            // InternalUmlTextual.g:3382:1: ( ( rule__Association__Multiplicity1Assignment_8 ) )
            // InternalUmlTextual.g:3383:2: ( rule__Association__Multiplicity1Assignment_8 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicity1Assignment_8()); 
            // InternalUmlTextual.g:3384:2: ( rule__Association__Multiplicity1Assignment_8 )
            // InternalUmlTextual.g:3384:3: rule__Association__Multiplicity1Assignment_8
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
    // InternalUmlTextual.g:3392:1: rule__Association__Group__9 : rule__Association__Group__9__Impl rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3396:1: ( rule__Association__Group__9__Impl rule__Association__Group__10 )
            // InternalUmlTextual.g:3397:2: rule__Association__Group__9__Impl rule__Association__Group__10
            {
            pushFollow(FOLLOW_40);
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
    // InternalUmlTextual.g:3404:1: rule__Association__Group__9__Impl : ( ']' ) ;
    public final void rule__Association__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3408:1: ( ( ']' ) )
            // InternalUmlTextual.g:3409:1: ( ']' )
            {
            // InternalUmlTextual.g:3409:1: ( ']' )
            // InternalUmlTextual.g:3410:2: ']'
            {
             before(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_9()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:3419:1: rule__Association__Group__10 : rule__Association__Group__10__Impl rule__Association__Group__11 ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3423:1: ( rule__Association__Group__10__Impl rule__Association__Group__11 )
            // InternalUmlTextual.g:3424:2: rule__Association__Group__10__Impl rule__Association__Group__11
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:3431:1: rule__Association__Group__10__Impl : ( 'to' ) ;
    public final void rule__Association__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3435:1: ( ( 'to' ) )
            // InternalUmlTextual.g:3436:1: ( 'to' )
            {
            // InternalUmlTextual.g:3436:1: ( 'to' )
            // InternalUmlTextual.g:3437:2: 'to'
            {
             before(grammarAccess.getAssociationAccess().getToKeyword_10()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUmlTextual.g:3446:1: rule__Association__Group__11 : rule__Association__Group__11__Impl rule__Association__Group__12 ;
    public final void rule__Association__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3450:1: ( rule__Association__Group__11__Impl rule__Association__Group__12 )
            // InternalUmlTextual.g:3451:2: rule__Association__Group__11__Impl rule__Association__Group__12
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:3458:1: rule__Association__Group__11__Impl : ( ( rule__Association__Navigation2Assignment_11 )? ) ;
    public final void rule__Association__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3462:1: ( ( ( rule__Association__Navigation2Assignment_11 )? ) )
            // InternalUmlTextual.g:3463:1: ( ( rule__Association__Navigation2Assignment_11 )? )
            {
            // InternalUmlTextual.g:3463:1: ( ( rule__Association__Navigation2Assignment_11 )? )
            // InternalUmlTextual.g:3464:2: ( rule__Association__Navigation2Assignment_11 )?
            {
             before(grammarAccess.getAssociationAccess().getNavigation2Assignment_11()); 
            // InternalUmlTextual.g:3465:2: ( rule__Association__Navigation2Assignment_11 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==14) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUmlTextual.g:3465:3: rule__Association__Navigation2Assignment_11
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
    // InternalUmlTextual.g:3473:1: rule__Association__Group__12 : rule__Association__Group__12__Impl rule__Association__Group__13 ;
    public final void rule__Association__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3477:1: ( rule__Association__Group__12__Impl rule__Association__Group__13 )
            // InternalUmlTextual.g:3478:2: rule__Association__Group__12__Impl rule__Association__Group__13
            {
            pushFollow(FOLLOW_28);
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
    // InternalUmlTextual.g:3485:1: rule__Association__Group__12__Impl : ( ( rule__Association__Class2Assignment_12 ) ) ;
    public final void rule__Association__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3489:1: ( ( ( rule__Association__Class2Assignment_12 ) ) )
            // InternalUmlTextual.g:3490:1: ( ( rule__Association__Class2Assignment_12 ) )
            {
            // InternalUmlTextual.g:3490:1: ( ( rule__Association__Class2Assignment_12 ) )
            // InternalUmlTextual.g:3491:2: ( rule__Association__Class2Assignment_12 )
            {
             before(grammarAccess.getAssociationAccess().getClass2Assignment_12()); 
            // InternalUmlTextual.g:3492:2: ( rule__Association__Class2Assignment_12 )
            // InternalUmlTextual.g:3492:3: rule__Association__Class2Assignment_12
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
    // InternalUmlTextual.g:3500:1: rule__Association__Group__13 : rule__Association__Group__13__Impl rule__Association__Group__14 ;
    public final void rule__Association__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3504:1: ( rule__Association__Group__13__Impl rule__Association__Group__14 )
            // InternalUmlTextual.g:3505:2: rule__Association__Group__13__Impl rule__Association__Group__14
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:3512:1: rule__Association__Group__13__Impl : ( '[' ) ;
    public final void rule__Association__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3516:1: ( ( '[' ) )
            // InternalUmlTextual.g:3517:1: ( '[' )
            {
            // InternalUmlTextual.g:3517:1: ( '[' )
            // InternalUmlTextual.g:3518:2: '['
            {
             before(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_13()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:3527:1: rule__Association__Group__14 : rule__Association__Group__14__Impl rule__Association__Group__15 ;
    public final void rule__Association__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3531:1: ( rule__Association__Group__14__Impl rule__Association__Group__15 )
            // InternalUmlTextual.g:3532:2: rule__Association__Group__14__Impl rule__Association__Group__15
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:3539:1: rule__Association__Group__14__Impl : ( ( rule__Association__Multiplicity2Assignment_14 ) ) ;
    public final void rule__Association__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3543:1: ( ( ( rule__Association__Multiplicity2Assignment_14 ) ) )
            // InternalUmlTextual.g:3544:1: ( ( rule__Association__Multiplicity2Assignment_14 ) )
            {
            // InternalUmlTextual.g:3544:1: ( ( rule__Association__Multiplicity2Assignment_14 ) )
            // InternalUmlTextual.g:3545:2: ( rule__Association__Multiplicity2Assignment_14 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicity2Assignment_14()); 
            // InternalUmlTextual.g:3546:2: ( rule__Association__Multiplicity2Assignment_14 )
            // InternalUmlTextual.g:3546:3: rule__Association__Multiplicity2Assignment_14
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
    // InternalUmlTextual.g:3554:1: rule__Association__Group__15 : rule__Association__Group__15__Impl rule__Association__Group__16 ;
    public final void rule__Association__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3558:1: ( rule__Association__Group__15__Impl rule__Association__Group__16 )
            // InternalUmlTextual.g:3559:2: rule__Association__Group__15__Impl rule__Association__Group__16
            {
            pushFollow(FOLLOW_41);
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
    // InternalUmlTextual.g:3566:1: rule__Association__Group__15__Impl : ( ']' ) ;
    public final void rule__Association__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3570:1: ( ( ']' ) )
            // InternalUmlTextual.g:3571:1: ( ']' )
            {
            // InternalUmlTextual.g:3571:1: ( ']' )
            // InternalUmlTextual.g:3572:2: ']'
            {
             before(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_15()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:3581:1: rule__Association__Group__16 : rule__Association__Group__16__Impl rule__Association__Group__17 ;
    public final void rule__Association__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3585:1: ( rule__Association__Group__16__Impl rule__Association__Group__17 )
            // InternalUmlTextual.g:3586:2: rule__Association__Group__16__Impl rule__Association__Group__17
            {
            pushFollow(FOLLOW_41);
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
    // InternalUmlTextual.g:3593:1: rule__Association__Group__16__Impl : ( ( rule__Association__Group_16__0 )? ) ;
    public final void rule__Association__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3597:1: ( ( ( rule__Association__Group_16__0 )? ) )
            // InternalUmlTextual.g:3598:1: ( ( rule__Association__Group_16__0 )? )
            {
            // InternalUmlTextual.g:3598:1: ( ( rule__Association__Group_16__0 )? )
            // InternalUmlTextual.g:3599:2: ( rule__Association__Group_16__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_16()); 
            // InternalUmlTextual.g:3600:2: ( rule__Association__Group_16__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==53) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUmlTextual.g:3600:3: rule__Association__Group_16__0
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
    // InternalUmlTextual.g:3608:1: rule__Association__Group__17 : rule__Association__Group__17__Impl ;
    public final void rule__Association__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3612:1: ( rule__Association__Group__17__Impl )
            // InternalUmlTextual.g:3613:2: rule__Association__Group__17__Impl
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
    // InternalUmlTextual.g:3619:1: rule__Association__Group__17__Impl : ( '}' ) ;
    public final void rule__Association__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3623:1: ( ( '}' ) )
            // InternalUmlTextual.g:3624:1: ( '}' )
            {
            // InternalUmlTextual.g:3624:1: ( '}' )
            // InternalUmlTextual.g:3625:2: '}'
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
    // InternalUmlTextual.g:3635:1: rule__Association__Group_16__0 : rule__Association__Group_16__0__Impl rule__Association__Group_16__1 ;
    public final void rule__Association__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3639:1: ( rule__Association__Group_16__0__Impl rule__Association__Group_16__1 )
            // InternalUmlTextual.g:3640:2: rule__Association__Group_16__0__Impl rule__Association__Group_16__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalUmlTextual.g:3647:1: rule__Association__Group_16__0__Impl : ( 'with' ) ;
    public final void rule__Association__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3651:1: ( ( 'with' ) )
            // InternalUmlTextual.g:3652:1: ( 'with' )
            {
            // InternalUmlTextual.g:3652:1: ( 'with' )
            // InternalUmlTextual.g:3653:2: 'with'
            {
             before(grammarAccess.getAssociationAccess().getWithKeyword_16_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getWithKeyword_16_0()); 

            }


            }

        }
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
    // InternalUmlTextual.g:3662:1: rule__Association__Group_16__1 : rule__Association__Group_16__1__Impl rule__Association__Group_16__2 ;
    public final void rule__Association__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3666:1: ( rule__Association__Group_16__1__Impl rule__Association__Group_16__2 )
            // InternalUmlTextual.g:3667:2: rule__Association__Group_16__1__Impl rule__Association__Group_16__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:3674:1: rule__Association__Group_16__1__Impl : ( 'associatedclass' ) ;
    public final void rule__Association__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3678:1: ( ( 'associatedclass' ) )
            // InternalUmlTextual.g:3679:1: ( 'associatedclass' )
            {
            // InternalUmlTextual.g:3679:1: ( 'associatedclass' )
            // InternalUmlTextual.g:3680:2: 'associatedclass'
            {
             before(grammarAccess.getAssociationAccess().getAssociatedclassKeyword_16_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getAssociatedclassKeyword_16_1()); 

            }


            }

        }
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
    // InternalUmlTextual.g:3689:1: rule__Association__Group_16__2 : rule__Association__Group_16__2__Impl ;
    public final void rule__Association__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3693:1: ( rule__Association__Group_16__2__Impl )
            // InternalUmlTextual.g:3694:2: rule__Association__Group_16__2__Impl
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
    // InternalUmlTextual.g:3700:1: rule__Association__Group_16__2__Impl : ( ( rule__Association__ClassAssignment_16_2 ) ) ;
    public final void rule__Association__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3704:1: ( ( ( rule__Association__ClassAssignment_16_2 ) ) )
            // InternalUmlTextual.g:3705:1: ( ( rule__Association__ClassAssignment_16_2 ) )
            {
            // InternalUmlTextual.g:3705:1: ( ( rule__Association__ClassAssignment_16_2 ) )
            // InternalUmlTextual.g:3706:2: ( rule__Association__ClassAssignment_16_2 )
            {
             before(grammarAccess.getAssociationAccess().getClassAssignment_16_2()); 
            // InternalUmlTextual.g:3707:2: ( rule__Association__ClassAssignment_16_2 )
            // InternalUmlTextual.g:3707:3: rule__Association__ClassAssignment_16_2
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
    // InternalUmlTextual.g:3716:1: rule__Aggregation__Group__0 : rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1 ;
    public final void rule__Aggregation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3720:1: ( rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1 )
            // InternalUmlTextual.g:3721:2: rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalUmlTextual.g:3728:1: rule__Aggregation__Group__0__Impl : ( 'aggregation' ) ;
    public final void rule__Aggregation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3732:1: ( ( 'aggregation' ) )
            // InternalUmlTextual.g:3733:1: ( 'aggregation' )
            {
            // InternalUmlTextual.g:3733:1: ( 'aggregation' )
            // InternalUmlTextual.g:3734:2: 'aggregation'
            {
             before(grammarAccess.getAggregationAccess().getAggregationKeyword_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalUmlTextual.g:3743:1: rule__Aggregation__Group__1 : rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2 ;
    public final void rule__Aggregation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3747:1: ( rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2 )
            // InternalUmlTextual.g:3748:2: rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalUmlTextual.g:3755:1: rule__Aggregation__Group__1__Impl : ( ( rule__Aggregation__NameAssignment_1 ) ) ;
    public final void rule__Aggregation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3759:1: ( ( ( rule__Aggregation__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:3760:1: ( ( rule__Aggregation__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:3760:1: ( ( rule__Aggregation__NameAssignment_1 ) )
            // InternalUmlTextual.g:3761:2: ( rule__Aggregation__NameAssignment_1 )
            {
             before(grammarAccess.getAggregationAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:3762:2: ( rule__Aggregation__NameAssignment_1 )
            // InternalUmlTextual.g:3762:3: rule__Aggregation__NameAssignment_1
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
    // InternalUmlTextual.g:3770:1: rule__Aggregation__Group__2 : rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3 ;
    public final void rule__Aggregation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3774:1: ( rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3 )
            // InternalUmlTextual.g:3775:2: rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalUmlTextual.g:3782:1: rule__Aggregation__Group__2__Impl : ( '{' ) ;
    public final void rule__Aggregation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3786:1: ( ( '{' ) )
            // InternalUmlTextual.g:3787:1: ( '{' )
            {
            // InternalUmlTextual.g:3787:1: ( '{' )
            // InternalUmlTextual.g:3788:2: '{'
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
    // InternalUmlTextual.g:3797:1: rule__Aggregation__Group__3 : rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4 ;
    public final void rule__Aggregation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3801:1: ( rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4 )
            // InternalUmlTextual.g:3802:2: rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:3809:1: rule__Aggregation__Group__3__Impl : ( 'from' ) ;
    public final void rule__Aggregation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3813:1: ( ( 'from' ) )
            // InternalUmlTextual.g:3814:1: ( 'from' )
            {
            // InternalUmlTextual.g:3814:1: ( 'from' )
            // InternalUmlTextual.g:3815:2: 'from'
            {
             before(grammarAccess.getAggregationAccess().getFromKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUmlTextual.g:3824:1: rule__Aggregation__Group__4 : rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5 ;
    public final void rule__Aggregation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3828:1: ( rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5 )
            // InternalUmlTextual.g:3829:2: rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalUmlTextual.g:3836:1: rule__Aggregation__Group__4__Impl : ( ( rule__Aggregation__Class1Assignment_4 ) ) ;
    public final void rule__Aggregation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3840:1: ( ( ( rule__Aggregation__Class1Assignment_4 ) ) )
            // InternalUmlTextual.g:3841:1: ( ( rule__Aggregation__Class1Assignment_4 ) )
            {
            // InternalUmlTextual.g:3841:1: ( ( rule__Aggregation__Class1Assignment_4 ) )
            // InternalUmlTextual.g:3842:2: ( rule__Aggregation__Class1Assignment_4 )
            {
             before(grammarAccess.getAggregationAccess().getClass1Assignment_4()); 
            // InternalUmlTextual.g:3843:2: ( rule__Aggregation__Class1Assignment_4 )
            // InternalUmlTextual.g:3843:3: rule__Aggregation__Class1Assignment_4
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
    // InternalUmlTextual.g:3851:1: rule__Aggregation__Group__5 : rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6 ;
    public final void rule__Aggregation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3855:1: ( rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6 )
            // InternalUmlTextual.g:3856:2: rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:3863:1: rule__Aggregation__Group__5__Impl : ( '[' ) ;
    public final void rule__Aggregation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3867:1: ( ( '[' ) )
            // InternalUmlTextual.g:3868:1: ( '[' )
            {
            // InternalUmlTextual.g:3868:1: ( '[' )
            // InternalUmlTextual.g:3869:2: '['
            {
             before(grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_5()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:3878:1: rule__Aggregation__Group__6 : rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7 ;
    public final void rule__Aggregation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3882:1: ( rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7 )
            // InternalUmlTextual.g:3883:2: rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:3890:1: rule__Aggregation__Group__6__Impl : ( ( rule__Aggregation__Multiplicity1Assignment_6 ) ) ;
    public final void rule__Aggregation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3894:1: ( ( ( rule__Aggregation__Multiplicity1Assignment_6 ) ) )
            // InternalUmlTextual.g:3895:1: ( ( rule__Aggregation__Multiplicity1Assignment_6 ) )
            {
            // InternalUmlTextual.g:3895:1: ( ( rule__Aggregation__Multiplicity1Assignment_6 ) )
            // InternalUmlTextual.g:3896:2: ( rule__Aggregation__Multiplicity1Assignment_6 )
            {
             before(grammarAccess.getAggregationAccess().getMultiplicity1Assignment_6()); 
            // InternalUmlTextual.g:3897:2: ( rule__Aggregation__Multiplicity1Assignment_6 )
            // InternalUmlTextual.g:3897:3: rule__Aggregation__Multiplicity1Assignment_6
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
    // InternalUmlTextual.g:3905:1: rule__Aggregation__Group__7 : rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8 ;
    public final void rule__Aggregation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3909:1: ( rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8 )
            // InternalUmlTextual.g:3910:2: rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8
            {
            pushFollow(FOLLOW_40);
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
    // InternalUmlTextual.g:3917:1: rule__Aggregation__Group__7__Impl : ( ']' ) ;
    public final void rule__Aggregation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3921:1: ( ( ']' ) )
            // InternalUmlTextual.g:3922:1: ( ']' )
            {
            // InternalUmlTextual.g:3922:1: ( ']' )
            // InternalUmlTextual.g:3923:2: ']'
            {
             before(grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_7()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:3932:1: rule__Aggregation__Group__8 : rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9 ;
    public final void rule__Aggregation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3936:1: ( rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9 )
            // InternalUmlTextual.g:3937:2: rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:3944:1: rule__Aggregation__Group__8__Impl : ( 'to' ) ;
    public final void rule__Aggregation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3948:1: ( ( 'to' ) )
            // InternalUmlTextual.g:3949:1: ( 'to' )
            {
            // InternalUmlTextual.g:3949:1: ( 'to' )
            // InternalUmlTextual.g:3950:2: 'to'
            {
             before(grammarAccess.getAggregationAccess().getToKeyword_8()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUmlTextual.g:3959:1: rule__Aggregation__Group__9 : rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10 ;
    public final void rule__Aggregation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3963:1: ( rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10 )
            // InternalUmlTextual.g:3964:2: rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:3971:1: rule__Aggregation__Group__9__Impl : ( ( rule__Aggregation__NavigationAssignment_9 )? ) ;
    public final void rule__Aggregation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3975:1: ( ( ( rule__Aggregation__NavigationAssignment_9 )? ) )
            // InternalUmlTextual.g:3976:1: ( ( rule__Aggregation__NavigationAssignment_9 )? )
            {
            // InternalUmlTextual.g:3976:1: ( ( rule__Aggregation__NavigationAssignment_9 )? )
            // InternalUmlTextual.g:3977:2: ( rule__Aggregation__NavigationAssignment_9 )?
            {
             before(grammarAccess.getAggregationAccess().getNavigationAssignment_9()); 
            // InternalUmlTextual.g:3978:2: ( rule__Aggregation__NavigationAssignment_9 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==14) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUmlTextual.g:3978:3: rule__Aggregation__NavigationAssignment_9
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
    // InternalUmlTextual.g:3986:1: rule__Aggregation__Group__10 : rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11 ;
    public final void rule__Aggregation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3990:1: ( rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11 )
            // InternalUmlTextual.g:3991:2: rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11
            {
            pushFollow(FOLLOW_28);
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
    // InternalUmlTextual.g:3998:1: rule__Aggregation__Group__10__Impl : ( ( rule__Aggregation__Class2Assignment_10 ) ) ;
    public final void rule__Aggregation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4002:1: ( ( ( rule__Aggregation__Class2Assignment_10 ) ) )
            // InternalUmlTextual.g:4003:1: ( ( rule__Aggregation__Class2Assignment_10 ) )
            {
            // InternalUmlTextual.g:4003:1: ( ( rule__Aggregation__Class2Assignment_10 ) )
            // InternalUmlTextual.g:4004:2: ( rule__Aggregation__Class2Assignment_10 )
            {
             before(grammarAccess.getAggregationAccess().getClass2Assignment_10()); 
            // InternalUmlTextual.g:4005:2: ( rule__Aggregation__Class2Assignment_10 )
            // InternalUmlTextual.g:4005:3: rule__Aggregation__Class2Assignment_10
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
    // InternalUmlTextual.g:4013:1: rule__Aggregation__Group__11 : rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12 ;
    public final void rule__Aggregation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4017:1: ( rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12 )
            // InternalUmlTextual.g:4018:2: rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:4025:1: rule__Aggregation__Group__11__Impl : ( '[' ) ;
    public final void rule__Aggregation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4029:1: ( ( '[' ) )
            // InternalUmlTextual.g:4030:1: ( '[' )
            {
            // InternalUmlTextual.g:4030:1: ( '[' )
            // InternalUmlTextual.g:4031:2: '['
            {
             before(grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_11()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:4040:1: rule__Aggregation__Group__12 : rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13 ;
    public final void rule__Aggregation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4044:1: ( rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13 )
            // InternalUmlTextual.g:4045:2: rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:4052:1: rule__Aggregation__Group__12__Impl : ( ( rule__Aggregation__Multiplicity2Assignment_12 ) ) ;
    public final void rule__Aggregation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4056:1: ( ( ( rule__Aggregation__Multiplicity2Assignment_12 ) ) )
            // InternalUmlTextual.g:4057:1: ( ( rule__Aggregation__Multiplicity2Assignment_12 ) )
            {
            // InternalUmlTextual.g:4057:1: ( ( rule__Aggregation__Multiplicity2Assignment_12 ) )
            // InternalUmlTextual.g:4058:2: ( rule__Aggregation__Multiplicity2Assignment_12 )
            {
             before(grammarAccess.getAggregationAccess().getMultiplicity2Assignment_12()); 
            // InternalUmlTextual.g:4059:2: ( rule__Aggregation__Multiplicity2Assignment_12 )
            // InternalUmlTextual.g:4059:3: rule__Aggregation__Multiplicity2Assignment_12
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
    // InternalUmlTextual.g:4067:1: rule__Aggregation__Group__13 : rule__Aggregation__Group__13__Impl rule__Aggregation__Group__14 ;
    public final void rule__Aggregation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4071:1: ( rule__Aggregation__Group__13__Impl rule__Aggregation__Group__14 )
            // InternalUmlTextual.g:4072:2: rule__Aggregation__Group__13__Impl rule__Aggregation__Group__14
            {
            pushFollow(FOLLOW_43);
            rule__Aggregation__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__14();

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
    // InternalUmlTextual.g:4079:1: rule__Aggregation__Group__13__Impl : ( ']' ) ;
    public final void rule__Aggregation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4083:1: ( ( ']' ) )
            // InternalUmlTextual.g:4084:1: ( ']' )
            {
            // InternalUmlTextual.g:4084:1: ( ']' )
            // InternalUmlTextual.g:4085:2: ']'
            {
             before(grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_13()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__Aggregation__Group__14"
    // InternalUmlTextual.g:4094:1: rule__Aggregation__Group__14 : rule__Aggregation__Group__14__Impl ;
    public final void rule__Aggregation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4098:1: ( rule__Aggregation__Group__14__Impl )
            // InternalUmlTextual.g:4099:2: rule__Aggregation__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aggregation__Group__14__Impl();

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
    // $ANTLR end "rule__Aggregation__Group__14"


    // $ANTLR start "rule__Aggregation__Group__14__Impl"
    // InternalUmlTextual.g:4105:1: rule__Aggregation__Group__14__Impl : ( '}' ) ;
    public final void rule__Aggregation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4109:1: ( ( '}' ) )
            // InternalUmlTextual.g:4110:1: ( '}' )
            {
            // InternalUmlTextual.g:4110:1: ( '}' )
            // InternalUmlTextual.g:4111:2: '}'
            {
             before(grammarAccess.getAggregationAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAggregationAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aggregation__Group__14__Impl"


    // $ANTLR start "rule__Composition__Group__0"
    // InternalUmlTextual.g:4121:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4125:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalUmlTextual.g:4126:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalUmlTextual.g:4133:1: rule__Composition__Group__0__Impl : ( 'composition' ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4137:1: ( ( 'composition' ) )
            // InternalUmlTextual.g:4138:1: ( 'composition' )
            {
            // InternalUmlTextual.g:4138:1: ( 'composition' )
            // InternalUmlTextual.g:4139:2: 'composition'
            {
             before(grammarAccess.getCompositionAccess().getCompositionKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUmlTextual.g:4148:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4152:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalUmlTextual.g:4153:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalUmlTextual.g:4160:1: rule__Composition__Group__1__Impl : ( ( rule__Composition__NameAssignment_1 ) ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4164:1: ( ( ( rule__Composition__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:4165:1: ( ( rule__Composition__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:4165:1: ( ( rule__Composition__NameAssignment_1 ) )
            // InternalUmlTextual.g:4166:2: ( rule__Composition__NameAssignment_1 )
            {
             before(grammarAccess.getCompositionAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:4167:2: ( rule__Composition__NameAssignment_1 )
            // InternalUmlTextual.g:4167:3: rule__Composition__NameAssignment_1
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
    // InternalUmlTextual.g:4175:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl rule__Composition__Group__3 ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4179:1: ( rule__Composition__Group__2__Impl rule__Composition__Group__3 )
            // InternalUmlTextual.g:4180:2: rule__Composition__Group__2__Impl rule__Composition__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalUmlTextual.g:4187:1: rule__Composition__Group__2__Impl : ( '{' ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4191:1: ( ( '{' ) )
            // InternalUmlTextual.g:4192:1: ( '{' )
            {
            // InternalUmlTextual.g:4192:1: ( '{' )
            // InternalUmlTextual.g:4193:2: '{'
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
    // InternalUmlTextual.g:4202:1: rule__Composition__Group__3 : rule__Composition__Group__3__Impl rule__Composition__Group__4 ;
    public final void rule__Composition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4206:1: ( rule__Composition__Group__3__Impl rule__Composition__Group__4 )
            // InternalUmlTextual.g:4207:2: rule__Composition__Group__3__Impl rule__Composition__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:4214:1: rule__Composition__Group__3__Impl : ( 'from' ) ;
    public final void rule__Composition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4218:1: ( ( 'from' ) )
            // InternalUmlTextual.g:4219:1: ( 'from' )
            {
            // InternalUmlTextual.g:4219:1: ( 'from' )
            // InternalUmlTextual.g:4220:2: 'from'
            {
             before(grammarAccess.getCompositionAccess().getFromKeyword_3()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUmlTextual.g:4229:1: rule__Composition__Group__4 : rule__Composition__Group__4__Impl rule__Composition__Group__5 ;
    public final void rule__Composition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4233:1: ( rule__Composition__Group__4__Impl rule__Composition__Group__5 )
            // InternalUmlTextual.g:4234:2: rule__Composition__Group__4__Impl rule__Composition__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalUmlTextual.g:4241:1: rule__Composition__Group__4__Impl : ( ( rule__Composition__Class1Assignment_4 ) ) ;
    public final void rule__Composition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4245:1: ( ( ( rule__Composition__Class1Assignment_4 ) ) )
            // InternalUmlTextual.g:4246:1: ( ( rule__Composition__Class1Assignment_4 ) )
            {
            // InternalUmlTextual.g:4246:1: ( ( rule__Composition__Class1Assignment_4 ) )
            // InternalUmlTextual.g:4247:2: ( rule__Composition__Class1Assignment_4 )
            {
             before(grammarAccess.getCompositionAccess().getClass1Assignment_4()); 
            // InternalUmlTextual.g:4248:2: ( rule__Composition__Class1Assignment_4 )
            // InternalUmlTextual.g:4248:3: rule__Composition__Class1Assignment_4
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
    // InternalUmlTextual.g:4256:1: rule__Composition__Group__5 : rule__Composition__Group__5__Impl rule__Composition__Group__6 ;
    public final void rule__Composition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4260:1: ( rule__Composition__Group__5__Impl rule__Composition__Group__6 )
            // InternalUmlTextual.g:4261:2: rule__Composition__Group__5__Impl rule__Composition__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:4268:1: rule__Composition__Group__5__Impl : ( '[' ) ;
    public final void rule__Composition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4272:1: ( ( '[' ) )
            // InternalUmlTextual.g:4273:1: ( '[' )
            {
            // InternalUmlTextual.g:4273:1: ( '[' )
            // InternalUmlTextual.g:4274:2: '['
            {
             before(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_5()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:4283:1: rule__Composition__Group__6 : rule__Composition__Group__6__Impl rule__Composition__Group__7 ;
    public final void rule__Composition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4287:1: ( rule__Composition__Group__6__Impl rule__Composition__Group__7 )
            // InternalUmlTextual.g:4288:2: rule__Composition__Group__6__Impl rule__Composition__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:4295:1: rule__Composition__Group__6__Impl : ( ( rule__Composition__Multiplicity1Assignment_6 ) ) ;
    public final void rule__Composition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4299:1: ( ( ( rule__Composition__Multiplicity1Assignment_6 ) ) )
            // InternalUmlTextual.g:4300:1: ( ( rule__Composition__Multiplicity1Assignment_6 ) )
            {
            // InternalUmlTextual.g:4300:1: ( ( rule__Composition__Multiplicity1Assignment_6 ) )
            // InternalUmlTextual.g:4301:2: ( rule__Composition__Multiplicity1Assignment_6 )
            {
             before(grammarAccess.getCompositionAccess().getMultiplicity1Assignment_6()); 
            // InternalUmlTextual.g:4302:2: ( rule__Composition__Multiplicity1Assignment_6 )
            // InternalUmlTextual.g:4302:3: rule__Composition__Multiplicity1Assignment_6
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
    // InternalUmlTextual.g:4310:1: rule__Composition__Group__7 : rule__Composition__Group__7__Impl rule__Composition__Group__8 ;
    public final void rule__Composition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4314:1: ( rule__Composition__Group__7__Impl rule__Composition__Group__8 )
            // InternalUmlTextual.g:4315:2: rule__Composition__Group__7__Impl rule__Composition__Group__8
            {
            pushFollow(FOLLOW_40);
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
    // InternalUmlTextual.g:4322:1: rule__Composition__Group__7__Impl : ( ']' ) ;
    public final void rule__Composition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4326:1: ( ( ']' ) )
            // InternalUmlTextual.g:4327:1: ( ']' )
            {
            // InternalUmlTextual.g:4327:1: ( ']' )
            // InternalUmlTextual.g:4328:2: ']'
            {
             before(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_7()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:4337:1: rule__Composition__Group__8 : rule__Composition__Group__8__Impl rule__Composition__Group__9 ;
    public final void rule__Composition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4341:1: ( rule__Composition__Group__8__Impl rule__Composition__Group__9 )
            // InternalUmlTextual.g:4342:2: rule__Composition__Group__8__Impl rule__Composition__Group__9
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:4349:1: rule__Composition__Group__8__Impl : ( 'to' ) ;
    public final void rule__Composition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4353:1: ( ( 'to' ) )
            // InternalUmlTextual.g:4354:1: ( 'to' )
            {
            // InternalUmlTextual.g:4354:1: ( 'to' )
            // InternalUmlTextual.g:4355:2: 'to'
            {
             before(grammarAccess.getCompositionAccess().getToKeyword_8()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUmlTextual.g:4364:1: rule__Composition__Group__9 : rule__Composition__Group__9__Impl rule__Composition__Group__10 ;
    public final void rule__Composition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4368:1: ( rule__Composition__Group__9__Impl rule__Composition__Group__10 )
            // InternalUmlTextual.g:4369:2: rule__Composition__Group__9__Impl rule__Composition__Group__10
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:4376:1: rule__Composition__Group__9__Impl : ( ( rule__Composition__NavigationAssignment_9 )? ) ;
    public final void rule__Composition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4380:1: ( ( ( rule__Composition__NavigationAssignment_9 )? ) )
            // InternalUmlTextual.g:4381:1: ( ( rule__Composition__NavigationAssignment_9 )? )
            {
            // InternalUmlTextual.g:4381:1: ( ( rule__Composition__NavigationAssignment_9 )? )
            // InternalUmlTextual.g:4382:2: ( rule__Composition__NavigationAssignment_9 )?
            {
             before(grammarAccess.getCompositionAccess().getNavigationAssignment_9()); 
            // InternalUmlTextual.g:4383:2: ( rule__Composition__NavigationAssignment_9 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==14) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUmlTextual.g:4383:3: rule__Composition__NavigationAssignment_9
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
    // InternalUmlTextual.g:4391:1: rule__Composition__Group__10 : rule__Composition__Group__10__Impl rule__Composition__Group__11 ;
    public final void rule__Composition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4395:1: ( rule__Composition__Group__10__Impl rule__Composition__Group__11 )
            // InternalUmlTextual.g:4396:2: rule__Composition__Group__10__Impl rule__Composition__Group__11
            {
            pushFollow(FOLLOW_28);
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
    // InternalUmlTextual.g:4403:1: rule__Composition__Group__10__Impl : ( ( rule__Composition__Class2Assignment_10 ) ) ;
    public final void rule__Composition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4407:1: ( ( ( rule__Composition__Class2Assignment_10 ) ) )
            // InternalUmlTextual.g:4408:1: ( ( rule__Composition__Class2Assignment_10 ) )
            {
            // InternalUmlTextual.g:4408:1: ( ( rule__Composition__Class2Assignment_10 ) )
            // InternalUmlTextual.g:4409:2: ( rule__Composition__Class2Assignment_10 )
            {
             before(grammarAccess.getCompositionAccess().getClass2Assignment_10()); 
            // InternalUmlTextual.g:4410:2: ( rule__Composition__Class2Assignment_10 )
            // InternalUmlTextual.g:4410:3: rule__Composition__Class2Assignment_10
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
    // InternalUmlTextual.g:4418:1: rule__Composition__Group__11 : rule__Composition__Group__11__Impl rule__Composition__Group__12 ;
    public final void rule__Composition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4422:1: ( rule__Composition__Group__11__Impl rule__Composition__Group__12 )
            // InternalUmlTextual.g:4423:2: rule__Composition__Group__11__Impl rule__Composition__Group__12
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:4430:1: rule__Composition__Group__11__Impl : ( '[' ) ;
    public final void rule__Composition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4434:1: ( ( '[' ) )
            // InternalUmlTextual.g:4435:1: ( '[' )
            {
            // InternalUmlTextual.g:4435:1: ( '[' )
            // InternalUmlTextual.g:4436:2: '['
            {
             before(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_11()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:4445:1: rule__Composition__Group__12 : rule__Composition__Group__12__Impl rule__Composition__Group__13 ;
    public final void rule__Composition__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4449:1: ( rule__Composition__Group__12__Impl rule__Composition__Group__13 )
            // InternalUmlTextual.g:4450:2: rule__Composition__Group__12__Impl rule__Composition__Group__13
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:4457:1: rule__Composition__Group__12__Impl : ( ( rule__Composition__Multiplicity2Assignment_12 ) ) ;
    public final void rule__Composition__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4461:1: ( ( ( rule__Composition__Multiplicity2Assignment_12 ) ) )
            // InternalUmlTextual.g:4462:1: ( ( rule__Composition__Multiplicity2Assignment_12 ) )
            {
            // InternalUmlTextual.g:4462:1: ( ( rule__Composition__Multiplicity2Assignment_12 ) )
            // InternalUmlTextual.g:4463:2: ( rule__Composition__Multiplicity2Assignment_12 )
            {
             before(grammarAccess.getCompositionAccess().getMultiplicity2Assignment_12()); 
            // InternalUmlTextual.g:4464:2: ( rule__Composition__Multiplicity2Assignment_12 )
            // InternalUmlTextual.g:4464:3: rule__Composition__Multiplicity2Assignment_12
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
    // InternalUmlTextual.g:4472:1: rule__Composition__Group__13 : rule__Composition__Group__13__Impl rule__Composition__Group__14 ;
    public final void rule__Composition__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4476:1: ( rule__Composition__Group__13__Impl rule__Composition__Group__14 )
            // InternalUmlTextual.g:4477:2: rule__Composition__Group__13__Impl rule__Composition__Group__14
            {
            pushFollow(FOLLOW_43);
            rule__Composition__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Composition__Group__14();

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
    // InternalUmlTextual.g:4484:1: rule__Composition__Group__13__Impl : ( ']' ) ;
    public final void rule__Composition__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4488:1: ( ( ']' ) )
            // InternalUmlTextual.g:4489:1: ( ']' )
            {
            // InternalUmlTextual.g:4489:1: ( ']' )
            // InternalUmlTextual.g:4490:2: ']'
            {
             before(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_13()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__Composition__Group__14"
    // InternalUmlTextual.g:4499:1: rule__Composition__Group__14 : rule__Composition__Group__14__Impl ;
    public final void rule__Composition__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4503:1: ( rule__Composition__Group__14__Impl )
            // InternalUmlTextual.g:4504:2: rule__Composition__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Composition__Group__14__Impl();

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
    // $ANTLR end "rule__Composition__Group__14"


    // $ANTLR start "rule__Composition__Group__14__Impl"
    // InternalUmlTextual.g:4510:1: rule__Composition__Group__14__Impl : ( '}' ) ;
    public final void rule__Composition__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4514:1: ( ( '}' ) )
            // InternalUmlTextual.g:4515:1: ( '}' )
            {
            // InternalUmlTextual.g:4515:1: ( '}' )
            // InternalUmlTextual.g:4516:2: '}'
            {
             before(grammarAccess.getCompositionAccess().getRightCurlyBracketKeyword_14()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCompositionAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composition__Group__14__Impl"


    // $ANTLR start "rule__UseCaseDiagram__Group__0"
    // InternalUmlTextual.g:4526:1: rule__UseCaseDiagram__Group__0 : rule__UseCaseDiagram__Group__0__Impl rule__UseCaseDiagram__Group__1 ;
    public final void rule__UseCaseDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4530:1: ( rule__UseCaseDiagram__Group__0__Impl rule__UseCaseDiagram__Group__1 )
            // InternalUmlTextual.g:4531:2: rule__UseCaseDiagram__Group__0__Impl rule__UseCaseDiagram__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalUmlTextual.g:4538:1: rule__UseCaseDiagram__Group__0__Impl : ( 'usecase' ) ;
    public final void rule__UseCaseDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4542:1: ( ( 'usecase' ) )
            // InternalUmlTextual.g:4543:1: ( 'usecase' )
            {
            // InternalUmlTextual.g:4543:1: ( 'usecase' )
            // InternalUmlTextual.g:4544:2: 'usecase'
            {
             before(grammarAccess.getUseCaseDiagramAccess().getUsecaseKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalUmlTextual.g:4553:1: rule__UseCaseDiagram__Group__1 : rule__UseCaseDiagram__Group__1__Impl rule__UseCaseDiagram__Group__2 ;
    public final void rule__UseCaseDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4557:1: ( rule__UseCaseDiagram__Group__1__Impl rule__UseCaseDiagram__Group__2 )
            // InternalUmlTextual.g:4558:2: rule__UseCaseDiagram__Group__1__Impl rule__UseCaseDiagram__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:4565:1: rule__UseCaseDiagram__Group__1__Impl : ( 'diagram' ) ;
    public final void rule__UseCaseDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4569:1: ( ( 'diagram' ) )
            // InternalUmlTextual.g:4570:1: ( 'diagram' )
            {
            // InternalUmlTextual.g:4570:1: ( 'diagram' )
            // InternalUmlTextual.g:4571:2: 'diagram'
            {
             before(grammarAccess.getUseCaseDiagramAccess().getDiagramKeyword_1()); 
            match(input,58,FOLLOW_2); 
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
    // InternalUmlTextual.g:4580:1: rule__UseCaseDiagram__Group__2 : rule__UseCaseDiagram__Group__2__Impl rule__UseCaseDiagram__Group__3 ;
    public final void rule__UseCaseDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4584:1: ( rule__UseCaseDiagram__Group__2__Impl rule__UseCaseDiagram__Group__3 )
            // InternalUmlTextual.g:4585:2: rule__UseCaseDiagram__Group__2__Impl rule__UseCaseDiagram__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalUmlTextual.g:4592:1: rule__UseCaseDiagram__Group__2__Impl : ( ( rule__UseCaseDiagram__NameAssignment_2 ) ) ;
    public final void rule__UseCaseDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4596:1: ( ( ( rule__UseCaseDiagram__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:4597:1: ( ( rule__UseCaseDiagram__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:4597:1: ( ( rule__UseCaseDiagram__NameAssignment_2 ) )
            // InternalUmlTextual.g:4598:2: ( rule__UseCaseDiagram__NameAssignment_2 )
            {
             before(grammarAccess.getUseCaseDiagramAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:4599:2: ( rule__UseCaseDiagram__NameAssignment_2 )
            // InternalUmlTextual.g:4599:3: rule__UseCaseDiagram__NameAssignment_2
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
    // InternalUmlTextual.g:4607:1: rule__UseCaseDiagram__Group__3 : rule__UseCaseDiagram__Group__3__Impl rule__UseCaseDiagram__Group__4 ;
    public final void rule__UseCaseDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4611:1: ( rule__UseCaseDiagram__Group__3__Impl rule__UseCaseDiagram__Group__4 )
            // InternalUmlTextual.g:4612:2: rule__UseCaseDiagram__Group__3__Impl rule__UseCaseDiagram__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalUmlTextual.g:4619:1: rule__UseCaseDiagram__Group__3__Impl : ( '{' ) ;
    public final void rule__UseCaseDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4623:1: ( ( '{' ) )
            // InternalUmlTextual.g:4624:1: ( '{' )
            {
            // InternalUmlTextual.g:4624:1: ( '{' )
            // InternalUmlTextual.g:4625:2: '{'
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
    // InternalUmlTextual.g:4634:1: rule__UseCaseDiagram__Group__4 : rule__UseCaseDiagram__Group__4__Impl rule__UseCaseDiagram__Group__5 ;
    public final void rule__UseCaseDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4638:1: ( rule__UseCaseDiagram__Group__4__Impl rule__UseCaseDiagram__Group__5 )
            // InternalUmlTextual.g:4639:2: rule__UseCaseDiagram__Group__4__Impl rule__UseCaseDiagram__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalUmlTextual.g:4646:1: rule__UseCaseDiagram__Group__4__Impl : ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* ) ;
    public final void rule__UseCaseDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4650:1: ( ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* ) )
            // InternalUmlTextual.g:4651:1: ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* )
            {
            // InternalUmlTextual.g:4651:1: ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* )
            // InternalUmlTextual.g:4652:2: ( rule__UseCaseDiagram__ElementsAssignment_4 )*
            {
             before(grammarAccess.getUseCaseDiagramAccess().getElementsAssignment_4()); 
            // InternalUmlTextual.g:4653:2: ( rule__UseCaseDiagram__ElementsAssignment_4 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=11 && LA42_0<=12)||LA42_0==15||(LA42_0>=17 && LA42_0<=19)||LA42_0==57||LA42_0==59||LA42_0==72) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUmlTextual.g:4653:3: rule__UseCaseDiagram__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__UseCaseDiagram__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalUmlTextual.g:4661:1: rule__UseCaseDiagram__Group__5 : rule__UseCaseDiagram__Group__5__Impl ;
    public final void rule__UseCaseDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4665:1: ( rule__UseCaseDiagram__Group__5__Impl )
            // InternalUmlTextual.g:4666:2: rule__UseCaseDiagram__Group__5__Impl
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
    // InternalUmlTextual.g:4672:1: rule__UseCaseDiagram__Group__5__Impl : ( '}' ) ;
    public final void rule__UseCaseDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4676:1: ( ( '}' ) )
            // InternalUmlTextual.g:4677:1: ( '}' )
            {
            // InternalUmlTextual.g:4677:1: ( '}' )
            // InternalUmlTextual.g:4678:2: '}'
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
    // InternalUmlTextual.g:4688:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4692:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalUmlTextual.g:4693:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalUmlTextual.g:4700:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__VisibilityAssignment_0 )? ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4704:1: ( ( ( rule__Actor__VisibilityAssignment_0 )? ) )
            // InternalUmlTextual.g:4705:1: ( ( rule__Actor__VisibilityAssignment_0 )? )
            {
            // InternalUmlTextual.g:4705:1: ( ( rule__Actor__VisibilityAssignment_0 )? )
            // InternalUmlTextual.g:4706:2: ( rule__Actor__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getActorAccess().getVisibilityAssignment_0()); 
            // InternalUmlTextual.g:4707:2: ( rule__Actor__VisibilityAssignment_0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==15||(LA43_0>=17 && LA43_0<=19)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalUmlTextual.g:4707:3: rule__Actor__VisibilityAssignment_0
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
    // InternalUmlTextual.g:4715:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4719:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalUmlTextual.g:4720:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalUmlTextual.g:4727:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__AbstractAssignment_1 )? ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4731:1: ( ( ( rule__Actor__AbstractAssignment_1 )? ) )
            // InternalUmlTextual.g:4732:1: ( ( rule__Actor__AbstractAssignment_1 )? )
            {
            // InternalUmlTextual.g:4732:1: ( ( rule__Actor__AbstractAssignment_1 )? )
            // InternalUmlTextual.g:4733:2: ( rule__Actor__AbstractAssignment_1 )?
            {
             before(grammarAccess.getActorAccess().getAbstractAssignment_1()); 
            // InternalUmlTextual.g:4734:2: ( rule__Actor__AbstractAssignment_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==11) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUmlTextual.g:4734:3: rule__Actor__AbstractAssignment_1
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
    // InternalUmlTextual.g:4742:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4746:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalUmlTextual.g:4747:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalUmlTextual.g:4754:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__ActiveAssignment_2 )? ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4758:1: ( ( ( rule__Actor__ActiveAssignment_2 )? ) )
            // InternalUmlTextual.g:4759:1: ( ( rule__Actor__ActiveAssignment_2 )? )
            {
            // InternalUmlTextual.g:4759:1: ( ( rule__Actor__ActiveAssignment_2 )? )
            // InternalUmlTextual.g:4760:2: ( rule__Actor__ActiveAssignment_2 )?
            {
             before(grammarAccess.getActorAccess().getActiveAssignment_2()); 
            // InternalUmlTextual.g:4761:2: ( rule__Actor__ActiveAssignment_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==12) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUmlTextual.g:4761:3: rule__Actor__ActiveAssignment_2
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
    // InternalUmlTextual.g:4769:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4773:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // InternalUmlTextual.g:4774:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalUmlTextual.g:4781:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__BusinessAssignment_3 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4785:1: ( ( ( rule__Actor__BusinessAssignment_3 )? ) )
            // InternalUmlTextual.g:4786:1: ( ( rule__Actor__BusinessAssignment_3 )? )
            {
            // InternalUmlTextual.g:4786:1: ( ( rule__Actor__BusinessAssignment_3 )? )
            // InternalUmlTextual.g:4787:2: ( rule__Actor__BusinessAssignment_3 )?
            {
             before(grammarAccess.getActorAccess().getBusinessAssignment_3()); 
            // InternalUmlTextual.g:4788:2: ( rule__Actor__BusinessAssignment_3 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==72) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUmlTextual.g:4788:3: rule__Actor__BusinessAssignment_3
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
    // InternalUmlTextual.g:4796:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl rule__Actor__Group__5 ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4800:1: ( rule__Actor__Group__4__Impl rule__Actor__Group__5 )
            // InternalUmlTextual.g:4801:2: rule__Actor__Group__4__Impl rule__Actor__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:4808:1: rule__Actor__Group__4__Impl : ( 'actor' ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4812:1: ( ( 'actor' ) )
            // InternalUmlTextual.g:4813:1: ( 'actor' )
            {
            // InternalUmlTextual.g:4813:1: ( 'actor' )
            // InternalUmlTextual.g:4814:2: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_4()); 
            match(input,59,FOLLOW_2); 
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
    // InternalUmlTextual.g:4823:1: rule__Actor__Group__5 : rule__Actor__Group__5__Impl rule__Actor__Group__6 ;
    public final void rule__Actor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4827:1: ( rule__Actor__Group__5__Impl rule__Actor__Group__6 )
            // InternalUmlTextual.g:4828:2: rule__Actor__Group__5__Impl rule__Actor__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalUmlTextual.g:4835:1: rule__Actor__Group__5__Impl : ( ( rule__Actor__NameAssignment_5 ) ) ;
    public final void rule__Actor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4839:1: ( ( ( rule__Actor__NameAssignment_5 ) ) )
            // InternalUmlTextual.g:4840:1: ( ( rule__Actor__NameAssignment_5 ) )
            {
            // InternalUmlTextual.g:4840:1: ( ( rule__Actor__NameAssignment_5 ) )
            // InternalUmlTextual.g:4841:2: ( rule__Actor__NameAssignment_5 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_5()); 
            // InternalUmlTextual.g:4842:2: ( rule__Actor__NameAssignment_5 )
            // InternalUmlTextual.g:4842:3: rule__Actor__NameAssignment_5
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
    // InternalUmlTextual.g:4850:1: rule__Actor__Group__6 : rule__Actor__Group__6__Impl rule__Actor__Group__7 ;
    public final void rule__Actor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4854:1: ( rule__Actor__Group__6__Impl rule__Actor__Group__7 )
            // InternalUmlTextual.g:4855:2: rule__Actor__Group__6__Impl rule__Actor__Group__7
            {
            pushFollow(FOLLOW_19);
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
    // InternalUmlTextual.g:4862:1: rule__Actor__Group__6__Impl : ( ( rule__Actor__Group_6__0 )? ) ;
    public final void rule__Actor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4866:1: ( ( ( rule__Actor__Group_6__0 )? ) )
            // InternalUmlTextual.g:4867:1: ( ( rule__Actor__Group_6__0 )? )
            {
            // InternalUmlTextual.g:4867:1: ( ( rule__Actor__Group_6__0 )? )
            // InternalUmlTextual.g:4868:2: ( rule__Actor__Group_6__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_6()); 
            // InternalUmlTextual.g:4869:2: ( rule__Actor__Group_6__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==31) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUmlTextual.g:4869:3: rule__Actor__Group_6__0
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
    // InternalUmlTextual.g:4877:1: rule__Actor__Group__7 : rule__Actor__Group__7__Impl rule__Actor__Group__8 ;
    public final void rule__Actor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4881:1: ( rule__Actor__Group__7__Impl rule__Actor__Group__8 )
            // InternalUmlTextual.g:4882:2: rule__Actor__Group__7__Impl rule__Actor__Group__8
            {
            pushFollow(FOLLOW_48);
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
    // InternalUmlTextual.g:4889:1: rule__Actor__Group__7__Impl : ( '{' ) ;
    public final void rule__Actor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4893:1: ( ( '{' ) )
            // InternalUmlTextual.g:4894:1: ( '{' )
            {
            // InternalUmlTextual.g:4894:1: ( '{' )
            // InternalUmlTextual.g:4895:2: '{'
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
    // InternalUmlTextual.g:4904:1: rule__Actor__Group__8 : rule__Actor__Group__8__Impl rule__Actor__Group__9 ;
    public final void rule__Actor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4908:1: ( rule__Actor__Group__8__Impl rule__Actor__Group__9 )
            // InternalUmlTextual.g:4909:2: rule__Actor__Group__8__Impl rule__Actor__Group__9
            {
            pushFollow(FOLLOW_48);
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
    // InternalUmlTextual.g:4916:1: rule__Actor__Group__8__Impl : ( ( rule__Actor__Group_8__0 )* ) ;
    public final void rule__Actor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4920:1: ( ( ( rule__Actor__Group_8__0 )* ) )
            // InternalUmlTextual.g:4921:1: ( ( rule__Actor__Group_8__0 )* )
            {
            // InternalUmlTextual.g:4921:1: ( ( rule__Actor__Group_8__0 )* )
            // InternalUmlTextual.g:4922:2: ( rule__Actor__Group_8__0 )*
            {
             before(grammarAccess.getActorAccess().getGroup_8()); 
            // InternalUmlTextual.g:4923:2: ( rule__Actor__Group_8__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==60) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalUmlTextual.g:4923:3: rule__Actor__Group_8__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__Actor__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalUmlTextual.g:4931:1: rule__Actor__Group__9 : rule__Actor__Group__9__Impl ;
    public final void rule__Actor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4935:1: ( rule__Actor__Group__9__Impl )
            // InternalUmlTextual.g:4936:2: rule__Actor__Group__9__Impl
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
    // InternalUmlTextual.g:4942:1: rule__Actor__Group__9__Impl : ( '}' ) ;
    public final void rule__Actor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4946:1: ( ( '}' ) )
            // InternalUmlTextual.g:4947:1: ( '}' )
            {
            // InternalUmlTextual.g:4947:1: ( '}' )
            // InternalUmlTextual.g:4948:2: '}'
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
    // InternalUmlTextual.g:4958:1: rule__Actor__Group_6__0 : rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1 ;
    public final void rule__Actor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4962:1: ( rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1 )
            // InternalUmlTextual.g:4963:2: rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalUmlTextual.g:4970:1: rule__Actor__Group_6__0__Impl : ( 'extends' ) ;
    public final void rule__Actor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4974:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:4975:1: ( 'extends' )
            {
            // InternalUmlTextual.g:4975:1: ( 'extends' )
            // InternalUmlTextual.g:4976:2: 'extends'
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
    // InternalUmlTextual.g:4985:1: rule__Actor__Group_6__1 : rule__Actor__Group_6__1__Impl ;
    public final void rule__Actor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4989:1: ( rule__Actor__Group_6__1__Impl )
            // InternalUmlTextual.g:4990:2: rule__Actor__Group_6__1__Impl
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
    // InternalUmlTextual.g:4996:1: rule__Actor__Group_6__1__Impl : ( ( rule__Actor__ParentActorAssignment_6_1 ) ) ;
    public final void rule__Actor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5000:1: ( ( ( rule__Actor__ParentActorAssignment_6_1 ) ) )
            // InternalUmlTextual.g:5001:1: ( ( rule__Actor__ParentActorAssignment_6_1 ) )
            {
            // InternalUmlTextual.g:5001:1: ( ( rule__Actor__ParentActorAssignment_6_1 ) )
            // InternalUmlTextual.g:5002:2: ( rule__Actor__ParentActorAssignment_6_1 )
            {
             before(grammarAccess.getActorAccess().getParentActorAssignment_6_1()); 
            // InternalUmlTextual.g:5003:2: ( rule__Actor__ParentActorAssignment_6_1 )
            // InternalUmlTextual.g:5003:3: rule__Actor__ParentActorAssignment_6_1
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


    // $ANTLR start "rule__Actor__Group_8__0"
    // InternalUmlTextual.g:5012:1: rule__Actor__Group_8__0 : rule__Actor__Group_8__0__Impl rule__Actor__Group_8__1 ;
    public final void rule__Actor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5016:1: ( rule__Actor__Group_8__0__Impl rule__Actor__Group_8__1 )
            // InternalUmlTextual.g:5017:2: rule__Actor__Group_8__0__Impl rule__Actor__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__Actor__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_8__1();

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
    // $ANTLR end "rule__Actor__Group_8__0"


    // $ANTLR start "rule__Actor__Group_8__0__Impl"
    // InternalUmlTextual.g:5024:1: rule__Actor__Group_8__0__Impl : ( 'uses' ) ;
    public final void rule__Actor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5028:1: ( ( 'uses' ) )
            // InternalUmlTextual.g:5029:1: ( 'uses' )
            {
            // InternalUmlTextual.g:5029:1: ( 'uses' )
            // InternalUmlTextual.g:5030:2: 'uses'
            {
             before(grammarAccess.getActorAccess().getUsesKeyword_8_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getUsesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_8__0__Impl"


    // $ANTLR start "rule__Actor__Group_8__1"
    // InternalUmlTextual.g:5039:1: rule__Actor__Group_8__1 : rule__Actor__Group_8__1__Impl rule__Actor__Group_8__2 ;
    public final void rule__Actor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5043:1: ( rule__Actor__Group_8__1__Impl rule__Actor__Group_8__2 )
            // InternalUmlTextual.g:5044:2: rule__Actor__Group_8__1__Impl rule__Actor__Group_8__2
            {
            pushFollow(FOLLOW_16);
            rule__Actor__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_8__2();

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
    // $ANTLR end "rule__Actor__Group_8__1"


    // $ANTLR start "rule__Actor__Group_8__1__Impl"
    // InternalUmlTextual.g:5051:1: rule__Actor__Group_8__1__Impl : ( ( rule__Actor__UseCasesAssignment_8_1 ) ) ;
    public final void rule__Actor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5055:1: ( ( ( rule__Actor__UseCasesAssignment_8_1 ) ) )
            // InternalUmlTextual.g:5056:1: ( ( rule__Actor__UseCasesAssignment_8_1 ) )
            {
            // InternalUmlTextual.g:5056:1: ( ( rule__Actor__UseCasesAssignment_8_1 ) )
            // InternalUmlTextual.g:5057:2: ( rule__Actor__UseCasesAssignment_8_1 )
            {
             before(grammarAccess.getActorAccess().getUseCasesAssignment_8_1()); 
            // InternalUmlTextual.g:5058:2: ( rule__Actor__UseCasesAssignment_8_1 )
            // InternalUmlTextual.g:5058:3: rule__Actor__UseCasesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__UseCasesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getUseCasesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_8__1__Impl"


    // $ANTLR start "rule__Actor__Group_8__2"
    // InternalUmlTextual.g:5066:1: rule__Actor__Group_8__2 : rule__Actor__Group_8__2__Impl ;
    public final void rule__Actor__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5070:1: ( rule__Actor__Group_8__2__Impl )
            // InternalUmlTextual.g:5071:2: rule__Actor__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_8__2__Impl();

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
    // $ANTLR end "rule__Actor__Group_8__2"


    // $ANTLR start "rule__Actor__Group_8__2__Impl"
    // InternalUmlTextual.g:5077:1: rule__Actor__Group_8__2__Impl : ( ( rule__Actor__Group_8_2__0 )* ) ;
    public final void rule__Actor__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5081:1: ( ( ( rule__Actor__Group_8_2__0 )* ) )
            // InternalUmlTextual.g:5082:1: ( ( rule__Actor__Group_8_2__0 )* )
            {
            // InternalUmlTextual.g:5082:1: ( ( rule__Actor__Group_8_2__0 )* )
            // InternalUmlTextual.g:5083:2: ( rule__Actor__Group_8_2__0 )*
            {
             before(grammarAccess.getActorAccess().getGroup_8_2()); 
            // InternalUmlTextual.g:5084:2: ( rule__Actor__Group_8_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==33) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalUmlTextual.g:5084:3: rule__Actor__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Actor__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_8__2__Impl"


    // $ANTLR start "rule__Actor__Group_8_2__0"
    // InternalUmlTextual.g:5093:1: rule__Actor__Group_8_2__0 : rule__Actor__Group_8_2__0__Impl rule__Actor__Group_8_2__1 ;
    public final void rule__Actor__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5097:1: ( rule__Actor__Group_8_2__0__Impl rule__Actor__Group_8_2__1 )
            // InternalUmlTextual.g:5098:2: rule__Actor__Group_8_2__0__Impl rule__Actor__Group_8_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Actor__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actor__Group_8_2__1();

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
    // $ANTLR end "rule__Actor__Group_8_2__0"


    // $ANTLR start "rule__Actor__Group_8_2__0__Impl"
    // InternalUmlTextual.g:5105:1: rule__Actor__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Actor__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5109:1: ( ( ',' ) )
            // InternalUmlTextual.g:5110:1: ( ',' )
            {
            // InternalUmlTextual.g:5110:1: ( ',' )
            // InternalUmlTextual.g:5111:2: ','
            {
             before(grammarAccess.getActorAccess().getCommaKeyword_8_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getCommaKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_8_2__0__Impl"


    // $ANTLR start "rule__Actor__Group_8_2__1"
    // InternalUmlTextual.g:5120:1: rule__Actor__Group_8_2__1 : rule__Actor__Group_8_2__1__Impl ;
    public final void rule__Actor__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5124:1: ( rule__Actor__Group_8_2__1__Impl )
            // InternalUmlTextual.g:5125:2: rule__Actor__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actor__Group_8_2__1__Impl();

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
    // $ANTLR end "rule__Actor__Group_8_2__1"


    // $ANTLR start "rule__Actor__Group_8_2__1__Impl"
    // InternalUmlTextual.g:5131:1: rule__Actor__Group_8_2__1__Impl : ( ( rule__Actor__UseCasesAssignment_8_2_1 ) ) ;
    public final void rule__Actor__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5135:1: ( ( ( rule__Actor__UseCasesAssignment_8_2_1 ) ) )
            // InternalUmlTextual.g:5136:1: ( ( rule__Actor__UseCasesAssignment_8_2_1 ) )
            {
            // InternalUmlTextual.g:5136:1: ( ( rule__Actor__UseCasesAssignment_8_2_1 ) )
            // InternalUmlTextual.g:5137:2: ( rule__Actor__UseCasesAssignment_8_2_1 )
            {
             before(grammarAccess.getActorAccess().getUseCasesAssignment_8_2_1()); 
            // InternalUmlTextual.g:5138:2: ( rule__Actor__UseCasesAssignment_8_2_1 )
            // InternalUmlTextual.g:5138:3: rule__Actor__UseCasesAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Actor__UseCasesAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActorAccess().getUseCasesAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__Group_8_2__1__Impl"


    // $ANTLR start "rule__UseCase__Group__0"
    // InternalUmlTextual.g:5147:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5151:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUmlTextual.g:5152:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:5159:1: rule__UseCase__Group__0__Impl : ( 'usecase' ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5163:1: ( ( 'usecase' ) )
            // InternalUmlTextual.g:5164:1: ( 'usecase' )
            {
            // InternalUmlTextual.g:5164:1: ( 'usecase' )
            // InternalUmlTextual.g:5165:2: 'usecase'
            {
             before(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalUmlTextual.g:5174:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5178:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUmlTextual.g:5179:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_50);
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
    // InternalUmlTextual.g:5186:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5190:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:5191:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:5191:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUmlTextual.g:5192:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:5193:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUmlTextual.g:5193:3: rule__UseCase__NameAssignment_1
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
    // InternalUmlTextual.g:5201:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5205:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUmlTextual.g:5206:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalUmlTextual.g:5213:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__Group_2__0 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5217:1: ( ( ( rule__UseCase__Group_2__0 )? ) )
            // InternalUmlTextual.g:5218:1: ( ( rule__UseCase__Group_2__0 )? )
            {
            // InternalUmlTextual.g:5218:1: ( ( rule__UseCase__Group_2__0 )? )
            // InternalUmlTextual.g:5219:2: ( rule__UseCase__Group_2__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_2()); 
            // InternalUmlTextual.g:5220:2: ( rule__UseCase__Group_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==61) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalUmlTextual.g:5220:3: rule__UseCase__Group_2__0
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
    // InternalUmlTextual.g:5228:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5232:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUmlTextual.g:5233:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_50);
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
    // InternalUmlTextual.g:5240:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__Group_3__0 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5244:1: ( ( ( rule__UseCase__Group_3__0 )? ) )
            // InternalUmlTextual.g:5245:1: ( ( rule__UseCase__Group_3__0 )? )
            {
            // InternalUmlTextual.g:5245:1: ( ( rule__UseCase__Group_3__0 )? )
            // InternalUmlTextual.g:5246:2: ( rule__UseCase__Group_3__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_3()); 
            // InternalUmlTextual.g:5247:2: ( rule__UseCase__Group_3__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==31) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUmlTextual.g:5247:3: rule__UseCase__Group_3__0
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
    // InternalUmlTextual.g:5255:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5259:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUmlTextual.g:5260:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalUmlTextual.g:5267:1: rule__UseCase__Group__4__Impl : ( '=' ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5271:1: ( ( '=' ) )
            // InternalUmlTextual.g:5272:1: ( '=' )
            {
            // InternalUmlTextual.g:5272:1: ( '=' )
            // InternalUmlTextual.g:5273:2: '='
            {
             before(grammarAccess.getUseCaseAccess().getEqualsSignKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUmlTextual.g:5282:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5286:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUmlTextual.g:5287:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalUmlTextual.g:5294:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__DescriptionAssignment_5 ) ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5298:1: ( ( ( rule__UseCase__DescriptionAssignment_5 ) ) )
            // InternalUmlTextual.g:5299:1: ( ( rule__UseCase__DescriptionAssignment_5 ) )
            {
            // InternalUmlTextual.g:5299:1: ( ( rule__UseCase__DescriptionAssignment_5 ) )
            // InternalUmlTextual.g:5300:2: ( rule__UseCase__DescriptionAssignment_5 )
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionAssignment_5()); 
            // InternalUmlTextual.g:5301:2: ( rule__UseCase__DescriptionAssignment_5 )
            // InternalUmlTextual.g:5301:3: rule__UseCase__DescriptionAssignment_5
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
    // InternalUmlTextual.g:5309:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5313:1: ( rule__UseCase__Group__6__Impl )
            // InternalUmlTextual.g:5314:2: rule__UseCase__Group__6__Impl
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
    // InternalUmlTextual.g:5320:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__Group_6__0 )? ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5324:1: ( ( ( rule__UseCase__Group_6__0 )? ) )
            // InternalUmlTextual.g:5325:1: ( ( rule__UseCase__Group_6__0 )? )
            {
            // InternalUmlTextual.g:5325:1: ( ( rule__UseCase__Group_6__0 )? )
            // InternalUmlTextual.g:5326:2: ( rule__UseCase__Group_6__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6()); 
            // InternalUmlTextual.g:5327:2: ( rule__UseCase__Group_6__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==25) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUmlTextual.g:5327:3: rule__UseCase__Group_6__0
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
    // InternalUmlTextual.g:5336:1: rule__UseCase__Group_2__0 : rule__UseCase__Group_2__0__Impl rule__UseCase__Group_2__1 ;
    public final void rule__UseCase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5340:1: ( rule__UseCase__Group_2__0__Impl rule__UseCase__Group_2__1 )
            // InternalUmlTextual.g:5341:2: rule__UseCase__Group_2__0__Impl rule__UseCase__Group_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:5348:1: rule__UseCase__Group_2__0__Impl : ( 'includes' ) ;
    public final void rule__UseCase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5352:1: ( ( 'includes' ) )
            // InternalUmlTextual.g:5353:1: ( 'includes' )
            {
            // InternalUmlTextual.g:5353:1: ( 'includes' )
            // InternalUmlTextual.g:5354:2: 'includes'
            {
             before(grammarAccess.getUseCaseAccess().getIncludesKeyword_2_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalUmlTextual.g:5363:1: rule__UseCase__Group_2__1 : rule__UseCase__Group_2__1__Impl ;
    public final void rule__UseCase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5367:1: ( rule__UseCase__Group_2__1__Impl )
            // InternalUmlTextual.g:5368:2: rule__UseCase__Group_2__1__Impl
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
    // InternalUmlTextual.g:5374:1: rule__UseCase__Group_2__1__Impl : ( ( rule__UseCase__IncludedUseCasesAssignment_2_1 ) ) ;
    public final void rule__UseCase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5378:1: ( ( ( rule__UseCase__IncludedUseCasesAssignment_2_1 ) ) )
            // InternalUmlTextual.g:5379:1: ( ( rule__UseCase__IncludedUseCasesAssignment_2_1 ) )
            {
            // InternalUmlTextual.g:5379:1: ( ( rule__UseCase__IncludedUseCasesAssignment_2_1 ) )
            // InternalUmlTextual.g:5380:2: ( rule__UseCase__IncludedUseCasesAssignment_2_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_2_1()); 
            // InternalUmlTextual.g:5381:2: ( rule__UseCase__IncludedUseCasesAssignment_2_1 )
            // InternalUmlTextual.g:5381:3: rule__UseCase__IncludedUseCasesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__IncludedUseCasesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_2_1()); 

            }


            }

        }
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
    // InternalUmlTextual.g:5390:1: rule__UseCase__Group_3__0 : rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 ;
    public final void rule__UseCase__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5394:1: ( rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 )
            // InternalUmlTextual.g:5395:2: rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:5402:1: rule__UseCase__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__UseCase__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5406:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:5407:1: ( 'extends' )
            {
            // InternalUmlTextual.g:5407:1: ( 'extends' )
            // InternalUmlTextual.g:5408:2: 'extends'
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
    // InternalUmlTextual.g:5417:1: rule__UseCase__Group_3__1 : rule__UseCase__Group_3__1__Impl ;
    public final void rule__UseCase__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5421:1: ( rule__UseCase__Group_3__1__Impl )
            // InternalUmlTextual.g:5422:2: rule__UseCase__Group_3__1__Impl
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
    // InternalUmlTextual.g:5428:1: rule__UseCase__Group_3__1__Impl : ( ( rule__UseCase__ExtendedUseCasesAssignment_3_1 ) ) ;
    public final void rule__UseCase__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5432:1: ( ( ( rule__UseCase__ExtendedUseCasesAssignment_3_1 ) ) )
            // InternalUmlTextual.g:5433:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_3_1 ) )
            {
            // InternalUmlTextual.g:5433:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_3_1 ) )
            // InternalUmlTextual.g:5434:2: ( rule__UseCase__ExtendedUseCasesAssignment_3_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_3_1()); 
            // InternalUmlTextual.g:5435:2: ( rule__UseCase__ExtendedUseCasesAssignment_3_1 )
            // InternalUmlTextual.g:5435:3: rule__UseCase__ExtendedUseCasesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__ExtendedUseCasesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_3_1()); 

            }


            }

        }
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
    // InternalUmlTextual.g:5444:1: rule__UseCase__Group_6__0 : rule__UseCase__Group_6__0__Impl rule__UseCase__Group_6__1 ;
    public final void rule__UseCase__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5448:1: ( rule__UseCase__Group_6__0__Impl rule__UseCase__Group_6__1 )
            // InternalUmlTextual.g:5449:2: rule__UseCase__Group_6__0__Impl rule__UseCase__Group_6__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalUmlTextual.g:5456:1: rule__UseCase__Group_6__0__Impl : ( '{' ) ;
    public final void rule__UseCase__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5460:1: ( ( '{' ) )
            // InternalUmlTextual.g:5461:1: ( '{' )
            {
            // InternalUmlTextual.g:5461:1: ( '{' )
            // InternalUmlTextual.g:5462:2: '{'
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
    // InternalUmlTextual.g:5471:1: rule__UseCase__Group_6__1 : rule__UseCase__Group_6__1__Impl rule__UseCase__Group_6__2 ;
    public final void rule__UseCase__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5475:1: ( rule__UseCase__Group_6__1__Impl rule__UseCase__Group_6__2 )
            // InternalUmlTextual.g:5476:2: rule__UseCase__Group_6__1__Impl rule__UseCase__Group_6__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalUmlTextual.g:5483:1: rule__UseCase__Group_6__1__Impl : ( ( rule__UseCase__Alternatives_6_1 ) ) ;
    public final void rule__UseCase__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5487:1: ( ( ( rule__UseCase__Alternatives_6_1 ) ) )
            // InternalUmlTextual.g:5488:1: ( ( rule__UseCase__Alternatives_6_1 ) )
            {
            // InternalUmlTextual.g:5488:1: ( ( rule__UseCase__Alternatives_6_1 ) )
            // InternalUmlTextual.g:5489:2: ( rule__UseCase__Alternatives_6_1 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_6_1()); 
            // InternalUmlTextual.g:5490:2: ( rule__UseCase__Alternatives_6_1 )
            // InternalUmlTextual.g:5490:3: rule__UseCase__Alternatives_6_1
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
    // InternalUmlTextual.g:5498:1: rule__UseCase__Group_6__2 : rule__UseCase__Group_6__2__Impl ;
    public final void rule__UseCase__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5502:1: ( rule__UseCase__Group_6__2__Impl )
            // InternalUmlTextual.g:5503:2: rule__UseCase__Group_6__2__Impl
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
    // InternalUmlTextual.g:5509:1: rule__UseCase__Group_6__2__Impl : ( '}' ) ;
    public final void rule__UseCase__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5513:1: ( ( '}' ) )
            // InternalUmlTextual.g:5514:1: ( '}' )
            {
            // InternalUmlTextual.g:5514:1: ( '}' )
            // InternalUmlTextual.g:5515:2: '}'
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
    // InternalUmlTextual.g:5525:1: rule__UseCase__Group_6_1_0__0 : rule__UseCase__Group_6_1_0__0__Impl rule__UseCase__Group_6_1_0__1 ;
    public final void rule__UseCase__Group_6_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5529:1: ( rule__UseCase__Group_6_1_0__0__Impl rule__UseCase__Group_6_1_0__1 )
            // InternalUmlTextual.g:5530:2: rule__UseCase__Group_6_1_0__0__Impl rule__UseCase__Group_6_1_0__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:5537:1: rule__UseCase__Group_6_1_0__0__Impl : ( 'includes' ) ;
    public final void rule__UseCase__Group_6_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5541:1: ( ( 'includes' ) )
            // InternalUmlTextual.g:5542:1: ( 'includes' )
            {
            // InternalUmlTextual.g:5542:1: ( 'includes' )
            // InternalUmlTextual.g:5543:2: 'includes'
            {
             before(grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_0_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalUmlTextual.g:5552:1: rule__UseCase__Group_6_1_0__1 : rule__UseCase__Group_6_1_0__1__Impl rule__UseCase__Group_6_1_0__2 ;
    public final void rule__UseCase__Group_6_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5556:1: ( rule__UseCase__Group_6_1_0__1__Impl rule__UseCase__Group_6_1_0__2 )
            // InternalUmlTextual.g:5557:2: rule__UseCase__Group_6_1_0__1__Impl rule__UseCase__Group_6_1_0__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalUmlTextual.g:5564:1: rule__UseCase__Group_6_1_0__1__Impl : ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 ) ) ;
    public final void rule__UseCase__Group_6_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5568:1: ( ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 ) ) )
            // InternalUmlTextual.g:5569:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 ) )
            {
            // InternalUmlTextual.g:5569:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 ) )
            // InternalUmlTextual.g:5570:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_0_1()); 
            // InternalUmlTextual.g:5571:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 )
            // InternalUmlTextual.g:5571:3: rule__UseCase__IncludedUseCasesAssignment_6_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__IncludedUseCasesAssignment_6_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_0_1()); 

            }


            }

        }
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
    // InternalUmlTextual.g:5579:1: rule__UseCase__Group_6_1_0__2 : rule__UseCase__Group_6_1_0__2__Impl rule__UseCase__Group_6_1_0__3 ;
    public final void rule__UseCase__Group_6_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5583:1: ( rule__UseCase__Group_6_1_0__2__Impl rule__UseCase__Group_6_1_0__3 )
            // InternalUmlTextual.g:5584:2: rule__UseCase__Group_6_1_0__2__Impl rule__UseCase__Group_6_1_0__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalUmlTextual.g:5591:1: rule__UseCase__Group_6_1_0__2__Impl : ( ( rule__UseCase__Group_6_1_0_2__0 )* ) ;
    public final void rule__UseCase__Group_6_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5595:1: ( ( ( rule__UseCase__Group_6_1_0_2__0 )* ) )
            // InternalUmlTextual.g:5596:1: ( ( rule__UseCase__Group_6_1_0_2__0 )* )
            {
            // InternalUmlTextual.g:5596:1: ( ( rule__UseCase__Group_6_1_0_2__0 )* )
            // InternalUmlTextual.g:5597:2: ( rule__UseCase__Group_6_1_0_2__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_0_2()); 
            // InternalUmlTextual.g:5598:2: ( rule__UseCase__Group_6_1_0_2__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==33) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalUmlTextual.g:5598:3: rule__UseCase__Group_6_1_0_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__UseCase__Group_6_1_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalUmlTextual.g:5606:1: rule__UseCase__Group_6_1_0__3 : rule__UseCase__Group_6_1_0__3__Impl rule__UseCase__Group_6_1_0__4 ;
    public final void rule__UseCase__Group_6_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5610:1: ( rule__UseCase__Group_6_1_0__3__Impl rule__UseCase__Group_6_1_0__4 )
            // InternalUmlTextual.g:5611:2: rule__UseCase__Group_6_1_0__3__Impl rule__UseCase__Group_6_1_0__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:5618:1: rule__UseCase__Group_6_1_0__3__Impl : ( 'extends' ) ;
    public final void rule__UseCase__Group_6_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5622:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:5623:1: ( 'extends' )
            {
            // InternalUmlTextual.g:5623:1: ( 'extends' )
            // InternalUmlTextual.g:5624:2: 'extends'
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
    // InternalUmlTextual.g:5633:1: rule__UseCase__Group_6_1_0__4 : rule__UseCase__Group_6_1_0__4__Impl rule__UseCase__Group_6_1_0__5 ;
    public final void rule__UseCase__Group_6_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5637:1: ( rule__UseCase__Group_6_1_0__4__Impl rule__UseCase__Group_6_1_0__5 )
            // InternalUmlTextual.g:5638:2: rule__UseCase__Group_6_1_0__4__Impl rule__UseCase__Group_6_1_0__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalUmlTextual.g:5645:1: rule__UseCase__Group_6_1_0__4__Impl : ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 ) ) ;
    public final void rule__UseCase__Group_6_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5649:1: ( ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 ) ) )
            // InternalUmlTextual.g:5650:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 ) )
            {
            // InternalUmlTextual.g:5650:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 ) )
            // InternalUmlTextual.g:5651:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_0_4()); 
            // InternalUmlTextual.g:5652:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 )
            // InternalUmlTextual.g:5652:3: rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_0_4()); 

            }


            }

        }
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
    // InternalUmlTextual.g:5660:1: rule__UseCase__Group_6_1_0__5 : rule__UseCase__Group_6_1_0__5__Impl ;
    public final void rule__UseCase__Group_6_1_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5664:1: ( rule__UseCase__Group_6_1_0__5__Impl )
            // InternalUmlTextual.g:5665:2: rule__UseCase__Group_6_1_0__5__Impl
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
    // InternalUmlTextual.g:5671:1: rule__UseCase__Group_6_1_0__5__Impl : ( ( rule__UseCase__Group_6_1_0_5__0 )* ) ;
    public final void rule__UseCase__Group_6_1_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5675:1: ( ( ( rule__UseCase__Group_6_1_0_5__0 )* ) )
            // InternalUmlTextual.g:5676:1: ( ( rule__UseCase__Group_6_1_0_5__0 )* )
            {
            // InternalUmlTextual.g:5676:1: ( ( rule__UseCase__Group_6_1_0_5__0 )* )
            // InternalUmlTextual.g:5677:2: ( rule__UseCase__Group_6_1_0_5__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_0_5()); 
            // InternalUmlTextual.g:5678:2: ( rule__UseCase__Group_6_1_0_5__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==33) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalUmlTextual.g:5678:3: rule__UseCase__Group_6_1_0_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__UseCase__Group_6_1_0_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalUmlTextual.g:5687:1: rule__UseCase__Group_6_1_0_2__0 : rule__UseCase__Group_6_1_0_2__0__Impl rule__UseCase__Group_6_1_0_2__1 ;
    public final void rule__UseCase__Group_6_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5691:1: ( rule__UseCase__Group_6_1_0_2__0__Impl rule__UseCase__Group_6_1_0_2__1 )
            // InternalUmlTextual.g:5692:2: rule__UseCase__Group_6_1_0_2__0__Impl rule__UseCase__Group_6_1_0_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:5699:1: rule__UseCase__Group_6_1_0_2__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5703:1: ( ( ',' ) )
            // InternalUmlTextual.g:5704:1: ( ',' )
            {
            // InternalUmlTextual.g:5704:1: ( ',' )
            // InternalUmlTextual.g:5705:2: ','
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
    // InternalUmlTextual.g:5714:1: rule__UseCase__Group_6_1_0_2__1 : rule__UseCase__Group_6_1_0_2__1__Impl ;
    public final void rule__UseCase__Group_6_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5718:1: ( rule__UseCase__Group_6_1_0_2__1__Impl )
            // InternalUmlTextual.g:5719:2: rule__UseCase__Group_6_1_0_2__1__Impl
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
    // InternalUmlTextual.g:5725:1: rule__UseCase__Group_6_1_0_2__1__Impl : ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 ) ) ;
    public final void rule__UseCase__Group_6_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5729:1: ( ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 ) ) )
            // InternalUmlTextual.g:5730:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 ) )
            {
            // InternalUmlTextual.g:5730:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 ) )
            // InternalUmlTextual.g:5731:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_0_2_1()); 
            // InternalUmlTextual.g:5732:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 )
            // InternalUmlTextual.g:5732:3: rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_0_2_1()); 

            }


            }

        }
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
    // InternalUmlTextual.g:5741:1: rule__UseCase__Group_6_1_0_5__0 : rule__UseCase__Group_6_1_0_5__0__Impl rule__UseCase__Group_6_1_0_5__1 ;
    public final void rule__UseCase__Group_6_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5745:1: ( rule__UseCase__Group_6_1_0_5__0__Impl rule__UseCase__Group_6_1_0_5__1 )
            // InternalUmlTextual.g:5746:2: rule__UseCase__Group_6_1_0_5__0__Impl rule__UseCase__Group_6_1_0_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:5753:1: rule__UseCase__Group_6_1_0_5__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5757:1: ( ( ',' ) )
            // InternalUmlTextual.g:5758:1: ( ',' )
            {
            // InternalUmlTextual.g:5758:1: ( ',' )
            // InternalUmlTextual.g:5759:2: ','
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
    // InternalUmlTextual.g:5768:1: rule__UseCase__Group_6_1_0_5__1 : rule__UseCase__Group_6_1_0_5__1__Impl ;
    public final void rule__UseCase__Group_6_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5772:1: ( rule__UseCase__Group_6_1_0_5__1__Impl )
            // InternalUmlTextual.g:5773:2: rule__UseCase__Group_6_1_0_5__1__Impl
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
    // InternalUmlTextual.g:5779:1: rule__UseCase__Group_6_1_0_5__1__Impl : ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 ) ) ;
    public final void rule__UseCase__Group_6_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5783:1: ( ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 ) ) )
            // InternalUmlTextual.g:5784:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 ) )
            {
            // InternalUmlTextual.g:5784:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 ) )
            // InternalUmlTextual.g:5785:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_0_5_1()); 
            // InternalUmlTextual.g:5786:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 )
            // InternalUmlTextual.g:5786:3: rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_0_5_1()); 

            }


            }

        }
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
    // InternalUmlTextual.g:5795:1: rule__UseCase__Group_6_1_1__0 : rule__UseCase__Group_6_1_1__0__Impl rule__UseCase__Group_6_1_1__1 ;
    public final void rule__UseCase__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5799:1: ( rule__UseCase__Group_6_1_1__0__Impl rule__UseCase__Group_6_1_1__1 )
            // InternalUmlTextual.g:5800:2: rule__UseCase__Group_6_1_1__0__Impl rule__UseCase__Group_6_1_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:5807:1: rule__UseCase__Group_6_1_1__0__Impl : ( 'extends' ) ;
    public final void rule__UseCase__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5811:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:5812:1: ( 'extends' )
            {
            // InternalUmlTextual.g:5812:1: ( 'extends' )
            // InternalUmlTextual.g:5813:2: 'extends'
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
    // InternalUmlTextual.g:5822:1: rule__UseCase__Group_6_1_1__1 : rule__UseCase__Group_6_1_1__1__Impl rule__UseCase__Group_6_1_1__2 ;
    public final void rule__UseCase__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5826:1: ( rule__UseCase__Group_6_1_1__1__Impl rule__UseCase__Group_6_1_1__2 )
            // InternalUmlTextual.g:5827:2: rule__UseCase__Group_6_1_1__1__Impl rule__UseCase__Group_6_1_1__2
            {
            pushFollow(FOLLOW_53);
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
    // InternalUmlTextual.g:5834:1: rule__UseCase__Group_6_1_1__1__Impl : ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 ) ) ;
    public final void rule__UseCase__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5838:1: ( ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 ) ) )
            // InternalUmlTextual.g:5839:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 ) )
            {
            // InternalUmlTextual.g:5839:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 ) )
            // InternalUmlTextual.g:5840:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_1_1()); 
            // InternalUmlTextual.g:5841:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 )
            // InternalUmlTextual.g:5841:3: rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_1_1()); 

            }


            }

        }
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
    // InternalUmlTextual.g:5849:1: rule__UseCase__Group_6_1_1__2 : rule__UseCase__Group_6_1_1__2__Impl rule__UseCase__Group_6_1_1__3 ;
    public final void rule__UseCase__Group_6_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5853:1: ( rule__UseCase__Group_6_1_1__2__Impl rule__UseCase__Group_6_1_1__3 )
            // InternalUmlTextual.g:5854:2: rule__UseCase__Group_6_1_1__2__Impl rule__UseCase__Group_6_1_1__3
            {
            pushFollow(FOLLOW_53);
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
    // InternalUmlTextual.g:5861:1: rule__UseCase__Group_6_1_1__2__Impl : ( ( rule__UseCase__Group_6_1_1_2__0 )* ) ;
    public final void rule__UseCase__Group_6_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5865:1: ( ( ( rule__UseCase__Group_6_1_1_2__0 )* ) )
            // InternalUmlTextual.g:5866:1: ( ( rule__UseCase__Group_6_1_1_2__0 )* )
            {
            // InternalUmlTextual.g:5866:1: ( ( rule__UseCase__Group_6_1_1_2__0 )* )
            // InternalUmlTextual.g:5867:2: ( rule__UseCase__Group_6_1_1_2__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_1_2()); 
            // InternalUmlTextual.g:5868:2: ( rule__UseCase__Group_6_1_1_2__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==33) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalUmlTextual.g:5868:3: rule__UseCase__Group_6_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__UseCase__Group_6_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalUmlTextual.g:5876:1: rule__UseCase__Group_6_1_1__3 : rule__UseCase__Group_6_1_1__3__Impl rule__UseCase__Group_6_1_1__4 ;
    public final void rule__UseCase__Group_6_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5880:1: ( rule__UseCase__Group_6_1_1__3__Impl rule__UseCase__Group_6_1_1__4 )
            // InternalUmlTextual.g:5881:2: rule__UseCase__Group_6_1_1__3__Impl rule__UseCase__Group_6_1_1__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:5888:1: rule__UseCase__Group_6_1_1__3__Impl : ( 'includes' ) ;
    public final void rule__UseCase__Group_6_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5892:1: ( ( 'includes' ) )
            // InternalUmlTextual.g:5893:1: ( 'includes' )
            {
            // InternalUmlTextual.g:5893:1: ( 'includes' )
            // InternalUmlTextual.g:5894:2: 'includes'
            {
             before(grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_1_3()); 
            match(input,61,FOLLOW_2); 
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
    // InternalUmlTextual.g:5903:1: rule__UseCase__Group_6_1_1__4 : rule__UseCase__Group_6_1_1__4__Impl rule__UseCase__Group_6_1_1__5 ;
    public final void rule__UseCase__Group_6_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5907:1: ( rule__UseCase__Group_6_1_1__4__Impl rule__UseCase__Group_6_1_1__5 )
            // InternalUmlTextual.g:5908:2: rule__UseCase__Group_6_1_1__4__Impl rule__UseCase__Group_6_1_1__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalUmlTextual.g:5915:1: rule__UseCase__Group_6_1_1__4__Impl : ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 ) ) ;
    public final void rule__UseCase__Group_6_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5919:1: ( ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 ) ) )
            // InternalUmlTextual.g:5920:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 ) )
            {
            // InternalUmlTextual.g:5920:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 ) )
            // InternalUmlTextual.g:5921:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_1_4()); 
            // InternalUmlTextual.g:5922:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 )
            // InternalUmlTextual.g:5922:3: rule__UseCase__IncludedUseCasesAssignment_6_1_1_4
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__IncludedUseCasesAssignment_6_1_1_4();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_1_4()); 

            }


            }

        }
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
    // InternalUmlTextual.g:5930:1: rule__UseCase__Group_6_1_1__5 : rule__UseCase__Group_6_1_1__5__Impl ;
    public final void rule__UseCase__Group_6_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5934:1: ( rule__UseCase__Group_6_1_1__5__Impl )
            // InternalUmlTextual.g:5935:2: rule__UseCase__Group_6_1_1__5__Impl
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
    // InternalUmlTextual.g:5941:1: rule__UseCase__Group_6_1_1__5__Impl : ( ( rule__UseCase__Group_6_1_1_5__0 )* ) ;
    public final void rule__UseCase__Group_6_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5945:1: ( ( ( rule__UseCase__Group_6_1_1_5__0 )* ) )
            // InternalUmlTextual.g:5946:1: ( ( rule__UseCase__Group_6_1_1_5__0 )* )
            {
            // InternalUmlTextual.g:5946:1: ( ( rule__UseCase__Group_6_1_1_5__0 )* )
            // InternalUmlTextual.g:5947:2: ( rule__UseCase__Group_6_1_1_5__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_1_5()); 
            // InternalUmlTextual.g:5948:2: ( rule__UseCase__Group_6_1_1_5__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==33) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalUmlTextual.g:5948:3: rule__UseCase__Group_6_1_1_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__UseCase__Group_6_1_1_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalUmlTextual.g:5957:1: rule__UseCase__Group_6_1_1_2__0 : rule__UseCase__Group_6_1_1_2__0__Impl rule__UseCase__Group_6_1_1_2__1 ;
    public final void rule__UseCase__Group_6_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5961:1: ( rule__UseCase__Group_6_1_1_2__0__Impl rule__UseCase__Group_6_1_1_2__1 )
            // InternalUmlTextual.g:5962:2: rule__UseCase__Group_6_1_1_2__0__Impl rule__UseCase__Group_6_1_1_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:5969:1: rule__UseCase__Group_6_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5973:1: ( ( ',' ) )
            // InternalUmlTextual.g:5974:1: ( ',' )
            {
            // InternalUmlTextual.g:5974:1: ( ',' )
            // InternalUmlTextual.g:5975:2: ','
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
    // InternalUmlTextual.g:5984:1: rule__UseCase__Group_6_1_1_2__1 : rule__UseCase__Group_6_1_1_2__1__Impl ;
    public final void rule__UseCase__Group_6_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5988:1: ( rule__UseCase__Group_6_1_1_2__1__Impl )
            // InternalUmlTextual.g:5989:2: rule__UseCase__Group_6_1_1_2__1__Impl
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
    // InternalUmlTextual.g:5995:1: rule__UseCase__Group_6_1_1_2__1__Impl : ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 ) ) ;
    public final void rule__UseCase__Group_6_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5999:1: ( ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 ) ) )
            // InternalUmlTextual.g:6000:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 ) )
            {
            // InternalUmlTextual.g:6000:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 ) )
            // InternalUmlTextual.g:6001:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_1_2_1()); 
            // InternalUmlTextual.g:6002:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 )
            // InternalUmlTextual.g:6002:3: rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_1_2_1()); 

            }


            }

        }
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
    // InternalUmlTextual.g:6011:1: rule__UseCase__Group_6_1_1_5__0 : rule__UseCase__Group_6_1_1_5__0__Impl rule__UseCase__Group_6_1_1_5__1 ;
    public final void rule__UseCase__Group_6_1_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6015:1: ( rule__UseCase__Group_6_1_1_5__0__Impl rule__UseCase__Group_6_1_1_5__1 )
            // InternalUmlTextual.g:6016:2: rule__UseCase__Group_6_1_1_5__0__Impl rule__UseCase__Group_6_1_1_5__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:6023:1: rule__UseCase__Group_6_1_1_5__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6027:1: ( ( ',' ) )
            // InternalUmlTextual.g:6028:1: ( ',' )
            {
            // InternalUmlTextual.g:6028:1: ( ',' )
            // InternalUmlTextual.g:6029:2: ','
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
    // InternalUmlTextual.g:6038:1: rule__UseCase__Group_6_1_1_5__1 : rule__UseCase__Group_6_1_1_5__1__Impl ;
    public final void rule__UseCase__Group_6_1_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6042:1: ( rule__UseCase__Group_6_1_1_5__1__Impl )
            // InternalUmlTextual.g:6043:2: rule__UseCase__Group_6_1_1_5__1__Impl
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
    // InternalUmlTextual.g:6049:1: rule__UseCase__Group_6_1_1_5__1__Impl : ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 ) ) ;
    public final void rule__UseCase__Group_6_1_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6053:1: ( ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 ) ) )
            // InternalUmlTextual.g:6054:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 ) )
            {
            // InternalUmlTextual.g:6054:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 ) )
            // InternalUmlTextual.g:6055:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_1_5_1()); 
            // InternalUmlTextual.g:6056:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 )
            // InternalUmlTextual.g:6056:3: rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1
            {
            pushFollow(FOLLOW_2);
            rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_1_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalUmlTextual.g:6065:1: rule__Model__ElementsAssignment : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6069:1: ( ( ruleModelElement ) )
            // InternalUmlTextual.g:6070:2: ( ruleModelElement )
            {
            // InternalUmlTextual.g:6070:2: ( ruleModelElement )
            // InternalUmlTextual.g:6071:3: ruleModelElement
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


    // $ANTLR start "rule__Package__InstantiableAssignment_0"
    // InternalUmlTextual.g:6080:1: rule__Package__InstantiableAssignment_0 : ( ( 'instantiable' ) ) ;
    public final void rule__Package__InstantiableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6084:1: ( ( ( 'instantiable' ) ) )
            // InternalUmlTextual.g:6085:2: ( ( 'instantiable' ) )
            {
            // InternalUmlTextual.g:6085:2: ( ( 'instantiable' ) )
            // InternalUmlTextual.g:6086:3: ( 'instantiable' )
            {
             before(grammarAccess.getPackageAccess().getInstantiableInstantiableKeyword_0_0()); 
            // InternalUmlTextual.g:6087:3: ( 'instantiable' )
            // InternalUmlTextual.g:6088:4: 'instantiable'
            {
             before(grammarAccess.getPackageAccess().getInstantiableInstantiableKeyword_0_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getInstantiableInstantiableKeyword_0_0()); 

            }

             after(grammarAccess.getPackageAccess().getInstantiableInstantiableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__InstantiableAssignment_0"


    // $ANTLR start "rule__Package__TypeAssignment_1"
    // InternalUmlTextual.g:6099:1: rule__Package__TypeAssignment_1 : ( ( rule__Package__TypeAlternatives_1_0 ) ) ;
    public final void rule__Package__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6103:1: ( ( ( rule__Package__TypeAlternatives_1_0 ) ) )
            // InternalUmlTextual.g:6104:2: ( ( rule__Package__TypeAlternatives_1_0 ) )
            {
            // InternalUmlTextual.g:6104:2: ( ( rule__Package__TypeAlternatives_1_0 ) )
            // InternalUmlTextual.g:6105:3: ( rule__Package__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getPackageAccess().getTypeAlternatives_1_0()); 
            // InternalUmlTextual.g:6106:3: ( rule__Package__TypeAlternatives_1_0 )
            // InternalUmlTextual.g:6106:4: rule__Package__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTypeAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__TypeAssignment_1"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // InternalUmlTextual.g:6114:1: rule__Package__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6118:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6119:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6119:2: ( RULE_ID )
            // InternalUmlTextual.g:6120:3: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__ParentPackageAssignment_3_2"
    // InternalUmlTextual.g:6129:1: rule__Package__ParentPackageAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Package__ParentPackageAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6133:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6134:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6134:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6135:3: ( RULE_ID )
            {
             before(grammarAccess.getPackageAccess().getParentPackagePackageCrossReference_3_2_0()); 
            // InternalUmlTextual.g:6136:3: ( RULE_ID )
            // InternalUmlTextual.g:6137:4: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getParentPackagePackageIDTerminalRuleCall_3_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getParentPackagePackageIDTerminalRuleCall_3_2_0_1()); 

            }

             after(grammarAccess.getPackageAccess().getParentPackagePackageCrossReference_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ParentPackageAssignment_3_2"


    // $ANTLR start "rule__Package__DomainSpecificTypesAssignment_5"
    // InternalUmlTextual.g:6148:1: rule__Package__DomainSpecificTypesAssignment_5 : ( ruleDomainSpecificType ) ;
    public final void rule__Package__DomainSpecificTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6152:1: ( ( ruleDomainSpecificType ) )
            // InternalUmlTextual.g:6153:2: ( ruleDomainSpecificType )
            {
            // InternalUmlTextual.g:6153:2: ( ruleDomainSpecificType )
            // InternalUmlTextual.g:6154:3: ruleDomainSpecificType
            {
             before(grammarAccess.getPackageAccess().getDomainSpecificTypesDomainSpecificTypeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainSpecificType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getDomainSpecificTypesDomainSpecificTypeParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__DomainSpecificTypesAssignment_5"


    // $ANTLR start "rule__Package__ElementsAssignment_6"
    // InternalUmlTextual.g:6163:1: rule__Package__ElementsAssignment_6 : ( ruleElement ) ;
    public final void rule__Package__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6167:1: ( ( ruleElement ) )
            // InternalUmlTextual.g:6168:2: ( ruleElement )
            {
            // InternalUmlTextual.g:6168:2: ( ruleElement )
            // InternalUmlTextual.g:6169:3: ruleElement
            {
             before(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementsElementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ElementsAssignment_6"


    // $ANTLR start "rule__Class__StereotypeAssignment_0_1"
    // InternalUmlTextual.g:6178:1: rule__Class__StereotypeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Class__StereotypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6182:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6183:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6183:2: ( RULE_ID )
            // InternalUmlTextual.g:6184:3: RULE_ID
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
    // InternalUmlTextual.g:6193:1: rule__Class__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6197:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6198:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6198:2: ( ruleVisibility )
            // InternalUmlTextual.g:6199:3: ruleVisibility
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
    // InternalUmlTextual.g:6208:1: rule__Class__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6212:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6213:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6213:2: ( RULE_ID )
            // InternalUmlTextual.g:6214:3: RULE_ID
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
    // InternalUmlTextual.g:6223:1: rule__Class__ParentClassAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__ParentClassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6227:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6228:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6228:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6229:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getParentClassClassCrossReference_4_1_0()); 
            // InternalUmlTextual.g:6230:3: ( RULE_ID )
            // InternalUmlTextual.g:6231:4: RULE_ID
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


    // $ANTLR start "rule__Class__InterfacesAssignment_5_1"
    // InternalUmlTextual.g:6242:1: rule__Class__InterfacesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__InterfacesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6246:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6247:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6247:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6248:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getInterfacesInterfaceCrossReference_5_1_0()); 
            // InternalUmlTextual.g:6249:3: ( RULE_ID )
            // InternalUmlTextual.g:6250:4: RULE_ID
            {
             before(grammarAccess.getClassAccess().getInterfacesInterfaceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getInterfacesInterfaceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getInterfacesInterfaceCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__InterfacesAssignment_5_1"


    // $ANTLR start "rule__Class__InterfacesAssignment_5_2_1"
    // InternalUmlTextual.g:6261:1: rule__Class__InterfacesAssignment_5_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Class__InterfacesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6265:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6266:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6266:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6267:3: ( RULE_ID )
            {
             before(grammarAccess.getClassAccess().getInterfacesInterfaceCrossReference_5_2_1_0()); 
            // InternalUmlTextual.g:6268:3: ( RULE_ID )
            // InternalUmlTextual.g:6269:4: RULE_ID
            {
             before(grammarAccess.getClassAccess().getInterfacesInterfaceIDTerminalRuleCall_5_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getInterfacesInterfaceIDTerminalRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getInterfacesInterfaceCrossReference_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__InterfacesAssignment_5_2_1"


    // $ANTLR start "rule__Class__AttributesAssignment_7"
    // InternalUmlTextual.g:6280:1: rule__Class__AttributesAssignment_7 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6284:1: ( ( ruleAttribute ) )
            // InternalUmlTextual.g:6285:2: ( ruleAttribute )
            {
            // InternalUmlTextual.g:6285:2: ( ruleAttribute )
            // InternalUmlTextual.g:6286:3: ruleAttribute
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
    // InternalUmlTextual.g:6295:1: rule__Class__MethodsAssignment_8 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6299:1: ( ( ruleMethod ) )
            // InternalUmlTextual.g:6300:2: ( ruleMethod )
            {
            // InternalUmlTextual.g:6300:2: ( ruleMethod )
            // InternalUmlTextual.g:6301:3: ruleMethod
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
    // InternalUmlTextual.g:6310:1: rule__Interface__StereotypeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Interface__StereotypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6314:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6315:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6315:2: ( RULE_ID )
            // InternalUmlTextual.g:6316:3: RULE_ID
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
    // InternalUmlTextual.g:6325:1: rule__Interface__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Interface__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6329:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6330:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6330:2: ( ruleVisibility )
            // InternalUmlTextual.g:6331:3: ruleVisibility
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
    // InternalUmlTextual.g:6340:1: rule__Interface__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6344:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6345:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6345:2: ( RULE_ID )
            // InternalUmlTextual.g:6346:3: RULE_ID
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


    // $ANTLR start "rule__Interface__ParentInterfaceAssignment_4_1"
    // InternalUmlTextual.g:6355:1: rule__Interface__ParentInterfaceAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Interface__ParentInterfaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6359:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6360:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6360:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6361:3: ( RULE_ID )
            {
             before(grammarAccess.getInterfaceAccess().getParentInterfaceInterfaceCrossReference_4_1_0()); 
            // InternalUmlTextual.g:6362:3: ( RULE_ID )
            // InternalUmlTextual.g:6363:4: RULE_ID
            {
             before(grammarAccess.getInterfaceAccess().getParentInterfaceInterfaceIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInterfaceAccess().getParentInterfaceInterfaceIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getInterfaceAccess().getParentInterfaceInterfaceCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interface__ParentInterfaceAssignment_4_1"


    // $ANTLR start "rule__Interface__AttributesAssignment_6"
    // InternalUmlTextual.g:6374:1: rule__Interface__AttributesAssignment_6 : ( ruleAttribute ) ;
    public final void rule__Interface__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6378:1: ( ( ruleAttribute ) )
            // InternalUmlTextual.g:6379:2: ( ruleAttribute )
            {
            // InternalUmlTextual.g:6379:2: ( ruleAttribute )
            // InternalUmlTextual.g:6380:3: ruleAttribute
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
    // InternalUmlTextual.g:6389:1: rule__AttributeType__NameAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__AttributeType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6393:1: ( ( ( 'string' ) ) )
            // InternalUmlTextual.g:6394:2: ( ( 'string' ) )
            {
            // InternalUmlTextual.g:6394:2: ( ( 'string' ) )
            // InternalUmlTextual.g:6395:3: ( 'string' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameStringKeyword_0_0()); 
            // InternalUmlTextual.g:6396:3: ( 'string' )
            // InternalUmlTextual.g:6397:4: 'string'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameStringKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalUmlTextual.g:6408:1: rule__AttributeType__NameAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__AttributeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6412:1: ( ( ( 'int' ) ) )
            // InternalUmlTextual.g:6413:2: ( ( 'int' ) )
            {
            // InternalUmlTextual.g:6413:2: ( ( 'int' ) )
            // InternalUmlTextual.g:6414:3: ( 'int' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameIntKeyword_1_0()); 
            // InternalUmlTextual.g:6415:3: ( 'int' )
            // InternalUmlTextual.g:6416:4: 'int'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameIntKeyword_1_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalUmlTextual.g:6427:1: rule__AttributeType__NameAssignment_2 : ( ( 'double' ) ) ;
    public final void rule__AttributeType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6431:1: ( ( ( 'double' ) ) )
            // InternalUmlTextual.g:6432:2: ( ( 'double' ) )
            {
            // InternalUmlTextual.g:6432:2: ( ( 'double' ) )
            // InternalUmlTextual.g:6433:3: ( 'double' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameDoubleKeyword_2_0()); 
            // InternalUmlTextual.g:6434:3: ( 'double' )
            // InternalUmlTextual.g:6435:4: 'double'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameDoubleKeyword_2_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalUmlTextual.g:6446:1: rule__AttributeType__NameAssignment_3 : ( ( 'boolean' ) ) ;
    public final void rule__AttributeType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6450:1: ( ( ( 'boolean' ) ) )
            // InternalUmlTextual.g:6451:2: ( ( 'boolean' ) )
            {
            // InternalUmlTextual.g:6451:2: ( ( 'boolean' ) )
            // InternalUmlTextual.g:6452:3: ( 'boolean' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_3_0()); 
            // InternalUmlTextual.g:6453:3: ( 'boolean' )
            // InternalUmlTextual.g:6454:4: 'boolean'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_3_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalUmlTextual.g:6465:1: rule__AttributeType__NameAssignment_4 : ( ( 'byte' ) ) ;
    public final void rule__AttributeType__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6469:1: ( ( ( 'byte' ) ) )
            // InternalUmlTextual.g:6470:2: ( ( 'byte' ) )
            {
            // InternalUmlTextual.g:6470:2: ( ( 'byte' ) )
            // InternalUmlTextual.g:6471:3: ( 'byte' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameByteKeyword_4_0()); 
            // InternalUmlTextual.g:6472:3: ( 'byte' )
            // InternalUmlTextual.g:6473:4: 'byte'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameByteKeyword_4_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalUmlTextual.g:6484:1: rule__AttributeType__NameAssignment_5 : ( ( 'char' ) ) ;
    public final void rule__AttributeType__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6488:1: ( ( ( 'char' ) ) )
            // InternalUmlTextual.g:6489:2: ( ( 'char' ) )
            {
            // InternalUmlTextual.g:6489:2: ( ( 'char' ) )
            // InternalUmlTextual.g:6490:3: ( 'char' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameCharKeyword_5_0()); 
            // InternalUmlTextual.g:6491:3: ( 'char' )
            // InternalUmlTextual.g:6492:4: 'char'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameCharKeyword_5_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalUmlTextual.g:6503:1: rule__AttributeType__NameAssignment_6 : ( ( 'float' ) ) ;
    public final void rule__AttributeType__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6507:1: ( ( ( 'float' ) ) )
            // InternalUmlTextual.g:6508:2: ( ( 'float' ) )
            {
            // InternalUmlTextual.g:6508:2: ( ( 'float' ) )
            // InternalUmlTextual.g:6509:3: ( 'float' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameFloatKeyword_6_0()); 
            // InternalUmlTextual.g:6510:3: ( 'float' )
            // InternalUmlTextual.g:6511:4: 'float'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameFloatKeyword_6_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalUmlTextual.g:6522:1: rule__AttributeType__NameAssignment_7 : ( ( 'short' ) ) ;
    public final void rule__AttributeType__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6526:1: ( ( ( 'short' ) ) )
            // InternalUmlTextual.g:6527:2: ( ( 'short' ) )
            {
            // InternalUmlTextual.g:6527:2: ( ( 'short' ) )
            // InternalUmlTextual.g:6528:3: ( 'short' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameShortKeyword_7_0()); 
            // InternalUmlTextual.g:6529:3: ( 'short' )
            // InternalUmlTextual.g:6530:4: 'short'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameShortKeyword_7_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalUmlTextual.g:6541:1: rule__AttributeType__NameAssignment_8 : ( ( 'long' ) ) ;
    public final void rule__AttributeType__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6545:1: ( ( ( 'long' ) ) )
            // InternalUmlTextual.g:6546:2: ( ( 'long' ) )
            {
            // InternalUmlTextual.g:6546:2: ( ( 'long' ) )
            // InternalUmlTextual.g:6547:3: ( 'long' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameLongKeyword_8_0()); 
            // InternalUmlTextual.g:6548:3: ( 'long' )
            // InternalUmlTextual.g:6549:4: 'long'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameLongKeyword_8_0()); 
            match(input,71,FOLLOW_2); 
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


    // $ANTLR start "rule__AttributeType__DomainTypeAssignment_9"
    // InternalUmlTextual.g:6560:1: rule__AttributeType__DomainTypeAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeType__DomainTypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6564:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6565:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6565:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6566:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeTypeAccess().getDomainTypeDomainSpecificTypeCrossReference_9_0()); 
            // InternalUmlTextual.g:6567:3: ( RULE_ID )
            // InternalUmlTextual.g:6568:4: RULE_ID
            {
             before(grammarAccess.getAttributeTypeAccess().getDomainTypeDomainSpecificTypeIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getDomainTypeDomainSpecificTypeIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getAttributeTypeAccess().getDomainTypeDomainSpecificTypeCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__DomainTypeAssignment_9"


    // $ANTLR start "rule__DomainSpecificType__NameAssignment_1"
    // InternalUmlTextual.g:6579:1: rule__DomainSpecificType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainSpecificType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6583:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6584:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6584:2: ( RULE_ID )
            // InternalUmlTextual.g:6585:3: RULE_ID
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificType__NameAssignment_1"


    // $ANTLR start "rule__DomainSpecificType__DescriptionAssignment_3"
    // InternalUmlTextual.g:6594:1: rule__DomainSpecificType__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DomainSpecificType__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6598:1: ( ( RULE_STRING ) )
            // InternalUmlTextual.g:6599:2: ( RULE_STRING )
            {
            // InternalUmlTextual.g:6599:2: ( RULE_STRING )
            // InternalUmlTextual.g:6600:3: RULE_STRING
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDomainSpecificTypeAccess().getDescriptionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainSpecificType__DescriptionAssignment_3"


    // $ANTLR start "rule__Attribute__VisibilityAssignment_0"
    // InternalUmlTextual.g:6609:1: rule__Attribute__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6613:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6614:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6614:2: ( ruleVisibility )
            // InternalUmlTextual.g:6615:3: ruleVisibility
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
    // InternalUmlTextual.g:6624:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6628:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6629:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6629:2: ( RULE_ID )
            // InternalUmlTextual.g:6630:3: RULE_ID
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
    // InternalUmlTextual.g:6639:1: rule__Attribute__TypeAssignment_4 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6643:1: ( ( ruleAttributeType ) )
            // InternalUmlTextual.g:6644:2: ( ruleAttributeType )
            {
            // InternalUmlTextual.g:6644:2: ( ruleAttributeType )
            // InternalUmlTextual.g:6645:3: ruleAttributeType
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
    // InternalUmlTextual.g:6654:1: rule__Attribute__MultiplicityAssignment_5_1 : ( ruleMultiplicity ) ;
    public final void rule__Attribute__MultiplicityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6658:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6659:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6659:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6660:3: ruleMultiplicity
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
    // InternalUmlTextual.g:6669:1: rule__Method__VisibilityAssignment_2 : ( ruleVisibility ) ;
    public final void rule__Method__VisibilityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6673:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6674:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6674:2: ( ruleVisibility )
            // InternalUmlTextual.g:6675:3: ruleVisibility
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
    // InternalUmlTextual.g:6684:1: rule__Method__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6688:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6689:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6689:2: ( RULE_ID )
            // InternalUmlTextual.g:6690:3: RULE_ID
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
    // InternalUmlTextual.g:6699:1: rule__Method__ParametersAssignment_6 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6703:1: ( ( ruleParameter ) )
            // InternalUmlTextual.g:6704:2: ( ruleParameter )
            {
            // InternalUmlTextual.g:6704:2: ( ruleParameter )
            // InternalUmlTextual.g:6705:3: ruleParameter
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


    // $ANTLR start "rule__Method__ParametersAssignment_7_1"
    // InternalUmlTextual.g:6714:1: rule__Method__ParametersAssignment_7_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6718:1: ( ( ruleParameter ) )
            // InternalUmlTextual.g:6719:2: ( ruleParameter )
            {
            // InternalUmlTextual.g:6719:2: ( ruleParameter )
            // InternalUmlTextual.g:6720:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_7_1"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_10"
    // InternalUmlTextual.g:6729:1: rule__Method__ReturnTypeAssignment_10 : ( ruleAttributeType ) ;
    public final void rule__Method__ReturnTypeAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6733:1: ( ( ruleAttributeType ) )
            // InternalUmlTextual.g:6734:2: ( ruleAttributeType )
            {
            // InternalUmlTextual.g:6734:2: ( ruleAttributeType )
            // InternalUmlTextual.g:6735:3: ruleAttributeType
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAttributeTypeParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getReturnTypeAttributeTypeParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ReturnTypeAssignment_10"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalUmlTextual.g:6744:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6748:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6749:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6749:2: ( RULE_ID )
            // InternalUmlTextual.g:6750:3: RULE_ID
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
    // InternalUmlTextual.g:6759:1: rule__Parameter__ParameterTypeAssignment_2 : ( ruleAttributeType ) ;
    public final void rule__Parameter__ParameterTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6763:1: ( ( ruleAttributeType ) )
            // InternalUmlTextual.g:6764:2: ( ruleAttributeType )
            {
            // InternalUmlTextual.g:6764:2: ( ruleAttributeType )
            // InternalUmlTextual.g:6765:3: ruleAttributeType
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
    // InternalUmlTextual.g:6774:1: rule__Association__NameAssignment_2 : ( ( rule__Association__NameAlternatives_2_0 ) ) ;
    public final void rule__Association__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6778:1: ( ( ( rule__Association__NameAlternatives_2_0 ) ) )
            // InternalUmlTextual.g:6779:2: ( ( rule__Association__NameAlternatives_2_0 ) )
            {
            // InternalUmlTextual.g:6779:2: ( ( rule__Association__NameAlternatives_2_0 ) )
            // InternalUmlTextual.g:6780:3: ( rule__Association__NameAlternatives_2_0 )
            {
             before(grammarAccess.getAssociationAccess().getNameAlternatives_2_0()); 
            // InternalUmlTextual.g:6781:3: ( rule__Association__NameAlternatives_2_0 )
            // InternalUmlTextual.g:6781:4: rule__Association__NameAlternatives_2_0
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
    // InternalUmlTextual.g:6789:1: rule__Association__Navigation1Assignment_5 : ( ruleNavigation ) ;
    public final void rule__Association__Navigation1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6793:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:6794:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:6794:2: ( ruleNavigation )
            // InternalUmlTextual.g:6795:3: ruleNavigation
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
    // InternalUmlTextual.g:6804:1: rule__Association__Class1Assignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Association__Class1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6808:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6809:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6809:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6810:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getClass1ClassCrossReference_6_0()); 
            // InternalUmlTextual.g:6811:3: ( RULE_ID )
            // InternalUmlTextual.g:6812:4: RULE_ID
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
    // InternalUmlTextual.g:6823:1: rule__Association__Multiplicity1Assignment_8 : ( ruleMultiplicity ) ;
    public final void rule__Association__Multiplicity1Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6827:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6828:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6828:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6829:3: ruleMultiplicity
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
    // InternalUmlTextual.g:6838:1: rule__Association__Navigation2Assignment_11 : ( ruleNavigation ) ;
    public final void rule__Association__Navigation2Assignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6842:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:6843:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:6843:2: ( ruleNavigation )
            // InternalUmlTextual.g:6844:3: ruleNavigation
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
    // InternalUmlTextual.g:6853:1: rule__Association__Class2Assignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Association__Class2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6857:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6858:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6858:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6859:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getClass2ClassCrossReference_12_0()); 
            // InternalUmlTextual.g:6860:3: ( RULE_ID )
            // InternalUmlTextual.g:6861:4: RULE_ID
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
    // InternalUmlTextual.g:6872:1: rule__Association__Multiplicity2Assignment_14 : ( ruleMultiplicity ) ;
    public final void rule__Association__Multiplicity2Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6876:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6877:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6877:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6878:3: ruleMultiplicity
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
    // InternalUmlTextual.g:6887:1: rule__Association__ClassAssignment_16_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__ClassAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6891:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6892:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6892:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6893:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getClassClassCrossReference_16_2_0()); 
            // InternalUmlTextual.g:6894:3: ( RULE_ID )
            // InternalUmlTextual.g:6895:4: RULE_ID
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
    // InternalUmlTextual.g:6906:1: rule__Aggregation__NameAssignment_1 : ( ( rule__Aggregation__NameAlternatives_1_0 ) ) ;
    public final void rule__Aggregation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6910:1: ( ( ( rule__Aggregation__NameAlternatives_1_0 ) ) )
            // InternalUmlTextual.g:6911:2: ( ( rule__Aggregation__NameAlternatives_1_0 ) )
            {
            // InternalUmlTextual.g:6911:2: ( ( rule__Aggregation__NameAlternatives_1_0 ) )
            // InternalUmlTextual.g:6912:3: ( rule__Aggregation__NameAlternatives_1_0 )
            {
             before(grammarAccess.getAggregationAccess().getNameAlternatives_1_0()); 
            // InternalUmlTextual.g:6913:3: ( rule__Aggregation__NameAlternatives_1_0 )
            // InternalUmlTextual.g:6913:4: rule__Aggregation__NameAlternatives_1_0
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
    // InternalUmlTextual.g:6921:1: rule__Aggregation__Class1Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Aggregation__Class1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6925:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6926:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6926:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6927:3: ( RULE_ID )
            {
             before(grammarAccess.getAggregationAccess().getClass1ClassCrossReference_4_0()); 
            // InternalUmlTextual.g:6928:3: ( RULE_ID )
            // InternalUmlTextual.g:6929:4: RULE_ID
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
    // InternalUmlTextual.g:6940:1: rule__Aggregation__Multiplicity1Assignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Aggregation__Multiplicity1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6944:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6945:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6945:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6946:3: ruleMultiplicity
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
    // InternalUmlTextual.g:6955:1: rule__Aggregation__NavigationAssignment_9 : ( ruleNavigation ) ;
    public final void rule__Aggregation__NavigationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6959:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:6960:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:6960:2: ( ruleNavigation )
            // InternalUmlTextual.g:6961:3: ruleNavigation
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
    // InternalUmlTextual.g:6970:1: rule__Aggregation__Class2Assignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Aggregation__Class2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6974:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6975:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6975:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6976:3: ( RULE_ID )
            {
             before(grammarAccess.getAggregationAccess().getClass2ClassCrossReference_10_0()); 
            // InternalUmlTextual.g:6977:3: ( RULE_ID )
            // InternalUmlTextual.g:6978:4: RULE_ID
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
    // InternalUmlTextual.g:6989:1: rule__Aggregation__Multiplicity2Assignment_12 : ( ruleMultiplicity ) ;
    public final void rule__Aggregation__Multiplicity2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6993:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6994:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6994:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6995:3: ruleMultiplicity
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
    // InternalUmlTextual.g:7004:1: rule__Composition__NameAssignment_1 : ( ( rule__Composition__NameAlternatives_1_0 ) ) ;
    public final void rule__Composition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7008:1: ( ( ( rule__Composition__NameAlternatives_1_0 ) ) )
            // InternalUmlTextual.g:7009:2: ( ( rule__Composition__NameAlternatives_1_0 ) )
            {
            // InternalUmlTextual.g:7009:2: ( ( rule__Composition__NameAlternatives_1_0 ) )
            // InternalUmlTextual.g:7010:3: ( rule__Composition__NameAlternatives_1_0 )
            {
             before(grammarAccess.getCompositionAccess().getNameAlternatives_1_0()); 
            // InternalUmlTextual.g:7011:3: ( rule__Composition__NameAlternatives_1_0 )
            // InternalUmlTextual.g:7011:4: rule__Composition__NameAlternatives_1_0
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
    // InternalUmlTextual.g:7019:1: rule__Composition__Class1Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Composition__Class1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7023:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7024:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7024:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7025:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionAccess().getClass1ClassCrossReference_4_0()); 
            // InternalUmlTextual.g:7026:3: ( RULE_ID )
            // InternalUmlTextual.g:7027:4: RULE_ID
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
    // InternalUmlTextual.g:7038:1: rule__Composition__Multiplicity1Assignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Composition__Multiplicity1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7042:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:7043:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:7043:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:7044:3: ruleMultiplicity
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
    // InternalUmlTextual.g:7053:1: rule__Composition__NavigationAssignment_9 : ( ruleNavigation ) ;
    public final void rule__Composition__NavigationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7057:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:7058:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:7058:2: ( ruleNavigation )
            // InternalUmlTextual.g:7059:3: ruleNavigation
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
    // InternalUmlTextual.g:7068:1: rule__Composition__Class2Assignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Composition__Class2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7072:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7073:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7073:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7074:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionAccess().getClass2ClassCrossReference_10_0()); 
            // InternalUmlTextual.g:7075:3: ( RULE_ID )
            // InternalUmlTextual.g:7076:4: RULE_ID
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
    // InternalUmlTextual.g:7087:1: rule__Composition__Multiplicity2Assignment_12 : ( ruleMultiplicity ) ;
    public final void rule__Composition__Multiplicity2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7091:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:7092:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:7092:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:7093:3: ruleMultiplicity
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
    // InternalUmlTextual.g:7102:1: rule__UseCaseDiagram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__UseCaseDiagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7106:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7107:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:7107:2: ( RULE_ID )
            // InternalUmlTextual.g:7108:3: RULE_ID
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
    // InternalUmlTextual.g:7117:1: rule__UseCaseDiagram__ElementsAssignment_4 : ( ruleUseCaseElement ) ;
    public final void rule__UseCaseDiagram__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7121:1: ( ( ruleUseCaseElement ) )
            // InternalUmlTextual.g:7122:2: ( ruleUseCaseElement )
            {
            // InternalUmlTextual.g:7122:2: ( ruleUseCaseElement )
            // InternalUmlTextual.g:7123:3: ruleUseCaseElement
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
    // InternalUmlTextual.g:7132:1: rule__Actor__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Actor__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7136:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:7137:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:7137:2: ( ruleVisibility )
            // InternalUmlTextual.g:7138:3: ruleVisibility
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
    // InternalUmlTextual.g:7147:1: rule__Actor__AbstractAssignment_1 : ( ruleAbstract ) ;
    public final void rule__Actor__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7151:1: ( ( ruleAbstract ) )
            // InternalUmlTextual.g:7152:2: ( ruleAbstract )
            {
            // InternalUmlTextual.g:7152:2: ( ruleAbstract )
            // InternalUmlTextual.g:7153:3: ruleAbstract
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
    // InternalUmlTextual.g:7162:1: rule__Actor__ActiveAssignment_2 : ( ruleActive ) ;
    public final void rule__Actor__ActiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7166:1: ( ( ruleActive ) )
            // InternalUmlTextual.g:7167:2: ( ruleActive )
            {
            // InternalUmlTextual.g:7167:2: ( ruleActive )
            // InternalUmlTextual.g:7168:3: ruleActive
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
    // InternalUmlTextual.g:7177:1: rule__Actor__BusinessAssignment_3 : ( ( 'business' ) ) ;
    public final void rule__Actor__BusinessAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7181:1: ( ( ( 'business' ) ) )
            // InternalUmlTextual.g:7182:2: ( ( 'business' ) )
            {
            // InternalUmlTextual.g:7182:2: ( ( 'business' ) )
            // InternalUmlTextual.g:7183:3: ( 'business' )
            {
             before(grammarAccess.getActorAccess().getBusinessBusinessKeyword_3_0()); 
            // InternalUmlTextual.g:7184:3: ( 'business' )
            // InternalUmlTextual.g:7185:4: 'business'
            {
             before(grammarAccess.getActorAccess().getBusinessBusinessKeyword_3_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalUmlTextual.g:7196:1: rule__Actor__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7200:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7201:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:7201:2: ( RULE_ID )
            // InternalUmlTextual.g:7202:3: RULE_ID
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
    // InternalUmlTextual.g:7211:1: rule__Actor__ParentActorAssignment_6_1 : ( ruleActor ) ;
    public final void rule__Actor__ParentActorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7215:1: ( ( ruleActor ) )
            // InternalUmlTextual.g:7216:2: ( ruleActor )
            {
            // InternalUmlTextual.g:7216:2: ( ruleActor )
            // InternalUmlTextual.g:7217:3: ruleActor
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


    // $ANTLR start "rule__Actor__UseCasesAssignment_8_1"
    // InternalUmlTextual.g:7226:1: rule__Actor__UseCasesAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__UseCasesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7230:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7231:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7231:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7232:3: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getUseCasesUseCaseCrossReference_8_1_0()); 
            // InternalUmlTextual.g:7233:3: ( RULE_ID )
            // InternalUmlTextual.g:7234:4: RULE_ID
            {
             before(grammarAccess.getActorAccess().getUseCasesUseCaseIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getUseCasesUseCaseIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getUseCasesUseCaseCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__UseCasesAssignment_8_1"


    // $ANTLR start "rule__Actor__UseCasesAssignment_8_2_1"
    // InternalUmlTextual.g:7245:1: rule__Actor__UseCasesAssignment_8_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__UseCasesAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7249:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7250:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7250:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7251:3: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getUseCasesUseCaseCrossReference_8_2_1_0()); 
            // InternalUmlTextual.g:7252:3: ( RULE_ID )
            // InternalUmlTextual.g:7253:4: RULE_ID
            {
             before(grammarAccess.getActorAccess().getUseCasesUseCaseIDTerminalRuleCall_8_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActorAccess().getUseCasesUseCaseIDTerminalRuleCall_8_2_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getUseCasesUseCaseCrossReference_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actor__UseCasesAssignment_8_2_1"


    // $ANTLR start "rule__UseCase__NameAssignment_1"
    // InternalUmlTextual.g:7264:1: rule__UseCase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7268:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7269:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:7269:2: ( RULE_ID )
            // InternalUmlTextual.g:7270:3: RULE_ID
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


    // $ANTLR start "rule__UseCase__IncludedUseCasesAssignment_2_1"
    // InternalUmlTextual.g:7279:1: rule__UseCase__IncludedUseCasesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__IncludedUseCasesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7283:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7284:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7284:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7285:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_2_1_0()); 
            // InternalUmlTextual.g:7286:3: ( RULE_ID )
            // InternalUmlTextual.g:7287:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__IncludedUseCasesAssignment_2_1"


    // $ANTLR start "rule__UseCase__ExtendedUseCasesAssignment_3_1"
    // InternalUmlTextual.g:7298:1: rule__UseCase__ExtendedUseCasesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ExtendedUseCasesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7302:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7303:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7303:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7304:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_3_1_0()); 
            // InternalUmlTextual.g:7305:3: ( RULE_ID )
            // InternalUmlTextual.g:7306:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ExtendedUseCasesAssignment_3_1"


    // $ANTLR start "rule__UseCase__DescriptionAssignment_5"
    // InternalUmlTextual.g:7317:1: rule__UseCase__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__UseCase__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7321:1: ( ( RULE_STRING ) )
            // InternalUmlTextual.g:7322:2: ( RULE_STRING )
            {
            // InternalUmlTextual.g:7322:2: ( RULE_STRING )
            // InternalUmlTextual.g:7323:3: RULE_STRING
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


    // $ANTLR start "rule__UseCase__IncludedUseCasesAssignment_6_1_0_1"
    // InternalUmlTextual.g:7332:1: rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__IncludedUseCasesAssignment_6_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7336:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7337:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7337:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7338:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_0_1_0()); 
            // InternalUmlTextual.g:7339:3: ( RULE_ID )
            // InternalUmlTextual.g:7340:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseIDTerminalRuleCall_6_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseIDTerminalRuleCall_6_1_0_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__IncludedUseCasesAssignment_6_1_0_1"


    // $ANTLR start "rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1"
    // InternalUmlTextual.g:7351:1: rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7355:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7356:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7356:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7357:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_0_2_1_0()); 
            // InternalUmlTextual.g:7358:3: ( RULE_ID )
            // InternalUmlTextual.g:7359:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseIDTerminalRuleCall_6_1_0_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseIDTerminalRuleCall_6_1_0_2_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1"


    // $ANTLR start "rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4"
    // InternalUmlTextual.g:7370:1: rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7374:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7375:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7375:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7376:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_0_4_0()); 
            // InternalUmlTextual.g:7377:3: ( RULE_ID )
            // InternalUmlTextual.g:7378:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseIDTerminalRuleCall_6_1_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseIDTerminalRuleCall_6_1_0_4_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4"


    // $ANTLR start "rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1"
    // InternalUmlTextual.g:7389:1: rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7393:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7394:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7394:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7395:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_0_5_1_0()); 
            // InternalUmlTextual.g:7396:3: ( RULE_ID )
            // InternalUmlTextual.g:7397:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseIDTerminalRuleCall_6_1_0_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseIDTerminalRuleCall_6_1_0_5_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_0_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1"


    // $ANTLR start "rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1"
    // InternalUmlTextual.g:7408:1: rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7412:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7413:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7413:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7414:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_1_1_0()); 
            // InternalUmlTextual.g:7415:3: ( RULE_ID )
            // InternalUmlTextual.g:7416:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseIDTerminalRuleCall_6_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseIDTerminalRuleCall_6_1_1_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1"


    // $ANTLR start "rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1"
    // InternalUmlTextual.g:7427:1: rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7431:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7432:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7432:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7433:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_1_2_1_0()); 
            // InternalUmlTextual.g:7434:3: ( RULE_ID )
            // InternalUmlTextual.g:7435:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseIDTerminalRuleCall_6_1_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseIDTerminalRuleCall_6_1_1_2_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1"


    // $ANTLR start "rule__UseCase__IncludedUseCasesAssignment_6_1_1_4"
    // InternalUmlTextual.g:7446:1: rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__IncludedUseCasesAssignment_6_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7450:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7451:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7451:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7452:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_1_4_0()); 
            // InternalUmlTextual.g:7453:3: ( RULE_ID )
            // InternalUmlTextual.g:7454:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseIDTerminalRuleCall_6_1_1_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseIDTerminalRuleCall_6_1_1_4_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__IncludedUseCasesAssignment_6_1_1_4"


    // $ANTLR start "rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1"
    // InternalUmlTextual.g:7465:1: rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7469:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:7470:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:7470:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7471:3: ( RULE_ID )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_1_5_1_0()); 
            // InternalUmlTextual.g:7472:3: ( RULE_ID )
            // InternalUmlTextual.g:7473:4: RULE_ID
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseIDTerminalRuleCall_6_1_1_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseIDTerminalRuleCall_6_1_1_5_1_0_1()); 

            }

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_1_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\17\1\5\4\35\3\uffff\1\17";
    static final String dfa_3s = "\1\70\1\5\4\42\3\uffff\1\42";
    static final String dfa_4s = "\6\uffff\1\1\1\2\1\3\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\uffff\1\2\1\3\1\4\11\uffff\1\6\1\1\3\uffff\1\10\16\uffff\2\7\4\uffff\2\7",
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
            return "719:1: rule__Element__Alternatives : ( ( ruleClass ) | ( ruleAssociationConnector ) | ( ruleInterface ) );";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\10\uffff\1\12\2\uffff";
    static final String dfa_9s = "\1\4\7\uffff\1\47\2\uffff";
    static final String dfa_10s = "\1\46\7\uffff\1\53\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\11\1\10";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\10\17\uffff\1\1\1\2\1\3\1\4\1\5\14\uffff\1\6\1\7",
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
            return "848:1: rule__Multiplicity__Alternatives : ( ( '1' ) | ( '0..1' ) | ( '0..*' ) | ( '*' ) | ( '1..*' ) | ( ( rule__Multiplicity__Group_5__0 ) ) | ( ( rule__Multiplicity__Group_6__0 ) ) | ( RULE_INT ) | ( ( rule__Multiplicity__Group_8__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4200000000018002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x4000000000018000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0186000C640E8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x01860004600E8002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000600E8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000182000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00003100040E8800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000100000E8002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00003000000E8802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x01860004600E8000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000082000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000100040E8000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000100000E8000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8000000000000020L,0x00000000000000FFL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000006001F00010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00003000000E8800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800200000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0020000004000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0A000000040E9800L,0x0000000000000100L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0A000000000E9802L,0x0000000000000100L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x08000000000E9800L,0x0000000000000100L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x1000000004000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000001080000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000080000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000200000000L});

}