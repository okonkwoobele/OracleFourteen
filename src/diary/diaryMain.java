package diary;

import java.time.LocalDate;

class Entry {
    private String title;
    private String body;
    private final LocalDate date = LocalDate.now();
    private int iD;


    public Entry(String tittle, String body, int iD) {
        this.title = tittle;
        this.body = body;
        this.iD = iD;
    }


    public String getTittle() {
        return title;
    }

    public void setTittle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getDate() {

        return date;
    }

    public int getiD() {
        return iD;
    }


    public final LocalDate getdate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("""
                tittle: %s
                body: %s
                date: %s
                iD: %s
                """, getTittle(), getBody(), getDate(), getiD());
    }
}