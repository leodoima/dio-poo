package dio.me;

import java.time.LocalDate;

public class Mentory extends ContentCourse {

    private LocalDate eventDate;

    public Mentory(String titulo, String descricao, LocalDate eventDate) {
        super.setTitle(titulo);
        super.setDescription(descricao);
        this.eventDate = eventDate;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + super.getTitle() + '\'' +
                ", descricao='" + super.getDescription() + '\'' +
                ", data=" + eventDate +
                ", XP=" + calculateXp() +
                '}';
    }

    @Override
    public double calculateXp() {
        return XP_DEFAULT + 20;
    }
}
