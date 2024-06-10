package vendingMashine.model.impl;

public enum Package {
    PLASTIC("пластик"),
    GLASS("стекло"),
    PAPER_CUP_150("бумажный стаканчик 150 мл"),
    PAPER_CUP_300("бумажный стаканчик 300 мл");

    private final String matirial;

    Package(String matirial) {
        this.matirial = matirial;
    }

    public String getMatirial() {
        return matirial;
    }
}
