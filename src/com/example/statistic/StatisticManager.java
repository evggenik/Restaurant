package com.example.statistic;

import com.example.statistic.event.EventDataRow;

public class StatisticManager {

    private StatisticManager() {}

    private static class InstanceHolder {
        private static final StatisticManager INSTANCE = new StatisticManager();
    }

    public static StatisticManager getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public void register(EventDataRow data) {

    }
}
