package Chapter6AnnotationAndEnums;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Plant {
    public enum LifeCycle {ANNUAL, PERENNIAL, BIENNIAL};
    private String name;
    private LifeCycle lifeCycle;

    public Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    // getters and setters
}
