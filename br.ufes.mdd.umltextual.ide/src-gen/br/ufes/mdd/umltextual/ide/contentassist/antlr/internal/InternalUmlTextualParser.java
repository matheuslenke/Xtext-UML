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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'abstract'", "'active'", "'unnamed'", "'navigable'", "'package'", "'subsystem'", "'public'", "'private'", "'protected'", "'1'", "'0..1'", "'0..*'", "'*'", "'1..*'", "'{'", "'}'", "'depends'", "'on'", "'.'", "'class'", "'@'", "'extends'", "'implements'", "','", "'interface'", "'domaintype'", "'='", "'0..'", "'1..'", "'..'", "'attr'", "':'", "'['", "']'", "'static'", "'function'", "'('", "')'", "'->'", "'undirected'", "'association'", "'from'", "'to'", "'with'", "'associatedclass'", "'aggregation'", "'composition'", "'usecase'", "'diagram'", "'actor'", "'uses'", "'includes'", "'instantiable'", "'string'", "'int'", "'double'", "'boolean'", "'byte'", "'char'", "'float'", "'short'", "'long'", "'business'"
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

                if ( ((LA1_0>=15 && LA1_0<=16)||LA1_0==58||LA1_0==63) ) {
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalUmlTextual.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalUmlTextual.g:132:1: ( ruleQualifiedName EOF )
            // InternalUmlTextual.g:133:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalUmlTextual.g:143:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:148:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalUmlTextual.g:149:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalUmlTextual.g:149:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalUmlTextual.g:150:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalUmlTextual.g:151:3: ( rule__QualifiedName__Group__0 )
            // InternalUmlTextual.g:151:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleElement"
    // InternalUmlTextual.g:161:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalUmlTextual.g:162:1: ( ruleElement EOF )
            // InternalUmlTextual.g:163:1: ruleElement EOF
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
    // InternalUmlTextual.g:170:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:174:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalUmlTextual.g:175:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalUmlTextual.g:175:2: ( ( rule__Element__Alternatives ) )
            // InternalUmlTextual.g:176:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalUmlTextual.g:177:3: ( rule__Element__Alternatives )
            // InternalUmlTextual.g:177:4: rule__Element__Alternatives
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
    // InternalUmlTextual.g:186:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalUmlTextual.g:187:1: ( ruleClass EOF )
            // InternalUmlTextual.g:188:1: ruleClass EOF
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
    // InternalUmlTextual.g:195:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:199:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalUmlTextual.g:200:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalUmlTextual.g:200:2: ( ( rule__Class__Group__0 ) )
            // InternalUmlTextual.g:201:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalUmlTextual.g:202:3: ( rule__Class__Group__0 )
            // InternalUmlTextual.g:202:4: rule__Class__Group__0
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
    // InternalUmlTextual.g:211:1: entryRuleInterface : ruleInterface EOF ;
    public final void entryRuleInterface() throws RecognitionException {
        try {
            // InternalUmlTextual.g:212:1: ( ruleInterface EOF )
            // InternalUmlTextual.g:213:1: ruleInterface EOF
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
    // InternalUmlTextual.g:220:1: ruleInterface : ( ( rule__Interface__Group__0 ) ) ;
    public final void ruleInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:224:2: ( ( ( rule__Interface__Group__0 ) ) )
            // InternalUmlTextual.g:225:2: ( ( rule__Interface__Group__0 ) )
            {
            // InternalUmlTextual.g:225:2: ( ( rule__Interface__Group__0 ) )
            // InternalUmlTextual.g:226:3: ( rule__Interface__Group__0 )
            {
             before(grammarAccess.getInterfaceAccess().getGroup()); 
            // InternalUmlTextual.g:227:3: ( rule__Interface__Group__0 )
            // InternalUmlTextual.g:227:4: rule__Interface__Group__0
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
    // InternalUmlTextual.g:236:1: entryRuleVisibility : ruleVisibility EOF ;
    public final void entryRuleVisibility() throws RecognitionException {
        try {
            // InternalUmlTextual.g:237:1: ( ruleVisibility EOF )
            // InternalUmlTextual.g:238:1: ruleVisibility EOF
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
    // InternalUmlTextual.g:245:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:249:2: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalUmlTextual.g:250:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalUmlTextual.g:250:2: ( ( rule__Visibility__Alternatives ) )
            // InternalUmlTextual.g:251:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalUmlTextual.g:252:3: ( rule__Visibility__Alternatives )
            // InternalUmlTextual.g:252:4: rule__Visibility__Alternatives
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
    // InternalUmlTextual.g:261:1: entryRuleAbstract : ruleAbstract EOF ;
    public final void entryRuleAbstract() throws RecognitionException {
        try {
            // InternalUmlTextual.g:262:1: ( ruleAbstract EOF )
            // InternalUmlTextual.g:263:1: ruleAbstract EOF
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
    // InternalUmlTextual.g:270:1: ruleAbstract : ( 'abstract' ) ;
    public final void ruleAbstract() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:274:2: ( ( 'abstract' ) )
            // InternalUmlTextual.g:275:2: ( 'abstract' )
            {
            // InternalUmlTextual.g:275:2: ( 'abstract' )
            // InternalUmlTextual.g:276:3: 'abstract'
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
    // InternalUmlTextual.g:286:1: entryRuleActive : ruleActive EOF ;
    public final void entryRuleActive() throws RecognitionException {
        try {
            // InternalUmlTextual.g:287:1: ( ruleActive EOF )
            // InternalUmlTextual.g:288:1: ruleActive EOF
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
    // InternalUmlTextual.g:295:1: ruleActive : ( 'active' ) ;
    public final void ruleActive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:299:2: ( ( 'active' ) )
            // InternalUmlTextual.g:300:2: ( 'active' )
            {
            // InternalUmlTextual.g:300:2: ( 'active' )
            // InternalUmlTextual.g:301:3: 'active'
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
    // InternalUmlTextual.g:311:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalUmlTextual.g:312:1: ( ruleAttributeType EOF )
            // InternalUmlTextual.g:313:1: ruleAttributeType EOF
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
    // InternalUmlTextual.g:320:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:324:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalUmlTextual.g:325:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalUmlTextual.g:325:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalUmlTextual.g:326:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalUmlTextual.g:327:3: ( rule__AttributeType__Alternatives )
            // InternalUmlTextual.g:327:4: rule__AttributeType__Alternatives
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
    // InternalUmlTextual.g:336:1: entryRuleDomainSpecificType : ruleDomainSpecificType EOF ;
    public final void entryRuleDomainSpecificType() throws RecognitionException {
        try {
            // InternalUmlTextual.g:337:1: ( ruleDomainSpecificType EOF )
            // InternalUmlTextual.g:338:1: ruleDomainSpecificType EOF
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
    // InternalUmlTextual.g:345:1: ruleDomainSpecificType : ( ( rule__DomainSpecificType__Group__0 ) ) ;
    public final void ruleDomainSpecificType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:349:2: ( ( ( rule__DomainSpecificType__Group__0 ) ) )
            // InternalUmlTextual.g:350:2: ( ( rule__DomainSpecificType__Group__0 ) )
            {
            // InternalUmlTextual.g:350:2: ( ( rule__DomainSpecificType__Group__0 ) )
            // InternalUmlTextual.g:351:3: ( rule__DomainSpecificType__Group__0 )
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getGroup()); 
            // InternalUmlTextual.g:352:3: ( rule__DomainSpecificType__Group__0 )
            // InternalUmlTextual.g:352:4: rule__DomainSpecificType__Group__0
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
    // InternalUmlTextual.g:361:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalUmlTextual.g:362:1: ( ruleMultiplicity EOF )
            // InternalUmlTextual.g:363:1: ruleMultiplicity EOF
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
    // InternalUmlTextual.g:370:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:374:2: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalUmlTextual.g:375:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalUmlTextual.g:375:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalUmlTextual.g:376:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalUmlTextual.g:377:3: ( rule__Multiplicity__Alternatives )
            // InternalUmlTextual.g:377:4: rule__Multiplicity__Alternatives
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
    // InternalUmlTextual.g:386:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalUmlTextual.g:387:1: ( ruleAttribute EOF )
            // InternalUmlTextual.g:388:1: ruleAttribute EOF
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
    // InternalUmlTextual.g:395:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:399:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalUmlTextual.g:400:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalUmlTextual.g:400:2: ( ( rule__Attribute__Group__0 ) )
            // InternalUmlTextual.g:401:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalUmlTextual.g:402:3: ( rule__Attribute__Group__0 )
            // InternalUmlTextual.g:402:4: rule__Attribute__Group__0
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
    // InternalUmlTextual.g:411:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalUmlTextual.g:412:1: ( ruleMethod EOF )
            // InternalUmlTextual.g:413:1: ruleMethod EOF
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
    // InternalUmlTextual.g:420:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:424:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalUmlTextual.g:425:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalUmlTextual.g:425:2: ( ( rule__Method__Group__0 ) )
            // InternalUmlTextual.g:426:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalUmlTextual.g:427:3: ( rule__Method__Group__0 )
            // InternalUmlTextual.g:427:4: rule__Method__Group__0
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
    // InternalUmlTextual.g:436:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalUmlTextual.g:437:1: ( ruleParameter EOF )
            // InternalUmlTextual.g:438:1: ruleParameter EOF
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
    // InternalUmlTextual.g:445:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:449:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalUmlTextual.g:450:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalUmlTextual.g:450:2: ( ( rule__Parameter__Group__0 ) )
            // InternalUmlTextual.g:451:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalUmlTextual.g:452:3: ( rule__Parameter__Group__0 )
            // InternalUmlTextual.g:452:4: rule__Parameter__Group__0
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
    // InternalUmlTextual.g:461:1: entryRuleUnnamed : ruleUnnamed EOF ;
    public final void entryRuleUnnamed() throws RecognitionException {
        try {
            // InternalUmlTextual.g:462:1: ( ruleUnnamed EOF )
            // InternalUmlTextual.g:463:1: ruleUnnamed EOF
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
    // InternalUmlTextual.g:470:1: ruleUnnamed : ( 'unnamed' ) ;
    public final void ruleUnnamed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:474:2: ( ( 'unnamed' ) )
            // InternalUmlTextual.g:475:2: ( 'unnamed' )
            {
            // InternalUmlTextual.g:475:2: ( 'unnamed' )
            // InternalUmlTextual.g:476:3: 'unnamed'
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
    // InternalUmlTextual.g:486:1: entryRuleNavigation : ruleNavigation EOF ;
    public final void entryRuleNavigation() throws RecognitionException {
        try {
            // InternalUmlTextual.g:487:1: ( ruleNavigation EOF )
            // InternalUmlTextual.g:488:1: ruleNavigation EOF
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
    // InternalUmlTextual.g:495:1: ruleNavigation : ( 'navigable' ) ;
    public final void ruleNavigation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:499:2: ( ( 'navigable' ) )
            // InternalUmlTextual.g:500:2: ( 'navigable' )
            {
            // InternalUmlTextual.g:500:2: ( 'navigable' )
            // InternalUmlTextual.g:501:3: 'navigable'
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
    // InternalUmlTextual.g:511:1: entryRuleAssociationConnector : ruleAssociationConnector EOF ;
    public final void entryRuleAssociationConnector() throws RecognitionException {
        try {
            // InternalUmlTextual.g:512:1: ( ruleAssociationConnector EOF )
            // InternalUmlTextual.g:513:1: ruleAssociationConnector EOF
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
    // InternalUmlTextual.g:520:1: ruleAssociationConnector : ( ( rule__AssociationConnector__Alternatives ) ) ;
    public final void ruleAssociationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:524:2: ( ( ( rule__AssociationConnector__Alternatives ) ) )
            // InternalUmlTextual.g:525:2: ( ( rule__AssociationConnector__Alternatives ) )
            {
            // InternalUmlTextual.g:525:2: ( ( rule__AssociationConnector__Alternatives ) )
            // InternalUmlTextual.g:526:3: ( rule__AssociationConnector__Alternatives )
            {
             before(grammarAccess.getAssociationConnectorAccess().getAlternatives()); 
            // InternalUmlTextual.g:527:3: ( rule__AssociationConnector__Alternatives )
            // InternalUmlTextual.g:527:4: rule__AssociationConnector__Alternatives
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
    // InternalUmlTextual.g:536:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalUmlTextual.g:537:1: ( ruleAssociation EOF )
            // InternalUmlTextual.g:538:1: ruleAssociation EOF
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
    // InternalUmlTextual.g:545:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:549:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalUmlTextual.g:550:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalUmlTextual.g:550:2: ( ( rule__Association__Group__0 ) )
            // InternalUmlTextual.g:551:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalUmlTextual.g:552:3: ( rule__Association__Group__0 )
            // InternalUmlTextual.g:552:4: rule__Association__Group__0
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
    // InternalUmlTextual.g:561:1: entryRuleAggregation : ruleAggregation EOF ;
    public final void entryRuleAggregation() throws RecognitionException {
        try {
            // InternalUmlTextual.g:562:1: ( ruleAggregation EOF )
            // InternalUmlTextual.g:563:1: ruleAggregation EOF
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
    // InternalUmlTextual.g:570:1: ruleAggregation : ( ( rule__Aggregation__Group__0 ) ) ;
    public final void ruleAggregation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:574:2: ( ( ( rule__Aggregation__Group__0 ) ) )
            // InternalUmlTextual.g:575:2: ( ( rule__Aggregation__Group__0 ) )
            {
            // InternalUmlTextual.g:575:2: ( ( rule__Aggregation__Group__0 ) )
            // InternalUmlTextual.g:576:3: ( rule__Aggregation__Group__0 )
            {
             before(grammarAccess.getAggregationAccess().getGroup()); 
            // InternalUmlTextual.g:577:3: ( rule__Aggregation__Group__0 )
            // InternalUmlTextual.g:577:4: rule__Aggregation__Group__0
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
    // InternalUmlTextual.g:586:1: entryRuleComposition : ruleComposition EOF ;
    public final void entryRuleComposition() throws RecognitionException {
        try {
            // InternalUmlTextual.g:587:1: ( ruleComposition EOF )
            // InternalUmlTextual.g:588:1: ruleComposition EOF
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
    // InternalUmlTextual.g:595:1: ruleComposition : ( ( rule__Composition__Group__0 ) ) ;
    public final void ruleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:599:2: ( ( ( rule__Composition__Group__0 ) ) )
            // InternalUmlTextual.g:600:2: ( ( rule__Composition__Group__0 ) )
            {
            // InternalUmlTextual.g:600:2: ( ( rule__Composition__Group__0 ) )
            // InternalUmlTextual.g:601:3: ( rule__Composition__Group__0 )
            {
             before(grammarAccess.getCompositionAccess().getGroup()); 
            // InternalUmlTextual.g:602:3: ( rule__Composition__Group__0 )
            // InternalUmlTextual.g:602:4: rule__Composition__Group__0
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
    // InternalUmlTextual.g:611:1: entryRuleUseCaseDiagram : ruleUseCaseDiagram EOF ;
    public final void entryRuleUseCaseDiagram() throws RecognitionException {
        try {
            // InternalUmlTextual.g:612:1: ( ruleUseCaseDiagram EOF )
            // InternalUmlTextual.g:613:1: ruleUseCaseDiagram EOF
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
    // InternalUmlTextual.g:620:1: ruleUseCaseDiagram : ( ( rule__UseCaseDiagram__Group__0 ) ) ;
    public final void ruleUseCaseDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:624:2: ( ( ( rule__UseCaseDiagram__Group__0 ) ) )
            // InternalUmlTextual.g:625:2: ( ( rule__UseCaseDiagram__Group__0 ) )
            {
            // InternalUmlTextual.g:625:2: ( ( rule__UseCaseDiagram__Group__0 ) )
            // InternalUmlTextual.g:626:3: ( rule__UseCaseDiagram__Group__0 )
            {
             before(grammarAccess.getUseCaseDiagramAccess().getGroup()); 
            // InternalUmlTextual.g:627:3: ( rule__UseCaseDiagram__Group__0 )
            // InternalUmlTextual.g:627:4: rule__UseCaseDiagram__Group__0
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
    // InternalUmlTextual.g:636:1: entryRuleUseCaseElement : ruleUseCaseElement EOF ;
    public final void entryRuleUseCaseElement() throws RecognitionException {
        try {
            // InternalUmlTextual.g:637:1: ( ruleUseCaseElement EOF )
            // InternalUmlTextual.g:638:1: ruleUseCaseElement EOF
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
    // InternalUmlTextual.g:645:1: ruleUseCaseElement : ( ( rule__UseCaseElement__Alternatives ) ) ;
    public final void ruleUseCaseElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:649:2: ( ( ( rule__UseCaseElement__Alternatives ) ) )
            // InternalUmlTextual.g:650:2: ( ( rule__UseCaseElement__Alternatives ) )
            {
            // InternalUmlTextual.g:650:2: ( ( rule__UseCaseElement__Alternatives ) )
            // InternalUmlTextual.g:651:3: ( rule__UseCaseElement__Alternatives )
            {
             before(grammarAccess.getUseCaseElementAccess().getAlternatives()); 
            // InternalUmlTextual.g:652:3: ( rule__UseCaseElement__Alternatives )
            // InternalUmlTextual.g:652:4: rule__UseCaseElement__Alternatives
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
    // InternalUmlTextual.g:661:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // InternalUmlTextual.g:662:1: ( ruleActor EOF )
            // InternalUmlTextual.g:663:1: ruleActor EOF
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
    // InternalUmlTextual.g:670:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:674:2: ( ( ( rule__Actor__Group__0 ) ) )
            // InternalUmlTextual.g:675:2: ( ( rule__Actor__Group__0 ) )
            {
            // InternalUmlTextual.g:675:2: ( ( rule__Actor__Group__0 ) )
            // InternalUmlTextual.g:676:3: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // InternalUmlTextual.g:677:3: ( rule__Actor__Group__0 )
            // InternalUmlTextual.g:677:4: rule__Actor__Group__0
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
    // InternalUmlTextual.g:686:1: entryRuleUseCase : ruleUseCase EOF ;
    public final void entryRuleUseCase() throws RecognitionException {
        try {
            // InternalUmlTextual.g:687:1: ( ruleUseCase EOF )
            // InternalUmlTextual.g:688:1: ruleUseCase EOF
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
    // InternalUmlTextual.g:695:1: ruleUseCase : ( ( rule__UseCase__Group__0 ) ) ;
    public final void ruleUseCase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:699:2: ( ( ( rule__UseCase__Group__0 ) ) )
            // InternalUmlTextual.g:700:2: ( ( rule__UseCase__Group__0 ) )
            {
            // InternalUmlTextual.g:700:2: ( ( rule__UseCase__Group__0 ) )
            // InternalUmlTextual.g:701:3: ( rule__UseCase__Group__0 )
            {
             before(grammarAccess.getUseCaseAccess().getGroup()); 
            // InternalUmlTextual.g:702:3: ( rule__UseCase__Group__0 )
            // InternalUmlTextual.g:702:4: rule__UseCase__Group__0
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
    // InternalUmlTextual.g:710:1: rule__ModelElement__Alternatives : ( ( rulePackage ) | ( ruleUseCaseDiagram ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:714:1: ( ( rulePackage ) | ( ruleUseCaseDiagram ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=16)||LA2_0==63) ) {
                alt2=1;
            }
            else if ( (LA2_0==58) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUmlTextual.g:715:2: ( rulePackage )
                    {
                    // InternalUmlTextual.g:715:2: ( rulePackage )
                    // InternalUmlTextual.g:716:3: rulePackage
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
                    // InternalUmlTextual.g:721:2: ( ruleUseCaseDiagram )
                    {
                    // InternalUmlTextual.g:721:2: ( ruleUseCaseDiagram )
                    // InternalUmlTextual.g:722:3: ruleUseCaseDiagram
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
    // InternalUmlTextual.g:731:1: rule__Package__TypeAlternatives_1_0 : ( ( 'package' ) | ( 'subsystem' ) );
    public final void rule__Package__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:735:1: ( ( 'package' ) | ( 'subsystem' ) )
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
                    // InternalUmlTextual.g:736:2: ( 'package' )
                    {
                    // InternalUmlTextual.g:736:2: ( 'package' )
                    // InternalUmlTextual.g:737:3: 'package'
                    {
                     before(grammarAccess.getPackageAccess().getTypePackageKeyword_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getTypePackageKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:742:2: ( 'subsystem' )
                    {
                    // InternalUmlTextual.g:742:2: ( 'subsystem' )
                    // InternalUmlTextual.g:743:3: 'subsystem'
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
    // InternalUmlTextual.g:752:1: rule__Element__Alternatives : ( ( ruleClass ) | ( ruleAssociationConnector ) | ( ruleInterface ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:756:1: ( ( ruleClass ) | ( ruleAssociationConnector ) | ( ruleInterface ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalUmlTextual.g:757:2: ( ruleClass )
                    {
                    // InternalUmlTextual.g:757:2: ( ruleClass )
                    // InternalUmlTextual.g:758:3: ruleClass
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
                    // InternalUmlTextual.g:763:2: ( ruleAssociationConnector )
                    {
                    // InternalUmlTextual.g:763:2: ( ruleAssociationConnector )
                    // InternalUmlTextual.g:764:3: ruleAssociationConnector
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
                    // InternalUmlTextual.g:769:2: ( ruleInterface )
                    {
                    // InternalUmlTextual.g:769:2: ( ruleInterface )
                    // InternalUmlTextual.g:770:3: ruleInterface
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
    // InternalUmlTextual.g:779:1: rule__Visibility__Alternatives : ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:783:1: ( ( 'public' ) | ( 'private' ) | ( 'protected' ) | ( 'package' ) )
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
                    // InternalUmlTextual.g:784:2: ( 'public' )
                    {
                    // InternalUmlTextual.g:784:2: ( 'public' )
                    // InternalUmlTextual.g:785:3: 'public'
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getPublicKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:790:2: ( 'private' )
                    {
                    // InternalUmlTextual.g:790:2: ( 'private' )
                    // InternalUmlTextual.g:791:3: 'private'
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getPrivateKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:796:2: ( 'protected' )
                    {
                    // InternalUmlTextual.g:796:2: ( 'protected' )
                    // InternalUmlTextual.g:797:3: 'protected'
                    {
                     before(grammarAccess.getVisibilityAccess().getProtectedKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getProtectedKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:802:2: ( 'package' )
                    {
                    // InternalUmlTextual.g:802:2: ( 'package' )
                    // InternalUmlTextual.g:803:3: 'package'
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
    // InternalUmlTextual.g:812:1: rule__AttributeType__Alternatives : ( ( ( rule__AttributeType__NameAssignment_0 ) ) | ( ( rule__AttributeType__NameAssignment_1 ) ) | ( ( rule__AttributeType__NameAssignment_2 ) ) | ( ( rule__AttributeType__NameAssignment_3 ) ) | ( ( rule__AttributeType__NameAssignment_4 ) ) | ( ( rule__AttributeType__NameAssignment_5 ) ) | ( ( rule__AttributeType__NameAssignment_6 ) ) | ( ( rule__AttributeType__NameAssignment_7 ) ) | ( ( rule__AttributeType__NameAssignment_8 ) ) | ( ( rule__AttributeType__DomainTypeAssignment_9 ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:816:1: ( ( ( rule__AttributeType__NameAssignment_0 ) ) | ( ( rule__AttributeType__NameAssignment_1 ) ) | ( ( rule__AttributeType__NameAssignment_2 ) ) | ( ( rule__AttributeType__NameAssignment_3 ) ) | ( ( rule__AttributeType__NameAssignment_4 ) ) | ( ( rule__AttributeType__NameAssignment_5 ) ) | ( ( rule__AttributeType__NameAssignment_6 ) ) | ( ( rule__AttributeType__NameAssignment_7 ) ) | ( ( rule__AttributeType__NameAssignment_8 ) ) | ( ( rule__AttributeType__DomainTypeAssignment_9 ) ) )
            int alt6=10;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt6=1;
                }
                break;
            case 65:
                {
                alt6=2;
                }
                break;
            case 66:
                {
                alt6=3;
                }
                break;
            case 67:
                {
                alt6=4;
                }
                break;
            case 68:
                {
                alt6=5;
                }
                break;
            case 69:
                {
                alt6=6;
                }
                break;
            case 70:
                {
                alt6=7;
                }
                break;
            case 71:
                {
                alt6=8;
                }
                break;
            case 72:
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
                    // InternalUmlTextual.g:817:2: ( ( rule__AttributeType__NameAssignment_0 ) )
                    {
                    // InternalUmlTextual.g:817:2: ( ( rule__AttributeType__NameAssignment_0 ) )
                    // InternalUmlTextual.g:818:3: ( rule__AttributeType__NameAssignment_0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_0()); 
                    // InternalUmlTextual.g:819:3: ( rule__AttributeType__NameAssignment_0 )
                    // InternalUmlTextual.g:819:4: rule__AttributeType__NameAssignment_0
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
                    // InternalUmlTextual.g:823:2: ( ( rule__AttributeType__NameAssignment_1 ) )
                    {
                    // InternalUmlTextual.g:823:2: ( ( rule__AttributeType__NameAssignment_1 ) )
                    // InternalUmlTextual.g:824:3: ( rule__AttributeType__NameAssignment_1 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_1()); 
                    // InternalUmlTextual.g:825:3: ( rule__AttributeType__NameAssignment_1 )
                    // InternalUmlTextual.g:825:4: rule__AttributeType__NameAssignment_1
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
                    // InternalUmlTextual.g:829:2: ( ( rule__AttributeType__NameAssignment_2 ) )
                    {
                    // InternalUmlTextual.g:829:2: ( ( rule__AttributeType__NameAssignment_2 ) )
                    // InternalUmlTextual.g:830:3: ( rule__AttributeType__NameAssignment_2 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_2()); 
                    // InternalUmlTextual.g:831:3: ( rule__AttributeType__NameAssignment_2 )
                    // InternalUmlTextual.g:831:4: rule__AttributeType__NameAssignment_2
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
                    // InternalUmlTextual.g:835:2: ( ( rule__AttributeType__NameAssignment_3 ) )
                    {
                    // InternalUmlTextual.g:835:2: ( ( rule__AttributeType__NameAssignment_3 ) )
                    // InternalUmlTextual.g:836:3: ( rule__AttributeType__NameAssignment_3 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_3()); 
                    // InternalUmlTextual.g:837:3: ( rule__AttributeType__NameAssignment_3 )
                    // InternalUmlTextual.g:837:4: rule__AttributeType__NameAssignment_3
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
                    // InternalUmlTextual.g:841:2: ( ( rule__AttributeType__NameAssignment_4 ) )
                    {
                    // InternalUmlTextual.g:841:2: ( ( rule__AttributeType__NameAssignment_4 ) )
                    // InternalUmlTextual.g:842:3: ( rule__AttributeType__NameAssignment_4 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_4()); 
                    // InternalUmlTextual.g:843:3: ( rule__AttributeType__NameAssignment_4 )
                    // InternalUmlTextual.g:843:4: rule__AttributeType__NameAssignment_4
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
                    // InternalUmlTextual.g:847:2: ( ( rule__AttributeType__NameAssignment_5 ) )
                    {
                    // InternalUmlTextual.g:847:2: ( ( rule__AttributeType__NameAssignment_5 ) )
                    // InternalUmlTextual.g:848:3: ( rule__AttributeType__NameAssignment_5 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_5()); 
                    // InternalUmlTextual.g:849:3: ( rule__AttributeType__NameAssignment_5 )
                    // InternalUmlTextual.g:849:4: rule__AttributeType__NameAssignment_5
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
                    // InternalUmlTextual.g:853:2: ( ( rule__AttributeType__NameAssignment_6 ) )
                    {
                    // InternalUmlTextual.g:853:2: ( ( rule__AttributeType__NameAssignment_6 ) )
                    // InternalUmlTextual.g:854:3: ( rule__AttributeType__NameAssignment_6 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_6()); 
                    // InternalUmlTextual.g:855:3: ( rule__AttributeType__NameAssignment_6 )
                    // InternalUmlTextual.g:855:4: rule__AttributeType__NameAssignment_6
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
                    // InternalUmlTextual.g:859:2: ( ( rule__AttributeType__NameAssignment_7 ) )
                    {
                    // InternalUmlTextual.g:859:2: ( ( rule__AttributeType__NameAssignment_7 ) )
                    // InternalUmlTextual.g:860:3: ( rule__AttributeType__NameAssignment_7 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_7()); 
                    // InternalUmlTextual.g:861:3: ( rule__AttributeType__NameAssignment_7 )
                    // InternalUmlTextual.g:861:4: rule__AttributeType__NameAssignment_7
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
                    // InternalUmlTextual.g:865:2: ( ( rule__AttributeType__NameAssignment_8 ) )
                    {
                    // InternalUmlTextual.g:865:2: ( ( rule__AttributeType__NameAssignment_8 ) )
                    // InternalUmlTextual.g:866:3: ( rule__AttributeType__NameAssignment_8 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getNameAssignment_8()); 
                    // InternalUmlTextual.g:867:3: ( rule__AttributeType__NameAssignment_8 )
                    // InternalUmlTextual.g:867:4: rule__AttributeType__NameAssignment_8
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
                    // InternalUmlTextual.g:871:2: ( ( rule__AttributeType__DomainTypeAssignment_9 ) )
                    {
                    // InternalUmlTextual.g:871:2: ( ( rule__AttributeType__DomainTypeAssignment_9 ) )
                    // InternalUmlTextual.g:872:3: ( rule__AttributeType__DomainTypeAssignment_9 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDomainTypeAssignment_9()); 
                    // InternalUmlTextual.g:873:3: ( rule__AttributeType__DomainTypeAssignment_9 )
                    // InternalUmlTextual.g:873:4: rule__AttributeType__DomainTypeAssignment_9
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
    // InternalUmlTextual.g:881:1: rule__Multiplicity__Alternatives : ( ( '1' ) | ( '0..1' ) | ( '0..*' ) | ( '*' ) | ( '1..*' ) | ( ( rule__Multiplicity__Group_5__0 ) ) | ( ( rule__Multiplicity__Group_6__0 ) ) | ( RULE_INT ) | ( ( rule__Multiplicity__Group_8__0 ) ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:885:1: ( ( '1' ) | ( '0..1' ) | ( '0..*' ) | ( '*' ) | ( '1..*' ) | ( ( rule__Multiplicity__Group_5__0 ) ) | ( ( rule__Multiplicity__Group_6__0 ) ) | ( RULE_INT ) | ( ( rule__Multiplicity__Group_8__0 ) ) )
            int alt7=9;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalUmlTextual.g:886:2: ( '1' )
                    {
                    // InternalUmlTextual.g:886:2: ( '1' )
                    // InternalUmlTextual.g:887:3: '1'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitOneKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:892:2: ( '0..1' )
                    {
                    // InternalUmlTextual.g:892:2: ( '0..1' )
                    // InternalUmlTextual.g:893:3: '0..1'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:898:2: ( '0..*' )
                    {
                    // InternalUmlTextual.g:898:2: ( '0..*' )
                    // InternalUmlTextual.g:899:3: '0..*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:904:2: ( '*' )
                    {
                    // InternalUmlTextual.g:904:2: ( '*' )
                    // InternalUmlTextual.g:905:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUmlTextual.g:910:2: ( '1..*' )
                    {
                    // InternalUmlTextual.g:910:2: ( '1..*' )
                    // InternalUmlTextual.g:911:3: '1..*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopAsteriskKeyword_4()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopAsteriskKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUmlTextual.g:916:2: ( ( rule__Multiplicity__Group_5__0 ) )
                    {
                    // InternalUmlTextual.g:916:2: ( ( rule__Multiplicity__Group_5__0 ) )
                    // InternalUmlTextual.g:917:3: ( rule__Multiplicity__Group_5__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_5()); 
                    // InternalUmlTextual.g:918:3: ( rule__Multiplicity__Group_5__0 )
                    // InternalUmlTextual.g:918:4: rule__Multiplicity__Group_5__0
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
                    // InternalUmlTextual.g:922:2: ( ( rule__Multiplicity__Group_6__0 ) )
                    {
                    // InternalUmlTextual.g:922:2: ( ( rule__Multiplicity__Group_6__0 ) )
                    // InternalUmlTextual.g:923:3: ( rule__Multiplicity__Group_6__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_6()); 
                    // InternalUmlTextual.g:924:3: ( rule__Multiplicity__Group_6__0 )
                    // InternalUmlTextual.g:924:4: rule__Multiplicity__Group_6__0
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
                    // InternalUmlTextual.g:928:2: ( RULE_INT )
                    {
                    // InternalUmlTextual.g:928:2: ( RULE_INT )
                    // InternalUmlTextual.g:929:3: RULE_INT
                    {
                     before(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_7()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getINTTerminalRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUmlTextual.g:934:2: ( ( rule__Multiplicity__Group_8__0 ) )
                    {
                    // InternalUmlTextual.g:934:2: ( ( rule__Multiplicity__Group_8__0 ) )
                    // InternalUmlTextual.g:935:3: ( rule__Multiplicity__Group_8__0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getGroup_8()); 
                    // InternalUmlTextual.g:936:3: ( rule__Multiplicity__Group_8__0 )
                    // InternalUmlTextual.g:936:4: rule__Multiplicity__Group_8__0
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
    // InternalUmlTextual.g:944:1: rule__AssociationConnector__Alternatives : ( ( ruleAssociation ) | ( ruleAggregation ) | ( ruleComposition ) );
    public final void rule__AssociationConnector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:948:1: ( ( ruleAssociation ) | ( ruleAggregation ) | ( ruleComposition ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 50:
            case 51:
                {
                alt8=1;
                }
                break;
            case 56:
                {
                alt8=2;
                }
                break;
            case 57:
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
                    // InternalUmlTextual.g:949:2: ( ruleAssociation )
                    {
                    // InternalUmlTextual.g:949:2: ( ruleAssociation )
                    // InternalUmlTextual.g:950:3: ruleAssociation
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
                    // InternalUmlTextual.g:955:2: ( ruleAggregation )
                    {
                    // InternalUmlTextual.g:955:2: ( ruleAggregation )
                    // InternalUmlTextual.g:956:3: ruleAggregation
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
                    // InternalUmlTextual.g:961:2: ( ruleComposition )
                    {
                    // InternalUmlTextual.g:961:2: ( ruleComposition )
                    // InternalUmlTextual.g:962:3: ruleComposition
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
    // InternalUmlTextual.g:971:1: rule__Association__NameAlternatives_2_0 : ( ( RULE_ID ) | ( ruleUnnamed ) );
    public final void rule__Association__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:975:1: ( ( RULE_ID ) | ( ruleUnnamed ) )
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
                    // InternalUmlTextual.g:976:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:976:2: ( RULE_ID )
                    // InternalUmlTextual.g:977:3: RULE_ID
                    {
                     before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:982:2: ( ruleUnnamed )
                    {
                    // InternalUmlTextual.g:982:2: ( ruleUnnamed )
                    // InternalUmlTextual.g:983:3: ruleUnnamed
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
    // InternalUmlTextual.g:992:1: rule__Aggregation__NameAlternatives_1_0 : ( ( RULE_ID ) | ( ruleUnnamed ) );
    public final void rule__Aggregation__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:996:1: ( ( RULE_ID ) | ( ruleUnnamed ) )
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
                    // InternalUmlTextual.g:997:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:997:2: ( RULE_ID )
                    // InternalUmlTextual.g:998:3: RULE_ID
                    {
                     before(grammarAccess.getAggregationAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAggregationAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:1003:2: ( ruleUnnamed )
                    {
                    // InternalUmlTextual.g:1003:2: ( ruleUnnamed )
                    // InternalUmlTextual.g:1004:3: ruleUnnamed
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
    // InternalUmlTextual.g:1013:1: rule__Composition__NameAlternatives_1_0 : ( ( RULE_ID ) | ( ruleUnnamed ) );
    public final void rule__Composition__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1017:1: ( ( RULE_ID ) | ( ruleUnnamed ) )
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
                    // InternalUmlTextual.g:1018:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:1018:2: ( RULE_ID )
                    // InternalUmlTextual.g:1019:3: RULE_ID
                    {
                     before(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:1024:2: ( ruleUnnamed )
                    {
                    // InternalUmlTextual.g:1024:2: ( ruleUnnamed )
                    // InternalUmlTextual.g:1025:3: ruleUnnamed
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
    // InternalUmlTextual.g:1034:1: rule__UseCaseElement__Alternatives : ( ( ruleActor ) | ( ruleUseCase ) );
    public final void rule__UseCaseElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1038:1: ( ( ruleActor ) | ( ruleUseCase ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)||LA12_0==15||(LA12_0>=17 && LA12_0<=19)||LA12_0==60||LA12_0==73) ) {
                alt12=1;
            }
            else if ( (LA12_0==58) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalUmlTextual.g:1039:2: ( ruleActor )
                    {
                    // InternalUmlTextual.g:1039:2: ( ruleActor )
                    // InternalUmlTextual.g:1040:3: ruleActor
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
                    // InternalUmlTextual.g:1045:2: ( ruleUseCase )
                    {
                    // InternalUmlTextual.g:1045:2: ( ruleUseCase )
                    // InternalUmlTextual.g:1046:3: ruleUseCase
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
    // InternalUmlTextual.g:1055:1: rule__UseCase__Alternatives_6_1 : ( ( ( rule__UseCase__Group_6_1_0__0 ) ) | ( ( rule__UseCase__Group_6_1_1__0 ) ) );
    public final void rule__UseCase__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1059:1: ( ( ( rule__UseCase__Group_6_1_0__0 ) ) | ( ( rule__UseCase__Group_6_1_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==62) ) {
                alt13=1;
            }
            else if ( (LA13_0==32) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalUmlTextual.g:1060:2: ( ( rule__UseCase__Group_6_1_0__0 ) )
                    {
                    // InternalUmlTextual.g:1060:2: ( ( rule__UseCase__Group_6_1_0__0 ) )
                    // InternalUmlTextual.g:1061:3: ( rule__UseCase__Group_6_1_0__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_6_1_0()); 
                    // InternalUmlTextual.g:1062:3: ( rule__UseCase__Group_6_1_0__0 )
                    // InternalUmlTextual.g:1062:4: rule__UseCase__Group_6_1_0__0
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
                    // InternalUmlTextual.g:1066:2: ( ( rule__UseCase__Group_6_1_1__0 ) )
                    {
                    // InternalUmlTextual.g:1066:2: ( ( rule__UseCase__Group_6_1_1__0 ) )
                    // InternalUmlTextual.g:1067:3: ( rule__UseCase__Group_6_1_1__0 )
                    {
                     before(grammarAccess.getUseCaseAccess().getGroup_6_1_1()); 
                    // InternalUmlTextual.g:1068:3: ( rule__UseCase__Group_6_1_1__0 )
                    // InternalUmlTextual.g:1068:4: rule__UseCase__Group_6_1_1__0
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
    // InternalUmlTextual.g:1076:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1080:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalUmlTextual.g:1081:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalUmlTextual.g:1088:1: rule__Package__Group__0__Impl : ( ( rule__Package__InstantiableAssignment_0 )? ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1092:1: ( ( ( rule__Package__InstantiableAssignment_0 )? ) )
            // InternalUmlTextual.g:1093:1: ( ( rule__Package__InstantiableAssignment_0 )? )
            {
            // InternalUmlTextual.g:1093:1: ( ( rule__Package__InstantiableAssignment_0 )? )
            // InternalUmlTextual.g:1094:2: ( rule__Package__InstantiableAssignment_0 )?
            {
             before(grammarAccess.getPackageAccess().getInstantiableAssignment_0()); 
            // InternalUmlTextual.g:1095:2: ( rule__Package__InstantiableAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==63) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUmlTextual.g:1095:3: rule__Package__InstantiableAssignment_0
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
    // InternalUmlTextual.g:1103:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1107:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalUmlTextual.g:1108:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalUmlTextual.g:1115:1: rule__Package__Group__1__Impl : ( ( rule__Package__TypeAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1119:1: ( ( ( rule__Package__TypeAssignment_1 ) ) )
            // InternalUmlTextual.g:1120:1: ( ( rule__Package__TypeAssignment_1 ) )
            {
            // InternalUmlTextual.g:1120:1: ( ( rule__Package__TypeAssignment_1 ) )
            // InternalUmlTextual.g:1121:2: ( rule__Package__TypeAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getTypeAssignment_1()); 
            // InternalUmlTextual.g:1122:2: ( rule__Package__TypeAssignment_1 )
            // InternalUmlTextual.g:1122:3: rule__Package__TypeAssignment_1
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
    // InternalUmlTextual.g:1130:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1134:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalUmlTextual.g:1135:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalUmlTextual.g:1142:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1146:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:1147:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:1147:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalUmlTextual.g:1148:2: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:1149:2: ( rule__Package__NameAssignment_2 )
            // InternalUmlTextual.g:1149:3: rule__Package__NameAssignment_2
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
    // InternalUmlTextual.g:1157:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1161:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalUmlTextual.g:1162:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalUmlTextual.g:1169:1: rule__Package__Group__3__Impl : ( ( rule__Package__Group_3__0 )? ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1173:1: ( ( ( rule__Package__Group_3__0 )? ) )
            // InternalUmlTextual.g:1174:1: ( ( rule__Package__Group_3__0 )? )
            {
            // InternalUmlTextual.g:1174:1: ( ( rule__Package__Group_3__0 )? )
            // InternalUmlTextual.g:1175:2: ( rule__Package__Group_3__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_3()); 
            // InternalUmlTextual.g:1176:2: ( rule__Package__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalUmlTextual.g:1176:3: rule__Package__Group_3__0
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
    // InternalUmlTextual.g:1184:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1188:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalUmlTextual.g:1189:2: rule__Package__Group__4__Impl rule__Package__Group__5
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
    // InternalUmlTextual.g:1196:1: rule__Package__Group__4__Impl : ( '{' ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1200:1: ( ( '{' ) )
            // InternalUmlTextual.g:1201:1: ( '{' )
            {
            // InternalUmlTextual.g:1201:1: ( '{' )
            // InternalUmlTextual.g:1202:2: '{'
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
    // InternalUmlTextual.g:1211:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1215:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalUmlTextual.g:1216:2: rule__Package__Group__5__Impl rule__Package__Group__6
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
    // InternalUmlTextual.g:1223:1: rule__Package__Group__5__Impl : ( ( rule__Package__DomainSpecificTypesAssignment_5 )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1227:1: ( ( ( rule__Package__DomainSpecificTypesAssignment_5 )* ) )
            // InternalUmlTextual.g:1228:1: ( ( rule__Package__DomainSpecificTypesAssignment_5 )* )
            {
            // InternalUmlTextual.g:1228:1: ( ( rule__Package__DomainSpecificTypesAssignment_5 )* )
            // InternalUmlTextual.g:1229:2: ( rule__Package__DomainSpecificTypesAssignment_5 )*
            {
             before(grammarAccess.getPackageAccess().getDomainSpecificTypesAssignment_5()); 
            // InternalUmlTextual.g:1230:2: ( rule__Package__DomainSpecificTypesAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUmlTextual.g:1230:3: rule__Package__DomainSpecificTypesAssignment_5
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
    // InternalUmlTextual.g:1238:1: rule__Package__Group__6 : rule__Package__Group__6__Impl rule__Package__Group__7 ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1242:1: ( rule__Package__Group__6__Impl rule__Package__Group__7 )
            // InternalUmlTextual.g:1243:2: rule__Package__Group__6__Impl rule__Package__Group__7
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
    // InternalUmlTextual.g:1250:1: rule__Package__Group__6__Impl : ( ( rule__Package__ElementsAssignment_6 )* ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1254:1: ( ( ( rule__Package__ElementsAssignment_6 )* ) )
            // InternalUmlTextual.g:1255:1: ( ( rule__Package__ElementsAssignment_6 )* )
            {
            // InternalUmlTextual.g:1255:1: ( ( rule__Package__ElementsAssignment_6 )* )
            // InternalUmlTextual.g:1256:2: ( rule__Package__ElementsAssignment_6 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_6()); 
            // InternalUmlTextual.g:1257:2: ( rule__Package__ElementsAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==15||(LA17_0>=17 && LA17_0<=19)||(LA17_0>=30 && LA17_0<=31)||LA17_0==35||(LA17_0>=50 && LA17_0<=51)||(LA17_0>=56 && LA17_0<=57)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUmlTextual.g:1257:3: rule__Package__ElementsAssignment_6
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
    // InternalUmlTextual.g:1265:1: rule__Package__Group__7 : rule__Package__Group__7__Impl ;
    public final void rule__Package__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1269:1: ( rule__Package__Group__7__Impl )
            // InternalUmlTextual.g:1270:2: rule__Package__Group__7__Impl
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
    // InternalUmlTextual.g:1276:1: rule__Package__Group__7__Impl : ( '}' ) ;
    public final void rule__Package__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1280:1: ( ( '}' ) )
            // InternalUmlTextual.g:1281:1: ( '}' )
            {
            // InternalUmlTextual.g:1281:1: ( '}' )
            // InternalUmlTextual.g:1282:2: '}'
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
    // InternalUmlTextual.g:1292:1: rule__Package__Group_3__0 : rule__Package__Group_3__0__Impl rule__Package__Group_3__1 ;
    public final void rule__Package__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1296:1: ( rule__Package__Group_3__0__Impl rule__Package__Group_3__1 )
            // InternalUmlTextual.g:1297:2: rule__Package__Group_3__0__Impl rule__Package__Group_3__1
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
    // InternalUmlTextual.g:1304:1: rule__Package__Group_3__0__Impl : ( 'depends' ) ;
    public final void rule__Package__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1308:1: ( ( 'depends' ) )
            // InternalUmlTextual.g:1309:1: ( 'depends' )
            {
            // InternalUmlTextual.g:1309:1: ( 'depends' )
            // InternalUmlTextual.g:1310:2: 'depends'
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
    // InternalUmlTextual.g:1319:1: rule__Package__Group_3__1 : rule__Package__Group_3__1__Impl rule__Package__Group_3__2 ;
    public final void rule__Package__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1323:1: ( rule__Package__Group_3__1__Impl rule__Package__Group_3__2 )
            // InternalUmlTextual.g:1324:2: rule__Package__Group_3__1__Impl rule__Package__Group_3__2
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
    // InternalUmlTextual.g:1331:1: rule__Package__Group_3__1__Impl : ( 'on' ) ;
    public final void rule__Package__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1335:1: ( ( 'on' ) )
            // InternalUmlTextual.g:1336:1: ( 'on' )
            {
            // InternalUmlTextual.g:1336:1: ( 'on' )
            // InternalUmlTextual.g:1337:2: 'on'
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
    // InternalUmlTextual.g:1346:1: rule__Package__Group_3__2 : rule__Package__Group_3__2__Impl ;
    public final void rule__Package__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1350:1: ( rule__Package__Group_3__2__Impl )
            // InternalUmlTextual.g:1351:2: rule__Package__Group_3__2__Impl
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
    // InternalUmlTextual.g:1357:1: rule__Package__Group_3__2__Impl : ( ( rule__Package__ParentPackageAssignment_3_2 ) ) ;
    public final void rule__Package__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1361:1: ( ( ( rule__Package__ParentPackageAssignment_3_2 ) ) )
            // InternalUmlTextual.g:1362:1: ( ( rule__Package__ParentPackageAssignment_3_2 ) )
            {
            // InternalUmlTextual.g:1362:1: ( ( rule__Package__ParentPackageAssignment_3_2 ) )
            // InternalUmlTextual.g:1363:2: ( rule__Package__ParentPackageAssignment_3_2 )
            {
             before(grammarAccess.getPackageAccess().getParentPackageAssignment_3_2()); 
            // InternalUmlTextual.g:1364:2: ( rule__Package__ParentPackageAssignment_3_2 )
            // InternalUmlTextual.g:1364:3: rule__Package__ParentPackageAssignment_3_2
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalUmlTextual.g:1373:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1377:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalUmlTextual.g:1378:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalUmlTextual.g:1385:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1389:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:1390:1: ( RULE_ID )
            {
            // InternalUmlTextual.g:1390:1: ( RULE_ID )
            // InternalUmlTextual.g:1391:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalUmlTextual.g:1400:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1404:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalUmlTextual.g:1405:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalUmlTextual.g:1411:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1415:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalUmlTextual.g:1416:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalUmlTextual.g:1416:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalUmlTextual.g:1417:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalUmlTextual.g:1418:2: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUmlTextual.g:1418:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalUmlTextual.g:1427:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1431:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalUmlTextual.g:1432:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalUmlTextual.g:1439:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1443:1: ( ( '.' ) )
            // InternalUmlTextual.g:1444:1: ( '.' )
            {
            // InternalUmlTextual.g:1444:1: ( '.' )
            // InternalUmlTextual.g:1445:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalUmlTextual.g:1454:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1458:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalUmlTextual.g:1459:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalUmlTextual.g:1465:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1469:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:1470:1: ( RULE_ID )
            {
            // InternalUmlTextual.g:1470:1: ( RULE_ID )
            // InternalUmlTextual.g:1471:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalUmlTextual.g:1481:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1485:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalUmlTextual.g:1486:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalUmlTextual.g:1493:1: rule__Class__Group__0__Impl : ( ( rule__Class__Group_0__0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1497:1: ( ( ( rule__Class__Group_0__0 )? ) )
            // InternalUmlTextual.g:1498:1: ( ( rule__Class__Group_0__0 )? )
            {
            // InternalUmlTextual.g:1498:1: ( ( rule__Class__Group_0__0 )? )
            // InternalUmlTextual.g:1499:2: ( rule__Class__Group_0__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_0()); 
            // InternalUmlTextual.g:1500:2: ( rule__Class__Group_0__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUmlTextual.g:1500:3: rule__Class__Group_0__0
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
    // InternalUmlTextual.g:1508:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1512:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalUmlTextual.g:1513:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalUmlTextual.g:1520:1: rule__Class__Group__1__Impl : ( ( rule__Class__VisibilityAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1524:1: ( ( ( rule__Class__VisibilityAssignment_1 )? ) )
            // InternalUmlTextual.g:1525:1: ( ( rule__Class__VisibilityAssignment_1 )? )
            {
            // InternalUmlTextual.g:1525:1: ( ( rule__Class__VisibilityAssignment_1 )? )
            // InternalUmlTextual.g:1526:2: ( rule__Class__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_1()); 
            // InternalUmlTextual.g:1527:2: ( rule__Class__VisibilityAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==15||(LA20_0>=17 && LA20_0<=19)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUmlTextual.g:1527:3: rule__Class__VisibilityAssignment_1
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
    // InternalUmlTextual.g:1535:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1539:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalUmlTextual.g:1540:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalUmlTextual.g:1547:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1551:1: ( ( 'class' ) )
            // InternalUmlTextual.g:1552:1: ( 'class' )
            {
            // InternalUmlTextual.g:1552:1: ( 'class' )
            // InternalUmlTextual.g:1553:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalUmlTextual.g:1562:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1566:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalUmlTextual.g:1567:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalUmlTextual.g:1574:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1578:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalUmlTextual.g:1579:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalUmlTextual.g:1579:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalUmlTextual.g:1580:2: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // InternalUmlTextual.g:1581:2: ( rule__Class__NameAssignment_3 )
            // InternalUmlTextual.g:1581:3: rule__Class__NameAssignment_3
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
    // InternalUmlTextual.g:1589:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1593:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalUmlTextual.g:1594:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalUmlTextual.g:1601:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1605:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalUmlTextual.g:1606:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalUmlTextual.g:1606:1: ( ( rule__Class__Group_4__0 )? )
            // InternalUmlTextual.g:1607:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalUmlTextual.g:1608:2: ( rule__Class__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUmlTextual.g:1608:3: rule__Class__Group_4__0
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
    // InternalUmlTextual.g:1616:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1620:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalUmlTextual.g:1621:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalUmlTextual.g:1628:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1632:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalUmlTextual.g:1633:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalUmlTextual.g:1633:1: ( ( rule__Class__Group_5__0 )? )
            // InternalUmlTextual.g:1634:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalUmlTextual.g:1635:2: ( rule__Class__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUmlTextual.g:1635:3: rule__Class__Group_5__0
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
    // InternalUmlTextual.g:1643:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1647:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalUmlTextual.g:1648:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalUmlTextual.g:1655:1: rule__Class__Group__6__Impl : ( '{' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1659:1: ( ( '{' ) )
            // InternalUmlTextual.g:1660:1: ( '{' )
            {
            // InternalUmlTextual.g:1660:1: ( '{' )
            // InternalUmlTextual.g:1661:2: '{'
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
    // InternalUmlTextual.g:1670:1: rule__Class__Group__7 : rule__Class__Group__7__Impl rule__Class__Group__8 ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1674:1: ( rule__Class__Group__7__Impl rule__Class__Group__8 )
            // InternalUmlTextual.g:1675:2: rule__Class__Group__7__Impl rule__Class__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalUmlTextual.g:1682:1: rule__Class__Group__7__Impl : ( ( rule__Class__AttributesAssignment_7 )* ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1686:1: ( ( ( rule__Class__AttributesAssignment_7 )* ) )
            // InternalUmlTextual.g:1687:1: ( ( rule__Class__AttributesAssignment_7 )* )
            {
            // InternalUmlTextual.g:1687:1: ( ( rule__Class__AttributesAssignment_7 )* )
            // InternalUmlTextual.g:1688:2: ( rule__Class__AttributesAssignment_7 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_7()); 
            // InternalUmlTextual.g:1689:2: ( rule__Class__AttributesAssignment_7 )*
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case 17:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==41) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 18:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (LA23_3==41) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (LA23_4==41) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 15:
                    {
                    int LA23_5 = input.LA(2);

                    if ( (LA23_5==41) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 41:
                    {
                    alt23=1;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // InternalUmlTextual.g:1689:3: rule__Class__AttributesAssignment_7
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Class__AttributesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalUmlTextual.g:1697:1: rule__Class__Group__8 : rule__Class__Group__8__Impl rule__Class__Group__9 ;
    public final void rule__Class__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1701:1: ( rule__Class__Group__8__Impl rule__Class__Group__9 )
            // InternalUmlTextual.g:1702:2: rule__Class__Group__8__Impl rule__Class__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalUmlTextual.g:1709:1: rule__Class__Group__8__Impl : ( ( rule__Class__MethodsAssignment_8 )* ) ;
    public final void rule__Class__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1713:1: ( ( ( rule__Class__MethodsAssignment_8 )* ) )
            // InternalUmlTextual.g:1714:1: ( ( rule__Class__MethodsAssignment_8 )* )
            {
            // InternalUmlTextual.g:1714:1: ( ( rule__Class__MethodsAssignment_8 )* )
            // InternalUmlTextual.g:1715:2: ( rule__Class__MethodsAssignment_8 )*
            {
             before(grammarAccess.getClassAccess().getMethodsAssignment_8()); 
            // InternalUmlTextual.g:1716:2: ( rule__Class__MethodsAssignment_8 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==11||LA24_0==15||(LA24_0>=17 && LA24_0<=19)||(LA24_0>=45 && LA24_0<=46)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalUmlTextual.g:1716:3: rule__Class__MethodsAssignment_8
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Class__MethodsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalUmlTextual.g:1724:1: rule__Class__Group__9 : rule__Class__Group__9__Impl ;
    public final void rule__Class__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1728:1: ( rule__Class__Group__9__Impl )
            // InternalUmlTextual.g:1729:2: rule__Class__Group__9__Impl
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
    // InternalUmlTextual.g:1735:1: rule__Class__Group__9__Impl : ( '}' ) ;
    public final void rule__Class__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1739:1: ( ( '}' ) )
            // InternalUmlTextual.g:1740:1: ( '}' )
            {
            // InternalUmlTextual.g:1740:1: ( '}' )
            // InternalUmlTextual.g:1741:2: '}'
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
    // InternalUmlTextual.g:1751:1: rule__Class__Group_0__0 : rule__Class__Group_0__0__Impl rule__Class__Group_0__1 ;
    public final void rule__Class__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1755:1: ( rule__Class__Group_0__0__Impl rule__Class__Group_0__1 )
            // InternalUmlTextual.g:1756:2: rule__Class__Group_0__0__Impl rule__Class__Group_0__1
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
    // InternalUmlTextual.g:1763:1: rule__Class__Group_0__0__Impl : ( '@' ) ;
    public final void rule__Class__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1767:1: ( ( '@' ) )
            // InternalUmlTextual.g:1768:1: ( '@' )
            {
            // InternalUmlTextual.g:1768:1: ( '@' )
            // InternalUmlTextual.g:1769:2: '@'
            {
             before(grammarAccess.getClassAccess().getCommercialAtKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalUmlTextual.g:1778:1: rule__Class__Group_0__1 : rule__Class__Group_0__1__Impl ;
    public final void rule__Class__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1782:1: ( rule__Class__Group_0__1__Impl )
            // InternalUmlTextual.g:1783:2: rule__Class__Group_0__1__Impl
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
    // InternalUmlTextual.g:1789:1: rule__Class__Group_0__1__Impl : ( ( rule__Class__StereotypeAssignment_0_1 ) ) ;
    public final void rule__Class__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1793:1: ( ( ( rule__Class__StereotypeAssignment_0_1 ) ) )
            // InternalUmlTextual.g:1794:1: ( ( rule__Class__StereotypeAssignment_0_1 ) )
            {
            // InternalUmlTextual.g:1794:1: ( ( rule__Class__StereotypeAssignment_0_1 ) )
            // InternalUmlTextual.g:1795:2: ( rule__Class__StereotypeAssignment_0_1 )
            {
             before(grammarAccess.getClassAccess().getStereotypeAssignment_0_1()); 
            // InternalUmlTextual.g:1796:2: ( rule__Class__StereotypeAssignment_0_1 )
            // InternalUmlTextual.g:1796:3: rule__Class__StereotypeAssignment_0_1
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
    // InternalUmlTextual.g:1805:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1809:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalUmlTextual.g:1810:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
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
    // InternalUmlTextual.g:1817:1: rule__Class__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1821:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:1822:1: ( 'extends' )
            {
            // InternalUmlTextual.g:1822:1: ( 'extends' )
            // InternalUmlTextual.g:1823:2: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUmlTextual.g:1832:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1836:1: ( rule__Class__Group_4__1__Impl )
            // InternalUmlTextual.g:1837:2: rule__Class__Group_4__1__Impl
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
    // InternalUmlTextual.g:1843:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__ParentClassAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1847:1: ( ( ( rule__Class__ParentClassAssignment_4_1 ) ) )
            // InternalUmlTextual.g:1848:1: ( ( rule__Class__ParentClassAssignment_4_1 ) )
            {
            // InternalUmlTextual.g:1848:1: ( ( rule__Class__ParentClassAssignment_4_1 ) )
            // InternalUmlTextual.g:1849:2: ( rule__Class__ParentClassAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getParentClassAssignment_4_1()); 
            // InternalUmlTextual.g:1850:2: ( rule__Class__ParentClassAssignment_4_1 )
            // InternalUmlTextual.g:1850:3: rule__Class__ParentClassAssignment_4_1
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
    // InternalUmlTextual.g:1859:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1863:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalUmlTextual.g:1864:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
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
    // InternalUmlTextual.g:1871:1: rule__Class__Group_5__0__Impl : ( 'implements' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1875:1: ( ( 'implements' ) )
            // InternalUmlTextual.g:1876:1: ( 'implements' )
            {
            // InternalUmlTextual.g:1876:1: ( 'implements' )
            // InternalUmlTextual.g:1877:2: 'implements'
            {
             before(grammarAccess.getClassAccess().getImplementsKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalUmlTextual.g:1886:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1890:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalUmlTextual.g:1891:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalUmlTextual.g:1898:1: rule__Class__Group_5__1__Impl : ( ( rule__Class__InterfacesAssignment_5_1 ) ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1902:1: ( ( ( rule__Class__InterfacesAssignment_5_1 ) ) )
            // InternalUmlTextual.g:1903:1: ( ( rule__Class__InterfacesAssignment_5_1 ) )
            {
            // InternalUmlTextual.g:1903:1: ( ( rule__Class__InterfacesAssignment_5_1 ) )
            // InternalUmlTextual.g:1904:2: ( rule__Class__InterfacesAssignment_5_1 )
            {
             before(grammarAccess.getClassAccess().getInterfacesAssignment_5_1()); 
            // InternalUmlTextual.g:1905:2: ( rule__Class__InterfacesAssignment_5_1 )
            // InternalUmlTextual.g:1905:3: rule__Class__InterfacesAssignment_5_1
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
    // InternalUmlTextual.g:1913:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1917:1: ( rule__Class__Group_5__2__Impl )
            // InternalUmlTextual.g:1918:2: rule__Class__Group_5__2__Impl
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
    // InternalUmlTextual.g:1924:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__Group_5_2__0 )* ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1928:1: ( ( ( rule__Class__Group_5_2__0 )* ) )
            // InternalUmlTextual.g:1929:1: ( ( rule__Class__Group_5_2__0 )* )
            {
            // InternalUmlTextual.g:1929:1: ( ( rule__Class__Group_5_2__0 )* )
            // InternalUmlTextual.g:1930:2: ( rule__Class__Group_5_2__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_5_2()); 
            // InternalUmlTextual.g:1931:2: ( rule__Class__Group_5_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalUmlTextual.g:1931:3: rule__Class__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Class__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalUmlTextual.g:1940:1: rule__Class__Group_5_2__0 : rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1 ;
    public final void rule__Class__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1944:1: ( rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1 )
            // InternalUmlTextual.g:1945:2: rule__Class__Group_5_2__0__Impl rule__Class__Group_5_2__1
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
    // InternalUmlTextual.g:1952:1: rule__Class__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1956:1: ( ( ',' ) )
            // InternalUmlTextual.g:1957:1: ( ',' )
            {
            // InternalUmlTextual.g:1957:1: ( ',' )
            // InternalUmlTextual.g:1958:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_5_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUmlTextual.g:1967:1: rule__Class__Group_5_2__1 : rule__Class__Group_5_2__1__Impl ;
    public final void rule__Class__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1971:1: ( rule__Class__Group_5_2__1__Impl )
            // InternalUmlTextual.g:1972:2: rule__Class__Group_5_2__1__Impl
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
    // InternalUmlTextual.g:1978:1: rule__Class__Group_5_2__1__Impl : ( ( rule__Class__InterfacesAssignment_5_2_1 ) ) ;
    public final void rule__Class__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1982:1: ( ( ( rule__Class__InterfacesAssignment_5_2_1 ) ) )
            // InternalUmlTextual.g:1983:1: ( ( rule__Class__InterfacesAssignment_5_2_1 ) )
            {
            // InternalUmlTextual.g:1983:1: ( ( rule__Class__InterfacesAssignment_5_2_1 ) )
            // InternalUmlTextual.g:1984:2: ( rule__Class__InterfacesAssignment_5_2_1 )
            {
             before(grammarAccess.getClassAccess().getInterfacesAssignment_5_2_1()); 
            // InternalUmlTextual.g:1985:2: ( rule__Class__InterfacesAssignment_5_2_1 )
            // InternalUmlTextual.g:1985:3: rule__Class__InterfacesAssignment_5_2_1
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
    // InternalUmlTextual.g:1994:1: rule__Interface__Group__0 : rule__Interface__Group__0__Impl rule__Interface__Group__1 ;
    public final void rule__Interface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1998:1: ( rule__Interface__Group__0__Impl rule__Interface__Group__1 )
            // InternalUmlTextual.g:1999:2: rule__Interface__Group__0__Impl rule__Interface__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalUmlTextual.g:2006:1: rule__Interface__Group__0__Impl : ( ( rule__Interface__Group_0__0 )? ) ;
    public final void rule__Interface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2010:1: ( ( ( rule__Interface__Group_0__0 )? ) )
            // InternalUmlTextual.g:2011:1: ( ( rule__Interface__Group_0__0 )? )
            {
            // InternalUmlTextual.g:2011:1: ( ( rule__Interface__Group_0__0 )? )
            // InternalUmlTextual.g:2012:2: ( rule__Interface__Group_0__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_0()); 
            // InternalUmlTextual.g:2013:2: ( rule__Interface__Group_0__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUmlTextual.g:2013:3: rule__Interface__Group_0__0
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
    // InternalUmlTextual.g:2021:1: rule__Interface__Group__1 : rule__Interface__Group__1__Impl rule__Interface__Group__2 ;
    public final void rule__Interface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2025:1: ( rule__Interface__Group__1__Impl rule__Interface__Group__2 )
            // InternalUmlTextual.g:2026:2: rule__Interface__Group__1__Impl rule__Interface__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalUmlTextual.g:2033:1: rule__Interface__Group__1__Impl : ( ( rule__Interface__VisibilityAssignment_1 )? ) ;
    public final void rule__Interface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2037:1: ( ( ( rule__Interface__VisibilityAssignment_1 )? ) )
            // InternalUmlTextual.g:2038:1: ( ( rule__Interface__VisibilityAssignment_1 )? )
            {
            // InternalUmlTextual.g:2038:1: ( ( rule__Interface__VisibilityAssignment_1 )? )
            // InternalUmlTextual.g:2039:2: ( rule__Interface__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getInterfaceAccess().getVisibilityAssignment_1()); 
            // InternalUmlTextual.g:2040:2: ( rule__Interface__VisibilityAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==15||(LA27_0>=17 && LA27_0<=19)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalUmlTextual.g:2040:3: rule__Interface__VisibilityAssignment_1
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
    // InternalUmlTextual.g:2048:1: rule__Interface__Group__2 : rule__Interface__Group__2__Impl rule__Interface__Group__3 ;
    public final void rule__Interface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2052:1: ( rule__Interface__Group__2__Impl rule__Interface__Group__3 )
            // InternalUmlTextual.g:2053:2: rule__Interface__Group__2__Impl rule__Interface__Group__3
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
    // InternalUmlTextual.g:2060:1: rule__Interface__Group__2__Impl : ( 'interface' ) ;
    public final void rule__Interface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2064:1: ( ( 'interface' ) )
            // InternalUmlTextual.g:2065:1: ( 'interface' )
            {
            // InternalUmlTextual.g:2065:1: ( 'interface' )
            // InternalUmlTextual.g:2066:2: 'interface'
            {
             before(grammarAccess.getInterfaceAccess().getInterfaceKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalUmlTextual.g:2075:1: rule__Interface__Group__3 : rule__Interface__Group__3__Impl rule__Interface__Group__4 ;
    public final void rule__Interface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2079:1: ( rule__Interface__Group__3__Impl rule__Interface__Group__4 )
            // InternalUmlTextual.g:2080:2: rule__Interface__Group__3__Impl rule__Interface__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalUmlTextual.g:2087:1: rule__Interface__Group__3__Impl : ( ( rule__Interface__NameAssignment_3 ) ) ;
    public final void rule__Interface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2091:1: ( ( ( rule__Interface__NameAssignment_3 ) ) )
            // InternalUmlTextual.g:2092:1: ( ( rule__Interface__NameAssignment_3 ) )
            {
            // InternalUmlTextual.g:2092:1: ( ( rule__Interface__NameAssignment_3 ) )
            // InternalUmlTextual.g:2093:2: ( rule__Interface__NameAssignment_3 )
            {
             before(grammarAccess.getInterfaceAccess().getNameAssignment_3()); 
            // InternalUmlTextual.g:2094:2: ( rule__Interface__NameAssignment_3 )
            // InternalUmlTextual.g:2094:3: rule__Interface__NameAssignment_3
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
    // InternalUmlTextual.g:2102:1: rule__Interface__Group__4 : rule__Interface__Group__4__Impl rule__Interface__Group__5 ;
    public final void rule__Interface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2106:1: ( rule__Interface__Group__4__Impl rule__Interface__Group__5 )
            // InternalUmlTextual.g:2107:2: rule__Interface__Group__4__Impl rule__Interface__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalUmlTextual.g:2114:1: rule__Interface__Group__4__Impl : ( ( rule__Interface__Group_4__0 )? ) ;
    public final void rule__Interface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2118:1: ( ( ( rule__Interface__Group_4__0 )? ) )
            // InternalUmlTextual.g:2119:1: ( ( rule__Interface__Group_4__0 )? )
            {
            // InternalUmlTextual.g:2119:1: ( ( rule__Interface__Group_4__0 )? )
            // InternalUmlTextual.g:2120:2: ( rule__Interface__Group_4__0 )?
            {
             before(grammarAccess.getInterfaceAccess().getGroup_4()); 
            // InternalUmlTextual.g:2121:2: ( rule__Interface__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalUmlTextual.g:2121:3: rule__Interface__Group_4__0
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
    // InternalUmlTextual.g:2129:1: rule__Interface__Group__5 : rule__Interface__Group__5__Impl rule__Interface__Group__6 ;
    public final void rule__Interface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2133:1: ( rule__Interface__Group__5__Impl rule__Interface__Group__6 )
            // InternalUmlTextual.g:2134:2: rule__Interface__Group__5__Impl rule__Interface__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalUmlTextual.g:2141:1: rule__Interface__Group__5__Impl : ( '{' ) ;
    public final void rule__Interface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2145:1: ( ( '{' ) )
            // InternalUmlTextual.g:2146:1: ( '{' )
            {
            // InternalUmlTextual.g:2146:1: ( '{' )
            // InternalUmlTextual.g:2147:2: '{'
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
    // InternalUmlTextual.g:2156:1: rule__Interface__Group__6 : rule__Interface__Group__6__Impl rule__Interface__Group__7 ;
    public final void rule__Interface__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2160:1: ( rule__Interface__Group__6__Impl rule__Interface__Group__7 )
            // InternalUmlTextual.g:2161:2: rule__Interface__Group__6__Impl rule__Interface__Group__7
            {
            pushFollow(FOLLOW_22);
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
    // InternalUmlTextual.g:2168:1: rule__Interface__Group__6__Impl : ( ( rule__Interface__AttributesAssignment_6 )* ) ;
    public final void rule__Interface__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2172:1: ( ( ( rule__Interface__AttributesAssignment_6 )* ) )
            // InternalUmlTextual.g:2173:1: ( ( rule__Interface__AttributesAssignment_6 )* )
            {
            // InternalUmlTextual.g:2173:1: ( ( rule__Interface__AttributesAssignment_6 )* )
            // InternalUmlTextual.g:2174:2: ( rule__Interface__AttributesAssignment_6 )*
            {
             before(grammarAccess.getInterfaceAccess().getAttributesAssignment_6()); 
            // InternalUmlTextual.g:2175:2: ( rule__Interface__AttributesAssignment_6 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15||(LA29_0>=17 && LA29_0<=19)||LA29_0==41) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalUmlTextual.g:2175:3: rule__Interface__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Interface__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalUmlTextual.g:2183:1: rule__Interface__Group__7 : rule__Interface__Group__7__Impl ;
    public final void rule__Interface__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2187:1: ( rule__Interface__Group__7__Impl )
            // InternalUmlTextual.g:2188:2: rule__Interface__Group__7__Impl
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
    // InternalUmlTextual.g:2194:1: rule__Interface__Group__7__Impl : ( '}' ) ;
    public final void rule__Interface__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2198:1: ( ( '}' ) )
            // InternalUmlTextual.g:2199:1: ( '}' )
            {
            // InternalUmlTextual.g:2199:1: ( '}' )
            // InternalUmlTextual.g:2200:2: '}'
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
    // InternalUmlTextual.g:2210:1: rule__Interface__Group_0__0 : rule__Interface__Group_0__0__Impl rule__Interface__Group_0__1 ;
    public final void rule__Interface__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2214:1: ( rule__Interface__Group_0__0__Impl rule__Interface__Group_0__1 )
            // InternalUmlTextual.g:2215:2: rule__Interface__Group_0__0__Impl rule__Interface__Group_0__1
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
    // InternalUmlTextual.g:2222:1: rule__Interface__Group_0__0__Impl : ( '@' ) ;
    public final void rule__Interface__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2226:1: ( ( '@' ) )
            // InternalUmlTextual.g:2227:1: ( '@' )
            {
            // InternalUmlTextual.g:2227:1: ( '@' )
            // InternalUmlTextual.g:2228:2: '@'
            {
             before(grammarAccess.getInterfaceAccess().getCommercialAtKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalUmlTextual.g:2237:1: rule__Interface__Group_0__1 : rule__Interface__Group_0__1__Impl ;
    public final void rule__Interface__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2241:1: ( rule__Interface__Group_0__1__Impl )
            // InternalUmlTextual.g:2242:2: rule__Interface__Group_0__1__Impl
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
    // InternalUmlTextual.g:2248:1: rule__Interface__Group_0__1__Impl : ( ( rule__Interface__StereotypeAssignment_0_1 ) ) ;
    public final void rule__Interface__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2252:1: ( ( ( rule__Interface__StereotypeAssignment_0_1 ) ) )
            // InternalUmlTextual.g:2253:1: ( ( rule__Interface__StereotypeAssignment_0_1 ) )
            {
            // InternalUmlTextual.g:2253:1: ( ( rule__Interface__StereotypeAssignment_0_1 ) )
            // InternalUmlTextual.g:2254:2: ( rule__Interface__StereotypeAssignment_0_1 )
            {
             before(grammarAccess.getInterfaceAccess().getStereotypeAssignment_0_1()); 
            // InternalUmlTextual.g:2255:2: ( rule__Interface__StereotypeAssignment_0_1 )
            // InternalUmlTextual.g:2255:3: rule__Interface__StereotypeAssignment_0_1
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
    // InternalUmlTextual.g:2264:1: rule__Interface__Group_4__0 : rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 ;
    public final void rule__Interface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2268:1: ( rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1 )
            // InternalUmlTextual.g:2269:2: rule__Interface__Group_4__0__Impl rule__Interface__Group_4__1
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
    // InternalUmlTextual.g:2276:1: rule__Interface__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Interface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2280:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:2281:1: ( 'extends' )
            {
            // InternalUmlTextual.g:2281:1: ( 'extends' )
            // InternalUmlTextual.g:2282:2: 'extends'
            {
             before(grammarAccess.getInterfaceAccess().getExtendsKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUmlTextual.g:2291:1: rule__Interface__Group_4__1 : rule__Interface__Group_4__1__Impl ;
    public final void rule__Interface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2295:1: ( rule__Interface__Group_4__1__Impl )
            // InternalUmlTextual.g:2296:2: rule__Interface__Group_4__1__Impl
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
    // InternalUmlTextual.g:2302:1: rule__Interface__Group_4__1__Impl : ( ( rule__Interface__ParentInterfaceAssignment_4_1 ) ) ;
    public final void rule__Interface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2306:1: ( ( ( rule__Interface__ParentInterfaceAssignment_4_1 ) ) )
            // InternalUmlTextual.g:2307:1: ( ( rule__Interface__ParentInterfaceAssignment_4_1 ) )
            {
            // InternalUmlTextual.g:2307:1: ( ( rule__Interface__ParentInterfaceAssignment_4_1 ) )
            // InternalUmlTextual.g:2308:2: ( rule__Interface__ParentInterfaceAssignment_4_1 )
            {
             before(grammarAccess.getInterfaceAccess().getParentInterfaceAssignment_4_1()); 
            // InternalUmlTextual.g:2309:2: ( rule__Interface__ParentInterfaceAssignment_4_1 )
            // InternalUmlTextual.g:2309:3: rule__Interface__ParentInterfaceAssignment_4_1
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
    // InternalUmlTextual.g:2318:1: rule__DomainSpecificType__Group__0 : rule__DomainSpecificType__Group__0__Impl rule__DomainSpecificType__Group__1 ;
    public final void rule__DomainSpecificType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2322:1: ( rule__DomainSpecificType__Group__0__Impl rule__DomainSpecificType__Group__1 )
            // InternalUmlTextual.g:2323:2: rule__DomainSpecificType__Group__0__Impl rule__DomainSpecificType__Group__1
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
    // InternalUmlTextual.g:2330:1: rule__DomainSpecificType__Group__0__Impl : ( 'domaintype' ) ;
    public final void rule__DomainSpecificType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2334:1: ( ( 'domaintype' ) )
            // InternalUmlTextual.g:2335:1: ( 'domaintype' )
            {
            // InternalUmlTextual.g:2335:1: ( 'domaintype' )
            // InternalUmlTextual.g:2336:2: 'domaintype'
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getDomaintypeKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUmlTextual.g:2345:1: rule__DomainSpecificType__Group__1 : rule__DomainSpecificType__Group__1__Impl rule__DomainSpecificType__Group__2 ;
    public final void rule__DomainSpecificType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2349:1: ( rule__DomainSpecificType__Group__1__Impl rule__DomainSpecificType__Group__2 )
            // InternalUmlTextual.g:2350:2: rule__DomainSpecificType__Group__1__Impl rule__DomainSpecificType__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalUmlTextual.g:2357:1: rule__DomainSpecificType__Group__1__Impl : ( ( rule__DomainSpecificType__NameAssignment_1 ) ) ;
    public final void rule__DomainSpecificType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2361:1: ( ( ( rule__DomainSpecificType__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:2362:1: ( ( rule__DomainSpecificType__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:2362:1: ( ( rule__DomainSpecificType__NameAssignment_1 ) )
            // InternalUmlTextual.g:2363:2: ( rule__DomainSpecificType__NameAssignment_1 )
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:2364:2: ( rule__DomainSpecificType__NameAssignment_1 )
            // InternalUmlTextual.g:2364:3: rule__DomainSpecificType__NameAssignment_1
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
    // InternalUmlTextual.g:2372:1: rule__DomainSpecificType__Group__2 : rule__DomainSpecificType__Group__2__Impl rule__DomainSpecificType__Group__3 ;
    public final void rule__DomainSpecificType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2376:1: ( rule__DomainSpecificType__Group__2__Impl rule__DomainSpecificType__Group__3 )
            // InternalUmlTextual.g:2377:2: rule__DomainSpecificType__Group__2__Impl rule__DomainSpecificType__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalUmlTextual.g:2384:1: rule__DomainSpecificType__Group__2__Impl : ( '=' ) ;
    public final void rule__DomainSpecificType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2388:1: ( ( '=' ) )
            // InternalUmlTextual.g:2389:1: ( '=' )
            {
            // InternalUmlTextual.g:2389:1: ( '=' )
            // InternalUmlTextual.g:2390:2: '='
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getEqualsSignKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUmlTextual.g:2399:1: rule__DomainSpecificType__Group__3 : rule__DomainSpecificType__Group__3__Impl ;
    public final void rule__DomainSpecificType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2403:1: ( rule__DomainSpecificType__Group__3__Impl )
            // InternalUmlTextual.g:2404:2: rule__DomainSpecificType__Group__3__Impl
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
    // InternalUmlTextual.g:2410:1: rule__DomainSpecificType__Group__3__Impl : ( ( rule__DomainSpecificType__DescriptionAssignment_3 ) ) ;
    public final void rule__DomainSpecificType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2414:1: ( ( ( rule__DomainSpecificType__DescriptionAssignment_3 ) ) )
            // InternalUmlTextual.g:2415:1: ( ( rule__DomainSpecificType__DescriptionAssignment_3 ) )
            {
            // InternalUmlTextual.g:2415:1: ( ( rule__DomainSpecificType__DescriptionAssignment_3 ) )
            // InternalUmlTextual.g:2416:2: ( rule__DomainSpecificType__DescriptionAssignment_3 )
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getDescriptionAssignment_3()); 
            // InternalUmlTextual.g:2417:2: ( rule__DomainSpecificType__DescriptionAssignment_3 )
            // InternalUmlTextual.g:2417:3: rule__DomainSpecificType__DescriptionAssignment_3
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
    // InternalUmlTextual.g:2426:1: rule__Multiplicity__Group_5__0 : rule__Multiplicity__Group_5__0__Impl rule__Multiplicity__Group_5__1 ;
    public final void rule__Multiplicity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2430:1: ( rule__Multiplicity__Group_5__0__Impl rule__Multiplicity__Group_5__1 )
            // InternalUmlTextual.g:2431:2: rule__Multiplicity__Group_5__0__Impl rule__Multiplicity__Group_5__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalUmlTextual.g:2438:1: rule__Multiplicity__Group_5__0__Impl : ( '0..' ) ;
    public final void rule__Multiplicity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2442:1: ( ( '0..' ) )
            // InternalUmlTextual.g:2443:1: ( '0..' )
            {
            // InternalUmlTextual.g:2443:1: ( '0..' )
            // InternalUmlTextual.g:2444:2: '0..'
            {
             before(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUmlTextual.g:2453:1: rule__Multiplicity__Group_5__1 : rule__Multiplicity__Group_5__1__Impl ;
    public final void rule__Multiplicity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2457:1: ( rule__Multiplicity__Group_5__1__Impl )
            // InternalUmlTextual.g:2458:2: rule__Multiplicity__Group_5__1__Impl
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
    // InternalUmlTextual.g:2464:1: rule__Multiplicity__Group_5__1__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2468:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2469:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2469:1: ( RULE_INT )
            // InternalUmlTextual.g:2470:2: RULE_INT
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
    // InternalUmlTextual.g:2480:1: rule__Multiplicity__Group_6__0 : rule__Multiplicity__Group_6__0__Impl rule__Multiplicity__Group_6__1 ;
    public final void rule__Multiplicity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2484:1: ( rule__Multiplicity__Group_6__0__Impl rule__Multiplicity__Group_6__1 )
            // InternalUmlTextual.g:2485:2: rule__Multiplicity__Group_6__0__Impl rule__Multiplicity__Group_6__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalUmlTextual.g:2492:1: rule__Multiplicity__Group_6__0__Impl : ( '1..' ) ;
    public final void rule__Multiplicity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2496:1: ( ( '1..' ) )
            // InternalUmlTextual.g:2497:1: ( '1..' )
            {
            // InternalUmlTextual.g:2497:1: ( '1..' )
            // InternalUmlTextual.g:2498:2: '1..'
            {
             before(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUmlTextual.g:2507:1: rule__Multiplicity__Group_6__1 : rule__Multiplicity__Group_6__1__Impl ;
    public final void rule__Multiplicity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2511:1: ( rule__Multiplicity__Group_6__1__Impl )
            // InternalUmlTextual.g:2512:2: rule__Multiplicity__Group_6__1__Impl
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
    // InternalUmlTextual.g:2518:1: rule__Multiplicity__Group_6__1__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2522:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2523:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2523:1: ( RULE_INT )
            // InternalUmlTextual.g:2524:2: RULE_INT
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
    // InternalUmlTextual.g:2534:1: rule__Multiplicity__Group_8__0 : rule__Multiplicity__Group_8__0__Impl rule__Multiplicity__Group_8__1 ;
    public final void rule__Multiplicity__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2538:1: ( rule__Multiplicity__Group_8__0__Impl rule__Multiplicity__Group_8__1 )
            // InternalUmlTextual.g:2539:2: rule__Multiplicity__Group_8__0__Impl rule__Multiplicity__Group_8__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalUmlTextual.g:2546:1: rule__Multiplicity__Group_8__0__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2550:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2551:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2551:1: ( RULE_INT )
            // InternalUmlTextual.g:2552:2: RULE_INT
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
    // InternalUmlTextual.g:2561:1: rule__Multiplicity__Group_8__1 : rule__Multiplicity__Group_8__1__Impl rule__Multiplicity__Group_8__2 ;
    public final void rule__Multiplicity__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2565:1: ( rule__Multiplicity__Group_8__1__Impl rule__Multiplicity__Group_8__2 )
            // InternalUmlTextual.g:2566:2: rule__Multiplicity__Group_8__1__Impl rule__Multiplicity__Group_8__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalUmlTextual.g:2573:1: rule__Multiplicity__Group_8__1__Impl : ( '..' ) ;
    public final void rule__Multiplicity__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2577:1: ( ( '..' ) )
            // InternalUmlTextual.g:2578:1: ( '..' )
            {
            // InternalUmlTextual.g:2578:1: ( '..' )
            // InternalUmlTextual.g:2579:2: '..'
            {
             before(grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_8_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalUmlTextual.g:2588:1: rule__Multiplicity__Group_8__2 : rule__Multiplicity__Group_8__2__Impl ;
    public final void rule__Multiplicity__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2592:1: ( rule__Multiplicity__Group_8__2__Impl )
            // InternalUmlTextual.g:2593:2: rule__Multiplicity__Group_8__2__Impl
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
    // InternalUmlTextual.g:2599:1: rule__Multiplicity__Group_8__2__Impl : ( RULE_INT ) ;
    public final void rule__Multiplicity__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2603:1: ( ( RULE_INT ) )
            // InternalUmlTextual.g:2604:1: ( RULE_INT )
            {
            // InternalUmlTextual.g:2604:1: ( RULE_INT )
            // InternalUmlTextual.g:2605:2: RULE_INT
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
    // InternalUmlTextual.g:2615:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2619:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUmlTextual.g:2620:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalUmlTextual.g:2627:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__VisibilityAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2631:1: ( ( ( rule__Attribute__VisibilityAssignment_0 )? ) )
            // InternalUmlTextual.g:2632:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            {
            // InternalUmlTextual.g:2632:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            // InternalUmlTextual.g:2633:2: ( rule__Attribute__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_0()); 
            // InternalUmlTextual.g:2634:2: ( rule__Attribute__VisibilityAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==15||(LA30_0>=17 && LA30_0<=19)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalUmlTextual.g:2634:3: rule__Attribute__VisibilityAssignment_0
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
    // InternalUmlTextual.g:2642:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2646:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUmlTextual.g:2647:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalUmlTextual.g:2654:1: rule__Attribute__Group__1__Impl : ( 'attr' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2658:1: ( ( 'attr' ) )
            // InternalUmlTextual.g:2659:1: ( 'attr' )
            {
            // InternalUmlTextual.g:2659:1: ( 'attr' )
            // InternalUmlTextual.g:2660:2: 'attr'
            {
             before(grammarAccess.getAttributeAccess().getAttrKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUmlTextual.g:2669:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2673:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalUmlTextual.g:2674:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalUmlTextual.g:2681:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2685:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:2686:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:2686:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalUmlTextual.g:2687:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:2688:2: ( rule__Attribute__NameAssignment_2 )
            // InternalUmlTextual.g:2688:3: rule__Attribute__NameAssignment_2
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
    // InternalUmlTextual.g:2696:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2700:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalUmlTextual.g:2701:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:2708:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2712:1: ( ( ':' ) )
            // InternalUmlTextual.g:2713:1: ( ':' )
            {
            // InternalUmlTextual.g:2713:1: ( ':' )
            // InternalUmlTextual.g:2714:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:2723:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2727:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalUmlTextual.g:2728:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:2735:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2739:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalUmlTextual.g:2740:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalUmlTextual.g:2740:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalUmlTextual.g:2741:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalUmlTextual.g:2742:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalUmlTextual.g:2742:3: rule__Attribute__TypeAssignment_4
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
    // InternalUmlTextual.g:2750:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2754:1: ( rule__Attribute__Group__5__Impl )
            // InternalUmlTextual.g:2755:2: rule__Attribute__Group__5__Impl
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
    // InternalUmlTextual.g:2761:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2765:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalUmlTextual.g:2766:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalUmlTextual.g:2766:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalUmlTextual.g:2767:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalUmlTextual.g:2768:2: ( rule__Attribute__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==43) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUmlTextual.g:2768:3: rule__Attribute__Group_5__0
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
    // InternalUmlTextual.g:2777:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2781:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalUmlTextual.g:2782:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:2789:1: rule__Attribute__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2793:1: ( ( '[' ) )
            // InternalUmlTextual.g:2794:1: ( '[' )
            {
            // InternalUmlTextual.g:2794:1: ( '[' )
            // InternalUmlTextual.g:2795:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:2804:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2808:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalUmlTextual.g:2809:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalUmlTextual.g:2816:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__MultiplicityAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2820:1: ( ( ( rule__Attribute__MultiplicityAssignment_5_1 ) ) )
            // InternalUmlTextual.g:2821:1: ( ( rule__Attribute__MultiplicityAssignment_5_1 ) )
            {
            // InternalUmlTextual.g:2821:1: ( ( rule__Attribute__MultiplicityAssignment_5_1 ) )
            // InternalUmlTextual.g:2822:2: ( rule__Attribute__MultiplicityAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_5_1()); 
            // InternalUmlTextual.g:2823:2: ( rule__Attribute__MultiplicityAssignment_5_1 )
            // InternalUmlTextual.g:2823:3: rule__Attribute__MultiplicityAssignment_5_1
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
    // InternalUmlTextual.g:2831:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2835:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalUmlTextual.g:2836:2: rule__Attribute__Group_5__2__Impl
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
    // InternalUmlTextual.g:2842:1: rule__Attribute__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2846:1: ( ( ']' ) )
            // InternalUmlTextual.g:2847:1: ( ']' )
            {
            // InternalUmlTextual.g:2847:1: ( ']' )
            // InternalUmlTextual.g:2848:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUmlTextual.g:2858:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2862:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalUmlTextual.g:2863:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalUmlTextual.g:2870:1: rule__Method__Group__0__Impl : ( ( 'abstract' )? ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2874:1: ( ( ( 'abstract' )? ) )
            // InternalUmlTextual.g:2875:1: ( ( 'abstract' )? )
            {
            // InternalUmlTextual.g:2875:1: ( ( 'abstract' )? )
            // InternalUmlTextual.g:2876:2: ( 'abstract' )?
            {
             before(grammarAccess.getMethodAccess().getAbstractKeyword_0()); 
            // InternalUmlTextual.g:2877:2: ( 'abstract' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==11) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalUmlTextual.g:2877:3: 'abstract'
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
    // InternalUmlTextual.g:2885:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2889:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalUmlTextual.g:2890:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalUmlTextual.g:2897:1: rule__Method__Group__1__Impl : ( ( 'static' )? ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2901:1: ( ( ( 'static' )? ) )
            // InternalUmlTextual.g:2902:1: ( ( 'static' )? )
            {
            // InternalUmlTextual.g:2902:1: ( ( 'static' )? )
            // InternalUmlTextual.g:2903:2: ( 'static' )?
            {
             before(grammarAccess.getMethodAccess().getStaticKeyword_1()); 
            // InternalUmlTextual.g:2904:2: ( 'static' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalUmlTextual.g:2904:3: 'static'
                    {
                    match(input,45,FOLLOW_2); 

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
    // InternalUmlTextual.g:2912:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2916:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalUmlTextual.g:2917:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalUmlTextual.g:2924:1: rule__Method__Group__2__Impl : ( ( rule__Method__VisibilityAssignment_2 )? ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2928:1: ( ( ( rule__Method__VisibilityAssignment_2 )? ) )
            // InternalUmlTextual.g:2929:1: ( ( rule__Method__VisibilityAssignment_2 )? )
            {
            // InternalUmlTextual.g:2929:1: ( ( rule__Method__VisibilityAssignment_2 )? )
            // InternalUmlTextual.g:2930:2: ( rule__Method__VisibilityAssignment_2 )?
            {
             before(grammarAccess.getMethodAccess().getVisibilityAssignment_2()); 
            // InternalUmlTextual.g:2931:2: ( rule__Method__VisibilityAssignment_2 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==15||(LA34_0>=17 && LA34_0<=19)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUmlTextual.g:2931:3: rule__Method__VisibilityAssignment_2
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
    // InternalUmlTextual.g:2939:1: rule__Method__Group__3 : rule__Method__Group__3__Impl rule__Method__Group__4 ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2943:1: ( rule__Method__Group__3__Impl rule__Method__Group__4 )
            // InternalUmlTextual.g:2944:2: rule__Method__Group__3__Impl rule__Method__Group__4
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
    // InternalUmlTextual.g:2951:1: rule__Method__Group__3__Impl : ( 'function' ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2955:1: ( ( 'function' ) )
            // InternalUmlTextual.g:2956:1: ( 'function' )
            {
            // InternalUmlTextual.g:2956:1: ( 'function' )
            // InternalUmlTextual.g:2957:2: 'function'
            {
             before(grammarAccess.getMethodAccess().getFunctionKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalUmlTextual.g:2966:1: rule__Method__Group__4 : rule__Method__Group__4__Impl rule__Method__Group__5 ;
    public final void rule__Method__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2970:1: ( rule__Method__Group__4__Impl rule__Method__Group__5 )
            // InternalUmlTextual.g:2971:2: rule__Method__Group__4__Impl rule__Method__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalUmlTextual.g:2978:1: rule__Method__Group__4__Impl : ( ( rule__Method__NameAssignment_4 ) ) ;
    public final void rule__Method__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2982:1: ( ( ( rule__Method__NameAssignment_4 ) ) )
            // InternalUmlTextual.g:2983:1: ( ( rule__Method__NameAssignment_4 ) )
            {
            // InternalUmlTextual.g:2983:1: ( ( rule__Method__NameAssignment_4 ) )
            // InternalUmlTextual.g:2984:2: ( rule__Method__NameAssignment_4 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_4()); 
            // InternalUmlTextual.g:2985:2: ( rule__Method__NameAssignment_4 )
            // InternalUmlTextual.g:2985:3: rule__Method__NameAssignment_4
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
    // InternalUmlTextual.g:2993:1: rule__Method__Group__5 : rule__Method__Group__5__Impl rule__Method__Group__6 ;
    public final void rule__Method__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2997:1: ( rule__Method__Group__5__Impl rule__Method__Group__6 )
            // InternalUmlTextual.g:2998:2: rule__Method__Group__5__Impl rule__Method__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalUmlTextual.g:3005:1: rule__Method__Group__5__Impl : ( '(' ) ;
    public final void rule__Method__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3009:1: ( ( '(' ) )
            // InternalUmlTextual.g:3010:1: ( '(' )
            {
            // InternalUmlTextual.g:3010:1: ( '(' )
            // InternalUmlTextual.g:3011:2: '('
            {
             before(grammarAccess.getMethodAccess().getLeftParenthesisKeyword_5()); 
            match(input,47,FOLLOW_2); 
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
    // InternalUmlTextual.g:3020:1: rule__Method__Group__6 : rule__Method__Group__6__Impl rule__Method__Group__7 ;
    public final void rule__Method__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3024:1: ( rule__Method__Group__6__Impl rule__Method__Group__7 )
            // InternalUmlTextual.g:3025:2: rule__Method__Group__6__Impl rule__Method__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalUmlTextual.g:3032:1: rule__Method__Group__6__Impl : ( ( rule__Method__Group_6__0 )? ) ;
    public final void rule__Method__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3036:1: ( ( ( rule__Method__Group_6__0 )? ) )
            // InternalUmlTextual.g:3037:1: ( ( rule__Method__Group_6__0 )? )
            {
            // InternalUmlTextual.g:3037:1: ( ( rule__Method__Group_6__0 )? )
            // InternalUmlTextual.g:3038:2: ( rule__Method__Group_6__0 )?
            {
             before(grammarAccess.getMethodAccess().getGroup_6()); 
            // InternalUmlTextual.g:3039:2: ( rule__Method__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalUmlTextual.g:3039:3: rule__Method__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Method__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalUmlTextual.g:3047:1: rule__Method__Group__7 : rule__Method__Group__7__Impl rule__Method__Group__8 ;
    public final void rule__Method__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3051:1: ( rule__Method__Group__7__Impl rule__Method__Group__8 )
            // InternalUmlTextual.g:3052:2: rule__Method__Group__7__Impl rule__Method__Group__8
            {
            pushFollow(FOLLOW_36);
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
    // InternalUmlTextual.g:3059:1: rule__Method__Group__7__Impl : ( ')' ) ;
    public final void rule__Method__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3063:1: ( ( ')' ) )
            // InternalUmlTextual.g:3064:1: ( ')' )
            {
            // InternalUmlTextual.g:3064:1: ( ')' )
            // InternalUmlTextual.g:3065:2: ')'
            {
             before(grammarAccess.getMethodAccess().getRightParenthesisKeyword_7()); 
            match(input,48,FOLLOW_2); 
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
    // InternalUmlTextual.g:3074:1: rule__Method__Group__8 : rule__Method__Group__8__Impl rule__Method__Group__9 ;
    public final void rule__Method__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3078:1: ( rule__Method__Group__8__Impl rule__Method__Group__9 )
            // InternalUmlTextual.g:3079:2: rule__Method__Group__8__Impl rule__Method__Group__9
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:3086:1: rule__Method__Group__8__Impl : ( '->' ) ;
    public final void rule__Method__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3090:1: ( ( '->' ) )
            // InternalUmlTextual.g:3091:1: ( '->' )
            {
            // InternalUmlTextual.g:3091:1: ( '->' )
            // InternalUmlTextual.g:3092:2: '->'
            {
             before(grammarAccess.getMethodAccess().getHyphenMinusGreaterThanSignKeyword_8()); 
            match(input,49,FOLLOW_2); 
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
    // InternalUmlTextual.g:3101:1: rule__Method__Group__9 : rule__Method__Group__9__Impl ;
    public final void rule__Method__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3105:1: ( rule__Method__Group__9__Impl )
            // InternalUmlTextual.g:3106:2: rule__Method__Group__9__Impl
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
    // InternalUmlTextual.g:3112:1: rule__Method__Group__9__Impl : ( ( rule__Method__ReturnTypeAssignment_9 ) ) ;
    public final void rule__Method__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3116:1: ( ( ( rule__Method__ReturnTypeAssignment_9 ) ) )
            // InternalUmlTextual.g:3117:1: ( ( rule__Method__ReturnTypeAssignment_9 ) )
            {
            // InternalUmlTextual.g:3117:1: ( ( rule__Method__ReturnTypeAssignment_9 ) )
            // InternalUmlTextual.g:3118:2: ( rule__Method__ReturnTypeAssignment_9 )
            {
             before(grammarAccess.getMethodAccess().getReturnTypeAssignment_9()); 
            // InternalUmlTextual.g:3119:2: ( rule__Method__ReturnTypeAssignment_9 )
            // InternalUmlTextual.g:3119:3: rule__Method__ReturnTypeAssignment_9
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


    // $ANTLR start "rule__Method__Group_6__0"
    // InternalUmlTextual.g:3128:1: rule__Method__Group_6__0 : rule__Method__Group_6__0__Impl rule__Method__Group_6__1 ;
    public final void rule__Method__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3132:1: ( rule__Method__Group_6__0__Impl rule__Method__Group_6__1 )
            // InternalUmlTextual.g:3133:2: rule__Method__Group_6__0__Impl rule__Method__Group_6__1
            {
            pushFollow(FOLLOW_18);
            rule__Method__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__0"


    // $ANTLR start "rule__Method__Group_6__0__Impl"
    // InternalUmlTextual.g:3140:1: rule__Method__Group_6__0__Impl : ( ( rule__Method__ParametersAssignment_6_0 ) ) ;
    public final void rule__Method__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3144:1: ( ( ( rule__Method__ParametersAssignment_6_0 ) ) )
            // InternalUmlTextual.g:3145:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            {
            // InternalUmlTextual.g:3145:1: ( ( rule__Method__ParametersAssignment_6_0 ) )
            // InternalUmlTextual.g:3146:2: ( rule__Method__ParametersAssignment_6_0 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_0()); 
            // InternalUmlTextual.g:3147:2: ( rule__Method__ParametersAssignment_6_0 )
            // InternalUmlTextual.g:3147:3: rule__Method__ParametersAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__0__Impl"


    // $ANTLR start "rule__Method__Group_6__1"
    // InternalUmlTextual.g:3155:1: rule__Method__Group_6__1 : rule__Method__Group_6__1__Impl ;
    public final void rule__Method__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3159:1: ( rule__Method__Group_6__1__Impl )
            // InternalUmlTextual.g:3160:2: rule__Method__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__1"


    // $ANTLR start "rule__Method__Group_6__1__Impl"
    // InternalUmlTextual.g:3166:1: rule__Method__Group_6__1__Impl : ( ( rule__Method__Group_6_1__0 )* ) ;
    public final void rule__Method__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3170:1: ( ( ( rule__Method__Group_6_1__0 )* ) )
            // InternalUmlTextual.g:3171:1: ( ( rule__Method__Group_6_1__0 )* )
            {
            // InternalUmlTextual.g:3171:1: ( ( rule__Method__Group_6_1__0 )* )
            // InternalUmlTextual.g:3172:2: ( rule__Method__Group_6_1__0 )*
            {
             before(grammarAccess.getMethodAccess().getGroup_6_1()); 
            // InternalUmlTextual.g:3173:2: ( rule__Method__Group_6_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==34) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalUmlTextual.g:3173:3: rule__Method__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Method__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getMethodAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6__1__Impl"


    // $ANTLR start "rule__Method__Group_6_1__0"
    // InternalUmlTextual.g:3182:1: rule__Method__Group_6_1__0 : rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 ;
    public final void rule__Method__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3186:1: ( rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1 )
            // InternalUmlTextual.g:3187:2: rule__Method__Group_6_1__0__Impl rule__Method__Group_6_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Method__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__0"


    // $ANTLR start "rule__Method__Group_6_1__0__Impl"
    // InternalUmlTextual.g:3194:1: rule__Method__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__Method__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3198:1: ( ( ',' ) )
            // InternalUmlTextual.g:3199:1: ( ',' )
            {
            // InternalUmlTextual.g:3199:1: ( ',' )
            // InternalUmlTextual.g:3200:2: ','
            {
             before(grammarAccess.getMethodAccess().getCommaKeyword_6_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__0__Impl"


    // $ANTLR start "rule__Method__Group_6_1__1"
    // InternalUmlTextual.g:3209:1: rule__Method__Group_6_1__1 : rule__Method__Group_6_1__1__Impl ;
    public final void rule__Method__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3213:1: ( rule__Method__Group_6_1__1__Impl )
            // InternalUmlTextual.g:3214:2: rule__Method__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__1"


    // $ANTLR start "rule__Method__Group_6_1__1__Impl"
    // InternalUmlTextual.g:3220:1: rule__Method__Group_6_1__1__Impl : ( ( rule__Method__ParametersAssignment_6_1_1 ) ) ;
    public final void rule__Method__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3224:1: ( ( ( rule__Method__ParametersAssignment_6_1_1 ) ) )
            // InternalUmlTextual.g:3225:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            {
            // InternalUmlTextual.g:3225:1: ( ( rule__Method__ParametersAssignment_6_1_1 ) )
            // InternalUmlTextual.g:3226:2: ( rule__Method__ParametersAssignment_6_1_1 )
            {
             before(grammarAccess.getMethodAccess().getParametersAssignment_6_1_1()); 
            // InternalUmlTextual.g:3227:2: ( rule__Method__ParametersAssignment_6_1_1 )
            // InternalUmlTextual.g:3227:3: rule__Method__ParametersAssignment_6_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__ParametersAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getParametersAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__Group_6_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalUmlTextual.g:3236:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3240:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalUmlTextual.g:3241:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalUmlTextual.g:3248:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3252:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalUmlTextual.g:3253:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalUmlTextual.g:3253:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalUmlTextual.g:3254:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalUmlTextual.g:3255:2: ( rule__Parameter__NameAssignment_0 )
            // InternalUmlTextual.g:3255:3: rule__Parameter__NameAssignment_0
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
    // InternalUmlTextual.g:3263:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3267:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalUmlTextual.g:3268:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:3275:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3279:1: ( ( ':' ) )
            // InternalUmlTextual.g:3280:1: ( ':' )
            {
            // InternalUmlTextual.g:3280:1: ( ':' )
            // InternalUmlTextual.g:3281:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:3290:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3294:1: ( rule__Parameter__Group__2__Impl )
            // InternalUmlTextual.g:3295:2: rule__Parameter__Group__2__Impl
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
    // InternalUmlTextual.g:3301:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__ParameterTypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3305:1: ( ( ( rule__Parameter__ParameterTypeAssignment_2 ) ) )
            // InternalUmlTextual.g:3306:1: ( ( rule__Parameter__ParameterTypeAssignment_2 ) )
            {
            // InternalUmlTextual.g:3306:1: ( ( rule__Parameter__ParameterTypeAssignment_2 ) )
            // InternalUmlTextual.g:3307:2: ( rule__Parameter__ParameterTypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getParameterTypeAssignment_2()); 
            // InternalUmlTextual.g:3308:2: ( rule__Parameter__ParameterTypeAssignment_2 )
            // InternalUmlTextual.g:3308:3: rule__Parameter__ParameterTypeAssignment_2
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
    // InternalUmlTextual.g:3317:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3321:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalUmlTextual.g:3322:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalUmlTextual.g:3329:1: rule__Association__Group__0__Impl : ( ( 'undirected' )? ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3333:1: ( ( ( 'undirected' )? ) )
            // InternalUmlTextual.g:3334:1: ( ( 'undirected' )? )
            {
            // InternalUmlTextual.g:3334:1: ( ( 'undirected' )? )
            // InternalUmlTextual.g:3335:2: ( 'undirected' )?
            {
             before(grammarAccess.getAssociationAccess().getUndirectedKeyword_0()); 
            // InternalUmlTextual.g:3336:2: ( 'undirected' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalUmlTextual.g:3336:3: 'undirected'
                    {
                    match(input,50,FOLLOW_2); 

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
    // InternalUmlTextual.g:3344:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3348:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalUmlTextual.g:3349:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalUmlTextual.g:3356:1: rule__Association__Group__1__Impl : ( 'association' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3360:1: ( ( 'association' ) )
            // InternalUmlTextual.g:3361:1: ( 'association' )
            {
            // InternalUmlTextual.g:3361:1: ( 'association' )
            // InternalUmlTextual.g:3362:2: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalUmlTextual.g:3371:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3375:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalUmlTextual.g:3376:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:3383:1: rule__Association__Group__2__Impl : ( ( rule__Association__NameAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3387:1: ( ( ( rule__Association__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:3388:1: ( ( rule__Association__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:3388:1: ( ( rule__Association__NameAssignment_2 ) )
            // InternalUmlTextual.g:3389:2: ( rule__Association__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:3390:2: ( rule__Association__NameAssignment_2 )
            // InternalUmlTextual.g:3390:3: rule__Association__NameAssignment_2
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
    // InternalUmlTextual.g:3398:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3402:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalUmlTextual.g:3403:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalUmlTextual.g:3410:1: rule__Association__Group__3__Impl : ( '{' ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3414:1: ( ( '{' ) )
            // InternalUmlTextual.g:3415:1: ( '{' )
            {
            // InternalUmlTextual.g:3415:1: ( '{' )
            // InternalUmlTextual.g:3416:2: '{'
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
    // InternalUmlTextual.g:3425:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3429:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalUmlTextual.g:3430:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalUmlTextual.g:3437:1: rule__Association__Group__4__Impl : ( 'from' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3441:1: ( ( 'from' ) )
            // InternalUmlTextual.g:3442:1: ( 'from' )
            {
            // InternalUmlTextual.g:3442:1: ( 'from' )
            // InternalUmlTextual.g:3443:2: 'from'
            {
             before(grammarAccess.getAssociationAccess().getFromKeyword_4()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUmlTextual.g:3452:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3456:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalUmlTextual.g:3457:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalUmlTextual.g:3464:1: rule__Association__Group__5__Impl : ( ( rule__Association__Navigation1Assignment_5 )? ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3468:1: ( ( ( rule__Association__Navigation1Assignment_5 )? ) )
            // InternalUmlTextual.g:3469:1: ( ( rule__Association__Navigation1Assignment_5 )? )
            {
            // InternalUmlTextual.g:3469:1: ( ( rule__Association__Navigation1Assignment_5 )? )
            // InternalUmlTextual.g:3470:2: ( rule__Association__Navigation1Assignment_5 )?
            {
             before(grammarAccess.getAssociationAccess().getNavigation1Assignment_5()); 
            // InternalUmlTextual.g:3471:2: ( rule__Association__Navigation1Assignment_5 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==14) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalUmlTextual.g:3471:3: rule__Association__Navigation1Assignment_5
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
    // InternalUmlTextual.g:3479:1: rule__Association__Group__6 : rule__Association__Group__6__Impl rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3483:1: ( rule__Association__Group__6__Impl rule__Association__Group__7 )
            // InternalUmlTextual.g:3484:2: rule__Association__Group__6__Impl rule__Association__Group__7
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:3491:1: rule__Association__Group__6__Impl : ( ( rule__Association__Class1Assignment_6 ) ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3495:1: ( ( ( rule__Association__Class1Assignment_6 ) ) )
            // InternalUmlTextual.g:3496:1: ( ( rule__Association__Class1Assignment_6 ) )
            {
            // InternalUmlTextual.g:3496:1: ( ( rule__Association__Class1Assignment_6 ) )
            // InternalUmlTextual.g:3497:2: ( rule__Association__Class1Assignment_6 )
            {
             before(grammarAccess.getAssociationAccess().getClass1Assignment_6()); 
            // InternalUmlTextual.g:3498:2: ( rule__Association__Class1Assignment_6 )
            // InternalUmlTextual.g:3498:3: rule__Association__Class1Assignment_6
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
    // InternalUmlTextual.g:3506:1: rule__Association__Group__7 : rule__Association__Group__7__Impl rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3510:1: ( rule__Association__Group__7__Impl rule__Association__Group__8 )
            // InternalUmlTextual.g:3511:2: rule__Association__Group__7__Impl rule__Association__Group__8
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:3518:1: rule__Association__Group__7__Impl : ( '[' ) ;
    public final void rule__Association__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3522:1: ( ( '[' ) )
            // InternalUmlTextual.g:3523:1: ( '[' )
            {
            // InternalUmlTextual.g:3523:1: ( '[' )
            // InternalUmlTextual.g:3524:2: '['
            {
             before(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_7()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:3533:1: rule__Association__Group__8 : rule__Association__Group__8__Impl rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3537:1: ( rule__Association__Group__8__Impl rule__Association__Group__9 )
            // InternalUmlTextual.g:3538:2: rule__Association__Group__8__Impl rule__Association__Group__9
            {
            pushFollow(FOLLOW_32);
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
    // InternalUmlTextual.g:3545:1: rule__Association__Group__8__Impl : ( ( rule__Association__Multiplicity1Assignment_8 ) ) ;
    public final void rule__Association__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3549:1: ( ( ( rule__Association__Multiplicity1Assignment_8 ) ) )
            // InternalUmlTextual.g:3550:1: ( ( rule__Association__Multiplicity1Assignment_8 ) )
            {
            // InternalUmlTextual.g:3550:1: ( ( rule__Association__Multiplicity1Assignment_8 ) )
            // InternalUmlTextual.g:3551:2: ( rule__Association__Multiplicity1Assignment_8 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicity1Assignment_8()); 
            // InternalUmlTextual.g:3552:2: ( rule__Association__Multiplicity1Assignment_8 )
            // InternalUmlTextual.g:3552:3: rule__Association__Multiplicity1Assignment_8
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
    // InternalUmlTextual.g:3560:1: rule__Association__Group__9 : rule__Association__Group__9__Impl rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3564:1: ( rule__Association__Group__9__Impl rule__Association__Group__10 )
            // InternalUmlTextual.g:3565:2: rule__Association__Group__9__Impl rule__Association__Group__10
            {
            pushFollow(FOLLOW_42);
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
    // InternalUmlTextual.g:3572:1: rule__Association__Group__9__Impl : ( ']' ) ;
    public final void rule__Association__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3576:1: ( ( ']' ) )
            // InternalUmlTextual.g:3577:1: ( ']' )
            {
            // InternalUmlTextual.g:3577:1: ( ']' )
            // InternalUmlTextual.g:3578:2: ']'
            {
             before(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_9()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUmlTextual.g:3587:1: rule__Association__Group__10 : rule__Association__Group__10__Impl rule__Association__Group__11 ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3591:1: ( rule__Association__Group__10__Impl rule__Association__Group__11 )
            // InternalUmlTextual.g:3592:2: rule__Association__Group__10__Impl rule__Association__Group__11
            {
            pushFollow(FOLLOW_41);
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
    // InternalUmlTextual.g:3599:1: rule__Association__Group__10__Impl : ( 'to' ) ;
    public final void rule__Association__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3603:1: ( ( 'to' ) )
            // InternalUmlTextual.g:3604:1: ( 'to' )
            {
            // InternalUmlTextual.g:3604:1: ( 'to' )
            // InternalUmlTextual.g:3605:2: 'to'
            {
             before(grammarAccess.getAssociationAccess().getToKeyword_10()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUmlTextual.g:3614:1: rule__Association__Group__11 : rule__Association__Group__11__Impl rule__Association__Group__12 ;
    public final void rule__Association__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3618:1: ( rule__Association__Group__11__Impl rule__Association__Group__12 )
            // InternalUmlTextual.g:3619:2: rule__Association__Group__11__Impl rule__Association__Group__12
            {
            pushFollow(FOLLOW_41);
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
    // InternalUmlTextual.g:3626:1: rule__Association__Group__11__Impl : ( ( rule__Association__Navigation2Assignment_11 )? ) ;
    public final void rule__Association__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3630:1: ( ( ( rule__Association__Navigation2Assignment_11 )? ) )
            // InternalUmlTextual.g:3631:1: ( ( rule__Association__Navigation2Assignment_11 )? )
            {
            // InternalUmlTextual.g:3631:1: ( ( rule__Association__Navigation2Assignment_11 )? )
            // InternalUmlTextual.g:3632:2: ( rule__Association__Navigation2Assignment_11 )?
            {
             before(grammarAccess.getAssociationAccess().getNavigation2Assignment_11()); 
            // InternalUmlTextual.g:3633:2: ( rule__Association__Navigation2Assignment_11 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==14) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalUmlTextual.g:3633:3: rule__Association__Navigation2Assignment_11
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
    // InternalUmlTextual.g:3641:1: rule__Association__Group__12 : rule__Association__Group__12__Impl rule__Association__Group__13 ;
    public final void rule__Association__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3645:1: ( rule__Association__Group__12__Impl rule__Association__Group__13 )
            // InternalUmlTextual.g:3646:2: rule__Association__Group__12__Impl rule__Association__Group__13
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:3653:1: rule__Association__Group__12__Impl : ( ( rule__Association__Class2Assignment_12 ) ) ;
    public final void rule__Association__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3657:1: ( ( ( rule__Association__Class2Assignment_12 ) ) )
            // InternalUmlTextual.g:3658:1: ( ( rule__Association__Class2Assignment_12 ) )
            {
            // InternalUmlTextual.g:3658:1: ( ( rule__Association__Class2Assignment_12 ) )
            // InternalUmlTextual.g:3659:2: ( rule__Association__Class2Assignment_12 )
            {
             before(grammarAccess.getAssociationAccess().getClass2Assignment_12()); 
            // InternalUmlTextual.g:3660:2: ( rule__Association__Class2Assignment_12 )
            // InternalUmlTextual.g:3660:3: rule__Association__Class2Assignment_12
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
    // InternalUmlTextual.g:3668:1: rule__Association__Group__13 : rule__Association__Group__13__Impl rule__Association__Group__14 ;
    public final void rule__Association__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3672:1: ( rule__Association__Group__13__Impl rule__Association__Group__14 )
            // InternalUmlTextual.g:3673:2: rule__Association__Group__13__Impl rule__Association__Group__14
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:3680:1: rule__Association__Group__13__Impl : ( '[' ) ;
    public final void rule__Association__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3684:1: ( ( '[' ) )
            // InternalUmlTextual.g:3685:1: ( '[' )
            {
            // InternalUmlTextual.g:3685:1: ( '[' )
            // InternalUmlTextual.g:3686:2: '['
            {
             before(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_13()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:3695:1: rule__Association__Group__14 : rule__Association__Group__14__Impl rule__Association__Group__15 ;
    public final void rule__Association__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3699:1: ( rule__Association__Group__14__Impl rule__Association__Group__15 )
            // InternalUmlTextual.g:3700:2: rule__Association__Group__14__Impl rule__Association__Group__15
            {
            pushFollow(FOLLOW_32);
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
    // InternalUmlTextual.g:3707:1: rule__Association__Group__14__Impl : ( ( rule__Association__Multiplicity2Assignment_14 ) ) ;
    public final void rule__Association__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3711:1: ( ( ( rule__Association__Multiplicity2Assignment_14 ) ) )
            // InternalUmlTextual.g:3712:1: ( ( rule__Association__Multiplicity2Assignment_14 ) )
            {
            // InternalUmlTextual.g:3712:1: ( ( rule__Association__Multiplicity2Assignment_14 ) )
            // InternalUmlTextual.g:3713:2: ( rule__Association__Multiplicity2Assignment_14 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicity2Assignment_14()); 
            // InternalUmlTextual.g:3714:2: ( rule__Association__Multiplicity2Assignment_14 )
            // InternalUmlTextual.g:3714:3: rule__Association__Multiplicity2Assignment_14
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
    // InternalUmlTextual.g:3722:1: rule__Association__Group__15 : rule__Association__Group__15__Impl rule__Association__Group__16 ;
    public final void rule__Association__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3726:1: ( rule__Association__Group__15__Impl rule__Association__Group__16 )
            // InternalUmlTextual.g:3727:2: rule__Association__Group__15__Impl rule__Association__Group__16
            {
            pushFollow(FOLLOW_43);
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
    // InternalUmlTextual.g:3734:1: rule__Association__Group__15__Impl : ( ']' ) ;
    public final void rule__Association__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3738:1: ( ( ']' ) )
            // InternalUmlTextual.g:3739:1: ( ']' )
            {
            // InternalUmlTextual.g:3739:1: ( ']' )
            // InternalUmlTextual.g:3740:2: ']'
            {
             before(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_15()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUmlTextual.g:3749:1: rule__Association__Group__16 : rule__Association__Group__16__Impl rule__Association__Group__17 ;
    public final void rule__Association__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3753:1: ( rule__Association__Group__16__Impl rule__Association__Group__17 )
            // InternalUmlTextual.g:3754:2: rule__Association__Group__16__Impl rule__Association__Group__17
            {
            pushFollow(FOLLOW_43);
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
    // InternalUmlTextual.g:3761:1: rule__Association__Group__16__Impl : ( ( rule__Association__Group_16__0 )? ) ;
    public final void rule__Association__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3765:1: ( ( ( rule__Association__Group_16__0 )? ) )
            // InternalUmlTextual.g:3766:1: ( ( rule__Association__Group_16__0 )? )
            {
            // InternalUmlTextual.g:3766:1: ( ( rule__Association__Group_16__0 )? )
            // InternalUmlTextual.g:3767:2: ( rule__Association__Group_16__0 )?
            {
             before(grammarAccess.getAssociationAccess().getGroup_16()); 
            // InternalUmlTextual.g:3768:2: ( rule__Association__Group_16__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==54) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUmlTextual.g:3768:3: rule__Association__Group_16__0
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
    // InternalUmlTextual.g:3776:1: rule__Association__Group__17 : rule__Association__Group__17__Impl ;
    public final void rule__Association__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3780:1: ( rule__Association__Group__17__Impl )
            // InternalUmlTextual.g:3781:2: rule__Association__Group__17__Impl
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
    // InternalUmlTextual.g:3787:1: rule__Association__Group__17__Impl : ( '}' ) ;
    public final void rule__Association__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3791:1: ( ( '}' ) )
            // InternalUmlTextual.g:3792:1: ( '}' )
            {
            // InternalUmlTextual.g:3792:1: ( '}' )
            // InternalUmlTextual.g:3793:2: '}'
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
    // InternalUmlTextual.g:3803:1: rule__Association__Group_16__0 : rule__Association__Group_16__0__Impl rule__Association__Group_16__1 ;
    public final void rule__Association__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3807:1: ( rule__Association__Group_16__0__Impl rule__Association__Group_16__1 )
            // InternalUmlTextual.g:3808:2: rule__Association__Group_16__0__Impl rule__Association__Group_16__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalUmlTextual.g:3815:1: rule__Association__Group_16__0__Impl : ( 'with' ) ;
    public final void rule__Association__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3819:1: ( ( 'with' ) )
            // InternalUmlTextual.g:3820:1: ( 'with' )
            {
            // InternalUmlTextual.g:3820:1: ( 'with' )
            // InternalUmlTextual.g:3821:2: 'with'
            {
             before(grammarAccess.getAssociationAccess().getWithKeyword_16_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalUmlTextual.g:3830:1: rule__Association__Group_16__1 : rule__Association__Group_16__1__Impl rule__Association__Group_16__2 ;
    public final void rule__Association__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3834:1: ( rule__Association__Group_16__1__Impl rule__Association__Group_16__2 )
            // InternalUmlTextual.g:3835:2: rule__Association__Group_16__1__Impl rule__Association__Group_16__2
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
    // InternalUmlTextual.g:3842:1: rule__Association__Group_16__1__Impl : ( 'associatedclass' ) ;
    public final void rule__Association__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3846:1: ( ( 'associatedclass' ) )
            // InternalUmlTextual.g:3847:1: ( 'associatedclass' )
            {
            // InternalUmlTextual.g:3847:1: ( 'associatedclass' )
            // InternalUmlTextual.g:3848:2: 'associatedclass'
            {
             before(grammarAccess.getAssociationAccess().getAssociatedclassKeyword_16_1()); 
            match(input,55,FOLLOW_2); 
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
    // InternalUmlTextual.g:3857:1: rule__Association__Group_16__2 : rule__Association__Group_16__2__Impl ;
    public final void rule__Association__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3861:1: ( rule__Association__Group_16__2__Impl )
            // InternalUmlTextual.g:3862:2: rule__Association__Group_16__2__Impl
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
    // InternalUmlTextual.g:3868:1: rule__Association__Group_16__2__Impl : ( ( rule__Association__ClassAssignment_16_2 ) ) ;
    public final void rule__Association__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3872:1: ( ( ( rule__Association__ClassAssignment_16_2 ) ) )
            // InternalUmlTextual.g:3873:1: ( ( rule__Association__ClassAssignment_16_2 ) )
            {
            // InternalUmlTextual.g:3873:1: ( ( rule__Association__ClassAssignment_16_2 ) )
            // InternalUmlTextual.g:3874:2: ( rule__Association__ClassAssignment_16_2 )
            {
             before(grammarAccess.getAssociationAccess().getClassAssignment_16_2()); 
            // InternalUmlTextual.g:3875:2: ( rule__Association__ClassAssignment_16_2 )
            // InternalUmlTextual.g:3875:3: rule__Association__ClassAssignment_16_2
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
    // InternalUmlTextual.g:3884:1: rule__Aggregation__Group__0 : rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1 ;
    public final void rule__Aggregation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3888:1: ( rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1 )
            // InternalUmlTextual.g:3889:2: rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalUmlTextual.g:3896:1: rule__Aggregation__Group__0__Impl : ( 'aggregation' ) ;
    public final void rule__Aggregation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3900:1: ( ( 'aggregation' ) )
            // InternalUmlTextual.g:3901:1: ( 'aggregation' )
            {
            // InternalUmlTextual.g:3901:1: ( 'aggregation' )
            // InternalUmlTextual.g:3902:2: 'aggregation'
            {
             before(grammarAccess.getAggregationAccess().getAggregationKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalUmlTextual.g:3911:1: rule__Aggregation__Group__1 : rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2 ;
    public final void rule__Aggregation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3915:1: ( rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2 )
            // InternalUmlTextual.g:3916:2: rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:3923:1: rule__Aggregation__Group__1__Impl : ( ( rule__Aggregation__NameAssignment_1 ) ) ;
    public final void rule__Aggregation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3927:1: ( ( ( rule__Aggregation__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:3928:1: ( ( rule__Aggregation__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:3928:1: ( ( rule__Aggregation__NameAssignment_1 ) )
            // InternalUmlTextual.g:3929:2: ( rule__Aggregation__NameAssignment_1 )
            {
             before(grammarAccess.getAggregationAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:3930:2: ( rule__Aggregation__NameAssignment_1 )
            // InternalUmlTextual.g:3930:3: rule__Aggregation__NameAssignment_1
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
    // InternalUmlTextual.g:3938:1: rule__Aggregation__Group__2 : rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3 ;
    public final void rule__Aggregation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3942:1: ( rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3 )
            // InternalUmlTextual.g:3943:2: rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalUmlTextual.g:3950:1: rule__Aggregation__Group__2__Impl : ( '{' ) ;
    public final void rule__Aggregation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3954:1: ( ( '{' ) )
            // InternalUmlTextual.g:3955:1: ( '{' )
            {
            // InternalUmlTextual.g:3955:1: ( '{' )
            // InternalUmlTextual.g:3956:2: '{'
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
    // InternalUmlTextual.g:3965:1: rule__Aggregation__Group__3 : rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4 ;
    public final void rule__Aggregation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3969:1: ( rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4 )
            // InternalUmlTextual.g:3970:2: rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4
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
    // InternalUmlTextual.g:3977:1: rule__Aggregation__Group__3__Impl : ( 'from' ) ;
    public final void rule__Aggregation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3981:1: ( ( 'from' ) )
            // InternalUmlTextual.g:3982:1: ( 'from' )
            {
            // InternalUmlTextual.g:3982:1: ( 'from' )
            // InternalUmlTextual.g:3983:2: 'from'
            {
             before(grammarAccess.getAggregationAccess().getFromKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUmlTextual.g:3992:1: rule__Aggregation__Group__4 : rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5 ;
    public final void rule__Aggregation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3996:1: ( rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5 )
            // InternalUmlTextual.g:3997:2: rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:4004:1: rule__Aggregation__Group__4__Impl : ( ( rule__Aggregation__Class1Assignment_4 ) ) ;
    public final void rule__Aggregation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4008:1: ( ( ( rule__Aggregation__Class1Assignment_4 ) ) )
            // InternalUmlTextual.g:4009:1: ( ( rule__Aggregation__Class1Assignment_4 ) )
            {
            // InternalUmlTextual.g:4009:1: ( ( rule__Aggregation__Class1Assignment_4 ) )
            // InternalUmlTextual.g:4010:2: ( rule__Aggregation__Class1Assignment_4 )
            {
             before(grammarAccess.getAggregationAccess().getClass1Assignment_4()); 
            // InternalUmlTextual.g:4011:2: ( rule__Aggregation__Class1Assignment_4 )
            // InternalUmlTextual.g:4011:3: rule__Aggregation__Class1Assignment_4
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
    // InternalUmlTextual.g:4019:1: rule__Aggregation__Group__5 : rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6 ;
    public final void rule__Aggregation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4023:1: ( rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6 )
            // InternalUmlTextual.g:4024:2: rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:4031:1: rule__Aggregation__Group__5__Impl : ( '[' ) ;
    public final void rule__Aggregation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4035:1: ( ( '[' ) )
            // InternalUmlTextual.g:4036:1: ( '[' )
            {
            // InternalUmlTextual.g:4036:1: ( '[' )
            // InternalUmlTextual.g:4037:2: '['
            {
             before(grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_5()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:4046:1: rule__Aggregation__Group__6 : rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7 ;
    public final void rule__Aggregation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4050:1: ( rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7 )
            // InternalUmlTextual.g:4051:2: rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalUmlTextual.g:4058:1: rule__Aggregation__Group__6__Impl : ( ( rule__Aggregation__Multiplicity1Assignment_6 ) ) ;
    public final void rule__Aggregation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4062:1: ( ( ( rule__Aggregation__Multiplicity1Assignment_6 ) ) )
            // InternalUmlTextual.g:4063:1: ( ( rule__Aggregation__Multiplicity1Assignment_6 ) )
            {
            // InternalUmlTextual.g:4063:1: ( ( rule__Aggregation__Multiplicity1Assignment_6 ) )
            // InternalUmlTextual.g:4064:2: ( rule__Aggregation__Multiplicity1Assignment_6 )
            {
             before(grammarAccess.getAggregationAccess().getMultiplicity1Assignment_6()); 
            // InternalUmlTextual.g:4065:2: ( rule__Aggregation__Multiplicity1Assignment_6 )
            // InternalUmlTextual.g:4065:3: rule__Aggregation__Multiplicity1Assignment_6
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
    // InternalUmlTextual.g:4073:1: rule__Aggregation__Group__7 : rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8 ;
    public final void rule__Aggregation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4077:1: ( rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8 )
            // InternalUmlTextual.g:4078:2: rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8
            {
            pushFollow(FOLLOW_42);
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
    // InternalUmlTextual.g:4085:1: rule__Aggregation__Group__7__Impl : ( ']' ) ;
    public final void rule__Aggregation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4089:1: ( ( ']' ) )
            // InternalUmlTextual.g:4090:1: ( ']' )
            {
            // InternalUmlTextual.g:4090:1: ( ']' )
            // InternalUmlTextual.g:4091:2: ']'
            {
             before(grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_7()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUmlTextual.g:4100:1: rule__Aggregation__Group__8 : rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9 ;
    public final void rule__Aggregation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4104:1: ( rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9 )
            // InternalUmlTextual.g:4105:2: rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9
            {
            pushFollow(FOLLOW_41);
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
    // InternalUmlTextual.g:4112:1: rule__Aggregation__Group__8__Impl : ( 'to' ) ;
    public final void rule__Aggregation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4116:1: ( ( 'to' ) )
            // InternalUmlTextual.g:4117:1: ( 'to' )
            {
            // InternalUmlTextual.g:4117:1: ( 'to' )
            // InternalUmlTextual.g:4118:2: 'to'
            {
             before(grammarAccess.getAggregationAccess().getToKeyword_8()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUmlTextual.g:4127:1: rule__Aggregation__Group__9 : rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10 ;
    public final void rule__Aggregation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4131:1: ( rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10 )
            // InternalUmlTextual.g:4132:2: rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10
            {
            pushFollow(FOLLOW_41);
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
    // InternalUmlTextual.g:4139:1: rule__Aggregation__Group__9__Impl : ( ( rule__Aggregation__NavigationAssignment_9 )? ) ;
    public final void rule__Aggregation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4143:1: ( ( ( rule__Aggregation__NavigationAssignment_9 )? ) )
            // InternalUmlTextual.g:4144:1: ( ( rule__Aggregation__NavigationAssignment_9 )? )
            {
            // InternalUmlTextual.g:4144:1: ( ( rule__Aggregation__NavigationAssignment_9 )? )
            // InternalUmlTextual.g:4145:2: ( rule__Aggregation__NavigationAssignment_9 )?
            {
             before(grammarAccess.getAggregationAccess().getNavigationAssignment_9()); 
            // InternalUmlTextual.g:4146:2: ( rule__Aggregation__NavigationAssignment_9 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==14) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalUmlTextual.g:4146:3: rule__Aggregation__NavigationAssignment_9
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
    // InternalUmlTextual.g:4154:1: rule__Aggregation__Group__10 : rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11 ;
    public final void rule__Aggregation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4158:1: ( rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11 )
            // InternalUmlTextual.g:4159:2: rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:4166:1: rule__Aggregation__Group__10__Impl : ( ( rule__Aggregation__Class2Assignment_10 ) ) ;
    public final void rule__Aggregation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4170:1: ( ( ( rule__Aggregation__Class2Assignment_10 ) ) )
            // InternalUmlTextual.g:4171:1: ( ( rule__Aggregation__Class2Assignment_10 ) )
            {
            // InternalUmlTextual.g:4171:1: ( ( rule__Aggregation__Class2Assignment_10 ) )
            // InternalUmlTextual.g:4172:2: ( rule__Aggregation__Class2Assignment_10 )
            {
             before(grammarAccess.getAggregationAccess().getClass2Assignment_10()); 
            // InternalUmlTextual.g:4173:2: ( rule__Aggregation__Class2Assignment_10 )
            // InternalUmlTextual.g:4173:3: rule__Aggregation__Class2Assignment_10
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
    // InternalUmlTextual.g:4181:1: rule__Aggregation__Group__11 : rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12 ;
    public final void rule__Aggregation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4185:1: ( rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12 )
            // InternalUmlTextual.g:4186:2: rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:4193:1: rule__Aggregation__Group__11__Impl : ( '[' ) ;
    public final void rule__Aggregation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4197:1: ( ( '[' ) )
            // InternalUmlTextual.g:4198:1: ( '[' )
            {
            // InternalUmlTextual.g:4198:1: ( '[' )
            // InternalUmlTextual.g:4199:2: '['
            {
             before(grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_11()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:4208:1: rule__Aggregation__Group__12 : rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13 ;
    public final void rule__Aggregation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4212:1: ( rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13 )
            // InternalUmlTextual.g:4213:2: rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13
            {
            pushFollow(FOLLOW_32);
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
    // InternalUmlTextual.g:4220:1: rule__Aggregation__Group__12__Impl : ( ( rule__Aggregation__Multiplicity2Assignment_12 ) ) ;
    public final void rule__Aggregation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4224:1: ( ( ( rule__Aggregation__Multiplicity2Assignment_12 ) ) )
            // InternalUmlTextual.g:4225:1: ( ( rule__Aggregation__Multiplicity2Assignment_12 ) )
            {
            // InternalUmlTextual.g:4225:1: ( ( rule__Aggregation__Multiplicity2Assignment_12 ) )
            // InternalUmlTextual.g:4226:2: ( rule__Aggregation__Multiplicity2Assignment_12 )
            {
             before(grammarAccess.getAggregationAccess().getMultiplicity2Assignment_12()); 
            // InternalUmlTextual.g:4227:2: ( rule__Aggregation__Multiplicity2Assignment_12 )
            // InternalUmlTextual.g:4227:3: rule__Aggregation__Multiplicity2Assignment_12
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
    // InternalUmlTextual.g:4235:1: rule__Aggregation__Group__13 : rule__Aggregation__Group__13__Impl rule__Aggregation__Group__14 ;
    public final void rule__Aggregation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4239:1: ( rule__Aggregation__Group__13__Impl rule__Aggregation__Group__14 )
            // InternalUmlTextual.g:4240:2: rule__Aggregation__Group__13__Impl rule__Aggregation__Group__14
            {
            pushFollow(FOLLOW_45);
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
    // InternalUmlTextual.g:4247:1: rule__Aggregation__Group__13__Impl : ( ']' ) ;
    public final void rule__Aggregation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4251:1: ( ( ']' ) )
            // InternalUmlTextual.g:4252:1: ( ']' )
            {
            // InternalUmlTextual.g:4252:1: ( ']' )
            // InternalUmlTextual.g:4253:2: ']'
            {
             before(grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_13()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUmlTextual.g:4262:1: rule__Aggregation__Group__14 : rule__Aggregation__Group__14__Impl ;
    public final void rule__Aggregation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4266:1: ( rule__Aggregation__Group__14__Impl )
            // InternalUmlTextual.g:4267:2: rule__Aggregation__Group__14__Impl
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
    // InternalUmlTextual.g:4273:1: rule__Aggregation__Group__14__Impl : ( '}' ) ;
    public final void rule__Aggregation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4277:1: ( ( '}' ) )
            // InternalUmlTextual.g:4278:1: ( '}' )
            {
            // InternalUmlTextual.g:4278:1: ( '}' )
            // InternalUmlTextual.g:4279:2: '}'
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
    // InternalUmlTextual.g:4289:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4293:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalUmlTextual.g:4294:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalUmlTextual.g:4301:1: rule__Composition__Group__0__Impl : ( 'composition' ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4305:1: ( ( 'composition' ) )
            // InternalUmlTextual.g:4306:1: ( 'composition' )
            {
            // InternalUmlTextual.g:4306:1: ( 'composition' )
            // InternalUmlTextual.g:4307:2: 'composition'
            {
             before(grammarAccess.getCompositionAccess().getCompositionKeyword_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalUmlTextual.g:4316:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4320:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalUmlTextual.g:4321:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:4328:1: rule__Composition__Group__1__Impl : ( ( rule__Composition__NameAssignment_1 ) ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4332:1: ( ( ( rule__Composition__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:4333:1: ( ( rule__Composition__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:4333:1: ( ( rule__Composition__NameAssignment_1 ) )
            // InternalUmlTextual.g:4334:2: ( rule__Composition__NameAssignment_1 )
            {
             before(grammarAccess.getCompositionAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:4335:2: ( rule__Composition__NameAssignment_1 )
            // InternalUmlTextual.g:4335:3: rule__Composition__NameAssignment_1
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
    // InternalUmlTextual.g:4343:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl rule__Composition__Group__3 ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4347:1: ( rule__Composition__Group__2__Impl rule__Composition__Group__3 )
            // InternalUmlTextual.g:4348:2: rule__Composition__Group__2__Impl rule__Composition__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalUmlTextual.g:4355:1: rule__Composition__Group__2__Impl : ( '{' ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4359:1: ( ( '{' ) )
            // InternalUmlTextual.g:4360:1: ( '{' )
            {
            // InternalUmlTextual.g:4360:1: ( '{' )
            // InternalUmlTextual.g:4361:2: '{'
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
    // InternalUmlTextual.g:4370:1: rule__Composition__Group__3 : rule__Composition__Group__3__Impl rule__Composition__Group__4 ;
    public final void rule__Composition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4374:1: ( rule__Composition__Group__3__Impl rule__Composition__Group__4 )
            // InternalUmlTextual.g:4375:2: rule__Composition__Group__3__Impl rule__Composition__Group__4
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
    // InternalUmlTextual.g:4382:1: rule__Composition__Group__3__Impl : ( 'from' ) ;
    public final void rule__Composition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4386:1: ( ( 'from' ) )
            // InternalUmlTextual.g:4387:1: ( 'from' )
            {
            // InternalUmlTextual.g:4387:1: ( 'from' )
            // InternalUmlTextual.g:4388:2: 'from'
            {
             before(grammarAccess.getCompositionAccess().getFromKeyword_3()); 
            match(input,52,FOLLOW_2); 
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
    // InternalUmlTextual.g:4397:1: rule__Composition__Group__4 : rule__Composition__Group__4__Impl rule__Composition__Group__5 ;
    public final void rule__Composition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4401:1: ( rule__Composition__Group__4__Impl rule__Composition__Group__5 )
            // InternalUmlTextual.g:4402:2: rule__Composition__Group__4__Impl rule__Composition__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:4409:1: rule__Composition__Group__4__Impl : ( ( rule__Composition__Class1Assignment_4 ) ) ;
    public final void rule__Composition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4413:1: ( ( ( rule__Composition__Class1Assignment_4 ) ) )
            // InternalUmlTextual.g:4414:1: ( ( rule__Composition__Class1Assignment_4 ) )
            {
            // InternalUmlTextual.g:4414:1: ( ( rule__Composition__Class1Assignment_4 ) )
            // InternalUmlTextual.g:4415:2: ( rule__Composition__Class1Assignment_4 )
            {
             before(grammarAccess.getCompositionAccess().getClass1Assignment_4()); 
            // InternalUmlTextual.g:4416:2: ( rule__Composition__Class1Assignment_4 )
            // InternalUmlTextual.g:4416:3: rule__Composition__Class1Assignment_4
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
    // InternalUmlTextual.g:4424:1: rule__Composition__Group__5 : rule__Composition__Group__5__Impl rule__Composition__Group__6 ;
    public final void rule__Composition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4428:1: ( rule__Composition__Group__5__Impl rule__Composition__Group__6 )
            // InternalUmlTextual.g:4429:2: rule__Composition__Group__5__Impl rule__Composition__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:4436:1: rule__Composition__Group__5__Impl : ( '[' ) ;
    public final void rule__Composition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4440:1: ( ( '[' ) )
            // InternalUmlTextual.g:4441:1: ( '[' )
            {
            // InternalUmlTextual.g:4441:1: ( '[' )
            // InternalUmlTextual.g:4442:2: '['
            {
             before(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_5()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:4451:1: rule__Composition__Group__6 : rule__Composition__Group__6__Impl rule__Composition__Group__7 ;
    public final void rule__Composition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4455:1: ( rule__Composition__Group__6__Impl rule__Composition__Group__7 )
            // InternalUmlTextual.g:4456:2: rule__Composition__Group__6__Impl rule__Composition__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalUmlTextual.g:4463:1: rule__Composition__Group__6__Impl : ( ( rule__Composition__Multiplicity1Assignment_6 ) ) ;
    public final void rule__Composition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4467:1: ( ( ( rule__Composition__Multiplicity1Assignment_6 ) ) )
            // InternalUmlTextual.g:4468:1: ( ( rule__Composition__Multiplicity1Assignment_6 ) )
            {
            // InternalUmlTextual.g:4468:1: ( ( rule__Composition__Multiplicity1Assignment_6 ) )
            // InternalUmlTextual.g:4469:2: ( rule__Composition__Multiplicity1Assignment_6 )
            {
             before(grammarAccess.getCompositionAccess().getMultiplicity1Assignment_6()); 
            // InternalUmlTextual.g:4470:2: ( rule__Composition__Multiplicity1Assignment_6 )
            // InternalUmlTextual.g:4470:3: rule__Composition__Multiplicity1Assignment_6
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
    // InternalUmlTextual.g:4478:1: rule__Composition__Group__7 : rule__Composition__Group__7__Impl rule__Composition__Group__8 ;
    public final void rule__Composition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4482:1: ( rule__Composition__Group__7__Impl rule__Composition__Group__8 )
            // InternalUmlTextual.g:4483:2: rule__Composition__Group__7__Impl rule__Composition__Group__8
            {
            pushFollow(FOLLOW_42);
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
    // InternalUmlTextual.g:4490:1: rule__Composition__Group__7__Impl : ( ']' ) ;
    public final void rule__Composition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4494:1: ( ( ']' ) )
            // InternalUmlTextual.g:4495:1: ( ']' )
            {
            // InternalUmlTextual.g:4495:1: ( ']' )
            // InternalUmlTextual.g:4496:2: ']'
            {
             before(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_7()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUmlTextual.g:4505:1: rule__Composition__Group__8 : rule__Composition__Group__8__Impl rule__Composition__Group__9 ;
    public final void rule__Composition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4509:1: ( rule__Composition__Group__8__Impl rule__Composition__Group__9 )
            // InternalUmlTextual.g:4510:2: rule__Composition__Group__8__Impl rule__Composition__Group__9
            {
            pushFollow(FOLLOW_41);
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
    // InternalUmlTextual.g:4517:1: rule__Composition__Group__8__Impl : ( 'to' ) ;
    public final void rule__Composition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4521:1: ( ( 'to' ) )
            // InternalUmlTextual.g:4522:1: ( 'to' )
            {
            // InternalUmlTextual.g:4522:1: ( 'to' )
            // InternalUmlTextual.g:4523:2: 'to'
            {
             before(grammarAccess.getCompositionAccess().getToKeyword_8()); 
            match(input,53,FOLLOW_2); 
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
    // InternalUmlTextual.g:4532:1: rule__Composition__Group__9 : rule__Composition__Group__9__Impl rule__Composition__Group__10 ;
    public final void rule__Composition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4536:1: ( rule__Composition__Group__9__Impl rule__Composition__Group__10 )
            // InternalUmlTextual.g:4537:2: rule__Composition__Group__9__Impl rule__Composition__Group__10
            {
            pushFollow(FOLLOW_41);
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
    // InternalUmlTextual.g:4544:1: rule__Composition__Group__9__Impl : ( ( rule__Composition__NavigationAssignment_9 )? ) ;
    public final void rule__Composition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4548:1: ( ( ( rule__Composition__NavigationAssignment_9 )? ) )
            // InternalUmlTextual.g:4549:1: ( ( rule__Composition__NavigationAssignment_9 )? )
            {
            // InternalUmlTextual.g:4549:1: ( ( rule__Composition__NavigationAssignment_9 )? )
            // InternalUmlTextual.g:4550:2: ( rule__Composition__NavigationAssignment_9 )?
            {
             before(grammarAccess.getCompositionAccess().getNavigationAssignment_9()); 
            // InternalUmlTextual.g:4551:2: ( rule__Composition__NavigationAssignment_9 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==14) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalUmlTextual.g:4551:3: rule__Composition__NavigationAssignment_9
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
    // InternalUmlTextual.g:4559:1: rule__Composition__Group__10 : rule__Composition__Group__10__Impl rule__Composition__Group__11 ;
    public final void rule__Composition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4563:1: ( rule__Composition__Group__10__Impl rule__Composition__Group__11 )
            // InternalUmlTextual.g:4564:2: rule__Composition__Group__10__Impl rule__Composition__Group__11
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:4571:1: rule__Composition__Group__10__Impl : ( ( rule__Composition__Class2Assignment_10 ) ) ;
    public final void rule__Composition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4575:1: ( ( ( rule__Composition__Class2Assignment_10 ) ) )
            // InternalUmlTextual.g:4576:1: ( ( rule__Composition__Class2Assignment_10 ) )
            {
            // InternalUmlTextual.g:4576:1: ( ( rule__Composition__Class2Assignment_10 ) )
            // InternalUmlTextual.g:4577:2: ( rule__Composition__Class2Assignment_10 )
            {
             before(grammarAccess.getCompositionAccess().getClass2Assignment_10()); 
            // InternalUmlTextual.g:4578:2: ( rule__Composition__Class2Assignment_10 )
            // InternalUmlTextual.g:4578:3: rule__Composition__Class2Assignment_10
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
    // InternalUmlTextual.g:4586:1: rule__Composition__Group__11 : rule__Composition__Group__11__Impl rule__Composition__Group__12 ;
    public final void rule__Composition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4590:1: ( rule__Composition__Group__11__Impl rule__Composition__Group__12 )
            // InternalUmlTextual.g:4591:2: rule__Composition__Group__11__Impl rule__Composition__Group__12
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:4598:1: rule__Composition__Group__11__Impl : ( '[' ) ;
    public final void rule__Composition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4602:1: ( ( '[' ) )
            // InternalUmlTextual.g:4603:1: ( '[' )
            {
            // InternalUmlTextual.g:4603:1: ( '[' )
            // InternalUmlTextual.g:4604:2: '['
            {
             before(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_11()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:4613:1: rule__Composition__Group__12 : rule__Composition__Group__12__Impl rule__Composition__Group__13 ;
    public final void rule__Composition__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4617:1: ( rule__Composition__Group__12__Impl rule__Composition__Group__13 )
            // InternalUmlTextual.g:4618:2: rule__Composition__Group__12__Impl rule__Composition__Group__13
            {
            pushFollow(FOLLOW_32);
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
    // InternalUmlTextual.g:4625:1: rule__Composition__Group__12__Impl : ( ( rule__Composition__Multiplicity2Assignment_12 ) ) ;
    public final void rule__Composition__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4629:1: ( ( ( rule__Composition__Multiplicity2Assignment_12 ) ) )
            // InternalUmlTextual.g:4630:1: ( ( rule__Composition__Multiplicity2Assignment_12 ) )
            {
            // InternalUmlTextual.g:4630:1: ( ( rule__Composition__Multiplicity2Assignment_12 ) )
            // InternalUmlTextual.g:4631:2: ( rule__Composition__Multiplicity2Assignment_12 )
            {
             before(grammarAccess.getCompositionAccess().getMultiplicity2Assignment_12()); 
            // InternalUmlTextual.g:4632:2: ( rule__Composition__Multiplicity2Assignment_12 )
            // InternalUmlTextual.g:4632:3: rule__Composition__Multiplicity2Assignment_12
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
    // InternalUmlTextual.g:4640:1: rule__Composition__Group__13 : rule__Composition__Group__13__Impl rule__Composition__Group__14 ;
    public final void rule__Composition__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4644:1: ( rule__Composition__Group__13__Impl rule__Composition__Group__14 )
            // InternalUmlTextual.g:4645:2: rule__Composition__Group__13__Impl rule__Composition__Group__14
            {
            pushFollow(FOLLOW_45);
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
    // InternalUmlTextual.g:4652:1: rule__Composition__Group__13__Impl : ( ']' ) ;
    public final void rule__Composition__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4656:1: ( ( ']' ) )
            // InternalUmlTextual.g:4657:1: ( ']' )
            {
            // InternalUmlTextual.g:4657:1: ( ']' )
            // InternalUmlTextual.g:4658:2: ']'
            {
             before(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_13()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUmlTextual.g:4667:1: rule__Composition__Group__14 : rule__Composition__Group__14__Impl ;
    public final void rule__Composition__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4671:1: ( rule__Composition__Group__14__Impl )
            // InternalUmlTextual.g:4672:2: rule__Composition__Group__14__Impl
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
    // InternalUmlTextual.g:4678:1: rule__Composition__Group__14__Impl : ( '}' ) ;
    public final void rule__Composition__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4682:1: ( ( '}' ) )
            // InternalUmlTextual.g:4683:1: ( '}' )
            {
            // InternalUmlTextual.g:4683:1: ( '}' )
            // InternalUmlTextual.g:4684:2: '}'
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
    // InternalUmlTextual.g:4694:1: rule__UseCaseDiagram__Group__0 : rule__UseCaseDiagram__Group__0__Impl rule__UseCaseDiagram__Group__1 ;
    public final void rule__UseCaseDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4698:1: ( rule__UseCaseDiagram__Group__0__Impl rule__UseCaseDiagram__Group__1 )
            // InternalUmlTextual.g:4699:2: rule__UseCaseDiagram__Group__0__Impl rule__UseCaseDiagram__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalUmlTextual.g:4706:1: rule__UseCaseDiagram__Group__0__Impl : ( 'usecase' ) ;
    public final void rule__UseCaseDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4710:1: ( ( 'usecase' ) )
            // InternalUmlTextual.g:4711:1: ( 'usecase' )
            {
            // InternalUmlTextual.g:4711:1: ( 'usecase' )
            // InternalUmlTextual.g:4712:2: 'usecase'
            {
             before(grammarAccess.getUseCaseDiagramAccess().getUsecaseKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalUmlTextual.g:4721:1: rule__UseCaseDiagram__Group__1 : rule__UseCaseDiagram__Group__1__Impl rule__UseCaseDiagram__Group__2 ;
    public final void rule__UseCaseDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4725:1: ( rule__UseCaseDiagram__Group__1__Impl rule__UseCaseDiagram__Group__2 )
            // InternalUmlTextual.g:4726:2: rule__UseCaseDiagram__Group__1__Impl rule__UseCaseDiagram__Group__2
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
    // InternalUmlTextual.g:4733:1: rule__UseCaseDiagram__Group__1__Impl : ( 'diagram' ) ;
    public final void rule__UseCaseDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4737:1: ( ( 'diagram' ) )
            // InternalUmlTextual.g:4738:1: ( 'diagram' )
            {
            // InternalUmlTextual.g:4738:1: ( 'diagram' )
            // InternalUmlTextual.g:4739:2: 'diagram'
            {
             before(grammarAccess.getUseCaseDiagramAccess().getDiagramKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalUmlTextual.g:4748:1: rule__UseCaseDiagram__Group__2 : rule__UseCaseDiagram__Group__2__Impl rule__UseCaseDiagram__Group__3 ;
    public final void rule__UseCaseDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4752:1: ( rule__UseCaseDiagram__Group__2__Impl rule__UseCaseDiagram__Group__3 )
            // InternalUmlTextual.g:4753:2: rule__UseCaseDiagram__Group__2__Impl rule__UseCaseDiagram__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:4760:1: rule__UseCaseDiagram__Group__2__Impl : ( ( rule__UseCaseDiagram__NameAssignment_2 ) ) ;
    public final void rule__UseCaseDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4764:1: ( ( ( rule__UseCaseDiagram__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:4765:1: ( ( rule__UseCaseDiagram__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:4765:1: ( ( rule__UseCaseDiagram__NameAssignment_2 ) )
            // InternalUmlTextual.g:4766:2: ( rule__UseCaseDiagram__NameAssignment_2 )
            {
             before(grammarAccess.getUseCaseDiagramAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:4767:2: ( rule__UseCaseDiagram__NameAssignment_2 )
            // InternalUmlTextual.g:4767:3: rule__UseCaseDiagram__NameAssignment_2
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
    // InternalUmlTextual.g:4775:1: rule__UseCaseDiagram__Group__3 : rule__UseCaseDiagram__Group__3__Impl rule__UseCaseDiagram__Group__4 ;
    public final void rule__UseCaseDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4779:1: ( rule__UseCaseDiagram__Group__3__Impl rule__UseCaseDiagram__Group__4 )
            // InternalUmlTextual.g:4780:2: rule__UseCaseDiagram__Group__3__Impl rule__UseCaseDiagram__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalUmlTextual.g:4787:1: rule__UseCaseDiagram__Group__3__Impl : ( '{' ) ;
    public final void rule__UseCaseDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4791:1: ( ( '{' ) )
            // InternalUmlTextual.g:4792:1: ( '{' )
            {
            // InternalUmlTextual.g:4792:1: ( '{' )
            // InternalUmlTextual.g:4793:2: '{'
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
    // InternalUmlTextual.g:4802:1: rule__UseCaseDiagram__Group__4 : rule__UseCaseDiagram__Group__4__Impl rule__UseCaseDiagram__Group__5 ;
    public final void rule__UseCaseDiagram__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4806:1: ( rule__UseCaseDiagram__Group__4__Impl rule__UseCaseDiagram__Group__5 )
            // InternalUmlTextual.g:4807:2: rule__UseCaseDiagram__Group__4__Impl rule__UseCaseDiagram__Group__5
            {
            pushFollow(FOLLOW_47);
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
    // InternalUmlTextual.g:4814:1: rule__UseCaseDiagram__Group__4__Impl : ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* ) ;
    public final void rule__UseCaseDiagram__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4818:1: ( ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* ) )
            // InternalUmlTextual.g:4819:1: ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* )
            {
            // InternalUmlTextual.g:4819:1: ( ( rule__UseCaseDiagram__ElementsAssignment_4 )* )
            // InternalUmlTextual.g:4820:2: ( rule__UseCaseDiagram__ElementsAssignment_4 )*
            {
             before(grammarAccess.getUseCaseDiagramAccess().getElementsAssignment_4()); 
            // InternalUmlTextual.g:4821:2: ( rule__UseCaseDiagram__ElementsAssignment_4 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=11 && LA43_0<=12)||LA43_0==15||(LA43_0>=17 && LA43_0<=19)||LA43_0==58||LA43_0==60||LA43_0==73) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUmlTextual.g:4821:3: rule__UseCaseDiagram__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__UseCaseDiagram__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalUmlTextual.g:4829:1: rule__UseCaseDiagram__Group__5 : rule__UseCaseDiagram__Group__5__Impl ;
    public final void rule__UseCaseDiagram__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4833:1: ( rule__UseCaseDiagram__Group__5__Impl )
            // InternalUmlTextual.g:4834:2: rule__UseCaseDiagram__Group__5__Impl
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
    // InternalUmlTextual.g:4840:1: rule__UseCaseDiagram__Group__5__Impl : ( '}' ) ;
    public final void rule__UseCaseDiagram__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4844:1: ( ( '}' ) )
            // InternalUmlTextual.g:4845:1: ( '}' )
            {
            // InternalUmlTextual.g:4845:1: ( '}' )
            // InternalUmlTextual.g:4846:2: '}'
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
    // InternalUmlTextual.g:4856:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4860:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // InternalUmlTextual.g:4861:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalUmlTextual.g:4868:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__VisibilityAssignment_0 )? ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4872:1: ( ( ( rule__Actor__VisibilityAssignment_0 )? ) )
            // InternalUmlTextual.g:4873:1: ( ( rule__Actor__VisibilityAssignment_0 )? )
            {
            // InternalUmlTextual.g:4873:1: ( ( rule__Actor__VisibilityAssignment_0 )? )
            // InternalUmlTextual.g:4874:2: ( rule__Actor__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getActorAccess().getVisibilityAssignment_0()); 
            // InternalUmlTextual.g:4875:2: ( rule__Actor__VisibilityAssignment_0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==15||(LA44_0>=17 && LA44_0<=19)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUmlTextual.g:4875:3: rule__Actor__VisibilityAssignment_0
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
    // InternalUmlTextual.g:4883:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4887:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // InternalUmlTextual.g:4888:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_49);
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
    // InternalUmlTextual.g:4895:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__AbstractAssignment_1 )? ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4899:1: ( ( ( rule__Actor__AbstractAssignment_1 )? ) )
            // InternalUmlTextual.g:4900:1: ( ( rule__Actor__AbstractAssignment_1 )? )
            {
            // InternalUmlTextual.g:4900:1: ( ( rule__Actor__AbstractAssignment_1 )? )
            // InternalUmlTextual.g:4901:2: ( rule__Actor__AbstractAssignment_1 )?
            {
             before(grammarAccess.getActorAccess().getAbstractAssignment_1()); 
            // InternalUmlTextual.g:4902:2: ( rule__Actor__AbstractAssignment_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==11) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUmlTextual.g:4902:3: rule__Actor__AbstractAssignment_1
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
    // InternalUmlTextual.g:4910:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4914:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // InternalUmlTextual.g:4915:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalUmlTextual.g:4922:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__ActiveAssignment_2 )? ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4926:1: ( ( ( rule__Actor__ActiveAssignment_2 )? ) )
            // InternalUmlTextual.g:4927:1: ( ( rule__Actor__ActiveAssignment_2 )? )
            {
            // InternalUmlTextual.g:4927:1: ( ( rule__Actor__ActiveAssignment_2 )? )
            // InternalUmlTextual.g:4928:2: ( rule__Actor__ActiveAssignment_2 )?
            {
             before(grammarAccess.getActorAccess().getActiveAssignment_2()); 
            // InternalUmlTextual.g:4929:2: ( rule__Actor__ActiveAssignment_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==12) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUmlTextual.g:4929:3: rule__Actor__ActiveAssignment_2
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
    // InternalUmlTextual.g:4937:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl rule__Actor__Group__4 ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4941:1: ( rule__Actor__Group__3__Impl rule__Actor__Group__4 )
            // InternalUmlTextual.g:4942:2: rule__Actor__Group__3__Impl rule__Actor__Group__4
            {
            pushFollow(FOLLOW_49);
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
    // InternalUmlTextual.g:4949:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__BusinessAssignment_3 )? ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4953:1: ( ( ( rule__Actor__BusinessAssignment_3 )? ) )
            // InternalUmlTextual.g:4954:1: ( ( rule__Actor__BusinessAssignment_3 )? )
            {
            // InternalUmlTextual.g:4954:1: ( ( rule__Actor__BusinessAssignment_3 )? )
            // InternalUmlTextual.g:4955:2: ( rule__Actor__BusinessAssignment_3 )?
            {
             before(grammarAccess.getActorAccess().getBusinessAssignment_3()); 
            // InternalUmlTextual.g:4956:2: ( rule__Actor__BusinessAssignment_3 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==73) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUmlTextual.g:4956:3: rule__Actor__BusinessAssignment_3
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
    // InternalUmlTextual.g:4964:1: rule__Actor__Group__4 : rule__Actor__Group__4__Impl rule__Actor__Group__5 ;
    public final void rule__Actor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4968:1: ( rule__Actor__Group__4__Impl rule__Actor__Group__5 )
            // InternalUmlTextual.g:4969:2: rule__Actor__Group__4__Impl rule__Actor__Group__5
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
    // InternalUmlTextual.g:4976:1: rule__Actor__Group__4__Impl : ( 'actor' ) ;
    public final void rule__Actor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4980:1: ( ( 'actor' ) )
            // InternalUmlTextual.g:4981:1: ( 'actor' )
            {
            // InternalUmlTextual.g:4981:1: ( 'actor' )
            // InternalUmlTextual.g:4982:2: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_4()); 
            match(input,60,FOLLOW_2); 
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
    // InternalUmlTextual.g:4991:1: rule__Actor__Group__5 : rule__Actor__Group__5__Impl rule__Actor__Group__6 ;
    public final void rule__Actor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:4995:1: ( rule__Actor__Group__5__Impl rule__Actor__Group__6 )
            // InternalUmlTextual.g:4996:2: rule__Actor__Group__5__Impl rule__Actor__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalUmlTextual.g:5003:1: rule__Actor__Group__5__Impl : ( ( rule__Actor__NameAssignment_5 ) ) ;
    public final void rule__Actor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5007:1: ( ( ( rule__Actor__NameAssignment_5 ) ) )
            // InternalUmlTextual.g:5008:1: ( ( rule__Actor__NameAssignment_5 ) )
            {
            // InternalUmlTextual.g:5008:1: ( ( rule__Actor__NameAssignment_5 ) )
            // InternalUmlTextual.g:5009:2: ( rule__Actor__NameAssignment_5 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_5()); 
            // InternalUmlTextual.g:5010:2: ( rule__Actor__NameAssignment_5 )
            // InternalUmlTextual.g:5010:3: rule__Actor__NameAssignment_5
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
    // InternalUmlTextual.g:5018:1: rule__Actor__Group__6 : rule__Actor__Group__6__Impl rule__Actor__Group__7 ;
    public final void rule__Actor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5022:1: ( rule__Actor__Group__6__Impl rule__Actor__Group__7 )
            // InternalUmlTextual.g:5023:2: rule__Actor__Group__6__Impl rule__Actor__Group__7
            {
            pushFollow(FOLLOW_21);
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
    // InternalUmlTextual.g:5030:1: rule__Actor__Group__6__Impl : ( ( rule__Actor__Group_6__0 )? ) ;
    public final void rule__Actor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5034:1: ( ( ( rule__Actor__Group_6__0 )? ) )
            // InternalUmlTextual.g:5035:1: ( ( rule__Actor__Group_6__0 )? )
            {
            // InternalUmlTextual.g:5035:1: ( ( rule__Actor__Group_6__0 )? )
            // InternalUmlTextual.g:5036:2: ( rule__Actor__Group_6__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_6()); 
            // InternalUmlTextual.g:5037:2: ( rule__Actor__Group_6__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==32) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalUmlTextual.g:5037:3: rule__Actor__Group_6__0
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
    // InternalUmlTextual.g:5045:1: rule__Actor__Group__7 : rule__Actor__Group__7__Impl rule__Actor__Group__8 ;
    public final void rule__Actor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5049:1: ( rule__Actor__Group__7__Impl rule__Actor__Group__8 )
            // InternalUmlTextual.g:5050:2: rule__Actor__Group__7__Impl rule__Actor__Group__8
            {
            pushFollow(FOLLOW_50);
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
    // InternalUmlTextual.g:5057:1: rule__Actor__Group__7__Impl : ( '{' ) ;
    public final void rule__Actor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5061:1: ( ( '{' ) )
            // InternalUmlTextual.g:5062:1: ( '{' )
            {
            // InternalUmlTextual.g:5062:1: ( '{' )
            // InternalUmlTextual.g:5063:2: '{'
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
    // InternalUmlTextual.g:5072:1: rule__Actor__Group__8 : rule__Actor__Group__8__Impl rule__Actor__Group__9 ;
    public final void rule__Actor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5076:1: ( rule__Actor__Group__8__Impl rule__Actor__Group__9 )
            // InternalUmlTextual.g:5077:2: rule__Actor__Group__8__Impl rule__Actor__Group__9
            {
            pushFollow(FOLLOW_50);
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
    // InternalUmlTextual.g:5084:1: rule__Actor__Group__8__Impl : ( ( rule__Actor__Group_8__0 )* ) ;
    public final void rule__Actor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5088:1: ( ( ( rule__Actor__Group_8__0 )* ) )
            // InternalUmlTextual.g:5089:1: ( ( rule__Actor__Group_8__0 )* )
            {
            // InternalUmlTextual.g:5089:1: ( ( rule__Actor__Group_8__0 )* )
            // InternalUmlTextual.g:5090:2: ( rule__Actor__Group_8__0 )*
            {
             before(grammarAccess.getActorAccess().getGroup_8()); 
            // InternalUmlTextual.g:5091:2: ( rule__Actor__Group_8__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==61) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalUmlTextual.g:5091:3: rule__Actor__Group_8__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__Actor__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalUmlTextual.g:5099:1: rule__Actor__Group__9 : rule__Actor__Group__9__Impl ;
    public final void rule__Actor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5103:1: ( rule__Actor__Group__9__Impl )
            // InternalUmlTextual.g:5104:2: rule__Actor__Group__9__Impl
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
    // InternalUmlTextual.g:5110:1: rule__Actor__Group__9__Impl : ( '}' ) ;
    public final void rule__Actor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5114:1: ( ( '}' ) )
            // InternalUmlTextual.g:5115:1: ( '}' )
            {
            // InternalUmlTextual.g:5115:1: ( '}' )
            // InternalUmlTextual.g:5116:2: '}'
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
    // InternalUmlTextual.g:5126:1: rule__Actor__Group_6__0 : rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1 ;
    public final void rule__Actor__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5130:1: ( rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1 )
            // InternalUmlTextual.g:5131:2: rule__Actor__Group_6__0__Impl rule__Actor__Group_6__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:5138:1: rule__Actor__Group_6__0__Impl : ( 'extends' ) ;
    public final void rule__Actor__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5142:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:5143:1: ( 'extends' )
            {
            // InternalUmlTextual.g:5143:1: ( 'extends' )
            // InternalUmlTextual.g:5144:2: 'extends'
            {
             before(grammarAccess.getActorAccess().getExtendsKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUmlTextual.g:5153:1: rule__Actor__Group_6__1 : rule__Actor__Group_6__1__Impl ;
    public final void rule__Actor__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5157:1: ( rule__Actor__Group_6__1__Impl )
            // InternalUmlTextual.g:5158:2: rule__Actor__Group_6__1__Impl
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
    // InternalUmlTextual.g:5164:1: rule__Actor__Group_6__1__Impl : ( ( rule__Actor__ParentActorAssignment_6_1 ) ) ;
    public final void rule__Actor__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5168:1: ( ( ( rule__Actor__ParentActorAssignment_6_1 ) ) )
            // InternalUmlTextual.g:5169:1: ( ( rule__Actor__ParentActorAssignment_6_1 ) )
            {
            // InternalUmlTextual.g:5169:1: ( ( rule__Actor__ParentActorAssignment_6_1 ) )
            // InternalUmlTextual.g:5170:2: ( rule__Actor__ParentActorAssignment_6_1 )
            {
             before(grammarAccess.getActorAccess().getParentActorAssignment_6_1()); 
            // InternalUmlTextual.g:5171:2: ( rule__Actor__ParentActorAssignment_6_1 )
            // InternalUmlTextual.g:5171:3: rule__Actor__ParentActorAssignment_6_1
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
    // InternalUmlTextual.g:5180:1: rule__Actor__Group_8__0 : rule__Actor__Group_8__0__Impl rule__Actor__Group_8__1 ;
    public final void rule__Actor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5184:1: ( rule__Actor__Group_8__0__Impl rule__Actor__Group_8__1 )
            // InternalUmlTextual.g:5185:2: rule__Actor__Group_8__0__Impl rule__Actor__Group_8__1
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
    // InternalUmlTextual.g:5192:1: rule__Actor__Group_8__0__Impl : ( 'uses' ) ;
    public final void rule__Actor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5196:1: ( ( 'uses' ) )
            // InternalUmlTextual.g:5197:1: ( 'uses' )
            {
            // InternalUmlTextual.g:5197:1: ( 'uses' )
            // InternalUmlTextual.g:5198:2: 'uses'
            {
             before(grammarAccess.getActorAccess().getUsesKeyword_8_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalUmlTextual.g:5207:1: rule__Actor__Group_8__1 : rule__Actor__Group_8__1__Impl rule__Actor__Group_8__2 ;
    public final void rule__Actor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5211:1: ( rule__Actor__Group_8__1__Impl rule__Actor__Group_8__2 )
            // InternalUmlTextual.g:5212:2: rule__Actor__Group_8__1__Impl rule__Actor__Group_8__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalUmlTextual.g:5219:1: rule__Actor__Group_8__1__Impl : ( ( rule__Actor__UseCasesAssignment_8_1 ) ) ;
    public final void rule__Actor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5223:1: ( ( ( rule__Actor__UseCasesAssignment_8_1 ) ) )
            // InternalUmlTextual.g:5224:1: ( ( rule__Actor__UseCasesAssignment_8_1 ) )
            {
            // InternalUmlTextual.g:5224:1: ( ( rule__Actor__UseCasesAssignment_8_1 ) )
            // InternalUmlTextual.g:5225:2: ( rule__Actor__UseCasesAssignment_8_1 )
            {
             before(grammarAccess.getActorAccess().getUseCasesAssignment_8_1()); 
            // InternalUmlTextual.g:5226:2: ( rule__Actor__UseCasesAssignment_8_1 )
            // InternalUmlTextual.g:5226:3: rule__Actor__UseCasesAssignment_8_1
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
    // InternalUmlTextual.g:5234:1: rule__Actor__Group_8__2 : rule__Actor__Group_8__2__Impl ;
    public final void rule__Actor__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5238:1: ( rule__Actor__Group_8__2__Impl )
            // InternalUmlTextual.g:5239:2: rule__Actor__Group_8__2__Impl
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
    // InternalUmlTextual.g:5245:1: rule__Actor__Group_8__2__Impl : ( ( rule__Actor__Group_8_2__0 )* ) ;
    public final void rule__Actor__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5249:1: ( ( ( rule__Actor__Group_8_2__0 )* ) )
            // InternalUmlTextual.g:5250:1: ( ( rule__Actor__Group_8_2__0 )* )
            {
            // InternalUmlTextual.g:5250:1: ( ( rule__Actor__Group_8_2__0 )* )
            // InternalUmlTextual.g:5251:2: ( rule__Actor__Group_8_2__0 )*
            {
             before(grammarAccess.getActorAccess().getGroup_8_2()); 
            // InternalUmlTextual.g:5252:2: ( rule__Actor__Group_8_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==34) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUmlTextual.g:5252:3: rule__Actor__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Actor__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalUmlTextual.g:5261:1: rule__Actor__Group_8_2__0 : rule__Actor__Group_8_2__0__Impl rule__Actor__Group_8_2__1 ;
    public final void rule__Actor__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5265:1: ( rule__Actor__Group_8_2__0__Impl rule__Actor__Group_8_2__1 )
            // InternalUmlTextual.g:5266:2: rule__Actor__Group_8_2__0__Impl rule__Actor__Group_8_2__1
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
    // InternalUmlTextual.g:5273:1: rule__Actor__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__Actor__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5277:1: ( ( ',' ) )
            // InternalUmlTextual.g:5278:1: ( ',' )
            {
            // InternalUmlTextual.g:5278:1: ( ',' )
            // InternalUmlTextual.g:5279:2: ','
            {
             before(grammarAccess.getActorAccess().getCommaKeyword_8_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUmlTextual.g:5288:1: rule__Actor__Group_8_2__1 : rule__Actor__Group_8_2__1__Impl ;
    public final void rule__Actor__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5292:1: ( rule__Actor__Group_8_2__1__Impl )
            // InternalUmlTextual.g:5293:2: rule__Actor__Group_8_2__1__Impl
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
    // InternalUmlTextual.g:5299:1: rule__Actor__Group_8_2__1__Impl : ( ( rule__Actor__UseCasesAssignment_8_2_1 ) ) ;
    public final void rule__Actor__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5303:1: ( ( ( rule__Actor__UseCasesAssignment_8_2_1 ) ) )
            // InternalUmlTextual.g:5304:1: ( ( rule__Actor__UseCasesAssignment_8_2_1 ) )
            {
            // InternalUmlTextual.g:5304:1: ( ( rule__Actor__UseCasesAssignment_8_2_1 ) )
            // InternalUmlTextual.g:5305:2: ( rule__Actor__UseCasesAssignment_8_2_1 )
            {
             before(grammarAccess.getActorAccess().getUseCasesAssignment_8_2_1()); 
            // InternalUmlTextual.g:5306:2: ( rule__Actor__UseCasesAssignment_8_2_1 )
            // InternalUmlTextual.g:5306:3: rule__Actor__UseCasesAssignment_8_2_1
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
    // InternalUmlTextual.g:5315:1: rule__UseCase__Group__0 : rule__UseCase__Group__0__Impl rule__UseCase__Group__1 ;
    public final void rule__UseCase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5319:1: ( rule__UseCase__Group__0__Impl rule__UseCase__Group__1 )
            // InternalUmlTextual.g:5320:2: rule__UseCase__Group__0__Impl rule__UseCase__Group__1
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
    // InternalUmlTextual.g:5327:1: rule__UseCase__Group__0__Impl : ( 'usecase' ) ;
    public final void rule__UseCase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5331:1: ( ( 'usecase' ) )
            // InternalUmlTextual.g:5332:1: ( 'usecase' )
            {
            // InternalUmlTextual.g:5332:1: ( 'usecase' )
            // InternalUmlTextual.g:5333:2: 'usecase'
            {
             before(grammarAccess.getUseCaseAccess().getUsecaseKeyword_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalUmlTextual.g:5342:1: rule__UseCase__Group__1 : rule__UseCase__Group__1__Impl rule__UseCase__Group__2 ;
    public final void rule__UseCase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5346:1: ( rule__UseCase__Group__1__Impl rule__UseCase__Group__2 )
            // InternalUmlTextual.g:5347:2: rule__UseCase__Group__1__Impl rule__UseCase__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalUmlTextual.g:5354:1: rule__UseCase__Group__1__Impl : ( ( rule__UseCase__NameAssignment_1 ) ) ;
    public final void rule__UseCase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5358:1: ( ( ( rule__UseCase__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:5359:1: ( ( rule__UseCase__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:5359:1: ( ( rule__UseCase__NameAssignment_1 ) )
            // InternalUmlTextual.g:5360:2: ( rule__UseCase__NameAssignment_1 )
            {
             before(grammarAccess.getUseCaseAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:5361:2: ( rule__UseCase__NameAssignment_1 )
            // InternalUmlTextual.g:5361:3: rule__UseCase__NameAssignment_1
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
    // InternalUmlTextual.g:5369:1: rule__UseCase__Group__2 : rule__UseCase__Group__2__Impl rule__UseCase__Group__3 ;
    public final void rule__UseCase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5373:1: ( rule__UseCase__Group__2__Impl rule__UseCase__Group__3 )
            // InternalUmlTextual.g:5374:2: rule__UseCase__Group__2__Impl rule__UseCase__Group__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalUmlTextual.g:5381:1: rule__UseCase__Group__2__Impl : ( ( rule__UseCase__Group_2__0 )? ) ;
    public final void rule__UseCase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5385:1: ( ( ( rule__UseCase__Group_2__0 )? ) )
            // InternalUmlTextual.g:5386:1: ( ( rule__UseCase__Group_2__0 )? )
            {
            // InternalUmlTextual.g:5386:1: ( ( rule__UseCase__Group_2__0 )? )
            // InternalUmlTextual.g:5387:2: ( rule__UseCase__Group_2__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_2()); 
            // InternalUmlTextual.g:5388:2: ( rule__UseCase__Group_2__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==62) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalUmlTextual.g:5388:3: rule__UseCase__Group_2__0
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
    // InternalUmlTextual.g:5396:1: rule__UseCase__Group__3 : rule__UseCase__Group__3__Impl rule__UseCase__Group__4 ;
    public final void rule__UseCase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5400:1: ( rule__UseCase__Group__3__Impl rule__UseCase__Group__4 )
            // InternalUmlTextual.g:5401:2: rule__UseCase__Group__3__Impl rule__UseCase__Group__4
            {
            pushFollow(FOLLOW_52);
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
    // InternalUmlTextual.g:5408:1: rule__UseCase__Group__3__Impl : ( ( rule__UseCase__Group_3__0 )? ) ;
    public final void rule__UseCase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5412:1: ( ( ( rule__UseCase__Group_3__0 )? ) )
            // InternalUmlTextual.g:5413:1: ( ( rule__UseCase__Group_3__0 )? )
            {
            // InternalUmlTextual.g:5413:1: ( ( rule__UseCase__Group_3__0 )? )
            // InternalUmlTextual.g:5414:2: ( rule__UseCase__Group_3__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_3()); 
            // InternalUmlTextual.g:5415:2: ( rule__UseCase__Group_3__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==32) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUmlTextual.g:5415:3: rule__UseCase__Group_3__0
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
    // InternalUmlTextual.g:5423:1: rule__UseCase__Group__4 : rule__UseCase__Group__4__Impl rule__UseCase__Group__5 ;
    public final void rule__UseCase__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5427:1: ( rule__UseCase__Group__4__Impl rule__UseCase__Group__5 )
            // InternalUmlTextual.g:5428:2: rule__UseCase__Group__4__Impl rule__UseCase__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalUmlTextual.g:5435:1: rule__UseCase__Group__4__Impl : ( '=' ) ;
    public final void rule__UseCase__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5439:1: ( ( '=' ) )
            // InternalUmlTextual.g:5440:1: ( '=' )
            {
            // InternalUmlTextual.g:5440:1: ( '=' )
            // InternalUmlTextual.g:5441:2: '='
            {
             before(grammarAccess.getUseCaseAccess().getEqualsSignKeyword_4()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUmlTextual.g:5450:1: rule__UseCase__Group__5 : rule__UseCase__Group__5__Impl rule__UseCase__Group__6 ;
    public final void rule__UseCase__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5454:1: ( rule__UseCase__Group__5__Impl rule__UseCase__Group__6 )
            // InternalUmlTextual.g:5455:2: rule__UseCase__Group__5__Impl rule__UseCase__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalUmlTextual.g:5462:1: rule__UseCase__Group__5__Impl : ( ( rule__UseCase__DescriptionAssignment_5 ) ) ;
    public final void rule__UseCase__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5466:1: ( ( ( rule__UseCase__DescriptionAssignment_5 ) ) )
            // InternalUmlTextual.g:5467:1: ( ( rule__UseCase__DescriptionAssignment_5 ) )
            {
            // InternalUmlTextual.g:5467:1: ( ( rule__UseCase__DescriptionAssignment_5 ) )
            // InternalUmlTextual.g:5468:2: ( rule__UseCase__DescriptionAssignment_5 )
            {
             before(grammarAccess.getUseCaseAccess().getDescriptionAssignment_5()); 
            // InternalUmlTextual.g:5469:2: ( rule__UseCase__DescriptionAssignment_5 )
            // InternalUmlTextual.g:5469:3: rule__UseCase__DescriptionAssignment_5
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
    // InternalUmlTextual.g:5477:1: rule__UseCase__Group__6 : rule__UseCase__Group__6__Impl ;
    public final void rule__UseCase__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5481:1: ( rule__UseCase__Group__6__Impl )
            // InternalUmlTextual.g:5482:2: rule__UseCase__Group__6__Impl
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
    // InternalUmlTextual.g:5488:1: rule__UseCase__Group__6__Impl : ( ( rule__UseCase__Group_6__0 )? ) ;
    public final void rule__UseCase__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5492:1: ( ( ( rule__UseCase__Group_6__0 )? ) )
            // InternalUmlTextual.g:5493:1: ( ( rule__UseCase__Group_6__0 )? )
            {
            // InternalUmlTextual.g:5493:1: ( ( rule__UseCase__Group_6__0 )? )
            // InternalUmlTextual.g:5494:2: ( rule__UseCase__Group_6__0 )?
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6()); 
            // InternalUmlTextual.g:5495:2: ( rule__UseCase__Group_6__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==25) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalUmlTextual.g:5495:3: rule__UseCase__Group_6__0
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
    // InternalUmlTextual.g:5504:1: rule__UseCase__Group_2__0 : rule__UseCase__Group_2__0__Impl rule__UseCase__Group_2__1 ;
    public final void rule__UseCase__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5508:1: ( rule__UseCase__Group_2__0__Impl rule__UseCase__Group_2__1 )
            // InternalUmlTextual.g:5509:2: rule__UseCase__Group_2__0__Impl rule__UseCase__Group_2__1
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
    // InternalUmlTextual.g:5516:1: rule__UseCase__Group_2__0__Impl : ( 'includes' ) ;
    public final void rule__UseCase__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5520:1: ( ( 'includes' ) )
            // InternalUmlTextual.g:5521:1: ( 'includes' )
            {
            // InternalUmlTextual.g:5521:1: ( 'includes' )
            // InternalUmlTextual.g:5522:2: 'includes'
            {
             before(grammarAccess.getUseCaseAccess().getIncludesKeyword_2_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalUmlTextual.g:5531:1: rule__UseCase__Group_2__1 : rule__UseCase__Group_2__1__Impl ;
    public final void rule__UseCase__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5535:1: ( rule__UseCase__Group_2__1__Impl )
            // InternalUmlTextual.g:5536:2: rule__UseCase__Group_2__1__Impl
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
    // InternalUmlTextual.g:5542:1: rule__UseCase__Group_2__1__Impl : ( ( rule__UseCase__IncludedUseCasesAssignment_2_1 ) ) ;
    public final void rule__UseCase__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5546:1: ( ( ( rule__UseCase__IncludedUseCasesAssignment_2_1 ) ) )
            // InternalUmlTextual.g:5547:1: ( ( rule__UseCase__IncludedUseCasesAssignment_2_1 ) )
            {
            // InternalUmlTextual.g:5547:1: ( ( rule__UseCase__IncludedUseCasesAssignment_2_1 ) )
            // InternalUmlTextual.g:5548:2: ( rule__UseCase__IncludedUseCasesAssignment_2_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_2_1()); 
            // InternalUmlTextual.g:5549:2: ( rule__UseCase__IncludedUseCasesAssignment_2_1 )
            // InternalUmlTextual.g:5549:3: rule__UseCase__IncludedUseCasesAssignment_2_1
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
    // InternalUmlTextual.g:5558:1: rule__UseCase__Group_3__0 : rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 ;
    public final void rule__UseCase__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5562:1: ( rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1 )
            // InternalUmlTextual.g:5563:2: rule__UseCase__Group_3__0__Impl rule__UseCase__Group_3__1
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
    // InternalUmlTextual.g:5570:1: rule__UseCase__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__UseCase__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5574:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:5575:1: ( 'extends' )
            {
            // InternalUmlTextual.g:5575:1: ( 'extends' )
            // InternalUmlTextual.g:5576:2: 'extends'
            {
             before(grammarAccess.getUseCaseAccess().getExtendsKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUmlTextual.g:5585:1: rule__UseCase__Group_3__1 : rule__UseCase__Group_3__1__Impl ;
    public final void rule__UseCase__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5589:1: ( rule__UseCase__Group_3__1__Impl )
            // InternalUmlTextual.g:5590:2: rule__UseCase__Group_3__1__Impl
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
    // InternalUmlTextual.g:5596:1: rule__UseCase__Group_3__1__Impl : ( ( rule__UseCase__ExtendedUseCasesAssignment_3_1 ) ) ;
    public final void rule__UseCase__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5600:1: ( ( ( rule__UseCase__ExtendedUseCasesAssignment_3_1 ) ) )
            // InternalUmlTextual.g:5601:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_3_1 ) )
            {
            // InternalUmlTextual.g:5601:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_3_1 ) )
            // InternalUmlTextual.g:5602:2: ( rule__UseCase__ExtendedUseCasesAssignment_3_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_3_1()); 
            // InternalUmlTextual.g:5603:2: ( rule__UseCase__ExtendedUseCasesAssignment_3_1 )
            // InternalUmlTextual.g:5603:3: rule__UseCase__ExtendedUseCasesAssignment_3_1
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
    // InternalUmlTextual.g:5612:1: rule__UseCase__Group_6__0 : rule__UseCase__Group_6__0__Impl rule__UseCase__Group_6__1 ;
    public final void rule__UseCase__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5616:1: ( rule__UseCase__Group_6__0__Impl rule__UseCase__Group_6__1 )
            // InternalUmlTextual.g:5617:2: rule__UseCase__Group_6__0__Impl rule__UseCase__Group_6__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalUmlTextual.g:5624:1: rule__UseCase__Group_6__0__Impl : ( '{' ) ;
    public final void rule__UseCase__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5628:1: ( ( '{' ) )
            // InternalUmlTextual.g:5629:1: ( '{' )
            {
            // InternalUmlTextual.g:5629:1: ( '{' )
            // InternalUmlTextual.g:5630:2: '{'
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
    // InternalUmlTextual.g:5639:1: rule__UseCase__Group_6__1 : rule__UseCase__Group_6__1__Impl rule__UseCase__Group_6__2 ;
    public final void rule__UseCase__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5643:1: ( rule__UseCase__Group_6__1__Impl rule__UseCase__Group_6__2 )
            // InternalUmlTextual.g:5644:2: rule__UseCase__Group_6__1__Impl rule__UseCase__Group_6__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalUmlTextual.g:5651:1: rule__UseCase__Group_6__1__Impl : ( ( rule__UseCase__Alternatives_6_1 ) ) ;
    public final void rule__UseCase__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5655:1: ( ( ( rule__UseCase__Alternatives_6_1 ) ) )
            // InternalUmlTextual.g:5656:1: ( ( rule__UseCase__Alternatives_6_1 ) )
            {
            // InternalUmlTextual.g:5656:1: ( ( rule__UseCase__Alternatives_6_1 ) )
            // InternalUmlTextual.g:5657:2: ( rule__UseCase__Alternatives_6_1 )
            {
             before(grammarAccess.getUseCaseAccess().getAlternatives_6_1()); 
            // InternalUmlTextual.g:5658:2: ( rule__UseCase__Alternatives_6_1 )
            // InternalUmlTextual.g:5658:3: rule__UseCase__Alternatives_6_1
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
    // InternalUmlTextual.g:5666:1: rule__UseCase__Group_6__2 : rule__UseCase__Group_6__2__Impl ;
    public final void rule__UseCase__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5670:1: ( rule__UseCase__Group_6__2__Impl )
            // InternalUmlTextual.g:5671:2: rule__UseCase__Group_6__2__Impl
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
    // InternalUmlTextual.g:5677:1: rule__UseCase__Group_6__2__Impl : ( '}' ) ;
    public final void rule__UseCase__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5681:1: ( ( '}' ) )
            // InternalUmlTextual.g:5682:1: ( '}' )
            {
            // InternalUmlTextual.g:5682:1: ( '}' )
            // InternalUmlTextual.g:5683:2: '}'
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
    // InternalUmlTextual.g:5693:1: rule__UseCase__Group_6_1_0__0 : rule__UseCase__Group_6_1_0__0__Impl rule__UseCase__Group_6_1_0__1 ;
    public final void rule__UseCase__Group_6_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5697:1: ( rule__UseCase__Group_6_1_0__0__Impl rule__UseCase__Group_6_1_0__1 )
            // InternalUmlTextual.g:5698:2: rule__UseCase__Group_6_1_0__0__Impl rule__UseCase__Group_6_1_0__1
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
    // InternalUmlTextual.g:5705:1: rule__UseCase__Group_6_1_0__0__Impl : ( 'includes' ) ;
    public final void rule__UseCase__Group_6_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5709:1: ( ( 'includes' ) )
            // InternalUmlTextual.g:5710:1: ( 'includes' )
            {
            // InternalUmlTextual.g:5710:1: ( 'includes' )
            // InternalUmlTextual.g:5711:2: 'includes'
            {
             before(grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_0_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalUmlTextual.g:5720:1: rule__UseCase__Group_6_1_0__1 : rule__UseCase__Group_6_1_0__1__Impl rule__UseCase__Group_6_1_0__2 ;
    public final void rule__UseCase__Group_6_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5724:1: ( rule__UseCase__Group_6_1_0__1__Impl rule__UseCase__Group_6_1_0__2 )
            // InternalUmlTextual.g:5725:2: rule__UseCase__Group_6_1_0__1__Impl rule__UseCase__Group_6_1_0__2
            {
            pushFollow(FOLLOW_54);
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
    // InternalUmlTextual.g:5732:1: rule__UseCase__Group_6_1_0__1__Impl : ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 ) ) ;
    public final void rule__UseCase__Group_6_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5736:1: ( ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 ) ) )
            // InternalUmlTextual.g:5737:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 ) )
            {
            // InternalUmlTextual.g:5737:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 ) )
            // InternalUmlTextual.g:5738:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_0_1()); 
            // InternalUmlTextual.g:5739:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 )
            // InternalUmlTextual.g:5739:3: rule__UseCase__IncludedUseCasesAssignment_6_1_0_1
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
    // InternalUmlTextual.g:5747:1: rule__UseCase__Group_6_1_0__2 : rule__UseCase__Group_6_1_0__2__Impl rule__UseCase__Group_6_1_0__3 ;
    public final void rule__UseCase__Group_6_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5751:1: ( rule__UseCase__Group_6_1_0__2__Impl rule__UseCase__Group_6_1_0__3 )
            // InternalUmlTextual.g:5752:2: rule__UseCase__Group_6_1_0__2__Impl rule__UseCase__Group_6_1_0__3
            {
            pushFollow(FOLLOW_54);
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
    // InternalUmlTextual.g:5759:1: rule__UseCase__Group_6_1_0__2__Impl : ( ( rule__UseCase__Group_6_1_0_2__0 )* ) ;
    public final void rule__UseCase__Group_6_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5763:1: ( ( ( rule__UseCase__Group_6_1_0_2__0 )* ) )
            // InternalUmlTextual.g:5764:1: ( ( rule__UseCase__Group_6_1_0_2__0 )* )
            {
            // InternalUmlTextual.g:5764:1: ( ( rule__UseCase__Group_6_1_0_2__0 )* )
            // InternalUmlTextual.g:5765:2: ( rule__UseCase__Group_6_1_0_2__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_0_2()); 
            // InternalUmlTextual.g:5766:2: ( rule__UseCase__Group_6_1_0_2__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==34) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalUmlTextual.g:5766:3: rule__UseCase__Group_6_1_0_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__UseCase__Group_6_1_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
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
    // InternalUmlTextual.g:5774:1: rule__UseCase__Group_6_1_0__3 : rule__UseCase__Group_6_1_0__3__Impl rule__UseCase__Group_6_1_0__4 ;
    public final void rule__UseCase__Group_6_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5778:1: ( rule__UseCase__Group_6_1_0__3__Impl rule__UseCase__Group_6_1_0__4 )
            // InternalUmlTextual.g:5779:2: rule__UseCase__Group_6_1_0__3__Impl rule__UseCase__Group_6_1_0__4
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
    // InternalUmlTextual.g:5786:1: rule__UseCase__Group_6_1_0__3__Impl : ( 'extends' ) ;
    public final void rule__UseCase__Group_6_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5790:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:5791:1: ( 'extends' )
            {
            // InternalUmlTextual.g:5791:1: ( 'extends' )
            // InternalUmlTextual.g:5792:2: 'extends'
            {
             before(grammarAccess.getUseCaseAccess().getExtendsKeyword_6_1_0_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUmlTextual.g:5801:1: rule__UseCase__Group_6_1_0__4 : rule__UseCase__Group_6_1_0__4__Impl rule__UseCase__Group_6_1_0__5 ;
    public final void rule__UseCase__Group_6_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5805:1: ( rule__UseCase__Group_6_1_0__4__Impl rule__UseCase__Group_6_1_0__5 )
            // InternalUmlTextual.g:5806:2: rule__UseCase__Group_6_1_0__4__Impl rule__UseCase__Group_6_1_0__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalUmlTextual.g:5813:1: rule__UseCase__Group_6_1_0__4__Impl : ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 ) ) ;
    public final void rule__UseCase__Group_6_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5817:1: ( ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 ) ) )
            // InternalUmlTextual.g:5818:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 ) )
            {
            // InternalUmlTextual.g:5818:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 ) )
            // InternalUmlTextual.g:5819:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_0_4()); 
            // InternalUmlTextual.g:5820:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 )
            // InternalUmlTextual.g:5820:3: rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4
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
    // InternalUmlTextual.g:5828:1: rule__UseCase__Group_6_1_0__5 : rule__UseCase__Group_6_1_0__5__Impl ;
    public final void rule__UseCase__Group_6_1_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5832:1: ( rule__UseCase__Group_6_1_0__5__Impl )
            // InternalUmlTextual.g:5833:2: rule__UseCase__Group_6_1_0__5__Impl
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
    // InternalUmlTextual.g:5839:1: rule__UseCase__Group_6_1_0__5__Impl : ( ( rule__UseCase__Group_6_1_0_5__0 )* ) ;
    public final void rule__UseCase__Group_6_1_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5843:1: ( ( ( rule__UseCase__Group_6_1_0_5__0 )* ) )
            // InternalUmlTextual.g:5844:1: ( ( rule__UseCase__Group_6_1_0_5__0 )* )
            {
            // InternalUmlTextual.g:5844:1: ( ( rule__UseCase__Group_6_1_0_5__0 )* )
            // InternalUmlTextual.g:5845:2: ( rule__UseCase__Group_6_1_0_5__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_0_5()); 
            // InternalUmlTextual.g:5846:2: ( rule__UseCase__Group_6_1_0_5__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==34) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalUmlTextual.g:5846:3: rule__UseCase__Group_6_1_0_5__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__UseCase__Group_6_1_0_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalUmlTextual.g:5855:1: rule__UseCase__Group_6_1_0_2__0 : rule__UseCase__Group_6_1_0_2__0__Impl rule__UseCase__Group_6_1_0_2__1 ;
    public final void rule__UseCase__Group_6_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5859:1: ( rule__UseCase__Group_6_1_0_2__0__Impl rule__UseCase__Group_6_1_0_2__1 )
            // InternalUmlTextual.g:5860:2: rule__UseCase__Group_6_1_0_2__0__Impl rule__UseCase__Group_6_1_0_2__1
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
    // InternalUmlTextual.g:5867:1: rule__UseCase__Group_6_1_0_2__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5871:1: ( ( ',' ) )
            // InternalUmlTextual.g:5872:1: ( ',' )
            {
            // InternalUmlTextual.g:5872:1: ( ',' )
            // InternalUmlTextual.g:5873:2: ','
            {
             before(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_0_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUmlTextual.g:5882:1: rule__UseCase__Group_6_1_0_2__1 : rule__UseCase__Group_6_1_0_2__1__Impl ;
    public final void rule__UseCase__Group_6_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5886:1: ( rule__UseCase__Group_6_1_0_2__1__Impl )
            // InternalUmlTextual.g:5887:2: rule__UseCase__Group_6_1_0_2__1__Impl
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
    // InternalUmlTextual.g:5893:1: rule__UseCase__Group_6_1_0_2__1__Impl : ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 ) ) ;
    public final void rule__UseCase__Group_6_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5897:1: ( ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 ) ) )
            // InternalUmlTextual.g:5898:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 ) )
            {
            // InternalUmlTextual.g:5898:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 ) )
            // InternalUmlTextual.g:5899:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_0_2_1()); 
            // InternalUmlTextual.g:5900:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 )
            // InternalUmlTextual.g:5900:3: rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1
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
    // InternalUmlTextual.g:5909:1: rule__UseCase__Group_6_1_0_5__0 : rule__UseCase__Group_6_1_0_5__0__Impl rule__UseCase__Group_6_1_0_5__1 ;
    public final void rule__UseCase__Group_6_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5913:1: ( rule__UseCase__Group_6_1_0_5__0__Impl rule__UseCase__Group_6_1_0_5__1 )
            // InternalUmlTextual.g:5914:2: rule__UseCase__Group_6_1_0_5__0__Impl rule__UseCase__Group_6_1_0_5__1
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
    // InternalUmlTextual.g:5921:1: rule__UseCase__Group_6_1_0_5__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5925:1: ( ( ',' ) )
            // InternalUmlTextual.g:5926:1: ( ',' )
            {
            // InternalUmlTextual.g:5926:1: ( ',' )
            // InternalUmlTextual.g:5927:2: ','
            {
             before(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_0_5_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUmlTextual.g:5936:1: rule__UseCase__Group_6_1_0_5__1 : rule__UseCase__Group_6_1_0_5__1__Impl ;
    public final void rule__UseCase__Group_6_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5940:1: ( rule__UseCase__Group_6_1_0_5__1__Impl )
            // InternalUmlTextual.g:5941:2: rule__UseCase__Group_6_1_0_5__1__Impl
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
    // InternalUmlTextual.g:5947:1: rule__UseCase__Group_6_1_0_5__1__Impl : ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 ) ) ;
    public final void rule__UseCase__Group_6_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5951:1: ( ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 ) ) )
            // InternalUmlTextual.g:5952:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 ) )
            {
            // InternalUmlTextual.g:5952:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 ) )
            // InternalUmlTextual.g:5953:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_0_5_1()); 
            // InternalUmlTextual.g:5954:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 )
            // InternalUmlTextual.g:5954:3: rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1
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
    // InternalUmlTextual.g:5963:1: rule__UseCase__Group_6_1_1__0 : rule__UseCase__Group_6_1_1__0__Impl rule__UseCase__Group_6_1_1__1 ;
    public final void rule__UseCase__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5967:1: ( rule__UseCase__Group_6_1_1__0__Impl rule__UseCase__Group_6_1_1__1 )
            // InternalUmlTextual.g:5968:2: rule__UseCase__Group_6_1_1__0__Impl rule__UseCase__Group_6_1_1__1
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
    // InternalUmlTextual.g:5975:1: rule__UseCase__Group_6_1_1__0__Impl : ( 'extends' ) ;
    public final void rule__UseCase__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5979:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:5980:1: ( 'extends' )
            {
            // InternalUmlTextual.g:5980:1: ( 'extends' )
            // InternalUmlTextual.g:5981:2: 'extends'
            {
             before(grammarAccess.getUseCaseAccess().getExtendsKeyword_6_1_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalUmlTextual.g:5990:1: rule__UseCase__Group_6_1_1__1 : rule__UseCase__Group_6_1_1__1__Impl rule__UseCase__Group_6_1_1__2 ;
    public final void rule__UseCase__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:5994:1: ( rule__UseCase__Group_6_1_1__1__Impl rule__UseCase__Group_6_1_1__2 )
            // InternalUmlTextual.g:5995:2: rule__UseCase__Group_6_1_1__1__Impl rule__UseCase__Group_6_1_1__2
            {
            pushFollow(FOLLOW_55);
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
    // InternalUmlTextual.g:6002:1: rule__UseCase__Group_6_1_1__1__Impl : ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 ) ) ;
    public final void rule__UseCase__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6006:1: ( ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 ) ) )
            // InternalUmlTextual.g:6007:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 ) )
            {
            // InternalUmlTextual.g:6007:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 ) )
            // InternalUmlTextual.g:6008:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_1_1()); 
            // InternalUmlTextual.g:6009:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 )
            // InternalUmlTextual.g:6009:3: rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1
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
    // InternalUmlTextual.g:6017:1: rule__UseCase__Group_6_1_1__2 : rule__UseCase__Group_6_1_1__2__Impl rule__UseCase__Group_6_1_1__3 ;
    public final void rule__UseCase__Group_6_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6021:1: ( rule__UseCase__Group_6_1_1__2__Impl rule__UseCase__Group_6_1_1__3 )
            // InternalUmlTextual.g:6022:2: rule__UseCase__Group_6_1_1__2__Impl rule__UseCase__Group_6_1_1__3
            {
            pushFollow(FOLLOW_55);
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
    // InternalUmlTextual.g:6029:1: rule__UseCase__Group_6_1_1__2__Impl : ( ( rule__UseCase__Group_6_1_1_2__0 )* ) ;
    public final void rule__UseCase__Group_6_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6033:1: ( ( ( rule__UseCase__Group_6_1_1_2__0 )* ) )
            // InternalUmlTextual.g:6034:1: ( ( rule__UseCase__Group_6_1_1_2__0 )* )
            {
            // InternalUmlTextual.g:6034:1: ( ( rule__UseCase__Group_6_1_1_2__0 )* )
            // InternalUmlTextual.g:6035:2: ( rule__UseCase__Group_6_1_1_2__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_1_2()); 
            // InternalUmlTextual.g:6036:2: ( rule__UseCase__Group_6_1_1_2__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==34) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalUmlTextual.g:6036:3: rule__UseCase__Group_6_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__UseCase__Group_6_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // InternalUmlTextual.g:6044:1: rule__UseCase__Group_6_1_1__3 : rule__UseCase__Group_6_1_1__3__Impl rule__UseCase__Group_6_1_1__4 ;
    public final void rule__UseCase__Group_6_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6048:1: ( rule__UseCase__Group_6_1_1__3__Impl rule__UseCase__Group_6_1_1__4 )
            // InternalUmlTextual.g:6049:2: rule__UseCase__Group_6_1_1__3__Impl rule__UseCase__Group_6_1_1__4
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
    // InternalUmlTextual.g:6056:1: rule__UseCase__Group_6_1_1__3__Impl : ( 'includes' ) ;
    public final void rule__UseCase__Group_6_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6060:1: ( ( 'includes' ) )
            // InternalUmlTextual.g:6061:1: ( 'includes' )
            {
            // InternalUmlTextual.g:6061:1: ( 'includes' )
            // InternalUmlTextual.g:6062:2: 'includes'
            {
             before(grammarAccess.getUseCaseAccess().getIncludesKeyword_6_1_1_3()); 
            match(input,62,FOLLOW_2); 
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
    // InternalUmlTextual.g:6071:1: rule__UseCase__Group_6_1_1__4 : rule__UseCase__Group_6_1_1__4__Impl rule__UseCase__Group_6_1_1__5 ;
    public final void rule__UseCase__Group_6_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6075:1: ( rule__UseCase__Group_6_1_1__4__Impl rule__UseCase__Group_6_1_1__5 )
            // InternalUmlTextual.g:6076:2: rule__UseCase__Group_6_1_1__4__Impl rule__UseCase__Group_6_1_1__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalUmlTextual.g:6083:1: rule__UseCase__Group_6_1_1__4__Impl : ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 ) ) ;
    public final void rule__UseCase__Group_6_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6087:1: ( ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 ) ) )
            // InternalUmlTextual.g:6088:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 ) )
            {
            // InternalUmlTextual.g:6088:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 ) )
            // InternalUmlTextual.g:6089:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_1_4()); 
            // InternalUmlTextual.g:6090:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 )
            // InternalUmlTextual.g:6090:3: rule__UseCase__IncludedUseCasesAssignment_6_1_1_4
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
    // InternalUmlTextual.g:6098:1: rule__UseCase__Group_6_1_1__5 : rule__UseCase__Group_6_1_1__5__Impl ;
    public final void rule__UseCase__Group_6_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6102:1: ( rule__UseCase__Group_6_1_1__5__Impl )
            // InternalUmlTextual.g:6103:2: rule__UseCase__Group_6_1_1__5__Impl
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
    // InternalUmlTextual.g:6109:1: rule__UseCase__Group_6_1_1__5__Impl : ( ( rule__UseCase__Group_6_1_1_5__0 )* ) ;
    public final void rule__UseCase__Group_6_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6113:1: ( ( ( rule__UseCase__Group_6_1_1_5__0 )* ) )
            // InternalUmlTextual.g:6114:1: ( ( rule__UseCase__Group_6_1_1_5__0 )* )
            {
            // InternalUmlTextual.g:6114:1: ( ( rule__UseCase__Group_6_1_1_5__0 )* )
            // InternalUmlTextual.g:6115:2: ( rule__UseCase__Group_6_1_1_5__0 )*
            {
             before(grammarAccess.getUseCaseAccess().getGroup_6_1_1_5()); 
            // InternalUmlTextual.g:6116:2: ( rule__UseCase__Group_6_1_1_5__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==34) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalUmlTextual.g:6116:3: rule__UseCase__Group_6_1_1_5__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__UseCase__Group_6_1_1_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalUmlTextual.g:6125:1: rule__UseCase__Group_6_1_1_2__0 : rule__UseCase__Group_6_1_1_2__0__Impl rule__UseCase__Group_6_1_1_2__1 ;
    public final void rule__UseCase__Group_6_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6129:1: ( rule__UseCase__Group_6_1_1_2__0__Impl rule__UseCase__Group_6_1_1_2__1 )
            // InternalUmlTextual.g:6130:2: rule__UseCase__Group_6_1_1_2__0__Impl rule__UseCase__Group_6_1_1_2__1
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
    // InternalUmlTextual.g:6137:1: rule__UseCase__Group_6_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6141:1: ( ( ',' ) )
            // InternalUmlTextual.g:6142:1: ( ',' )
            {
            // InternalUmlTextual.g:6142:1: ( ',' )
            // InternalUmlTextual.g:6143:2: ','
            {
             before(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_1_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUmlTextual.g:6152:1: rule__UseCase__Group_6_1_1_2__1 : rule__UseCase__Group_6_1_1_2__1__Impl ;
    public final void rule__UseCase__Group_6_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6156:1: ( rule__UseCase__Group_6_1_1_2__1__Impl )
            // InternalUmlTextual.g:6157:2: rule__UseCase__Group_6_1_1_2__1__Impl
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
    // InternalUmlTextual.g:6163:1: rule__UseCase__Group_6_1_1_2__1__Impl : ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 ) ) ;
    public final void rule__UseCase__Group_6_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6167:1: ( ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 ) ) )
            // InternalUmlTextual.g:6168:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 ) )
            {
            // InternalUmlTextual.g:6168:1: ( ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 ) )
            // InternalUmlTextual.g:6169:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesAssignment_6_1_1_2_1()); 
            // InternalUmlTextual.g:6170:2: ( rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 )
            // InternalUmlTextual.g:6170:3: rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1
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
    // InternalUmlTextual.g:6179:1: rule__UseCase__Group_6_1_1_5__0 : rule__UseCase__Group_6_1_1_5__0__Impl rule__UseCase__Group_6_1_1_5__1 ;
    public final void rule__UseCase__Group_6_1_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6183:1: ( rule__UseCase__Group_6_1_1_5__0__Impl rule__UseCase__Group_6_1_1_5__1 )
            // InternalUmlTextual.g:6184:2: rule__UseCase__Group_6_1_1_5__0__Impl rule__UseCase__Group_6_1_1_5__1
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
    // InternalUmlTextual.g:6191:1: rule__UseCase__Group_6_1_1_5__0__Impl : ( ',' ) ;
    public final void rule__UseCase__Group_6_1_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6195:1: ( ( ',' ) )
            // InternalUmlTextual.g:6196:1: ( ',' )
            {
            // InternalUmlTextual.g:6196:1: ( ',' )
            // InternalUmlTextual.g:6197:2: ','
            {
             before(grammarAccess.getUseCaseAccess().getCommaKeyword_6_1_1_5_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalUmlTextual.g:6206:1: rule__UseCase__Group_6_1_1_5__1 : rule__UseCase__Group_6_1_1_5__1__Impl ;
    public final void rule__UseCase__Group_6_1_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6210:1: ( rule__UseCase__Group_6_1_1_5__1__Impl )
            // InternalUmlTextual.g:6211:2: rule__UseCase__Group_6_1_1_5__1__Impl
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
    // InternalUmlTextual.g:6217:1: rule__UseCase__Group_6_1_1_5__1__Impl : ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 ) ) ;
    public final void rule__UseCase__Group_6_1_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6221:1: ( ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 ) ) )
            // InternalUmlTextual.g:6222:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 ) )
            {
            // InternalUmlTextual.g:6222:1: ( ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 ) )
            // InternalUmlTextual.g:6223:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesAssignment_6_1_1_5_1()); 
            // InternalUmlTextual.g:6224:2: ( rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 )
            // InternalUmlTextual.g:6224:3: rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1
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
    // InternalUmlTextual.g:6233:1: rule__Model__ElementsAssignment : ( ruleModelElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6237:1: ( ( ruleModelElement ) )
            // InternalUmlTextual.g:6238:2: ( ruleModelElement )
            {
            // InternalUmlTextual.g:6238:2: ( ruleModelElement )
            // InternalUmlTextual.g:6239:3: ruleModelElement
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
    // InternalUmlTextual.g:6248:1: rule__Package__InstantiableAssignment_0 : ( ( 'instantiable' ) ) ;
    public final void rule__Package__InstantiableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6252:1: ( ( ( 'instantiable' ) ) )
            // InternalUmlTextual.g:6253:2: ( ( 'instantiable' ) )
            {
            // InternalUmlTextual.g:6253:2: ( ( 'instantiable' ) )
            // InternalUmlTextual.g:6254:3: ( 'instantiable' )
            {
             before(grammarAccess.getPackageAccess().getInstantiableInstantiableKeyword_0_0()); 
            // InternalUmlTextual.g:6255:3: ( 'instantiable' )
            // InternalUmlTextual.g:6256:4: 'instantiable'
            {
             before(grammarAccess.getPackageAccess().getInstantiableInstantiableKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalUmlTextual.g:6267:1: rule__Package__TypeAssignment_1 : ( ( rule__Package__TypeAlternatives_1_0 ) ) ;
    public final void rule__Package__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6271:1: ( ( ( rule__Package__TypeAlternatives_1_0 ) ) )
            // InternalUmlTextual.g:6272:2: ( ( rule__Package__TypeAlternatives_1_0 ) )
            {
            // InternalUmlTextual.g:6272:2: ( ( rule__Package__TypeAlternatives_1_0 ) )
            // InternalUmlTextual.g:6273:3: ( rule__Package__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getPackageAccess().getTypeAlternatives_1_0()); 
            // InternalUmlTextual.g:6274:3: ( rule__Package__TypeAlternatives_1_0 )
            // InternalUmlTextual.g:6274:4: rule__Package__TypeAlternatives_1_0
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
    // InternalUmlTextual.g:6282:1: rule__Package__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6286:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6287:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6287:2: ( RULE_ID )
            // InternalUmlTextual.g:6288:3: RULE_ID
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
    // InternalUmlTextual.g:6297:1: rule__Package__ParentPackageAssignment_3_2 : ( ( RULE_ID ) ) ;
    public final void rule__Package__ParentPackageAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6301:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:6302:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:6302:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6303:3: ( RULE_ID )
            {
             before(grammarAccess.getPackageAccess().getParentPackagePackageCrossReference_3_2_0()); 
            // InternalUmlTextual.g:6304:3: ( RULE_ID )
            // InternalUmlTextual.g:6305:4: RULE_ID
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
    // InternalUmlTextual.g:6316:1: rule__Package__DomainSpecificTypesAssignment_5 : ( ruleDomainSpecificType ) ;
    public final void rule__Package__DomainSpecificTypesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6320:1: ( ( ruleDomainSpecificType ) )
            // InternalUmlTextual.g:6321:2: ( ruleDomainSpecificType )
            {
            // InternalUmlTextual.g:6321:2: ( ruleDomainSpecificType )
            // InternalUmlTextual.g:6322:3: ruleDomainSpecificType
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
    // InternalUmlTextual.g:6331:1: rule__Package__ElementsAssignment_6 : ( ruleElement ) ;
    public final void rule__Package__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6335:1: ( ( ruleElement ) )
            // InternalUmlTextual.g:6336:2: ( ruleElement )
            {
            // InternalUmlTextual.g:6336:2: ( ruleElement )
            // InternalUmlTextual.g:6337:3: ruleElement
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
    // InternalUmlTextual.g:6346:1: rule__Class__StereotypeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Class__StereotypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6350:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6351:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6351:2: ( RULE_ID )
            // InternalUmlTextual.g:6352:3: RULE_ID
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
    // InternalUmlTextual.g:6361:1: rule__Class__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6365:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6366:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6366:2: ( ruleVisibility )
            // InternalUmlTextual.g:6367:3: ruleVisibility
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
    // InternalUmlTextual.g:6376:1: rule__Class__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6380:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6381:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6381:2: ( RULE_ID )
            // InternalUmlTextual.g:6382:3: RULE_ID
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
    // InternalUmlTextual.g:6391:1: rule__Class__ParentClassAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__ParentClassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6395:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:6396:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:6396:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:6397:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassAccess().getParentClassClassCrossReference_4_1_0()); 
            // InternalUmlTextual.g:6398:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:6399:4: ruleQualifiedName
            {
             before(grammarAccess.getClassAccess().getParentClassClassQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getParentClassClassQualifiedNameParserRuleCall_4_1_0_1()); 

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
    // InternalUmlTextual.g:6410:1: rule__Class__InterfacesAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__InterfacesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6414:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:6415:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:6415:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:6416:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassAccess().getInterfacesInterfaceCrossReference_5_1_0()); 
            // InternalUmlTextual.g:6417:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:6418:4: ruleQualifiedName
            {
             before(grammarAccess.getClassAccess().getInterfacesInterfaceQualifiedNameParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getInterfacesInterfaceQualifiedNameParserRuleCall_5_1_0_1()); 

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
    // InternalUmlTextual.g:6429:1: rule__Class__InterfacesAssignment_5_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Class__InterfacesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6433:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:6434:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:6434:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:6435:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassAccess().getInterfacesInterfaceCrossReference_5_2_1_0()); 
            // InternalUmlTextual.g:6436:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:6437:4: ruleQualifiedName
            {
             before(grammarAccess.getClassAccess().getInterfacesInterfaceQualifiedNameParserRuleCall_5_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassAccess().getInterfacesInterfaceQualifiedNameParserRuleCall_5_2_1_0_1()); 

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
    // InternalUmlTextual.g:6448:1: rule__Class__AttributesAssignment_7 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6452:1: ( ( ruleAttribute ) )
            // InternalUmlTextual.g:6453:2: ( ruleAttribute )
            {
            // InternalUmlTextual.g:6453:2: ( ruleAttribute )
            // InternalUmlTextual.g:6454:3: ruleAttribute
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
    // InternalUmlTextual.g:6463:1: rule__Class__MethodsAssignment_8 : ( ruleMethod ) ;
    public final void rule__Class__MethodsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6467:1: ( ( ruleMethod ) )
            // InternalUmlTextual.g:6468:2: ( ruleMethod )
            {
            // InternalUmlTextual.g:6468:2: ( ruleMethod )
            // InternalUmlTextual.g:6469:3: ruleMethod
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
    // InternalUmlTextual.g:6478:1: rule__Interface__StereotypeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Interface__StereotypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6482:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6483:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6483:2: ( RULE_ID )
            // InternalUmlTextual.g:6484:3: RULE_ID
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
    // InternalUmlTextual.g:6493:1: rule__Interface__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Interface__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6497:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6498:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6498:2: ( ruleVisibility )
            // InternalUmlTextual.g:6499:3: ruleVisibility
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
    // InternalUmlTextual.g:6508:1: rule__Interface__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Interface__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6512:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6513:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6513:2: ( RULE_ID )
            // InternalUmlTextual.g:6514:3: RULE_ID
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
    // InternalUmlTextual.g:6523:1: rule__Interface__ParentInterfaceAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Interface__ParentInterfaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6527:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:6528:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:6528:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:6529:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getInterfaceAccess().getParentInterfaceInterfaceCrossReference_4_1_0()); 
            // InternalUmlTextual.g:6530:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:6531:4: ruleQualifiedName
            {
             before(grammarAccess.getInterfaceAccess().getParentInterfaceInterfaceQualifiedNameParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getInterfaceAccess().getParentInterfaceInterfaceQualifiedNameParserRuleCall_4_1_0_1()); 

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
    // InternalUmlTextual.g:6542:1: rule__Interface__AttributesAssignment_6 : ( ruleAttribute ) ;
    public final void rule__Interface__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6546:1: ( ( ruleAttribute ) )
            // InternalUmlTextual.g:6547:2: ( ruleAttribute )
            {
            // InternalUmlTextual.g:6547:2: ( ruleAttribute )
            // InternalUmlTextual.g:6548:3: ruleAttribute
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
    // InternalUmlTextual.g:6557:1: rule__AttributeType__NameAssignment_0 : ( ( 'string' ) ) ;
    public final void rule__AttributeType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6561:1: ( ( ( 'string' ) ) )
            // InternalUmlTextual.g:6562:2: ( ( 'string' ) )
            {
            // InternalUmlTextual.g:6562:2: ( ( 'string' ) )
            // InternalUmlTextual.g:6563:3: ( 'string' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameStringKeyword_0_0()); 
            // InternalUmlTextual.g:6564:3: ( 'string' )
            // InternalUmlTextual.g:6565:4: 'string'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameStringKeyword_0_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalUmlTextual.g:6576:1: rule__AttributeType__NameAssignment_1 : ( ( 'int' ) ) ;
    public final void rule__AttributeType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6580:1: ( ( ( 'int' ) ) )
            // InternalUmlTextual.g:6581:2: ( ( 'int' ) )
            {
            // InternalUmlTextual.g:6581:2: ( ( 'int' ) )
            // InternalUmlTextual.g:6582:3: ( 'int' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameIntKeyword_1_0()); 
            // InternalUmlTextual.g:6583:3: ( 'int' )
            // InternalUmlTextual.g:6584:4: 'int'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameIntKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalUmlTextual.g:6595:1: rule__AttributeType__NameAssignment_2 : ( ( 'double' ) ) ;
    public final void rule__AttributeType__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6599:1: ( ( ( 'double' ) ) )
            // InternalUmlTextual.g:6600:2: ( ( 'double' ) )
            {
            // InternalUmlTextual.g:6600:2: ( ( 'double' ) )
            // InternalUmlTextual.g:6601:3: ( 'double' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameDoubleKeyword_2_0()); 
            // InternalUmlTextual.g:6602:3: ( 'double' )
            // InternalUmlTextual.g:6603:4: 'double'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameDoubleKeyword_2_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalUmlTextual.g:6614:1: rule__AttributeType__NameAssignment_3 : ( ( 'boolean' ) ) ;
    public final void rule__AttributeType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6618:1: ( ( ( 'boolean' ) ) )
            // InternalUmlTextual.g:6619:2: ( ( 'boolean' ) )
            {
            // InternalUmlTextual.g:6619:2: ( ( 'boolean' ) )
            // InternalUmlTextual.g:6620:3: ( 'boolean' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_3_0()); 
            // InternalUmlTextual.g:6621:3: ( 'boolean' )
            // InternalUmlTextual.g:6622:4: 'boolean'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameBooleanKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalUmlTextual.g:6633:1: rule__AttributeType__NameAssignment_4 : ( ( 'byte' ) ) ;
    public final void rule__AttributeType__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6637:1: ( ( ( 'byte' ) ) )
            // InternalUmlTextual.g:6638:2: ( ( 'byte' ) )
            {
            // InternalUmlTextual.g:6638:2: ( ( 'byte' ) )
            // InternalUmlTextual.g:6639:3: ( 'byte' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameByteKeyword_4_0()); 
            // InternalUmlTextual.g:6640:3: ( 'byte' )
            // InternalUmlTextual.g:6641:4: 'byte'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameByteKeyword_4_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalUmlTextual.g:6652:1: rule__AttributeType__NameAssignment_5 : ( ( 'char' ) ) ;
    public final void rule__AttributeType__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6656:1: ( ( ( 'char' ) ) )
            // InternalUmlTextual.g:6657:2: ( ( 'char' ) )
            {
            // InternalUmlTextual.g:6657:2: ( ( 'char' ) )
            // InternalUmlTextual.g:6658:3: ( 'char' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameCharKeyword_5_0()); 
            // InternalUmlTextual.g:6659:3: ( 'char' )
            // InternalUmlTextual.g:6660:4: 'char'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameCharKeyword_5_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalUmlTextual.g:6671:1: rule__AttributeType__NameAssignment_6 : ( ( 'float' ) ) ;
    public final void rule__AttributeType__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6675:1: ( ( ( 'float' ) ) )
            // InternalUmlTextual.g:6676:2: ( ( 'float' ) )
            {
            // InternalUmlTextual.g:6676:2: ( ( 'float' ) )
            // InternalUmlTextual.g:6677:3: ( 'float' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameFloatKeyword_6_0()); 
            // InternalUmlTextual.g:6678:3: ( 'float' )
            // InternalUmlTextual.g:6679:4: 'float'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameFloatKeyword_6_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalUmlTextual.g:6690:1: rule__AttributeType__NameAssignment_7 : ( ( 'short' ) ) ;
    public final void rule__AttributeType__NameAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6694:1: ( ( ( 'short' ) ) )
            // InternalUmlTextual.g:6695:2: ( ( 'short' ) )
            {
            // InternalUmlTextual.g:6695:2: ( ( 'short' ) )
            // InternalUmlTextual.g:6696:3: ( 'short' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameShortKeyword_7_0()); 
            // InternalUmlTextual.g:6697:3: ( 'short' )
            // InternalUmlTextual.g:6698:4: 'short'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameShortKeyword_7_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalUmlTextual.g:6709:1: rule__AttributeType__NameAssignment_8 : ( ( 'long' ) ) ;
    public final void rule__AttributeType__NameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6713:1: ( ( ( 'long' ) ) )
            // InternalUmlTextual.g:6714:2: ( ( 'long' ) )
            {
            // InternalUmlTextual.g:6714:2: ( ( 'long' ) )
            // InternalUmlTextual.g:6715:3: ( 'long' )
            {
             before(grammarAccess.getAttributeTypeAccess().getNameLongKeyword_8_0()); 
            // InternalUmlTextual.g:6716:3: ( 'long' )
            // InternalUmlTextual.g:6717:4: 'long'
            {
             before(grammarAccess.getAttributeTypeAccess().getNameLongKeyword_8_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalUmlTextual.g:6728:1: rule__AttributeType__DomainTypeAssignment_9 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AttributeType__DomainTypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6732:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:6733:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:6733:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:6734:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAttributeTypeAccess().getDomainTypeDomainSpecificTypeCrossReference_9_0()); 
            // InternalUmlTextual.g:6735:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:6736:4: ruleQualifiedName
            {
             before(grammarAccess.getAttributeTypeAccess().getDomainTypeDomainSpecificTypeQualifiedNameParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeTypeAccess().getDomainTypeDomainSpecificTypeQualifiedNameParserRuleCall_9_0_1()); 

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
    // InternalUmlTextual.g:6747:1: rule__DomainSpecificType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainSpecificType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6751:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6752:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6752:2: ( RULE_ID )
            // InternalUmlTextual.g:6753:3: RULE_ID
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
    // InternalUmlTextual.g:6762:1: rule__DomainSpecificType__DescriptionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__DomainSpecificType__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6766:1: ( ( RULE_STRING ) )
            // InternalUmlTextual.g:6767:2: ( RULE_STRING )
            {
            // InternalUmlTextual.g:6767:2: ( RULE_STRING )
            // InternalUmlTextual.g:6768:3: RULE_STRING
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
    // InternalUmlTextual.g:6777:1: rule__Attribute__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6781:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6782:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6782:2: ( ruleVisibility )
            // InternalUmlTextual.g:6783:3: ruleVisibility
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
    // InternalUmlTextual.g:6792:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6796:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6797:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6797:2: ( RULE_ID )
            // InternalUmlTextual.g:6798:3: RULE_ID
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
    // InternalUmlTextual.g:6807:1: rule__Attribute__TypeAssignment_4 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6811:1: ( ( ruleAttributeType ) )
            // InternalUmlTextual.g:6812:2: ( ruleAttributeType )
            {
            // InternalUmlTextual.g:6812:2: ( ruleAttributeType )
            // InternalUmlTextual.g:6813:3: ruleAttributeType
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
    // InternalUmlTextual.g:6822:1: rule__Attribute__MultiplicityAssignment_5_1 : ( ruleMultiplicity ) ;
    public final void rule__Attribute__MultiplicityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6826:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6827:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6827:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6828:3: ruleMultiplicity
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
    // InternalUmlTextual.g:6837:1: rule__Method__VisibilityAssignment_2 : ( ruleVisibility ) ;
    public final void rule__Method__VisibilityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6841:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:6842:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:6842:2: ( ruleVisibility )
            // InternalUmlTextual.g:6843:3: ruleVisibility
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
    // InternalUmlTextual.g:6852:1: rule__Method__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6856:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6857:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6857:2: ( RULE_ID )
            // InternalUmlTextual.g:6858:3: RULE_ID
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


    // $ANTLR start "rule__Method__ParametersAssignment_6_0"
    // InternalUmlTextual.g:6867:1: rule__Method__ParametersAssignment_6_0 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6871:1: ( ( ruleParameter ) )
            // InternalUmlTextual.g:6872:2: ( ruleParameter )
            {
            // InternalUmlTextual.g:6872:2: ( ruleParameter )
            // InternalUmlTextual.g:6873:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_6_0"


    // $ANTLR start "rule__Method__ParametersAssignment_6_1_1"
    // InternalUmlTextual.g:6882:1: rule__Method__ParametersAssignment_6_1_1 : ( ruleParameter ) ;
    public final void rule__Method__ParametersAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6886:1: ( ( ruleParameter ) )
            // InternalUmlTextual.g:6887:2: ( ruleParameter )
            {
            // InternalUmlTextual.g:6887:2: ( ruleParameter )
            // InternalUmlTextual.g:6888:3: ruleParameter
            {
             before(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Method__ParametersAssignment_6_1_1"


    // $ANTLR start "rule__Method__ReturnTypeAssignment_9"
    // InternalUmlTextual.g:6897:1: rule__Method__ReturnTypeAssignment_9 : ( ruleAttributeType ) ;
    public final void rule__Method__ReturnTypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6901:1: ( ( ruleAttributeType ) )
            // InternalUmlTextual.g:6902:2: ( ruleAttributeType )
            {
            // InternalUmlTextual.g:6902:2: ( ruleAttributeType )
            // InternalUmlTextual.g:6903:3: ruleAttributeType
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
    // InternalUmlTextual.g:6912:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6916:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:6917:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:6917:2: ( RULE_ID )
            // InternalUmlTextual.g:6918:3: RULE_ID
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
    // InternalUmlTextual.g:6927:1: rule__Parameter__ParameterTypeAssignment_2 : ( ruleAttributeType ) ;
    public final void rule__Parameter__ParameterTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6931:1: ( ( ruleAttributeType ) )
            // InternalUmlTextual.g:6932:2: ( ruleAttributeType )
            {
            // InternalUmlTextual.g:6932:2: ( ruleAttributeType )
            // InternalUmlTextual.g:6933:3: ruleAttributeType
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
    // InternalUmlTextual.g:6942:1: rule__Association__NameAssignment_2 : ( ( rule__Association__NameAlternatives_2_0 ) ) ;
    public final void rule__Association__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6946:1: ( ( ( rule__Association__NameAlternatives_2_0 ) ) )
            // InternalUmlTextual.g:6947:2: ( ( rule__Association__NameAlternatives_2_0 ) )
            {
            // InternalUmlTextual.g:6947:2: ( ( rule__Association__NameAlternatives_2_0 ) )
            // InternalUmlTextual.g:6948:3: ( rule__Association__NameAlternatives_2_0 )
            {
             before(grammarAccess.getAssociationAccess().getNameAlternatives_2_0()); 
            // InternalUmlTextual.g:6949:3: ( rule__Association__NameAlternatives_2_0 )
            // InternalUmlTextual.g:6949:4: rule__Association__NameAlternatives_2_0
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
    // InternalUmlTextual.g:6957:1: rule__Association__Navigation1Assignment_5 : ( ruleNavigation ) ;
    public final void rule__Association__Navigation1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6961:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:6962:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:6962:2: ( ruleNavigation )
            // InternalUmlTextual.g:6963:3: ruleNavigation
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
    // InternalUmlTextual.g:6972:1: rule__Association__Class1Assignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Association__Class1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6976:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:6977:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:6977:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:6978:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssociationAccess().getClass1ClassCrossReference_6_0()); 
            // InternalUmlTextual.g:6979:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:6980:4: ruleQualifiedName
            {
             before(grammarAccess.getAssociationAccess().getClass1ClassQualifiedNameParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getClass1ClassQualifiedNameParserRuleCall_6_0_1()); 

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
    // InternalUmlTextual.g:6991:1: rule__Association__Multiplicity1Assignment_8 : ( ruleMultiplicity ) ;
    public final void rule__Association__Multiplicity1Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:6995:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:6996:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:6996:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:6997:3: ruleMultiplicity
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
    // InternalUmlTextual.g:7006:1: rule__Association__Navigation2Assignment_11 : ( ruleNavigation ) ;
    public final void rule__Association__Navigation2Assignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7010:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:7011:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:7011:2: ( ruleNavigation )
            // InternalUmlTextual.g:7012:3: ruleNavigation
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
    // InternalUmlTextual.g:7021:1: rule__Association__Class2Assignment_12 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Association__Class2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7025:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7026:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7026:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7027:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssociationAccess().getClass2ClassCrossReference_12_0()); 
            // InternalUmlTextual.g:7028:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7029:4: ruleQualifiedName
            {
             before(grammarAccess.getAssociationAccess().getClass2ClassQualifiedNameParserRuleCall_12_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getClass2ClassQualifiedNameParserRuleCall_12_0_1()); 

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
    // InternalUmlTextual.g:7040:1: rule__Association__Multiplicity2Assignment_14 : ( ruleMultiplicity ) ;
    public final void rule__Association__Multiplicity2Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7044:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:7045:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:7045:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:7046:3: ruleMultiplicity
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
    // InternalUmlTextual.g:7055:1: rule__Association__ClassAssignment_16_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Association__ClassAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7059:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7060:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7060:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7061:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAssociationAccess().getClassClassCrossReference_16_2_0()); 
            // InternalUmlTextual.g:7062:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7063:4: ruleQualifiedName
            {
             before(grammarAccess.getAssociationAccess().getClassClassQualifiedNameParserRuleCall_16_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getClassClassQualifiedNameParserRuleCall_16_2_0_1()); 

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
    // InternalUmlTextual.g:7074:1: rule__Aggregation__NameAssignment_1 : ( ( rule__Aggregation__NameAlternatives_1_0 ) ) ;
    public final void rule__Aggregation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7078:1: ( ( ( rule__Aggregation__NameAlternatives_1_0 ) ) )
            // InternalUmlTextual.g:7079:2: ( ( rule__Aggregation__NameAlternatives_1_0 ) )
            {
            // InternalUmlTextual.g:7079:2: ( ( rule__Aggregation__NameAlternatives_1_0 ) )
            // InternalUmlTextual.g:7080:3: ( rule__Aggregation__NameAlternatives_1_0 )
            {
             before(grammarAccess.getAggregationAccess().getNameAlternatives_1_0()); 
            // InternalUmlTextual.g:7081:3: ( rule__Aggregation__NameAlternatives_1_0 )
            // InternalUmlTextual.g:7081:4: rule__Aggregation__NameAlternatives_1_0
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
    // InternalUmlTextual.g:7089:1: rule__Aggregation__Class1Assignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Aggregation__Class1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7093:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7094:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7094:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7095:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAggregationAccess().getClass1ClassCrossReference_4_0()); 
            // InternalUmlTextual.g:7096:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7097:4: ruleQualifiedName
            {
             before(grammarAccess.getAggregationAccess().getClass1ClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAggregationAccess().getClass1ClassQualifiedNameParserRuleCall_4_0_1()); 

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
    // InternalUmlTextual.g:7108:1: rule__Aggregation__Multiplicity1Assignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Aggregation__Multiplicity1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7112:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:7113:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:7113:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:7114:3: ruleMultiplicity
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
    // InternalUmlTextual.g:7123:1: rule__Aggregation__NavigationAssignment_9 : ( ruleNavigation ) ;
    public final void rule__Aggregation__NavigationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7127:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:7128:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:7128:2: ( ruleNavigation )
            // InternalUmlTextual.g:7129:3: ruleNavigation
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
    // InternalUmlTextual.g:7138:1: rule__Aggregation__Class2Assignment_10 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Aggregation__Class2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7142:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7143:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7143:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7144:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAggregationAccess().getClass2ClassCrossReference_10_0()); 
            // InternalUmlTextual.g:7145:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7146:4: ruleQualifiedName
            {
             before(grammarAccess.getAggregationAccess().getClass2ClassQualifiedNameParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAggregationAccess().getClass2ClassQualifiedNameParserRuleCall_10_0_1()); 

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
    // InternalUmlTextual.g:7157:1: rule__Aggregation__Multiplicity2Assignment_12 : ( ruleMultiplicity ) ;
    public final void rule__Aggregation__Multiplicity2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7161:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:7162:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:7162:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:7163:3: ruleMultiplicity
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
    // InternalUmlTextual.g:7172:1: rule__Composition__NameAssignment_1 : ( ( rule__Composition__NameAlternatives_1_0 ) ) ;
    public final void rule__Composition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7176:1: ( ( ( rule__Composition__NameAlternatives_1_0 ) ) )
            // InternalUmlTextual.g:7177:2: ( ( rule__Composition__NameAlternatives_1_0 ) )
            {
            // InternalUmlTextual.g:7177:2: ( ( rule__Composition__NameAlternatives_1_0 ) )
            // InternalUmlTextual.g:7178:3: ( rule__Composition__NameAlternatives_1_0 )
            {
             before(grammarAccess.getCompositionAccess().getNameAlternatives_1_0()); 
            // InternalUmlTextual.g:7179:3: ( rule__Composition__NameAlternatives_1_0 )
            // InternalUmlTextual.g:7179:4: rule__Composition__NameAlternatives_1_0
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
    // InternalUmlTextual.g:7187:1: rule__Composition__Class1Assignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Composition__Class1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7191:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7192:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7192:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7193:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCompositionAccess().getClass1ClassCrossReference_4_0()); 
            // InternalUmlTextual.g:7194:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7195:4: ruleQualifiedName
            {
             before(grammarAccess.getCompositionAccess().getClass1ClassQualifiedNameParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getClass1ClassQualifiedNameParserRuleCall_4_0_1()); 

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
    // InternalUmlTextual.g:7206:1: rule__Composition__Multiplicity1Assignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Composition__Multiplicity1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7210:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:7211:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:7211:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:7212:3: ruleMultiplicity
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
    // InternalUmlTextual.g:7221:1: rule__Composition__NavigationAssignment_9 : ( ruleNavigation ) ;
    public final void rule__Composition__NavigationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7225:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:7226:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:7226:2: ( ruleNavigation )
            // InternalUmlTextual.g:7227:3: ruleNavigation
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
    // InternalUmlTextual.g:7236:1: rule__Composition__Class2Assignment_10 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Composition__Class2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7240:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7241:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7241:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7242:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCompositionAccess().getClass2ClassCrossReference_10_0()); 
            // InternalUmlTextual.g:7243:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7244:4: ruleQualifiedName
            {
             before(grammarAccess.getCompositionAccess().getClass2ClassQualifiedNameParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCompositionAccess().getClass2ClassQualifiedNameParserRuleCall_10_0_1()); 

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
    // InternalUmlTextual.g:7255:1: rule__Composition__Multiplicity2Assignment_12 : ( ruleMultiplicity ) ;
    public final void rule__Composition__Multiplicity2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7259:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:7260:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:7260:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:7261:3: ruleMultiplicity
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
    // InternalUmlTextual.g:7270:1: rule__UseCaseDiagram__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__UseCaseDiagram__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7274:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7275:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:7275:2: ( RULE_ID )
            // InternalUmlTextual.g:7276:3: RULE_ID
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
    // InternalUmlTextual.g:7285:1: rule__UseCaseDiagram__ElementsAssignment_4 : ( ruleUseCaseElement ) ;
    public final void rule__UseCaseDiagram__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7289:1: ( ( ruleUseCaseElement ) )
            // InternalUmlTextual.g:7290:2: ( ruleUseCaseElement )
            {
            // InternalUmlTextual.g:7290:2: ( ruleUseCaseElement )
            // InternalUmlTextual.g:7291:3: ruleUseCaseElement
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
    // InternalUmlTextual.g:7300:1: rule__Actor__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Actor__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7304:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:7305:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:7305:2: ( ruleVisibility )
            // InternalUmlTextual.g:7306:3: ruleVisibility
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
    // InternalUmlTextual.g:7315:1: rule__Actor__AbstractAssignment_1 : ( ruleAbstract ) ;
    public final void rule__Actor__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7319:1: ( ( ruleAbstract ) )
            // InternalUmlTextual.g:7320:2: ( ruleAbstract )
            {
            // InternalUmlTextual.g:7320:2: ( ruleAbstract )
            // InternalUmlTextual.g:7321:3: ruleAbstract
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
    // InternalUmlTextual.g:7330:1: rule__Actor__ActiveAssignment_2 : ( ruleActive ) ;
    public final void rule__Actor__ActiveAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7334:1: ( ( ruleActive ) )
            // InternalUmlTextual.g:7335:2: ( ruleActive )
            {
            // InternalUmlTextual.g:7335:2: ( ruleActive )
            // InternalUmlTextual.g:7336:3: ruleActive
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
    // InternalUmlTextual.g:7345:1: rule__Actor__BusinessAssignment_3 : ( ( 'business' ) ) ;
    public final void rule__Actor__BusinessAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7349:1: ( ( ( 'business' ) ) )
            // InternalUmlTextual.g:7350:2: ( ( 'business' ) )
            {
            // InternalUmlTextual.g:7350:2: ( ( 'business' ) )
            // InternalUmlTextual.g:7351:3: ( 'business' )
            {
             before(grammarAccess.getActorAccess().getBusinessBusinessKeyword_3_0()); 
            // InternalUmlTextual.g:7352:3: ( 'business' )
            // InternalUmlTextual.g:7353:4: 'business'
            {
             before(grammarAccess.getActorAccess().getBusinessBusinessKeyword_3_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalUmlTextual.g:7364:1: rule__Actor__NameAssignment_5 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7368:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7369:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:7369:2: ( RULE_ID )
            // InternalUmlTextual.g:7370:3: RULE_ID
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
    // InternalUmlTextual.g:7379:1: rule__Actor__ParentActorAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Actor__ParentActorAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7383:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7384:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7384:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7385:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getActorAccess().getParentActorActorCrossReference_6_1_0()); 
            // InternalUmlTextual.g:7386:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7387:4: ruleQualifiedName
            {
             before(grammarAccess.getActorAccess().getParentActorActorQualifiedNameParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActorAccess().getParentActorActorQualifiedNameParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getParentActorActorCrossReference_6_1_0()); 

            }


            }

        }
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
    // InternalUmlTextual.g:7398:1: rule__Actor__UseCasesAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Actor__UseCasesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7402:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7403:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7403:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7404:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getActorAccess().getUseCasesUseCaseCrossReference_8_1_0()); 
            // InternalUmlTextual.g:7405:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7406:4: ruleQualifiedName
            {
             before(grammarAccess.getActorAccess().getUseCasesUseCaseQualifiedNameParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActorAccess().getUseCasesUseCaseQualifiedNameParserRuleCall_8_1_0_1()); 

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
    // InternalUmlTextual.g:7417:1: rule__Actor__UseCasesAssignment_8_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Actor__UseCasesAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7421:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7422:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7422:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7423:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getActorAccess().getUseCasesUseCaseCrossReference_8_2_1_0()); 
            // InternalUmlTextual.g:7424:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7425:4: ruleQualifiedName
            {
             before(grammarAccess.getActorAccess().getUseCasesUseCaseQualifiedNameParserRuleCall_8_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getActorAccess().getUseCasesUseCaseQualifiedNameParserRuleCall_8_2_1_0_1()); 

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
    // InternalUmlTextual.g:7436:1: rule__UseCase__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UseCase__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7440:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:7441:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:7441:2: ( RULE_ID )
            // InternalUmlTextual.g:7442:3: RULE_ID
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
    // InternalUmlTextual.g:7451:1: rule__UseCase__IncludedUseCasesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UseCase__IncludedUseCasesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7455:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7456:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7456:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7457:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_2_1_0()); 
            // InternalUmlTextual.g:7458:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7459:4: ruleQualifiedName
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseQualifiedNameParserRuleCall_2_1_0_1()); 

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
    // InternalUmlTextual.g:7470:1: rule__UseCase__ExtendedUseCasesAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UseCase__ExtendedUseCasesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7474:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7475:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7475:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7476:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_3_1_0()); 
            // InternalUmlTextual.g:7477:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7478:4: ruleQualifiedName
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseQualifiedNameParserRuleCall_3_1_0_1()); 

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
    // InternalUmlTextual.g:7489:1: rule__UseCase__DescriptionAssignment_5 : ( RULE_STRING ) ;
    public final void rule__UseCase__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7493:1: ( ( RULE_STRING ) )
            // InternalUmlTextual.g:7494:2: ( RULE_STRING )
            {
            // InternalUmlTextual.g:7494:2: ( RULE_STRING )
            // InternalUmlTextual.g:7495:3: RULE_STRING
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
    // InternalUmlTextual.g:7504:1: rule__UseCase__IncludedUseCasesAssignment_6_1_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UseCase__IncludedUseCasesAssignment_6_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7508:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7509:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7509:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7510:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_0_1_0()); 
            // InternalUmlTextual.g:7511:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7512:4: ruleQualifiedName
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_0_1_0_1()); 

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
    // InternalUmlTextual.g:7523:1: rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UseCase__IncludedUseCasesAssignment_6_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7527:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7528:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7528:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7529:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_0_2_1_0()); 
            // InternalUmlTextual.g:7530:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7531:4: ruleQualifiedName
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_0_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_0_2_1_0_1()); 

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
    // InternalUmlTextual.g:7542:1: rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UseCase__ExtendedUseCasesAssignment_6_1_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7546:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7547:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7547:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7548:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_0_4_0()); 
            // InternalUmlTextual.g:7549:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7550:4: ruleQualifiedName
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_0_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_0_4_0_1()); 

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
    // InternalUmlTextual.g:7561:1: rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UseCase__ExtendedUseCasesAssignment_6_1_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7565:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7566:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7566:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7567:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_0_5_1_0()); 
            // InternalUmlTextual.g:7568:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7569:4: ruleQualifiedName
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_0_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_0_5_1_0_1()); 

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
    // InternalUmlTextual.g:7580:1: rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UseCase__ExtendedUseCasesAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7584:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7585:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7585:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7586:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_1_1_0()); 
            // InternalUmlTextual.g:7587:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7588:4: ruleQualifiedName
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_1_1_0_1()); 

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
    // InternalUmlTextual.g:7599:1: rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UseCase__ExtendedUseCasesAssignment_6_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7603:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7604:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7604:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7605:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseCrossReference_6_1_1_2_1_0()); 
            // InternalUmlTextual.g:7606:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7607:4: ruleQualifiedName
            {
             before(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getExtendedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_1_2_1_0_1()); 

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
    // InternalUmlTextual.g:7618:1: rule__UseCase__IncludedUseCasesAssignment_6_1_1_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UseCase__IncludedUseCasesAssignment_6_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7622:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7623:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7623:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7624:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_1_4_0()); 
            // InternalUmlTextual.g:7625:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7626:4: ruleQualifiedName
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_1_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_1_4_0_1()); 

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
    // InternalUmlTextual.g:7637:1: rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UseCase__IncludedUseCasesAssignment_6_1_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:7641:1: ( ( ( ruleQualifiedName ) ) )
            // InternalUmlTextual.g:7642:2: ( ( ruleQualifiedName ) )
            {
            // InternalUmlTextual.g:7642:2: ( ( ruleQualifiedName ) )
            // InternalUmlTextual.g:7643:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseCrossReference_6_1_1_5_1_0()); 
            // InternalUmlTextual.g:7644:3: ( ruleQualifiedName )
            // InternalUmlTextual.g:7645:4: ruleQualifiedName
            {
             before(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_1_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getUseCaseAccess().getIncludedUseCasesUseCaseQualifiedNameParserRuleCall_6_1_1_5_1_0_1()); 

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
    static final String dfa_2s = "\1\17\1\5\4\36\3\uffff\1\17";
    static final String dfa_3s = "\1\71\1\5\4\43\3\uffff\1\43";
    static final String dfa_4s = "\6\uffff\1\1\1\2\1\3\1\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\uffff\1\2\1\3\1\4\12\uffff\1\6\1\1\3\uffff\1\10\16\uffff\2\7\4\uffff\2\7",
            "\1\11",
            "\1\6\4\uffff\1\10",
            "\1\6\4\uffff\1\10",
            "\1\6\4\uffff\1\10",
            "\1\6\4\uffff\1\10",
            "",
            "",
            "",
            "\1\5\1\uffff\1\2\1\3\1\4\12\uffff\1\6\4\uffff\1\10"
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
            return "752:1: rule__Element__Alternatives : ( ( ruleClass ) | ( ruleAssociationConnector ) | ( ruleInterface ) );";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\10\uffff\1\11\2\uffff";
    static final String dfa_9s = "\1\4\7\uffff\1\50\2\uffff";
    static final String dfa_10s = "\1\47\7\uffff\1\54\2\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\1\11";
    static final String dfa_12s = "\13\uffff}>";
    static final String[] dfa_13s = {
            "\1\10\17\uffff\1\1\1\2\1\3\1\4\1\5\15\uffff\1\6\1\7",
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
            return "881:1: rule__Multiplicity__Alternatives : ( ( '1' ) | ( '0..1' ) | ( '0..*' ) | ( '*' ) | ( '1..*' ) | ( ( rule__Multiplicity__Group_5__0 ) ) | ( ( rule__Multiplicity__Group_6__0 ) ) | ( RULE_INT ) | ( ( rule__Multiplicity__Group_8__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x8400000000018002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8000000000018000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x030C0018C40E8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x030C0008C00E8002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000C00E8000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000302000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00006200040E8800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000200000E8002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00006000000E8802L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x030C0008C00E8000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000200040E8000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000200000E8000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L,0x00000000000001FFL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000C001F00010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00006000000E8800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x14000000040E9800L,0x0000000000000200L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x14000000000E9802L,0x0000000000000200L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x10000000000E9800L,0x0000000000000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000004000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000002100000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x4000000100000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000400000000L});

}