package com.example.sweng.shared.storia.scenario;

import java.util.Map;

public interface ScenarioGenerale {
    String getDescrizione();
    void setDescrizione(final String descrizione);
    int getId();
    void setId(final int id);
    public String getAzione();
    public Map<Integer, Scenario> getProseguimento();
}
