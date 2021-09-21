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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'unamed'", "'navigable'", "'package'", "'subsystem'", "'public'", "'private'", "'1'", "'0..1'", "'0..*'", "'*'", "'1..*'", "'{'", "'}'", "'class'", "'@'", "'extends'", "'string'", "'int'", "'double'", "'boolean'", "'byte'", "'char'", "'float'", "'short'", "'long'", "'attr'", "':'", "'['", "']'", "'undirected'", "'association'", "'from'", "'to'", "'aggregation'", "'composition'"
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
    // InternalUmlTextual.g:62:1: ruleModel : ( ( rule__Model__PackagesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:66:2: ( ( ( rule__Model__PackagesAssignment )* ) )
            // InternalUmlTextual.g:67:2: ( ( rule__Model__PackagesAssignment )* )
            {
            // InternalUmlTextual.g:67:2: ( ( rule__Model__PackagesAssignment )* )
            // InternalUmlTextual.g:68:3: ( rule__Model__PackagesAssignment )*
            {
             before(grammarAccess.getModelAccess().getPackagesAssignment()); 
            // InternalUmlTextual.g:69:3: ( rule__Model__PackagesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUmlTextual.g:69:4: rule__Model__PackagesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__PackagesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPackagesAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePackage"
    // InternalUmlTextual.g:78:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalUmlTextual.g:79:1: ( rulePackage EOF )
            // InternalUmlTextual.g:80:1: rulePackage EOF
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
    // InternalUmlTextual.g:87:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:91:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalUmlTextual.g:92:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalUmlTextual.g:92:2: ( ( rule__Package__Group__0 ) )
            // InternalUmlTextual.g:93:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalUmlTextual.g:94:3: ( rule__Package__Group__0 )
            // InternalUmlTextual.g:94:4: rule__Package__Group__0
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


    // $ANTLR start "entryRuleClass"
    // InternalUmlTextual.g:103:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalUmlTextual.g:104:1: ( ruleClass EOF )
            // InternalUmlTextual.g:105:1: ruleClass EOF
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
    // InternalUmlTextual.g:112:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:116:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalUmlTextual.g:117:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalUmlTextual.g:117:2: ( ( rule__Class__Group__0 ) )
            // InternalUmlTextual.g:118:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalUmlTextual.g:119:3: ( rule__Class__Group__0 )
            // InternalUmlTextual.g:119:4: rule__Class__Group__0
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


    // $ANTLR start "entryRuleVisibility"
    // InternalUmlTextual.g:128:1: entryRuleVisibility : ruleVisibility EOF ;
    public final void entryRuleVisibility() throws RecognitionException {
        try {
            // InternalUmlTextual.g:129:1: ( ruleVisibility EOF )
            // InternalUmlTextual.g:130:1: ruleVisibility EOF
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
    // InternalUmlTextual.g:137:1: ruleVisibility : ( ( rule__Visibility__Alternatives ) ) ;
    public final void ruleVisibility() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:141:2: ( ( ( rule__Visibility__Alternatives ) ) )
            // InternalUmlTextual.g:142:2: ( ( rule__Visibility__Alternatives ) )
            {
            // InternalUmlTextual.g:142:2: ( ( rule__Visibility__Alternatives ) )
            // InternalUmlTextual.g:143:3: ( rule__Visibility__Alternatives )
            {
             before(grammarAccess.getVisibilityAccess().getAlternatives()); 
            // InternalUmlTextual.g:144:3: ( rule__Visibility__Alternatives )
            // InternalUmlTextual.g:144:4: rule__Visibility__Alternatives
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


    // $ANTLR start "entryRuleAttributeType"
    // InternalUmlTextual.g:153:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // InternalUmlTextual.g:154:1: ( ruleAttributeType EOF )
            // InternalUmlTextual.g:155:1: ruleAttributeType EOF
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
    // InternalUmlTextual.g:162:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:166:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // InternalUmlTextual.g:167:2: ( ( rule__AttributeType__Alternatives ) )
            {
            // InternalUmlTextual.g:167:2: ( ( rule__AttributeType__Alternatives ) )
            // InternalUmlTextual.g:168:3: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // InternalUmlTextual.g:169:3: ( rule__AttributeType__Alternatives )
            // InternalUmlTextual.g:169:4: rule__AttributeType__Alternatives
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
    // InternalUmlTextual.g:178:1: entryRuleDomainSpecificType : ruleDomainSpecificType EOF ;
    public final void entryRuleDomainSpecificType() throws RecognitionException {
        try {
            // InternalUmlTextual.g:179:1: ( ruleDomainSpecificType EOF )
            // InternalUmlTextual.g:180:1: ruleDomainSpecificType EOF
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
    // InternalUmlTextual.g:187:1: ruleDomainSpecificType : ( ( rule__DomainSpecificType__NameAssignment ) ) ;
    public final void ruleDomainSpecificType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:191:2: ( ( ( rule__DomainSpecificType__NameAssignment ) ) )
            // InternalUmlTextual.g:192:2: ( ( rule__DomainSpecificType__NameAssignment ) )
            {
            // InternalUmlTextual.g:192:2: ( ( rule__DomainSpecificType__NameAssignment ) )
            // InternalUmlTextual.g:193:3: ( rule__DomainSpecificType__NameAssignment )
            {
             before(grammarAccess.getDomainSpecificTypeAccess().getNameAssignment()); 
            // InternalUmlTextual.g:194:3: ( rule__DomainSpecificType__NameAssignment )
            // InternalUmlTextual.g:194:4: rule__DomainSpecificType__NameAssignment
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
    // InternalUmlTextual.g:203:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalUmlTextual.g:204:1: ( ruleMultiplicity EOF )
            // InternalUmlTextual.g:205:1: ruleMultiplicity EOF
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
    // InternalUmlTextual.g:212:1: ruleMultiplicity : ( ( rule__Multiplicity__Alternatives ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:216:2: ( ( ( rule__Multiplicity__Alternatives ) ) )
            // InternalUmlTextual.g:217:2: ( ( rule__Multiplicity__Alternatives ) )
            {
            // InternalUmlTextual.g:217:2: ( ( rule__Multiplicity__Alternatives ) )
            // InternalUmlTextual.g:218:3: ( rule__Multiplicity__Alternatives )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives()); 
            // InternalUmlTextual.g:219:3: ( rule__Multiplicity__Alternatives )
            // InternalUmlTextual.g:219:4: rule__Multiplicity__Alternatives
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
    // InternalUmlTextual.g:228:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalUmlTextual.g:229:1: ( ruleAttribute EOF )
            // InternalUmlTextual.g:230:1: ruleAttribute EOF
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
    // InternalUmlTextual.g:237:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:241:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalUmlTextual.g:242:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalUmlTextual.g:242:2: ( ( rule__Attribute__Group__0 ) )
            // InternalUmlTextual.g:243:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalUmlTextual.g:244:3: ( rule__Attribute__Group__0 )
            // InternalUmlTextual.g:244:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRuleUnamed"
    // InternalUmlTextual.g:253:1: entryRuleUnamed : ruleUnamed EOF ;
    public final void entryRuleUnamed() throws RecognitionException {
        try {
            // InternalUmlTextual.g:254:1: ( ruleUnamed EOF )
            // InternalUmlTextual.g:255:1: ruleUnamed EOF
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
    // InternalUmlTextual.g:262:1: ruleUnamed : ( 'unamed' ) ;
    public final void ruleUnamed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:266:2: ( ( 'unamed' ) )
            // InternalUmlTextual.g:267:2: ( 'unamed' )
            {
            // InternalUmlTextual.g:267:2: ( 'unamed' )
            // InternalUmlTextual.g:268:3: 'unamed'
            {
             before(grammarAccess.getUnamedAccess().getUnamedKeyword()); 
            match(input,11,FOLLOW_2); 
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
    // InternalUmlTextual.g:278:1: entryRuleNavigation : ruleNavigation EOF ;
    public final void entryRuleNavigation() throws RecognitionException {
        try {
            // InternalUmlTextual.g:279:1: ( ruleNavigation EOF )
            // InternalUmlTextual.g:280:1: ruleNavigation EOF
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
    // InternalUmlTextual.g:287:1: ruleNavigation : ( 'navigable' ) ;
    public final void ruleNavigation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:291:2: ( ( 'navigable' ) )
            // InternalUmlTextual.g:292:2: ( 'navigable' )
            {
            // InternalUmlTextual.g:292:2: ( 'navigable' )
            // InternalUmlTextual.g:293:3: 'navigable'
            {
             before(grammarAccess.getNavigationAccess().getNavigableKeyword()); 
            match(input,12,FOLLOW_2); 
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
    // InternalUmlTextual.g:303:1: entryRuleAssociationConnector : ruleAssociationConnector EOF ;
    public final void entryRuleAssociationConnector() throws RecognitionException {
        try {
            // InternalUmlTextual.g:304:1: ( ruleAssociationConnector EOF )
            // InternalUmlTextual.g:305:1: ruleAssociationConnector EOF
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
    // InternalUmlTextual.g:312:1: ruleAssociationConnector : ( ( rule__AssociationConnector__Alternatives ) ) ;
    public final void ruleAssociationConnector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:316:2: ( ( ( rule__AssociationConnector__Alternatives ) ) )
            // InternalUmlTextual.g:317:2: ( ( rule__AssociationConnector__Alternatives ) )
            {
            // InternalUmlTextual.g:317:2: ( ( rule__AssociationConnector__Alternatives ) )
            // InternalUmlTextual.g:318:3: ( rule__AssociationConnector__Alternatives )
            {
             before(grammarAccess.getAssociationConnectorAccess().getAlternatives()); 
            // InternalUmlTextual.g:319:3: ( rule__AssociationConnector__Alternatives )
            // InternalUmlTextual.g:319:4: rule__AssociationConnector__Alternatives
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
    // InternalUmlTextual.g:328:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalUmlTextual.g:329:1: ( ruleAssociation EOF )
            // InternalUmlTextual.g:330:1: ruleAssociation EOF
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
    // InternalUmlTextual.g:337:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:341:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalUmlTextual.g:342:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalUmlTextual.g:342:2: ( ( rule__Association__Group__0 ) )
            // InternalUmlTextual.g:343:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalUmlTextual.g:344:3: ( rule__Association__Group__0 )
            // InternalUmlTextual.g:344:4: rule__Association__Group__0
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
    // InternalUmlTextual.g:353:1: entryRuleAggregation : ruleAggregation EOF ;
    public final void entryRuleAggregation() throws RecognitionException {
        try {
            // InternalUmlTextual.g:354:1: ( ruleAggregation EOF )
            // InternalUmlTextual.g:355:1: ruleAggregation EOF
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
    // InternalUmlTextual.g:362:1: ruleAggregation : ( ( rule__Aggregation__Group__0 ) ) ;
    public final void ruleAggregation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:366:2: ( ( ( rule__Aggregation__Group__0 ) ) )
            // InternalUmlTextual.g:367:2: ( ( rule__Aggregation__Group__0 ) )
            {
            // InternalUmlTextual.g:367:2: ( ( rule__Aggregation__Group__0 ) )
            // InternalUmlTextual.g:368:3: ( rule__Aggregation__Group__0 )
            {
             before(grammarAccess.getAggregationAccess().getGroup()); 
            // InternalUmlTextual.g:369:3: ( rule__Aggregation__Group__0 )
            // InternalUmlTextual.g:369:4: rule__Aggregation__Group__0
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
    // InternalUmlTextual.g:378:1: entryRuleComposition : ruleComposition EOF ;
    public final void entryRuleComposition() throws RecognitionException {
        try {
            // InternalUmlTextual.g:379:1: ( ruleComposition EOF )
            // InternalUmlTextual.g:380:1: ruleComposition EOF
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
    // InternalUmlTextual.g:387:1: ruleComposition : ( ( rule__Composition__Group__0 ) ) ;
    public final void ruleComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:391:2: ( ( ( rule__Composition__Group__0 ) ) )
            // InternalUmlTextual.g:392:2: ( ( rule__Composition__Group__0 ) )
            {
            // InternalUmlTextual.g:392:2: ( ( rule__Composition__Group__0 ) )
            // InternalUmlTextual.g:393:3: ( rule__Composition__Group__0 )
            {
             before(grammarAccess.getCompositionAccess().getGroup()); 
            // InternalUmlTextual.g:394:3: ( rule__Composition__Group__0 )
            // InternalUmlTextual.g:394:4: rule__Composition__Group__0
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


    // $ANTLR start "rule__Package__TypeAlternatives_0_0"
    // InternalUmlTextual.g:402:1: rule__Package__TypeAlternatives_0_0 : ( ( 'package' ) | ( 'subsystem' ) );
    public final void rule__Package__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:406:1: ( ( 'package' ) | ( 'subsystem' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalUmlTextual.g:407:2: ( 'package' )
                    {
                    // InternalUmlTextual.g:407:2: ( 'package' )
                    // InternalUmlTextual.g:408:3: 'package'
                    {
                     before(grammarAccess.getPackageAccess().getTypePackageKeyword_0_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPackageAccess().getTypePackageKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:413:2: ( 'subsystem' )
                    {
                    // InternalUmlTextual.g:413:2: ( 'subsystem' )
                    // InternalUmlTextual.g:414:3: 'subsystem'
                    {
                     before(grammarAccess.getPackageAccess().getTypeSubsystemKeyword_0_0_1()); 
                    match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__Visibility__Alternatives"
    // InternalUmlTextual.g:423:1: rule__Visibility__Alternatives : ( ( 'public' ) | ( 'private' ) );
    public final void rule__Visibility__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:427:1: ( ( 'public' ) | ( 'private' ) )
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
                    // InternalUmlTextual.g:428:2: ( 'public' )
                    {
                    // InternalUmlTextual.g:428:2: ( 'public' )
                    // InternalUmlTextual.g:429:3: 'public'
                    {
                     before(grammarAccess.getVisibilityAccess().getPublicKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getPublicKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:434:2: ( 'private' )
                    {
                    // InternalUmlTextual.g:434:2: ( 'private' )
                    // InternalUmlTextual.g:435:3: 'private'
                    {
                     before(grammarAccess.getVisibilityAccess().getPrivateKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVisibilityAccess().getPrivateKeyword_1()); 

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
    // InternalUmlTextual.g:444:1: rule__AttributeType__Alternatives : ( ( ( rule__AttributeType__Group_0__0 ) ) | ( ( rule__AttributeType__Group_1__0 ) ) | ( ( rule__AttributeType__Group_2__0 ) ) | ( ( rule__AttributeType__Group_3__0 ) ) | ( ( rule__AttributeType__Group_4__0 ) ) | ( ( rule__AttributeType__Group_5__0 ) ) | ( ( rule__AttributeType__Group_6__0 ) ) | ( ( rule__AttributeType__Group_7__0 ) ) | ( ( rule__AttributeType__Group_8__0 ) ) | ( ruleDomainSpecificType ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:448:1: ( ( ( rule__AttributeType__Group_0__0 ) ) | ( ( rule__AttributeType__Group_1__0 ) ) | ( ( rule__AttributeType__Group_2__0 ) ) | ( ( rule__AttributeType__Group_3__0 ) ) | ( ( rule__AttributeType__Group_4__0 ) ) | ( ( rule__AttributeType__Group_5__0 ) ) | ( ( rule__AttributeType__Group_6__0 ) ) | ( ( rule__AttributeType__Group_7__0 ) ) | ( ( rule__AttributeType__Group_8__0 ) ) | ( ruleDomainSpecificType ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            case 30:
                {
                alt4=4;
                }
                break;
            case 31:
                {
                alt4=5;
                }
                break;
            case 32:
                {
                alt4=6;
                }
                break;
            case 33:
                {
                alt4=7;
                }
                break;
            case 34:
                {
                alt4=8;
                }
                break;
            case 35:
                {
                alt4=9;
                }
                break;
            case RULE_ID:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalUmlTextual.g:449:2: ( ( rule__AttributeType__Group_0__0 ) )
                    {
                    // InternalUmlTextual.g:449:2: ( ( rule__AttributeType__Group_0__0 ) )
                    // InternalUmlTextual.g:450:3: ( rule__AttributeType__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getGroup_0()); 
                    // InternalUmlTextual.g:451:3: ( rule__AttributeType__Group_0__0 )
                    // InternalUmlTextual.g:451:4: rule__AttributeType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:455:2: ( ( rule__AttributeType__Group_1__0 ) )
                    {
                    // InternalUmlTextual.g:455:2: ( ( rule__AttributeType__Group_1__0 ) )
                    // InternalUmlTextual.g:456:3: ( rule__AttributeType__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getGroup_1()); 
                    // InternalUmlTextual.g:457:3: ( rule__AttributeType__Group_1__0 )
                    // InternalUmlTextual.g:457:4: rule__AttributeType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:461:2: ( ( rule__AttributeType__Group_2__0 ) )
                    {
                    // InternalUmlTextual.g:461:2: ( ( rule__AttributeType__Group_2__0 ) )
                    // InternalUmlTextual.g:462:3: ( rule__AttributeType__Group_2__0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getGroup_2()); 
                    // InternalUmlTextual.g:463:3: ( rule__AttributeType__Group_2__0 )
                    // InternalUmlTextual.g:463:4: rule__AttributeType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:467:2: ( ( rule__AttributeType__Group_3__0 ) )
                    {
                    // InternalUmlTextual.g:467:2: ( ( rule__AttributeType__Group_3__0 ) )
                    // InternalUmlTextual.g:468:3: ( rule__AttributeType__Group_3__0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getGroup_3()); 
                    // InternalUmlTextual.g:469:3: ( rule__AttributeType__Group_3__0 )
                    // InternalUmlTextual.g:469:4: rule__AttributeType__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUmlTextual.g:473:2: ( ( rule__AttributeType__Group_4__0 ) )
                    {
                    // InternalUmlTextual.g:473:2: ( ( rule__AttributeType__Group_4__0 ) )
                    // InternalUmlTextual.g:474:3: ( rule__AttributeType__Group_4__0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getGroup_4()); 
                    // InternalUmlTextual.g:475:3: ( rule__AttributeType__Group_4__0 )
                    // InternalUmlTextual.g:475:4: rule__AttributeType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalUmlTextual.g:479:2: ( ( rule__AttributeType__Group_5__0 ) )
                    {
                    // InternalUmlTextual.g:479:2: ( ( rule__AttributeType__Group_5__0 ) )
                    // InternalUmlTextual.g:480:3: ( rule__AttributeType__Group_5__0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getGroup_5()); 
                    // InternalUmlTextual.g:481:3: ( rule__AttributeType__Group_5__0 )
                    // InternalUmlTextual.g:481:4: rule__AttributeType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalUmlTextual.g:485:2: ( ( rule__AttributeType__Group_6__0 ) )
                    {
                    // InternalUmlTextual.g:485:2: ( ( rule__AttributeType__Group_6__0 ) )
                    // InternalUmlTextual.g:486:3: ( rule__AttributeType__Group_6__0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getGroup_6()); 
                    // InternalUmlTextual.g:487:3: ( rule__AttributeType__Group_6__0 )
                    // InternalUmlTextual.g:487:4: rule__AttributeType__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalUmlTextual.g:491:2: ( ( rule__AttributeType__Group_7__0 ) )
                    {
                    // InternalUmlTextual.g:491:2: ( ( rule__AttributeType__Group_7__0 ) )
                    // InternalUmlTextual.g:492:3: ( rule__AttributeType__Group_7__0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getGroup_7()); 
                    // InternalUmlTextual.g:493:3: ( rule__AttributeType__Group_7__0 )
                    // InternalUmlTextual.g:493:4: rule__AttributeType__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalUmlTextual.g:497:2: ( ( rule__AttributeType__Group_8__0 ) )
                    {
                    // InternalUmlTextual.g:497:2: ( ( rule__AttributeType__Group_8__0 ) )
                    // InternalUmlTextual.g:498:3: ( rule__AttributeType__Group_8__0 )
                    {
                     before(grammarAccess.getAttributeTypeAccess().getGroup_8()); 
                    // InternalUmlTextual.g:499:3: ( rule__AttributeType__Group_8__0 )
                    // InternalUmlTextual.g:499:4: rule__AttributeType__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeType__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeTypeAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalUmlTextual.g:503:2: ( ruleDomainSpecificType )
                    {
                    // InternalUmlTextual.g:503:2: ( ruleDomainSpecificType )
                    // InternalUmlTextual.g:504:3: ruleDomainSpecificType
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
    // InternalUmlTextual.g:513:1: rule__Multiplicity__Alternatives : ( ( '1' ) | ( '0..1' ) | ( '0..*' ) | ( '*' ) | ( '1..*' ) );
    public final void rule__Multiplicity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:517:1: ( ( '1' ) | ( '0..1' ) | ( '0..*' ) | ( '*' ) | ( '1..*' ) )
            int alt5=5;
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
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUmlTextual.g:518:2: ( '1' )
                    {
                    // InternalUmlTextual.g:518:2: ( '1' )
                    // InternalUmlTextual.g:519:3: '1'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitOneKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitOneKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:524:2: ( '0..1' )
                    {
                    // InternalUmlTextual.g:524:2: ( '0..1' )
                    // InternalUmlTextual.g:525:3: '0..1'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalUmlTextual.g:530:2: ( '0..*' )
                    {
                    // InternalUmlTextual.g:530:2: ( '0..*' )
                    // InternalUmlTextual.g:531:3: '0..*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitZeroFullStopFullStopAsteriskKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalUmlTextual.g:536:2: ( '*' )
                    {
                    // InternalUmlTextual.g:536:2: ( '*' )
                    // InternalUmlTextual.g:537:3: '*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalUmlTextual.g:542:2: ( '1..*' )
                    {
                    // InternalUmlTextual.g:542:2: ( '1..*' )
                    // InternalUmlTextual.g:543:3: '1..*'
                    {
                     before(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopAsteriskKeyword_4()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getDigitOneFullStopFullStopAsteriskKeyword_4()); 

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
    // InternalUmlTextual.g:552:1: rule__AssociationConnector__Alternatives : ( ( ruleAssociation ) | ( ruleAggregation ) | ( ruleComposition ) );
    public final void rule__AssociationConnector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:556:1: ( ( ruleAssociation ) | ( ruleAggregation ) | ( ruleComposition ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
                {
                alt6=1;
                }
                break;
            case 44:
                {
                alt6=2;
                }
                break;
            case 45:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalUmlTextual.g:557:2: ( ruleAssociation )
                    {
                    // InternalUmlTextual.g:557:2: ( ruleAssociation )
                    // InternalUmlTextual.g:558:3: ruleAssociation
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
                    // InternalUmlTextual.g:563:2: ( ruleAggregation )
                    {
                    // InternalUmlTextual.g:563:2: ( ruleAggregation )
                    // InternalUmlTextual.g:564:3: ruleAggregation
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
                    // InternalUmlTextual.g:569:2: ( ruleComposition )
                    {
                    // InternalUmlTextual.g:569:2: ( ruleComposition )
                    // InternalUmlTextual.g:570:3: ruleComposition
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
    // InternalUmlTextual.g:579:1: rule__Association__NameAlternatives_2_0 : ( ( RULE_ID ) | ( ruleUnamed ) );
    public final void rule__Association__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:583:1: ( ( RULE_ID ) | ( ruleUnamed ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==11) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUmlTextual.g:584:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:584:2: ( RULE_ID )
                    // InternalUmlTextual.g:585:3: RULE_ID
                    {
                     before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:590:2: ( ruleUnamed )
                    {
                    // InternalUmlTextual.g:590:2: ( ruleUnamed )
                    // InternalUmlTextual.g:591:3: ruleUnamed
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
    // InternalUmlTextual.g:600:1: rule__Aggregation__NameAlternatives_1_0 : ( ( RULE_ID ) | ( ruleUnamed ) );
    public final void rule__Aggregation__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:604:1: ( ( RULE_ID ) | ( ruleUnamed ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==11) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalUmlTextual.g:605:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:605:2: ( RULE_ID )
                    // InternalUmlTextual.g:606:3: RULE_ID
                    {
                     before(grammarAccess.getAggregationAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAggregationAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:611:2: ( ruleUnamed )
                    {
                    // InternalUmlTextual.g:611:2: ( ruleUnamed )
                    // InternalUmlTextual.g:612:3: ruleUnamed
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
    // InternalUmlTextual.g:621:1: rule__Composition__NameAlternatives_1_0 : ( ( RULE_ID ) | ( ruleUnamed ) );
    public final void rule__Composition__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:625:1: ( ( RULE_ID ) | ( ruleUnamed ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==11) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalUmlTextual.g:626:2: ( RULE_ID )
                    {
                    // InternalUmlTextual.g:626:2: ( RULE_ID )
                    // InternalUmlTextual.g:627:3: RULE_ID
                    {
                     before(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getCompositionAccess().getNameIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalUmlTextual.g:632:2: ( ruleUnamed )
                    {
                    // InternalUmlTextual.g:632:2: ( ruleUnamed )
                    // InternalUmlTextual.g:633:3: ruleUnamed
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


    // $ANTLR start "rule__Package__Group__0"
    // InternalUmlTextual.g:642:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:646:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalUmlTextual.g:647:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalUmlTextual.g:654:1: rule__Package__Group__0__Impl : ( ( rule__Package__TypeAssignment_0 ) ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:658:1: ( ( ( rule__Package__TypeAssignment_0 ) ) )
            // InternalUmlTextual.g:659:1: ( ( rule__Package__TypeAssignment_0 ) )
            {
            // InternalUmlTextual.g:659:1: ( ( rule__Package__TypeAssignment_0 ) )
            // InternalUmlTextual.g:660:2: ( rule__Package__TypeAssignment_0 )
            {
             before(grammarAccess.getPackageAccess().getTypeAssignment_0()); 
            // InternalUmlTextual.g:661:2: ( rule__Package__TypeAssignment_0 )
            // InternalUmlTextual.g:661:3: rule__Package__TypeAssignment_0
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
    // InternalUmlTextual.g:669:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:673:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalUmlTextual.g:674:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalUmlTextual.g:681:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:685:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:686:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:686:1: ( ( rule__Package__NameAssignment_1 ) )
            // InternalUmlTextual.g:687:2: ( rule__Package__NameAssignment_1 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:688:2: ( rule__Package__NameAssignment_1 )
            // InternalUmlTextual.g:688:3: rule__Package__NameAssignment_1
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
    // InternalUmlTextual.g:696:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:700:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalUmlTextual.g:701:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalUmlTextual.g:708:1: rule__Package__Group__2__Impl : ( '{' ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:712:1: ( ( '{' ) )
            // InternalUmlTextual.g:713:1: ( '{' )
            {
            // InternalUmlTextual.g:713:1: ( '{' )
            // InternalUmlTextual.g:714:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalUmlTextual.g:723:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:727:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalUmlTextual.g:728:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalUmlTextual.g:735:1: rule__Package__Group__3__Impl : ( ( rule__Package__ClassesAssignment_3 )* ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:739:1: ( ( ( rule__Package__ClassesAssignment_3 )* ) )
            // InternalUmlTextual.g:740:1: ( ( rule__Package__ClassesAssignment_3 )* )
            {
            // InternalUmlTextual.g:740:1: ( ( rule__Package__ClassesAssignment_3 )* )
            // InternalUmlTextual.g:741:2: ( rule__Package__ClassesAssignment_3 )*
            {
             before(grammarAccess.getPackageAccess().getClassesAssignment_3()); 
            // InternalUmlTextual.g:742:2: ( rule__Package__ClassesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=15 && LA10_0<=16)||(LA10_0>=24 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUmlTextual.g:742:3: rule__Package__ClassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Package__ClassesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getClassesAssignment_3()); 

            }


            }

        }
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
    // InternalUmlTextual.g:750:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:754:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalUmlTextual.g:755:2: rule__Package__Group__4__Impl rule__Package__Group__5
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
    // InternalUmlTextual.g:762:1: rule__Package__Group__4__Impl : ( ( rule__Package__AssociationsAssignment_4 )* ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:766:1: ( ( ( rule__Package__AssociationsAssignment_4 )* ) )
            // InternalUmlTextual.g:767:1: ( ( rule__Package__AssociationsAssignment_4 )* )
            {
            // InternalUmlTextual.g:767:1: ( ( rule__Package__AssociationsAssignment_4 )* )
            // InternalUmlTextual.g:768:2: ( rule__Package__AssociationsAssignment_4 )*
            {
             before(grammarAccess.getPackageAccess().getAssociationsAssignment_4()); 
            // InternalUmlTextual.g:769:2: ( rule__Package__AssociationsAssignment_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=40 && LA11_0<=41)||(LA11_0>=44 && LA11_0<=45)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUmlTextual.g:769:3: rule__Package__AssociationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Package__AssociationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getAssociationsAssignment_4()); 

            }


            }

        }
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
    // InternalUmlTextual.g:777:1: rule__Package__Group__5 : rule__Package__Group__5__Impl ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:781:1: ( rule__Package__Group__5__Impl )
            // InternalUmlTextual.g:782:2: rule__Package__Group__5__Impl
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
    // InternalUmlTextual.g:788:1: rule__Package__Group__5__Impl : ( '}' ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:792:1: ( ( '}' ) )
            // InternalUmlTextual.g:793:1: ( '}' )
            {
            // InternalUmlTextual.g:793:1: ( '}' )
            // InternalUmlTextual.g:794:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__Class__Group__0"
    // InternalUmlTextual.g:804:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:808:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalUmlTextual.g:809:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalUmlTextual.g:816:1: rule__Class__Group__0__Impl : ( ( rule__Class__Group_0__0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:820:1: ( ( ( rule__Class__Group_0__0 )? ) )
            // InternalUmlTextual.g:821:1: ( ( rule__Class__Group_0__0 )? )
            {
            // InternalUmlTextual.g:821:1: ( ( rule__Class__Group_0__0 )? )
            // InternalUmlTextual.g:822:2: ( rule__Class__Group_0__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_0()); 
            // InternalUmlTextual.g:823:2: ( rule__Class__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUmlTextual.g:823:3: rule__Class__Group_0__0
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
    // InternalUmlTextual.g:831:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:835:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalUmlTextual.g:836:2: rule__Class__Group__1__Impl rule__Class__Group__2
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
    // InternalUmlTextual.g:843:1: rule__Class__Group__1__Impl : ( ( rule__Class__VisibilityAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:847:1: ( ( ( rule__Class__VisibilityAssignment_1 )? ) )
            // InternalUmlTextual.g:848:1: ( ( rule__Class__VisibilityAssignment_1 )? )
            {
            // InternalUmlTextual.g:848:1: ( ( rule__Class__VisibilityAssignment_1 )? )
            // InternalUmlTextual.g:849:2: ( rule__Class__VisibilityAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getVisibilityAssignment_1()); 
            // InternalUmlTextual.g:850:2: ( rule__Class__VisibilityAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=15 && LA13_0<=16)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUmlTextual.g:850:3: rule__Class__VisibilityAssignment_1
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
    // InternalUmlTextual.g:858:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:862:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalUmlTextual.g:863:2: rule__Class__Group__2__Impl rule__Class__Group__3
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
    // InternalUmlTextual.g:870:1: rule__Class__Group__2__Impl : ( 'class' ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:874:1: ( ( 'class' ) )
            // InternalUmlTextual.g:875:1: ( 'class' )
            {
            // InternalUmlTextual.g:875:1: ( 'class' )
            // InternalUmlTextual.g:876:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalUmlTextual.g:885:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:889:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalUmlTextual.g:890:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalUmlTextual.g:897:1: rule__Class__Group__3__Impl : ( ( rule__Class__NameAssignment_3 ) ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:901:1: ( ( ( rule__Class__NameAssignment_3 ) ) )
            // InternalUmlTextual.g:902:1: ( ( rule__Class__NameAssignment_3 ) )
            {
            // InternalUmlTextual.g:902:1: ( ( rule__Class__NameAssignment_3 ) )
            // InternalUmlTextual.g:903:2: ( rule__Class__NameAssignment_3 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_3()); 
            // InternalUmlTextual.g:904:2: ( rule__Class__NameAssignment_3 )
            // InternalUmlTextual.g:904:3: rule__Class__NameAssignment_3
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
    // InternalUmlTextual.g:912:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:916:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalUmlTextual.g:917:2: rule__Class__Group__4__Impl rule__Class__Group__5
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
    // InternalUmlTextual.g:924:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:928:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalUmlTextual.g:929:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalUmlTextual.g:929:1: ( ( rule__Class__Group_4__0 )? )
            // InternalUmlTextual.g:930:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalUmlTextual.g:931:2: ( rule__Class__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUmlTextual.g:931:3: rule__Class__Group_4__0
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
    // InternalUmlTextual.g:939:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:943:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalUmlTextual.g:944:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalUmlTextual.g:951:1: rule__Class__Group__5__Impl : ( '{' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:955:1: ( ( '{' ) )
            // InternalUmlTextual.g:956:1: ( '{' )
            {
            // InternalUmlTextual.g:956:1: ( '{' )
            // InternalUmlTextual.g:957:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalUmlTextual.g:966:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:970:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalUmlTextual.g:971:2: rule__Class__Group__6__Impl rule__Class__Group__7
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
    // InternalUmlTextual.g:978:1: rule__Class__Group__6__Impl : ( ( rule__Class__AttributesAssignment_6 )* ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:982:1: ( ( ( rule__Class__AttributesAssignment_6 )* ) )
            // InternalUmlTextual.g:983:1: ( ( rule__Class__AttributesAssignment_6 )* )
            {
            // InternalUmlTextual.g:983:1: ( ( rule__Class__AttributesAssignment_6 )* )
            // InternalUmlTextual.g:984:2: ( rule__Class__AttributesAssignment_6 )*
            {
             before(grammarAccess.getClassAccess().getAttributesAssignment_6()); 
            // InternalUmlTextual.g:985:2: ( rule__Class__AttributesAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=15 && LA15_0<=16)||LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUmlTextual.g:985:3: rule__Class__AttributesAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Class__AttributesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getAttributesAssignment_6()); 

            }


            }

        }
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
    // InternalUmlTextual.g:993:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:997:1: ( rule__Class__Group__7__Impl )
            // InternalUmlTextual.g:998:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalUmlTextual.g:1004:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1008:1: ( ( '}' ) )
            // InternalUmlTextual.g:1009:1: ( '}' )
            {
            // InternalUmlTextual.g:1009:1: ( '}' )
            // InternalUmlTextual.g:1010:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__Group_0__0"
    // InternalUmlTextual.g:1020:1: rule__Class__Group_0__0 : rule__Class__Group_0__0__Impl rule__Class__Group_0__1 ;
    public final void rule__Class__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1024:1: ( rule__Class__Group_0__0__Impl rule__Class__Group_0__1 )
            // InternalUmlTextual.g:1025:2: rule__Class__Group_0__0__Impl rule__Class__Group_0__1
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
    // InternalUmlTextual.g:1032:1: rule__Class__Group_0__0__Impl : ( '@' ) ;
    public final void rule__Class__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1036:1: ( ( '@' ) )
            // InternalUmlTextual.g:1037:1: ( '@' )
            {
            // InternalUmlTextual.g:1037:1: ( '@' )
            // InternalUmlTextual.g:1038:2: '@'
            {
             before(grammarAccess.getClassAccess().getCommercialAtKeyword_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalUmlTextual.g:1047:1: rule__Class__Group_0__1 : rule__Class__Group_0__1__Impl ;
    public final void rule__Class__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1051:1: ( rule__Class__Group_0__1__Impl )
            // InternalUmlTextual.g:1052:2: rule__Class__Group_0__1__Impl
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
    // InternalUmlTextual.g:1058:1: rule__Class__Group_0__1__Impl : ( ( rule__Class__StereotypeAssignment_0_1 ) ) ;
    public final void rule__Class__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1062:1: ( ( ( rule__Class__StereotypeAssignment_0_1 ) ) )
            // InternalUmlTextual.g:1063:1: ( ( rule__Class__StereotypeAssignment_0_1 ) )
            {
            // InternalUmlTextual.g:1063:1: ( ( rule__Class__StereotypeAssignment_0_1 ) )
            // InternalUmlTextual.g:1064:2: ( rule__Class__StereotypeAssignment_0_1 )
            {
             before(grammarAccess.getClassAccess().getStereotypeAssignment_0_1()); 
            // InternalUmlTextual.g:1065:2: ( rule__Class__StereotypeAssignment_0_1 )
            // InternalUmlTextual.g:1065:3: rule__Class__StereotypeAssignment_0_1
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
    // InternalUmlTextual.g:1074:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1078:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalUmlTextual.g:1079:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalUmlTextual.g:1086:1: rule__Class__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1090:1: ( ( 'extends' ) )
            // InternalUmlTextual.g:1091:1: ( 'extends' )
            {
            // InternalUmlTextual.g:1091:1: ( 'extends' )
            // InternalUmlTextual.g:1092:2: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalUmlTextual.g:1101:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1105:1: ( rule__Class__Group_4__1__Impl )
            // InternalUmlTextual.g:1106:2: rule__Class__Group_4__1__Impl
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
    // InternalUmlTextual.g:1112:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__ParentClassAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1116:1: ( ( ( rule__Class__ParentClassAssignment_4_1 ) ) )
            // InternalUmlTextual.g:1117:1: ( ( rule__Class__ParentClassAssignment_4_1 ) )
            {
            // InternalUmlTextual.g:1117:1: ( ( rule__Class__ParentClassAssignment_4_1 ) )
            // InternalUmlTextual.g:1118:2: ( rule__Class__ParentClassAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getParentClassAssignment_4_1()); 
            // InternalUmlTextual.g:1119:2: ( rule__Class__ParentClassAssignment_4_1 )
            // InternalUmlTextual.g:1119:3: rule__Class__ParentClassAssignment_4_1
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


    // $ANTLR start "rule__AttributeType__Group_0__0"
    // InternalUmlTextual.g:1128:1: rule__AttributeType__Group_0__0 : rule__AttributeType__Group_0__0__Impl rule__AttributeType__Group_0__1 ;
    public final void rule__AttributeType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1132:1: ( rule__AttributeType__Group_0__0__Impl rule__AttributeType__Group_0__1 )
            // InternalUmlTextual.g:1133:2: rule__AttributeType__Group_0__0__Impl rule__AttributeType__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__AttributeType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_0__0"


    // $ANTLR start "rule__AttributeType__Group_0__0__Impl"
    // InternalUmlTextual.g:1140:1: rule__AttributeType__Group_0__0__Impl : ( () ) ;
    public final void rule__AttributeType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1144:1: ( ( () ) )
            // InternalUmlTextual.g:1145:1: ( () )
            {
            // InternalUmlTextual.g:1145:1: ( () )
            // InternalUmlTextual.g:1146:2: ()
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_0_0()); 
            // InternalUmlTextual.g:1147:2: ()
            // InternalUmlTextual.g:1147:3: 
            {
            }

             after(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_0__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_0__1"
    // InternalUmlTextual.g:1155:1: rule__AttributeType__Group_0__1 : rule__AttributeType__Group_0__1__Impl ;
    public final void rule__AttributeType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1159:1: ( rule__AttributeType__Group_0__1__Impl )
            // InternalUmlTextual.g:1160:2: rule__AttributeType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_0__1"


    // $ANTLR start "rule__AttributeType__Group_0__1__Impl"
    // InternalUmlTextual.g:1166:1: rule__AttributeType__Group_0__1__Impl : ( 'string' ) ;
    public final void rule__AttributeType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1170:1: ( ( 'string' ) )
            // InternalUmlTextual.g:1171:1: ( 'string' )
            {
            // InternalUmlTextual.g:1171:1: ( 'string' )
            // InternalUmlTextual.g:1172:2: 'string'
            {
             before(grammarAccess.getAttributeTypeAccess().getStringKeyword_0_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getStringKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_0__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__0"
    // InternalUmlTextual.g:1182:1: rule__AttributeType__Group_1__0 : rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1 ;
    public final void rule__AttributeType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1186:1: ( rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1 )
            // InternalUmlTextual.g:1187:2: rule__AttributeType__Group_1__0__Impl rule__AttributeType__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__AttributeType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__0"


    // $ANTLR start "rule__AttributeType__Group_1__0__Impl"
    // InternalUmlTextual.g:1194:1: rule__AttributeType__Group_1__0__Impl : ( () ) ;
    public final void rule__AttributeType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1198:1: ( ( () ) )
            // InternalUmlTextual.g:1199:1: ( () )
            {
            // InternalUmlTextual.g:1199:1: ( () )
            // InternalUmlTextual.g:1200:2: ()
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_1_0()); 
            // InternalUmlTextual.g:1201:2: ()
            // InternalUmlTextual.g:1201:3: 
            {
            }

             after(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_1__1"
    // InternalUmlTextual.g:1209:1: rule__AttributeType__Group_1__1 : rule__AttributeType__Group_1__1__Impl ;
    public final void rule__AttributeType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1213:1: ( rule__AttributeType__Group_1__1__Impl )
            // InternalUmlTextual.g:1214:2: rule__AttributeType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__1"


    // $ANTLR start "rule__AttributeType__Group_1__1__Impl"
    // InternalUmlTextual.g:1220:1: rule__AttributeType__Group_1__1__Impl : ( 'int' ) ;
    public final void rule__AttributeType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1224:1: ( ( 'int' ) )
            // InternalUmlTextual.g:1225:1: ( 'int' )
            {
            // InternalUmlTextual.g:1225:1: ( 'int' )
            // InternalUmlTextual.g:1226:2: 'int'
            {
             before(grammarAccess.getAttributeTypeAccess().getIntKeyword_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getIntKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_2__0"
    // InternalUmlTextual.g:1236:1: rule__AttributeType__Group_2__0 : rule__AttributeType__Group_2__0__Impl rule__AttributeType__Group_2__1 ;
    public final void rule__AttributeType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1240:1: ( rule__AttributeType__Group_2__0__Impl rule__AttributeType__Group_2__1 )
            // InternalUmlTextual.g:1241:2: rule__AttributeType__Group_2__0__Impl rule__AttributeType__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__AttributeType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_2__0"


    // $ANTLR start "rule__AttributeType__Group_2__0__Impl"
    // InternalUmlTextual.g:1248:1: rule__AttributeType__Group_2__0__Impl : ( () ) ;
    public final void rule__AttributeType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1252:1: ( ( () ) )
            // InternalUmlTextual.g:1253:1: ( () )
            {
            // InternalUmlTextual.g:1253:1: ( () )
            // InternalUmlTextual.g:1254:2: ()
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_2_0()); 
            // InternalUmlTextual.g:1255:2: ()
            // InternalUmlTextual.g:1255:3: 
            {
            }

             after(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_2__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_2__1"
    // InternalUmlTextual.g:1263:1: rule__AttributeType__Group_2__1 : rule__AttributeType__Group_2__1__Impl ;
    public final void rule__AttributeType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1267:1: ( rule__AttributeType__Group_2__1__Impl )
            // InternalUmlTextual.g:1268:2: rule__AttributeType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_2__1"


    // $ANTLR start "rule__AttributeType__Group_2__1__Impl"
    // InternalUmlTextual.g:1274:1: rule__AttributeType__Group_2__1__Impl : ( 'double' ) ;
    public final void rule__AttributeType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1278:1: ( ( 'double' ) )
            // InternalUmlTextual.g:1279:1: ( 'double' )
            {
            // InternalUmlTextual.g:1279:1: ( 'double' )
            // InternalUmlTextual.g:1280:2: 'double'
            {
             before(grammarAccess.getAttributeTypeAccess().getDoubleKeyword_2_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getDoubleKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_2__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_3__0"
    // InternalUmlTextual.g:1290:1: rule__AttributeType__Group_3__0 : rule__AttributeType__Group_3__0__Impl rule__AttributeType__Group_3__1 ;
    public final void rule__AttributeType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1294:1: ( rule__AttributeType__Group_3__0__Impl rule__AttributeType__Group_3__1 )
            // InternalUmlTextual.g:1295:2: rule__AttributeType__Group_3__0__Impl rule__AttributeType__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__AttributeType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_3__0"


    // $ANTLR start "rule__AttributeType__Group_3__0__Impl"
    // InternalUmlTextual.g:1302:1: rule__AttributeType__Group_3__0__Impl : ( () ) ;
    public final void rule__AttributeType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1306:1: ( ( () ) )
            // InternalUmlTextual.g:1307:1: ( () )
            {
            // InternalUmlTextual.g:1307:1: ( () )
            // InternalUmlTextual.g:1308:2: ()
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_3_0()); 
            // InternalUmlTextual.g:1309:2: ()
            // InternalUmlTextual.g:1309:3: 
            {
            }

             after(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_3__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_3__1"
    // InternalUmlTextual.g:1317:1: rule__AttributeType__Group_3__1 : rule__AttributeType__Group_3__1__Impl ;
    public final void rule__AttributeType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1321:1: ( rule__AttributeType__Group_3__1__Impl )
            // InternalUmlTextual.g:1322:2: rule__AttributeType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_3__1"


    // $ANTLR start "rule__AttributeType__Group_3__1__Impl"
    // InternalUmlTextual.g:1328:1: rule__AttributeType__Group_3__1__Impl : ( 'boolean' ) ;
    public final void rule__AttributeType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1332:1: ( ( 'boolean' ) )
            // InternalUmlTextual.g:1333:1: ( 'boolean' )
            {
            // InternalUmlTextual.g:1333:1: ( 'boolean' )
            // InternalUmlTextual.g:1334:2: 'boolean'
            {
             before(grammarAccess.getAttributeTypeAccess().getBooleanKeyword_3_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getBooleanKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_3__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_4__0"
    // InternalUmlTextual.g:1344:1: rule__AttributeType__Group_4__0 : rule__AttributeType__Group_4__0__Impl rule__AttributeType__Group_4__1 ;
    public final void rule__AttributeType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1348:1: ( rule__AttributeType__Group_4__0__Impl rule__AttributeType__Group_4__1 )
            // InternalUmlTextual.g:1349:2: rule__AttributeType__Group_4__0__Impl rule__AttributeType__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__AttributeType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_4__0"


    // $ANTLR start "rule__AttributeType__Group_4__0__Impl"
    // InternalUmlTextual.g:1356:1: rule__AttributeType__Group_4__0__Impl : ( () ) ;
    public final void rule__AttributeType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1360:1: ( ( () ) )
            // InternalUmlTextual.g:1361:1: ( () )
            {
            // InternalUmlTextual.g:1361:1: ( () )
            // InternalUmlTextual.g:1362:2: ()
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_4_0()); 
            // InternalUmlTextual.g:1363:2: ()
            // InternalUmlTextual.g:1363:3: 
            {
            }

             after(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_4__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_4__1"
    // InternalUmlTextual.g:1371:1: rule__AttributeType__Group_4__1 : rule__AttributeType__Group_4__1__Impl ;
    public final void rule__AttributeType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1375:1: ( rule__AttributeType__Group_4__1__Impl )
            // InternalUmlTextual.g:1376:2: rule__AttributeType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_4__1"


    // $ANTLR start "rule__AttributeType__Group_4__1__Impl"
    // InternalUmlTextual.g:1382:1: rule__AttributeType__Group_4__1__Impl : ( 'byte' ) ;
    public final void rule__AttributeType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1386:1: ( ( 'byte' ) )
            // InternalUmlTextual.g:1387:1: ( 'byte' )
            {
            // InternalUmlTextual.g:1387:1: ( 'byte' )
            // InternalUmlTextual.g:1388:2: 'byte'
            {
             before(grammarAccess.getAttributeTypeAccess().getByteKeyword_4_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getByteKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_4__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_5__0"
    // InternalUmlTextual.g:1398:1: rule__AttributeType__Group_5__0 : rule__AttributeType__Group_5__0__Impl rule__AttributeType__Group_5__1 ;
    public final void rule__AttributeType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1402:1: ( rule__AttributeType__Group_5__0__Impl rule__AttributeType__Group_5__1 )
            // InternalUmlTextual.g:1403:2: rule__AttributeType__Group_5__0__Impl rule__AttributeType__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__AttributeType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_5__0"


    // $ANTLR start "rule__AttributeType__Group_5__0__Impl"
    // InternalUmlTextual.g:1410:1: rule__AttributeType__Group_5__0__Impl : ( () ) ;
    public final void rule__AttributeType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1414:1: ( ( () ) )
            // InternalUmlTextual.g:1415:1: ( () )
            {
            // InternalUmlTextual.g:1415:1: ( () )
            // InternalUmlTextual.g:1416:2: ()
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_5_0()); 
            // InternalUmlTextual.g:1417:2: ()
            // InternalUmlTextual.g:1417:3: 
            {
            }

             after(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_5__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_5__1"
    // InternalUmlTextual.g:1425:1: rule__AttributeType__Group_5__1 : rule__AttributeType__Group_5__1__Impl ;
    public final void rule__AttributeType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1429:1: ( rule__AttributeType__Group_5__1__Impl )
            // InternalUmlTextual.g:1430:2: rule__AttributeType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_5__1"


    // $ANTLR start "rule__AttributeType__Group_5__1__Impl"
    // InternalUmlTextual.g:1436:1: rule__AttributeType__Group_5__1__Impl : ( 'char' ) ;
    public final void rule__AttributeType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1440:1: ( ( 'char' ) )
            // InternalUmlTextual.g:1441:1: ( 'char' )
            {
            // InternalUmlTextual.g:1441:1: ( 'char' )
            // InternalUmlTextual.g:1442:2: 'char'
            {
             before(grammarAccess.getAttributeTypeAccess().getCharKeyword_5_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getCharKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_5__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_6__0"
    // InternalUmlTextual.g:1452:1: rule__AttributeType__Group_6__0 : rule__AttributeType__Group_6__0__Impl rule__AttributeType__Group_6__1 ;
    public final void rule__AttributeType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1456:1: ( rule__AttributeType__Group_6__0__Impl rule__AttributeType__Group_6__1 )
            // InternalUmlTextual.g:1457:2: rule__AttributeType__Group_6__0__Impl rule__AttributeType__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__AttributeType__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_6__0"


    // $ANTLR start "rule__AttributeType__Group_6__0__Impl"
    // InternalUmlTextual.g:1464:1: rule__AttributeType__Group_6__0__Impl : ( () ) ;
    public final void rule__AttributeType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1468:1: ( ( () ) )
            // InternalUmlTextual.g:1469:1: ( () )
            {
            // InternalUmlTextual.g:1469:1: ( () )
            // InternalUmlTextual.g:1470:2: ()
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_6_0()); 
            // InternalUmlTextual.g:1471:2: ()
            // InternalUmlTextual.g:1471:3: 
            {
            }

             after(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_6__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_6__1"
    // InternalUmlTextual.g:1479:1: rule__AttributeType__Group_6__1 : rule__AttributeType__Group_6__1__Impl ;
    public final void rule__AttributeType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1483:1: ( rule__AttributeType__Group_6__1__Impl )
            // InternalUmlTextual.g:1484:2: rule__AttributeType__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_6__1"


    // $ANTLR start "rule__AttributeType__Group_6__1__Impl"
    // InternalUmlTextual.g:1490:1: rule__AttributeType__Group_6__1__Impl : ( 'float' ) ;
    public final void rule__AttributeType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1494:1: ( ( 'float' ) )
            // InternalUmlTextual.g:1495:1: ( 'float' )
            {
            // InternalUmlTextual.g:1495:1: ( 'float' )
            // InternalUmlTextual.g:1496:2: 'float'
            {
             before(grammarAccess.getAttributeTypeAccess().getFloatKeyword_6_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getFloatKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_6__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_7__0"
    // InternalUmlTextual.g:1506:1: rule__AttributeType__Group_7__0 : rule__AttributeType__Group_7__0__Impl rule__AttributeType__Group_7__1 ;
    public final void rule__AttributeType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1510:1: ( rule__AttributeType__Group_7__0__Impl rule__AttributeType__Group_7__1 )
            // InternalUmlTextual.g:1511:2: rule__AttributeType__Group_7__0__Impl rule__AttributeType__Group_7__1
            {
            pushFollow(FOLLOW_20);
            rule__AttributeType__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_7__0"


    // $ANTLR start "rule__AttributeType__Group_7__0__Impl"
    // InternalUmlTextual.g:1518:1: rule__AttributeType__Group_7__0__Impl : ( () ) ;
    public final void rule__AttributeType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1522:1: ( ( () ) )
            // InternalUmlTextual.g:1523:1: ( () )
            {
            // InternalUmlTextual.g:1523:1: ( () )
            // InternalUmlTextual.g:1524:2: ()
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_7_0()); 
            // InternalUmlTextual.g:1525:2: ()
            // InternalUmlTextual.g:1525:3: 
            {
            }

             after(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_7__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_7__1"
    // InternalUmlTextual.g:1533:1: rule__AttributeType__Group_7__1 : rule__AttributeType__Group_7__1__Impl ;
    public final void rule__AttributeType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1537:1: ( rule__AttributeType__Group_7__1__Impl )
            // InternalUmlTextual.g:1538:2: rule__AttributeType__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_7__1"


    // $ANTLR start "rule__AttributeType__Group_7__1__Impl"
    // InternalUmlTextual.g:1544:1: rule__AttributeType__Group_7__1__Impl : ( 'short' ) ;
    public final void rule__AttributeType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1548:1: ( ( 'short' ) )
            // InternalUmlTextual.g:1549:1: ( 'short' )
            {
            // InternalUmlTextual.g:1549:1: ( 'short' )
            // InternalUmlTextual.g:1550:2: 'short'
            {
             before(grammarAccess.getAttributeTypeAccess().getShortKeyword_7_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getShortKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_7__1__Impl"


    // $ANTLR start "rule__AttributeType__Group_8__0"
    // InternalUmlTextual.g:1560:1: rule__AttributeType__Group_8__0 : rule__AttributeType__Group_8__0__Impl rule__AttributeType__Group_8__1 ;
    public final void rule__AttributeType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1564:1: ( rule__AttributeType__Group_8__0__Impl rule__AttributeType__Group_8__1 )
            // InternalUmlTextual.g:1565:2: rule__AttributeType__Group_8__0__Impl rule__AttributeType__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__AttributeType__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_8__0"


    // $ANTLR start "rule__AttributeType__Group_8__0__Impl"
    // InternalUmlTextual.g:1572:1: rule__AttributeType__Group_8__0__Impl : ( () ) ;
    public final void rule__AttributeType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1576:1: ( ( () ) )
            // InternalUmlTextual.g:1577:1: ( () )
            {
            // InternalUmlTextual.g:1577:1: ( () )
            // InternalUmlTextual.g:1578:2: ()
            {
             before(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_8_0()); 
            // InternalUmlTextual.g:1579:2: ()
            // InternalUmlTextual.g:1579:3: 
            {
            }

             after(grammarAccess.getAttributeTypeAccess().getAttributeTypeAction_8_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_8__0__Impl"


    // $ANTLR start "rule__AttributeType__Group_8__1"
    // InternalUmlTextual.g:1587:1: rule__AttributeType__Group_8__1 : rule__AttributeType__Group_8__1__Impl ;
    public final void rule__AttributeType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1591:1: ( rule__AttributeType__Group_8__1__Impl )
            // InternalUmlTextual.g:1592:2: rule__AttributeType__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeType__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_8__1"


    // $ANTLR start "rule__AttributeType__Group_8__1__Impl"
    // InternalUmlTextual.g:1598:1: rule__AttributeType__Group_8__1__Impl : ( 'long' ) ;
    public final void rule__AttributeType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1602:1: ( ( 'long' ) )
            // InternalUmlTextual.g:1603:1: ( 'long' )
            {
            // InternalUmlTextual.g:1603:1: ( 'long' )
            // InternalUmlTextual.g:1604:2: 'long'
            {
             before(grammarAccess.getAttributeTypeAccess().getLongKeyword_8_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAttributeTypeAccess().getLongKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Group_8__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalUmlTextual.g:1614:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1618:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalUmlTextual.g:1619:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalUmlTextual.g:1626:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__VisibilityAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1630:1: ( ( ( rule__Attribute__VisibilityAssignment_0 )? ) )
            // InternalUmlTextual.g:1631:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            {
            // InternalUmlTextual.g:1631:1: ( ( rule__Attribute__VisibilityAssignment_0 )? )
            // InternalUmlTextual.g:1632:2: ( rule__Attribute__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getVisibilityAssignment_0()); 
            // InternalUmlTextual.g:1633:2: ( rule__Attribute__VisibilityAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=15 && LA16_0<=16)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalUmlTextual.g:1633:3: rule__Attribute__VisibilityAssignment_0
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
    // InternalUmlTextual.g:1641:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1645:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalUmlTextual.g:1646:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalUmlTextual.g:1653:1: rule__Attribute__Group__1__Impl : ( 'attr' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1657:1: ( ( 'attr' ) )
            // InternalUmlTextual.g:1658:1: ( 'attr' )
            {
            // InternalUmlTextual.g:1658:1: ( 'attr' )
            // InternalUmlTextual.g:1659:2: 'attr'
            {
             before(grammarAccess.getAttributeAccess().getAttrKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalUmlTextual.g:1668:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1672:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalUmlTextual.g:1673:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalUmlTextual.g:1680:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__NameAssignment_2 ) ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1684:1: ( ( ( rule__Attribute__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:1685:1: ( ( rule__Attribute__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:1685:1: ( ( rule__Attribute__NameAssignment_2 ) )
            // InternalUmlTextual.g:1686:2: ( rule__Attribute__NameAssignment_2 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:1687:2: ( rule__Attribute__NameAssignment_2 )
            // InternalUmlTextual.g:1687:3: rule__Attribute__NameAssignment_2
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
    // InternalUmlTextual.g:1695:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1699:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalUmlTextual.g:1700:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalUmlTextual.g:1707:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1711:1: ( ( ':' ) )
            // InternalUmlTextual.g:1712:1: ( ':' )
            {
            // InternalUmlTextual.g:1712:1: ( ':' )
            // InternalUmlTextual.g:1713:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalUmlTextual.g:1722:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1726:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalUmlTextual.g:1727:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalUmlTextual.g:1734:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1738:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalUmlTextual.g:1739:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalUmlTextual.g:1739:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalUmlTextual.g:1740:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalUmlTextual.g:1741:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalUmlTextual.g:1741:3: rule__Attribute__TypeAssignment_4
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
    // InternalUmlTextual.g:1749:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1753:1: ( rule__Attribute__Group__5__Impl )
            // InternalUmlTextual.g:1754:2: rule__Attribute__Group__5__Impl
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
    // InternalUmlTextual.g:1760:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1764:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // InternalUmlTextual.g:1765:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // InternalUmlTextual.g:1765:1: ( ( rule__Attribute__Group_5__0 )? )
            // InternalUmlTextual.g:1766:2: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // InternalUmlTextual.g:1767:2: ( rule__Attribute__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUmlTextual.g:1767:3: rule__Attribute__Group_5__0
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
    // InternalUmlTextual.g:1776:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1780:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // InternalUmlTextual.g:1781:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalUmlTextual.g:1788:1: rule__Attribute__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1792:1: ( ( '[' ) )
            // InternalUmlTextual.g:1793:1: ( '[' )
            {
            // InternalUmlTextual.g:1793:1: ( '[' )
            // InternalUmlTextual.g:1794:2: '['
            {
             before(grammarAccess.getAttributeAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUmlTextual.g:1803:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1807:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // InternalUmlTextual.g:1808:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalUmlTextual.g:1815:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__MultiplicityAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1819:1: ( ( ( rule__Attribute__MultiplicityAssignment_5_1 ) ) )
            // InternalUmlTextual.g:1820:1: ( ( rule__Attribute__MultiplicityAssignment_5_1 ) )
            {
            // InternalUmlTextual.g:1820:1: ( ( rule__Attribute__MultiplicityAssignment_5_1 ) )
            // InternalUmlTextual.g:1821:2: ( rule__Attribute__MultiplicityAssignment_5_1 )
            {
             before(grammarAccess.getAttributeAccess().getMultiplicityAssignment_5_1()); 
            // InternalUmlTextual.g:1822:2: ( rule__Attribute__MultiplicityAssignment_5_1 )
            // InternalUmlTextual.g:1822:3: rule__Attribute__MultiplicityAssignment_5_1
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
    // InternalUmlTextual.g:1830:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1834:1: ( rule__Attribute__Group_5__2__Impl )
            // InternalUmlTextual.g:1835:2: rule__Attribute__Group_5__2__Impl
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
    // InternalUmlTextual.g:1841:1: rule__Attribute__Group_5__2__Impl : ( ']' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1845:1: ( ( ']' ) )
            // InternalUmlTextual.g:1846:1: ( ']' )
            {
            // InternalUmlTextual.g:1846:1: ( ']' )
            // InternalUmlTextual.g:1847:2: ']'
            {
             before(grammarAccess.getAttributeAccess().getRightSquareBracketKeyword_5_2()); 
            match(input,39,FOLLOW_2); 
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


    // $ANTLR start "rule__Association__Group__0"
    // InternalUmlTextual.g:1857:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1861:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalUmlTextual.g:1862:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalUmlTextual.g:1869:1: rule__Association__Group__0__Impl : ( ( 'undirected' )? ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1873:1: ( ( ( 'undirected' )? ) )
            // InternalUmlTextual.g:1874:1: ( ( 'undirected' )? )
            {
            // InternalUmlTextual.g:1874:1: ( ( 'undirected' )? )
            // InternalUmlTextual.g:1875:2: ( 'undirected' )?
            {
             before(grammarAccess.getAssociationAccess().getUndirectedKeyword_0()); 
            // InternalUmlTextual.g:1876:2: ( 'undirected' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==40) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUmlTextual.g:1876:3: 'undirected'
                    {
                    match(input,40,FOLLOW_2); 

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
    // InternalUmlTextual.g:1884:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1888:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalUmlTextual.g:1889:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:1896:1: rule__Association__Group__1__Impl : ( 'association' ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1900:1: ( ( 'association' ) )
            // InternalUmlTextual.g:1901:1: ( 'association' )
            {
            // InternalUmlTextual.g:1901:1: ( 'association' )
            // InternalUmlTextual.g:1902:2: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalUmlTextual.g:1911:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1915:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalUmlTextual.g:1916:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:1923:1: rule__Association__Group__2__Impl : ( ( rule__Association__NameAssignment_2 ) ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1927:1: ( ( ( rule__Association__NameAssignment_2 ) ) )
            // InternalUmlTextual.g:1928:1: ( ( rule__Association__NameAssignment_2 ) )
            {
            // InternalUmlTextual.g:1928:1: ( ( rule__Association__NameAssignment_2 ) )
            // InternalUmlTextual.g:1929:2: ( rule__Association__NameAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_2()); 
            // InternalUmlTextual.g:1930:2: ( rule__Association__NameAssignment_2 )
            // InternalUmlTextual.g:1930:3: rule__Association__NameAssignment_2
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
    // InternalUmlTextual.g:1938:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1942:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalUmlTextual.g:1943:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:1950:1: rule__Association__Group__3__Impl : ( '{' ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1954:1: ( ( '{' ) )
            // InternalUmlTextual.g:1955:1: ( '{' )
            {
            // InternalUmlTextual.g:1955:1: ( '{' )
            // InternalUmlTextual.g:1956:2: '{'
            {
             before(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUmlTextual.g:1965:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1969:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalUmlTextual.g:1970:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:1977:1: rule__Association__Group__4__Impl : ( 'from' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1981:1: ( ( 'from' ) )
            // InternalUmlTextual.g:1982:1: ( 'from' )
            {
            // InternalUmlTextual.g:1982:1: ( 'from' )
            // InternalUmlTextual.g:1983:2: 'from'
            {
             before(grammarAccess.getAssociationAccess().getFromKeyword_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:1992:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:1996:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalUmlTextual.g:1997:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:2004:1: rule__Association__Group__5__Impl : ( ( rule__Association__Navigation1Assignment_5 )? ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2008:1: ( ( ( rule__Association__Navigation1Assignment_5 )? ) )
            // InternalUmlTextual.g:2009:1: ( ( rule__Association__Navigation1Assignment_5 )? )
            {
            // InternalUmlTextual.g:2009:1: ( ( rule__Association__Navigation1Assignment_5 )? )
            // InternalUmlTextual.g:2010:2: ( rule__Association__Navigation1Assignment_5 )?
            {
             before(grammarAccess.getAssociationAccess().getNavigation1Assignment_5()); 
            // InternalUmlTextual.g:2011:2: ( rule__Association__Navigation1Assignment_5 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUmlTextual.g:2011:3: rule__Association__Navigation1Assignment_5
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
    // InternalUmlTextual.g:2019:1: rule__Association__Group__6 : rule__Association__Group__6__Impl rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2023:1: ( rule__Association__Group__6__Impl rule__Association__Group__7 )
            // InternalUmlTextual.g:2024:2: rule__Association__Group__6__Impl rule__Association__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalUmlTextual.g:2031:1: rule__Association__Group__6__Impl : ( ( rule__Association__Class1Assignment_6 ) ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2035:1: ( ( ( rule__Association__Class1Assignment_6 ) ) )
            // InternalUmlTextual.g:2036:1: ( ( rule__Association__Class1Assignment_6 ) )
            {
            // InternalUmlTextual.g:2036:1: ( ( rule__Association__Class1Assignment_6 ) )
            // InternalUmlTextual.g:2037:2: ( rule__Association__Class1Assignment_6 )
            {
             before(grammarAccess.getAssociationAccess().getClass1Assignment_6()); 
            // InternalUmlTextual.g:2038:2: ( rule__Association__Class1Assignment_6 )
            // InternalUmlTextual.g:2038:3: rule__Association__Class1Assignment_6
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
    // InternalUmlTextual.g:2046:1: rule__Association__Group__7 : rule__Association__Group__7__Impl rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2050:1: ( rule__Association__Group__7__Impl rule__Association__Group__8 )
            // InternalUmlTextual.g:2051:2: rule__Association__Group__7__Impl rule__Association__Group__8
            {
            pushFollow(FOLLOW_26);
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
    // InternalUmlTextual.g:2058:1: rule__Association__Group__7__Impl : ( '[' ) ;
    public final void rule__Association__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2062:1: ( ( '[' ) )
            // InternalUmlTextual.g:2063:1: ( '[' )
            {
            // InternalUmlTextual.g:2063:1: ( '[' )
            // InternalUmlTextual.g:2064:2: '['
            {
             before(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_7()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUmlTextual.g:2073:1: rule__Association__Group__8 : rule__Association__Group__8__Impl rule__Association__Group__9 ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2077:1: ( rule__Association__Group__8__Impl rule__Association__Group__9 )
            // InternalUmlTextual.g:2078:2: rule__Association__Group__8__Impl rule__Association__Group__9
            {
            pushFollow(FOLLOW_27);
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
    // InternalUmlTextual.g:2085:1: rule__Association__Group__8__Impl : ( ( rule__Association__Multiplicity1Assignment_8 ) ) ;
    public final void rule__Association__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2089:1: ( ( ( rule__Association__Multiplicity1Assignment_8 ) ) )
            // InternalUmlTextual.g:2090:1: ( ( rule__Association__Multiplicity1Assignment_8 ) )
            {
            // InternalUmlTextual.g:2090:1: ( ( rule__Association__Multiplicity1Assignment_8 ) )
            // InternalUmlTextual.g:2091:2: ( rule__Association__Multiplicity1Assignment_8 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicity1Assignment_8()); 
            // InternalUmlTextual.g:2092:2: ( rule__Association__Multiplicity1Assignment_8 )
            // InternalUmlTextual.g:2092:3: rule__Association__Multiplicity1Assignment_8
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
    // InternalUmlTextual.g:2100:1: rule__Association__Group__9 : rule__Association__Group__9__Impl rule__Association__Group__10 ;
    public final void rule__Association__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2104:1: ( rule__Association__Group__9__Impl rule__Association__Group__10 )
            // InternalUmlTextual.g:2105:2: rule__Association__Group__9__Impl rule__Association__Group__10
            {
            pushFollow(FOLLOW_32);
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
    // InternalUmlTextual.g:2112:1: rule__Association__Group__9__Impl : ( ']' ) ;
    public final void rule__Association__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2116:1: ( ( ']' ) )
            // InternalUmlTextual.g:2117:1: ( ']' )
            {
            // InternalUmlTextual.g:2117:1: ( ']' )
            // InternalUmlTextual.g:2118:2: ']'
            {
             before(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_9()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUmlTextual.g:2127:1: rule__Association__Group__10 : rule__Association__Group__10__Impl rule__Association__Group__11 ;
    public final void rule__Association__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2131:1: ( rule__Association__Group__10__Impl rule__Association__Group__11 )
            // InternalUmlTextual.g:2132:2: rule__Association__Group__10__Impl rule__Association__Group__11
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:2139:1: rule__Association__Group__10__Impl : ( 'to' ) ;
    public final void rule__Association__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2143:1: ( ( 'to' ) )
            // InternalUmlTextual.g:2144:1: ( 'to' )
            {
            // InternalUmlTextual.g:2144:1: ( 'to' )
            // InternalUmlTextual.g:2145:2: 'to'
            {
             before(grammarAccess.getAssociationAccess().getToKeyword_10()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:2154:1: rule__Association__Group__11 : rule__Association__Group__11__Impl rule__Association__Group__12 ;
    public final void rule__Association__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2158:1: ( rule__Association__Group__11__Impl rule__Association__Group__12 )
            // InternalUmlTextual.g:2159:2: rule__Association__Group__11__Impl rule__Association__Group__12
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:2166:1: rule__Association__Group__11__Impl : ( ( rule__Association__Navigation2Assignment_11 )? ) ;
    public final void rule__Association__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2170:1: ( ( ( rule__Association__Navigation2Assignment_11 )? ) )
            // InternalUmlTextual.g:2171:1: ( ( rule__Association__Navigation2Assignment_11 )? )
            {
            // InternalUmlTextual.g:2171:1: ( ( rule__Association__Navigation2Assignment_11 )? )
            // InternalUmlTextual.g:2172:2: ( rule__Association__Navigation2Assignment_11 )?
            {
             before(grammarAccess.getAssociationAccess().getNavigation2Assignment_11()); 
            // InternalUmlTextual.g:2173:2: ( rule__Association__Navigation2Assignment_11 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUmlTextual.g:2173:3: rule__Association__Navigation2Assignment_11
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
    // InternalUmlTextual.g:2181:1: rule__Association__Group__12 : rule__Association__Group__12__Impl rule__Association__Group__13 ;
    public final void rule__Association__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2185:1: ( rule__Association__Group__12__Impl rule__Association__Group__13 )
            // InternalUmlTextual.g:2186:2: rule__Association__Group__12__Impl rule__Association__Group__13
            {
            pushFollow(FOLLOW_25);
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
    // InternalUmlTextual.g:2193:1: rule__Association__Group__12__Impl : ( ( rule__Association__Class2Assignment_12 ) ) ;
    public final void rule__Association__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2197:1: ( ( ( rule__Association__Class2Assignment_12 ) ) )
            // InternalUmlTextual.g:2198:1: ( ( rule__Association__Class2Assignment_12 ) )
            {
            // InternalUmlTextual.g:2198:1: ( ( rule__Association__Class2Assignment_12 ) )
            // InternalUmlTextual.g:2199:2: ( rule__Association__Class2Assignment_12 )
            {
             before(grammarAccess.getAssociationAccess().getClass2Assignment_12()); 
            // InternalUmlTextual.g:2200:2: ( rule__Association__Class2Assignment_12 )
            // InternalUmlTextual.g:2200:3: rule__Association__Class2Assignment_12
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
    // InternalUmlTextual.g:2208:1: rule__Association__Group__13 : rule__Association__Group__13__Impl rule__Association__Group__14 ;
    public final void rule__Association__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2212:1: ( rule__Association__Group__13__Impl rule__Association__Group__14 )
            // InternalUmlTextual.g:2213:2: rule__Association__Group__13__Impl rule__Association__Group__14
            {
            pushFollow(FOLLOW_26);
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
    // InternalUmlTextual.g:2220:1: rule__Association__Group__13__Impl : ( '[' ) ;
    public final void rule__Association__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2224:1: ( ( '[' ) )
            // InternalUmlTextual.g:2225:1: ( '[' )
            {
            // InternalUmlTextual.g:2225:1: ( '[' )
            // InternalUmlTextual.g:2226:2: '['
            {
             before(grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_13()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUmlTextual.g:2235:1: rule__Association__Group__14 : rule__Association__Group__14__Impl rule__Association__Group__15 ;
    public final void rule__Association__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2239:1: ( rule__Association__Group__14__Impl rule__Association__Group__15 )
            // InternalUmlTextual.g:2240:2: rule__Association__Group__14__Impl rule__Association__Group__15
            {
            pushFollow(FOLLOW_27);
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
    // InternalUmlTextual.g:2247:1: rule__Association__Group__14__Impl : ( ( rule__Association__Multiplicity2Assignment_14 ) ) ;
    public final void rule__Association__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2251:1: ( ( ( rule__Association__Multiplicity2Assignment_14 ) ) )
            // InternalUmlTextual.g:2252:1: ( ( rule__Association__Multiplicity2Assignment_14 ) )
            {
            // InternalUmlTextual.g:2252:1: ( ( rule__Association__Multiplicity2Assignment_14 ) )
            // InternalUmlTextual.g:2253:2: ( rule__Association__Multiplicity2Assignment_14 )
            {
             before(grammarAccess.getAssociationAccess().getMultiplicity2Assignment_14()); 
            // InternalUmlTextual.g:2254:2: ( rule__Association__Multiplicity2Assignment_14 )
            // InternalUmlTextual.g:2254:3: rule__Association__Multiplicity2Assignment_14
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
    // InternalUmlTextual.g:2262:1: rule__Association__Group__15 : rule__Association__Group__15__Impl rule__Association__Group__16 ;
    public final void rule__Association__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2266:1: ( rule__Association__Group__15__Impl rule__Association__Group__16 )
            // InternalUmlTextual.g:2267:2: rule__Association__Group__15__Impl rule__Association__Group__16
            {
            pushFollow(FOLLOW_33);
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
    // InternalUmlTextual.g:2274:1: rule__Association__Group__15__Impl : ( ']' ) ;
    public final void rule__Association__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2278:1: ( ( ']' ) )
            // InternalUmlTextual.g:2279:1: ( ']' )
            {
            // InternalUmlTextual.g:2279:1: ( ']' )
            // InternalUmlTextual.g:2280:2: ']'
            {
             before(grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_15()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUmlTextual.g:2289:1: rule__Association__Group__16 : rule__Association__Group__16__Impl ;
    public final void rule__Association__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2293:1: ( rule__Association__Group__16__Impl )
            // InternalUmlTextual.g:2294:2: rule__Association__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__16__Impl();

            state._fsp--;


            }

        }
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
    // InternalUmlTextual.g:2300:1: rule__Association__Group__16__Impl : ( '}' ) ;
    public final void rule__Association__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2304:1: ( ( '}' ) )
            // InternalUmlTextual.g:2305:1: ( '}' )
            {
            // InternalUmlTextual.g:2305:1: ( '}' )
            // InternalUmlTextual.g:2306:2: '}'
            {
             before(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_16()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
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


    // $ANTLR start "rule__Aggregation__Group__0"
    // InternalUmlTextual.g:2316:1: rule__Aggregation__Group__0 : rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1 ;
    public final void rule__Aggregation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2320:1: ( rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1 )
            // InternalUmlTextual.g:2321:2: rule__Aggregation__Group__0__Impl rule__Aggregation__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:2328:1: rule__Aggregation__Group__0__Impl : ( 'aggregation' ) ;
    public final void rule__Aggregation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2332:1: ( ( 'aggregation' ) )
            // InternalUmlTextual.g:2333:1: ( 'aggregation' )
            {
            // InternalUmlTextual.g:2333:1: ( 'aggregation' )
            // InternalUmlTextual.g:2334:2: 'aggregation'
            {
             before(grammarAccess.getAggregationAccess().getAggregationKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalUmlTextual.g:2343:1: rule__Aggregation__Group__1 : rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2 ;
    public final void rule__Aggregation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2347:1: ( rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2 )
            // InternalUmlTextual.g:2348:2: rule__Aggregation__Group__1__Impl rule__Aggregation__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:2355:1: rule__Aggregation__Group__1__Impl : ( ( rule__Aggregation__NameAssignment_1 ) ) ;
    public final void rule__Aggregation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2359:1: ( ( ( rule__Aggregation__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:2360:1: ( ( rule__Aggregation__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:2360:1: ( ( rule__Aggregation__NameAssignment_1 ) )
            // InternalUmlTextual.g:2361:2: ( rule__Aggregation__NameAssignment_1 )
            {
             before(grammarAccess.getAggregationAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:2362:2: ( rule__Aggregation__NameAssignment_1 )
            // InternalUmlTextual.g:2362:3: rule__Aggregation__NameAssignment_1
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
    // InternalUmlTextual.g:2370:1: rule__Aggregation__Group__2 : rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3 ;
    public final void rule__Aggregation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2374:1: ( rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3 )
            // InternalUmlTextual.g:2375:2: rule__Aggregation__Group__2__Impl rule__Aggregation__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:2382:1: rule__Aggregation__Group__2__Impl : ( '{' ) ;
    public final void rule__Aggregation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2386:1: ( ( '{' ) )
            // InternalUmlTextual.g:2387:1: ( '{' )
            {
            // InternalUmlTextual.g:2387:1: ( '{' )
            // InternalUmlTextual.g:2388:2: '{'
            {
             before(grammarAccess.getAggregationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUmlTextual.g:2397:1: rule__Aggregation__Group__3 : rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4 ;
    public final void rule__Aggregation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2401:1: ( rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4 )
            // InternalUmlTextual.g:2402:2: rule__Aggregation__Group__3__Impl rule__Aggregation__Group__4
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
    // InternalUmlTextual.g:2409:1: rule__Aggregation__Group__3__Impl : ( 'from' ) ;
    public final void rule__Aggregation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2413:1: ( ( 'from' ) )
            // InternalUmlTextual.g:2414:1: ( 'from' )
            {
            // InternalUmlTextual.g:2414:1: ( 'from' )
            // InternalUmlTextual.g:2415:2: 'from'
            {
             before(grammarAccess.getAggregationAccess().getFromKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:2424:1: rule__Aggregation__Group__4 : rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5 ;
    public final void rule__Aggregation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2428:1: ( rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5 )
            // InternalUmlTextual.g:2429:2: rule__Aggregation__Group__4__Impl rule__Aggregation__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalUmlTextual.g:2436:1: rule__Aggregation__Group__4__Impl : ( ( rule__Aggregation__Class1Assignment_4 ) ) ;
    public final void rule__Aggregation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2440:1: ( ( ( rule__Aggregation__Class1Assignment_4 ) ) )
            // InternalUmlTextual.g:2441:1: ( ( rule__Aggregation__Class1Assignment_4 ) )
            {
            // InternalUmlTextual.g:2441:1: ( ( rule__Aggregation__Class1Assignment_4 ) )
            // InternalUmlTextual.g:2442:2: ( rule__Aggregation__Class1Assignment_4 )
            {
             before(grammarAccess.getAggregationAccess().getClass1Assignment_4()); 
            // InternalUmlTextual.g:2443:2: ( rule__Aggregation__Class1Assignment_4 )
            // InternalUmlTextual.g:2443:3: rule__Aggregation__Class1Assignment_4
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
    // InternalUmlTextual.g:2451:1: rule__Aggregation__Group__5 : rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6 ;
    public final void rule__Aggregation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2455:1: ( rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6 )
            // InternalUmlTextual.g:2456:2: rule__Aggregation__Group__5__Impl rule__Aggregation__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalUmlTextual.g:2463:1: rule__Aggregation__Group__5__Impl : ( '[' ) ;
    public final void rule__Aggregation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2467:1: ( ( '[' ) )
            // InternalUmlTextual.g:2468:1: ( '[' )
            {
            // InternalUmlTextual.g:2468:1: ( '[' )
            // InternalUmlTextual.g:2469:2: '['
            {
             before(grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUmlTextual.g:2478:1: rule__Aggregation__Group__6 : rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7 ;
    public final void rule__Aggregation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2482:1: ( rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7 )
            // InternalUmlTextual.g:2483:2: rule__Aggregation__Group__6__Impl rule__Aggregation__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalUmlTextual.g:2490:1: rule__Aggregation__Group__6__Impl : ( ( rule__Aggregation__Multiplicity1Assignment_6 ) ) ;
    public final void rule__Aggregation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2494:1: ( ( ( rule__Aggregation__Multiplicity1Assignment_6 ) ) )
            // InternalUmlTextual.g:2495:1: ( ( rule__Aggregation__Multiplicity1Assignment_6 ) )
            {
            // InternalUmlTextual.g:2495:1: ( ( rule__Aggregation__Multiplicity1Assignment_6 ) )
            // InternalUmlTextual.g:2496:2: ( rule__Aggregation__Multiplicity1Assignment_6 )
            {
             before(grammarAccess.getAggregationAccess().getMultiplicity1Assignment_6()); 
            // InternalUmlTextual.g:2497:2: ( rule__Aggregation__Multiplicity1Assignment_6 )
            // InternalUmlTextual.g:2497:3: rule__Aggregation__Multiplicity1Assignment_6
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
    // InternalUmlTextual.g:2505:1: rule__Aggregation__Group__7 : rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8 ;
    public final void rule__Aggregation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2509:1: ( rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8 )
            // InternalUmlTextual.g:2510:2: rule__Aggregation__Group__7__Impl rule__Aggregation__Group__8
            {
            pushFollow(FOLLOW_32);
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
    // InternalUmlTextual.g:2517:1: rule__Aggregation__Group__7__Impl : ( ']' ) ;
    public final void rule__Aggregation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2521:1: ( ( ']' ) )
            // InternalUmlTextual.g:2522:1: ( ']' )
            {
            // InternalUmlTextual.g:2522:1: ( ']' )
            // InternalUmlTextual.g:2523:2: ']'
            {
             before(grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_7()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUmlTextual.g:2532:1: rule__Aggregation__Group__8 : rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9 ;
    public final void rule__Aggregation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2536:1: ( rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9 )
            // InternalUmlTextual.g:2537:2: rule__Aggregation__Group__8__Impl rule__Aggregation__Group__9
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:2544:1: rule__Aggregation__Group__8__Impl : ( 'to' ) ;
    public final void rule__Aggregation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2548:1: ( ( 'to' ) )
            // InternalUmlTextual.g:2549:1: ( 'to' )
            {
            // InternalUmlTextual.g:2549:1: ( 'to' )
            // InternalUmlTextual.g:2550:2: 'to'
            {
             before(grammarAccess.getAggregationAccess().getToKeyword_8()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:2559:1: rule__Aggregation__Group__9 : rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10 ;
    public final void rule__Aggregation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2563:1: ( rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10 )
            // InternalUmlTextual.g:2564:2: rule__Aggregation__Group__9__Impl rule__Aggregation__Group__10
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:2571:1: rule__Aggregation__Group__9__Impl : ( ( rule__Aggregation__NavigationAssignment_9 )? ) ;
    public final void rule__Aggregation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2575:1: ( ( ( rule__Aggregation__NavigationAssignment_9 )? ) )
            // InternalUmlTextual.g:2576:1: ( ( rule__Aggregation__NavigationAssignment_9 )? )
            {
            // InternalUmlTextual.g:2576:1: ( ( rule__Aggregation__NavigationAssignment_9 )? )
            // InternalUmlTextual.g:2577:2: ( rule__Aggregation__NavigationAssignment_9 )?
            {
             before(grammarAccess.getAggregationAccess().getNavigationAssignment_9()); 
            // InternalUmlTextual.g:2578:2: ( rule__Aggregation__NavigationAssignment_9 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUmlTextual.g:2578:3: rule__Aggregation__NavigationAssignment_9
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
    // InternalUmlTextual.g:2586:1: rule__Aggregation__Group__10 : rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11 ;
    public final void rule__Aggregation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2590:1: ( rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11 )
            // InternalUmlTextual.g:2591:2: rule__Aggregation__Group__10__Impl rule__Aggregation__Group__11
            {
            pushFollow(FOLLOW_25);
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
    // InternalUmlTextual.g:2598:1: rule__Aggregation__Group__10__Impl : ( ( rule__Aggregation__Class2Assignment_10 ) ) ;
    public final void rule__Aggregation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2602:1: ( ( ( rule__Aggregation__Class2Assignment_10 ) ) )
            // InternalUmlTextual.g:2603:1: ( ( rule__Aggregation__Class2Assignment_10 ) )
            {
            // InternalUmlTextual.g:2603:1: ( ( rule__Aggregation__Class2Assignment_10 ) )
            // InternalUmlTextual.g:2604:2: ( rule__Aggregation__Class2Assignment_10 )
            {
             before(grammarAccess.getAggregationAccess().getClass2Assignment_10()); 
            // InternalUmlTextual.g:2605:2: ( rule__Aggregation__Class2Assignment_10 )
            // InternalUmlTextual.g:2605:3: rule__Aggregation__Class2Assignment_10
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
    // InternalUmlTextual.g:2613:1: rule__Aggregation__Group__11 : rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12 ;
    public final void rule__Aggregation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2617:1: ( rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12 )
            // InternalUmlTextual.g:2618:2: rule__Aggregation__Group__11__Impl rule__Aggregation__Group__12
            {
            pushFollow(FOLLOW_26);
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
    // InternalUmlTextual.g:2625:1: rule__Aggregation__Group__11__Impl : ( '[' ) ;
    public final void rule__Aggregation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2629:1: ( ( '[' ) )
            // InternalUmlTextual.g:2630:1: ( '[' )
            {
            // InternalUmlTextual.g:2630:1: ( '[' )
            // InternalUmlTextual.g:2631:2: '['
            {
             before(grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_11()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUmlTextual.g:2640:1: rule__Aggregation__Group__12 : rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13 ;
    public final void rule__Aggregation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2644:1: ( rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13 )
            // InternalUmlTextual.g:2645:2: rule__Aggregation__Group__12__Impl rule__Aggregation__Group__13
            {
            pushFollow(FOLLOW_33);
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
    // InternalUmlTextual.g:2652:1: rule__Aggregation__Group__12__Impl : ( ( rule__Aggregation__Multiplicity2Assignment_12 ) ) ;
    public final void rule__Aggregation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2656:1: ( ( ( rule__Aggregation__Multiplicity2Assignment_12 ) ) )
            // InternalUmlTextual.g:2657:1: ( ( rule__Aggregation__Multiplicity2Assignment_12 ) )
            {
            // InternalUmlTextual.g:2657:1: ( ( rule__Aggregation__Multiplicity2Assignment_12 ) )
            // InternalUmlTextual.g:2658:2: ( rule__Aggregation__Multiplicity2Assignment_12 )
            {
             before(grammarAccess.getAggregationAccess().getMultiplicity2Assignment_12()); 
            // InternalUmlTextual.g:2659:2: ( rule__Aggregation__Multiplicity2Assignment_12 )
            // InternalUmlTextual.g:2659:3: rule__Aggregation__Multiplicity2Assignment_12
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
    // InternalUmlTextual.g:2667:1: rule__Aggregation__Group__13 : rule__Aggregation__Group__13__Impl ;
    public final void rule__Aggregation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2671:1: ( rule__Aggregation__Group__13__Impl )
            // InternalUmlTextual.g:2672:2: rule__Aggregation__Group__13__Impl
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
    // InternalUmlTextual.g:2678:1: rule__Aggregation__Group__13__Impl : ( '}' ) ;
    public final void rule__Aggregation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2682:1: ( ( '}' ) )
            // InternalUmlTextual.g:2683:1: ( '}' )
            {
            // InternalUmlTextual.g:2683:1: ( '}' )
            // InternalUmlTextual.g:2684:2: '}'
            {
             before(grammarAccess.getAggregationAccess().getRightCurlyBracketKeyword_13()); 
            match(input,23,FOLLOW_2); 
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
    // InternalUmlTextual.g:2694:1: rule__Composition__Group__0 : rule__Composition__Group__0__Impl rule__Composition__Group__1 ;
    public final void rule__Composition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2698:1: ( rule__Composition__Group__0__Impl rule__Composition__Group__1 )
            // InternalUmlTextual.g:2699:2: rule__Composition__Group__0__Impl rule__Composition__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalUmlTextual.g:2706:1: rule__Composition__Group__0__Impl : ( 'composition' ) ;
    public final void rule__Composition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2710:1: ( ( 'composition' ) )
            // InternalUmlTextual.g:2711:1: ( 'composition' )
            {
            // InternalUmlTextual.g:2711:1: ( 'composition' )
            // InternalUmlTextual.g:2712:2: 'composition'
            {
             before(grammarAccess.getCompositionAccess().getCompositionKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalUmlTextual.g:2721:1: rule__Composition__Group__1 : rule__Composition__Group__1__Impl rule__Composition__Group__2 ;
    public final void rule__Composition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2725:1: ( rule__Composition__Group__1__Impl rule__Composition__Group__2 )
            // InternalUmlTextual.g:2726:2: rule__Composition__Group__1__Impl rule__Composition__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalUmlTextual.g:2733:1: rule__Composition__Group__1__Impl : ( ( rule__Composition__NameAssignment_1 ) ) ;
    public final void rule__Composition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2737:1: ( ( ( rule__Composition__NameAssignment_1 ) ) )
            // InternalUmlTextual.g:2738:1: ( ( rule__Composition__NameAssignment_1 ) )
            {
            // InternalUmlTextual.g:2738:1: ( ( rule__Composition__NameAssignment_1 ) )
            // InternalUmlTextual.g:2739:2: ( rule__Composition__NameAssignment_1 )
            {
             before(grammarAccess.getCompositionAccess().getNameAssignment_1()); 
            // InternalUmlTextual.g:2740:2: ( rule__Composition__NameAssignment_1 )
            // InternalUmlTextual.g:2740:3: rule__Composition__NameAssignment_1
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
    // InternalUmlTextual.g:2748:1: rule__Composition__Group__2 : rule__Composition__Group__2__Impl rule__Composition__Group__3 ;
    public final void rule__Composition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2752:1: ( rule__Composition__Group__2__Impl rule__Composition__Group__3 )
            // InternalUmlTextual.g:2753:2: rule__Composition__Group__2__Impl rule__Composition__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalUmlTextual.g:2760:1: rule__Composition__Group__2__Impl : ( '{' ) ;
    public final void rule__Composition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2764:1: ( ( '{' ) )
            // InternalUmlTextual.g:2765:1: ( '{' )
            {
            // InternalUmlTextual.g:2765:1: ( '{' )
            // InternalUmlTextual.g:2766:2: '{'
            {
             before(grammarAccess.getCompositionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
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
    // InternalUmlTextual.g:2775:1: rule__Composition__Group__3 : rule__Composition__Group__3__Impl rule__Composition__Group__4 ;
    public final void rule__Composition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2779:1: ( rule__Composition__Group__3__Impl rule__Composition__Group__4 )
            // InternalUmlTextual.g:2780:2: rule__Composition__Group__3__Impl rule__Composition__Group__4
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
    // InternalUmlTextual.g:2787:1: rule__Composition__Group__3__Impl : ( 'from' ) ;
    public final void rule__Composition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2791:1: ( ( 'from' ) )
            // InternalUmlTextual.g:2792:1: ( 'from' )
            {
            // InternalUmlTextual.g:2792:1: ( 'from' )
            // InternalUmlTextual.g:2793:2: 'from'
            {
             before(grammarAccess.getCompositionAccess().getFromKeyword_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalUmlTextual.g:2802:1: rule__Composition__Group__4 : rule__Composition__Group__4__Impl rule__Composition__Group__5 ;
    public final void rule__Composition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2806:1: ( rule__Composition__Group__4__Impl rule__Composition__Group__5 )
            // InternalUmlTextual.g:2807:2: rule__Composition__Group__4__Impl rule__Composition__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalUmlTextual.g:2814:1: rule__Composition__Group__4__Impl : ( ( rule__Composition__Class1Assignment_4 ) ) ;
    public final void rule__Composition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2818:1: ( ( ( rule__Composition__Class1Assignment_4 ) ) )
            // InternalUmlTextual.g:2819:1: ( ( rule__Composition__Class1Assignment_4 ) )
            {
            // InternalUmlTextual.g:2819:1: ( ( rule__Composition__Class1Assignment_4 ) )
            // InternalUmlTextual.g:2820:2: ( rule__Composition__Class1Assignment_4 )
            {
             before(grammarAccess.getCompositionAccess().getClass1Assignment_4()); 
            // InternalUmlTextual.g:2821:2: ( rule__Composition__Class1Assignment_4 )
            // InternalUmlTextual.g:2821:3: rule__Composition__Class1Assignment_4
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
    // InternalUmlTextual.g:2829:1: rule__Composition__Group__5 : rule__Composition__Group__5__Impl rule__Composition__Group__6 ;
    public final void rule__Composition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2833:1: ( rule__Composition__Group__5__Impl rule__Composition__Group__6 )
            // InternalUmlTextual.g:2834:2: rule__Composition__Group__5__Impl rule__Composition__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalUmlTextual.g:2841:1: rule__Composition__Group__5__Impl : ( '[' ) ;
    public final void rule__Composition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2845:1: ( ( '[' ) )
            // InternalUmlTextual.g:2846:1: ( '[' )
            {
            // InternalUmlTextual.g:2846:1: ( '[' )
            // InternalUmlTextual.g:2847:2: '['
            {
             before(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_5()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUmlTextual.g:2856:1: rule__Composition__Group__6 : rule__Composition__Group__6__Impl rule__Composition__Group__7 ;
    public final void rule__Composition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2860:1: ( rule__Composition__Group__6__Impl rule__Composition__Group__7 )
            // InternalUmlTextual.g:2861:2: rule__Composition__Group__6__Impl rule__Composition__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalUmlTextual.g:2868:1: rule__Composition__Group__6__Impl : ( ( rule__Composition__Multiplicity1Assignment_6 ) ) ;
    public final void rule__Composition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2872:1: ( ( ( rule__Composition__Multiplicity1Assignment_6 ) ) )
            // InternalUmlTextual.g:2873:1: ( ( rule__Composition__Multiplicity1Assignment_6 ) )
            {
            // InternalUmlTextual.g:2873:1: ( ( rule__Composition__Multiplicity1Assignment_6 ) )
            // InternalUmlTextual.g:2874:2: ( rule__Composition__Multiplicity1Assignment_6 )
            {
             before(grammarAccess.getCompositionAccess().getMultiplicity1Assignment_6()); 
            // InternalUmlTextual.g:2875:2: ( rule__Composition__Multiplicity1Assignment_6 )
            // InternalUmlTextual.g:2875:3: rule__Composition__Multiplicity1Assignment_6
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
    // InternalUmlTextual.g:2883:1: rule__Composition__Group__7 : rule__Composition__Group__7__Impl rule__Composition__Group__8 ;
    public final void rule__Composition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2887:1: ( rule__Composition__Group__7__Impl rule__Composition__Group__8 )
            // InternalUmlTextual.g:2888:2: rule__Composition__Group__7__Impl rule__Composition__Group__8
            {
            pushFollow(FOLLOW_32);
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
    // InternalUmlTextual.g:2895:1: rule__Composition__Group__7__Impl : ( ']' ) ;
    public final void rule__Composition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2899:1: ( ( ']' ) )
            // InternalUmlTextual.g:2900:1: ( ']' )
            {
            // InternalUmlTextual.g:2900:1: ( ']' )
            // InternalUmlTextual.g:2901:2: ']'
            {
             before(grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_7()); 
            match(input,39,FOLLOW_2); 
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
    // InternalUmlTextual.g:2910:1: rule__Composition__Group__8 : rule__Composition__Group__8__Impl rule__Composition__Group__9 ;
    public final void rule__Composition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2914:1: ( rule__Composition__Group__8__Impl rule__Composition__Group__9 )
            // InternalUmlTextual.g:2915:2: rule__Composition__Group__8__Impl rule__Composition__Group__9
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:2922:1: rule__Composition__Group__8__Impl : ( 'to' ) ;
    public final void rule__Composition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2926:1: ( ( 'to' ) )
            // InternalUmlTextual.g:2927:1: ( 'to' )
            {
            // InternalUmlTextual.g:2927:1: ( 'to' )
            // InternalUmlTextual.g:2928:2: 'to'
            {
             before(grammarAccess.getCompositionAccess().getToKeyword_8()); 
            match(input,43,FOLLOW_2); 
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
    // InternalUmlTextual.g:2937:1: rule__Composition__Group__9 : rule__Composition__Group__9__Impl rule__Composition__Group__10 ;
    public final void rule__Composition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2941:1: ( rule__Composition__Group__9__Impl rule__Composition__Group__10 )
            // InternalUmlTextual.g:2942:2: rule__Composition__Group__9__Impl rule__Composition__Group__10
            {
            pushFollow(FOLLOW_31);
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
    // InternalUmlTextual.g:2949:1: rule__Composition__Group__9__Impl : ( ( rule__Composition__NavigationAssignment_9 )? ) ;
    public final void rule__Composition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2953:1: ( ( ( rule__Composition__NavigationAssignment_9 )? ) )
            // InternalUmlTextual.g:2954:1: ( ( rule__Composition__NavigationAssignment_9 )? )
            {
            // InternalUmlTextual.g:2954:1: ( ( rule__Composition__NavigationAssignment_9 )? )
            // InternalUmlTextual.g:2955:2: ( rule__Composition__NavigationAssignment_9 )?
            {
             before(grammarAccess.getCompositionAccess().getNavigationAssignment_9()); 
            // InternalUmlTextual.g:2956:2: ( rule__Composition__NavigationAssignment_9 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalUmlTextual.g:2956:3: rule__Composition__NavigationAssignment_9
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
    // InternalUmlTextual.g:2964:1: rule__Composition__Group__10 : rule__Composition__Group__10__Impl rule__Composition__Group__11 ;
    public final void rule__Composition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2968:1: ( rule__Composition__Group__10__Impl rule__Composition__Group__11 )
            // InternalUmlTextual.g:2969:2: rule__Composition__Group__10__Impl rule__Composition__Group__11
            {
            pushFollow(FOLLOW_25);
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
    // InternalUmlTextual.g:2976:1: rule__Composition__Group__10__Impl : ( ( rule__Composition__Class2Assignment_10 ) ) ;
    public final void rule__Composition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2980:1: ( ( ( rule__Composition__Class2Assignment_10 ) ) )
            // InternalUmlTextual.g:2981:1: ( ( rule__Composition__Class2Assignment_10 ) )
            {
            // InternalUmlTextual.g:2981:1: ( ( rule__Composition__Class2Assignment_10 ) )
            // InternalUmlTextual.g:2982:2: ( rule__Composition__Class2Assignment_10 )
            {
             before(grammarAccess.getCompositionAccess().getClass2Assignment_10()); 
            // InternalUmlTextual.g:2983:2: ( rule__Composition__Class2Assignment_10 )
            // InternalUmlTextual.g:2983:3: rule__Composition__Class2Assignment_10
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
    // InternalUmlTextual.g:2991:1: rule__Composition__Group__11 : rule__Composition__Group__11__Impl rule__Composition__Group__12 ;
    public final void rule__Composition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:2995:1: ( rule__Composition__Group__11__Impl rule__Composition__Group__12 )
            // InternalUmlTextual.g:2996:2: rule__Composition__Group__11__Impl rule__Composition__Group__12
            {
            pushFollow(FOLLOW_26);
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
    // InternalUmlTextual.g:3003:1: rule__Composition__Group__11__Impl : ( '[' ) ;
    public final void rule__Composition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3007:1: ( ( '[' ) )
            // InternalUmlTextual.g:3008:1: ( '[' )
            {
            // InternalUmlTextual.g:3008:1: ( '[' )
            // InternalUmlTextual.g:3009:2: '['
            {
             before(grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_11()); 
            match(input,38,FOLLOW_2); 
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
    // InternalUmlTextual.g:3018:1: rule__Composition__Group__12 : rule__Composition__Group__12__Impl rule__Composition__Group__13 ;
    public final void rule__Composition__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3022:1: ( rule__Composition__Group__12__Impl rule__Composition__Group__13 )
            // InternalUmlTextual.g:3023:2: rule__Composition__Group__12__Impl rule__Composition__Group__13
            {
            pushFollow(FOLLOW_33);
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
    // InternalUmlTextual.g:3030:1: rule__Composition__Group__12__Impl : ( ( rule__Composition__Multiplicity2Assignment_12 ) ) ;
    public final void rule__Composition__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3034:1: ( ( ( rule__Composition__Multiplicity2Assignment_12 ) ) )
            // InternalUmlTextual.g:3035:1: ( ( rule__Composition__Multiplicity2Assignment_12 ) )
            {
            // InternalUmlTextual.g:3035:1: ( ( rule__Composition__Multiplicity2Assignment_12 ) )
            // InternalUmlTextual.g:3036:2: ( rule__Composition__Multiplicity2Assignment_12 )
            {
             before(grammarAccess.getCompositionAccess().getMultiplicity2Assignment_12()); 
            // InternalUmlTextual.g:3037:2: ( rule__Composition__Multiplicity2Assignment_12 )
            // InternalUmlTextual.g:3037:3: rule__Composition__Multiplicity2Assignment_12
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
    // InternalUmlTextual.g:3045:1: rule__Composition__Group__13 : rule__Composition__Group__13__Impl ;
    public final void rule__Composition__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3049:1: ( rule__Composition__Group__13__Impl )
            // InternalUmlTextual.g:3050:2: rule__Composition__Group__13__Impl
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
    // InternalUmlTextual.g:3056:1: rule__Composition__Group__13__Impl : ( '}' ) ;
    public final void rule__Composition__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3060:1: ( ( '}' ) )
            // InternalUmlTextual.g:3061:1: ( '}' )
            {
            // InternalUmlTextual.g:3061:1: ( '}' )
            // InternalUmlTextual.g:3062:2: '}'
            {
             before(grammarAccess.getCompositionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,23,FOLLOW_2); 
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


    // $ANTLR start "rule__Model__PackagesAssignment"
    // InternalUmlTextual.g:3072:1: rule__Model__PackagesAssignment : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3076:1: ( ( rulePackage ) )
            // InternalUmlTextual.g:3077:2: ( rulePackage )
            {
            // InternalUmlTextual.g:3077:2: ( rulePackage )
            // InternalUmlTextual.g:3078:3: rulePackage
            {
             before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackagesAssignment"


    // $ANTLR start "rule__Package__TypeAssignment_0"
    // InternalUmlTextual.g:3087:1: rule__Package__TypeAssignment_0 : ( ( rule__Package__TypeAlternatives_0_0 ) ) ;
    public final void rule__Package__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3091:1: ( ( ( rule__Package__TypeAlternatives_0_0 ) ) )
            // InternalUmlTextual.g:3092:2: ( ( rule__Package__TypeAlternatives_0_0 ) )
            {
            // InternalUmlTextual.g:3092:2: ( ( rule__Package__TypeAlternatives_0_0 ) )
            // InternalUmlTextual.g:3093:3: ( rule__Package__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getPackageAccess().getTypeAlternatives_0_0()); 
            // InternalUmlTextual.g:3094:3: ( rule__Package__TypeAlternatives_0_0 )
            // InternalUmlTextual.g:3094:4: rule__Package__TypeAlternatives_0_0
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
    // InternalUmlTextual.g:3102:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3106:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:3107:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:3107:2: ( RULE_ID )
            // InternalUmlTextual.g:3108:3: RULE_ID
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


    // $ANTLR start "rule__Package__ClassesAssignment_3"
    // InternalUmlTextual.g:3117:1: rule__Package__ClassesAssignment_3 : ( ruleClass ) ;
    public final void rule__Package__ClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3121:1: ( ( ruleClass ) )
            // InternalUmlTextual.g:3122:2: ( ruleClass )
            {
            // InternalUmlTextual.g:3122:2: ( ruleClass )
            // InternalUmlTextual.g:3123:3: ruleClass
            {
             before(grammarAccess.getPackageAccess().getClassesClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getClassesClassParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ClassesAssignment_3"


    // $ANTLR start "rule__Package__AssociationsAssignment_4"
    // InternalUmlTextual.g:3132:1: rule__Package__AssociationsAssignment_4 : ( ruleAssociationConnector ) ;
    public final void rule__Package__AssociationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3136:1: ( ( ruleAssociationConnector ) )
            // InternalUmlTextual.g:3137:2: ( ruleAssociationConnector )
            {
            // InternalUmlTextual.g:3137:2: ( ruleAssociationConnector )
            // InternalUmlTextual.g:3138:3: ruleAssociationConnector
            {
             before(grammarAccess.getPackageAccess().getAssociationsAssociationConnectorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociationConnector();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getAssociationsAssociationConnectorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AssociationsAssignment_4"


    // $ANTLR start "rule__Class__StereotypeAssignment_0_1"
    // InternalUmlTextual.g:3147:1: rule__Class__StereotypeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Class__StereotypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3151:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:3152:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:3152:2: ( RULE_ID )
            // InternalUmlTextual.g:3153:3: RULE_ID
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
    // InternalUmlTextual.g:3162:1: rule__Class__VisibilityAssignment_1 : ( ruleVisibility ) ;
    public final void rule__Class__VisibilityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3166:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:3167:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:3167:2: ( ruleVisibility )
            // InternalUmlTextual.g:3168:3: ruleVisibility
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
    // InternalUmlTextual.g:3177:1: rule__Class__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3181:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:3182:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:3182:2: ( RULE_ID )
            // InternalUmlTextual.g:3183:3: RULE_ID
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
    // InternalUmlTextual.g:3192:1: rule__Class__ParentClassAssignment_4_1 : ( ruleClass ) ;
    public final void rule__Class__ParentClassAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3196:1: ( ( ruleClass ) )
            // InternalUmlTextual.g:3197:2: ( ruleClass )
            {
            // InternalUmlTextual.g:3197:2: ( ruleClass )
            // InternalUmlTextual.g:3198:3: ruleClass
            {
             before(grammarAccess.getClassAccess().getParentClassClassParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassAccess().getParentClassClassParserRuleCall_4_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Class__AttributesAssignment_6"
    // InternalUmlTextual.g:3207:1: rule__Class__AttributesAssignment_6 : ( ruleAttribute ) ;
    public final void rule__Class__AttributesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3211:1: ( ( ruleAttribute ) )
            // InternalUmlTextual.g:3212:2: ( ruleAttribute )
            {
            // InternalUmlTextual.g:3212:2: ( ruleAttribute )
            // InternalUmlTextual.g:3213:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributesAssignment_6"


    // $ANTLR start "rule__DomainSpecificType__NameAssignment"
    // InternalUmlTextual.g:3222:1: rule__DomainSpecificType__NameAssignment : ( RULE_ID ) ;
    public final void rule__DomainSpecificType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3226:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:3227:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:3227:2: ( RULE_ID )
            // InternalUmlTextual.g:3228:3: RULE_ID
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
    // InternalUmlTextual.g:3237:1: rule__Attribute__VisibilityAssignment_0 : ( ruleVisibility ) ;
    public final void rule__Attribute__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3241:1: ( ( ruleVisibility ) )
            // InternalUmlTextual.g:3242:2: ( ruleVisibility )
            {
            // InternalUmlTextual.g:3242:2: ( ruleVisibility )
            // InternalUmlTextual.g:3243:3: ruleVisibility
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
    // InternalUmlTextual.g:3252:1: rule__Attribute__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3256:1: ( ( RULE_ID ) )
            // InternalUmlTextual.g:3257:2: ( RULE_ID )
            {
            // InternalUmlTextual.g:3257:2: ( RULE_ID )
            // InternalUmlTextual.g:3258:3: RULE_ID
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
    // InternalUmlTextual.g:3267:1: rule__Attribute__TypeAssignment_4 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3271:1: ( ( ruleAttributeType ) )
            // InternalUmlTextual.g:3272:2: ( ruleAttributeType )
            {
            // InternalUmlTextual.g:3272:2: ( ruleAttributeType )
            // InternalUmlTextual.g:3273:3: ruleAttributeType
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
    // InternalUmlTextual.g:3282:1: rule__Attribute__MultiplicityAssignment_5_1 : ( ruleMultiplicity ) ;
    public final void rule__Attribute__MultiplicityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3286:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:3287:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:3287:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:3288:3: ruleMultiplicity
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


    // $ANTLR start "rule__Association__NameAssignment_2"
    // InternalUmlTextual.g:3297:1: rule__Association__NameAssignment_2 : ( ( rule__Association__NameAlternatives_2_0 ) ) ;
    public final void rule__Association__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3301:1: ( ( ( rule__Association__NameAlternatives_2_0 ) ) )
            // InternalUmlTextual.g:3302:2: ( ( rule__Association__NameAlternatives_2_0 ) )
            {
            // InternalUmlTextual.g:3302:2: ( ( rule__Association__NameAlternatives_2_0 ) )
            // InternalUmlTextual.g:3303:3: ( rule__Association__NameAlternatives_2_0 )
            {
             before(grammarAccess.getAssociationAccess().getNameAlternatives_2_0()); 
            // InternalUmlTextual.g:3304:3: ( rule__Association__NameAlternatives_2_0 )
            // InternalUmlTextual.g:3304:4: rule__Association__NameAlternatives_2_0
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
    // InternalUmlTextual.g:3312:1: rule__Association__Navigation1Assignment_5 : ( ruleNavigation ) ;
    public final void rule__Association__Navigation1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3316:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:3317:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:3317:2: ( ruleNavigation )
            // InternalUmlTextual.g:3318:3: ruleNavigation
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
    // InternalUmlTextual.g:3327:1: rule__Association__Class1Assignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Association__Class1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3331:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:3332:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:3332:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:3333:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getClass1ClassCrossReference_6_0()); 
            // InternalUmlTextual.g:3334:3: ( RULE_ID )
            // InternalUmlTextual.g:3335:4: RULE_ID
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
    // InternalUmlTextual.g:3346:1: rule__Association__Multiplicity1Assignment_8 : ( ruleMultiplicity ) ;
    public final void rule__Association__Multiplicity1Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3350:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:3351:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:3351:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:3352:3: ruleMultiplicity
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
    // InternalUmlTextual.g:3361:1: rule__Association__Navigation2Assignment_11 : ( ruleNavigation ) ;
    public final void rule__Association__Navigation2Assignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3365:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:3366:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:3366:2: ( ruleNavigation )
            // InternalUmlTextual.g:3367:3: ruleNavigation
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
    // InternalUmlTextual.g:3376:1: rule__Association__Class2Assignment_12 : ( ( RULE_ID ) ) ;
    public final void rule__Association__Class2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3380:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:3381:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:3381:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:3382:3: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getClass2ClassCrossReference_12_0()); 
            // InternalUmlTextual.g:3383:3: ( RULE_ID )
            // InternalUmlTextual.g:3384:4: RULE_ID
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
    // InternalUmlTextual.g:3395:1: rule__Association__Multiplicity2Assignment_14 : ( ruleMultiplicity ) ;
    public final void rule__Association__Multiplicity2Assignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3399:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:3400:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:3400:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:3401:3: ruleMultiplicity
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


    // $ANTLR start "rule__Aggregation__NameAssignment_1"
    // InternalUmlTextual.g:3410:1: rule__Aggregation__NameAssignment_1 : ( ( rule__Aggregation__NameAlternatives_1_0 ) ) ;
    public final void rule__Aggregation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3414:1: ( ( ( rule__Aggregation__NameAlternatives_1_0 ) ) )
            // InternalUmlTextual.g:3415:2: ( ( rule__Aggregation__NameAlternatives_1_0 ) )
            {
            // InternalUmlTextual.g:3415:2: ( ( rule__Aggregation__NameAlternatives_1_0 ) )
            // InternalUmlTextual.g:3416:3: ( rule__Aggregation__NameAlternatives_1_0 )
            {
             before(grammarAccess.getAggregationAccess().getNameAlternatives_1_0()); 
            // InternalUmlTextual.g:3417:3: ( rule__Aggregation__NameAlternatives_1_0 )
            // InternalUmlTextual.g:3417:4: rule__Aggregation__NameAlternatives_1_0
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
    // InternalUmlTextual.g:3425:1: rule__Aggregation__Class1Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Aggregation__Class1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3429:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:3430:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:3430:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:3431:3: ( RULE_ID )
            {
             before(grammarAccess.getAggregationAccess().getClass1ClassCrossReference_4_0()); 
            // InternalUmlTextual.g:3432:3: ( RULE_ID )
            // InternalUmlTextual.g:3433:4: RULE_ID
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
    // InternalUmlTextual.g:3444:1: rule__Aggregation__Multiplicity1Assignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Aggregation__Multiplicity1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3448:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:3449:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:3449:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:3450:3: ruleMultiplicity
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
    // InternalUmlTextual.g:3459:1: rule__Aggregation__NavigationAssignment_9 : ( ruleNavigation ) ;
    public final void rule__Aggregation__NavigationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3463:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:3464:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:3464:2: ( ruleNavigation )
            // InternalUmlTextual.g:3465:3: ruleNavigation
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
    // InternalUmlTextual.g:3474:1: rule__Aggregation__Class2Assignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Aggregation__Class2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3478:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:3479:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:3479:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:3480:3: ( RULE_ID )
            {
             before(grammarAccess.getAggregationAccess().getClass2ClassCrossReference_10_0()); 
            // InternalUmlTextual.g:3481:3: ( RULE_ID )
            // InternalUmlTextual.g:3482:4: RULE_ID
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
    // InternalUmlTextual.g:3493:1: rule__Aggregation__Multiplicity2Assignment_12 : ( ruleMultiplicity ) ;
    public final void rule__Aggregation__Multiplicity2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3497:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:3498:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:3498:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:3499:3: ruleMultiplicity
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
    // InternalUmlTextual.g:3508:1: rule__Composition__NameAssignment_1 : ( ( rule__Composition__NameAlternatives_1_0 ) ) ;
    public final void rule__Composition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3512:1: ( ( ( rule__Composition__NameAlternatives_1_0 ) ) )
            // InternalUmlTextual.g:3513:2: ( ( rule__Composition__NameAlternatives_1_0 ) )
            {
            // InternalUmlTextual.g:3513:2: ( ( rule__Composition__NameAlternatives_1_0 ) )
            // InternalUmlTextual.g:3514:3: ( rule__Composition__NameAlternatives_1_0 )
            {
             before(grammarAccess.getCompositionAccess().getNameAlternatives_1_0()); 
            // InternalUmlTextual.g:3515:3: ( rule__Composition__NameAlternatives_1_0 )
            // InternalUmlTextual.g:3515:4: rule__Composition__NameAlternatives_1_0
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
    // InternalUmlTextual.g:3523:1: rule__Composition__Class1Assignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Composition__Class1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3527:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:3528:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:3528:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:3529:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionAccess().getClass1ClassCrossReference_4_0()); 
            // InternalUmlTextual.g:3530:3: ( RULE_ID )
            // InternalUmlTextual.g:3531:4: RULE_ID
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
    // InternalUmlTextual.g:3542:1: rule__Composition__Multiplicity1Assignment_6 : ( ruleMultiplicity ) ;
    public final void rule__Composition__Multiplicity1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3546:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:3547:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:3547:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:3548:3: ruleMultiplicity
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
    // InternalUmlTextual.g:3557:1: rule__Composition__NavigationAssignment_9 : ( ruleNavigation ) ;
    public final void rule__Composition__NavigationAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3561:1: ( ( ruleNavigation ) )
            // InternalUmlTextual.g:3562:2: ( ruleNavigation )
            {
            // InternalUmlTextual.g:3562:2: ( ruleNavigation )
            // InternalUmlTextual.g:3563:3: ruleNavigation
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
    // InternalUmlTextual.g:3572:1: rule__Composition__Class2Assignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Composition__Class2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3576:1: ( ( ( RULE_ID ) ) )
            // InternalUmlTextual.g:3577:2: ( ( RULE_ID ) )
            {
            // InternalUmlTextual.g:3577:2: ( ( RULE_ID ) )
            // InternalUmlTextual.g:3578:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositionAccess().getClass2ClassCrossReference_10_0()); 
            // InternalUmlTextual.g:3579:3: ( RULE_ID )
            // InternalUmlTextual.g:3580:4: RULE_ID
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
    // InternalUmlTextual.g:3591:1: rule__Composition__Multiplicity2Assignment_12 : ( ruleMultiplicity ) ;
    public final void rule__Composition__Multiplicity2Assignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUmlTextual.g:3595:1: ( ( ruleMultiplicity ) )
            // InternalUmlTextual.g:3596:2: ( ruleMultiplicity )
            {
            // InternalUmlTextual.g:3596:2: ( ruleMultiplicity )
            // InternalUmlTextual.g:3597:3: ruleMultiplicity
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000330003818000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000330000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001000818000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000018002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000018000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000FF8000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000800000L});

}