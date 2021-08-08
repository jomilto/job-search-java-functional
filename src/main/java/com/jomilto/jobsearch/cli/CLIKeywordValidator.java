package com.jomilto.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIKeywordValidator implements IParameterValidator  {
    @Override
    public void validate(String name, String value) throws ParameterException {
        if(!value.matches("^[a-zA-z]+[0-9]*$")){
            System.err.println("Críterio de búsqueda no válido.");
            throw new ParameterException("Solamente letras y números");
        }
    }
}
