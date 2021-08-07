package com.jomilto.jobsearch;

import com.beust.jcommander.JCommander;
import com.jomilto.jobsearch.cli.CLIArguments;

import static com.jomilto.jobsearch.CommanderFunctions.buildCommanderWithName;

public class JobSearch {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);

    }
}
