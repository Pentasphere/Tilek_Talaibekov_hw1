public enum Color {
    RED("\u001B[31m"),
    BLUE("\u001B[34m"),
    GREEN("\u001B[32m");

    String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
