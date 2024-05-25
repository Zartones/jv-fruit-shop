package core.basesyntax.service.impl;

import core.basesyntax.service.ReportGenerator;
import java.util.HashMap;
import java.util.Map;

public class ReportGeneratorService implements ReportGenerator {
    private static final String REPORT_HEADER = "fruit,quantity";
    private static final String COMMA = ",";
    private static final String SEPARATOR = System.lineSeparator();

    @Override
    public String create(HashMap<String, Integer> data) {
        StringBuilder report = new StringBuilder();
        report.append(REPORT_HEADER).append(SEPARATOR);
        for (Map.Entry<String, Integer> set :
                data.entrySet()) {
            String key = set.getKey();
            Integer value = set.getValue();
            report.append(key).append(COMMA).append(value).append(SEPARATOR);
        }
        return report.toString();
    }
}