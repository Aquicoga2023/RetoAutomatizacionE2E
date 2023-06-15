package org.example.utils;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CucumberTable {

    private CucumberTable(){
    }
    public static void rememberTableValues(DataTable dataTable)
    {   List<List<String>> rowsHeaders = dataTable.asLists(String.class);

        List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> columns : rows) {
            for (String headerName :rowsHeaders.get(0)){
                theActorInTheSpotlight().remember(headerName,columns.get(headerName));
            }
        }
    }
}
