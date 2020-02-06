package com.scaine.testframework;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainPart {
    public String getName() {
        String jsonData = "{\"name\":\"MainPart item\" , \"state\": \"alive state\", \"mood\": \"HaHa\"}";
        DataModel dataModel = new Gson().fromJson(jsonData, new TypeToken<DataModel>() {
        }.getType());
        return dataModel.state;
    }
}
