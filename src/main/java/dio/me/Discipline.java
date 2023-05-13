package dio.me;

public class Discipline extends ContentCourse {
    private int lessonTime;

    public Discipline(String titulo, String descricao, int lessonTime) {
        super.setTitle(titulo);
        super.setDescription(descricao);
        this.lessonTime = lessonTime;
    }

    public int getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(int lessonTime) {
        this.lessonTime = lessonTime;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + super.getTitle() + '\'' +
                ", descricao='" + super.getDescription() + '\'' +
                ", cargaHoraria=" + this.lessonTime +
                ", XP=" + this.calculateXp() +
                '}';
    }

    @Override
    public double calculateXp() {
        return XP_DEFAULT * this.lessonTime;
    }
}
