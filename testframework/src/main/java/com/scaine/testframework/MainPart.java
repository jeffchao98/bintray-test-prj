package com.scaine.testframework;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainPart {
    private String rawData = "{\"name\":\"MainPart item\" , \"state\": \"alive state\", \"mood\": \"HaHa\"}";
    private DataModel dataModel = new DataModel();
    public MainPart() {
        dataModel = new Gson().fromJson(rawData, new TypeToken<DataModel>() {
        }.getType());
    }
    public DataModel getParserData() {
        return dataModel;
    }
    public String getState() {
        return dataModel.state;
    }
}
