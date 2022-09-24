public class Arabic {
    private String arabic;
    private String translate;

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public Arabic(String arabic, String translate) {
        this.arabic = arabic;
        this.translate = translate;
    }

    public void translation() {
        System.out.println("Arabic: " + getArabic());
        System.out.println("Translate: " + getTranslate());
    }

    public String setNewWord(String arabic, String translate) {
        setArabic(arabic);
        setTranslate(translate);
        return arabic + "\n" + translate;
    }

    public void showNewWord() {
        System.out.println(setNewWord(getArabic(), getTranslate()));
    }

}
