package pages.menuBar;

public enum MenuBarEnum {
    WOMEN(""), DRESSES("//*[@id='block_top_menu']/ul/li[2]/a"), T_SHIRTS("");

    private String value;

    MenuBarEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
