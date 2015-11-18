package com.mago.corrector.ortrografia;

import org.languagetool.JLanguageTool;
import org.languagetool.language.Spanish;

public class App 
{
	private static final String CADENA="muchos herrores hortograficos";
	
    public static void main(String[] args)
    {
        Check spell = new Check();
       	spell.checkOrtografia(CADENA);
        System.out.println(spell.editOrtografia(CADENA, new JLanguageTool(new Spanish())));
    }
}
