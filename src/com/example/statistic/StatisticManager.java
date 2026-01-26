package com.example.statistic;

import com.example.statistic.event.EventDataRow;
import com.example.statistic.event.EventType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticManager {

    private final StatisticStorage statisticStorage = new StatisticStorage();

    private StatisticManager() {}

    private static class InstanceHolder {
        private static final StatisticManager INSTANCE = new StatisticManager();
    }

    public static StatisticManager getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private class StatisticStorage {
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();;

        public StatisticStorage() {
            for (EventType eventType: EventType.values()) {
                this.storage.put(eventType, new ArrayList<>());
            }
        }

        private void put(EventDataRow data) {
            EventType type = data.getType();
            if (!this.storage.containsKey(type))
                throw new UnsupportedOperationException();
            this.storage.get(type).add(data);
        }
    }

    public void register(EventDataRow data) {
        this.statisticStorage.put(data);
    }
}
