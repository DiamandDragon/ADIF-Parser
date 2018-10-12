package bid.thediamonddragon.adifparser.enums;

import java.util.ArrayList;

public enum ARRL {
    AL("AL", "Alabama", 291),
    AK("AK", "Alaska", 6),
    AB("AB", "Alberta", 1),
    AR("AR", "Arkansas", 291),
    AZ("AZ", "Arizona", 291),
    BC("BC", "British Columbia", 1),
    CO("CO", "Colorado", 291),
    CT("CT", "Cannecticut", 291),
    DE("DE", "Delaware", 291),
    EB("EB", "East Bay", 291),
    EMA("EMA", "Eastern Massachusetts", 291),
    ENY("ENY", "Eastern New York", 291),
    EPA("EPA", "Eastern Pennsylvania", 291),
    EWA("EWA", "Eastern Washington", 291),
    GA("GA", "Georgia", 291),
    GTA("GTA", "Greater Toronto Area", 1),
    ID("ID", "Idaho", 291),
    IL("IL", "Illinois", 291),
    IN("IN", "Indiana", 291),
    IA("IA", "Iowa", 291),
    KS("KS", "Kansas", 291),
    KY("KY", "Kentucky", 291),
    LAX("LAX", "Los Angeles", 291),
    LA("LA", "Lousiana", 291),
    ME("ME", "Maine", 1),
    MB("MB", "Manitoba", 1),
    MAR("MAR", "Maritime", 1),
    MDC("MDC", "Maryland-DC", 291),
    MI("MI", "Michigan", 291),
    MN("MN", "Minnesota", 291),
    MS("MS", "Mississippi", 291),
    MO("MO", "Missouri", 291),
    MT("MT", "Montana", 291),
    NE("NE", "Nebraska", 291),
    NV("NV", "Nevada", 291),
    NH("NH", "New Hampshire", 291),
    NM("NM", "New Mexico", 291),
    NLI("NLI", "New York City - Long Island", 291),
    NL("NL", "Newfoundland / Labrador", 1),
    NC("NC", "North Carolina", 291),
    ND("ND", "North Dakota", 291),
    NTX("NTX", "North Texas", 291),
    NFL("NFL", "Northern Florida", 291),
    NNJ("NNJ", "Northern New Jersey", 291),
    NNY("NNY", "Northern New York", 291),
    NT("NT", "Northwest Territories / Yukon / Nunavut", 1),
    NWT("NWT", "Northwest Territories / Yukon / Nunavut", 1),
    OH("OH", "Ohio", 291),
    OK("OK", "Oklahoma", 291),
    ON("ON", "Ontario", 1),
    ONE("ONE", "Ontario East", 1),
    ONN("ONN", "Ontario North", 1),
    ONS("ONS", "Ontario South", 1),
    ORG("ORG", "Orange", 291),
    OR("OR", "Oregon", 291),
    PAC("PAC", "Pacific", 9, 20, 103, 110, 123, 134, 138, 166, 174, 197, 297, 515),
    PR("PR", "Puerto Rico", 43, 202),
    QC("QC", "Quebec", 1),
    RI("RI", "Rhode Island", 291),
    SV("SV", "Sacramento Valley", 291),
    SDG("SDG", "San Diego", 291),
    SF("SF", "San Francisco", 291),
    SJV("SJV", "San Joaquin Valley", 291),
    SB("SB", "Santa Barbara", 291),
    SCV("SCV", "Santa Clara Valley", 291),
    SK("SK", "Saskatchewan", 1),
    SC("SC", "South Carolina", 291),
    SD("SD", "South Dakota", 291),
    STX("STX", "South Texas", 291),
    SFL("SFL", "Southern Florida", 291),
    SNJ("SNJ", "Southern New Jersey", 291),
    TN("TN", "Tennessee", 291),
    VI("VI", "US Virgin Islands", 105, 182, 285),
    UT("UT", "Utah", 291),
    VT("VT", "Vermont", 291),
    VA("VA", "Virginia", 291),
    WCF("WCF", "West Central Florida", 291),
    WTX("WTX", "West Texas", 291),
    WV("WV", "West Virginia", 291),
    WMA("WMA", "Western Massachusetts", 291),
    WNY("WNY", "Western New York", 291),
    WPA("WPA", "Western Pennsylvania", 291),
    WWA("WWA", "Western Washington", 291),
    WI("WI", "Wisconsin", 291),
    WY("WY", "Wyoming", 291);

    private String abbreviation;
    private String name;
    private int[] dxcc;

    ARRL(String abbreviation, String name, int... dxcc){
        this.abbreviation = abbreviation;
        this.name = name;
        this.dxcc = dxcc;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public int[] getDxcc() {
        return dxcc;
    }

    public static ARRL getByAbbreviation(String abbreviation){
        for (ARRL arrl : ARRL.values()){
            if (arrl.getAbbreviation().equals(abbreviation)){
                return arrl;
            }
        }
        return null;
    }

    public static ARRL getByhName(String name){
        for (ARRL arrl : ARRL.values()){
            if (arrl.getName().equals(name)){
                return arrl;
            }
        }
        return null;
    }

    public static ArrayList<ARRL> wgetByDXCC(int dxcc){
        ArrayList<ARRL> arrls = new ArrayList<>();

        for (ARRL arrl : ARRL.values()){
            for (int xcc : arrl.getDxcc()){
                if (xcc == dxcc){
                    arrls.add(arrl);
                    break;
                }
            }
        }
        return arrls;
    }
}
