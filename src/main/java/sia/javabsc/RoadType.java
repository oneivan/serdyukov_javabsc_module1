package sia.javabsc;

public enum RoadType {
      FOREST("FOREST")
    , FLATLAND("FLATLAND")
    , MORASS("MORASS'");
    private final String rt;
    RoadType(String rt) {
        this.rt = rt;
    }
}